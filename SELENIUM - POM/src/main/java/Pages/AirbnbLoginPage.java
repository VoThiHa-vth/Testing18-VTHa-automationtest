package Pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirbnbLoginPage extends BasePage{

    private static final By AVATAR_IMG = By.xpath("//img[@class='h-10']");
    private static final By LOGIN_BTN = By.xpath("(//button[text()='Đăng nhập'])[1]");
    private static final By INPUT_USERNAME = By.id("email");
    private static final By INPUT_PASSWORD = By.id("password");
    private static final By LOGIN_BTN_FORM = By.xpath("//button[@type='submit' and text() ='Đăng nhập']");
    private static final By SUCCESS_TOAST = By.xpath("//div[@class='ant-message-notice-content']");

    public AirbnbLoginPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void open(){
            driver.get("https://demo5.cybersoft.edu.vn/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(AVATAR_IMG));
    }

    public void login(String username, String password) {
//  Vì hàm open() đã tìm AVATAR_IMG => chắc chắn sẽ có locator đó trên giao diện => dùng findElement
        WebElement avatarImg = driver.findElement(AVATAR_IMG);
        avatarImg.click();

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BTN));
        loginBtn.click();

        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);

        WebElement loginBtnForm = driver.findElement(LOGIN_BTN_FORM);
        loginBtnForm.click();

    }

    public boolean isSuccessLogin(){
        WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
        return successToast.isDisplayed();
    }


}
