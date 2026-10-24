package Tests;

import Pages.DashboardPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    @Test(description = "Find locators")
    public void findLocator() throws InterruptedException {
// pre-condition: phải login trước rồi mới vào dashboard được
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.open();
        loginPage.login("Admin", "admin123");

// vì từ page login qua page dashboard sẽ có khoảng thời gian đợi các element xuất hiện trên các trang dashboard
// cần tìm điều kiện để waiting
//        Thread.sleep(10_000);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        // đợi xuất hiện 1 trong các element xuất hiện thì bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));

        DashboardPage dashboardPage = new DashboardPage(driver, wait);
        Assert.assertTrue(dashboardPage.isElementPresent());
    }
}
