package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		
        this.driver = driver;
        
       // ✅ VERY IMPORTANT
        PageFactory.initElements(driver, this);
    }
	

    // Product Name
    @FindBy (xpath="//div[@id='contents_wrapper']/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    WebElement ProductName;
    
    @FindBy (xpath="//div[@id='shopping_cart_container']")
    WebElement AddToCard;
    
    @FindBy (xpath="//button[@name='continue-shopping']")
    WebElement CardLink;
    
    
    public void InventoryPageaction() throws InterruptedException {
    	
    	ProductName.click();
    	Thread.sleep(2000);
    	AddToCard.click();
    	Thread.sleep(5000);
    	CardLink.click();
    	
    	
    	
    }
    
    

}
