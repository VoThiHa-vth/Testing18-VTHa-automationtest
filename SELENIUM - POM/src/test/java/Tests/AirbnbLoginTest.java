package Tests;

import Pages.AirbnbLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirbnbLoginTest extends ParallelBaseTest {

    @Test(description = "Login success")
    public void testLoginSuccess () throws InterruptedException{
        AirbnbLoginPage loginPage = new AirbnbLoginPage(getDrive(),getWait());
        loginPage.open();
        loginPage.login("admin@gmail.com", "123456");

        Thread.sleep(3000);
        Assert.assertTrue(loginPage.isSuccessLogin());
    }
}
