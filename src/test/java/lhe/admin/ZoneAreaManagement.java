package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.document.EnactDocumentPageObject;
import pageObjects.admin.zonearea.CreateAreaPageObject;
import pageObjects.admin.zonearea.DetailAreaPageObject;
import pageObjects.admin.zonearea.ZoneAreaHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ZoneAreaManagement extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private ZoneAreaHomePageObject zoneAreaHomePage;
    private CreateAreaPageObject createAreaPage;
    private DetailAreaPageObject detailAreaPage;
    public String areaName, note, documentName, fromDay, toDay, documentImage, provinceCityName;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        areaName = "Vùng " + getRandomInt();
        note = "Note";
        documentName = "DOC-" + getRandomString();
        fromDay = getCurrentDay();
        toDay = "12/12/2023";
        documentImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
    }

    public void goToHomePage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Go_To_Zone_Area(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Zone Area Management");
        goToHomePage();
        zoneAreaHomePage = homePage.clickZoneAreaManagementButton();
        assertTrue(zoneAreaHomePage.isZoneAreaTextDisplayed());
    }

    @Test
    public void TC_02_Go_To_Zone_Area(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Zone Area Management");
        goToHomePage();
        zoneAreaHomePage = homePage.clickZoneAreaManagementButton();
        createAreaPage = zoneAreaHomePage.clickCreateAreaButton();
        createAreaPage.inputAreaName(areaName);
        createAreaPage.clickProvinceCityDropList();
        createAreaPage.clickProvinceCity();
        provinceCityName = createAreaPage.getProvinceCityName();
        createAreaPage.inputNote(note);
        detailAreaPage = createAreaPage.clickCreate();
        assertTrue(detailAreaPage.isDetailAreaDisplayed());
        assertEquals(detailAreaPage.getAreaName(),areaName);
        assertEquals(detailAreaPage.getProvinceCityName(),provinceCityName);
        assertEquals(detailAreaPage.getNote(),note);
    }
}
