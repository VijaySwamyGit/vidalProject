//PACKAGE S
package com.qa.vidalhealth.Pages;
//PACKAGE E

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
//PACKAGE IMPORT S
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.ExcelUtilities;
//import com.qa.vidalhealth.Util.TestUtil;
//PACKAGE IMPORT E
import com.qa.vidalhealth.Util.TestUtil;
//import com.qa.vidalhealth.Util.UploadFileUsingAutoIt;

	//HOMEPAGE CLASS S
	public class HomePage extends TestBase 
	{
		//merge 12032020...
		//new
		//GLOBAL VARIABLES S
		String referenceNumberr;
		TestUtil testUtil = new TestUtil();
		static int dataEntrynavigationalPageIndexForuserAssign=0;
		
		//Robot robot;
		//GLOBAL VARIABLES E
		
	//CONSTRACTOR S	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//CONSTRACTOR E
	
	
	
	//PREAUTH NAVIGATIONAL DROPDOWN OPTIONS  WEBELEMENTS S
	
	@FindBy(xpath="//a[contains(text(),'Pre-Authorization')]")
	WebElement preAuthorizationContextMenu;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	WebElement searchOptionContextMenu;
	
	@FindBy(linkText="Medical")
	WebElement medicalOptionContextMenu;

	@FindBy(linkText="Tariff")
	WebElement tariffOptionContextMenu;
	
	@FindBy(linkText="Rule Data")
	WebElement rule_DataOptionContextMenu;
	
	@FindBy(linkText="Support Doc")
	WebElement supportDocOptionContextMenu;
	
	@FindBy(linkText="Authorization")
	WebElement authorizationOptionContextMenu;
	
	//PREAUTH NAVIGATIONAL DROPDOWN OPTIONS WEBELEMENTS E
	
	
	//PREAUTH NAVIGATIONAL DROPDOWN METHODS STARTS
	
	public void mouseHovermethod() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(preAuthorizationContextMenu);
	}
	
	public void clickOnSearchOptionContextMenu() 
	{
		preAuthorizationContextMenu.click();	
		TestUtil.delayToSync();
		searchOptionContextMenu.click();	
	}
	
	
	public void clickOnMedicalOptionContextMenu() 
	{
	preAuthorizationContextMenu.click();
	TestUtil.delayToSync();
	medicalOptionContextMenu.click();
	}

	public void authorizationOptionContextMenu() 
	{
	preAuthorizationContextMenu.click();
	TestUtil.delayToSync();
	authorizationOptionContextMenu.click();
	}

	public void tariffOptionContextMenu() 
	{
	preAuthorizationContextMenu.click();
	TestUtil.delayToSync();
	tariffOptionContextMenu.click();
	}

	public void ruleDataOptionContextMenu() 
	{
	preAuthorizationContextMenu.click();
	TestUtil.delayToSync();
	rule_DataOptionContextMenu.click();
	TestUtil.delayToSync();
	}


	public void supportDocOptionContextMenu() 
	{
		preAuthorizationContextMenu.click();
		TestUtil.delayToSync();
		supportDocOptionContextMenu.click();
	}
	
	
	//PREAUTH NAVIGATIONAL DROPDOWN METHODS ENDS
	
	
	@FindBy(xpath="//h1[contains(text(),'General Entry Details')]")
	WebElement homePageValidation;
	
	
	@FindBy(xpath = "//a[@title='Edit Reference No']")
	WebElement referenceNumberLink;
	
	@FindBy(xpath="//a[@title='Edit Reference No']/../../..")
	WebElement toDoTaskTable;

	
	/*@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(1,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage1;

	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(3,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage3;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(4,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage4;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(5,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage5;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(6,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage6;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(7,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage7;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(8,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage8;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(9,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage9;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(10,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage10;
	
	
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(1,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage11;
	
	//@FindBy(xpath="//a[@title='Page 2']")
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(2,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage12;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(3,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage13;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(4,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage14;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(5,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage15;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(6,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage16;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(7,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage17;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(8,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage18;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(9,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage19;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(10,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage20;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(1,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage21;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(2,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage22;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(3,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage23;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(4,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage24;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(5,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage25;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(6,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage26;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(7,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage27;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(8,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage28;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(9,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage29;
	
	@FindBy(xpath="//a[@onclick=\"javascript:pageIndex(10,'tDSelfAssignment')\"]")
	WebElement toDoTaskTableNavigationalPage30;*/
	
	//------------------
	
	@FindBy(xpath="//a[@onclick=\"javascript:PressForward('tDSelfAssignment')\"]")
	WebElement nextSetOfPagesIconToDoTask;
	
	@FindBy(xpath="//a[@onclick=\"javascript:PressBackWard('tDSelfAssignment')\"]")
	WebElement previousSetOfPagesIconToDoTask;
	
	
	
	
	//------------------------
	
	
	
	
	@FindBy(xpath="//a[@onclick=\"javascript:PressForward('tableData')\"]")
	WebElement nextSetOfPagesIconForDataEntry;
	
	@FindBy(xpath="//a[@onclick=\"javascript:PressBackWard('tableData')\"]")
	WebElement previousSetOfPagesIconForDataEntry;
	
	
	
	@FindBy(xpath="//img[@alt='Next Page']")
	WebElement nextPageIcon;
	
	
	

	
	public void nextSetOfPagesIconToDoTask()
	{
		nextSetOfPagesIconToDoTask.click();//11 to 20 pages
		
		try {
			
				if(nextSetOfPagesIconToDoTask.isEnabled())
				{
					nextSetOfPagesIconToDoTask.click();//21 to 30 pages
				}
				
			/*	try {
					if(nextSetOfPagesIconToDoTask.isEnabled())
					{
						nextSetOfPagesIconToDoTask.click();//21 to 30 pages
					}
				}catch(Exception e){
					return;
				}*/
			}
		catch(Exception e){
					//if(nextSetOfPagesIconToDoTask.isEnabled())
					{
						return;
					}
			  	  }
		
		
	}
	
	/*public void nextPageIconForDataEntry() {
		nextSetOfPagesIconForDataEntry.click();
	}*/

	
	
/*	@FindBy(xpath="//a[@title='Page']")
	WebElement toDoTaskTableNavigationalPage;*/
	
	
	public WebElement sendtoDoTaskTableName() 
	{
		return toDoTaskTable;
		
	}
	
	//
/*	public WebElement toDoTaskTableNavigationalPage() {
		 return toDoTaskTableNavigationalPage;
		
	}*/
	//
	
	//OPTIMISED
/*	public WebElement toDoTaskTableNavigationalPage2() {
		 return toDoTaskTableNavigationalPage2;
		
	}*/
	//OPTIMISED
	
	/*public WebElement toDoTaskTableNavigationalPage3() {
		 return toDoTaskTableNavigationalPage3;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage4() {
		 return toDoTaskTableNavigationalPage4;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage5() {
		 return toDoTaskTableNavigationalPage5;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage6() {
		 return toDoTaskTableNavigationalPage6;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage7() {
		 return toDoTaskTableNavigationalPage7;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage8() {
		 return toDoTaskTableNavigationalPage8;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage9() {
		 return toDoTaskTableNavigationalPage9;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage10() {
		 return toDoTaskTableNavigationalPage10;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage11() {
		 return toDoTaskTableNavigationalPage11;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage12() {
		 return toDoTaskTableNavigationalPage12;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage13() {
		 return toDoTaskTableNavigationalPage13;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage14() {
		 return toDoTaskTableNavigationalPage14;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage15() {
		 return toDoTaskTableNavigationalPage15;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage16() {
		 return toDoTaskTableNavigationalPage16;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage17() {
		 return toDoTaskTableNavigationalPage17;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage18() {
		 return toDoTaskTableNavigationalPage18;
		
	}
	
	public WebElement toDoTaskTableNavigationalPage19() {
		 return toDoTaskTableNavigationalPage19;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage20() {
		 return toDoTaskTableNavigationalPage20;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage21() {
		 return toDoTaskTableNavigationalPage21;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage22() {
		 return toDoTaskTableNavigationalPage22;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage23() {
		 return toDoTaskTableNavigationalPage23;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage24() {
		 return toDoTaskTableNavigationalPage24;
		
	}
	
	
	public WebElement toDoTaskTableNavigationalPage25() {
		 return toDoTaskTableNavigationalPage25;
		
	}
	*/

	
	
	
	//ASSIGNING CASE MANUALLY**********************
	
	@FindBy(xpath ="//img[@alt='upload']")
	WebElement ManualUpLoadIcon;

	@FindBy(xpath = "//input[@id='sentForm']")
	WebElement fromTextField;
	
	@FindBy(xpath = "//input[@id='datetimepicker1']")
	WebElement mailRxdDateCalender;
	
	@FindBy(xpath = "//input[@id='subject']")
	WebElement subjectTextField;
	
	@FindBy(xpath = "//textarea[@id='mailBody']")
	WebElement mailBodyTextField;
	
	
	@FindBy(xpath = "//input[@name='files']")
	WebElement attachmentIcon;
	
	
	@FindBy(xpath = "//button[@id='uploadid']")
	WebElement upLoadButton;
	
	@FindBy(xpath = "//a[@class='c_close']")
	WebElement closePopUp;
	
	@FindBy(xpath = "//h1[@onclick=\"javascript:queueStatus('PUAU')\"]")
	
	//@FindBy(xpath = "//h1[contains(text(),'2')]")
	WebElement unAssignedcasesLinkForDataEntry;
	
	@FindBy(xpath = "//img[@id='refID']")
	WebElement refreshIcon;
	
	

	//*******************
	
	//
	//method to get xpath of navigational Pages for "TO DO TASK" webtable S
	public WebElement userAssignmentIconXpath() 
	{
		String userAssignmentIconXpath="";
		String s1= "//a[@onclick='onUserAssignment(";
		//String s2= pageIndex+"";
		String s3= ",'tDSelfAssignment')\"]";
		userAssignmentIconXpath=userAssignmentIconXpath+s1+s3;
		WebElement userAssignmentIconWebElement =driver.findElement(By.xpath(userAssignmentIconXpath));
		return userAssignmentIconWebElement;
	}
	//method to get xpath of navigational Pages for "TO DO TASK" webtable E
	//
	
	
	
	
	@FindBy(xpath = "//input[@id='refNumber']")
	WebElement lastReferenceNumber;
	
	
	
	
	@FindBy(xpath="//select[@id='assignedSeqId']")
	WebElement assignToDD;
	
	@FindBy(xpath="//textarea[@id='remarks']")
	WebElement remarksTextArea;
	
	
	
	@FindBy(xpath="//button[@id='assignId']")
	WebElement assignButton;
	
	@FindBy(xpath= "//div[@class='c_popUps']")
	WebElement validateManualCaseAssignTextMsg;
	
	
/*	public String attachFiles(String FileName) {
		
		String FilePath="E:\\\\SVN-V3-automation\\\\Automation\\\\FilesToUpload";
		
		String FinalFilePath = FilePath+FileName;
		return FinalFilePath;
	}*/

	
	
public String assignCaseManuallyWhichCreatedManually() throws AWTException {
	
	
	
	HomePage homePage = new HomePage();
	ExcelUtilities excelUtilities = new ExcelUtilities();
	LoginPage loginPage=new LoginPage();
	TestUtil testUtil =new TestUtil();
	//UploadFileUsingAutoIt uploadFileUsingAutoIt = new UploadFileUsingAutoIt();
	int dataEntrynavigationalPageIndex=0;
	boolean flag=false;
	
		
	boolean flag2=false;
	int nextSetOfPagesIconCount=0;
	

		testUtil.delayToSync();

		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		testUtil.delayToSync();
		
		ManualUpLoadIcon.click();
		testUtil.delayToSync();
		fromTextField.sendKeys("vijay@vidalhealthtpa.com");
		mailRxdDateCalender.click();
		subjectTextField.sendKeys("subject");
		mailBodyTextField.sendKeys("mail body");
		
		TestUtil.delayToSync();

		//upload file code-------------------------------starts
		/*attachmentIcon.sendKeys("E:\\SVN-V3-automation\\Automation\\FilesToUpload\\UploadFile.pdf");
		
		String FileName="UploadFile.pdf";
		String FileToUpload = attachFiles(FileName);
		attachmentIcon.sendKeys(FileToUpload);
		
		robot = new Robot();
		TestUtil.delayToSync();
	


       try {
    	   robot.keyPress(KeyEvent.VK_ENTER);//While debugging Enter will have controll at code level so it will go to new line at code instaed of clicking in application
		TestUtil.delayToSync();
		System.out.println("Pressed enter key");
		robot.keyRelease(KeyEvent.VK_ENTER);
		TestUtil.delayToSync();
       }catch(Exception e) {
    	   upLoadButton.click();
    	   flag=true;
       }
		
		System.out.println("Released enter key---");*/
		
		//upload file code-------------------------------ends
		
		if(flag==false)
		{
			
		upLoadButton.click();
		TestUtil.delayToSync();
		TestUtil.delayToSync();
		}
		
		String screenName="manualCaseSuccess";
		TestUtil.takeScreenshot(screenName);
		
		
		closePopUp.click();
		
		testUtil.delayToSync();
		unAssignedcasesLinkForDataEntry.click();
		
		
		//---------------------------------------changes required---------------
	
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		testUtil.delayToSync();
		
		try {
			
				if(nextSetOfPagesIconForDataEntry.isEnabled())
				{
					nextSetOfPagesIconForDataEntry.click();//upto pages 20
					nextSetOfPagesIconCount++;
					System.out.println("nextSetOfPagesIconCount1--"+nextSetOfPagesIconCount);
					TestUtil.scrollDown();
					TestUtil.scrollDown();
				}
				
				//Code is used when there are 30 pages
				
				if(nextSetOfPagesIconForDataEntry.isEnabled())
				{
					nextSetOfPagesIconForDataEntry.click();//upto Pages 30
					nextSetOfPagesIconCount++;
					System.out.println("nextSetOfPagesIconCount2--"+nextSetOfPagesIconCount);
					TestUtil.scrollDown();
					TestUtil.scrollDown();
				}
			
			}   
		
			catch(Exception x) 
			{
				//optimization starts	
				if(nextSetOfPagesIconCount == 0 )//for navigating from 1 to 10 pages
				{
					dataEntrynavigationalPageIndex = TestUtil.navigationalPageXpathDataEntry(10);
					TestUtil.s();
					System.out.println("dataEntrynavigationalPageIndex page 1 to 10" + dataEntrynavigationalPageIndex);
					TestUtil.userAssignmentIconXpath(dataEntrynavigationalPageIndex);
				}
	//********************************************************************************************
				if(nextSetOfPagesIconCount == 1 )//for navigating from 11 to 20 pages
					//(Xpath for page 1 to 10 & 11 to 20 are same also user Assignee Icons)
					//sample XPATH	
				{
					//if(dataEntrynavigationalPageIndex<9)
					dataEntrynavigationalPageIndex = TestUtil.navigationalPageXpathDataEntry(10);
					TestUtil.s();
					System.out.println("dataEntrynavigationalPageIndex page 11 to 20 : " + dataEntrynavigationalPageIndex);
				    TestUtil.userAssignmentIconXpath(dataEntrynavigationalPageIndex);
			    }
	//********************************************************************************************
				if(nextSetOfPagesIconCount == 2 )//for navigating from 21 to 30 pages
				{
					dataEntrynavigationalPageIndex = TestUtil.navigationalPageXpathDataEntry(10);
					TestUtil.s();
					System.out.println("dataEntrynavigationalPageIndex page 21 to 30" + dataEntrynavigationalPageIndex);
					TestUtil.userAssignmentIconXpath(dataEntrynavigationalPageIndex);
				}
   //****************************************************************************************************
				//optimization ends
			}
//////////////////////////////////////////////////////////////

		testUtil.delayToSync();
		Select dd =new Select(assignToDD);
		dd.selectByIndex(1);
		testUtil.delayToSync();
		remarksTextArea.sendKeys("remarks");
		String referenceNumber = lastReferenceNumber.getAttribute("value");
		assignButton.click();
		testUtil.delayToSync();
		closePopUp.click();
		//String screenName= "assignCaseManuallyWhichCreatedManually";
		testUtil.takeScreenshot(screenName);
		return referenceNumber;
	}


	
	//ASSIGNING CASE MANUALLY**********************
	
	
public void clickOnReferenceNumberLink()
{
		referenceNumberLink.click();
}

public  String validateHomePageTitle() 
{

		return driver.getTitle();
		
}

	
public  String validateManualCaseAssign() 
{
		String validateManualCaseAssign = validateManualCaseAssignTextMsg.getText();
		return validateManualCaseAssign;
}
	
	


	
public void temRefresh() 
{
		TestUtil.delayToSync();
		unAssignedcasesLinkForDataEntry.click();
}
	
	
	
	
	//METHOD OVERLOADING CONCEPT
public void clickOnReferenceNumberLink3(String referenceNumber) 
{
	referenceNumberr=referenceNumber;
	String refXpath="//a[contains(text(),";
	refXpath=refXpath+"'"+referenceNumberr+"')]";
	WebElement refNumber = driver.findElement(By.xpath(refXpath));
	TestUtil.scrollUpMini();
	TestUtil.delayToSync();
	refNumber.click();
		
}

//METHOD OVERLOADING CONCEPT
public void clickOnReferenceNumberLink3(String referenceNumber, boolean flag1) 
{
	referenceNumberr=referenceNumber;
	String refXpath="//a[contains(text(),";
	refXpath=refXpath+"'"+referenceNumberr+"')]";
	WebElement refNumber = driver.findElement(By.xpath(refXpath));
	TestUtil.scrollDownMini();
	TestUtil.delayToSync();
	refNumber.click();	
}
////METHOD OVERLOADING CONCEPT



	}
	//HOMEPAGE CLASS E
