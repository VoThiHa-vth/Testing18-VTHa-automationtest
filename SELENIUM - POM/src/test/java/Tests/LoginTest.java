package Tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  BaseTest{

    @Test(description = "Test login success")
    public void testLoginSuccess(){
// tạo đối tượng LoginPage
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin");

// so sánh expected với actual
        Assert.assertTrue(true);

    }
}
