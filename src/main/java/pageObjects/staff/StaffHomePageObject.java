package pageObjects.staff;

import commons.BasePage;
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

    public String warningTitleName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_NAME_STAFF);
        return getElementText(AdminHomePageUI.WARNING_NAME_STAFF);
    }

    public String warningTitlePhone() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_PHONE_STAFF);
        return getElementText(AdminHomePageUI.WARNING_PHONE_STAFF);
    }

    public String warningTitleAdress() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_ADRESS_STAFF);
        return getElementText(AdminHomePageUI.WARNING_ADRESS_STAFF);
    }

    public void clickToContinueButton() {
        waitForElementVisible(AdminHomePageUI.CONTINUE_BUTTON);
        clickToElement(AdminHomePageUI.CONTINUE_BUTTON);
    }

    public String warningTitleSex() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_SEX_STAFF);
        return getElementText(AdminHomePageUI.WARNING_SEX_STAFF);
    }

    public String warningTitleTaxCode() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_TAXCODE_STAFF);
        return getElementText(AdminHomePageUI.WARNING_TAXCODE_STAFF);
    }

    public String warningTitleIdCard() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_IDCARD_STAFF);
        return getElementText(AdminHomePageUI.WARNING_IDCARD_STAFF);
    }

    public String warningEmailIsValid() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AdminHomePageUI.WARNING_EMAIL);
        return getElementText(AdminHomePageUI.WARNING_EMAIL);
    }

    public void clickToSex() {
        waitForElementVisible(AdminHomePageUI.SEX_DROPLIST);
        clickToElement(AdminHomePageUI.SEX_DROPLIST);
    }

    public void clickToValueSex() {
        waitForElementVisible(AdminHomePageUI.SEX_VALUE);
        clickToElement(AdminHomePageUI.SEX_VALUE);
    }

    public String warningIdCard() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.ID_CARD_IVALID);
        return getElementText(AdminHomePageUI.ID_CARD_IVALID);
    }

    public void clickAffiliateAccount() {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_AFFILIATE);
        clickToElement(AdminHomePageUI.ACCOUNT_AFFILIATE);
    }

    public void clickAffiliateAccountValue() {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_AFFILIATE_VALUE);
        clickToElement(AdminHomePageUI.ACCOUNT_AFFILIATE_VALUE);
    }
}
