package com.qa.vidalhealth.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.TestUtil;
//import com.relevantcodes.extentreports.LogStatus;

public class PreauthSupportDocPage extends TestBase{
	
	HomePage homePage = new HomePage();
	TestUtil testUtil = new TestUtil();
	
	
	public PreauthSupportDocPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Preauth Intimation WEBELEMENTS
	
	
	
	@FindBy(xpath="//img[@title='Edit']")
	WebElement editIcon;
	
	@FindBy(xpath="//button[@onclick='javascriprt:onSearchIntimination();']")
	WebElement searchButton;
	
	@FindBy(xpath="//a[@href=\"javascript:edit(0,'preIntimationTable')\"]")
	WebElement intimationDateLink;
	
	@FindBy(xpath="//button[@onclick='javascript:onPolicyHistorySave();']")
	WebElement onPolicyHistorySaveButton;
	
	//use common success message
	//use common DocumentTypeDD
	
	//preauth intimation method STARTS
public void preauthIntimation() {
		
	Select dd = new Select(documentTypeDD);
	dd.selectByValue("PRI");
	
	
	editIcon.click();
	searchButton.click();
	intimationDateLink.click();
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	onPolicyHistorySaveButton.click();
	
	String validatePreauthIntimationSuccessMsg = supportDocSuccessMsg.getText();
	
	/*////extent report
	if(validatePreauthIntimationSuccessMsg.equals("Record saved successfully!"))
		
			{
		
			test.log(LogStatus.PASS, "Preauth Intimation Success");
		
			}
		
			else
		
			{
		
			test.log(LogStatus.FAIL, "Test Failed");
		
			}
////extent report
*/
	System.out.println("validatePreauthIntimationSuccessMsg----"+validatePreauthIntimationSuccessMsg);
			
			Assert.assertEquals(validatePreauthIntimationSuccessMsg, "Record saved successfully!");
			
			Reporter.log("validatePreauthIntimationSuccessMsg",true);
			Reporter.log("END -- OF --validatePreauthIntimationSuccessMsg-- TESTCASE",true);
			
	
		
	}
//preauth intimation method ENDS

	
	//INVESTIGATION WEBELEMENTS
	@FindBy(xpath="//select[@name='documentTypeID']")
	WebElement documentTypeDD;
	
	@FindBy(xpath="//select[@name='reasonforInvestigation']")
	WebElement reasonforInvestigationDD;
	
	@FindBy(xpath="//label[contains(text(),'Investigation')]")
	WebElement investigationMandatoryCheckBox;
	
	@FindBy(xpath="//button[@onClick='javascript:oninvstigationSave();']")
	WebElement oninvstigationSaveButton;
	
	@FindBy(xpath="//div[contains(text(),'You can not raise the investigation for Preauth since Investigation in-process or Sent Status.')]")
	WebElement multipleInvestigationOpenSuccessMsg;
	
/*	@FindBy(xpath="//div[contains(text(),'You can not raise the investigation for Preauth since "
			+ "Investigation in-process or Sent Status.')]")
	WebElement multipleInvestigationOpenSuccessMsg;*/
	
	
	
	
	
	
	
	//SHORTFALL WEBELEMENTS
	
	@FindBy(xpath="//button[@value='Submit']")
	WebElement addButton;
	
	
	
	@FindBy(xpath="//img[@name='ped1']")
	WebElement maternityExpandIcon;

	
	@FindBy(xpath="//input[@name='Maternity.1']")
	WebElement  is_It_A_Normal_Deliver_Or_Caesarean_CheckBox;
	
	
	@FindBy(xpath="//button[@onclick='javascript:saveShortFall();']")
	WebElement save_n_Send_Button;
	
	@FindBy(xpath="//span[contains(text(),'Record saved successfully')]")
	WebElement supportDocSuccessMsg;
	
	
	@FindBy(xpath="//select[@id='statusId']")
	WebElement statusDD;
	
	
	
	@FindBy(xpath="//select[@id='reasonTypeID']")
	WebElement reasonDD;
	
	@FindBy(xpath="//input[@name='receivedDateAsString']")
	WebElement receivedDatenTimeCalender;
	
	//@FindBy(xpath="//a[@href=\"javascript:edit(0,'shortfalltable')\"]")
	
	@FindBy(xpath="//img[@alt='Open']/../..//a")
	WebElement shortFallNoLink;
	
	@FindBy(xpath="//div[contains(text(),'You can not raise shortfall for preauth since it is in open status')]")
	WebElement multipleShortfallOpenSuccessMsg;
	
	
	//Open shortfall STARTS
	public void raiseShortfall() {
		
		addButton.click();
		testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		maternityExpandIcon.click();
		is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
		
		testUtil.delayToSync();
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		save_n_Send_Button.click();
	
		testUtil.delayToSync();
		

		
		String validateraiseShortfallSuccessMsg = supportDocSuccessMsg.getText();
		
		/*////extent report
		if(validateraiseShortfallSuccessMsg.equals("Record saved successfully"))
			
				{
			
				test.log(LogStatus.PASS, "Open shortfall success");
			
				}
			
				else
			
				{
			
				test.log(LogStatus.FAIL, "Test Failed");
			
				}
	////extent report
*/
		System.out.println("validateraiseShortfallSuccessMsg----"+validateraiseShortfallSuccessMsg);
				
				Assert.assertEquals(validateraiseShortfallSuccessMsg, "Record saved successfully");
				
				Reporter.log("validateraiseShortfallSuccessMsg",true);
				Reporter.log("END -- OF --validateraiseShortfallSuccessMsg-- TESTCASE",true);
				
				
		
		
	}
	//Open Shortfall ENDS
	
	//Mutliple shortfall Open starts
	public void raiseMultipleShortfall() {
		
		addButton.click();
		testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		maternityExpandIcon.click();
		is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
		
		testUtil.delayToSync();
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		save_n_Send_Button.click();
	
		testUtil.delayToSync();
		

		
		String validateraiseMultipleShortfallSuccessMsg = multipleShortfallOpenSuccessMsg.getText();
		
	/*////extent report
		if(validateraiseMultipleShortfallSuccessMsg.equals("You can not raise shortfall for preauth since it is in open status"))
			
				{
			
				test.log(LogStatus.PASS, "raiseMultipleShortfall");
			
				}
			
				else
			
				{
			
				test.log(LogStatus.FAIL, "raiseMultipleShortfall-Test Failed");
			
				}
	////extent report
*/
		System.out.println("validateraiseMultipleShortfallSuccessMsg----"+validateraiseMultipleShortfallSuccessMsg);
				
				Assert.assertEquals(validateraiseMultipleShortfallSuccessMsg, "You can not raise shortfall for preauth since it is in open status");
				
				Reporter.log("validateraiseMultipleShortfallSuccessMsg",true);
				Reporter.log("END -- OF --validateraiseMultipleShortfallSuccessMsg-- TESTCASE",true);
		
	}
	
	//Mutliple shortfall Open ENDS

	
	//OpenNClose shortfall start
	
public void openNCloseShortfall() {
		
		addButton.click();
		testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		maternityExpandIcon.click();
		is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
		
		//testUtil.delayToSync();
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		save_n_Send_Button.click();
	//	testUtil.delayToSync();
		
		

		shortFallNoLink.click();
		//testUtil.delayToSync();
		//testUtil.delayToSync();
		jse1.executeScript("window.scrollBy(0,300)", "");
		//testUtil.delayToSync();
		//testUtil.delayToSync();
		
		Select dd = new Select(statusDD);
		dd.selectByValue("CLS");
		
		Select dd2 = new Select(reasonDD);
		dd2.selectByVisibleText("Not Required");
		
		testUtil.delayToSync();
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		save_n_Send_Button.click();
		
		testUtil.delayToSync();

		
		String validateOpenNCloseShortfallSuccessMsg = supportDocSuccessMsg.getText();
		
		/*////extent report
		if(validateOpenNCloseShortfallSuccessMsg.equals("Record saved successfully"))
			
				{
			
				test.log(LogStatus.PASS, "OpenNClose shortfall success");
			
				}
			
				else
			
				{
			
				test.log(LogStatus.FAIL, "Test Failed");
			
				}
	////extent report
*/
		System.out.println("validateOpenNCloseShortfallSuccessMsg----"+validateOpenNCloseShortfallSuccessMsg);
				
				Assert.assertEquals(validateOpenNCloseShortfallSuccessMsg, "Record saved successfully");
				
				Reporter.log("validateOpenNCloseShortfallSuccessMsg",true);
				Reporter.log("END -- OF --validateOpenNCloseShortfallSuccessMsg-- TESTCASE",true);
		
	}
	

	//OpenNClose shortfall ENDS

//OpenNrespond shortfall STARTS

public void openNRespondedShortfall() {
	
	addButton.click();
	testUtil.delayToSync();
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	maternityExpandIcon.click();
	is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
	
	testUtil.delayToSync();
	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	save_n_Send_Button.click();
	testUtil.delayToSync();



	shortFallNoLink.click();
	jse1.executeScript("window.scrollBy(0,300)", "");
	
	Select dd = new Select(statusDD);
	dd.selectByValue("RES");
	
	receivedDatenTimeCalender.click();
	testUtil.delayToSync();

	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	save_n_Send_Button.click();
	testUtil.delayToSync();

	
	String validateOpenNRespShortfallSuccessMsg = supportDocSuccessMsg.getText();
	
/*////extent report
		if(validateOpenNRespShortfallSuccessMsg.equals("Record saved successfully"))
			
				{
			
				test.log(LogStatus.PASS, "openNRespondedShortfall");
			
				}
			
				else
			
				{
			
				test.log(LogStatus.FAIL, "Test Failed");
			
				}
	////extent report
*/
	System.out.println("validateOpenNRespShortfallSuccessMsg----"+validateOpenNRespShortfallSuccessMsg);
			
			Assert.assertEquals(validateOpenNRespShortfallSuccessMsg, "Record saved successfully");
			
			Reporter.log("validateOpenNRespShortfallSuccessMsg",true);
			Reporter.log("END -- OF --validateOpenNRespShortfallSuccessMsg-- TESTCASE",true);
	
}
//OpenNrespond Shortfall ENDS

//OpenNOverride shortfall STARTS

public void openNOverrideShortfall() {
		
		addButton.click();
		testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		maternityExpandIcon.click();
		is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
		
		testUtil.delayToSync();
		//JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		save_n_Send_Button.click();
		testUtil.delayToSync();
		shortFallNoLink.click();
		jse1.executeScript("window.scrollBy(0,300)", "");
		Select dd = new Select(statusDD);
		dd.selectByValue("ORD");
		
		Select dd2 = new Select(reasonDD);
		dd2.selectByVisibleText("Not Required");
		
		testUtil.delayToSync();
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		save_n_Send_Button.click();
		testUtil.delayToSync();

		String validateOpenNOverrideShortfallSuccessMsg = supportDocSuccessMsg.getText();
		
	/*////extent report
			if(validateOpenNOverrideShortfallSuccessMsg.equals("Record saved successfully"))
				
					{
				
					test.log(LogStatus.PASS, "openNOverrideShortfall");
				
					}
				
					else
				
					{
				
					test.log(LogStatus.FAIL, "Test Failed");
				
					}
		////extent report
*/
		System.out.println("validateOpenNOverrideShortfallSuccessMsg----"+validateOpenNOverrideShortfallSuccessMsg);
				
				Assert.assertEquals(validateOpenNOverrideShortfallSuccessMsg, "Record saved successfully");
				
				Reporter.log("validateOpenNOverrideShortfallSuccessMsg",true);
				Reporter.log("END -- OF --validateOpenNOverrideShortfallSuccessMsg-- TESTCASE",true);
		
	}
	

	//OpenNOverride shortfall ENDS


//
public void closeShortfall() {
	
	//addButton.click();
	//testUtil.delayToSync();
	
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	//maternityExpandIcon.click();
	//is_It_A_Normal_Deliver_Or_Caesarean_CheckBox.click();
	
	//testUtil.delayToSync();
	//jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	//save_n_Send_Button.click();
//	testUtil.delayToSync();
	
	

	shortFallNoLink.click();
	//testUtil.delayToSync();
	//testUtil.delayToSync();
	jse1.executeScript("window.scrollBy(0,300)", "");
	//testUtil.delayToSync();
	//testUtil.delayToSync();
	
	Select dd = new Select(statusDD);
	dd.selectByValue("CLS");
	
	//jse1.executeScript("window.scrollBy(0,300)", "");
	
	Select dd2 = new Select(reasonDD);
	dd2.selectByVisibleText("Not Required");
	
	testUtil.delayToSync();
	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	save_n_Send_Button.click();
	
	testUtil.delayToSync();

	
	String validatecloseShortfallSuccessMsg = supportDocSuccessMsg.getText();
	
/*////extent report
			if(validatecloseShortfallSuccessMsg.equals("Record saved successfully"))
				
					{
				
					test.log(LogStatus.PASS, "closeShortfall");
				
					}
				
					else
				
					{
				
					test.log(LogStatus.FAIL, "Test Failed");
				
					}
		////extent report
*/
	System.out.println("validatecloseShortfallSuccessMsg----"+validatecloseShortfallSuccessMsg);
			
			Assert.assertEquals(validatecloseShortfallSuccessMsg, "Record saved successfully");
			
			Reporter.log("validatecloseShortfallSuccessMsg",true);
			Reporter.log("END -- OF --validatecloseShortfallSuccessMsg-- TESTCASE",true);
	
}

////Open Investigation STARTS

public void openInvestigationWithIMCheckBox() {
	
	

	
	Select dd = new Select(documentTypeDD);
	dd.selectByValue("IVN");
	
	Select dd2 = new Select(reasonforInvestigationDD);
	dd2.selectByIndex(2);
	
	investigationMandatoryCheckBox.click();
	oninvstigationSaveButton.click();

	
	String validateOpenInvestigationSuccessMsg = supportDocSuccessMsg.getText();
	
	System.out.println("validateOpenInvestigationSuccessMsg----"+validateOpenInvestigationSuccessMsg);
	
	
/*////extent report
			if(validateOpenInvestigationSuccessMsg.equals("Record saved successfully"))
				
					{
				
					test.log(LogStatus.PASS, "openInvestigationWithIMCheckBox");
				
					}
				
					else
				
					{
				
					test.log(LogStatus.FAIL, "openInvestigationWithIMCheckBox-Test Failed");
				
					}
		////extent report
*/
	System.out.println("validateOpenInvestigationSuccessMsg----"+validateOpenInvestigationSuccessMsg);
			
			Assert.assertEquals(validateOpenInvestigationSuccessMsg, "Record saved successfully");
			
			Reporter.log("validateOpenInvestigationSuccessMsg",true);
			Reporter.log("END -- OF --validateOpenInvestigationSuccessMsg-- TESTCASE",true);
	
}

//Open Investigation ENDS

//Open Multiple Investigation STARTS

public void openMultipleInvestigation() {
	
	

	
	Select dd = new Select(documentTypeDD);
	dd.selectByValue("IVN");
	
	Select dd2 = new Select(reasonforInvestigationDD);
	dd2.selectByIndex(2);
	
	investigationMandatoryCheckBox.click();
	oninvstigationSaveButton.click();

	
	String validateMultipleInvestigationOpenSuccessMsg = multipleInvestigationOpenSuccessMsg.getText();
	
/*////extent report
			if(validateMultipleInvestigationOpenSuccessMsg.equals("Record saved successfully"))
				
					{
				
					test.log(LogStatus.PASS, "openMultipleInvestigation");
				
					}
				
					else
				
					{
				
					test.log(LogStatus.FAIL, "openMultipleInvestigation-Test Failed");
				
					}
		////extent report
*/
	System.out.println("validateMultipleInvestigationOpenSuccessMsg----"+validateMultipleInvestigationOpenSuccessMsg);
			
			Assert.assertEquals(validateMultipleInvestigationOpenSuccessMsg, "You can not raise the investigation for Preauth since Investigation in-process or Sent Status.");
			
			Reporter.log("validateMultipleInvestigationOpenSuccessMsg",true);
			Reporter.log("END -- OF --validateMultipleInvestigationOpenSuccessMsg-- TESTCASE",true);
	
}

	
	
}
