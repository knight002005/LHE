package pageObjects.collabarator;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.collaborator.CollaboratorHomePageUI;

public class CollaboratorHomePageObject extends BasePage {
    @Step("Verify 'Product Text' is displayed")
    public boolean isIconAccountDisplayed() {
        waitForElementVisible(CollaboratorHomePageUI.ICON_ACCOUNT);
        return isElementDisplay(CollaboratorHomePageUI.ICON_ACCOUNT);
    }
}

