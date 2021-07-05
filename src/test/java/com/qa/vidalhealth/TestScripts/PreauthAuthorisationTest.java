package com.qa.vidalhealth.TestScripts;

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

public class PreauthAuthorisationTest extends TestBase{
	
	
	public PreauthAuthorisationTest() {
		PageFactory.initElements(driver, this);
	}
	
	////////**********************************************************************************/
	@Test(invocationCount=1,groups="Preauth", enabled=false)
	public void approve_PreauthAuthorisationTest_withoutResolveDiscrepancies() { 
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		
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
		preAuthSearchPage.searchPreauthNo();
		homePage.authorizationOptionContextMenu();
		//preauthAuthorisationPage.resolveDiscrepancy();
		
		preauthAuthorisationPage.approvePreauth();
		preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		//preauthAuthorisationPage.save();
		
		String paStatus ="approve_PreauthAuthorisationTest_withoutResolveDiscrepancies";
		preauthAuthorisationPage.save(paStatus);
		
		
		
	}
	//************************************************************************************************/
	
	@Test
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
	
	//************************************************************************************/
	
	//***********************************************************************/
	@Test(enabled=false)
	public void requiredInformation_PreauthAuthorisationTest() { 
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();
		homePage.authorizationOptionContextMenu();
		//preauthAuthorisationPage.resolveDiscrepancy();
		
		preauthAuthorisationPage.requiredInformationPreauth();
		//preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		
		/*String paStatus ="requiredInfo";
		preauthAuthorisationPage.save(paStatus);*/
		
		String status="requiredInformation_PreauthAuthorisationTest";
		preauthAuthorisationPage.save(status);
		
		
		
		
		
	}
	
	//**************************************************************************************/
	
	@Test(enabled=false)
	public void reject_PreauthAuthorisationTest() { 
		
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);
		
		//PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		preauthGEDPage.ged_Search_saveButtonMethod();
		homePage.authorizationOptionContextMenu();
		//preauthAuthorisationPage.resolveDiscrepancy();
		
		preauthAuthorisationPage.rejectPreauth();
		//preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
		//preauthAuthorisationPage.save();
		
		String paStatus ="reject_PreauthAuthorisationTest";
		preauthAuthorisationPage.save(paStatus);
		
		String rejectInformation_PreauthAuthorisationTest="REJECT_PreauthAuthorisationTest";
		preauthAuthorisationPage.authorisationValidation(rejectInformation_PreauthAuthorisationTest);
		
		
		
	}
	

	//***************************************************************************/
	

}
