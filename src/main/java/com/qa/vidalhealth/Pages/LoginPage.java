package com.qa.vidalhealth.Pages;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.TestUtil;

public class LoginPage extends TestBase{
	
	
	
	//All WebElements will be initialized with driver
	public LoginPage()
	{
		PageFactory.initElements(driver, this);

	}
	
	//page Factory - OR(Object repository)
	
	
	@FindBy(name = "username")
	WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	WebElement passwordTextfield;
	
	@FindBy(id = "subId")
	WebElement submitButton;
	
	public  String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	

	
	public  HomePage login(String un, String pwd)  {
		
		//Robot robot = new Robot();
		

		usernameTextfield.sendKeys(un);
		passwordTextfield.sendKeys(pwd);
		/*TestUtil.delayToSync();
		robot.keyPress(KeyEvent.VK_ENTER);
		TestUtil.delayToSync();
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		submitButton.click();
		
		return new HomePage();//returning object of HomePage
		
	}
	
	//
	public  HomePage login() {
	

		usernameTextfield.sendKeys("vv");
		passwordTextfield.sendKeys("vijay");
		submitButton.click();
		
		return new HomePage();//returning object of HomePage
		
	}
	//
}
