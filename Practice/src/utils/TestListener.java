package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BaseClass;

public class TestListener implements ITestListener{
	
	ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;
    
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
        test = extent.createTest(result.getName());
    
    }

	@Override 
	
	public void onTestSuccess(ITestResult result) {

        String testName = result.getName();
        
        // 👉 Get driver from BaseClass
        WebDriver driver = BaseClass.driver;

        // Screenshot capture
        ScreenshotUtil.captureScreenshot(driver, testName + "_PASS");

        System.out.println("✅ Screenshot taken for PASS: " + testName + System.currentTimeMillis() + ".png");
    }
	
	@Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName();

        WebDriver driver = BaseClass.driver;

        ScreenshotUtil.captureScreenshot(driver, testName + "_FAIL");

        System.out.println("❌ Screenshot taken for FAIL: " + testName);
    }
	
	@Override
    public void onFinish(ITestContext context) {
        System.out.println("Flushing report...");
        extent.flush();
    }
}
	
	
