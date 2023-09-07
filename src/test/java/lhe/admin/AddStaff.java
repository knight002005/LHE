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
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddStaff extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private StaffHomePageObject StaffHomePage;
    String driverImage, phoneNumber,idCard, nameStaff,warning,warningDrop,adress,emailIvalid,warningIdCard, date;
    String email;
    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        driverImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
        phoneNumber = "09871" + getRandomInt();
        idCard = "023" + getRandomInt();
        nameStaff = getRandomString();
        warning = "Vui lòng điền thông tin";
        warningDrop = "Vui lòng chọn";
        warningIdCard = "CMT/CCCD không hợp lệ";
        adress = "Hà Nội";
        emailIvalid = "Không đúng định dạng email";
        email = getRandomString() + "@gmail.com";
        date = "9/7/2023";
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
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
        assertEquals(StaffHomePage.warningTitleName(),warning);
        assertEquals(StaffHomePage.warningTitlePhone(),warning);
        assertEquals(StaffHomePage.warningTitleAdress(),warning);
        StaffHomePage.clickToContinueButton();
        assertEquals(StaffHomePage.warningTitleSex(),warningDrop);
        assertEquals(StaffHomePage.warningTitleIdCard(),warning);
        StaffHomePage.clickToContinueButton();
        assertEquals(StaffHomePage.warningTitleTaxCode(),warning);
    }
    @Test
    public void TC_03_Add_Staff_IsValid(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Staff Page");
        goToHomPage();
        homePage.clickStaffHomePageButton();
        StaffHomePage = homePage.clickStaffIcon();
        StaffHomePage.clickToAddNewStaff(); //Click button tao mới
        StaffHomePage.inputDynamic("Nhập tên nhân viên",nameStaff);
        StaffHomePage.inputDynamic("Nhập số điện thoại",phoneNumber);
        StaffHomePage.inputDynamic("Nhập địa chỉ làm việc",adress);
        StaffHomePage.inputDynamic("Nhập email","email");
        StaffHomePage.clickAffiliateAccount();
        StaffHomePage.clickAffiliateAccountValue();
        assertEquals(StaffHomePage.warningEmailIsValid(),emailIvalid);
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
        StaffHomePage.clickToSex();
        StaffHomePage.clickToValueSex();
        StaffHomePage.inputDynamic("Chọn ngày sinh",date);
        StaffHomePage.inputDynamic("Nhập số CCCD/CMT", idCard);
        assertEquals(StaffHomePage.warningIdCard(),warningIdCard);
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
    }
    @Test
    public void TC_04_Add_Staff_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Staff Page");
        goToHomPage();
        homePage.clickStaffHomePageButton();
        StaffHomePage = homePage.clickStaffIcon();
        StaffHomePage.clickToAddNewStaff(); //Click button tao mới
        StaffHomePage.inputDynamic("Nhập tên nhân viên",nameStaff);
        StaffHomePage.inputDynamic("Nhập số điện thoại",phoneNumber);
        StaffHomePage.inputDynamic("Nhập địa chỉ làm việc",adress);
        StaffHomePage.inputDynamic("Nhập email",email);
        StaffHomePage.clickAffiliateAccount();
        StaffHomePage.clickAffiliateAccountValue();
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
        StaffHomePage.clickToSex();
        StaffHomePage.clickToValueSex();
        StaffHomePage.inputDynamic("Chọn ngày sinh",date);
        StaffHomePage.inputDynamic("Nhập số CCCD/CMT", "023545654");
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
        StaffHomePage.inputDynamic("Nhập mã số thuế","123254525");
        StaffHomePage.clickToCompleteButton(); //Click button hoan thành
    }
}
