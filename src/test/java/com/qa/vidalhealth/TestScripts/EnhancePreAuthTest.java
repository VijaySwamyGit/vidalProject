package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthAuthorisationPage;
import com.qa.vidalhealth.Pages.PreauthGEDPage;
import com.qa.vidalhealth.Pages.PreauthTariffPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class EnhancePreAuthTest extends TestBase{
	
	
	//PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
	//HomePage homePage = new HomePage();
	//PreauthTariffPage preauthTariffPage =new PreauthTariffPage();
	//PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
	
	public EnhancePreAuthTest(){
		PageFactory.initElements(driver, this);
	}

	
	@Test
	public void EnhancePreAuthTest() {
		
		//
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();
		HomePage homePage = new HomePage();
		PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		PreauthTariffPage preauthTariffPage =new PreauthTariffPage();
		
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
		//PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		//
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPAenhanceIcon();
		preauthGEDPage.enhancePaRequestedAmt();
		homePage.tariffOptionContextMenu();
		preauthTariffPage.tariffEnhancePA();
		homePage.authorizationOptionContextMenu();
		TestUtil.scrollDown();
		preauthAuthorisationPage.approvePreauth();
		preauthAuthorisationPage.resolveDiscrepancy();
		
	}
	
}
