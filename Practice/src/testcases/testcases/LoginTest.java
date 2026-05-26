package testcases;


import org.testng.annotations.Test;

import org.testng.Assert;
import pages.BaseClass;
import pages.LoginPage;
import utils.DataProvided;

public class LoginTest extends BaseClass{
	
	
	@Test (dataProvider = "LoginData", dataProviderClass = DataProvided.class)
    public void loginTest(String username, String password, boolean isValid) {
		
		System.out.println(username + " | " + password);

        driver.get("https://www.saucedemo.com/");

        LoginPage lp = new LoginPage(driver);

        lp.enterUsername(username);
        lp.enterPassword(password);
        lp.clickLogin();

        // ✅ Assertion (Validation)
        if (isValid) {
            // ✅ Positive scenario
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.saucedemo.com/inventory.html";

            Assert.assertEquals(actualUrl, expectedUrl, "Valid login failed!");
        } else {
            // ✅ Negative scenario
            Assert.assertTrue(lp.isErrorDisplayed(), "Error message not displayed for invalid login!");
        }
        
	}
	
	
	
}
	


