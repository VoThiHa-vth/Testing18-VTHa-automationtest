package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
// Cách 1:   <a data-v-6475d26d="" class="oxd-main-menu-item active toggle" href="/web/index.php/admin/viewAdminModule">
    private static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
// Cách 2: tìm theo span: //span[text()='Admin']
// Cách 3: //a[.//span[text()='Admin']]
    // Thẻ //a => tìm tất cả các thẻ a có trong page
    // chính thẻ <a> đang xét
    //  .//span => tìm tất cả các thẻ span có trong thẻ a

    public DashboardPage (WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent(){
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        return menuAdmin.isDisplayed();
    }
}
