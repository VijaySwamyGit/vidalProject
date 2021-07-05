package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\old system's-D drive data\\OTHERS\\Vahak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//
	    
		driver.get("https://www.worldometers.info/world-population/india-population/");
		
		List<WebElement> popuList = driver.findElements(By.xpath("//div[@class='maincounter-number']"));
		
		while(true)
		{
		
		for(WebElement ele:popuList)
		{
			System.out.println(ele.getText());
		}
		}
	}

}
