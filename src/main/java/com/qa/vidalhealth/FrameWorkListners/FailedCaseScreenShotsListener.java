package com.qa.vidalhealth.FrameWorkListners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.vidalhealth.Base.TestBase;

public class FailedCaseScreenShotsListener extends TestBase implements ITestListener {
	
	
	
	
	//WebDriver driver=null;
		
	//EventFiringWebDriver eventFiringWebDriver;
		String filePath = "E:\\SCREENSHOTS\\";
		//E:\SCREENSHOTS
	  // @Override
		
	    public void onTestFailure(ITestResult result) {
	    	//driver= new ChromeDriver();
	    	System.out.println("*******driver*****"+driver);
	    	System.out.println("***** Error "+result.getName()+" test has failed *****");
	    	String methodName=result.getName().toString().trim();
	    	System.out.println("*******methodName*****"+methodName);
	        ITestContext context = result.getTestContext();
	        System.out.println("*****context*******"+context);
	       //  WebDriver driver = (WebDriver)context.getAttribute("driver");
	         System.out.println("*******driverrr*****"+driver);
	    	takeScreenShot(methodName, driver);
	    	takeScreenshot(methodName);
	    }
	    
	    //VIJAY
	public  void takeScreenshot(String screenName) {
			
			Date date = new Date(System.currentTimeMillis());
	         String dateString = date.toString();
	         dateString = dateString.replaceAll("[^a-zA-Z0-9]", "");
			
			eventFiringWebDriver = new EventFiringWebDriver(driver);
			File f1 = eventFiringWebDriver.getScreenshotAs(OutputType.FILE);
			File f2 = new File("E:\\SVN-V3-automation\\Automation\\SCREENSHOTS\\FAILED-TESTCASES-SCREENSS\\"+ screenName +" - "+ dateString +".png");
			
			//System.out.println(f2);
			//File f2 = new File("E:\\SVN-V3-automation\\Automation\\SCREENSHOTS\\"+ screenName + dateString +".png");
			
			try {
				FileUtils.copyFile(f1, f2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	    //VIJAY
	    
	    public void takeScreenShot(String methodName, WebDriver driver) {
	    	
	    	Date date = new Date(System.currentTimeMillis());
	         String dateString = date.toString();
	         dateString = dateString.replaceAll("[^a-zA-Z0-9]", "");
			
	    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         //The below method will save the screen shot in d drive with test method name 
	            try {
					FileUtils.copyFile(scrFile, new File(filePath+methodName+dateString+".png"));
					System.out.println("***Placed screen shot in "+filePath+" ***");
				} catch (IOException e) {
					e.printStackTrace();
				}
	    }
		public void onFinish(ITestContext context) {}
	  
	    public void onTestStart(ITestResult result) {   }
	  
	    public void onTestSuccess(ITestResult result) {   }

	    public void onTestSkipped(ITestResult result) {   }

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

	    public void onStart(ITestContext context) {   }
	}  


