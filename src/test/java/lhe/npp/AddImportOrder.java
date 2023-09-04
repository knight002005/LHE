package lhe.npp;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.order.CreateOrderPageObject;
import pageObjects.npp.order.ImportOrderPageObject;
import pageObjects.npp.order.OrderHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;

public class AddImportOrder extends BaseTest {
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private ImportOrderPageObject importOrderPage;
    private OrderHomePageObject orderHomePage;
    private CreateOrderPageObject createOrderPage;
    private String expectDate, note;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        nppLoginPage = new NppLoginPageObject(NPP_LOGIN);
        nppHomePage = nppLoginPage.goToNppHomePage();
        expectDate = "01/01/2024";
        note = "xinchao";
    }

    public void goToNppHomePage() {
        nppHomePage.openPageUrl(NPP_LOGIN);
    }

    @Test
    public void TC_01_Add_Order_Successfully(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Order");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        importOrderPage = orderHomePage.importOrderButton();
        createOrderPage = importOrderPage.createNewOrderButton();
        createOrderPage.clickImportWarehouseParent();
        createOrderPage.clickImportWarehouseChild();
        createOrderPage.inputExpectDate(expectDate);
        createOrderPage.inputNote(note);
        createOrderPage.clickToAddOrderButton();
    }
}