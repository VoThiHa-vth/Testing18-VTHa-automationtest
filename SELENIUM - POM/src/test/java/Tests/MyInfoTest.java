package Tests;

import Pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest{

    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAsAdmin();
    }

    @Test(description = "Upload avatar")
    public void uploadAvatar() throws InterruptedException {
        MyInfoPage myInfoPage = new MyInfoPage(driver,wait);
        myInfoPage.open();
        myInfoPage.uploadAvatar("logo.png");

        Assert.assertTrue(myInfoPage.isSuccessUpload());
    }



}
