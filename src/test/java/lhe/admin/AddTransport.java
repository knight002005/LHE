package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.transport.AddShipmentPageObject;
import pageObjects.admin.transport.BillPageObject;
import pageObjects.admin.transport.DetailTransportPageObject;
import pageObjects.admin.transport.TransportHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddTransport extends BaseTest {
    private String browserName;

    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private TransportHomePageObject transportHomePage;
    private AddShipmentPageObject addShipmentPage;
    private BillPageObject billPage;
    private DetailTransportPageObject detailTransportPageObject;
    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Goto_Transport_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go to Transport");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        assertTrue(transportHomePage.isTransportTitleTextDisplayed());
    }

    @Test
    public void TC_02_Add_New_Shipment(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add new Shipment");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        addShipmentPage = transportHomePage.clickAddNewShipmentButton();
    }
    @Test
    public void TC_03_Add_New_Shipment_In_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add new Shipment In Success");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        addShipmentPage = transportHomePage.clickAddNewShipmentButton();
        addShipmentPage.clickRangeOfVehicleInput();
        addShipmentPage.clickToRangeInternalCar();
        addShipmentPage.clickToDrive();
        addShipmentPage.clickToDriveInput();
        addShipmentPage.clickToTruck();
        addShipmentPage.clickToTruckInput();
        String driverNameIn = addShipmentPage.getDriverNameIn();
        billPage = addShipmentPage.clickToVoteButton();
        assertTrue(billPage.isVoteTitleTextDisplayed());
        billPage.clickToBillDelivery();
        billPage.clickToCheckbox();
        billPage.clickToButtonAccept();
        addShipmentPage.clickToAddNew();
        transportHomePage = addShipmentPage.clickToBack();
        detailTransportPageObject = transportHomePage.clickToDetailsButton();
        assertEquals(driverNameIn, detailTransportPageObject.getDriverNameInDetail());
    }
    @Test
    public void TC_04_Add_New_Shipment_Out_Success(Method method){
        ExtentTestManager.startTest(method.getName(), "Add new Shipment Out Success");
        goToHomPage();
        transportHomePage = homePage.clickTransportButton();
        addShipmentPage = transportHomePage.clickAddNewShipmentButton();
        addShipmentPage.clickRangeOfVehicleInput();
        addShipmentPage.clickRangeOutOfVehicleInput();
        addShipmentPage.inputPlaceHolder( "29A-12425", "Nhập biển số");
        addShipmentPage.inputPlaceHolder("4", "Nhập tải trọng");
        addShipmentPage.inputPlaceHolder( "Minh 12", "Nhập tên lái xe");
        addShipmentPage.inputPlaceHolder( "0902545865", "Nhập số điện thoại");
        billPage = addShipmentPage.clickToVoteButton();
        assertTrue(billPage.isVoteTitleTextDisplayed());
        billPage.clickToBillDelivery();
        billPage.clickToCheckbox();
        billPage.clickToButtonAccept();
        addShipmentPage.clickToAddNew();
        transportHomePage = addShipmentPage.clickToBack();
        detailTransportPageObject = transportHomePage.clickToDetailsButton();
    }
}
