package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppOrderPageUI;

public class OrderDetailPageObject extends BasePage {

    public OrderDetailPageObject() {
    }

    public void clickApproveButton() {
        waitForLoadingItemInvisible();
        waitForElementVisible(NppOrderPageUI.APPROVE_BUTTON);
        clickToElement(NppOrderPageUI.APPROVE_BUTTON);
    }

    public String getStatusText() {
        waitForLoadingIconInvisible();
        waitForElementVisible(NppOrderPageUI.STATUS_TEXT);
        return getElementText(NppOrderPageUI.STATUS_TEXT);
    }
}


