package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChromeDriver  {
	
	WebDriver driver;
	
	 // Constructor
    public ChromeDriver(WebDriver driver) {
    	
    	 this.driver = driver;
    	
	    }
    
 // 🔔 Alert Handling
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    // 🖼️ Frame Handling
    public void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    // 🪟 Window Handling
    public void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            driver.switchTo().window(win);
            if (driver.getTitle().equals(windowTitle)) {
                break;
            }
        }
    }
    
    
    }



