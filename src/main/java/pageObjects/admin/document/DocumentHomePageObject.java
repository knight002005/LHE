package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class DocumentHomePageObject extends BasePage {
    public DocumentHomePageObject() {
    }

    public boolean isDocumentTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.DOCUMENT_TEXT);
        return isElementDisplay(AdminHomePageUI.DOCUMENT_TEXT);
    }

    public ListDocumentPageObject clickListDocumentButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.LIST_DOCUMENT_TEXT);
        clickToElement(AdminHomePageUI.LIST_DOCUMENT_TEXT);
        return new ListDocumentPageObject();
    }

    public GroupDocumentPageObject clickGroupDocumentButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.GROUP_DOCUMENT_TEXT);
        clickToElement(AdminHomePageUI.GROUP_DOCUMENT_TEXT);
        return new GroupDocumentPageObject();
    }
}
