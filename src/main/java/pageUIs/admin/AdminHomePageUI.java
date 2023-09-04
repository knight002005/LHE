package pageUIs.admin;

public class AdminHomePageUI {
    //  Distributor Management Page
    public static final String REVENUE_TEXT = "//h3[text()='Doanh thu']";
    public static final String DRAG_TO_THE_LEFT_BUTTON = "//li[@class='slick-active']/following-sibling::li/button";
    public static final String NEXT_BUTTON = "//span[text()='Tiếp theo']";
    public static final String BACK_BUTTON = "//span[text()='Quay lại']";
    public static final String CREATE_BUTTON = "//span[text()='Tạo tài khoản']";
    public static final String CLOSE_MODAL_BUTTON = "//p[text()='Đóng']";
    public static final String BACK_TO_CREATE_DISTRIBUTOR_PAGE_BUTTON = "//button[@class='btn btn__color--primary btn__size--default']";
    public static final String DISTRIBUTOR_MANAGEMENT = "//img[@src='/_nuxt/img/NPP.81347e0.svg']";
    public static final String ADD_MEMBER_BUTTON = "//div[@class='npp-manager__container px1']/button";
    public static final String VIEW_DETAIL_DISTRIBUTOR_BUTTON = "//p[@class='p6 gray-5']";
    public static final String EDIT_DISTRIBUTOR_BUTTON = "//span[contains(normalize-space(),'Chỉnh sửa')]";
    public static final String SAVE_DISTRIBUTOR_BUTTON = "//span[text()='Lưu']";
    public static final String PERSONAL_INFORMATION_TEXT = "//div[text()='Thông tin cá nhân']";
    public static final String MODAL_ERROR = "//div[@class='modal__content']";
    public static final String DISTRIBUTOR_MANAGEMENT_TEXT = "//span[contains(normalize-space(),'Quản lý nhà phân phối')]";
    public static final String TAX_CODE_INPUT_TEXT = "//input[@placeholder='Nhập mã số thuế']";
    public static final String WAREHOUSE_AREA_INPUT_TEXT = "//input[@placeholder='Nhập diện tích (㎡)']";
    public static final String LABOR_INPUT_TEXT = "//input[@placeholder='Nhập số lượng']";
    public static final String ID_CARD_INPUT_TEXT = "//input[@placeholder='Nhập CMT/CCCD']";
    public static final String ACCOUNT_DISTRIBUTOR_INPUT_TEXT = "//input[@placeholder='VD: Số điện thoại của bạn']";
    public static final String PASSWORD_DISTRIBUTOR_INPUT_TEXT = "//p[text()='Mật khẩu ']/following-sibling::div//input";
    public static final String EMAIL_DISTRIBUTOR_INPUT_TEXT = "//input[@placeholder='Nhập email']";
    public static final String REGION_INPUT_TEXT = "//input[@placeholder='Chọn vùng']";
    public static final String REGION_VALUE = "//ul[@class='vs__dropdown-menu']/li";
    public static final String AREA_INPUT_TEXT = "//input[@placeholder='Chọn khu vực']";
    public static final String AREA_VALUE = "//ul[@class='vs__dropdown-menu']/li";
    public static final String BUSINESS_MODEL_TEXT = "//input[@placeholder='Chọn loại hình kinh doanh']";
    public static final String BUSINESS_MODEL_VALUE = "//ul[@class='vs__dropdown-menu']/li";
    public static final String LABOR_INPUT = "//input[@placeholder='Nhập số lượng']";
    public static final String SELECT_ADDRESS_INPUT = "//input[@placeholder='Chọn địa chỉ']";
    public static final String SELECT_CITY = "//div[contains(normalize-space(),'An Giang') and @class='address-item']";
    public static final String SELECT_DISTRICT = "//div[contains(normalize-space(),'An Phú') and @class='address-item']";
    public static final String SELECT_WARD = "//div[contains(normalize-space(),'An Phú') and @class='address-item']";
    public static final String CREATE_USER_TEXT = "//div[@class='p1 mb1']";
    public static final String REPRESENTATIVE = "//p[contains(normalize-space(),'%s')]";
    public static final String CONFIRM_SUCCESS_TEXT = "//span[@class='green-2 h5']";
    public static final String ERROR_MESSAGE_EMPTY_REPRESENTATIVE =
            "//p[contains(normalize-space(),'Người đại diện')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_INVALID_REPRESENTATIVE =
            "//p[contains(normalize-space(),'Người đại diện')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Tên không hợp lệ')]";
    public static final String ERROR_MESSAGE_EMPTY_PHONE =
            "//p[contains(normalize-space(),'Số điện thoại')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_INVALID_PHONE =
            "//p[contains(normalize-space(),'Số điện thoại')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Số điện thoại không hợp lệ')]";
    public static final String ERROR_MESSAGE_EMPTY_TAX_CODE =
            "//p[contains(normalize-space(),'Mã số thuế NPP')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_ID_CARD =
            "//p[contains(normalize-space(),'CMT/CCCD')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_INVALID_ID_CARD =
            "//p[contains(normalize-space(),'CMT/CCCD')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'CMT/CCCD không hợp lệ')]";
    public static final String ERROR_MESSAGE_EMPTY_DATE_RANGE =
            "//p[contains(normalize-space(),'Ngày cấp')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_ISSUE_BY =
            "//p[contains(normalize-space(),'Nơi cấp')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_SELECT_ADDRESS =
            "//p[contains(normalize-space(),'Tỉnh/Thành phố, Quận/Huyện, Phường/Xã')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_ADDRESS =
            "//p[contains(normalize-space(),'Địa chỉ')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_WAREHOUSE_AREA =
            "//p[contains(normalize-space(),'Diện tích kho')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_LABOR =
            "//p[contains(normalize-space(),'Nhân công')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_TIME_IN =
            "//p[contains(normalize-space(),'Thời gian vào')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
    public static final String ERROR_MESSAGE_EMPTY_REGION =
            "//input[@placeholder='Chọn vùng']//ancestor::div[@class='input__content']/following-sibling::p";
    public static final String ERROR_MESSAGE_EMPTY_AREA =
            "//input[@placeholder='Chọn khu vực']//ancestor::div[@class='input__content']/following-sibling::p";
    public static final String ERROR_MESSAGE_ACCOUNT =
            "//input[@placeholder='VD: Số điện thoại của bạn']/parent::div/following-sibling::p";
    public static final String ERROR_MESSAGE_PASSWORD =
            "//input[@placeholder='Nhập mật khẩu']/parent::div/following-sibling::p";
    public static final String ERROR_MESSAGE_EMAIL =
            "//input[@placeholder='Nhập email']/parent::div/following-sibling::p";
    public static final String VIEW_DETAIL_ALL_DISTRIBUTOR_DIV = "//div[contains(text(),'Nhà phân phối')]";
    public static final String VIEW_DETAIL_NEW_DISTRIBUTOR = "//div[@class='user-manager__search mb15']/following-sibling::div/div/div[1]//p[@class='p5']";
    public static final String USER_NAME_TEXT = "//div[@class='user-manager__user-details__container px1']//p[@class='p5']";
    public static final String INFO_DISTRIBUTOR_TEXT = "//p[text()='%s']/following-sibling::p";
    public static final String VIEW_DETAIL_ALL_ACCOUNTANT_DIV = "//div[contains(text(),'Kế toán')]";
    public static final String VIEW_DETAIL_NEW_ACCOUNTANT = "//div[@class='user-manager__search mb15']/following-sibling::div/div/div[1]//p[@class='p5']";
    public static final String VIEW_DETAIL_ALL_ADMIN_DIV = "//div[contains(text(),'Tổng')]";
    public static final String VIEW_DETAIL_NEW_ADMIN = "//div[@class='user-manager__search mb15']/following-sibling::div/div/div[1]//p[@class='p5']";
    public static final String VIEW_DETAIL_ALL_MARKETING_STAFF_DIV = "//div[contains(text(),'Nhân viên thị trường')]";
    public static final String VIEW_DETAIL_NEW_MARKETING_STAFF = "//div[@class='user-manager__search mb15']/following-sibling::div/div/div[1]//p[@class='p5']";
    public static final String VIEW_DETAIL_ALL_WAREHOUSE_DIV = "//div[contains(text(),'Kho')]";
    public static final String VIEW_DETAIL_NEW_WAREHOUSE = "//div[@class='user-manager__search mb15']/following-sibling::div/div/div[1]//p[@class='p5']";
    public static final String STAFF_TAB_IN_DISTRIBUTOR_DETAIL = "//div[contains(text(),'Nhân viên')]";
    public static final String ADD_NEW_STAFF_BUTTON = "//p[text()=' Thêm mới nhân viên']";
    public static final String SEARCH_STAFF_INPUT = "//input[@placeholder='Tìm kiếm nhân viên']";
    public static final String SELECT_STAFF_CHECKBOX = "//div[text()='%s']//ancestor::div[@class='f aic border border-radius-m px1 mb1']//input";
    public static final String ADD_STAFF_BUTTON_IN_MODAL = "//div[contains(text(),'Thêm')]";

    // Product Page
    public static final String PRODUCT_BUTTON = "//img[@src='/_nuxt/img/product.d45d7f5.svg']";
    public static final String ADD_NEW_PRODUCT_BUTTON = "//div[@class='product-tab__search mb15']/button";
    public static final String PRODUCT_WAREHOUSE_TEXT = "//span[@class='h5']";
    public static final String PRODUCT_DESCRIPTION_TEXT_AREA = "//textarea[@placeholder='Nhập mô tả sản phẩm']";
    public static final String CATEGORY_INPUT = "//input[@placeholder='Chọn một danh mục']";
    public static final String PRODUCT_IMAGE = "//input[@type='file']";
    public static final String AVATAR_IMAGE = "//input[@type='file']";
    public static final String CATEGORY_INPUT_VALUE = "//li[contains(normalize-space(),'Khuyến mại tháng 5')]";
    public static final String ADD_ATTRIBUTE_BUTTON = "//span[@class='f aic jcc h6']";
    public static final String DELETE_ATTRIBUTE_BUTTON = "//button[@class='btn btn__color--danger btn__size--default out__line']";
    public static final String CANCEL_BUTTON = "//span[text()='Huỷ bỏ']";
    public static final String CREATE_NEW_BUTTON = "//span[text()='Tạo mới']";
    public static final String PRODUCT_NAME = "//p[contains(normalize-space(),'%s')]";
    public static final String PRODUCT_DETAIL = "//p[@class='p3 mb025']";
    public static final String EDIT_PRODUCT_BUTTON = "//button[contains(text(),'Điều chỉnh')]";
    public static final String PRODUCT_DETAIL_TEXT = "//span[contains(normalize-space(),'Chi tiết sản phẩm')]";
    public static final String CANCEL_EDIT_PRODUCT_BUTTON = "//span[text()='Huỷ bỏ']";
    public static final String CHANGE_STATUS_PRODUCT_LABEL = "//div[@class='label']";
    public static final String EXISTING_ATTRIBUTE_DIV = "//p[text()='Thuộc tính hiện có']/following-sibling::div[1]";
    public static final String ATTRIBUTE_VALUE_INPUT = "//input[@placeholder='Nhập giá trị thuộc tính']";
    public static final String SAVE_PRODUCT_BUTTON = "//span[text()='Lưu']";
    public static final String RETAIL_PRICE_INPUT = "//input[@placeholder='Nhập giá bán lẻ']";
    public static final String PER_BARREL_PRICE_INPUT = "//input[@placeholder='Nhập giá theo thùng']";
    public static final String NUMBER_OF_PRODUCTS_IN_ONE_BOX_INPUT = "//input[@placeholder='Nhập số lượng']";

    public static final String PRODUCT_STATUS_INACTIVE_TEXT = "//div[@class='px1 f aic jcb border']/p[2]";
    public static final String PRODUCT_STATUS_ACTIVE_TEXT = "//div[@class='px1 f aic jcb border']/p[2]";
    public static final String INFO_PRODUCT_INACTIVE_BUTTON = "//div[contains(text(),'Ngưng hoạt động')]";
    public static final String INFO_PRODUCT_ACTIVE_BUTTON = "//div[contains(text(),'Đang hoạt động')]";

    // Order Page
    public static final String ORDER_FOR_DISTRIBUTOR_BUTTON = "//p[text()='Đơn đặt hàng NPP']";
    public static final String ORDER_BUTTON = "//img[@src='/_nuxt/img/order.a9b922e.svg']";
    public static final String ADD_NEW_ORDER_BUTTON = "//div[@class='mb1 mt1']/button";
    public static final String ORDER_INFO_TEXT = "//span[@class='h5']";
    public static final String CHOOSE_STORE_BUTTON = "//input[@class='vs__search']";
    public static final String STORE_INPUT_VALUE = "//li[contains(normalize-space(),'Kho Cẩm Thượng')]";
    public static final String CHOOSE_PRODUCT_IN_STOCK_BUTTON = "//span[text()='Chọn sản phẩm trong kho sản phẩm']";
    public static final String ADD_PRODUCT_IN_EDIT_ORDER_BUTTON = "//button[@class='btn mb1 btn__color--primary btn__size--default']";
    public static final String SEARCH_PRODUCT_INPUT = "//input[@placeholder='Tìm kiếm sản phẩm']";
    public static final String CHOOSE_PRODUCT_CHECKBOX = "//div[@class='f aic border border-radius-m px1 mb1 cursor'][1]//input";
    public static final String CHOOSE_PRODUCT_ADD_NEW_CHECKBOX = "//div[text()=' Thạch rau câu phong cách Nhật Bản Kimikoko hihi 450g ']/parent::div/parent::div/div/div//input";
    public static final String CANCEL_PRODUCT_BUTTON = "//div[text()='Huỷ']";
    public static final String HELP_DESK_ICON = "//div[@class='helpdesk__icon up']";
    public static final String BELL_ICON = "//i[@class='v-icon bell']";
    public static final String CANCEL_HELP_DESK = "//div[@class='cursor']";
    public static final String ADD_BUTTON = "//button[@class='btn btn__color--primary btn__size--large']";
    public static final String DISTRIBUTOR_INPUT = "//input[@placeholder='Tìm kiến nhà phân phối']";
    public static final String SELECT_DISTRIBUTOR_DROPDOWN = "//p[text()='0369878795']";
    public static final String ADD_NOTE_TEXT = "//textarea[@placeholder='Nhập ghi chú']";
    public static final String CREATE_ORDER_BUTTON = "//span[text()='Tạo đơn']";
    public static final String LIST_PAGE_BUTTON = "//p[text()='Trang danh sách']";
    public static final String VIEW_DETAIL_ORDER_BUTTON = "//p[text()='Chi tiết đơn']";
    public static final String APPROVE_BUTTON = "//p[text()='Phê duyệt']";
    public static final String UPDATE_ORDER_BUTTON = "//span[text()='Cập nhật đơn hàng']";
    public static final String ORDER_SUCCESS_TEXT = "//p[text()='Xác nhận đơn hàng thành công']";
    public static final String CANCEL_ORDER_MODAL_SUCCESS_BUTTON = "//p[text()='Đóng']";
    public static final String PROCESSING_BUTTON = "//div[@class='f gap1 aic jcb mb05']/div[contains(normalize-space(),'Đã xác nhận')]";
    public static final String VIEW_DETAIL_BUTTON = "//div[@class='order-wrapper'][1]";
    public static final String WAITING_FOR_APPROVE_BUTTON = "//div[@class='nav-tab__title--head f aic jcs']//div[contains(text(),'Chờ phê duyệt')]";
    public static final String REFUSE_ORDER_BUTTON = "//p[text()='Từ chối']";
    public static final String NOTE_TEXT_AREA = "//textarea[@placeholder='Nhập vào đây']";
    public static final String CONFIRM_BUTTON = "//p[text()='Xác nhận']";
    public static final String FAILURE_BUTTON = "//div[@class='pl1 pr1 pt05 pb05 border-radius-m p5 status status-error']";
    public static final String DISTRIBUTOR_TEXT = "//div[@class='f ais jcc fdc']//p[@class='p3']";
    public static final String ENTER_NOTE_TEXT = "//div[@class='gray-5 ph1 pb1']//p[contains(text(),'LHETest')]";
    public static final String STORE_TEXT = "//span[contains(text(),'Kho Kiên NPP')]";
    public static final String PRODUCT_NAME_TEXT = "//div[@class='card-product__name f aic jcb cursor px1 w100']//p[@class='p3 mb025']";

    // User Management Page
    public static final String USER_MANAGEMENT_BUTTON = "//img[@src='/_nuxt/img/staff.de48d86.svg']";
    public static final String ADD_NEW_USER_MANAGEMENT_BUTTON = "//div[@class='user-manager__search mb15']/button";
    public static final String BACK_TO_LIST_DISTRIBUTOR_BUTTON = "//span[text()=' Quay lại trang chi tiết ']";
    public static final String ADD_DISTRIBUTOR_DIV = "//div[contains(text(),'Nhà phân phối')]";
    public static final String ADD_MARKETING_STAFF_DIV = "//div[contains(text(),'NV thị trường')]";
    public static final String ADD_ACCOUNTANT_DIV = "//div[contains(text(),'Kế toán')]";
    public static final String ADD_WAREHOUSE_DIV = "//div[contains(text(),'Kho')]";
    public static final String ADD_ADMIN_DIV = "//div[contains(text(),'Quản lý tổng')]";
    public static final String CANCEL_MARKETING_STAFF_BUTTON = "//div[@class='create-user-page__action bg-white f aic jcb px1 gap1 box-shadow-t'][2]//span[text()='Huỷ bỏ']";
    public static final String CANCEL_ACCOUNTANT_BUTTON = "//div[@class='create-user-page__action bg-white f aic jcb px1 gap1 box-shadow-t'][2]//span[text()='Huỷ bỏ']";
    public static final String CANCEL_WAREHOUSE_BUTTON = "//div[@class='create-user-page__action bg-white f aic jcb px1 gap1 box-shadow-t'][2]//span[text()='Huỷ bỏ']";
    public static final String DATE_OF_BIRTH_IN_USER_MANAGEMENT_INPUT = "//p[text()='Ngày sinh ']/parent::div/div//input";
    public static final String NAME_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Nhập họ và tên']";
    public static final String GENDER_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn Giới tính']";
    public static final String MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn TTHN']";
    public static final String PHONE_NUMBER_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Nhập số điện thoại']";
    public static final String DATE_RANGE_IN_USER_MANAGEMENT_INPUT = "//p[text()='Ngày cấp ']/parent::div/div//input";
    public static final String ISSUED_BY_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Nhập nơi cấp']";
    public static final String ADDRESS_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Nhập địa chỉ']";
    public static final String POSITION_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn chức vụ']";
    public static final String NATIONALITY_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn quốc tịch']";
    public static final String NATION_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn dân tộc']";
    public static final String REGION_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn vùng']";
    public static final String AREA_IN_USER_MANAGEMENT_INPUT = "//input[@placeholder='Chọn khu vực']";
    public static final String TIME_IN_IN_USER_MANAGEMENT_INPUT = "//p[text()='Thời gian vào ']/parent::div/div//input";
    public static final String NEXT_IN_USER_MANAGEMENT_BUTTON = "//div[@class='create-user-page__action bg-white f aic jcb px1 gap1 box-shadow-t'][2]//span[text()='Tiếp theo']";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_NAME = "//p[text()='Họ và tên ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_PHONE = "//p[text()='Số điện thoại ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_OF_BIRTH = "//p[text()='Ngày sinh ']/parent::div/div//p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ID_CARD = "//p[text()='CMT/CCCD ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_RANGE = "//p[text()='Ngày cấp ']/parent::div/div//p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ISSUE_BY = "//p[text()='Nơi cấp ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_SELECT_ADDRESS = "//p[text()='Địa chỉ ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_GENDER = "//p[text()='Giới tính ']/parent::div/div/p";
    public static final String ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_MARITAL_STATUS = "//p[text()='Tình trạng hôn nhân ']/parent::div/div/p";
    public static final String VALUE_GENDER_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs2__listbox']/li[1]";
    public static final String VALUE_MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs3__listbox']/li[1]";
    public static final String VALUE_POSITION_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs4__listbox']/li[1]";
    public static final String VALUE_NATIONALITY_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs7__listbox']/li[1]";
    public static final String VALUE_NATION_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs8__listbox']/li[1]";
    public static final String VALUE_REGION_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs5__listbox']/li[1]";
    public static final String VALUE_AREA_IN_USER_MANAGEMENT_INPUT = "//ul[@id='vs6__listbox']/li[1]";
    public static final String ACCOUNT_IN_USER_MANAGEMENT_TEXT = "//div[contains(text(),'Tài khoản nhân viên thị trường')]";
    public static final String ACCOUNT_IN_USER_MANAGEMENT_INPUT_TEXT = "//input[@placeholder='VD: Số điện thoại của bạn']";
    public static final String PASSWORD_IN_USER_MANAGEMENT_INPUT_TEXT = "//input[@placeholder='Nhập mật khẩu']";
    public static final String EMAIL_IN_USER_MANAGEMENT_INPUT_TEXT = "//input[@placeholder='Nhập email']";
    public static final String CREATE_IN_USER_MANAGEMENT_BUTTON = "//div[@class='create-user-page__container px1']/div/div[4]//span[text()='Tạo mới']";
    public static final String BACK_TO_MANAGEMENT_HOME_PAGE_BUTTON = "//button[@class='btn btn__color--primary btn__size--default']";
    public static final String VALUE_NATIONALITY_ACCOUNTANT_INPUT = "//ul[@id='vs5__listbox']/li[1]";
    public static final String VALUE_NATION_ACCOUNTANT_INPUT = "//ul[@id='vs6__listbox']/li[1]";
    public static final String ACCOUNT_ACCOUNTANT_TEXT = "//div[contains(text(),'Tài khoản Kế toán')]";
    public static final String ACCOUNT_WAREHOUSE_TEXT = "//div[contains(text(),'Tài khoản Kho')]";
    public static final String ACCOUNT_ADMIN_TEXT = "//div[contains(text(),'Tài khoản Tổng')]";
    public static final String WAREHOUSE_INPUT = "//input[@aria-autocomplete='list']";
    public static final String WAREHOUSE_DETAIL = "//li[contains(text(),'Kho Cẩm Thượng')]";
    public static final String APPROVE_BUTTON_IN_MODAL = "//div[@class='modal__footer confirm']//p[text()='Phê duyệt']";
    public static final String CLOSE_BUTTON_IN_MODAL = "//p[text()='Đóng']";

    //Edit
    public static final String EDIT_BUTTON = "//p[text()='Điều chỉnh']";
    public static final String NUMBER_OF_PRODUCT_INPUT = "//div[@class='border-2 bg-white input-custom border-radius-m f aic jcb']/div[1]//input";
    public static final String WAREHOUSE_INPUT_IN_EDIT = "//p[text()='Kho xuất']//following-sibling::div//input[@aria-autocomplete='list']";
    public static final String ADD_NEW_PRODUCT_BUTTON_IN_POPUP = "//div[@class='f jcb aic gap1 pt1 pb1 ph1']//div[contains(text(),'Thêm')]";
    public static final String SAVE_PRODUCT_BUTTON_IN_EDIT = "//p[text()='Lưu lại']";
    public static final String TRANSPORT_BUTTON = "//img[@src='/_nuxt/img/vanchuyen.2b29a9c.svg']";
    public static final String TRANSPORT_TITLE = "//span[contains(text(),'Quản lý chuyến hàng')]";
    public static final String ADD_SHIPMENT_BUTTON = "//button[@class='btn btn__color--primary btn__size--default']";
    public static final String DROPLIST_RANGE = "//span[@class='vs__selected']";
    public static final String INPUT_INTERNAL_CAR = "//li[@id='vs2__option-0']";
    public static final String DRIVE = "//input[@placeholder='Chọn người lái xe']";
    public static final String INPUT_DRIVE = "(//li[@class='vs__dropdown-option'])[1]";
    public static final String TRUCK = "//input[@placeholder='Chọn xe tải']";
    public static final String INPUT_TRUCK = "(//li[@class='vs__dropdown-option'])[1]";
    public static final String VOTE_BUTTON = "//button[@class='btn mt1 btn__color--primary btn__size--default']";
    public static final String VOTE_TITLE = "//span[contains(text(),'Chọn phiếu')]";
    public static final String BILL_BUTTON = "//button[@class='btn mt1 btn__color--primary btn__size--default']";
    public static final String BUTTON_DELIVERY_BILL = "//div[contains(text(),'Phiếu xuất')]";
    public static final String CHECKBOX_DELIVERY_BILL = "//input[@class='primary stick'][1]";
    public static final String BUTTON_ACCEPT = "//div[contains(text(),'Xác nhận')]";
    public static final String ADD_NEW = "//div[contains(text(),'Tạo mới')]";
    public static final String BUTTON_BACK = "//p[text()='Quay lại']";
    public static final String DETAIL_TRANSPORT_BUTTON = "(//span[text()='Xem chi tiết'])[1]";
    public static final String DRIVER_NAME = "//p[contains(text(),'Lái xe')]/following-sibling::div//span[@class='vs__selected']";
    public static final String TRUCK_NAME = "//p[contains(text(),'Xe tải')]/following-sibling::div//span[@class='vs__selected']";
    public static final String DETAIL_DRIVER_NAME = "//p[contains(text(),'Lái xe')]/following-sibling::span";
    public static final String DETAIL_TRUCK_NAME = "//p[contains(text(),'Xe tải')]/following-sibling::span";
    public static final String RANGE_OUT = "//li[contains(text(),'Xe ngoài')]";
    public static final String INPUT_BY_PLACEHOLDER = "//input[@placeholder='%s']";
    public static final String DETAIL_DRIVER_NAME_OUT = "//p[contains(text(),'Lái xe')]/following-sibling::span";
    //  Document Management Page
    public static final String DOCUMENT_MANAGEMENT = "//img[@src='/_nuxt/img/document.78474f2.svg']";
    public static final String DOCUMENT_TEXT = "//span[contains(text(),'Tài liệu')]";
    public static final String LIST_DOCUMENT_TEXT ="//p[contains(text(),'Danh sách tài liệu')]";
    public static final String GROUP_DOCUMENT_TEXT ="//p[contains(text(),'Nhóm tài liệu')]";
    public static final String CREATE_GROUP_BUTTON ="//button[@type='button']";
    public static final String INPUT_GROUP_NAME_FIELD ="//input[@placeholder='Nhập tên nhóm']";
    public static final String INPUT_NOTE_GROUP_DOCUMENT_FIELD ="//textarea[@placeholder='Nhập ghi chú']";
    public static final String CREATE_GROUP_DOCUMENT_BUTTON ="//div[contains(text(),'Xác nhận')]";
    public static final String CREATE_GROUP_DOCUMENT_TEXT ="//p[contains(text(),'Tạo nhóm tài liệu thành công')]";
    public static final String CONFIRM_GROUP_DOCUMENT_BUTTON ="//div[@class='modal__footer confirm h4']/button";
    public static final String CREATE_DOCUMENT_BUTTON ="//button[@type='button']";
    public static final String INPUT_DOCUMENT_NAME_FIELD ="//input[@placeholder='Nhập tên tài liệu']";
    public static final String DROP_LIST_GROUP_DOCUMENT_FIELD ="//div[@class='vs__selected-options']";
    public static final String SELECT_VALUE_DROP_LIST_GROUP_DOCUMENT_FIELD ="//li[contains(text(),'Nhóm tài liệu nè')]";
    public static final String FROM_DAY_DOCUMENT_FIELD ="//input[@placeholder='Từ ngày']";
    public static final String TO_DAY_DOCUMENT_FIELD ="//input[@placeholder='Đến ngày']";
    public static final String INPUT_NOTE_DOCUMENT_FIELD ="//textarea[@placeholder='Nhập ghi chú']";
    public static final String CREATE_DOCUMENT_BUTTON2 ="//div[contains(text(),'Xác nhận')]";
    public static final String DOCUMENT_IMG = "//input[@type='file']";
    public static final String CREATE_DOCUMENT_TEXT ="//p[contains(text(),'Tạo văn bản thành công')]";
    public static final String DOCUMENT_INFO_BUTTON = "//p[contains(text(),'Chi tiết')]";
    public static final String LIST_DOCUMENT_BUTTON = "//p[contains(text(),'Danh sách')]";
    public static final String DOCUMENT_NAME = "//p[contains(text(),'Tên tài liệu')]/following-sibling::p";
    public static final String GROUP_DOCUMENT_NAME = "//p[contains(text(),'Nhóm tài liệu')]/following-sibling::p";
    public static final String DETAIL_NOTE = "//p[contains(text(),'Ghi chú')]/following-sibling::p";
    public static final String APPROVE_DOCUMENT_BUTTON = "//div[contains(text(),'Phê duyệt')]";
    public static final String FROM_DAY_DOCUMENT_ENACT_FIELD ="//input[@placeholder='Chọn ngày']";
    public static final String ENACT_TO_FIELD ="//p[contains(text(),'Tất cả các vùng')]/preceding-sibling::div//input";
    public static final String ENACT_BUTTON ="//div[@class='h6' and contains(text(),'Ban hành')]";
    public static final String BACK_TO_LIST_DOCUMENT_BUTTON ="//button[@class='btn btn__color--default btn__size--default']";
    public static final String ERROR_MESSAGE_EMPTY_GROUP_DOCUMENT_BUTTON ="//p[contains(text(),'Vui lòng điền thông tin')]";
    public static final String ERROR_MESSAGE_CREATE_GROUP_DOCUMENT_BUTTON ="//p[contains(text(),'Tạo nhóm tài liệu không thành công.')]";
    public static final String ERROR_MESSAGE_GROUP_DOCUMENT_BACK_BUTTON ="//p[contains(text(),'Quay lại')]";
    public static final String FILTER_WAIT_ENACT ="//div[contains(text(),'Chờ ban hành')]";
    public static final String WAIT_ENACT ="(//div[@class='bg-light-yellow f jcc aic p5 border-radius-m yellow-2 px1'])[1]";
    public static final String ENACTING ="(//div[@class='bg-light-green f jcc aic p5 border-radius-m green-2 px1'])[1]";
    public static final String DELETE_DOCUMENT ="//div[contains(text(),'Xóa tài liệu')]";
    public static final String MESSAGE_DELETE_DOCUMENT ="//p[contains(text(),'Xoá văn bản thành công')]";
    public static final String CANCEL_ENACT_DOCUMENT ="//div[contains(text(),'Hủy ban hành')]";
    public static final String FILTER_ENACTING ="//div[contains(text(),'Đang ban hành')]";
    public static final String MESSAGE_CANCEL_ENACT_DOCUMENT ="//p[contains(text(),'Huỷ ban hành bản thành công.')]";
    public static final String TAB_DRIVER = "//div[contains(text(),'Tài xế')]";
    public static final String DRIVER_TITLE = "//span[contains(text(),'Quản lý tài xế')]";
    public static final String ADD_DRIVER_BUTTON = "//span[contains(text(),'Tạo mới lái xe')]";
    public static final String DRIVER_IMAGE = "//input[@type='file']";
    public static final String SAVE_DRIVER_BUTTON = "//p[text()='Lưu']";
    public static final String MESSAGE_POPUP_ERROR = "//p[text()='Tạo tài xế không thành công.']";
    public static final String MESSAGE_POPUP_SUCCESS = "//p[text()='Tạo tài xế thành công']";
}
