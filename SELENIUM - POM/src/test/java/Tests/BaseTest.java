package Tests;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.time.Duration;

// BaseTest là class để thiết lập môi trường chạy test
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

// hàm setUp môi trường test
// thêm key BeforeMethod để chạy hàm này trước khi chạy test
    @BeforeMethod(alwaysRun = true)
    public void setUp (){
        WebDriverManager.chromedriver().setup();
// cấu hình giao diện cho chrome:
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Tat cai dong Chrome is automated.....
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options);
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

// hàm tearDown môi trường sau khi chạy test
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
// Vì các page con đều cần login trước => nên cần define function login ở trong class cha

    protected void loginAsAdmin () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        wait.until(ExpectedConditions.urlContains("dashboard"));


    }
}
