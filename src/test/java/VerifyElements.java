import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;


public class VerifyElements {
public WebDriver driver;
public String baseUrl= "https://www.automationanywhere.com";
    @BeforeTest
    public void intializeBrowser(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }
        @Test(enabled = false)
                public void verifyElements(){
            driver.get(baseUrl);
            List<WebElement> list= driver.findElements(By.xpath("//ul[@class=\"coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d\"]/li"));
            System.out.println(list.size());
            for (WebElement ele:list
            ) {
                System.out.println(ele.getText());
            }
            WebElement products =  driver.findElement(By.xpath("//a[@href=\"/products\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
            products.click();
           String title = driver.getTitle();
            Assert.assertEquals(title,"Scale Your Business with Enterprise Automation | AutomationAnywhere.com");
            driver.navigate().back();
            WebElement beyondrpa = driver.findElement(By.xpath("//a[@href=\"/rpa/robotic-process-automation\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
            beyondrpa.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
            WebElement aboutus = driver.findElement(By.xpath("//a[@href=\"/company/about-us\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
            aboutus.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
            WebElement resources = driver.findElement(By.xpath("//a[@href=\"https://www.automationanywhere.com/resources\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
            resources.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
            WebElement solutions=  driver.findElement(By.xpath("//a[@href=\"/solutions\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
            solutions.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();

        }


      @AfterTest
              public void tearDown(){
          driver.quit();
      }


    }


