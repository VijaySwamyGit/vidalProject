package com.qa.vidalhealth.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.TestUtil;

public class PreAuthMedicalPage extends TestBase{
	
	
	
	
	public PreAuthMedicalPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//img[@alt='edit_icon']")
	WebElement medicalEditIcon;
	
	
	public void clickOnMedicalEditIcon(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		medicalEditIcon.click();
	}
	
	//MEDCAL INFORMATION
	
	
	@FindBy(id="ailmentDesc")
	WebElement complaintsTextBox;
	
	@FindBy(id="provisionalDiagnosis")
	WebElement 	provisionalDiagnosisandTreatmentTextBox;
	
	@FindBy(id="sysMed")
	WebElement systemOfMedicineDD;
	
	
	@FindBy(id="TreatmentType")
	WebElement treatmentTypeDD;
	
	
	
	@FindBy(id="treatmentPlanTypeID")
	WebElement planOfTreatmentDD;
	
	
	
	@FindBy(id="dischrgConditionType")
	WebElement dischrgConditionDD;
	
	
	
	@FindBy(id="hospitalizationDays")
	WebElement durationOfHospitalizationDaysTextBox;
	

	@FindBy(id="duration1")
	WebElement sinceWhenTextBox;
	
	
	/*@FindBy(xpath="//span[contains(text(),'Medical Entry Details update successfully !')]")
	WebElement medicalSuccessMsg;*/
	
	@FindBy(xpath="//span[contains(text(),'ICD and PCS Details added successfully !')]")
	WebElement medicalSuccessMsg;
	
	//
	
	
	
	public void medicalInformation() {
		
		HomePage homePage = new HomePage();
	//	homePage.clickOnMedicalOptionContextMenu();
		
		//medicalEditIcon.click();
		complaintsTextBox.clear();
		complaintsTextBox.sendKeys("complaints");
		provisionalDiagnosisandTreatmentTextBox.clear();
		provisionalDiagnosisandTreatmentTextBox.sendKeys("pd");
		//
		
		Select sysMedicine = new Select(systemOfMedicineDD);
		sysMedicine.selectByIndex(1);
		//
				
				Select planOfTreatment = new Select(planOfTreatmentDD);
				planOfTreatment.selectByIndex(1);
				
				
				Select specialty = new Select(treatmentTypeDD);
				specialty.selectByIndex(1);
						
		durationOfHospitalizationDaysTextBox.clear();
		durationOfHospitalizationDaysTextBox.sendKeys("1");
		
		Select dischrgCondition = new Select(dischrgConditionDD);
		dischrgCondition.selectByIndex(1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");*/
		sinceWhenTextBox.clear();
		sinceWhenTextBox.sendKeys("1");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		
		
	}
	
	//ICD CODING
	
	@FindBy(id="pcsSearchID")
	WebElement pcsCodingTextBox;
	
	@FindBy(id="icdSearchID")
	WebElement icdCodingTextBox;
	
	
	
	@FindBy(xpath="//button[@style='margin-left: 20px']")
	WebElement icdCodeAddButton;
	
	
	
	/*@FindBy(xpath="//div[contains(text(),'O30.2')]")
	WebElement selectICDCode;*/
	
	//Thread,sleep(3000);
	
	//00.01:THERAPEUTIC ULTRASOUND OF VESSELS OF HEAD AND NECK  ANTI-RESTENOTIC ULTRASOUND, INTRAVASCULAR NON-ABLATIVE ULTRASOUND
	@FindBy(xpath="//div[contains(text(),'A00.9:CHOLERA -  CHOLERA, UNSPECIFIED')]")
	WebElement selectICDCode;
	
	
	
/*	@FindBy(xpath="//input[@id='priAilment0']")
	WebElement primaryAilmentRadioButton;*/
	
	@FindBy(xpath="//select[@id='priAilment0']")
	WebElement primaryAilmentDropDown;
	
	@FindBy(xpath="//select[@id='HspType0']")
	WebElement hospitalizationTypeDD;
	
	
	@FindBy(xpath="//select[@id='Treatment0']")
	WebElement treatmentTypeDD2;
	
	@FindBy(xpath="//input[@id='diagnosisNameId0']")
	WebElement diagnosisNameTextField;
	
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	
	
	public void coding() {
		
		TestUtil testUtil = new TestUtil();
		//icdCodingTextBox.clear();
		//icdCodingTextBox.sendKeys("O30.0:MULTIPLE GESTATION -  TWIN PREGNANCY");
//		TestUtil.scrollDownMini();
		testUtil.delayToSync();
		icdCodingTextBox.clear();
		testUtil.delayToSync();
		icdCodingTextBox.sendKeys("A00.9");
		
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		
		testUtil.delayToSync();
		
		selectICDCode.click();
		testUtil.delayToSync();
		
	/*	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollTo(0, document.body.scrollHeight);");*/
		
		icdCodeAddButton.click();
		testUtil.delayToSync();
		
		
		
		
		/*primaryAilmentRadioButton.click();*/
		Select dd = new Select(primaryAilmentDropDown);
		dd.selectByIndex(0);
		
		
		Select dd1 = new Select(hospitalizationTypeDD);
		dd1.selectByIndex(1);
		
		Select dd2 = new Select(treatmentTypeDD2);
		dd2.selectByIndex(2);
		
		diagnosisNameTextField.clear();
		diagnosisNameTextField.sendKeys("diagnosisName");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)", "");
		
		saveButton.click();
		
		String coding = "codingDone";
		testUtil.takeScreenshot(coding);
		
		//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)", "");
		
		testUtil.delayToSync();
		
		String validatemedicalSuccessMsg = medicalSuccessMsg.getText();

		System.out.println("validatemedicalSuccessMsg----"+validatemedicalSuccessMsg);
		
		Assert.assertEquals(validatemedicalSuccessMsg, "ICD and PCS Details added successfully !");
		
		Reporter.log("validatemedicalSuccessMsg",true);
		Reporter.log("END -- OF --validatemedicalSuccessMsg-- TESTCASE",true);
	}
	
	//ICD CODING
	
	
	
	
	
	//MEDCAL INFORMATION
	

}
