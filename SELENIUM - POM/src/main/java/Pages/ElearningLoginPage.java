package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElearningLoginPage extends BasePage{
    private static final By TAIKHOAN_INPUT = By.xpath("//div[contains(@class,'sign-in-container')]//input[@name='taiKhoan']");
    private static final By MATKHAU_INPUT = By.xpath("//div[contains(@class,'sign-in-container')]//input[@name='matKhau']");
    private static final By LOGIN_BTN = By.xpath("//div[contains(@class,'sign-in-container')]//button[text()='Đăng nhập']");

    public ElearningLoginPage (WebDriver drive, WebDriverWait wait){
        super(drive,wait);
    }

    public void open(){
        driver.get("https://demo2.cybersoft.edu.vn/login");

        wait.until(ExpectedConditions.visibilityOfElementLocated(TAIKHOAN_INPUT));
    }

    public void login(String taiKhoan, String matKhau){
        WebElement taiKhoanInput = driver.findElement(TAIKHOAN_INPUT);
        taiKhoanInput.sendKeys(taiKhoan);

        WebElement matKhauInput = driver.findElement(MATKHAU_INPUT);
        matKhauInput.sendKeys(matKhau);

        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        loginBtn.click();
    }


}
