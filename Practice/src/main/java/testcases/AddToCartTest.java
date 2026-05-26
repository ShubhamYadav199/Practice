package testcases;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseClass {
	
	@Test 
	
	public void addcardtest ( ) throws InterruptedException { 
		
		
		
		Thread.sleep(3000);
		
		//Login page
		
		LoginPage lp =new LoginPage (driver);
		
		lp.enterUsername("standard_user");
		Thread.sleep(2000);
		lp.enterPassword("secret_sauce");
		lp.clickLogin();
		Thread.sleep(2000);
		
	
//		ChromeDriver Alerts =new ChromeDriver (driver);
//		Alerts.acceptAlert();
//		Thread.sleep(2000);
		
		
		// Add to cart
		InventoryPage product =new InventoryPage(driver);
		product.InventoryPageaction();
		Thread.sleep(3000);
		
	}

}
