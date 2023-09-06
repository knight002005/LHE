package pageObjects.admin.zonearea;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class AddDistributorPageObject extends BasePage {
    public AddDistributorPageObject() {
    }

    public void clickDistributorCheckBox() {
        waitForElementClickable(AdminHomePageUI.DISTRIBUTOR_CHECKBOX);
        clickToElement(AdminHomePageUI.DISTRIBUTOR_CHECKBOX);
    }

    public void clickAddButton() {
        waitForElementClickable(AdminHomePageUI.ADD_DISTRIBUTOR_BUTTON);
        clickToElement(AdminHomePageUI.ADD_DISTRIBUTOR_BUTTON);
    }

    public String getDistributorName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DISTRIBUTOR_NAME_CHOOSE);
        return getElementText(AdminHomePageUI.DISTRIBUTOR_NAME_CHOOSE);
    }

    public String getDistributorID() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.PROVINCE_CITY_ID_CHOOSE);
        return getElementText(AdminHomePageUI.PROVINCE_CITY_ID_CHOOSE);
    }
}
