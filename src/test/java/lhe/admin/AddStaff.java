package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.staff.StaffHomePageObject;
import reportConfig.ExtentTestManager;
import java.lang.reflect.Method;
import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.AssertJUnit.assertTrue;

public class AddStaff extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private StaffHomePageObject StaffHomePage;
    String driverImage, phoneNumber,idCard, email;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        driverImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
        phoneNumber = "09871" + getRandomInt();
        idCard = "0223" + getRandomInt();
        email = getRandomString() + "@gmail.com";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Goto_Staff_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Staff Page");
        goToHomPage();
        homePage.clickStaffHomePageButton();
        StaffHomePage = homePage.clickStaffIcon();
        StaffHomePage.clickToAddNewStaff();
    }
    @Test
    public void TC_02_Add_Staff_EmptyData(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Staff Page");
        goToHomPage();
        homePage.clickStaffHomePageButton();
        StaffHomePage = homePage.clickStaffIcon();
        StaffHomePage.clickToAddNewStaff();
        StaffHomePage.clickToCompleteButton();
        assertTrue(StaffHomePage.warningTitleName());
        assertTrue(StaffHomePage.warningTitlePhone());
        assertTrue(StaffHomePage.warningTitleAdress());
        StaffHomePage.clickToContinueButton();
        assertTrue(StaffHomePage.warningTitleSex());
        StaffHomePage.clickToContinueButton();
        assertTrue(StaffHomePage.warningTitleTaxCode());
    }
    @Test
    public void TC_03_Add_Staff_IsValid(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Staff Page");
        goToHomPage();
        homePage.clickStaffHomePageButton();
        StaffHomePage = homePage.clickStaffIcon();
        StaffHomePage.clickToAddNewStaff();
        StaffHomePage.clickToCompleteButton();
        assertTrue(StaffHomePage.warningTitleName());
        assertTrue(StaffHomePage.warningTitlePhone());
        assertTrue(StaffHomePage.warningTitleAdress());
        StaffHomePage.clickToContinueButton();
        assertTrue(StaffHomePage.warningTitleSex());
        StaffHomePage.clickToContinueButton();
        assertTrue(StaffHomePage.warningTitleTaxCode());
    }
}
