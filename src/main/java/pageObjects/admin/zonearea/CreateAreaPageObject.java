package pageObjects.admin.zonearea;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class CreateAreaPageObject extends BasePage {
    public CreateAreaPageObject() {
    }

    public void inputAreaName (String areaName) {
        waitForElementClickable(AdminHomePageUI.INPUT_AREA_NAME_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_AREA_NAME_FIELD, areaName);
    }

    public void clickProvinceCityDropList() {
        waitForElementClickable(AdminHomePageUI.AREA_PROVINCE_CITY_DROP_LIST);
        clickToElement(AdminHomePageUI.AREA_PROVINCE_CITY_DROP_LIST);
    }

    public void inputNote(String note) {
        waitForElementClickable(AdminHomePageUI.INPUT_NOTE_AREA_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_NOTE_AREA_FIELD, note);
    }

    public void clickProvinceCity() {
        waitForElementClickable(AdminHomePageUI.AREA_PROVINCE_CITY);
        clickToElement(AdminHomePageUI.AREA_PROVINCE_CITY);
    }

    public DetailAreaPageObject clickCreate() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_NEW_AREA_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_NEW_AREA_BUTTON);
        return new DetailAreaPageObject();
    }

    public String getProvinceCityName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.AREA_PROVINCE_CITY_GET_TEXT);
        return getElementText(AdminHomePageUI.AREA_PROVINCE_CITY_GET_TEXT);
    }
}
