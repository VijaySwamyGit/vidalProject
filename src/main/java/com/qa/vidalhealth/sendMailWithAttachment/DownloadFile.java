package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.vidalhealth.Util.TestUtil;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SVN-V3-automation\\Automation\\Driverserver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		//Launching sample website
		driver.get("https://chromedriver.chromium.org/downloads");
		driver.manage().window().maximize();
		
		String fileDownloadPath = "E:\\old system's-D drive data\\OTHERS";
		//WebElement dsDownload = driver.findElement(By.linkText("ChromeDriver 85.0.4183.38"));
		
		Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		  
		  ChromeOptions option = new ChromeOptions();
		  
		  option.setExperimentalOption("prefs", prefsMap);
		  option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		  
		//  WebDriver driver  = new ChromeDriver(option);
		  //driver.get("https://www.seleniumhq.org/download/");
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  driver.manage().window().maximize();
	  	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	  //driver.findElement(By.linkText("64 bit Windows IE")).click();
	  	driver.findElement(By.linkText("ChromeDriver 85.0.4183.38")).click();
		Set<String> windows = driver.getWindowHandles();
	   	Iterator<String> itr = windows.iterator();

	   	//patName will provide you parent window
	   	String patName = itr.next();
	  
	   	//chldName will provide you child window
	   	String chldName = itr.next();
	   	
	   	//Switch to child window
	   	driver.switchTo().window(chldName);


	   //	return chldName;
	  	driver.findElement(By.linkText("chromedriver_win32.zip")).click();
	  	
	  	//driver.f
	  	  System.out.println("Downloaded");
	  	  driver.close();
		
		

	}

}
