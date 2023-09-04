package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class EnactDocumentPageObject extends BasePage {

    public EnactDocumentPageObject() {
    }
    public void inputToEnactDay(String fromDay) {
        waitForElementClickable(AdminHomePageUI.FROM_DAY_DOCUMENT_ENACT_FIELD);
        sendKeyToElement(AdminHomePageUI.FROM_DAY_DOCUMENT_ENACT_FIELD, fromDay);
    }

    public void clickEnactTo() {
        waitForElementClickable(AdminHomePageUI.ENACT_TO_FIELD);
        clickToElement(AdminHomePageUI.ENACT_TO_FIELD);
    }

    public void clickEnactButton() {
        waitForElementClickable(AdminHomePageUI.ENACT_BUTTON);
        clickToElement(AdminHomePageUI.ENACT_BUTTON);
    }

    public void dragAndDropIcon() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
        dragAndDrop( AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.BELL_ICON);
    }

    public void clickBackButton() {
        waitForElementClickable(AdminHomePageUI.BACK_TO_LIST_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.BACK_TO_LIST_DOCUMENT_BUTTON);
    }
}
