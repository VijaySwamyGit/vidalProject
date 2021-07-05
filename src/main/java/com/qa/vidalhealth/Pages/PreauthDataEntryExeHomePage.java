package com.qa.vidalhealth.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.vidalhealth.Base.TestBase;

public class PreauthDataEntryExeHomePage extends TestBase {
	
	//CONSTRUCTOR-----------------------------------------------
	public PreauthDataEntryExeHomePage(){
		PageFactory.initElements(driver, this);
	}

	//WEBELEMENTS---------------------------------------------------
	//@FindBy(xpath = "//a[@title='Edit Reference No']")
	//@FindBy(xpath = "//a[contains(@href=\"javascript:edit(0,'tDSelfAssignment')\"]")
	//a[@href="javascript:edit(0,'tDSelfAssignment')"]
	//@FindBy(xpath = "//a[@href=\"javascript:edit(0,'tDSelfAssignment')\"]")
	
      @FindBy(xpath = "//a[@href=\"javascript:edit(0,'tDSelfAssignment')\"]")
      /////a[@href="javascript:edit(0,'tDSelfAssignment')"]
      WebElement referenceNumberLink;
	
	//METHODS------------------------------------------------------------
	/**
	 * Created By : VIJAY
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public void clickOnReferenceNumberLink() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		referenceNumberLink.click();
	}
	
}
