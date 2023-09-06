package pageObjects.admin.zonearea;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class DetailZonePageObject extends BasePage {
    public DetailZonePageObject() {
    }

    public String getAreaName() {
        waitForLoadingIconInvisible();
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

    public boolean isDetailZoneDisplayed() {
        waitForElementVisible(AdminHomePageUI.DETAIL_ZONE_TITLE);
        return isElementDisplay(AdminHomePageUI.DETAIL_ZONE_TITLE);
    }

    public String getZoneName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.ZONE_NAME);
        return getElementText(AdminHomePageUI.ZONE_NAME);
    }

    public String getDetailAreaName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_AREA_NAME);
        return getElementText(AdminHomePageUI.DETAIL_AREA_NAME);
    }

    public String getDetailProvinceCityName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_PROVINCE_CITY_NAME);
        return getElementText(AdminHomePageUI.DETAIL_PROVINCE_CITY_NAME);
    }

    public String getDetailDistributorName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_DISTRIBUTOR_NAME);
        return getElementText(AdminHomePageUI.DETAIL_DISTRIBUTOR_NAME);
    }

    public String getDetailDistributorID() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DETAIL_DISTRIBUTOR_ID);
        return getElementText(AdminHomePageUI.DETAIL_DISTRIBUTOR_ID);
    }
}
