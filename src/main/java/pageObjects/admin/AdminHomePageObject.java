package pageObjects.admin;

import commons.BasePage;
import io.qameta.allure.Step;
import pageObjects.admin.distributorManagement.DistributorManagementPageObject;
import pageObjects.admin.document.DocumentHomePageObject;
import pageObjects.admin.order.OrderHomePageObject;
import pageObjects.admin.product.ProductHomePageObject;
import pageObjects.admin.transport.TransportHomePageObject;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageObjects.staff.StaffHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import pageObjects.admin.zonearea.ZoneAreaHomePageObject;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class AdminHomePageObject extends BasePage {
    public AdminHomePageObject() {
    }

    @Step("Verify 'Product Text' is displayed")
    public boolean isRevenueTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.REVENUE_TEXT);
        return isElementDisplay(AdminHomePageUI.REVENUE_TEXT);
    }

    public void clickButtonDragToTheLeft() {
        waitForElementClickable(AdminHomePageUI.DRAG_TO_THE_LEFT_BUTTON);
        clickToElement(AdminHomePageUI.DRAG_TO_THE_LEFT_BUTTON);
    }

    public DistributorManagementPageObject clickDistributorManagementButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.DISTRIBUTOR_MANAGEMENT);
        clickToElement(AdminHomePageUI.DISTRIBUTOR_MANAGEMENT);
        return new DistributorManagementPageObject();
    }

    public ProductHomePageObject clickProductButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.PRODUCT_BUTTON);
        clickToElement(AdminHomePageUI.PRODUCT_BUTTON);
        return new ProductHomePageObject();
    }

    public OrderHomePageObject clickOrderButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.ORDER_BUTTON);
        clickToElement(AdminHomePageUI.ORDER_BUTTON);
        return new OrderHomePageObject();
    }

    public UserManagementHomePageObject clickUserManagementButton() {
        waitForElementClickable(AdminHomePageUI.USER_MANAGEMENT_BUTTON);
        clickToElement(AdminHomePageUI.USER_MANAGEMENT_BUTTON);
        return new UserManagementHomePageObject();
    }

    public TransportHomePageObject clickTransportButton() {
        waitForElementClickable(AdminHomePageUI.TRANSPORT_BUTTON);
        clickToElement(AdminHomePageUI.TRANSPORT_BUTTON);
        return new TransportHomePageObject();
    }

    public DocumentHomePageObject clickDocumentManagementButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.DOCUMENT_MANAGEMENT);
        clickToElement(AdminHomePageUI.DOCUMENT_MANAGEMENT);
        return new DocumentHomePageObject();
    }

    public ZoneAreaHomePageObject clickZoneAreaManagementButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.ZONE_AREA_MANAGEMENT);
        clickToElement(AdminHomePageUI.ZONE_AREA_MANAGEMENT);
        return new ZoneAreaHomePageObject();
    }
    public void clickStaffHomePageButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.STAFF_MANAGEMENT);
        clickToElement(AdminHomePageUI.STAFF_MANAGEMENT);
    }

    public StaffHomePageObject clickStaffIcon() {
        waitForElementClickable(AdminHomePageUI.STAFF_ICON);
        clickToElement(AdminHomePageUI.STAFF_ICON);
        return new StaffHomePageObject();
    }
}
