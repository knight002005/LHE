package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppOrderPageUI;

public class CreateOrderPageObject extends BasePage {

	public CreateOrderPageObject() {
	}

    public void clickImportWarehouseParent() {
		waitForElementClickable(NppOrderPageUI.IMPORT_WAREHOUSE_PARENT_INPUT);
		clickToElement(NppOrderPageUI.IMPORT_WAREHOUSE_PARENT_INPUT);
    }

	public void clickImportWarehouseChild() {
		sleepInSecond(2);
		waitForElementClickable(NppOrderPageUI.IMPORT_WAREHOUSE_CHILD);
		clickToElement(NppOrderPageUI.IMPORT_WAREHOUSE_CHILD);
	}

	public void inputExpectDate(String expectDate) {
		waitForElementVisible(NppOrderPageUI.EXPECT_DATE_INPUT);
		sendKeyToElement(NppOrderPageUI.EXPECT_DATE_INPUT, expectDate);
	}

	public void inputNote(String note) {
		waitForElementVisible(NppOrderPageUI.NOTE_INPUT);
		sendKeyToElement(NppOrderPageUI.NOTE_INPUT, note);
	}

	public void clickToAddOrderButton() {
		waitForElementClickable(NppOrderPageUI.ADD_NEW_BUTTON);
		clickToElement(NppOrderPageUI.ADD_NEW_BUTTON);
	}
}
