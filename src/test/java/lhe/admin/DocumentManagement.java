package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.document.*;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DocumentManagement extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private DocumentHomePageObject documentHomePage;
    private ListDocumentPageObject listDocumentPage;
    private GroupDocumentPageObject groupDocumentPage;
    private CreateGroupDocumentPageObject createGroupDocumentPage;
    private CreateDocumentPageObject createDocumentPage;
    private DetailDocumentPageObject detailDocumentPage;
    private EnactDocumentPageObject enactDocumentPage;
    public String groupName, note, documentName, fromDay, toDay, documentImage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();
        groupName = "GR-" + getRandomString();
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
    public void TC_01_Go_To_Document_Management(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        assertTrue(documentHomePage.isDocumentTextDisplayed());
    }

    @Test
    public void TC_02_Create_Group_Document(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Create Group Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        groupDocumentPage = documentHomePage.clickGroupDocumentButton();
        createGroupDocumentPage = groupDocumentPage.clickCreateGroupDocumentButton();
        createGroupDocumentPage.inputGroupName(groupName);
        createGroupDocumentPage.inputNote(note);
        createGroupDocumentPage.clickCreateGroupDocumentButton();
        assertTrue(createGroupDocumentPage.isCreateGroupDocumentTextDisplayed());
        createGroupDocumentPage.clickConfirmGroupDocumentButton();
    }

    @Test
    public void TC_03_Create_Document_And_Enact(Method method) {
        ExtentTestManager.startTest(method.getName(), "Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        listDocumentPage = documentHomePage.clickListDocumentButton();
        createDocumentPage = listDocumentPage.clickCreateDocumentButton();
        createDocumentPage.inputDocumentName(documentName);
        createDocumentPage.clickDropListGroupDocument();
        createDocumentPage.clickValueDropListGroupDocument();
        createDocumentPage.clickFromDayDocument(fromDay);
        createDocumentPage.clickToDayDocument(toDay);
        createDocumentPage.inputDocumentImg(documentImage);
        createDocumentPage.inputNote(note);
        createDocumentPage.clickCreateDocumentButton();
        assertTrue(createDocumentPage.isCreateDocumentTextDisplayed());
        detailDocumentPage = createDocumentPage.clickDetailDocumentButton();
        assertEquals(detailDocumentPage.isDocumentNameTextDisplayed(), documentName);
        assertEquals(detailDocumentPage.isGroupDocumentNameTextDisplayed(), "Nhóm tài liệu nè");
        assertEquals(detailDocumentPage.isNoteTextDisplayed(), note);
        enactDocumentPage = detailDocumentPage.clickApproveDocumentButton();
        enactDocumentPage.inputToEnactDay(fromDay);
        enactDocumentPage.dragAndDropIcon();
        enactDocumentPage.clickEnactTo();
        enactDocumentPage.clickEnactButton();
        enactDocumentPage.clickBackButton();
    }

    @Test
    public void TC_04_Group_Document_Invalidate(Method method) {
        ExtentTestManager.startTest(method.getName(), "Group Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        groupDocumentPage = documentHomePage.clickGroupDocumentButton();
        createGroupDocumentPage = groupDocumentPage.clickCreateGroupDocumentButton();
        createGroupDocumentPage.clickGroupName();
        createGroupDocumentPage.inputNote(note);
        assertTrue(createGroupDocumentPage.getErrorMessageGroupDocumentName());
        createGroupDocumentPage.clickCreateGroupDocumentButton();
        assertTrue(createGroupDocumentPage.getErrorMessageCreateGroupDocument());
        createGroupDocumentPage.clickBackGroupDocumentButton();
    }

    @Test
    public void TC_05_Enact_Document(Method method) {
        ExtentTestManager.startTest(method.getName(), "Enact Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        listDocumentPage = documentHomePage.clickListDocumentButton();
        listDocumentPage.clickFilterWaitEnact();
        detailDocumentPage = listDocumentPage.clickWaitEnact();
        detailDocumentPage.clickApproveDocumentButton();
        enactDocumentPage = detailDocumentPage.clickApproveDocumentButton();
        enactDocumentPage.inputToEnactDay(fromDay);
        enactDocumentPage.dragAndDropIcon();
        enactDocumentPage.clickEnactTo();
        enactDocumentPage.clickEnactButton();
        enactDocumentPage.clickBackButton();
    }

    @Test
    public void TC_06_Delete_Document(Method method) {
        ExtentTestManager.startTest(method.getName(), "Delete Document Management");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        listDocumentPage = documentHomePage.clickListDocumentButton();
        listDocumentPage.clickFilterWaitEnact();
        detailDocumentPage = listDocumentPage.clickWaitEnact();
        detailDocumentPage.clickDeleteDocument();
        assertTrue(detailDocumentPage.MessageDeleteDocument());
        detailDocumentPage.clickBackButton();
    }

    @Test
    public void TC_07_Cancel_Enact_Document(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Enact Document");
        goToHomePage();
        documentHomePage = homePage.clickDocumentManagementButton();
        listDocumentPage = documentHomePage.clickListDocumentButton();
        listDocumentPage.clickFilterEnacting();
        detailDocumentPage = listDocumentPage.clickEnacting();
        detailDocumentPage.clickCancelEnactDocument();
        assertTrue(detailDocumentPage.MessageCancelEnactDocument());
        detailDocumentPage.clickBackButton();
    }
}
