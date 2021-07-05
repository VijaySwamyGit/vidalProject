package com.qa.vidalhealth.TestScripts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Util.TestUtil;

public class HomePageTest extends TestBase {
	
	
	//NEW----------
	//REFERENCES -------------------------------------------------------------------
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;

	//CONSTRUCTOR------------------------------------------------------
	public HomePageTest(){
		//super();
		PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * Created By : VIJAY
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	
	
	//TESTCASES
	@Test(groups="Titleeee",invocationCount=1)
	public void homePageTitleTest() {
		
		
		Logger log = Logger.getLogger("HomePageTest");
		BasicConfigurator.configure();
		
		// Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
	        // Logger logger=Logger.getLogger("HomePageTest");
	        
	 
	       // configure log4j properties file
	       //PropertyConfigurator.configure("log4j.properties");
		
		loginPage=new LoginPage();
		homePage= new HomePage();
		
		System.out.println("=============soplnmm-----------");
		
		//logger.info("Browser Opened1....");
		//logger.info("Browser Opened2....");
		
		//Logger log = Logger.getLogger("devpinoyLogger");
        
       // driver.get("http://healthunify.com/bmicalculator/");
		// logger.info("opening webiste");
      //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //logger.info("entring weight");
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];

		HomePage hp = loginPage.login(un, pwd);*/
		String screenName = "HomePageValidation";
		testUtil.takeScreenshot(screenName);	
		log.info("entring weight screenshot");
		log.debug("log message111------------");
		log.debug("log message222------------");
		log.debug("log message333------------");
		Reporter.log("HomePageValidation screenshot", true);
		String homepagetitle = homePage.validateHomePageTitle();
		
		Assert.assertEquals(homepagetitle, "Vidal Health Tpa");
		
		Reporter.log("HOMEPAGE VALIDATION",true);
		Reporter.log("END -- OF --HOMEPAGE VALIDATION -- TESTCASE-2",true);
	}
		

}


