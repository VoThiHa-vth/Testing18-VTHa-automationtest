package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ParallelBaseTest {
//  để chjay song song các testcase thì dug object ThreadLocal
    private static ThreadLocal <WebDriver> drive = new ThreadLocal<>();
    private static ThreadLocal <WebDriverWait> wait = new ThreadLocal<>();
    
    protected WebDriver getDrive(){
        return drive.get();
    }
    
    protected WebDriverWait getWait(){
        return wait.get();
    }
    
    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver d = new ChromeDriver(options);
        drive.set(d);

        WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(30));
        wait.set(w);
    }

    @AfterMethod
    public void  tearDown(){
        if (drive.get() != null){
            drive.get().quit();
            drive.remove();
            wait.remove();
        }
    }


}
