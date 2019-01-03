package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestHome {
    WebDriver driver =null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\farha\\\\Documents\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com");
    }

    @Test
    public void test() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("books");
    }
   @Test
            public void pageContent() {
       driver.findElement(By.id("pageContent")).click();
   }
     @Test
             public void test1() {
        driver.findElement(By.className("nav-a")).click();
     }
     @Test
             public void search() {
         driver.findElement(By.className("nav-input"));
     }

    @AfterMethod
        public void tearDown(){
            driver.quit();
        }

    }


