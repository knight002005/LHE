package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class ListDocumentPageObject extends BasePage {
    //    public ListDocumentPageObject() {
//    }
    public CreateDocumentPageObject clickCreateDocumentButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_DOCUMENT_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_DOCUMENT_BUTTON);
        return new CreateDocumentPageObject();
    }

    public void clickFilterWaitEnact() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.FILTER_WAIT_ENACT);
        clickToElement(AdminHomePageUI.FILTER_WAIT_ENACT);
    }

    public DetailDocumentPageObject clickWaitEnact() {
        waitForElementClickable(AdminHomePageUI.WAIT_ENACT);
        clickToElement(AdminHomePageUI.WAIT_ENACT);
        return new DetailDocumentPageObject();
    }

    public DetailDocumentPageObject clickEnacting() {
        waitForElementClickable(AdminHomePageUI.ENACTING);
        clickToElement(AdminHomePageUI.ENACTING);
        return new DetailDocumentPageObject();
    }

    public void clickFilterEnacting() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.FILTER_ENACTING);
        clickToElement(AdminHomePageUI.FILTER_ENACTING);
    }
}
