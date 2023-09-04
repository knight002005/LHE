package pageObjects.admin.order;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class EditOrderPageObject extends BasePage {

	public EditOrderPageObject() {
	}

	public OrderForDistributorPageObject clickCancelButton() {
		waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
		clickToElement(AdminHomePageUI.CANCEL_BUTTON);
		return new OrderForDistributorPageObject();
	}

	public void dragAndDropIcon() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
		dragAndDrop( AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.BELL_ICON);
	}

	public void inputEditTheNumberOfProduct(String numberOfProduct) {
		waitForElementVisible(AdminHomePageUI.NUMBER_OF_PRODUCT_INPUT);
		sendKeyToElement(AdminHomePageUI.NUMBER_OF_PRODUCT_INPUT, numberOfProduct);
	}

	public void inputSelectWarehouse(String wareHouse) {
		waitForElementVisible(AdminHomePageUI.WAREHOUSE_INPUT_IN_EDIT);
		sendKeyToElement(AdminHomePageUI.WAREHOUSE_INPUT_IN_EDIT, wareHouse);
	}

	public void clickWarehouse() {
		waitForElementClickable(AdminHomePageUI.WAREHOUSE_DETAIL);
		clickToElement(AdminHomePageUI.WAREHOUSE_DETAIL);
	}

	public void clickAddProductButton() {
		waitForElementClickable(AdminHomePageUI.ADD_PRODUCT_IN_EDIT_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.ADD_PRODUCT_IN_EDIT_ORDER_BUTTON);
	}

	public void clickCheckboxProduct() {
		waitForElementClickable(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
		clickToElement(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
	}

	public void clickAddProductButtonInPopup() {
		waitForElementClickable(AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON_IN_POPUP);
		clickToElement(AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON_IN_POPUP);
	}

	public void clickSaveButton() {
		waitForElementClickable(AdminHomePageUI.SAVE_PRODUCT_BUTTON_IN_EDIT);
		clickToElement(AdminHomePageUI.SAVE_PRODUCT_BUTTON_IN_EDIT);
	}

	public void closeModalUpdateSuccess() {
		waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
		clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
	}
}
