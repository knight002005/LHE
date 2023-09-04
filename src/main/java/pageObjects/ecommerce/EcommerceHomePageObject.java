package pageObjects.ecommerce;

import commons.BasePage;
import pageUIs.ecommerce.EcommerceHomePageUI;

public class EcommerceHomePageObject extends BasePage {
    public Boolean isAccountIconDisplayed() {
        waitForElementVisible(EcommerceHomePageUI.ICON_ACCOUNT);
        return isElementDisplay(EcommerceHomePageUI.ICON_ACCOUNT);
    }
}
