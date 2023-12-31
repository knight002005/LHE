package commons;

import driver.DriverManager;
import exception.BrowserNotSupport;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static commons.GlobalConstants.ADMIN_LOGIN;

public class BaseTest {
    protected final Log log;

    @Parameters({"browser"})
    @BeforeSuite
    public void initBeforeSuite(@Optional("chrome") String browser) {
        deleteAllureReport();
    }

    @Parameters({"browser", "appUrl"})
    @BeforeClass
    public void createDriver(@Optional("chrome")String browserName, @Optional("appUrl")String appUrl) {
        WebDriver driver = getBrowserDriver(browserName, appUrl);
        DriverManager.setDriver(driver);
    }

//    @AfterClass
    public static void closeDriver() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); //Reset timeout
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }

    public BaseTest() {
        log = LogFactory.getLog(getClass());
    }

    protected WebDriver getBrowserDriver(String browserName, String appUrl) {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        WebDriver driver;
        switch (browserList) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                //System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, GlobalConstants.PROJECT_PATH + "\\browserLogs\\FirefoxLog.log");
                driver = new FirefoxDriver();
                break;

            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new BrowserNotSupport(browserName);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
//        driver.get(appUrl);

        return driver;
    }

    public WebDriver getDriverInstance() {
        return DriverManager.getDriver();
    }

    protected String getEnvironmentUrl(String serverName) {
        String envUrl = null;
        EnvironmentList environment = EnvironmentList.valueOf(serverName.toUpperCase());
        if (environment == EnvironmentList.DEV) {
            envUrl = "https://dev.orangehrmlive.com";
        } else if (environment == EnvironmentList.TESTING) {
            envUrl = "https:/testing.orangehrmlive.com";
        } else if (environment == EnvironmentList.STAGING) {
            envUrl = "https://staging.orangehrmlive.com";
        } else if (environment == EnvironmentList.PRODUCTION) {
            envUrl = "https://production.orangehrmlive.com";
        }
        return envUrl;
    }

    protected boolean verifyTrue(boolean condition) {
        boolean pass = true;
        try {
            Assert.assertTrue(condition);
            log.info(" -------------------------- PASSED -------------------------- ");
        } catch (Throwable e) {
            log.info(" -------------------------- FAILED -------------------------- ");
            pass = false;

            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    protected boolean verifyFalse(boolean condition) {
        boolean pass = true;
        try {
            Assert.assertFalse(condition);
            log.info(" -------------------------- PASSED -------------------------- ");
        } catch (Throwable e) {
            log.info(" -------------------------- FAILED -------------------------- ");
            pass = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    protected boolean verifyEquals(Object actual, Object expected) {
        boolean pass = true;
        try {
            Assert.assertEquals(actual, expected);
            log.info(" -------------------------- PASSED -------------------------- ");
        } catch (Throwable e) {
            log.info(" -------------------------- FAILED -------------------------- ");
            pass = false;
            VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
            Reporter.getCurrentTestResult().setThrowable(e);
        }
        return pass;
    }

    public void deleteAllureReport() {
        try {
            String pathFolderDownload = GlobalConstants.PROJECT_PATH + "/allure-json";
            File file = new File(pathFolderDownload);
            File[] listOfFiles = file.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    new File(listOfFiles[i].toString()).delete();
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    protected void closeBrowserAndDriver() {
//        String cmd = "";
//        try {
//            String osName = System.getProperty("os.name").toLowerCase();
//            String driverInstanceName = driver.toString().toLowerCase();
//
//            if (driverInstanceName.contains("chrome")) {
//                if (osName.contains("window")) {
//                    cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
//                } else {
//                    cmd = "pkill chromedriver";
//                }
//            } else if (driverInstanceName.contains("internetexplorer")) {
//                if (osName.contains("window")) {
//                    cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
//                }
//            } else if (driverInstanceName.contains("firefox")) {
//                if (osName.contains("windows")) {
//                    cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
//                } else {
//                    cmd = "pkill geckodriver";
//                }
//            } else if (driverInstanceName.contains("edge")) {
//                if (osName.contains("window")) {
//                    cmd = "taskkill /F /FI \"IMAGENAME eq msedgedriver*\"";
//                } else {
//                    cmd = "pkill msedgedriver";
//                }
//            } else if (driverInstanceName.contains("opera")) {
//                if (osName.contains("window")) {
//                    cmd = "taskkill /F /FI \"IMAGENAME eq operadriver*\"";
//                } else {
//                    cmd = "pkill operadriver";
//                }
//            } else if (driverInstanceName.contains("safari")) {
//                if (osName.contains("mac")) {
//                    cmd = "pkill safaridriver";
//                }
//            }
//
//            if (driver != null) {
//                // IE
//                driver.manage().deleteAllCookies();
//                driver.quit();
//            }
//        } catch (Exception e) {
//            log.info(e.getMessage());
//        } finally {
//            try {
//                Process process = Runtime.getRuntime().exec(cmd);
//                process.waitFor();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    protected String getCurrentDate() {
        DateTime nowUTC = new DateTime();
        int day = nowUTC.getDayOfMonth();
        if (day < 10) {
            String dayValue = "0" + day;
            return dayValue;
        }
        return String.valueOf(day);
    }

    protected String getCurrentMonth() {
        DateTime now = new DateTime();
        int month = now.getMonthOfYear();
        if (month < 10) {
            String monthValue = "0" + month;
            return monthValue;
        }
        return String.valueOf(month);
    }

    protected String getCurrentYear() {
        DateTime now = new DateTime();
        return String.valueOf(now.getYear());
    }

    protected String getCurrentDay() {
        return getCurrentMonth() + "/" + getCurrentDate() + "/" + getCurrentYear();
    }
}
