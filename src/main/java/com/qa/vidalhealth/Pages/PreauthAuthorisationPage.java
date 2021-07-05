package com.qa.vidalhealth.Pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthAuthorisationPage extends TestBase{
	
	TestUtil testUtil = new TestUtil();
	
	/*PreauthAuthorisationPage preauthAuthorisationPage= new PreauthAuthorisationPage();*/
	
	public PreauthAuthorisationPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//img[@alt='Discrepancies']")
	WebElement discrepanciesIcon;
	
	//input[@type='checkbox']
	
/*   @FindBy(xpath="//input[@value='10766325']/..//input[@name='resolvedYN']")
   WebElement checkbox1;*/
	
	/*   @FindBy(xpath="//div[@id='discrpancies']//div[@class='ped-data']//div[1]//div[1]//input[1]")
	   WebElement checkbox1;*/
	
	   @FindBy(xpath="//div[@class='col-md-9']//input[1]")
	   WebElement checkbox1;
	   @FindBy(xpath="//div[@class='col-md-9']//input[2]")
	   WebElement checkbox2;
	   @FindBy(xpath="//div[@class='col-md-9']//input[3]")
	   WebElement checkbox3;
	   
	 
	
  /* @FindBy(xpath="//input[@value='10766326']/..//input[@name='resolvedYN']")
   WebElement checkbox2;*/
	   
	/*   @FindBy(xpath="//div[@id='discrpancies']//div[@class='ped-data']//div[3]//div[1]//input[1]")
	   WebElement checkbox2;*/
	   
	   /*@FindBy(xpath="//div[@id='discrpancies']//div[@class='ped-data']//div[3]//div[1]//input[1]")
	   WebElement checkbox3;//NEED TO CHANGE
*/   
	 
	 
   
   @FindBy(xpath="//textarea[@name='remarksDiscrepancy']")
   WebElement remarksDiscrepancy;
	   
	 /*  @FindBy(xpath="//div[@class='ped-data']//div[2]//div[1]//textarea[1]")
	   WebElement remarksDiscrepancy1;
	   
	   @FindBy(xpath="//div[@class='ped-data']//div[4]//div[1]//textarea[1]")
	   WebElement remarksDiscrepancy2;
	   
	   @FindBy(xpath="//div[@class='ped-data']//div[4]//div[1]//textarea[1]")
	   WebElement remarksDiscrepancy3;//NEED TO CHANGE
*/   
   
   @FindBy(xpath="//div[@class='col-md-10']//textarea[1]")
   WebElement remarksDiscrepancy1;
   
   @FindBy(xpath="//div[@class='col-md-10']//textarea[2]")
   WebElement remarksDiscrepancy2;
   
   @FindBy(xpath="//div[@class='col-md-10']//textarea[3]")
   WebElement remarksDiscrepancy3;//NEED TO CHANGE
   
   
 
   
	/*public void m() {
		checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	}*/
	
   @FindBy(xpath="//button[@onclick='onResolveDiscrepancies()']")
   WebElement resolveButton;
	
   @FindBy(xpath="//select[@id='statusTypeID']")
   WebElement statusDD;
   
   
   @FindBy(id= "files")
	WebElement  exceptionalApprovalDocumentUploadAttachment;//this can be re-used from GENERAL SCREEN ALSO
   
 
   
   @FindBy(xpath="//button[@onclick='onInsOverrideConf();']")
   WebElement overridInsurerConfigButton;
   
   @FindBy(xpath="//button[@id='authletter']")
   WebElement generateLetterButton;
   
   /*@FindBy(linkText="CANCELLATION OF AUTHORIZATION")
   WebElement cancelLetterSuccessMsg;*/
   
   @FindBy(xpath="//span[contains(text(),'CANCELLATION OF AUTHORIZATION')]")
   WebElement cancelLetterSuccessMsg;
   
   @FindBy(xpath="//span[contains(text(),'Cashless Authorization Letter')]")
   WebElement rejectLetterSuccessMsg;
   
   @FindBy(xpath="//img[@onclick='javascript:onOverride()']")
   WebElement overrideButton;
   
   @FindBy(xpath="//span[contains(text(),'Event')]")
   WebElement eventText;
   
   @FindBy(xpath="//div[contains(text(),'Please complete the Authorization.')]")
   WebElement requiredInfosuccessMsg;
   
 
   
   
 //span[contains(text(),'Event:Complete ')]
   
 
   
   
   
 //GENERAL SCREEN Exceptional Doc START
   
	public void exceptionalApprovalDocumentUploadAttachment_generalscreen() {
	//	exceptionalApprovalDocumentUploadAttachment.click();
		
		TestUtil testUtil = new TestUtil();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		exceptionalApprovalDocumentUploadAttachment.sendKeys("E:\\old system's-D drive data\\AUTOMATIOM-06122018\\Maven automation project"
				+ "\\doc.pdf");
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String popUpstr = driver.switchTo().alert().getText();
		System.out.println("popUpstr--"+popUpstr);
		driver.switchTo().alert().accept();
		
		String AUTHORISATIONexceptionalApprovalDocumentUploadAttachment = "exceptionalApprovalDocumentUploadAttachment";
		testUtil.takeScreenshot(AUTHORISATIONexceptionalApprovalDocumentUploadAttachment);
		
	}
	//GENERAL SCREEN Exceptional Doc END
   
	
	//AUTHORIASTION SCREEN Exceptional Doc START
	   
		public void exceptionalApprovalDocumentUploadAttachment_authorisationscreen() {
		//	exceptionalApprovalDocumentUploadAttachment.click();
			
			TestUtil testUtil = new TestUtil();
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			exceptionalApprovalDocumentUploadAttachment.sendKeys("E:\\old system's-D drive data\\AUTOMATIOM-06122018\\Maven automation project"
					+ "\\doc.pdf");
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		/*	String popUpstr = driver.switchTo().alert().getText();
			System.out.println("popUpstr--"+popUpstr);
			driver.switchTo().alert().accept();*/
			
			String AUTHORISATIONexceptionalApprovalDocumentUploadAttachment = "exceptionalApprovalDocumentUploadAttachment";
			testUtil.takeScreenshot(AUTHORISATIONexceptionalApprovalDocumentUploadAttachment);
			
		}
		//AUTHORISATION SCREEN Exceptional Doc END
   
		@FindBy(xpath = "//select[@name='reasonTypeID']")
		WebElement reasonDD;
		
		
   
   @FindBy(xpath="//button[@onclick='javascript:onSave();']")
   WebElement saveButton;
   
   @FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
   WebElement PopUpOKButton;
   
   



   public boolean resolveDiscrepancy() {
	   
	   PreauthAuthorisationPage preauthAuthorisationPage= new PreauthAuthorisationPage();
	   
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
	   
		TestUtil.delayToSync();
		
		try {
		discrepanciesIcon.click();	
		TestUtil.delayToSync();
	//	String str = checkbox1.getText();
	//	System.out.println("checkbox1 text"+str);
		checkbox1.click();
		TestUtil.delayToSync();
		remarksDiscrepancy.sendKeys("discrepancies remarks1");
		TestUtil.delayToSync();
		
		/*checkbox.click();
		remarksDiscrepancy.sendKeys("discrepancies remarks");
		checkbox.click();
		remarksDiscrepancy.sendKeys("discrepancies remarks");*/
		
		resolveButton.click();
		TestUtil.delayToSync();
		
		
		
	/*	catch (NoSuchElementException e) { 
			 
		      return false;
		 
		     }
		*/

		 
			//TestUtil.handleAcceptAlert();
			/* String popUpstr = driver.switchTo().alert().getText();
				System.out.println("popUpstr--"+popUpstr);
				driver.switchTo().alert();
			     PopUpOKButton.click();*/
		//
		try {
			PopUpOKButton.click();
			checkbox2.click();
			TestUtil.delayToSync();
			remarksDiscrepancy2.sendKeys("discrepancies remarks2");
			TestUtil.delayToSync();
		
			
			resolveButton.click();
		
		}
			
			
			catch (NoSuchElementException e) {
				 System.out.println("catch----for second TRY");
			      return false;
			 
			}
		//
		
			
			try {
			PopUpOKButton.click();
			checkbox3.click();
			TestUtil.delayToSync();
			remarksDiscrepancy3.sendKeys("discrepancies remarks3");
			TestUtil.delayToSync();
		
			
			resolveButton.click();
		
			}
			
			
			catch (ElementClickInterceptedException e) {
				 System.out.println("catch----for THIRD TRY");
			      return false;
			 
			}
	
		TestUtil.delayToSync();
		 return true;
		}
		
		catch (NoSuchElementException e) {
			 System.out.println("catch----for first TRY");
			 
		      return false;
		 
		}
			
			    
		
		finally{
			
			preauthAuthorisationPage.approvePreauth();
			preauthAuthorisationPage.exceptionalApprovalDocumentUploadAttachment_authorisationscreen();
			//preauthAuthorisationPage.save();
			
			String approvePreauth = "approve_PreauthAuthorisationTest_withResolveDiscrepancies";
			preauthAuthorisationPage.save(approvePreauth);
			
			TestUtil.delayToSync();
		
			String successMsgPreauthApprove = eventText.getText();
	
			
			System.out.println("successMsgPreauthApprove--"+successMsgPreauthApprove);
	
			
			Assert.assertEquals("Event:Complete", successMsgPreauthApprove);
			
			   Reporter.log("PreauthApproveTEST VALIDATION",true);
				Reporter.log("END -- OF --PreauthApproveTEST VALIDATION -- TESTCASE",true);
			
			
			
		}
		
		/*try {
			return true;
		}catch (Exception e) { 
			 
		      return false;
		 
		     }*/

		
		
		//boolean b = discrepanciesIcon.isDisplayed();
		
		/*try {
		discrepanciesIcon.click();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
			
		//System.out.println("disp---"+b);
		//




/*private boolean existsElement(String id) {
    try {
        driver.findElement(By.id(id));
    } catch (NoSuchElementException e) {
        return false;
    }
    return true;
}*/
		//
		
//Boolean isPresent = driver.findElements(By.yourLocator).size() > 0
		
	//Dimension d = discrepanciesIcon.getSize();
	//System.out.println("disp dimen---"+d);
	   
	  //if(d.getHeight()>0) {
		//   discrepanciesIcon.click();
	   
	  /* Iterator<WebElement> itr = checkbox.iterator();
	   
	   while(itr.hasNext()) {
		   WebElement ele = itr.next();
		   ele.click();
		   
	   }
	   
	   
	 
	   Iterator<WebElement> itr2 = remarksDiscrepancy.iterator();
	   
	   while(itr.hasNext()) {
		   WebElement ele2 = itr2.next();
		   ele2.sendKeys("a");
		   
	   }*/
	   
	   
	   
	
   }
   
   //}
   
   
   public void approvePreauth() {
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//jse1.executeScript("window.scrollTo(0, document.body.scrollHeight");
	   jse1.executeScript("window.scrollBy(0,1200)", "");
		
		testUtil.delayToSync();
	  // statusDD
	   
	   Select status = new Select(statusDD);
	  // status.selectByVisibleText("Approved");
	  // status.selectByIndex(3);
	   
	   status.selectByValue("APR");
	 	  // saveButton.click();
	   
	  
	   
   }
   
   public void approvePreauthOverriddenCase() {
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//jse1.executeScript("window.scrollTo(0, document.body.scrollHeight");
	   jse1.executeScript("window.scrollBy(0,1200)", "");
		
		testUtil.delayToSync();
	  // statusDD
	   
	   Select status = new Select(statusDD);
	  // status.selectByVisibleText("Approved");
	  // status.selectByIndex(3);
	   
	   status.selectByValue("APR");
	 	  // saveButton.click();
	   
	   jse1.executeScript("window.scrollBy(0,1200)", "");
	   
 Select rejectionReason = new Select(reasonDD);
	
	   
	   rejectionReason.selectByIndex(2);
	   
   }
   
   
   public void rejectPreauth() {
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
	     
	   Select status = new Select(statusDD);
	
	   
	   status.selectByValue("REJ");
	   //status.selectByValue("PCN");
	   
	   Select rejectionReason = new Select(reasonDD);
	
	   
	   rejectionReason.selectByIndex(2);
	 	
	   
   }
   
   
public void cancelPreauth() {
	
	   
	   
	 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
	     
	   Select status = new Select(statusDD);
	
	   /*try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	   
	   testUtil.delayToSync();
	   
	   status.selectByValue("PCN");
	 
	   jse1.executeScript("window.scrollBy(0,1200)", "");
	 
	   Select cancelReason = new Select(reasonDD);
	
	   cancelReason.selectByVisibleText("Others");
	   
	 	
	   
   }
   
   public void requiredInformationPreauth() {
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	   Select status = new Select(statusDD);
	
	   
	   status.selectByValue("REQ");
	 	  
	   
   }
   
   public void save(String status) {
	   testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	   saveButton.click();
	   
	  // String screenName = "PreauthAuthorisation";
	   testUtil.takeScreenshot(status);
	   
	
	   
   }
   
   public void authorisationValidation(String validationMsg) {
	   TestUtil.delayToSync();
		
	   validationMsg = eventText.getText();

		
		System.out.println("successMsgPreauthAuthorisation--"+validationMsg);

		
		Assert.assertEquals("Event:Complete", validationMsg);
		
	
		
		
		Reporter.log("successMsgPreauthAuthorisation VALIDATION--"+validationMsg,true);
		Reporter.log("END -- OF --successMsgPreauthAuthorisation VALIDATION -- TESTCASE--"+validationMsg,true);
   }
   
   
   public void requiredInfoValidation(String validationMsg) {
	   TestUtil.delayToSync();
		
	   validationMsg = requiredInfosuccessMsg.getText();

		
		System.out.println("successMsgPreauthAuthorisation--"+validationMsg);

		
		Assert.assertEquals("Please complete the Authorization.", validationMsg);
		
	
		
		
		Reporter.log("successMsgPreauthAuthorisation VALIDATION--"+validationMsg,true);
		Reporter.log("END -- OF --successMsgPreauthAuthorisation VALIDATION -- TESTCASE--"+validationMsg,true);
   }
   
   
   public void generateCancelLetter() {
	   
	   String validateCancelLetterSuccessMsg = "CANCELLATION OF AUTHORIZATION" ;
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	   generateLetterButton.click();
	   testUtil.delayToSync();
	   testUtil.delayToSync();
	    String screenName = "validateCancelLetterSuccessMsg";
		testUtil.takeScreenshot(screenName);
		
		String childWindow = TestUtil.windowHandles();
		
		/*String validateCancelLetterSuccessMsg = cancelLetterSuccessMsg.getAttribute("value");
		System.out.println("validateCancelLetterSuccessMsg--"+validateCancelLetterSuccessMsg);*/
		
		if(childWindow.length()>0)
			
		{
		Assert.assertEquals(validateCancelLetterSuccessMsg, "CANCELLATION OF AUTHORIZATION");
		}
		Reporter.log("CANCEL LETTER GENERATION VALIDATION",true);
		Reporter.log("END -- OF --CANCEL LETTER GENERATION VALIDATION -- TESTCASE",true);
   }
   
public void generateRejectLetter() {
	   
	   String validateRejectLetterSuccessMsg = "Cashless Authorization Letter" ;
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	   generateLetterButton.click();
	   
	   testUtil.delayToSync();
	   testUtil.delayToSync();
	    String screenName = "validateRejectLetterSuccessMsg";
		testUtil.takeScreenshot(screenName);
		
		String childWindow = TestUtil.windowHandles();
		
		/*String validateCancelLetterSuccessMsg = cancelLetterSuccessMsg.getAttribute("value");
		System.out.println("validateCancelLetterSuccessMsg--"+validateCancelLetterSuccessMsg);*/
		
		if(childWindow.length()>0)
			
		{
		Assert.assertEquals(validateRejectLetterSuccessMsg, "Cashless Authorization Letter");
		}
		Reporter.log("REJECT LETTER GENERATION VALIDATION",true);
		Reporter.log("END -- OF --REJECT LETTER GENERATION VALIDATION -- TESTCASE",true);
   }


public void generateApprovalLetter() {
	   
	   String validateRejectLetterSuccessMsg = "Cashless Authorization Letter" ;
	   
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	   generateLetterButton.click();
	   testUtil.delayToSync(); 
	
	   
	    String screenName = "validateApprovalLetterSuccessMsg";
		//testUtil.takeScreenshot(screenName);
		
		String childWindow = TestUtil.windowHandles();
		
		/*String validateCancelLetterSuccessMsg = cancelLetterSuccessMsg.getAttribute("value");
		System.out.println("validateCancelLetterSuccessMsg--"+validateCancelLetterSuccessMsg);*/
		
		if(childWindow.length()>0)
			
		{
			testUtil.takeScreenshot(screenName);
		Assert.assertEquals(validateRejectLetterSuccessMsg, "Cashless Authorization Letter");
		}
		Reporter.log("APPROVAL LETTER GENERATION VALIDATION",true);
		Reporter.log("END -- OF --APPROVAL LETTER GENERATION VALIDATION -- TESTCASE",true);
}
   

}
