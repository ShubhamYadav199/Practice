package utils;

import org.testng.annotations.DataProvider;

public class DataProvided {
	
	
	@DataProvider(name="LoginData")
	
	public Object[][] getLoginData (){
		
		return new Object[][] {
			
			{"standard_user", "secret_sauce", true},
	//		{"user2", "pass2", false},
	//		{"user3", "pass3", false}
			
		};
		
	}
	

}
