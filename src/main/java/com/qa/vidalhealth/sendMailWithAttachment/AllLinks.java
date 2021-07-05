package com.qa.vidalhealth.sendMailWithAttachment;



	import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AllLinks {
		
		public static void main(String[] args){
			System.setProperty("webdriver.chrome.driver","E:\\SVN-V3-automation\\Automation\\Driverserver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//RemoteWebDriver driver = new ChromeDriver();
			//driver
			//Launching sample website
			driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
			driver.manage().window().maximize();
			
			//Get list of web-elements with tagName  - a
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			
			//Traversing through the list and printing its text along with link address
			for(WebElement link:allLinks){
				//link.is
				System.out.println(link.getText() + " --- " + link.getAttribute("href"));
			}
			
			
			/*//Traversing through the list and printing its text along with link address using iterator()
			Iterator<WebElement> itr=allLinks.iterator();
			while(itr.hasNext())
			{
				WebElement webelement =itr.next();
				String text = webelement.getText();
				String href = webelement.getAttribute("href");
				System.out.println(text + " --- " + href);
			}*/
			
			//Commenting driver.quit() for user to verify the links printed
			//driver.quit();
		}	
		
	}


