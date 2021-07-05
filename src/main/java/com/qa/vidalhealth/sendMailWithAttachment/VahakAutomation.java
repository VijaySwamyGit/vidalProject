package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VahakAutomation {
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\old system's-D drive data\\OTHERS\\Vahak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//
	    
		driver.get("https://www.imdb.com/");
		
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in with IMDb']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("swamy.99@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Ritvik@19");
		driver.findElement(By.id("signInSubmit")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='ipc-button__text']")).click();
		
		
				
	
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Top Rated Movies')]"));	
	
		
		
		//Explicit wait concept starts
				//WebDriverWait wait = new WebDriverWait(driver, 30);
			
				//wait.until(ExpectedConditions.elementToBeClickable(ele));
				Actions action =new Actions(driver);
				action.moveToElement(ele).click().build().perform();
		//Explicit wait concept ends
				
		WebElement sortBy = driver.findElement(By.name("sort"));
		
		Select dd = new Select(sortBy);
		dd.selectByVisibleText("Release Date");
		
		WebElement ele2 =driver.findElement(By.xpath("//a[contains(text(),'Metropolis')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true);", ele2);
		
		//Build xpath for dynamic webElement starts
		
		
		String xpath2 = ele2.getText();
		String xpath1 = "//span[starts-with(text(),'(19')]/..//a[contains(text(),'";
		xpath2 = xpath2.replaceAll("^[a-zA-Z]", "");	
		String xpath3 = "')]";
		String xpathofDynamicWebElement = xpath1+xpath2+xpath3;
		System.out.println("********>  " +xpathofDynamicWebElement);
		
		driver.findElement(By.xpath(xpathofDynamicWebElement)).click();
		
		//Build xpath for dynamic webElement ends

		String releaseDate = driver.findElement(By.xpath("//a[@title='See more release dates']")).getText();
		System.out.println("Release date of movie is --- "+releaseDate);
      
		
	}
		
	

}
