package pageObjects.admin.driver;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class AddDriverPageObject extends BasePage {

    public AddDriverPageObject() {
    }

    public void inputDriverImg(String productImage) {
        uploadImage(AdminHomePageUI.DRIVER_IMAGE, productImage);
    }

    public void clickToSaveButton() {
        waitForElementClickable(AdminHomePageUI.SAVE_DRIVER_BUTTON);
        clickToElement(AdminHomePageUI.SAVE_DRIVER_BUTTON);
    }

    public boolean isPopupErrorDisplayed() {
        waitForElementVisible(AdminHomePageUI.MESSAGE_POPUP_ERROR);
        return isElementDisplay(AdminHomePageUI.MESSAGE_POPUP_ERROR);
    }

    public boolean isPopupSuccessDisplayed() {
        waitForElementVisible(AdminHomePageUI.MESSAGE_POPUP_SUCCESS);
        return isElementDisplay(AdminHomePageUI.MESSAGE_POPUP_SUCCESS);
    }
}
