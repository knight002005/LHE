package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.zonearea.*;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ZoneAreaManagement extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private ZoneAreaHomePageObject zoneAreaHomePage, zoneHomePage;
    private CreateAreaPageObject createAreaPage;
    private CreateZonePageObject createZonePage;
    private DetailAreaPageObject detailAreaPage;
    private DetailZonePageObject detailZonePage;
    private AddDistributorPageObject addDistributor;
    public String areaName, note, zoneName, documentImage, provinceCityName, areaNameChoose, provinceCityNameChoose, distributorName, distributorIDChoose;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        areaName = "Vùng " + getRandomInt();
        note = "Note";
        zoneName = "Khu vực-" + getRandomInt();
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
    public void TC_02_Create_Area(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Area Management");
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

    @Test
    public void TC_03_Create_Zone(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Zone Area Management");
        goToHomePage();
        zoneAreaHomePage = homePage.clickZoneAreaManagementButton();
        zoneHomePage = zoneAreaHomePage.clickZoneButton();
        createZonePage = zoneHomePage.clickCreateZoneButton();
        createZonePage.inputZoneName(zoneName);
        createZonePage.clickAreaDropList();
        createZonePage.clickArea();
        areaNameChoose = createZonePage.getAreaName();
        createZonePage.clickProvinceCityDropList();
        createZonePage.clickProvinceCity();
        provinceCityNameChoose = createZonePage.getProvinceCityName();
        createZonePage.inputNote(note);
        addDistributor = createZonePage.clickAddDistributor();
        addDistributor.clickDistributorCheckBox();
        distributorName = addDistributor.getDistributorName();
        distributorIDChoose = addDistributor.getDistributorID();
        addDistributor.clickAddButton();
        detailZonePage = createZonePage.clickCreate();
        assertTrue(detailZonePage.isDetailZoneDisplayed());
        assertEquals(detailZonePage.getZoneName(),zoneName);
        assertEquals(detailZonePage.getDetailAreaName(),areaNameChoose);
        assertEquals(detailZonePage.getDetailProvinceCityName(),provinceCityNameChoose);
        assertEquals(detailZonePage.getDetailDistributorName(), distributorName);
        assertEquals(detailZonePage.getDetailDistributorID(), distributorIDChoose);
    }
}
