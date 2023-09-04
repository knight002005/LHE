package pageObjects.admin.driver;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class DriverHomePageObject extends BasePage {
    public DriverHomePageObject() {
    }

    public boolean getTitleDriver() {
        waitForElementVisible(AdminHomePageUI.DRIVER_TITLE);
        return isElementDisplay(AdminHomePageUI.DRIVER_TITLE);
    }

    public AddDriverPageObject clickToAddNewDriverButton() {
        waitForElementClickable(AdminHomePageUI.ADD_DRIVER_BUTTON);
        clickToElement(AdminHomePageUI.ADD_DRIVER_BUTTON);
        return new AddDriverPageObject();
    }
}
