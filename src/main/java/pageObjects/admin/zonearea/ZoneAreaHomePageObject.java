package pageObjects.admin.zonearea;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class ZoneAreaHomePageObject extends BasePage {
    public ZoneAreaHomePageObject() {
    }

    public boolean isZoneAreaTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.ZONE_AREA_TITLE);
        return isElementDisplay(AdminHomePageUI.ZONE_AREA_TITLE);
    }

    public CreateAreaPageObject clickCreateAreaButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_AREA_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_AREA_BUTTON);
        return new CreateAreaPageObject();
    }

    public ZoneAreaHomePageObject clickZoneButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.ZONE_BUTTON);
        clickToElement(AdminHomePageUI.ZONE_BUTTON);
        return new ZoneAreaHomePageObject();
    }

    public CreateZonePageObject clickCreateZoneButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_ZONE_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_ZONE_BUTTON);
        return new CreateZonePageObject();
    }
}
