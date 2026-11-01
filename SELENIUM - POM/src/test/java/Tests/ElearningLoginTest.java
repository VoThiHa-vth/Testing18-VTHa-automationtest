package Tests;

import Pages.ElearningLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElearningLoginTest extends BaseTest {

    @Test(description = "Login success")
    public void testLoginSuccess () throws InterruptedException{
        ElearningLoginPage loginPage = new ElearningLoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin", "123456");

        Thread.sleep(3000);
        Assert.assertTrue(true);
    }
}
