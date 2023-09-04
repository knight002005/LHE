package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppOrderPageUI;

public class ImportOrderPageObject extends BasePage {

    public ImportOrderPageObject() {
    }

    public CreateOrderPageObject createNewOrderButton() {
        waitForElementVisible(NppOrderPageUI.CREATE_NEW_ORDER_BUTTON);
        clickToElement(NppOrderPageUI.CREATE_NEW_ORDER_BUTTON);
        return new CreateOrderPageObject();
    }
}


