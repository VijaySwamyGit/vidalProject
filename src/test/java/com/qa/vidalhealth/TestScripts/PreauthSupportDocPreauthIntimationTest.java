package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthSupportDocPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthSupportDocPreauthIntimationTest extends TestBase{
	
	public PreauthSupportDocPreauthIntimationTest()
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void PreauthSupportDocPreauthIntimationTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
		String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);
		
		//PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.preauthIntimation();
		
		
		
	}

}
