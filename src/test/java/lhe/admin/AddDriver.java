package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.driver.AddDriverPageObject;
import pageObjects.admin.driver.DriverHomePageObject;
import pageObjects.admin.transport.TransportHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.AssertJUnit.assertTrue;

public class AddDriver extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private TransportHomePageObject transportHomePage;
    private DriverHomePageObject driverHomePage;
    private AddDriverPageObject addDriverPage;
    String driverImage, phoneNumber, name, idCard, email;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        driverImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
        phoneNumber = "09871" + getRandomInt();
        name = "Tuấn" + getRandomString();
        idCard = "0223" + getRandomInt();
        email = getRandomString() + "@gmail.com";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Goto_Transport_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Transport");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        driverHomePage = transportHomePage.clickToTabDriver();
        assertTrue(driverHomePage.getTitleDriver());
    }

    @Test
    public void TC_02_Add_New_Driver_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add new Shipment In Success");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        driverHomePage = transportHomePage.clickToTabDriver();
        addDriverPage = driverHomePage.clickToAddNewDriverButton();
        addDriverPage.clickToSaveButton();
        assertTrue(addDriverPage.isPopupErrorDisplayed());
    }

    @Test
    public void TC_03_Add_New_Driver_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add new Shipment In Success");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        driverHomePage = transportHomePage.clickToTabDriver();
        addDriverPage = driverHomePage.clickToAddNewDriverButton();
        addDriverPage.inputDynamic("Nhập họ và tên", name);
        addDriverPage.inputDynamic("Nhập số điện thoại", phoneNumber);
        addDriverPage.inputDynamic("Nhập số CCCD/CMT", idCard);
        addDriverPage.inputDynamic("Nhập Email", email);
        addDriverPage.inputDriverImg(driverImage);
        addDriverPage.clickToSaveButton();
        assertTrue(addDriverPage.isPopupSuccessDisplayed());
    }
    @Test
    public void TC_04_Add_New_Driver_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add new Shipment In Success");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        driverHomePage = transportHomePage.clickToTabDriver();
        addDriverPage = driverHomePage.clickToAddNewDriverButton();
        addDriverPage.inputDynamic("Nhập họ và tên", name);
        addDriverPage.inputDynamic("Nhập số điện thoại", phoneNumber);
        addDriverPage.inputDynamic("Nhập số CCCD/CMT", idCard);
        addDriverPage.inputDynamic("Nhập Email", email);
        addDriverPage.inputDriverImg(driverImage);
        addDriverPage.clickToSaveButton();
        assertTrue(addDriverPage.isPopupSuccessDisplayed());
    }
}
