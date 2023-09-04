package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.order.*;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertEquals;

public class EditOrder extends BaseTest {
    private String browserName;

    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private OrderHomePageObject orderHomePage;
    private OrderForDistributorPageObject orderForDistributorPage;
    private CreateOrderPageObject createOrderPage;
    private OrderDetailPageObject orderDetailPage;
    private EditOrderPageObject editOrderPage;

    private String selectDistributor, enterNote, productName, estimatedDeliveryDate, wareHouse, numberOfProduct;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        selectDistributor = "Nguyen Van A";
        enterNote = "LHETest";
        productName = "Thạch rau câu phong cách Nhật Bản Kimiko 990g";
        estimatedDeliveryDate = getCurrentDay();
        wareHouse = "Kho Cẩm Thượng";
        numberOfProduct = "2";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Create_Order_Page_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create Order Page");
        goToHomPage();
        orderHomePage = homePage.clickOrderButton();

        // Create new order
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

        // Verify data create new
        assertEquals(orderDetailPage.getDistributorText(), "Nguyễn Văn A");
        assertEquals(orderDetailPage.getStoreText(), "Kho Kiên NPP");
        assertEquals(orderDetailPage.getProductNameText(), productName);

        // Edit data
        editOrderPage = orderDetailPage.clickEditButton();
        editOrderPage.inputSelectWarehouse(wareHouse);
        editOrderPage.clickWarehouse();
        editOrderPage.inputEditTheNumberOfProduct(numberOfProduct);
        editOrderPage.clickAddProductButton();
        editOrderPage.clickCheckboxProduct();
        editOrderPage.clickAddProductButtonInPopup();
        editOrderPage.clickSaveButton();
        editOrderPage.closeModalUpdateSuccess();
    }
}
