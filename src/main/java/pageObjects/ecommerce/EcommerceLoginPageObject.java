package pageObjects.ecommerce;

import driver.DriverManager;
import commons.BasePage;
import pageUIs.ecommerce.EcommerceLoginPageUI;

import static commons.GlobalConstants.ECOMMERCE_LOGIN;

public class EcommerceLoginPageObject extends BasePage {
    public EcommerceLoginPageObject(String ecommerceLoginUrl) {
        openPageUrl(ecommerceLoginUrl);
    }

    public void openLoginPage() {
        DriverManager.getDriver().get(ECOMMERCE_LOGIN);
    }

    public void clickToInputPhone() {
        clickToElement(EcommerceLoginPageUI.INPUT_PHONE);
    }

    public void clickToInputPassword() {
        clickToElement(EcommerceLoginPageUI.INPUT_PASSWORD);
    }

    public String getErrorPhoneTextbox() {
        return getElementText(EcommerceLoginPageUI.PHONE_EMPTY_ERROR_MESSAGE);
    }

    public String getErrorPasswordTextbox() {
        return getElementText(EcommerceLoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
    }

    public void inputPhone(String accountInvalid) {
        sendKeyToElement(EcommerceLoginPageUI.INPUT_PHONE, accountInvalid);
    }

    public void inputPassword(String passwordInvalid) {
        sendKeyToElement(EcommerceLoginPageUI.INPUT_PASSWORD, passwordInvalid);
    }

    public EcommerceHomePageObject clickLoginButton() {
        clickToElement(EcommerceLoginPageUI.LOGIN_BUTTON);
        return new EcommerceHomePageObject();
    }

    public String getErrorText() {
        return getElementText(EcommerceLoginPageUI.MESS_ERROR_LOGIN);
    }

    public String getErrorPhoneText() {
        return getElementText(EcommerceLoginPageUI.MESS_ERROR_PHONE_LOGIN);
    }
}