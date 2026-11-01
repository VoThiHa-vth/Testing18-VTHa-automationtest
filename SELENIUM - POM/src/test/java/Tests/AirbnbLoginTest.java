package Tests;

import Pages.AirbnbLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirbnbLoginTest extends BaseTest {

    @Test(description = "Login success")
    public void testLoginSuccess () throws InterruptedException{
        AirbnbLoginPage loginPage = new AirbnbLoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin@gmail.com", "123456");

        Thread.sleep(3000);
        Assert.assertTrue(loginPage.isSuccessLogin());
    }
}
