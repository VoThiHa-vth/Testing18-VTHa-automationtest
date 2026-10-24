package Pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends  BasePage{
// input:
//      data-v-7b563373=""
//      class="oxd-input oxd-input--active"
//      name="username" placeholder="Username" autofocus="">



// xpath: rule để tìm locator trên website
// input:tìm tất cả các thẻ input trong page
// input[@name='username'] => tìm tất cả các th input có thuộc tính name với value là nameuser
// input[@name='username']
    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

// Step1: truy cập vào page Login
    public void open(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
// fix thêm cho case Web hiển thị lâu
// đợi có điều kiện =>> đợi xuất hiện thẻ input
    wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }

// Step2: Login
// enterUsername, enterpassword, clickLoginBtn
// Có 2 cách viết:
//      + Cách 1: Tách từng step thành từng function
//              Ưu điểm: Dễ dàng thêm log kiểm tra, dễ sửa chữa fix bug

//      + Cách 2:  gôm các step chung 1 function. Cách viết như dưới:
    public void login(String username){
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);
    }


}
