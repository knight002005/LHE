package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.order.CreateOrderPageObject;
import pageObjects.admin.order.OrderDetailPageObject;
import pageObjects.admin.order.OrderForDistributorPageObject;
import pageObjects.admin.order.OrderHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddOrder extends BaseTest {

    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private OrderHomePageObject orderHomePage;
    private OrderForDistributorPageObject orderForDistributorPage;
    private CreateOrderPageObject createOrderPage;
    private OrderDetailPageObject orderDetailPage;

    private String selectDistributor, enterNote, productName, productAddName, noteText, estimatedDeliveryDate, wareHouse;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        selectDistributor = "Nguyen Van A";
        enterNote = "LHETest";
        productName = "Thạch rau câu phong cách Nhật Bản Kimiko 990g";
        productAddName = "Thạch rau câu phong cách Nhật Bản Kimikoko hihi 450g";
        noteText = "LHETest";
        estimatedDeliveryDate = getCurrentDay();
        wareHouse = "Kho Cẩm Thượng";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Cancel_Order_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Order Page");
        goToHomPage();
        orderHomePage = homePage.clickOrderButton();
        orderForDistributorPage = orderHomePage.clickOrderForDistributor();
        createOrderPage = orderForDistributorPage.clickAddNewOrderButton();
        orderForDistributorPage = createOrderPage.clickCancelButton();
        assertTrue(orderForDistributorPage.isOrderInFormationTextDisplayed());
    }

    @Test
    public void TC_02_Create_Order_Page_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create Order Page");
        goToHomPage();
        orderHomePage = homePage.clickOrderButton();
        orderForDistributorPage = orderHomePage.clickOrderForDistributor();
        createOrderPage = orderForDistributorPage.clickAddNewOrderButton();
        createOrderPage.inputDynamic("Tìm kiến nhà phân phối", selectDistributor);
        createOrderPage.clickDistributorInput();
        createOrderPage.clickSelectDistributor();
        createOrderPage.inputDynamic("MM-DD-YYYY", estimatedDeliveryDate);
        createOrderPage.addNote(enterNote);
        createOrderPage.clickChooseStoreButton();
        createOrderPage.clickSelectStore();
        createOrderPage.clickChooseProductButton();
        createOrderPage.clickCancelProductButton();
        createOrderPage.clickChooseProductButton();
        createOrderPage.dragAndDropIcon();
        createOrderPage.inputDynamic("Tìm kiếm sản phẩm", productName);
        createOrderPage.clickChooseProductTextbox();
        createOrderPage.clickAddButton();
        createOrderPage.clickCreateOrderButton();
        createOrderPage.clickListPageButton();
    }

    @Test
    public void TC_03_Approve_Order(Method method) {
        // Create new order
        ExtentTestManager.startTest(method.getName(), "Approve Order");
        goToHomPage();
        orderHomePage = homePage.clickOrderButton();
        orderForDistributorPage = orderHomePage.clickOrderForDistributor();
        createOrderPage = orderForDistributorPage.clickAddNewOrderButton();
        createOrderPage.inputDynamic("Tìm kiến nhà phân phối", selectDistributor);
        createOrderPage.clickDistributorInput();
        createOrderPage.clickSelectDistributor();
        createOrderPage.inputDynamic("MM-DD-YYYY", estimatedDeliveryDate);
        createOrderPage.addNote(enterNote);
        createOrderPage.clickChooseStoreButton();
        createOrderPage.clickSelectStore();
        createOrderPage.clickChooseProductButton();
        createOrderPage.clickCancelProductButton();
        createOrderPage.clickChooseProductButton();
        createOrderPage.dragAndDropIcon();
        createOrderPage.inputDynamic("Tìm kiếm sản phẩm", productName);
        createOrderPage.clickChooseProductTextbox();
        createOrderPage.clickAddButton();
        createOrderPage.clickCreateOrderButton();
        orderDetailPage = createOrderPage.clickViewDetailOrderButton();
        assertEquals(orderDetailPage.getDistributorText(), "Nguyễn Văn A");
        assertEquals(orderDetailPage.getStoreText(), "Kho Kiên NPP");
        assertEquals(orderDetailPage.getProductNameText(), productName);

        // Approve newly created order
        orderDetailPage.clickApproveOrderButton();
        orderDetailPage.inputSelectWarehouse(wareHouse);
        orderDetailPage.clickWarehouse();
        orderDetailPage.clickApproveOrderButtonInModal();
        orderDetailPage.clickCloseModal();

        // Verify status of the order
        assertTrue(orderDetailPage.isProcessingButtonDisplayed());
    }

    @Test
    public void TC_04_Approve_Order_From_Order_Home_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Approve Order From Order Home Page");
        goToHomPage();
        orderHomePage = homePage.clickOrderButton();
        orderForDistributorPage = orderHomePage.clickOrderForDistributor();
        createOrderPage = orderForDistributorPage.clickAddNewOrderButton();
        createOrderPage.inputDynamic("Tìm kiến nhà phân phối", selectDistributor);
        createOrderPage.clickDistributorInput();
        createOrderPage.clickSelectDistributor();
        createOrderPage.inputDynamic("MM-DD-YYYY", estimatedDeliveryDate);
        createOrderPage.addNote(enterNote);
        createOrderPage.clickChooseStoreButton();
        createOrderPage.clickSelectStore();
        createOrderPage.clickChooseProductButton();
        createOrderPage.clickCancelProductButton();
        createOrderPage.clickChooseProductButton();
        createOrderPage.dragAndDropIcon();
        createOrderPage.inputDynamic("Tìm kiếm sản phẩm", productName);
        createOrderPage.clickChooseProductTextbox();
        createOrderPage.clickAddButton();
        createOrderPage.clickCreateOrderButton();
        createOrderPage.clickListPageButton();

        orderForDistributorPage.clickWaitingForApproveButton();
        orderDetailPage = orderForDistributorPage.clickViewDetailButton();
        assertEquals(orderDetailPage.getDistributorText(), "Nguyễn Văn A");
        assertEquals(orderDetailPage.getStoreText(), "Kho Kiên NPP");
        assertEquals(orderDetailPage.getProductNameText(), productName);

        // Approve newly created order
        orderDetailPage.clickApproveOrderButton();
        orderDetailPage.inputSelectWarehouse(wareHouse);
        orderDetailPage.clickWarehouse();
        orderDetailPage.clickApproveOrderButtonInModal();
        orderDetailPage.clickCloseModal();

        // Verify status of the order
        assertTrue(orderDetailPage.isProcessingButtonDisplayed());
    }

    @Test
    public void TC_05_Refuse_Approve_Order(Method method) {
        ExtentTestManager.startTest(method.getName(), "Refuse Approve Order");
        goToHomPage();
        // Refuse the order
        orderHomePage = homePage.clickOrderButton();
        orderForDistributorPage = orderHomePage.clickOrderForDistributor();
        orderForDistributorPage.clickWaitingForApproveButton();
        orderDetailPage = orderForDistributorPage.clickViewDetailButton();
        orderDetailPage.clickRefuseOrderButton();
        orderDetailPage.clickConfirmButton();
        orderDetailPage.clickCancelButton();

        // Verify status of the order
        assertTrue(orderDetailPage.getTextStatusButton().contains("Đã từ chối"));
    }
}
