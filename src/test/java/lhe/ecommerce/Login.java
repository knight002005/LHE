package lhe.ecommerce;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ecommerce.EcommerceHomePageObject;
import pageObjects.ecommerce.EcommerceLoginPageObject;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class Login extends BaseTest {
    private String account, password, accountInvalid, passwordInvalid, phoneInvalid;
    private String browserName;
    private EcommerceLoginPageObject ecommerceLogin;
    private EcommerceHomePageObject ecommerceHome;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        ecommerceLogin = new EcommerceLoginPageObject(ECOMMERCE_LOGIN);
        account = ECOMMERCE_ACCOUNT;
        accountInvalid = "tamduy";
        phoneInvalid = "Dunglt";
        password = ECOMMERCE_PASSWORD;
        passwordInvalid = "dungtest@11";
    }

    @Test
    public void TC_01_Login_Empty_Data() {
        ecommerceLogin.clickToInputPhone();
        ecommerceLogin.clickToInputPassword();
        ecommerceLogin.clickToInputPhone();
        assertEquals(ecommerceLogin.getErrorPhoneTextbox(),"Bạn cần điền vào mục này");
        assertEquals(ecommerceLogin.getErrorPasswordTextbox(),"Bạn cần điền vào mục này");
    }

    @Test
    public void TC_02_Login_Invalid_Data() {
        ecommerceLogin.openLoginPage();
        ecommerceLogin.inputPhone(accountInvalid);
        ecommerceLogin.inputPassword(passwordInvalid);
        ecommerceLogin.clickLoginButton();
        assertEquals(ecommerceLogin.getErrorText(),"Sai tên hoặc sai mật khẩu");
    }

    @Test
    public void TC_03_Login_Invalid_Phone_Data() {
        ecommerceLogin.openLoginPage();
        ecommerceLogin.inputPhone(accountInvalid);
        ecommerceLogin.clickToInputPassword();
        assertEquals(ecommerceLogin.getErrorPhoneText(),"Số điện thoại không hợp lệ");
    }

    @Test
    public void TC_04_Login_Data() {
        ecommerceLogin.openLoginPage();
        ecommerceLogin.inputPhone(account);
        ecommerceLogin.inputPassword(password);
        ecommerceHome = ecommerceLogin.clickLoginButton();
        assertTrue(ecommerceHome.isAccountIconDisplayed());
    }
}
