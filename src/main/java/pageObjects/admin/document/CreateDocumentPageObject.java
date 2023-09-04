package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class CreateDocumentPageObject extends BasePage {
    public CreateDocumentPageObject() {
    }

    public void inputDocumentName(String documentName) {
        waitForElementClickable(AdminHomePageUI.INPUT_DOCUMENT_NAME_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_DOCUMENT_NAME_FIELD, documentName);
    }

    public void clickDropListGroupDocument() {
        waitForElementClickable(AdminHomePageUI.INPUT_DOCUMENT_NAME_FIELD);
        clickToElement(AdminHomePageUI.DROP_LIST_GROUP_DOCUMENT_FIELD);
    }

    public void clickFromDayDocument(String fromDay) {
        waitForElementClickable(AdminHomePageUI.FROM_DAY_DOCUMENT_FIELD);
//        clickToElement(AdminHomePageUI.FROM_DAY_DOCUMENT_FIELD);
        sendKeyToElement(AdminHomePageUI.FROM_DAY_DOCUMENT_FIELD, fromDay);
    }

    public void clickToDayDocument(String toDay) {
        waitForElementClickable(AdminHomePageUI.TO_DAY_DOCUMENT_FIELD);
//        clickToElement(AdminHomePageUI.TO_DAY_DOCUMENT_FIELD);
        sendKeyToElement(AdminHomePageUI.TO_DAY_DOCUMENT_FIELD, toDay);
    }

    public void inputNote(String note) {
        waitForElementClickable(AdminHomePageUI.INPUT_NOTE_DOCUMENT_FIELD);
        sendKeyToElement(AdminHomePageUI.INPUT_NOTE_DOCUMENT_FIELD, note);
    }
    public void clickCreateDocumentButton() {
        waitForElementClickable(AdminHomePageUI.CREATE_DOCUMENT_BUTTON2);
        clickToElement(AdminHomePageUI.CREATE_DOCUMENT_BUTTON2);
    }

    public void inputDocumentImg(String documentImage) {
        uploadImage(AdminHomePageUI.DOCUMENT_IMG, documentImage);
    }

    public DetailDocumentPageObject clickDetailDocumentButton() {
        waitForElementClickable(AdminHomePageUI.DOCUMENT_INFO_BUTTON);
        clickToElement(AdminHomePageUI.DOCUMENT_INFO_BUTTON);
        return new  DetailDocumentPageObject();
    }

    public boolean isCreateDocumentTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.CREATE_DOCUMENT_TEXT);
        return isElementDisplay(AdminHomePageUI.CREATE_DOCUMENT_TEXT);
    }

    public void clickListlDocumentButton() {
        waitForElementClickable(AdminHomePageUI.LIST_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.LIST_DOCUMENT_BUTTON);
    }

    public void clickValueDropListGroupDocument() {
        waitForElementClickable(AdminHomePageUI.SELECT_VALUE_DROP_LIST_GROUP_DOCUMENT_FIELD);
        clickToElement(AdminHomePageUI.SELECT_VALUE_DROP_LIST_GROUP_DOCUMENT_FIELD);
    }
}
