package pageObjects.admin.zonearea;

import commons.BasePage;
import pageObjects.admin.document.EnactDocumentPageObject;
import pageUIs.admin.AdminHomePageUI;

public class DetailAreaPageObject extends BasePage {
    public DetailAreaPageObject() {
    }

    public boolean isDetailAreaDisplayed() {
        waitForElementVisible(AdminHomePageUI.DETAIL_AREA_TITLE);
        return isElementDisplay(AdminHomePageUI.DETAIL_AREA_TITLE);
    }

    public String getAreaName() {
        waitForElementVisible(AdminHomePageUI.AREA_NAME);
        return getElementText(AdminHomePageUI.AREA_NAME);
    }

    public String getProvinceCityName() {
        waitForElementVisible(AdminHomePageUI.PROVINCE_CITY_NAME);
        return getElementText(AdminHomePageUI.PROVINCE_CITY_NAME);
    }

    public String getNote() {
        waitForElementVisible(AdminHomePageUI.AREA_NOTE);
        return getElementText(AdminHomePageUI.AREA_NOTE);
    }
}
