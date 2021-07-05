package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreAuthMedicalPage;
import com.qa.vidalhealth.Pages.PreAuthSearchPage;
import com.qa.vidalhealth.Pages.PreauthSupportDocPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthSupportDocShortfallTest extends TestBase {
	
	
	public PreauthSupportDocShortfallTest() {
		PageFactory.initElements(driver, this);
	}

	
	//@Test(dependsOnMethods="PreauthOpenNOverrideShortfallTest")
	@Test
	public void PreauthOpenShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.raiseShortfall();
		
	}
	
	
	@Test(dependsOnMethods="PreauthOpenShortfallTest")
	public void PreauthMultipleOpenShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);
		*/
		PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.raiseMultipleShortfall();
		
	}
	
	//Close Shortfall STARTS
	
	@Test(dependsOnMethods="PreauthMultipleOpenShortfallTest")
	public void closeShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
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
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.closeShortfall();
		
	}
	//Close Shortfall ENDS
	
	
	@Test
	public void PreauthOpenNcloseShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
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
		
		PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.openNCloseShortfall();
		
		
		
	}
	

	//@Test(dependsOnMethods="PreauthOpenNcloseShortfallTest")
	@Test
	public void PreauthOpenNRespondShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
		//preAuthSearchPage.searchOption();
		
		ExcelUtilities excelUtilities = new ExcelUtilities();
		LoginPage loginPage=new LoginPage();
		//HomePage homePage= new HomePage();
		TestUtil testUtil =new TestUtil();
		
	/*	String loginCredentials []=testUtil.loginCredentials();
		String un = loginCredentials[0];
		String pwd =loginCredentials[1];
		HomePage hp = loginPage.login(un, pwd);*/
		
		PreAuthMedicalPage preAuthMedicalPage = new PreAuthMedicalPage();
		
		
		homePage.clickOnSearchOptionContextMenu();
		preAuthSearchPage.searchPreauthNo();
		preAuthSearchPage.clickOnPreauthLink();
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.openNRespondedShortfall();
		
	}
	
	//@Test(dependsOnMethods="PreauthOpenNRespondShortfallTest")
	@Test
	public void PreauthOpenNOverrideShortfallTest() { 
		
		PreAuthSearchPage preAuthSearchPage = new PreAuthSearchPage();
		HomePage homePage = new HomePage();
		//PreAuthSearchPage
		PreauthSupportDocPage preauthSupportDocPage = new PreauthSupportDocPage();
		
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
		homePage.supportDocOptionContextMenu();
		preauthSupportDocPage.openNOverrideShortfall();
		
	}
}
	

