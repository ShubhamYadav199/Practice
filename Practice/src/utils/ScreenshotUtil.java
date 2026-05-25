package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	
	public static String captureScreenshot (WebDriver driver, String testname) {
		
	
	TakesScreenshot ts = (TakesScreenshot) driver;
    File src = ts.getScreenshotAs(OutputType.FILE);

    String path = System.getProperty("user.dir") + "/screenshots/" + testname + ".png";
    File dest = new File(path);
    
 // ✅ IMPORTANT: create folder if not exists
    dest.getParentFile().mkdirs();

    try {
        FileUtils.copyFile(src, dest);
    } catch (IOException e) {
        e.printStackTrace();
    }

    return path;
 }
	
}


