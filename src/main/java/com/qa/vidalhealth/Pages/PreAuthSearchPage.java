package com.qa.vidalhealth.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class PreAuthSearchPage extends TestBase{
	
	
	
	
	public PreAuthSearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='sPreAuthNumber1']")
	WebElement preAuthNoTextBox;
	
	
	@FindBy(xpath="//button[@title='Search']")
	WebElement searchOptionContextMenu;
	
	@FindBy(xpath="//button[@id='mysearch']")
	WebElement searchButton;
	
	@FindBy(xpath="//a[contains(text(),'-PA-000')]")
	WebElement preauthlink;
	
	@FindBy(xpath="//a[@href=\"javascript:edit(0,'tableData')\"]")
	WebElement firstFromGridPreauthLink;
	
	@FindBy(xpath = "//a[@class='adv-search openSidepanel']")
	WebElement advancedSearchLink;
	
	@FindBy(xpath = "//select[@name='sWorkFlow']")
	WebElement advancedSearchWorkFlowDD;
	
	@FindBy(xpath = "//select[@name='sStatus']")
	WebElement advancedSearchStatusDD;
	
	@FindBy(xpath = "//select[@name='sInsurerAppStatus']")
	WebElement advancedSearchInsurerStatusDD;
	
	
	
	@FindBy(xpath = "//a[@onclick='onUserAssignment(0)']")
	WebElement userAssignmentIcon;
	
	@FindBy(xpath = "//textarea[@id='remarks']")
	WebElement userAssignmentRemarks;
	
	@FindBy(xpath = "//button[@id='assignId']")
	WebElement assignButton;
	
	
	//*************PA Enhancement STARTS********
	@FindBy(xpath = "//img[@title='Enhance Pre-Auth']")
	WebElement enhanceIcon;
	
	
	public void clickOnPAenhanceIcon() {
		TestUtil.delayToSync();
		TestUtil.scrollDown();
		enhanceIcon.click();
		
	}
	
	//**************PA Enhancement ENDS****

	
	
	
	
	
	@FindBy(xpath = "//a[@onclick='onUserAssignment(0)']/../..//td[8]")//index available in XPATH
	WebElement getAssignedUserName;
	
	
	//a[@title='Sort By : Assigned To']
	
	
	
	
	
	public void searchPreauthNo() {
		
		TestUtil testUtil = new TestUtil();
		HomePage homePage = new HomePage();
		ExcelUtilities excelUtilities = new ExcelUtilities();
		String preauthNo="";
		
		//searchOptionContextMenu.click();
		
		//PreauthGEDPage preauthGEDPage = new PreauthGEDPage();
		//String preAuthNo = preauthGEDPage.capturePreauthNumber();
	//	ManualPreauthorizationGEDTest manualPreauthorizationGEDTest = new ManualPreauthorizationGEDTest();
	//	preAuthNoTextBox.sendKeys(preAuthNo);
		try {
			preauthNo = excelUtilities.readPAFromExcel();
			System.out.println(preauthNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(preauthNo);
		preAuthNoTextBox.sendKeys(preauthNo);
		testUtil.delayToSync();
		searchButton.click();
		
		String preauthsearch = "preauthsearchdone";
		testUtil.takeScreenshot(preauthsearch);
		testUtil.delayToSync();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		//preauthlink.click();//commented
		//homePage.clickOnMedicalOption();
		
		
		
	}
	
	public void clickOnPreauthLink() {
		TestUtil.delayToSync();
		preauthlink.click();
		
	}
	
public void searchPreauthNo_withoutreadingFromExcel() {
		
		TestUtil testUtil = new TestUtil();
		HomePage homePage = new HomePage();
		
		advancedSearchLink.click();
		
		Select workFlowStatus = new Select(advancedSearchWorkFlowDD);
		workFlowStatus.selectByVisibleText("Confirmation");
		
		Select insurerStatus = new Select(advancedSearchStatusDD);
		insurerStatus.selectByValue("INP");
		searchButton.click();
		
		String preauthsearch_withoutreadingFromExcel = "preauthsearchdone_withoutreadingFromExcel";
		testUtil.takeScreenshot(preauthsearch_withoutreadingFromExcel);
		
	
		
		
	}

public void assignCaseToSelf() {
	TestUtil testUtil = new TestUtil();
	
	userAssignmentIcon.click();
	userAssignmentRemarks.sendKeys("remarks");
	assignButton.click();
	testUtil.delayToSync();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)", "");
	//firstFromGridPreauthLink.click();
	
}

}
