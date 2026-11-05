1/ ADMIN_MENU: private static  final By ADMIN_MENU = By.xpath("//span[text()='Admin']");

2/ PIM_MENU: private static  final By PIM_MENU = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");

3/ LEAVE_MENU: private static  final By LEAVE_MENU = By.xpath("//span[text()='Leave']");

4/ USERNAME_INPUT: private static  final By USERNAME_INPUT = By.xpath("//div[contains(@class, 'oxd-input-group')][.//label[text()='Username']]//input");

5/ USERROLE_DROPDOWN: private static  final By USERROLE_DROPDOWN = By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']");

6/ USERROLE_ADMIN: private static  final By USERROLE_ADMIN = By.xpath("//div[@class='oxd-select-option']//span[text()='Admin']");

7/ USERROLE_ESS: private static  final By USERROLE_ESS = By.xpath("//div[@class='oxd-select-option']//span[text()='ESS']");

8/ EMPLOYEE_INPUT: private static  final By EMPLOYEE_INPUT = By.xpath("//input[@placeholder='Type for hints...']");

9/ RESET_BTN: private static  final By RESET_BTN = By.xpath("//button[text()=' Reset ']");

10/ SEARCH_BTN: private static  final By SEARCH_BTN = By.xpath("//button[text()=' Search ']");
Hoặc: private static  final By SEARCH_BTN = By.xpath("//button[@type='submit']");

11/ USERMANAGEMENT_TOP: private static  final By USERMANAGEMENT_TOP = By.xpath("//ul[@role='menu']//a[contains(text(),'User Management ')]");

12/ USER2_BALA22: private static  final By USER2_BALA22 = By.xpath("(//div[@class='oxd-table-body']//div[text()='bala22'])[1]");

13/ USERROLE2_ESS: private static  final By USERROLE2_ESS = By.xpath("(//div[@class='oxd-table-body']//div[text()='ESS'])[1]");

14/ DELETE2_BTN: private static  final By DELETE2_BTN = By.xpath("(//div[@role='row']//i[contains(@class, 'bi-trash')])[2]");

15/ EDIT2_BTN: private static  final By EDIT2_BTN = By.xpath("(//div[@class='oxd-table-body']//i[contains(@class, 'bi-pencil-fill')])[2]");

16/ USERROLE_HEADER_TABLE:
private static  final By USERROLE_HEADER_
TABLE = By.xpath("//div[@role='columnheader'][text()='User Role']");

17/ EMPLOYEE_HEADER_TABLE:
private static  final By EMPLOYEE_HEADER_
TABLE = By.xpath("//div[@role='columnheader'][text()='Employee Name']");

18/ADMIN_HEADER:
private static final By ADMIN_HEADER = By.xpath("//div[@class='oxd-topbar-header-title']//h6[text()='Admin']");

19/ COLLAPSE_SIDEBAR_BTN:
private static final By COLLAPSE_SIDEBAR_BTN = By.xpath("//i[@class='oxd-icon bi-chevron-left']");

20/ COLLAPSE_PANEL_BTN:
private static final By COLLAPSE_PANEL_BTN = By.xpath("//i[@class='oxd-icon bi-caret-up-fill']");

21/ ADD_BTN:
private static final By ADD_BTN = By.xpath("//button[text()=' Add ']");