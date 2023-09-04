package pageObjects.admin.transport;

import commons.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import pageUIs.admin.AdminHomePageUI;

public class AddShipmentPageObject extends BasePage {

    public AddShipmentPageObject() {
    }

    public void clickRangeOfVehicleInput() {
        waitForElementClickable(AdminHomePageUI.DROPLIST_RANGE);
        clickToElement(AdminHomePageUI.DROPLIST_RANGE);
    }

    public void clickToRangeInternalCar() {
        waitForElementClickable(AdminHomePageUI.INPUT_INTERNAL_CAR);
        clickToElement(AdminHomePageUI.INPUT_INTERNAL_CAR);
    }

    public void clickToDrive() {
        waitForElementClickable(AdminHomePageUI.DRIVE);
        clickToElement(AdminHomePageUI.DRIVE);
    }

    public void clickToDriveInput() {
        sleepInSecond(2);
        waitForElementClickable(AdminHomePageUI.INPUT_DRIVE);
        clickToElement(AdminHomePageUI.INPUT_DRIVE);
    }

    public void clickToTruck() {
        waitForElementClickable(AdminHomePageUI.TRUCK);
        clickToElement(AdminHomePageUI.TRUCK);
    }

    public void clickToTruckInput() {
        sleepInSecond(2);
        waitForElementClickable(AdminHomePageUI.INPUT_TRUCK);
        clickToElement(AdminHomePageUI.INPUT_TRUCK);
    }

    public BillPageObject clickToVoteButton() {
        waitForElementClickable(AdminHomePageUI.VOTE_BUTTON);
        clickToElement(AdminHomePageUI.VOTE_BUTTON);
        return new BillPageObject();
    }

    public void clickToAddNew() {
        waitForElementClickable(AdminHomePageUI.ADD_NEW);
        clickToElement(AdminHomePageUI.ADD_NEW);
    }

    public TransportHomePageObject clickToBack() {
        waitForElementClickable(AdminHomePageUI.BUTTON_BACK);
        clickToElement(AdminHomePageUI.BUTTON_BACK);
        return new TransportHomePageObject();
    }

    public String getDriverNameIn() {
        waitForElementVisible(AdminHomePageUI.DRIVER_NAME);
        return getElementText(AdminHomePageUI.DRIVER_NAME);
    }

    public void clickRangeOutOfVehicleInput() {
        waitForElementVisible(AdminHomePageUI.RANGE_OUT);
        clickToElement(AdminHomePageUI.RANGE_OUT);
    }

    public void inputPlaceHolder(String value, String placeHolder) {
        waitForElementVisible(AdminHomePageUI.INPUT_BY_PLACEHOLDER, placeHolder);
        sendKeyToElement(AdminHomePageUI.INPUT_BY_PLACEHOLDER, value, placeHolder);
    }
}
