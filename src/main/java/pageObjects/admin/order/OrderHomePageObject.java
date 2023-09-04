package pageObjects.admin.order;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class OrderHomePageObject extends BasePage {

    public OrderHomePageObject() {
    }

    public OrderForDistributorPageObject clickOrderForDistributor() {
        waitForElementClickable(AdminHomePageUI.ORDER_FOR_DISTRIBUTOR_BUTTON);
        clickToElement(AdminHomePageUI.ORDER_FOR_DISTRIBUTOR_BUTTON);
        return new OrderForDistributorPageObject();
    }
}
