package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
// Cách 1:   <a data-v-6475d26d="" class="oxd-main-menu-item active toggle" href="/web/index.php/admin/viewAdminModule">
    private static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
// Cách 2: tìm theo span: //span[text()='Admin']
// Cách 3: //a[.//span[text()='Admin']]
    // Thẻ //a => tìm tất cả các thẻ a có trong page
    // chính thẻ <a> đang xét
    //  .//span => tìm tất cả các thẻ span có trong thẻ a
    private static final By ADMIN_HEADER = By.xpath("//h6[text()='Admin']");
    private static  final By USER_DROPDOWN = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private static  final By LOGOUT_BTN = By.xpath("//a[@href='/web/index.php/auth/logout']");

    public DashboardPage (WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent() throws InterruptedException {
        boolean checkLocators = true;

        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        if (!menuAdmin.isDisplayed()){
            checkLocators = false;
            System.out.println("Khong tim thay locators menuAdmin");
            return checkLocators;
        }

        menuAdmin.click();

//        WebElement adminHeader = driver.findElement(ADMIN_HEADER);
        WebElement adminHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(ADMIN_HEADER));
        if (!adminHeader.isDisplayed()){
            checkLocators = false;
            System.out.println("Khong tim thay locators adminHeader");
        }
        Thread.sleep(2000);
        return checkLocators;
    }

    public void logout(){
        WebElement userDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(USER_DROPDOWN));
        userDropdown.click();
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(LOGOUT_BTN));
        logoutBtn.click();
    }







}
