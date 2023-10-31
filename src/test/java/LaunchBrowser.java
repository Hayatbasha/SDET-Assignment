import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://www.automationanywhere.com");
        WebElement logo = driver.findElement(By.xpath("//img[@class=\"coh-image coh-image-responsive-xl\" and @alt=\"Automation Anywhere\"]"));
        System.out.println(logo.isDisplayed());
        WebElement demoBtn = driver.findElement(By.xpath("//a[@title =\"Request Demo\" and @target=\"_self\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
        System.out.println(demoBtn.isDisplayed());
        demoBtn.click();
    }
}
