package Tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest{

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
// tạo đối tượng LoginPage
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login("Admin", "admin123");

// so sánh expected với actual
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard")); // Kiểm tra pass với "dashboard vì sau login thành công vào thẳng dashboard

    }
}
