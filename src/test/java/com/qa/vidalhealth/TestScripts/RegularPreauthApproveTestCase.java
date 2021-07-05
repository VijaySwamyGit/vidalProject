package com.qa.vidalhealth.TestScripts;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.FrameWorkListners.FailedCaseScreenShotsListener;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthMedicalPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthAuthorisationPage;
import com.qa.vidalhealth.Pages.PreauthDataEntryExeHomePage;
import com.qa.vidalhealth.Pages.PreauthGEDPage;
import com.qa.vidalhealth.Pages.PreauthTariffPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.HandleWebTable;
import com.qa.vidalhealth.Util.TestUtil;

import junit.framework.Assert;

//@Listeners(FailedCaseScreenShotsListener.class)
public class RegularPreauthApproveTestCase extends TestBase {
	
	LoginPage loginPage;
	TestBase testbase;
	TestUtil testUtil;
	HomePage homePage;
	//GLOBAL VARIABLE REFERENCES S
	
	PreauthGEDPage preauthGEDPage;
	PreauthDataEntryExeHomePage preauthDataEntryExeHomePage;
	ExcelUtilities excelUtilities;
	//GLOBAL VARIABLE REFERENCES E
	
	
	public RegularPreauthApproveTestCase()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Test case Fails as every run TestBase gets url & does login operation because of @BBeforeMethod annotation
	//and Assert validation is meant for screen before login operation
	@Test
	public void loginPageTitleTest() {
	
		String screenName = "LoginPageValidation";
		
		TestUtil.takeScreenshot(screenName);
		loginPage = new LoginPage();
		
		String logintitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(logintitle, "Login");

		
		Reporter.log("LOGINPAGE VALIDATION",true);
		Reporter.log("END -- OF --LOGINPAGE VALIDATION -- TESTCASE",true);
			
				}
	
	
	@Test
	public void homePageTitleTest() {
		
		loginPage=new LoginPage();
		homePage= new HomePage();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];

		HomePage hp = loginPage.login(un, pwd);*/
		String screenName = "HomePageValidation";
		testUtil.takeScreenshot(screenName);	
		String homepagetitle = homePage.validateHomePageTitle();
		
		Assert.assertEquals(homepagetitle, "Vidal Health Tpa");
		testUtil.takeScreenshot(screenName);
		
		Reporter.log("HOMEPAGE VALIDATION",true);
		Reporter.log("END -- OF --HOMEPAGE VALIDATION -- TESTCASE-2",true);
	}
	
	//
	
	@Test(priority=0)
	public void regularPreAuthGEDTest() throws AWTException 
	{

	
	//OBJECTS
	loginPage = new LoginPage();
	homePage = new HomePage();
	testUtil = new TestUtil();
	//OBJECTS
		
/*		String loginCredentials []=TestUtil.loginCredentials();
	String un = loginCredentials[0];
	String pwd =loginCredentials[1];
		
	HomePage hp = loginPage.login(un, pwd);//LOGIN to application
*/				
	HandleWebTable handleWebTable = new HandleWebTable();
		
	//Below method creates case manually & assigns the created case to self
	String lastrefernceNumber=homePage.assignCaseManuallyWhichCreatedManually();
	//String lastrefernceNumber = homePage.cr();
	lastrefernceNumber=lastrefernceNumber.trim();
	
	
	//--------------
	excelUtilities = new ExcelUtilities();
	//loginPage=new LoginPage();
	preauthDataEntryExeHomePage= new PreauthDataEntryExeHomePage();
	preauthGEDPage = new PreauthGEDPage();
		
	//======================PreauthGED DETAILS START===================================
		
	String FileName="PreauthGEDPageTestData";
	String SheetName1="PreauthGED";
	//----------------
		
		
	WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();//gets "to do task" table NAME
		
	homePage.temRefresh();//to refresh the screen
	//////////////////////////////////
	
	//method to check whether assigned(last reference number) is available in first page or not
	//If present then clicks on that found reference number
	boolean flag1 = handleWebTable.traverseFirstPageOfWebTable(tableNameWebElement, lastrefernceNumber);
		
	//To traverse up to 30 pages
	for(int pageNumber=2;pageNumber<=30;pageNumber++)
	{
			
		if(flag1==false) //if reference number is found in First page(it returns TRUE) it should not go to traverse next pages
		{
			//method to check whether assigned(last reference number) is available in next pages(2 to 30 pages) or not
			//If present then clicks on that found reference number
			boolean flag2= handleWebTable.traverseWebTable(tableNameWebElement,pageNumber,lastrefernceNumber);
				
			if(flag2==true) //if reference number is found in 2nd/3rd... page(it returns TRUE) it should not go to traverse next pages
								//once found so breaks
			{
				break;
			}
				
		}
			
	}
		
		
		
	//
	//----------------
	//=========================================TAGGING HOSPITAL DOCUMENTS=========================
	preauthGEDPage.tagHospitalDocuments();
				
	//=========================================TAGGING HOSPITAL DOCUMENTS=========================
				
				
	//==========================Hospital details===============================
	preauthGEDPage.regular_HospitalDetails();
	Reporter.log("Hospital Detials",true);
	Reporter.log("END -- OF --Hospital Details --",true);
	//==========================Hospital details===============================
				
	//get old date & increase it by one day and write back to excel
	
	int lastRowNum1=excelUtilities.rowCount(FileName, SheetName1);
	String oldDateOfAdmission=null;
	try 
	{
		oldDateOfAdmission = excelUtilities.readDOAFromExcel(FileName, SheetName1);
	} 	
	catch (Exception e2) 
	{
		e2.printStackTrace();
	}
		
	String newDateTime = TestUtil.dateIncrementer(oldDateOfAdmission);		
	try {
			excelUtilities.writeToExceloldcode(newDateTime, FileName, SheetName1);//write incremented date in excel
		} 
	catch (Exception e1) 
	{
		e1.printStackTrace();
	}
				
	preauthGEDPage.pre_Authorization_Details(lastRowNum1);//get test data from excel
				
				
	String screenName1 = "General Preauth Details";
				
	testUtil.takeScreenshot(screenName1);
	Reporter.log("Regular_General Preauth Detials",true);
	Reporter.log("END -- OF --Regular_General Preauth Details --",true);
				
				
			
				
	//==============CLAIMANT DETAILS START======================
			
	preauthGEDPage.regular_Claimant_Details();
	preauthGEDPage.exceptionalApprovalDocumentUploadAttachment();
			
	//=========================================SAVE PreauthGED screen=========================
				
	preauthGEDPage.preauthGEDSaveMethod();
	
	//===============================CAPTURE preauth number=======================================
			
	String preauthNo = preauthGEDPage.capturePreauthNumber();
	String preauthNumberGeneratedSuccessMsg = preauthNo;
	int length = preauthNumberGeneratedSuccessMsg.length();
	if(length>1) 
	{
				
		Assert.assertEquals(preauthNumberGeneratedSuccessMsg, preauthNo);
	}
	else
	{	
		Assert.assertEquals(preauthNumberGeneratedSuccessMsg, "TestCase failed because PA number not generated");
	}		
	Reporter.log("preauthNumberGeneratedSuccessMsg",true);
	Reporter.log("END -- OF --preauthNumberGeneratedSuccessMsg-- TESTCASE",true);
				
	excelUtilities = new ExcelUtilities();
	String FileName2="PreauthNo";
				
	try 
	{
		System.out.println("preauthNumber"+preauthNo);
		excelUtilities.writeToExceloldcode(preauthNo,FileName2,SheetName1);
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	//----------------
		
		
	}
	//
	
	//
	@Test(priority=1)
	public void ManualPreAuthMedicalTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
/*		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.clickOnMedicalOptionContextMenu();
		preAuthMedicalPage.clickOnMedicalEditIcon();
		preAuthMedicalPage.medicalInformation();
		preAuthMedicalPage.coding();
	}
	//
	
	//
	@Test(priority=2)
	public void preauthTariffTest() { 

		HomePage homePage = new HomePage();	
		//ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=TestUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.tariffOptionContextMenu();
		
		
		preauthTariffPage.tariff();
		
	}
	//
	
	//
	@Test(priority=3)
	public void approve_PreauthAuthorisationTest() { 
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();
		homePage.authorizationOptionContextMenu();
		preauthAuthorisationPage.resolveDiscrepancy();
		//testUtil.delayToSync();
		
		/*preauthAuthorisationPage.approvePreauth();
		preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		preauthAuthorisationPage.save();*/
		
		
		
	}
	//

}
