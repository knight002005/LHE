package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class DetailDocumentPageObject extends BasePage {
    public DetailDocumentPageObject() {
    }
    public String isDocumentNameTextDisplayed() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.DOCUMENT_NAME);
        return getElementText(AdminHomePageUI.DOCUMENT_NAME);
    }

    public String isGroupDocumentNameTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.GROUP_DOCUMENT_NAME);
        return getElementText(AdminHomePageUI.GROUP_DOCUMENT_NAME);
    }

    public String isNoteTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.DETAIL_NOTE);
        return getElementText(AdminHomePageUI.DETAIL_NOTE);
    }

    public EnactDocumentPageObject clickApproveDocumentButton() {
        waitForElementClickable(AdminHomePageUI.APPROVE_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.APPROVE_DOCUMENT_BUTTON);
        return new EnactDocumentPageObject();
    }

    public void clickDeleteDocument() {
        waitForElementClickable(AdminHomePageUI.DELETE_DOCUMENT);
        clickToElement(AdminHomePageUI.DELETE_DOCUMENT);
    }

    public boolean MessageDeleteDocument() {
        waitForElementVisible(AdminHomePageUI.MESSAGE_DELETE_DOCUMENT);
        return isElementDisplay(AdminHomePageUI.MESSAGE_DELETE_DOCUMENT);
    }

    public void clickBackButton() {
        waitForElementClickable(AdminHomePageUI.ERROR_MESSAGE_GROUP_DOCUMENT_BACK_BUTTON);
        clickToElement(AdminHomePageUI.ERROR_MESSAGE_GROUP_DOCUMENT_BACK_BUTTON);
    }

    public void clickCancelEnactDocument() {
        waitForElementClickable(AdminHomePageUI.CANCEL_ENACT_DOCUMENT);
        clickToElement(AdminHomePageUI.CANCEL_ENACT_DOCUMENT);
    }

    public boolean MessageCancelEnactDocument() {
        waitForElementVisible(AdminHomePageUI.MESSAGE_CANCEL_ENACT_DOCUMENT);
        return isElementDisplay(AdminHomePageUI.MESSAGE_CANCEL_ENACT_DOCUMENT);
    }
}
