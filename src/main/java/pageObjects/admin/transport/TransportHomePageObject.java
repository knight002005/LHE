package pageObjects.admin.transport;

import commons.BasePage;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.driver.DriverHomePageObject;
import pageObjects.admin.product.CreateProductPageObject;
import pageObjects.admin.product.ProductDetailPageObject;
import pageUIs.admin.AdminHomePageUI;

public class TransportHomePageObject extends BasePage {

    public TransportHomePageObject() {
    }

    public boolean isTransportTitleTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.TRANSPORT_TITLE);
        return isElementDisplay(AdminHomePageUI.TRANSPORT_TITLE);
    }

    public AddShipmentPageObject clickAddNewShipmentButton() {
        waitForElementClickable(AdminHomePageUI.ADD_SHIPMENT_BUTTON);
        clickToElement(AdminHomePageUI.ADD_SHIPMENT_BUTTON);
        return new AddShipmentPageObject();
    }

    public DetailTransportPageObject clickToDetailsButton() {
        waitForElementClickable(AdminHomePageUI.DETAIL_TRANSPORT_BUTTON);
        clickToElement(AdminHomePageUI.DETAIL_TRANSPORT_BUTTON);
        return new DetailTransportPageObject();
    }

    public DriverHomePageObject clickToTabDriver() {
        waitForElementClickable(AdminHomePageUI.TAB_DRIVER);
        clickToElement(AdminHomePageUI.TAB_DRIVER);
        return new DriverHomePageObject();
    }
}
