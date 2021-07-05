package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreauthDataEntryExeHomePage;
import com.qa.vidalhealth.Pages.PreauthGEDPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;
import com.qa.vidalhealth.Util.TestUtil;

public class ManualPreauthorizationGEDTest extends TestBase{
	
	//REFERENCES
	PreauthGEDPage preauthGEDPage;
	LoginPage loginPage;
	HomePage homePage;
	PreauthDataEntryExeHomePage preauthDataEntryExeHomePage;
	ExcelUtilities excelUtilities;
	TestUtil testUtil;

	//CONSTRUCTOR
	public ManualPreauthorizationGEDTest(){
		PageFactory.initElements(driver, this);
		
	}

	//TEST CASE FOR MANUAL PREAUTH
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
	@Test(invocationCount=1,groups="Preauth")
	public void manualPreauthorizationTest(){
		
		excelUtilities = new ExcelUtilities();
		loginPage=new LoginPage();
		homePage= new HomePage();
		preauthDataEntryExeHomePage= new PreauthDataEntryExeHomePage();
		preauthGEDPage = new PreauthGEDPage();
		
		//======================PreauthGED DETAILS START===================================
		
		String FileName="PreauthGEDPageTestData";
		String SheetName1="PreauthGED";
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);
		
		
		String screenName1 = "General Preauth Details";
		preauthDataEntryExeHomePage.clickOnReferenceNumberLink();
		
		//=========================================TAGGING HOSPITAL DOCUMENTS=========================
		preauthGEDPage.tagHospitalDocuments();
		
		//=========================================TAGGING HOSPITAL DOCUMENTS=========================
		
		
		//TEMP--//==========================Hospital details===============================
		preauthGEDPage.hospitalDetails();
		Reporter.log("Hospital Detials",true);
		Reporter.log("END -- OF --Hospital Details --",true);
		//TEMP--//==========================Hospital details===============================
		
		int lastRowNum1=excelUtilities.rowCount(FileName, SheetName1);
		System.out.println("lastRowNum1=="+lastRowNum1);
		
		// testUtil  = new TestUtil();
		
		
		
		//String  oldDate="25/02/2019 11:00 AM";
		String oldDateOfAdmission=null;
		try {
			oldDateOfAdmission = excelUtilities.readDOAFromExcel(FileName,SheetName1);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String newDateTime = TestUtil.dateIncrementer(oldDateOfAdmission);
		
		System.out.println("newDate--"+newDateTime);
		
		try {
			excelUtilities.writeToExceloldcode(newDateTime, FileName, SheetName1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		preauthGEDPage.pre_Authorization_Details(lastRowNum1);
		testUtil.takeScreenshot(screenName1);
		Reporter.log("General Preauth Detials",true);
		Reporter.log("END -- OF --General Preauth Details --",true);
		
		
	
		
	//==============CLAIMANT DETAILS START======================
	
		String SheetName2="ClaimantDetails";
		int lastRowNum2=excelUtilities.rowCount(FileName, SheetName2);
		preauthGEDPage.claimant_Details(lastRowNum2);	
		String screenName2 = "Claimant Details";
		testUtil.takeScreenshot(screenName2);
		Reporter.log("Claimant Detials",true);
		Reporter.log("END -- OF --Claimant Details --",true);
	
		//=====================//POLICY DETAILS START//======================================
		
		
		String SheetName3="PolicyDetails";
		int lastRowNum3=excelUtilities.rowCount(FileName, SheetName3);
		preauthGEDPage.policy_Details(lastRowNum3);
		Reporter.log("Policy Detials",true);
		Reporter.log("END -- OF --Policy Details --",true);
		
		//====================Insurance company details=========================

		preauthGEDPage.insurance_Company_Details();
		Reporter.log("Isurance Company Detials",true);
		Reporter.log("END -- OF --Isurance Company  Details --",true);
		
		//==========================Hospital details===============================
	
	/*	preauthGEDPage.hospitalDetails();
		Reporter.log("Hospital Detials",true);
		Reporter.log("END -- OF --Hospital Details --",true);*/

		
		//==========================Additional details===============================
		preauthGEDPage.clickOnAdditionalDetailsLink();
		
		//==========================CorpNonCorp details===============================
		
		preauthGEDPage.clickOnCorporateNonCorpDetailsLink();
		
		//=========================================Attach PDF document=========================
		
		
	
		preauthGEDPage.exceptionalApprovalDocumentUploadAttachment();
	
		//=========================================SAVE PreauthGED screen=========================
		
		preauthGEDPage.preauthGEDSaveMethod();
		//testUtil.delayToSync();
	
		
		//===============================CAPTURE preauth number=======================================
	
		String preauthNo = preauthGEDPage.capturePreauthNumber();
		
		excelUtilities = new ExcelUtilities();
		String FileName2="PreauthNo";
		
		try {
			System.out.println("preauthNumber"+preauthNo);
			
			
					
			excelUtilities.writeToExceloldcode(preauthNo,FileName2,SheetName1);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
	}
	
			
		
		
	
	}

	
	

