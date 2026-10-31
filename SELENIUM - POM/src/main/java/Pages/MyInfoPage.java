package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MyInfoPage extends BasePage {
    private static final By AVATAR_IMG = By.xpath("//img[@class='employee-image']");

    private static final By UPLOAD_BTN = By.xpath("//button[contains(@class,'employee-image')]");

    private static final By FILE_INPUT = By.xpath("//input[@type='file']");

    private static final By SAVE_BTN = By.xpath("//button[@type='submit']");

    private static final By SUCCESS_TOAST = By.id("oxd-toaster_1");

    public MyInfoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

// Để vào page MyInfo => có 2 cách:
    // Cách 1: Truy cập vào page với đường dẫn của page đó
    // Cách 2: Clcik vào nút MyInfo

    public void open() throws InterruptedException {
        By myInfoLocator = By.xpath("//span[text()='My Info']");
        WebElement myInfoMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(myInfoLocator));
        myInfoMenu.click();
    }

    public  void uploadAvatar (String imageName) throws InterruptedException {

//  sau khi click xong menu thì phải đợi xuất hiện AVATAR_IMG
//       elementToBeClickable: Vì avatarImg có thể click được
        WebElement avatarImg = wait.until(ExpectedConditions.elementToBeClickable(AVATAR_IMG));
        avatarImg.click();

        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(UPLOAD_BTN));
        uploadBtn.click();

        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(FILE_INPUT));

// LƯU Ý: Vì inputFile Selenium không thể thao tác trực tiếp để tìm file hình
// => Cần dùng sendKeys để truyền đường dẫn tuệt đối của hih cần upload
// => TIPS: Lưu hình vào trong project

        String filePath = new File("src/test/resources/images/" + imageName).getAbsolutePath();
        fileInput.sendKeys(filePath);
        Thread.sleep(2000);

        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(SAVE_BTN));
        saveBtn.click();

    }

    public boolean isSuccessUpload(){
        WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
        return successToast.isDisplayed();
    }










}

//    setTimeout(() => { debugger }, 5000);
//<div data-v-40acfd38="" data-v-13cf171c="" role="listbox" class="oxd-select-dropdown --positon-bottom" loading="false"><div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option">-- Select --</div><div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option"><span data-v-13cf171c="">Admin</span></div><div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option"><span data-v-13cf171c="">ESS</span></div></div>
//<div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option">-- Select --</div>
//<div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option"><span data-v-13cf171c="">Admin</span></div>
//<div data-v-d130bb63="" data-v-13cf171c="" role="option" class="oxd-select-option"><span data-v-13cf171c="">ESS</span></div>
//


