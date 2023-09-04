package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppHomePageUI;

public class OrderHomePageObject extends BasePage {

    public OrderHomePageObject() {
    }

    public ImportOrderPageObject importOrderButton() {
        waitForElementVisible(NppHomePageUI.IMPORT_ORDER_TAB);
        clickToElement(NppHomePageUI.IMPORT_ORDER_TAB);
        return new ImportOrderPageObject();
    }

    public ImportOrderPageObject clickExportOrderTab() {
        waitForElementVisible(NppHomePageUI.EXPORT_ORDER_TAB);
        clickToElement(NppHomePageUI.EXPORT_ORDER_TAB);
        return new ImportOrderPageObject();
    }
}
