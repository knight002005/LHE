package pageObjects.staff;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.THREE_SECONDS;

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

    public void clickToValueSex() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.SEX_VALUE);
        clickToElement(AdminHomePageUI.SEX_VALUE);
    }

    public String warningIdCard() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.ID_CARD_IS_VALID);
        return getElementText(AdminHomePageUI.ID_CARD_IS_VALID);
    }

    public void clickAffiliateAccount() {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_AFFILIATE);
        clickToElement(AdminHomePageUI.ACCOUNT_AFFILIATE);
    }

    public void clickAffiliateAccountValue() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.ACCOUNT_AFFILIATE_VALUE);
        clickToElement(AdminHomePageUI.ACCOUNT_AFFILIATE_VALUE);
    }

    public void clickToRegion() {
        waitForElementVisible(AdminHomePageUI.REGION_INPUT_DROPLIST);
        clickToElement(AdminHomePageUI.REGION_INPUT_DROPLIST);
    }

    public void clickToRegionValue() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.REGION_INPUT_VALUE_DROPLIST);
        clickToElement(AdminHomePageUI.REGION_INPUT_VALUE_DROPLIST);
    }

    public void clickToArea() {
        waitForElementVisible(AdminHomePageUI.AREA_INPUT_DROPLIST);
        clickToElement(AdminHomePageUI.AREA_INPUT_DROPLIST);
    }

    public void clickToAreaValue() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.AREA_INPUT_VALUE_DROPLIST);
        clickToElement(AdminHomePageUI.AREA_INPUT_VALUE_DROPLIST);
    }

    public void clickToPosition() {
        scrollToElement(AdminHomePageUI.POSITION_INPUT);
        waitForElementVisible(AdminHomePageUI.POSITION_INPUT);
        clickToElement(AdminHomePageUI.POSITION_INPUT);
    }

    public void clickToPositionValue() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.POSITION_INPUT_VALUE);
        clickToElement(AdminHomePageUI.POSITION_INPUT_VALUE);
    }

    public void clickToManage() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.MANAGE_INPUT);
        clickToElement(AdminHomePageUI.MANAGE_INPUT);
    }

    public void clickToManageValue() {
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.MANAGE_INPUT_VALUE);
        clickToElement(AdminHomePageUI.MANAGE_INPUT_VALUE);
    }

    public StaffHomePageObject clickToSex() {
            scrollToTopPage();
            waitForElementVisible(AdminHomePageUI.SEX_DROP_LIST);
            clickToElement(AdminHomePageUI.SEX_DROP_LIST);
            return new StaffHomePageObject();
    }
}
