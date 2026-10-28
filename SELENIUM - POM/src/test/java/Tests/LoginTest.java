package Tests;

import Pages.LoginPage;
import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class LoginTest extends  BaseTest{
    record LoginData(String username, String password, boolean success ){}

//  @DataProvider: Testng lấy thng tin data rồi sẽ chạy test cho data đó
// Bước 1: Viết function đọc data dạng .json
// Bước 2: Load data vào trong testcase
// ----- Thực hành như dưới:

// Bước 1: Viết function đọc data dạng .json
    // Dạng Object[][] là data type mà testng hiểu được

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider(){
        // Đọc file .json
        InputStreamReader reader = new InputStreamReader(
                Objects.requireNonNull(LoginTest.class.getResourceAsStream("/login-data.json"))
        );
    // Gson: biến json thành dạng object LoginData
        LoginData[] list = new Gson().fromJson(reader, LoginData[].class);
    // Data mẫu như sau:
        // Admin admin123 true
        // Admin fail_pass fail
        // fail_user fail_pass fail
        Object[][] dataLogin = new Object[list.length][1];
        for (int i = 0; i < list.length; i++)
            // i de
            dataLogin[i][0] = list[i];
        return dataLogin;
    }
// Bước 2: Load data vào trong testcase

    @Test(dataProvider = "loginData")
    public void testLoginData(LoginData data) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(data.username(), data.password());

        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), data.success());
    }


    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
// tạo đối tượng LoginPage
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));

// so sánh expected với actual
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard")); // Kiểm tra pass với "dashboard vì sau login thành công vào thẳng dashboard

    }
}
