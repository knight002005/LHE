package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class CreateGroupDocumentPageObject extends BasePage {
    public CreateGroupDocumentPageObject() {
    }

    public void inputGroupName(String groupName) {
        waitForElementClickable(AdminHomePageUI.INPUT_GROUP_NAME_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_GROUP_NAME_FIELD, groupName);
    }

    public void inputNote(String note) {
        waitForElementClickable(AdminHomePageUI.INPUT_NOTE_GROUP_DOCUMENT_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_NOTE_GROUP_DOCUMENT_FIELD, note);
    }

    public void clickCreateGroupDocumentButton() {
        waitForElementClickable(AdminHomePageUI.CREATE_GROUP_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_GROUP_DOCUMENT_BUTTON);
    }

    public boolean isCreateGroupDocumentTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.CREATE_GROUP_DOCUMENT_TEXT);
        return isElementDisplay(AdminHomePageUI.CREATE_GROUP_DOCUMENT_TEXT);
    }

    public void clickConfirmGroupDocumentButton() {
        waitForElementClickable(AdminHomePageUI.CONFIRM_GROUP_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.CONFIRM_GROUP_DOCUMENT_BUTTON);
    }

    public void clickGroupName() {
        waitForElementClickable(AdminHomePageUI.INPUT_GROUP_NAME_FIELD);
        clickToElement(AdminHomePageUI.INPUT_GROUP_NAME_FIELD);
    }

    public boolean getErrorMessageGroupDocumentName() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_GROUP_DOCUMENT_BUTTON);
        return isElementDisplay(AdminHomePageUI.ERROR_MESSAGE_EMPTY_GROUP_DOCUMENT_BUTTON);
    }

    public boolean getErrorMessageCreateGroupDocument() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_CREATE_GROUP_DOCUMENT_BUTTON);
        return isElementDisplay(AdminHomePageUI.ERROR_MESSAGE_CREATE_GROUP_DOCUMENT_BUTTON);
    }

    public void clickBackGroupDocumentButton() {
        waitForElementClickable(AdminHomePageUI.ERROR_MESSAGE_GROUP_DOCUMENT_BACK_BUTTON);
        clickToElement(AdminHomePageUI.ERROR_MESSAGE_GROUP_DOCUMENT_BACK_BUTTON);
    }

    public void dragAndDropIcon() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
        dragAndDrop( AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.BELL_ICON);
    }

//    public void clickNote() {
//        waitForElementClickable(AdminHomePageUI.INPUT_NOTE_GROUP_DOCUMENT_FIELD);
//        clickToElement(AdminHomePageUI.INPUT_NOTE_GROUP_DOCUMENT_FIELD);
//    }
}
