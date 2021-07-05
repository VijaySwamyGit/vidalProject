package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthTariffPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthTariffTest extends TestBase {
	
	
	
	
	public PreauthTariffTest() {
		PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public void PreauthTariffTest() { 
		
		//PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		PreauthTariffPage preauthTariffPage = new PreauthTariffPage();
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.tariffOptionContextMenu();
		
		
		//preauthTariffPage.tariff();
		preauthTariffPage.newTarrif();
	}

}
