package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver ;
    
    @BeforeMethod   // ⭐ VERY IMPORTANT
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	driver.manage().window().maximize();
        
    	driver.get("https://www.saucedemo.com/"); // ✅ here
    }
    
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
    
   
    	
    	
    }
    
  
