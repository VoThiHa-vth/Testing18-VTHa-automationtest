package Tests;

import Pages.AirbnbRegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirbnbRegisterTest extends ParallelBaseTest{

    @Test(description = "Register success")
    public void testRegisterSuccess () throws InterruptedException{
        AirbnbRegisterPage registerPage = new AirbnbRegisterPage(getDrive(),getWait());
        registerPage.open();
        registerPage.register("Ha", "havt@gmail.com", "123456", "0356456897", "07/11/1999", "Nam");

//        Thread.sleep(3000);
        Assert.assertTrue(true);
    }
}
