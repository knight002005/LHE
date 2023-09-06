package pageObjects.staff;

import commons.BasePage;
import pageObjects.admin.driver.AddDriverPageObject;
import pageUIs.admin.AdminHomePageUI;

public class StaffHomePageObject extends BasePage {
    public StaffHomePageObject() {
    }

    public void clickToAddNewStaff() {
        waitForElementVisible(AdminHomePageUI.ADD_STAFF_BUTTON);
        clickToElement(AdminHomePageUI.ADD_STAFF_BUTTON);
    }

    public void clickToCompleteButton() {
        waitForElementVisible(AdminHomePageUI.COMPLETE_BUTTON);
        clickToElement(AdminHomePageUI.COMPLETE_BUTTON);
    }

    public boolean warningTitleName() {
        waitForElementVisible(AdminHomePageUI.WARNING_NAME_STAFF);
        return isElementDisplay(AdminHomePageUI.WARNING_NAME_STAFF);
    }

    public boolean warningTitlePhone() {
        waitForElementVisible(AdminHomePageUI.WARNING_PHONE_STAFF);
        return isElementDisplay(AdminHomePageUI.WARNING_PHONE_STAFF);
    }

    public boolean warningTitleAdress() {
        waitForElementVisible(AdminHomePageUI.WARNING_ADRESS_STAFF);
        return isElementDisplay(AdminHomePageUI.WARNING_ADRESS_STAFF);
    }

    public void clickToContinueButton() {
        waitForElementVisible(AdminHomePageUI.CONTINUE_BUTTON);
        clickToElement(AdminHomePageUI.CONTINUE_BUTTON);
    }

    public boolean warningTitleSex() {
        waitForElementVisible(AdminHomePageUI.WARNING_SEX_STAFF);
        return isElementDisplay(AdminHomePageUI.WARNING_SEX_STAFF);
    }

    public boolean warningTitleTaxCode() {
        waitForElementVisible(AdminHomePageUI.WARNING_TAXCODE_STAFF);
        return isElementDisplay(AdminHomePageUI.WARNING_TAXCODE_STAFF);
    }
}
