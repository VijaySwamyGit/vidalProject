package com.qa.vidalhealth.TestScripts;

/*import static com.qa.vidalhealth.Base.TestBase.report;
import static com.qa.vidalhealth.Base.TestBase.test;*/

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

//added comment to test SVN changes are reflecting or not....

public class LoginPageTest extends TestBase {
	
	//NEW----------
	
	//REFERENCES ------------------------------------------------------------------------
	LoginPage loginPage;
	TestBase testbase;
	TestUtil testUtil;
	
	//CONSTRUCTOR---------------------------------------------------------
	public LoginPageTest() {
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
	//TEST CASES
	//extent report
	/*static ExtentTest test;
	
		static ExtentReports report;
	@BeforeClass
	public static void startTest()

	{

		 report = new ExtentReports("E:\\SVN-V3-automation\\Automation\\SCREENSHOTS\\ExtentReportResults.html",true);

	test = report.startTest("loginPageTitleTest");

	}*/
	//extent report
	
	@Test
	public void loginPageTitleTest() {
		
		//
		//test = report.startTest("loginPageTitleTest");
		//report.sta
      //  driver = new FirefoxDriver();
        //driver.get("http://www.automationtesting.in");
       // String title = driver.getTitle();
       // Assert.assertEquals("Home - Automation Test", title);
       // test.log(LogStatus.PASS, "Test Passed");
		//
		
		String screenName = "LoginPageValidation";
		
		testUtil.takeScreenshot(screenName);
		loginPage = new LoginPage();
		
		String logintitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(logintitle, "Login");
		
		////extent report
		/*if(logintitle.equals("Login"))
			
				{
			
				test.log(LogStatus.PASS, "loginPageTitleTest-PASS");
			
				}
			
				else
			
				{
			
				test.log(LogStatus.FAIL, "loginPageTitleTest-Test Failed");
			
				}*/
	////extent report
		
		Reporter.log("LOGINPAGE VALIDATION",true);
		Reporter.log("END -- OF --LOGINPAGE VALIDATION -- TESTCASE",true);
			
				}
		
		
		
	
	
	/*@AfterClass
	public static void endTest()
	
		{
	
		report.endTest(test);
	
		report.flush();
	
		}*/
	

		
}
