package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class configerclass {
	
	
	Properties prop;
	
	public configerclass() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public String getUrl() {
		String value = prop.getProperty("Url");
		
		if (value !=null)
			return value;
		else
			throw new RuntimeException("url not mention in config file");
		
	}

}
