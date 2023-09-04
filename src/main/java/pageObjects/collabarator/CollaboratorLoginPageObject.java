package pageObjects.collabarator;

import commons.BasePage;
import driver.DriverManager;
import pageUIs.admin.AdminLoginPageUI;
import pageUIs.collaborator.CollaboratorLoginPageUI;

import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.COLLABORATOR_LOGIN;

public class CollaboratorLoginPageObject extends BasePage {
    public CollaboratorLoginPageObject (String collaboratorLoginUrl) {
        openPageUrl(collaboratorLoginUrl);
    }
    public void openLoginPage() {
        DriverManager.getDriver().get(COLLABORATOR_LOGIN);
    }

    public void clickToInputPhone() {

        clickToElement(CollaboratorLoginPageUI.INPUT_PHONE);
    }

    public void clickToInputPassword() {
        clickToElement(CollaboratorLoginPageUI.INPUT_PASSWORD);
    }

    public String getErrorMessageAtAccountTextbox() {
        return getElementText(CollaboratorLoginPageUI.PHONE_EMPTY_ERROR_MESSAGE);
    }

    public String getErrorMessageAtPasswordTextbox() {
        return getElementText(CollaboratorLoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
    }

    public void inputToAccountTextbox(String accountInvalid) {
        sendKeyToElement(CollaboratorLoginPageUI.INPUT_PHONE, accountInvalid);
    }
    public void inputToPasswordTextbox(String passwordInvalid) {
        sendKeyToElement(CollaboratorLoginPageUI.INPUT_PASSWORD, passwordInvalid);
    }

    public CollaboratorHomePageObject clickButtonLogin() {
        clickToElement(CollaboratorLoginPageUI.BUTTON_LOGIN);
        return new CollaboratorHomePageObject();
    }

    public boolean isModalConfirmDisplayed() {
        waitForElementVisible(CollaboratorLoginPageUI.MODAL_TEXT);
        return isElementDisplay(CollaboratorLoginPageUI.MODAL_TEXT);
    }

    public String getErrorMessageAtPhonetextbox() {
        return getElementText(CollaboratorLoginPageUI.PHONE_EMPTY_ERROR_MESSAGE);
    }
}
