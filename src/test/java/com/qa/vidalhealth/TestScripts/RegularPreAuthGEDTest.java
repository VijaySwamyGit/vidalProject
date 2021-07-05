//PACKAGE S
package com.qa.vidalhealth.TestScripts;
//PACKAGE E

import java.awt.AWTException;

//PACKAGE IMPORT S
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Pages.PreauthDataEntryExeHomePage;
import com.qa.vidalhealth.Pages.PreauthGEDPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.HandleWebTable;
import com.qa.vidalhealth.Util.TestUtil;
//import com.qa.vidalhealth.Util.TestUtil3;
//PACKAGE IMPORT E

	//CLASS RegularPreAuthGEDTest2 S
	public class RegularPreAuthGEDTest extends TestBase
	{
		
		//GLOBAL VARIABLE REFERENCES S
		HomePage homePage;
		LoginPage loginPage;
		TestUtil testUtil;
		PreauthGEDPage preauthGEDPage;
		PreauthDataEntryExeHomePage preauthDataEntryExeHomePage;
		ExcelUtilities excelUtilities;
		//GLOBAL VARIABLE REFERENCES E
			
			
		//CONSTRUCTOR S
		public RegularPreAuthGEDTest() 
		{
			PageFactory.initElements(driver, this);
		}
		//CONSTRUCTOR E
			
			
		@Test
		public void preauthGEDTest() throws AWTException 
		{
				
			//OBJECTS
			loginPage = new LoginPage();
			homePage = new HomePage();
			testUtil = new TestUtil();
			//OBJECTS
				
			/*String loginCredentials []=testUtil.loginCredentials();
			String un = loginCredentials[0];
			String pwd =loginCredentials[1];
				
			HomePage hp = loginPage.login(un, pwd);//LOGIN to application
*/				
			HandleWebTable handleWebTable = new HandleWebTable();
				
			//Below method creates case manually & assigns the created case to self
			String lastrefernceNumber=homePage.assignCaseManuallyWhichCreatedManually();
			lastrefernceNumber=lastrefernceNumber.trim();
			
			
			//--------------
			excelUtilities = new ExcelUtilities();
			//loginPage=new LoginPage();
			preauthDataEntryExeHomePage= new PreauthDataEntryExeHomePage();
			preauthGEDPage = new PreauthGEDPage();
				
			//======================PreauthGED DETAILS START===================================
				
			String FileName="PreauthGEDPageTestData";
			String SheetName1="PreauthGED";
			//----------------
				
				
			WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();//gets "to do task" table NAME
				
			homePage.temRefresh();//to refresh the screen
			//////////////////////////////////
			
			//method to check whether assigned(last reference number) is available in first page or not
			//If present then clicks on that found reference number
			boolean flag1 = handleWebTable.traverseFirstPageOfWebTable(tableNameWebElement, lastrefernceNumber);
				
			//To traverse up to 30 pages
			for(int pageNumber=2;pageNumber<=30;pageNumber++)
			{
					
				if(flag1==false) //if reference number is found in First page(it returns TRUE) it should not go to traverse next pages
				{
					//method to check whether assigned(last reference number) is available in next pages(2 to 30 pages) or not
					//If present then clicks on that found reference number
					boolean flag2= handleWebTable.traverseWebTable(tableNameWebElement,pageNumber,lastrefernceNumber);
						
					if(flag2==true) //if reference number is found in 2nd/3rd... page(it returns TRUE) it should not go to traverse next pages
										//once found so breaks
					{
						break;
					}
						
				}
					
			}
				
				
				
			//
			//----------------
			//=========================================TAGGING HOSPITAL DOCUMENTS=========================
			preauthGEDPage.tagHospitalDocuments();
						
			//=========================================TAGGING HOSPITAL DOCUMENTS=========================
						
						
			//==========================Hospital details===============================
			preauthGEDPage.regular_HospitalDetails();
			Reporter.log("Hospital Detials",true);
			Reporter.log("END -- OF --Hospital Details --",true);
			//==========================Hospital details===============================
			
			//==============CLAIMANT DETAILS START======================
			
			preauthGEDPage.regular_Claimant_Details();
			preauthGEDPage.exceptionalApprovalDocumentUploadAttachment();
						
			//get old date & increase it by one day and write back to excel
			int lastRowNum1=excelUtilities.rowCount(FileName, SheetName1);
			String oldDateOfAdmission=null;
			try 
			{
				oldDateOfAdmission = excelUtilities.readDOAFromExcel(FileName,SheetName1);
			} 	
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
				
			String newDateTime = TestUtil.dateIncrementer(oldDateOfAdmission);
			newDateTime = newDateTime+" "+"11:00 AM";
			try {
					excelUtilities.writeToExceloldcode(newDateTime, FileName, SheetName1);//write incremented date in excel
				} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
						
			preauthGEDPage.pre_Authorization_Details(lastRowNum1);//get test data from excel
						
						
			String screenName1 = "General Preauth Details";
						
			testUtil.takeScreenshot(screenName1);
			Reporter.log("Regular_General Preauth Detials",true);
			Reporter.log("END -- OF --Regular_General Preauth Details --",true);
						
						
					
						
			
					
			//=========================================SAVE PreauthGED screen=========================
						
			preauthGEDPage.preauthGEDSaveMethod();
			
			//===============================CAPTURE preauth number=======================================
					
			String preauthNo = preauthGEDPage.capturePreauthNumber();
			String preauthNumberGeneratedSuccessMsg = preauthNo;
			int length = preauthNumberGeneratedSuccessMsg.length();
			if(length>1) 
			{
						
				Assert.assertEquals(preauthNumberGeneratedSuccessMsg, preauthNo);
			}
			else
			{	
				Assert.assertEquals(preauthNumberGeneratedSuccessMsg, "TestCase failed because PA number not generated");
			}		
			Reporter.log("preauthNumberGeneratedSuccessMsg",true);
			Reporter.log("END -- OF --preauthNumberGeneratedSuccessMsg-- TESTCASE",true);
						
			excelUtilities = new ExcelUtilities();
			String FileName2="PreauthNo";
						
			try 
			{
				System.out.println("preauthNumber"+preauthNo);
				excelUtilities.writeToExceloldcode(preauthNo,FileName2,SheetName1);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			//----------------
				
				
		}
	}

	//CLASS RegularPreAuthGEDTest2 E

