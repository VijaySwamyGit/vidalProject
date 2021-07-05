package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthAuthorisationPage;
import com.qa.vidalhealth.Pages.PreauthGEDPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthStatusLetterGenerationTest extends TestBase{

	
	public  PreauthStatusLetterGenerationTest() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Test
	public void preauth_Approve_StatusLetterGeneration() {
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		/*
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		//preAuthSearchPage.searchPreauthNo_withoutreadingFromExcel();//commented
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.assignCaseToSelf();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();//SAVED in General screen to make the PA in Inprogress state
		//preauthGEDPage.preauthGEDSaveMethod();
		homePage.ruleDataOptionContextMenu();
		homePage.authorizationOptionContextMenu();
		preauthAuthorisationPage.resolveDiscrepancy();
		
		//preauthAuthorisationPage.approvePreauth();
		//preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		//preauthAuthorisationPage.save();=
		String preauth_Approve_StatusLetterGeneration="preauth_Approve_StatusLetterGeneration";
		preauthAuthorisationPage.save(preauth_Approve_StatusLetterGeneration);
		preauthAuthorisationPage.generateApprovalLetter();
		
	}
	
	
	
	@Test(enabled=false)
	public void preauth_Rejection_StatusLetterGeneration() {
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
		/*String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		//preAuthSearchPage.searchPreauthNo_withoutreadingFromExcel();//commented
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.assignCaseToSelf();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();//SAVED in General screen to make the PA in Inprogress state
		//preauthGEDPage.preauthGEDSaveMethod();
		homePage.ruleDataOptionContextMenu();
		homePage.authorizationOptionContextMenu();
		//preauthAuthorisationPage.resolveDiscrepancy();
		
		preauthAuthorisationPage.rejectPreauth();
		//preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		//preauthAuthorisationPage.save();
		String preauth_Rejection_StatusLetterGeneration="preauth_Rejection_StatusLetterGeneration";
		preauthAuthorisationPage.save(preauth_Rejection_StatusLetterGeneration);
		preauthAuthorisationPage.generateRejectLetter();
		
	}
	
	@Test(enabled=false)
	public void preauth_Cancel_StatusLetterGeneration() {
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
		/*String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		//preAuthSearchPage.searchPreauthNo_withoutreadingFromExcel();//commented
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.assignCaseToSelf();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();//SAVED in General screen to make the PA in Inprogress state
		//preauthGEDPage.preauthGEDSaveMethod();
		homePage.ruleDataOptionContextMenu();
		homePage.authorizationOptionContextMenu();
		//preauthAuthorisationPage.resolveDiscrepancy();
		
		preauthAuthorisationPage.cancelPreauth();
		//preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		
		//preauthAuthorisationPage.save();
		//TestUtil.windowHandles();
		
		String preauth_Cancel_StatusLetterGeneration="preauth_Cancel_StatusLetterGeneration";
		preauthAuthorisationPage.save(preauth_Cancel_StatusLetterGeneration);
		preauthAuthorisationPage.generateCancelLetter();
		
	}
}
