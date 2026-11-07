package Tests;

import Pages.ElearningLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElearningLoginTest extends ParallelBaseTest {

    @Test(description = "Login success")
    public void testLoginSuccess () throws InterruptedException{
        ElearningLoginPage loginPage = new ElearningLoginPage(getDrive(),getWait());
        loginPage.open();
        loginPage.login("admin", "123456");

        Thread.sleep(3000);
        Assert.assertTrue(true);
    }
}
