package com.qa.vidalhealth.TestScripts;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Util.TestUtil;

public class ManualCaseAssignmentTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	
	public ManualCaseAssignmentTest(){
		PageFactory.initElements(driver, this);
	}
	
	@Test(invocationCount=1,enabled=false)
	public void manualCaseAssignmentTest() {
		loginPage = new LoginPage();
		homePage = new HomePage();
		testUtil = new TestUtil();
		
		System.out.println("driverM--"+driver);
		
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		loginPage.login(un, pwd);
		//homePage.assignCaseManually();
		
		String validateManualCaseAssign = homePage.validateManualCaseAssign();
		//testUtil.handleAcceptAlert();
		
		Assert.assertEquals(validateManualCaseAssign, "User Assigned Successfully");
		Reporter.log("validateManualCaseAssign",true);
		Reporter.log("END -- OF --validateManualCaseAssign-- TESTCASE",true);
		
	}
	
	
	@Test(invocationCount=1)
	public void assignCaseManuallyWhichCreatedManuallyTest() throws AWTException {
		loginPage = new LoginPage();
		homePage = new HomePage();
		testUtil = new TestUtil();
		
		System.out.println("driverM--"+driver);
		
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		loginPage.login(un, pwd);
		
		homePage.assignCaseManuallyWhichCreatedManually();
		
		String validateManualCaseAssign = homePage.validateManualCaseAssign();
		//testUtil.handleAcceptAlert();
		
		Assert.assertEquals(validateManualCaseAssign, "User Assigned Successfully");
		Reporter.log("validateManualCaseAssign",true);
		Reporter.log("END -- OF --validateManualCaseAssign-- TESTCASE",true);
		
	}

}
