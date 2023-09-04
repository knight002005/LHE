package pageObjects.admin.transport;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class BillPageObject extends BasePage {

    public BillPageObject() {
    }

    public void clickRangeOfVehicleInput() {
        waitForElementClickable(AdminHomePageUI.BILL_BUTTON);
        clickToElement(AdminHomePageUI.BILL_BUTTON);
    }

    public boolean isVoteTitleTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.VOTE_TITLE);
        return isElementDisplay(AdminHomePageUI.VOTE_TITLE);
    }


    public void clickToBillDelivery() {
        sleepInSecond(2);
        waitForElementClickable(AdminHomePageUI.BUTTON_DELIVERY_BILL);
        clickToElement(AdminHomePageUI.BUTTON_DELIVERY_BILL);
    }

    public void clickToCheckbox() {
        waitForElementClickable(AdminHomePageUI.CHECKBOX_DELIVERY_BILL);
        clickToElement(AdminHomePageUI.CHECKBOX_DELIVERY_BILL);
    }

    public void clickToButtonAccept() {
        waitForElementClickable(AdminHomePageUI.BUTTON_ACCEPT);
        clickToElement(AdminHomePageUI.BUTTON_ACCEPT);
    }
}
