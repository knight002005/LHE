package pageObjects.admin.order;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class OrderDetailPageObject extends BasePage {

	public OrderDetailPageObject() {
	}

	public void clickCancelButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
		clickToElement(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
	}

	public boolean isProcessingButtonDisplayed() {
		waitForElementVisible(AdminHomePageUI.PROCESSING_BUTTON);
		return isElementDisplay(AdminHomePageUI.PROCESSING_BUTTON);
	}

	public void clickApproveOrderButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.APPROVE_BUTTON);
		clickToElement(AdminHomePageUI.APPROVE_BUTTON);
	}

	public void clickRefuseOrderButton() {
		waitForElementClickable(AdminHomePageUI.REFUSE_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.REFUSE_ORDER_BUTTON);
	}

	public void clickConfirmButton() {
		waitForElementClickable(AdminHomePageUI.CONFIRM_BUTTON);
		clickToElement(AdminHomePageUI.CONFIRM_BUTTON);
	}

	public String getTextStatusButton() {
		waitForElementVisible(AdminHomePageUI.FAILURE_BUTTON);
		return getElementText(AdminHomePageUI.FAILURE_BUTTON);
	}

	public String getDistributorText() {
		waitForLoadingIconInvisible();
		waitForElementVisible(AdminHomePageUI.DISTRIBUTOR_TEXT);
		return getElementText(AdminHomePageUI.DISTRIBUTOR_TEXT);
	}

	public String getStoreText() {
		waitForElementVisible(AdminHomePageUI.STORE_TEXT);
		return getElementText(AdminHomePageUI.STORE_TEXT);
	}

	public String getProductNameText() {
		waitForElementVisible(AdminHomePageUI.PRODUCT_NAME_TEXT);
		return getElementText(AdminHomePageUI.PRODUCT_NAME_TEXT);
	}

	public void dragAndDropIcon() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
		dragAndDrop( AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.BELL_ICON);
	}

	public void inputSelectWarehouse(String wareHouse) {
		waitForElementVisible(AdminHomePageUI.WAREHOUSE_INPUT);
		sendKeyToElement(AdminHomePageUI.WAREHOUSE_INPUT, wareHouse);
	}

	public void clickWarehouse() {
		waitForElementClickable(AdminHomePageUI.WAREHOUSE_DETAIL);
		clickToElement(AdminHomePageUI.WAREHOUSE_DETAIL);
	}

	public void clickApproveOrderButtonInModal() {
		waitForElementClickable(AdminHomePageUI.APPROVE_BUTTON_IN_MODAL);
		clickToElement(AdminHomePageUI.APPROVE_BUTTON_IN_MODAL);
	}

	public void clickCloseModal() {
		waitForElementClickable(AdminHomePageUI.CLOSE_BUTTON_IN_MODAL);
		clickToElement(AdminHomePageUI.CLOSE_BUTTON_IN_MODAL);
	}

	public EditOrderPageObject clickEditButton() {
		waitForElementClickable(AdminHomePageUI.EDIT_BUTTON);
		clickToElement(AdminHomePageUI.EDIT_BUTTON);
		return new EditOrderPageObject();
	}
}
