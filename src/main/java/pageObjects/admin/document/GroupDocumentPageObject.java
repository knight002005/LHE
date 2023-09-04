package pageObjects.admin.document;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class GroupDocumentPageObject extends BasePage {
//    public GroupDocumentPageObject() {
//    }

    public CreateGroupDocumentPageObject clickCreateGroupDocumentButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.CREATE_GROUP_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_GROUP_BUTTON);
        return new CreateGroupDocumentPageObject();
    }
}
