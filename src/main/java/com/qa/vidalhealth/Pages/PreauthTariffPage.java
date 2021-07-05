package com.qa.vidalhealth.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthTariffPage extends TestBase {
	
	TestUtil testUtil = new TestUtil();
	
	
	
	public PreauthTariffPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(name = "tariffRequestedAmt")
	WebElement tariffRequestedAmtTextBox;*/
	
	@FindBy(xpath = "//input[@value='CONSULTATION']/../..//input[@name='tariffRequestedAmt']")
	WebElement tariffRequestedAmt_CONSULTATIONTextBox;
	
	@FindBy(xpath = "//input[@value='CONSUMABLES AND DISPOSABLES']/../..//input[@name='tariffRequestedAmt']")
	WebElement tariffRequestedAmt_CONSUMABLESANDDISPOSABLESTextBox;
	
	/*@FindBy(name = "tariffApprovedAmt")
	WebElement tariffApprovedAmtTextBox;*/
	
	@FindBy(xpath = "//input[@value='CONSUMABLES AND DISPOSABLES']/../..//input[@name='tariffApprovedAmt']")
	WebElement tariffApprovedAmt_CONSUMABLESANDDISPOSABLESTextBox;
	
	@FindBy(xpath = "//input[@value='CONSULTATION']/../..//input[@name='tariffApprovedAmt']")
	WebElement tariffApprovedAmt_CONSULTATIONTextBox;
	
	@FindBy(name = "approvedAilmentAmt")
	WebElement approvedAilmentAmtTextBox;
	
	@FindBy(xpath = "//button[@onclick='javascript:onUserSubmit1();']")
	WebElement finalSaveButton;
	
	@FindBy(xpath = "//div[@class='warningmessage']")
	WebElement tariffSuccessMsg;
	
	//New tariff STARTS
	//name=billNbr
	//name=billDate
	//id=billsave
	
	@FindBy(name = "billNbr")
	WebElement billNbrTextBox;
	
	@FindBy(name = "billDate")
	WebElement billDateCalender;
	
	@FindBy(id = "billsave")
	WebElement billSaveButton;
	
	@FindBy(xpath ="//img[@title='Add Line Items']")
	WebElement addLineItemsImg;
	

	@FindBy(id = "lineItemNbr")
	WebElement descriptionTextField;
	

	@FindBy(id = "accountHeadTypeID")
	WebElement accountHeadDD;
	
	
	@FindBy(name = "reqAmount")
	WebElement billTariffReqAmountTextField;
	
	@FindBy(id = "lineItemVO.requestedAmt")
	WebElement lineItemrequestedAmtTextField;

	@FindBy(id = "allwdAmt")
	WebElement allowedAmtTextField;
	
	
	@FindBy(id = "remarks")
	WebElement remarksTextField;
	
	
	
	@FindBy(id = "itemsave")
	WebElement itemSaveButton;
	
	
	@FindBy(name = "approvedAilmentAmt")
	WebElement approvedAmtTextField;
	
	//javascript:onUserSubmit1('save');
	
	//New tariff ENDS
	
	String FileName="PreauthTariffPageTestData";
	String SheetName="PreauthTariff";
	ExcelUtilities excelUtilities = new ExcelUtilities();
	
	public void newTarrif()
	{
		
		TestUtil.delayToSync();
		TestUtil.scrollDownMini();
		
		billNbrTextBox.sendKeys("1");
		//billDateCalender
		
		//int lastRowNum1=excelUtilities.rowCount(FileName, SheetName1);
		String oldDateOfAdmission=null;
		try 
		{
			oldDateOfAdmission = excelUtilities.readDOAFromExcel(FileName,SheetName);
			System.out.println("oldDateOfAdmission----"+oldDateOfAdmission);
		} 	
		catch (Exception e2) 
		{
			e2.printStackTrace();
		}
			
		//System.out.println("newDateTime----"+newDateTime);
		
		String newDateTime = TestUtil.dateIncrementer(oldDateOfAdmission);
		
		
		try {
				excelUtilities.writeToExceloldcode(newDateTime, FileName, SheetName);//write incremented date in excel
			} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		
		TestUtil.selectDateByJS(driver, billDateCalender, newDateTime);
		
		//billDateCalender.click();//captures system date
	//	billDateCalender.clear();//clears date
		//billDateCalender.sendKeys(newDateTime);
		
		
		
		billSaveButton.click();
		addLineItemsImg.click();
		
		TestUtil.delayToSync();
		TestUtil.scrollDownMini();
		descriptionTextField.sendKeys("1");
		//accountHeadDD
		
		Select dd = new Select(accountHeadDD);
		dd.selectByVisibleText("ANAESTHESIA CHARGES");
		
		String reqAmt = billTariffReqAmountTextField.getAttribute("value");
		lineItemrequestedAmtTextField.sendKeys(reqAmt);
		allowedAmtTextField.sendKeys(reqAmt);
		remarksTextField.sendKeys("remarks....");
		itemSaveButton.click();
		
		TestUtil.delayToSync();
		TestUtil.scrollDownMini();
		
		
		approvedAmtTextField.sendKeys(reqAmt);
		finalSaveButton.click();
	}
	
	public void tariff() {
		tariffRequestedAmt_CONSULTATIONTextBox.clear();
		tariffRequestedAmt_CONSULTATIONTextBox.sendKeys("200");
		
		tariffApprovedAmt_CONSULTATIONTextBox.clear();
		tariffApprovedAmt_CONSULTATIONTextBox.sendKeys("200");
		
		tariffRequestedAmt_CONSUMABLESANDDISPOSABLESTextBox.clear();
		tariffRequestedAmt_CONSUMABLESANDDISPOSABLESTextBox.sendKeys("800");
		
		tariffApprovedAmt_CONSUMABLESANDDISPOSABLESTextBox.clear();
		tariffApprovedAmt_CONSUMABLESANDDISPOSABLESTextBox.sendKeys("800");
	
		
		testUtil.delayToSync();
	
		
		approvedAilmentAmtTextBox.clear();
		approvedAilmentAmtTextBox.sendKeys("1000");
	

		
		testUtil.delayToSync();
		
	
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView();", finalSaveButton);
	//	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		finalSaveButton.click();
		finalSaveButton.click();
		
		testUtil.delayToSync();
		
		String screenName = "validateTariffSuccessMsg";
		testUtil.takeScreenshot(screenName);
		
		String validateTariffSuccessMsg = tariffSuccessMsg.getText();
		
	
		
		Assert.assertEquals(validateTariffSuccessMsg, "Record saved successfully!");
		
		Reporter.log("validateTariffSuccessMsg",true);
		Reporter.log("END -- OF --validateTariffSuccessMsg-- TESTCASE",true);
		
	}
	
	public void tariffEnhancePA() {
		tariffRequestedAmt_CONSULTATIONTextBox.clear();
		tariffRequestedAmt_CONSULTATIONTextBox.sendKeys("201");
		
		tariffApprovedAmt_CONSULTATIONTextBox.clear();
		tariffApprovedAmt_CONSULTATIONTextBox.sendKeys("201");
		
		tariffRequestedAmt_CONSUMABLESANDDISPOSABLESTextBox.clear();
		tariffRequestedAmt_CONSUMABLESANDDISPOSABLESTextBox.sendKeys("800");
		
		tariffApprovedAmt_CONSUMABLESANDDISPOSABLESTextBox.clear();
		tariffApprovedAmt_CONSUMABLESANDDISPOSABLESTextBox.sendKeys("800");
	
		
		testUtil.delayToSync();
	
		
		approvedAilmentAmtTextBox.clear();
		approvedAilmentAmtTextBox.sendKeys("1001");
	

		
		testUtil.delayToSync();
		
	
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView();", finalSaveButton);
	//	jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		finalSaveButton.click();
		finalSaveButton.click();
		
		testUtil.delayToSync();
		
		String screenName = "validateTariffSuccessMsg";
		testUtil.takeScreenshot(screenName);
		
		String validateTariffSuccessMsg = tariffSuccessMsg.getText();
		
	
		
		Assert.assertEquals(validateTariffSuccessMsg, "Record saved successfully!");
		
		Reporter.log("validateTariffSuccessMsg",true);
		Reporter.log("END -- OF --validateTariffSuccessMsg-- TESTCASE",true);
		
	}
	
	
}
