package pageObjects.admin.zonearea;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class CreateZonePageObject extends BasePage {
    public CreateZonePageObject() {
    }

    public void inputZoneName(String zoneName) {
        waitForElementClickable(AdminHomePageUI.INPUT_ZONE_NAME_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_ZONE_NAME_FIELD, zoneName);
    }

    public void clickAreaDropList() {
        waitForElementClickable(AdminHomePageUI.AREA_DROP_LIST);
        clickToElement(AdminHomePageUI.AREA_DROP_LIST);
    }

    public void clickArea() {
        waitForElementClickable(AdminHomePageUI.AREA);
        clickToElement(AdminHomePageUI.AREA);
    }

    public String getAreaName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.AREA_NAME_CHOOSE);
        return getElementText(AdminHomePageUI.AREA_NAME_CHOOSE);
    }

    public void clickProvinceCity() {
        waitForElementClickable(AdminHomePageUI.AREA_PROVINCE_CITY);
        clickToElement(AdminHomePageUI.AREA_PROVINCE_CITY);
    }

    public void clickProvinceCityDropList() {
        waitForElementClickable(AdminHomePageUI.AREA_PROVINCE_CITY_DROP_LIST);
        clickToElement(AdminHomePageUI.AREA_PROVINCE_CITY_DROP_LIST);
    }

    public void inputNote(String note) {
        waitForElementClickable(AdminHomePageUI.INPUT_NOTE_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_NOTE_FIELD, note);
    }

    public AddDistributorPageObject clickAddDistributor() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.ADD_DISTRIBUTOR);
        clickToElement(AdminHomePageUI.ADD_DISTRIBUTOR);
        return new AddDistributorPageObject();
    }

    public DetailZonePageObject clickCreate() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_NEW_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_NEW_BUTTON);
        return new DetailZonePageObject();
    }

    public String getProvinceCityName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.PROVINCE_CITY_NAME_CHOOSE);
        return getElementText(AdminHomePageUI.PROVINCE_CITY_NAME_CHOOSE);
    }
}
