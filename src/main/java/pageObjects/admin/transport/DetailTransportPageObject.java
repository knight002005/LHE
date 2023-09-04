package pageObjects.admin.transport;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class DetailTransportPageObject extends BasePage {

    public DetailTransportPageObject() {
    }

    public String getDriverNameInDetail() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_DRIVER_NAME);
        return getElementText(AdminHomePageUI.DETAIL_DRIVER_NAME);
    }

    public String getTruckNameInDetail() {
        waitForElementVisible(AdminHomePageUI.DETAIL_TRUCK_NAME);
        return getElementText(AdminHomePageUI.DETAIL_TRUCK_NAME);
    }

    public String getDriverNameOutDetail( String placeholder) {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_DRIVER_NAME_OUT,placeholder);
        return getElementText(AdminHomePageUI.DETAIL_DRIVER_NAME_OUT,placeholder);
    }
}
