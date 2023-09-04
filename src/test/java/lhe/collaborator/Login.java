package lhe.collaborator;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.collabarator.CollaboratorHomePageObject;
import pageObjects.collabarator.CollaboratorLoginPageObject;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Login extends BaseTest {

    private String account, password, accountInvalid, passwordInvalid, phoneInvalid;
    private String browserName;
    private CollaboratorLoginPageObject collaboratorLogin;
    private CollaboratorHomePageObject collaboratorHome;



    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        collaboratorLogin = new CollaboratorLoginPageObject(COLLABORATOR_LOGIN);
        account = COLLABORATOR_ACCOUNT;
        accountInvalid = "0396512454";
        phoneInvalid = "Dunglt";
        password = COLLABORATOR_PASSWORD;
        passwordInvalid = "dungtest@11";
    }

    @Test
    public void TC_01_Login_Empty_Data() {
        collaboratorLogin.openLoginPage();
        collaboratorLogin.clickToInputPhone();
        collaboratorLogin.clickToInputPassword();
        collaboratorLogin.clickToInputPhone();
        assertEquals(collaboratorLogin.getErrorMessageAtAccountTextbox(), "Bạn cần điền vào mục này");
        assertEquals(collaboratorLogin.getErrorMessageAtPasswordTextbox(), "Bạn cần điền vào mục này");
    }

    @Test
    public void TC_02_Login_Invalid() {
        collaboratorLogin.openLoginPage();
        collaboratorLogin.inputToAccountTextbox(accountInvalid);
        collaboratorLogin.inputToPasswordTextbox(passwordInvalid);
        collaboratorLogin.clickButtonLogin();
        assertTrue(collaboratorLogin.isModalConfirmDisplayed());
    }

    @Test
    public void TC_03_Login_Phone_Invalid() {
        collaboratorLogin.openLoginPage();
        collaboratorLogin.inputToAccountTextbox(phoneInvalid);
        collaboratorLogin.clickToInputPassword();
        assertEquals(collaboratorLogin.getErrorMessageAtPhonetextbox(), "Số điện thoại không hợp lệ");
    }
    @Test
    public void TC_04_Login_Success() {
         collaboratorLogin.openLoginPage();
         collaboratorLogin.inputToAccountTextbox(account);
         collaboratorLogin.inputToPasswordTextbox(password);
         collaboratorHome = collaboratorLogin.clickButtonLogin();
         assertTrue(collaboratorHome.isIconAccountDisplayed());
    }
}
