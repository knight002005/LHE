package pageUIs.ecommerce;

public class EcommerceLoginPageUI {
    public static final String INPUT_PHONE = "//input[@placeholder='Nhập số điện thoại']";
    public static final String INPUT_PASSWORD = "//input[@placeholder='Nhập mật khẩu']";

    public static final String PHONE_EMPTY_ERROR_MESSAGE = "//span[text()='Số điện thoại ']/parent::label/following-sibling::p";

    public static final String PASSWORD_EMPTY_ERROR_MESSAGE = "//span[text()='Mật khẩu ']/parent::label/following-sibling::p";

    public static final String LOGIN_BUTTON = "//button[@type='button']";

    public static final String MESS_ERROR_LOGIN = "//p[text()='Sai tên hoặc sai mật khẩu']";

    public static final String MESS_ERROR_PHONE_LOGIN = "//p[contains(text(),'Số điện thoại không hợp lệ')]";
}
