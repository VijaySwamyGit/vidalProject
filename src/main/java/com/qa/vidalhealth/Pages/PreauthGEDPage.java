package com.qa.vidalhealth.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.TestUtil;

public class PreauthGEDPage extends TestBase {
	
	//REFERENCES
	ExcelUtilities excelUtilities = new ExcelUtilities();
	TestUtil testUtil =new TestUtil(); 
	/*HomePage homePage = new HomePage();
	PreauthTariffPage preauthTariffPage =new PreauthTariffPage();
	PreauthAuthorisationPage preauthAuthorisationPage = new PreauthAuthorisationPage();*/
	

	
	//CONSTRUCTORS
	public  PreauthGEDPage(){
		PageFactory.initElements(driver, this);
	}
	
	//COMMON WEB-ELEMENTS***************************************************************
	//***********************************************************************************
	
	@FindBy(xpath= "//button[@data-open='selectEnrollment1']")
	WebElement  enrollmentIdButton;
	
	@FindBy(xpath= "//button[@data-open='selectHospital']")
	WebElement  empanelmentNumberButton;
	
	//preAuthNo
	
	@FindBy(xpath= "//input[@id='preAuthNo']")
	WebElement  preAuthNoTextField;
	//
	
	//----------------------------------------------
	
	@FindBy(id= "queueId")
	WebElement  moveToQueueDD;
	
	//@FindBy(id= "fileId")
	@FindBy(xpath= "//select[@name='tagFileName']")
	WebElement  hospitalDocumentsDD;

	//------------------------------------
	
	//************************************************************************************
	//************************************************************************************
	
	//TYPE OF DOCUMENTS START---------------------------------------------
	
	@FindBy(xpath="//button[@id='pId']")
	WebElement  hospFormIdsButton;
	
	
	

	
	@FindBy(id= "dId")
	WebElement  dischargeSummaryButton;
	
	@FindBy(id= "hId")
	WebElement  hospMainBillButton;
	
	@FindBy(id= "rId")
	WebElement  reportOnTestButton;
	
	@FindBy(id= "aId")
	WebElement  approvalMailsButton;
	
	@FindBy(id= "bId")
	WebElement  otherBillsButton;
	
	@FindBy(id= "oId")
	WebElement  otherDocsButton;
	
	@FindBy(xpath="h1[@align='center']")
	WebElement  NoFileToTagText;
	
	//************************************************************************************
	//************************************************************************************
	
	
	//TYPE OF DOCUMENTS ENDS-----------------------------------------------------------------
	
	//PREAUTH DETAILS WEBELEMENTS START---------------------------------------------------------------
	//********************************************************************************************
	//************************************************************************************************
	
	
	
	
	@FindBy(id= "preauthTypeDesc")
	WebElement  preauthTypeTextField;
	
	
	public void preauthType() {
		String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}
		
		
	}
	
	@FindBy(id= "admissionTypeId")
	WebElement  admissionTypeDD;
	
	@FindBy(id= "doctorName")
	WebElement  treatingDoctorTextField;
	
	@FindBy(id= "requestAmount")
	WebElement  requestedAmountTextField;
	
	@FindBy(id= "officeSeqID")
	WebElement  vidalHealthTPABranchDD;
	
	@FindBy(id= "priorityTypeId")
	WebElement  priorityDD;
	
	@FindBy(id= "datetimepicker1")
	WebElement  receivedDateTimeTextField;
		
	@FindBy(id= "datetimepicker2")
	WebElement  admissionDateTimeCalender;
	
	@FindBy(id= "preAuthRecvTypeId")
	WebElement  sourceDD;
	
	@FindBy(id= "hospitalCategoryId")
	WebElement  phoneDuringHospitalizationDD;
	
	@FindBy(id= "datetimepicker3")
	WebElement  dischargeDateTimeCalender;
	
	@FindBy(id= "dobonumber")
	WebElement  dOBOPreAuthNoTextField;

	@FindBy(id= "hospitalPhone")
	WebElement  nationalTextField;
	
	@FindBy(id= "preauthCategoryBenefitId")
	WebElement  preauthorizatioCategoryTextField;
	
	@FindBy(id= "insPhone")
	WebElement  insuredMobileNoTextField;
	
	@FindBy(id= "hosPhone")
	WebElement  hospitalInsuranceCoordinateNoTextField;
	
	@FindBy(id= "remarks")
	WebElement  remarksTextField;
	
	
	@FindBy(linkText="General entry details added Successfully")
	WebElement gEDSuccessMsg;
	
	//PREAUTH DETAILS WEBELEMENTS ENDS---------------------------------------------------------------
	
	//**************************************PA Enhance STARTS*************
	
	@FindBy(xpath="//input[@id='preAuthDetailVO.bdRequestAmount']")
	WebElement requestedAmountPAEnhanceTextField;
	
	@FindBy(xpath="//input[@id='preAuthDetailVO.bdPrevApprovedAmount']")
	WebElement prevRequestedAmountPAEnhanceTextField;
	
	public void enhancePaRequestedAmt() {
		
	
		
		
		//requestedAmountPAEnhanceTextField.click();
		String prevRequestedAmount = prevRequestedAmountPAEnhanceTextField.getAttribute("value");
		
		System.out.println("prevRequestedAmount--"+prevRequestedAmount);
		int prevRequestedAmounti = TestUtil.stringToInt(prevRequestedAmount);
		prevRequestedAmounti=prevRequestedAmounti+1;
		String prevRequestedAmountii = prevRequestedAmounti+"";
		
		System.out.println("prevRequestedAmountii--"+prevRequestedAmountii);
		requestedAmountPAEnhanceTextField.sendKeys(prevRequestedAmountii);
		TestUtil.scrollDown();
		ged_Search_saveButton.click();
	}
		/*homePage.tariffOptionContextMenu();
		preauthTariffPage.tariffEnhancePA();
		homePage.authorizationOptionContextMenu();
		TestUtil.scrollDown();
		preauthAuthorisationPage.approvePreauth();
		preauthAuthorisationPage.resolveDiscrepancy();
		
	}*/
	
	
	//****************************************PA Enhance ENDS*************
	
	//PRE AUTH DETAILS METHOD() START =====================================================================
	public void pre_Authorization_Details(int lastRowNum){
		
		String FileName="PreauthGEDPageTestData";
		String SheetName="PreauthGED";
		String colName="Values";
		String NumRow=""+lastRowNum;
		
		System.out.println("lastRowNum===="+lastRowNum);
		System.out.println("NumRow==="+NumRow);
	
		String pre_Authorization_Details[] = excelUtilities.getCellData(FileName, SheetName, colName,NumRow);
		
		
		
		testUtil.delayToSync();
			
			Select dd1 = new Select(admissionTypeDD);
			
			dd1.selectByVisibleText(pre_Authorization_Details[0]);
			
			//dd1.selectByIndex(0);
			
			treatingDoctorTextField.clear();
			treatingDoctorTextField.sendKeys(pre_Authorization_Details[1]);

			requestedAmountTextField.clear();
			requestedAmountTextField.sendKeys(pre_Authorization_Details[2]);

			Select dd2 = new Select(vidalHealthTPABranchDD);
		
			dd2.selectByVisibleText(pre_Authorization_Details[3]);

			Select dd3 = new Select(priorityDD);
		
			dd3.selectByVisibleText(pre_Authorization_Details[4]);

			admissionDateTimeCalender.clear();
			admissionDateTimeCalender.sendKeys(pre_Authorization_Details[5]);

			Select dd4 = new Select(sourceDD);
	
			dd4.selectByVisibleText(pre_Authorization_Details[6]);

			Select dd5 = new Select(phoneDuringHospitalizationDD);
		
			dd5.selectByVisibleText(pre_Authorization_Details[7]);
			
			dOBOPreAuthNoTextField.clear();
			dOBOPreAuthNoTextField.sendKeys(pre_Authorization_Details[8]);
			
			nationalTextField.clear();
			nationalTextField.sendKeys(pre_Authorization_Details[9]);

			insuredMobileNoTextField.clear();
			insuredMobileNoTextField.sendKeys(pre_Authorization_Details[11]);

			hospitalInsuranceCoordinateNoTextField.clear();
			hospitalInsuranceCoordinateNoTextField.sendKeys(pre_Authorization_Details[12]);
		
			remarksTextField.clear();
			remarksTextField.sendKeys(pre_Authorization_Details[13]);
			
			Select dd6 = new Select(preauthorizatioCategoryTextField);
			dd6.selectByVisibleText(pre_Authorization_Details[14]);
			
			
			
	}
	
	
	public void pAGEDDataProvider(String admissionType,String treatingDoctorName, String requestedAmount,String vidalHealthTPABranch,String priority, 
			String admissionDateTime, String source, String phoneDuringHospitalization,String dOBOPreAuthNo, String national, String preAuthSubType, 
			String insuredMobileNo, String hospitalInsuranceCoordinateNo, String remarks)
	{
		
		testUtil.delayToSync();
		
		Select dd1 = new Select(admissionTypeDD);
		
		dd1.selectByVisibleText(admissionType);
		
		//dd1.selectByIndex(0);
		
		treatingDoctorTextField.clear();
		treatingDoctorTextField.sendKeys(treatingDoctorName);

		requestedAmountTextField.clear();
		requestedAmountTextField.sendKeys(requestedAmount);

		Select dd2 = new Select(vidalHealthTPABranchDD);
	
		dd2.selectByVisibleText(vidalHealthTPABranch);

		Select dd3 = new Select(priorityDD);
	
		dd3.selectByVisibleText(priority);

		admissionDateTimeCalender.clear();
		admissionDateTimeCalender.sendKeys(admissionDateTime);

		Select dd4 = new Select(sourceDD);

		dd4.selectByVisibleText(source);

		Select dd5 = new Select(phoneDuringHospitalizationDD);
	
		dd5.selectByVisibleText(phoneDuringHospitalization);
		
		dOBOPreAuthNoTextField.clear();
		
		
		dOBOPreAuthNoTextField.sendKeys(dOBOPreAuthNo);
		
		nationalTextField.clear();

		nationalTextField.sendKeys(national);

		insuredMobileNoTextField.clear();
	
		insuredMobileNoTextField.sendKeys(insuredMobileNo);

		hospitalInsuranceCoordinateNoTextField.clear();
		
		hospitalInsuranceCoordinateNoTextField.sendKeys(hospitalInsuranceCoordinateNo);
	
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		
	}
	
	//PRE AUTH DETAILS METHOD() ENDS**************************************************************
	//***********************************************************************************************
	//**********************************************************************************************
	
	//-----------------------------------------------------------------------------------------
	//WEBELEMENTS for Different SECTIONS
	
	@FindBy(xpath= "//a[@data-open='Assignment']")
	WebElement  assignmentLink;
	
	@FindBy(xpath= "//a[@data-open='ClaimantDetails']")
	WebElement  claimantDetailsLink;
	
	@FindBy(xpath= "//a[@data-open='PolicyDetails']")
	WebElement  policyDetailsLink;
	
	@FindBy(xpath= "//a[@data-open='InsuranceCompany']")
	WebElement  insuranceCompanylink;
	
	@FindBy(xpath= "//a[@data-open='HospitalDetails']")
	WebElement  hospitalDetailsLink;
	//--------------------------------------------------------------------------
	
	//****************************************************************************************
	//******************************************************************************************
	
	//COMMON WEBELEMENTS*********************************************************
	
	@FindBy(id= "files")
	WebElement  exceptionalApprovalDocumentUploadAttachment;
	
	@FindBy(id= "backToDashId")
	WebElement  backButton;
	
	@FindBy(xpath= "//button[@id='preauthsaveId']")
	WebElement  GED_saveButton;
	
	@FindBy(xpath= "//button[@onclick='javascript:savePreAuth()']")
	WebElement  ged_Search_saveButton;
	
	
	
	//COMMON METHODS()
	
	public void exceptionalApprovalDocumentUploadAttachment() {

			String preauthType = preauthTypeTextField.getAttribute("value");
			if(preauthType.equalsIgnoreCase("Regular")) {
				return;
			}
			
		
		
			testUtil.delayToSync();
		
		
		exceptionalApprovalDocumentUploadAttachment.sendKeys("E:\\old system's-D drive data\\AUTOMATIOM-06122018\\Maven automation project"
				+ "\\doc.pdf");
	
		testUtil.delayToSync();
		
		String popUpstr = driver.switchTo().alert().getText();
		System.out.println("popUpstr--"+popUpstr);
		driver.switchTo().alert().accept();
		
		String GENERALexceptionalApprovalDocumentUploadAttachment = "exceptionalApprovalDocumentUploadAttachment";
		testUtil.takeScreenshot(GENERALexceptionalApprovalDocumentUploadAttachment);
		
	}
	
	public void preauthGEDSaveMethod() {
		
		testUtil.delayToSync();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		GED_saveButton.click();
		
		testUtil.delayToSync();
		
		String preAuthNo = "preAuthNoGenerated";
		testUtil.takeScreenshot(preAuthNo);
		
		
	//	String validateGEDSuccessMsg = gEDSuccessMsg.getText();


		
		//Assert.assertEquals(validateGEDSuccessMsg, "General entry details added Successfully");
		
		Reporter.log("validateGEDSuccessMsg",true);
		Reporter.log("END -- OF --validateGEDSuccessMsg-- TESTCASE",true);
		
		
		
		
		
	}
	
	
public void ged_Search_saveButtonMethod() {
		
		testUtil.delayToSync();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		ged_Search_saveButton.click();
		
		testUtil.delayToSync();
		
		//String preAuthNo = "preAuthNoGenerated";
		//testUtil.takeScreenshot(preAuthNo);
		
		
	//	String validateGEDSuccessMsg = gEDSuccessMsg.getText();


		
		//Assert.assertEquals(validateGEDSuccessMsg, "General entry details added Successfully");
		
		//Reporter.log("validateGEDSuccessMsg",true);
		//Reporter.log("END -- OF --validateGEDSuccessMsg-- TESTCASE",true);
		
		
		
		
		
	}
	
	//***************************************************************************************
	//**************************************************************************************
	
	//--------------------------------------------------------------------------------------------
	
	
	
	//CLAIMANT DETAILS WEBELEMENTS START--------------------------------------------------------------
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
	
	
	
	@FindBy(xpath= "//input[@name='policyNbr']")
	WebElement  select_Enrollment_policyNumberTextField;
	
	@FindBy(xpath= "//button[@id='endId']")
	WebElement  select_Enrollment_PolicySearchButton;
	
	@FindBy(xpath= "//a[@href=\"javascript:edit(0,'tableData')\"]")
	WebElement  select_Enrollment_Enrl_ID_Link;
	
	//a[@href="javascript:edit(0,'tableData')"]

	

	@FindBy(id= "claimantVO.name")
	WebElement  claimantNameTextField;
	
	@FindBy(id= "additionalDetailVO.relationshipTypeId")
	WebElement  relationshipDD;
	
	@FindBy(id= "claimantVO.age")
	WebElement  ageTextField;
	
	@FindBy(id= "claimantVO.location")
	WebElement  locationDD;
	
	@FindBy(id= "cldatetimepicker1")
	WebElement  dateOfInceptionCalender;
	
	@FindBy(id= "cldatetimepicker2")
	WebElement  dateOfExitCalender;
	
	@FindBy(id= "claimantVO.totalSumInsured")
	WebElement  totalSumInsuredTextField;
	
	@FindBy(id= "claimantVO.availSumInsured")
	WebElement  availSumInsuredTextField;
	
	@FindBy(id= "claimantVO.cumulativeBonus")
	WebElement  cumulativeBonusTextField;
	
	@FindBy(id= "claimantVO.categoryDesc")
	WebElement  categoryDescTextField;
	
	@FindBy(id= "claimantVO.emailID")
	WebElement  emailIDTextField;
	
	@FindBy(id= "claimantVO.insCustCode")
	WebElement  insCustCodeTextField;
	
	@FindBy(id= "claimantVO.aadhaarNbr")
	WebElement  aadhaarNbrTextField;
	
	@FindBy(id= "claimantVO.panNbr")
	WebElement  panNbrTextField;

	//CLAIMANT DETAILS WEBELEMENTS ENDS-------------------------------------------------------------
	
	//CLAIMANT DETAILS METHOD() START manual/regular with/without enrl ID====================================================================
	public void claimant_Details (int lastRowNum){
		
		
		
		//preauthGEDPage.preauthType();
		
		testUtil.delayToSync();
		
		String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}
		
		String FileName="PreauthGEDPageTestData";
		String SheetName="ClaimantDetails";
		String colName="Values";
		String NumRow=""+lastRowNum;
		
		claimantDetailsLink.click();
		
		String claimant_Details[] = excelUtilities.getCellData(FileName, SheetName, colName,NumRow);
		
		claimantNameTextField.clear();
		claimantNameTextField.sendKeys(claimant_Details[0]);
		//claimantNameTextField.sendKeys("dhan");
		
		//relationshipDD
		Select dd1 = new Select(relationshipDD);
		dd1.selectByVisibleText(claimant_Details[1]);
		
		ageTextField.clear();
		ageTextField.sendKeys(claimant_Details[3]);
		
		//locationDD
		Select dd2 = new Select(locationDD);
		dd2.selectByVisibleText(claimant_Details[4]);
		
		//dateOfInceptionCalender.sendKeys(claimant_Details[5]);
		//dateOfExitCalender.sendKeys(claimant_Details[6]);
		
		totalSumInsuredTextField.clear();
		totalSumInsuredTextField.sendKeys(claimant_Details[7]);
		availSumInsuredTextField.sendKeys(claimant_Details[8]);
		availSumInsuredTextField.clear();
		cumulativeBonusTextField.sendKeys(claimant_Details[9]);
		categoryDescTextField.clear();
		categoryDescTextField.sendKeys(claimant_Details[10]);
		emailIDTextField.clear();
		emailIDTextField.sendKeys(claimant_Details[11]);
		
		categoryDescTextField.click();
		
		//emailIDTextField.click();
		
	/*	Actions act = new Actions(driver);
		act.click();*/
		
		//for chrome(SCROLL IS NOT WORKING NEED TO CHECK)
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		//for chrome(SCROLL IS NOT WORKING NEED TO CHECK)
		
		/*insCustCodeTextField.clear();
		insCustCodeTextField.sendKeys(claimant_Details[12]);
		aadhaarNbrTextField.clear();
		aadhaarNbrTextField.sendKeys(claimant_Details[13]);
		panNbrTextField.clear();
		panNbrTextField.sendKeys(claimant_Details[14]);*/
		
		String screenName2 = "Claimant Details";
		testUtil.takeScreenshot(screenName2);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-open='PolicyDetails']")));*/
	
	}
	
	//CLAIMANT DETAILS METHOD() ENDS*********manual/regular with/without enrl ID==********************************************************
	

	//
	//CLAIMANT DETAILS METHOD() START regular with enrl ID====================================================================
		public void regular_Claimant_Details (){
			
			
			
			//preauthGEDPage.preauthType();
			
			testUtil.delayToSync();
			
			/*String preauthType = preauthTypeTextField.getAttribute("value");
			if(preauthType.equalsIgnoreCase("Regular")) {
				return;
			}*/
	/*		
			String FileName="PreauthGEDPageTestData";
			String SheetName="ClaimantDetails";
			String colName="Values";
			String NumRow=""+lastRowNum;*/
			
			claimantDetailsLink.click();
			testUtil.delayToSync();
			editIcon.click();
			testUtil.delayToSync();
			select_Enrollment_policyNumberTextField.sendKeys("212800FLTAUTO");
			select_Enrollment_PolicySearchButton.click();
			select_Enrollment_Enrl_ID_Link.click();
			
			String screenName2 = "Regular_Claimant Details";
			testUtil.takeScreenshot(screenName2);
			
			
		/*	Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE).perform();*/
		
			/*WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-open='PolicyDetails']")));*/
		
		}
		
		//CLAIMANT DETAILS METHOD() ENDS*********Regular with enrl ID==********************************************************
	//

	
	
	
	//COMMON LINKS WEBELEMENTS START---------------------------------------------------------------
	
	@FindBy(xpath= "//img[@title='Close']")
	WebElement  closeLink;
	
	@FindBy(xpath= "//img[@alt='edit_icon']")
	WebElement  editIcon;
	
	//COMMON LINKS WEBELEMENTS ENDS---------------------------------------------------------------
	
	//POLICY DETAILS WEB-ELEMENTS START-----------------------------------------------
	
	@FindBy(id= "policyEditid")
	WebElement  policyEditIcon;
	
	@FindBy(id= "claimantVO.policyNbr")
	WebElement  policyNbr;
	
	@FindBy(id= "//a[@href=\"javascript:edit(0,'tdPolicy')\"]")
	WebElement  selectPolicyLink;
	
	@FindBy(xpath= "policySearchId")
	WebElement  selectPolicySearch;
	
	@FindBy(id= "policyTypeId")
	WebElement  policyTypeDD;
	
	
	@FindBy(id= "claimantVO.termStatusId")
	WebElement  termStatusDD;
	
	@FindBy(id= "claimantVO.policySubTypeId")
	WebElement  policySubTypeDD;
	
	@FindBy(id= "policyHolNameId")
	WebElement  policyHolNameTextField;
	
	@FindBy(id= "claimantVO.phone")
	WebElement  phoneTextField;
	
	
	@FindBy(id= "pldatetimepicker1")
	WebElement  policyStartDateCalender;
	
	@FindBy(id= "pldatetimepicker2")
	WebElement  policyEndDateCalender;
	
	//
	
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
	//POLICY DETAILS METHOD() START for manual/regular case with/without enrollment Id====================================================================
	public void policy_Details (int lastRowNum){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}
		
		policyDetailsLink.click();
		
		String FileName="PreauthGEDPageTestData";
		String SheetName="PolicyDetails";
		String colName="Values";
		String NumRow=""+lastRowNum;
		
		/*try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//policyDetailsLink.click();
		System.out.println("---pd--"+FileName);
		System.out.println("---pd--"+SheetName);
		System.out.println("---pd--"+colName);
		System.out.println("---pd--"+NumRow);
		
		
		String policy_Details[] = excelUtilities.getCellData(FileName, SheetName, colName,NumRow);
		
		System.out.println("---pd--"+policy_Details[0]);

	//	policyNbr.sendKeys(policy_Details[0]);

		
			Select dd1 = new Select(policyTypeDD);
				dd1.selectByVisibleText(policy_Details[1]);
				
				Select dd2 = new Select(termStatusDD);
				dd2.selectByVisibleText(policy_Details[2]);
				
				Select dd3 = new Select(policySubTypeDD);
				dd3.selectByVisibleText(policy_Details[3]);
		
	//	policyHolNameTextField.sendKeys(policy_Details[4]);
	//	phoneTextField.sendKeys(policy_Details[5]);
		//policyStartDateCalender.sendKeys(policy_Details[6]);
		//policyEndDateCalender.sendKeys(policy_Details[7]);
		
		String screenNamePD = "Policy Details";
		testUtil.takeScreenshot(screenNamePD);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();;
	
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-open='InsuranceCompany']")));*/
		

		

		

	
	}
	
	
	//POLICY DETAILS WEBELEMENTS ENDS--------for manual/regular case with/without enrollment Id==---------------------------------------
	
	//
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
	//POLICY DETAILS METHOD() START for Regular case with enrollment Id====================================================================
	public void regular_Policy_Details (int lastRowNum){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}*/
		
		policyDetailsLink.click();
		
		policyEditIcon.click();
		
		policyNbr.sendKeys("122200FLTAUTO");
		
		selectPolicySearch.click();
		
		selectPolicyLink.click();
		
		//String dateOfAdmission = policyStartDateCalender.getAttribute("value");
		
		//a[@href="javascript:edit(0,'tdPolicy')"]
		
		String FileName="PreauthGEDPageTestData";
		String SheetName="PolicyDetails";
		String colName="Values";
		String NumRow=""+lastRowNum;
		
		/*try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//policyDetailsLink.click();
		System.out.println("---pd--"+FileName);
		System.out.println("---pd--"+SheetName);
		System.out.println("---pd--"+colName);
		System.out.println("---pd--"+NumRow);
		
		
		//String policy_Details[] = excelUtilities.getCellData(FileName, SheetName, colName,NumRow);
		
		//System.out.println("---pd--"+policy_Details[0]);

	//	policyNbr.sendKeys(policy_Details[0]);

		/*
			Select dd1 = new Select(policyTypeDD);
				dd1.selectByVisibleText(policy_Details[1]);
				
				Select dd2 = new Select(termStatusDD);
				dd2.selectByVisibleText(policy_Details[2]);
				
				Select dd3 = new Select(policySubTypeDD);
				dd3.selectByVisibleText(policy_Details[3]);*/
		
	//	policyHolNameTextField.sendKeys(policy_Details[4]);
	//	phoneTextField.sendKeys(policy_Details[5]);
		//policyStartDateCalender.sendKeys(policy_Details[6]);
		//policyEndDateCalender.sendKeys(policy_Details[7]);
		
		String screenNamePD = "Regular_Policy Details";
		testUtil.takeScreenshot(screenNamePD);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();;
	
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-open='InsuranceCompany']")));*/
		

		

		

	
	}
	
	
	//POLICY DETAILS WEBELEMENTS ENDS--------Regular case with enrollment Id==---------------------------------------
	
	//
	
	
	//INSURANCE COMPANY WEBELEMENTS START-------------------------------------------------------------
	
	//@FindBy(id= "insuranceEdit")
	
	@FindBy(xpath= "//img[@id='insuranceEdit']")
	WebElement  insuranceEditIcon;
	
	//Select Insurance Company branch
	
	@FindBy(name= "insuranceSeqID")
	WebElement  insuranceCompanyDD;
	
	
	@FindBy(name= "companyCodeNbr")
	WebElement  companyCodeTextbox;
	
	//@FindBy(xpath= "//button[@type='button']")
	@FindBy(id= "enrlInsCompanyId")
	WebElement  insuranceSearchButton;
	
	
	@FindBy(xpath= "//a[contains(text(),'122200')]")
	WebElement  selectCompanyCodeLink;
	
	
	
	
/*	public void insurance_Company_Details() {
		
		insuranceEditIcon.click();
		
		Select dd = new Select(insuranceCompanyDD);
		dd.selectByVisibleText("ORIENTAL INSURANCE COMPANY LIMITED");
		
		companyCodeTextbox.sendKeys("121200");
		searchButton.click();
		companyCodeLink.click();
		
	}*/
	
	
	//INSURANCE COMPANY WEBELEMENTS END-------------------------------------------------------------
	
	//HOSPITAL DETAILS WEBELEMENTS START-------------------------------------------------------------
	//@FindBy(xpath= "//img[@title='Edit']")
	@FindBy(xpath= "//img[@id='HospitalDetailsId']")
	//img[@title='Edit']
	WebElement  hospDetailsEditIcon;
	
	@FindBy(xpath= "//input[@id='preAuthHospitalVO.EmplNumber']")
	WebElement  preAuthHospitalVOEmplNumberTextFieldFreezed;
	
	
	@FindBy(name= "hospitalName")
	WebElement  hospitalNameTextBox;
	
	
	@FindBy(id= "hospitalId")
	WebElement  hospSearchButton;
	
	@FindBy(xpath= "//a[contains(text(),'A G PADMAVATHI HOSPITAL')]")
	WebElement  selectHospitalLink;
	
	
	
	
	/*public void hospitalDetails() {
		insuranceEditIcon.click();
		hospitalNameTextBox.sendKeys("A G P");	
		searchButton.click();
		hospitalLink.click();
		
	}*/
	
	
	
	
	
	
	//HOSPITAL DETAILS WEBELEMENTS ENDS-------------------------------------------------------------
	
	
	//COMMON ACTIONS/METHODS() START-------------------------------------------------------------------
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
	public void clickOnSaveButton() {
		ged_Search_saveButton.click();
	}
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
	public void clickOnBackButton() {
		backButton.click();
		
	}
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
	public void clickOnEditIcon() {
		//closeLink.click();
		editIcon.click();
	}
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
	public void clickOnCloseIcon() {
		//editIcon.click();
		closeLink.click();
	}
		//COMMON ACTIONS/METHODS() ENDS-------------------------------------------------------------------
	
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

    //METHOD() TO MOVE DOCUMENTS to RESPECTIVE FOLDER START =============================================
	
	//List<WebElement> optionCount = driver.findElements(By.xpath("//select/option"));
	//System.out.println(optionCount.size());
	//browser.select_list(:id=> 'id').options.count
	/*public void moveDocsToRespectiveFolder() {
		int count=0;
		
		Select dd = new Select(hospitalDocumentsDD);
		
		//List<WebElement> optionCount = hospitalDocumentsDD.findElements(hospitalDocumentsDD);
		System.out.println(optionCount.size());
		for(int i=0;i<count;i++) {
			dd.selectByIndex(i);

			
		}

		
	}*/
	
	
	
	
	//METHOD() TO MOVE DOCUMENTS to RESPECTIVE FOLDER ENDS*****************************************************


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
	//ASSIGNMENT METHOD() START========================================================================
	public void assignment(){
		
		
	}
	//ASSIGNMENT METHOD() ENDS****************************************************************
	
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
	
	//POLICY DETAILS METHOD() START====================================================================
	public void policy_Details(){
	
	}
	//POLICY DETAILS METHOD() ENDS**********************************************************************

	
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
	
	//INSURANCE COMPANY METHOD() START=========================================================

	public void insurance_Company_Details() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		insuranceCompanylink.click();
		
		testUtil.delayToSync();
	
		insuranceEditIcon.click();
		
		Select dd = new Select(insuranceCompanyDD);
		dd.selectByVisibleText("ORIENTAL INSURANCE COMPANY LIMITED");
		
		companyCodeTextbox.sendKeys("122200");
		
		testUtil.delayToSync();
		
		insuranceSearchButton.click();
		String screenNameINS = "Insurance Company Details";
		testUtil.takeScreenshot(screenNameINS);
		selectCompanyCodeLink.click();

		
	}
	//INSURANCE COMPANY METHOD() ENDS****************************************************************

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
	
	//HOSPITAL DETAILS METHOD() START===========================================================================
	
	//TESTING PURPOSE
	@FindBy(xpath="//input[@id='preAuthHospitalVO.EmplNumber']")
	WebElement  empanelmentNoFreezedTTextField;
	
	@FindBy(xpath="//img[@alt='Cancel']")
	WebElement  hospCancelIcon;
	//TESTING PURPOSE
	
	
	

	public void hospitalDetails() {
		
		testUtil.delayToSync();
		
		String preauthType = preauthTypeTextField.getAttribute("value");
		if(preauthType.equalsIgnoreCase("Regular")) {
			return;
		}
		
		//for chrome
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		//for chrome
		
		hospitalDetailsLink.click();
		
		testUtil.delayToSync();
		//
	
		
		
		/* JavascriptExecutor js = ((JavascriptExecutor) driver);  
		js.executeScript("arguments[0].scrollIntoView(true);", hospDetailsEditIcon); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", hospDetailsEditIcon);*/
		
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 15);
		//wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='HospitalDetailsId']")));


		hospDetailsEditIcon.click();
		testUtil.delayToSync();
		
	
		
		hospitalNameTextBox.sendKeys("A G P");	
		hospSearchButton.click();
		String screenNameHOS = "Hospital Details";
		testUtil.takeScreenshot(screenNameHOS);
		selectHospitalLink.click();

		
	}
	//HOSPITAL DETAILS METHOD() ENDS***********************************************************
	
	//REGULAR-HOSPITAL DETAILS METHOD() STARTS******
	
public void regular_HospitalDetails() {
		
		testUtil.delayToSync();
		
		//for chrome
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		//for chrome
		
		hospitalDetailsLink.click();
		
		testUtil.delayToSync();
	
		hospDetailsEditIcon.click();
		testUtil.delayToSync();
		
	
		
		hospitalNameTextBox.sendKeys("A G P");	
		hospSearchButton.click();
		String screenNameHOS = "Hospital Details";
		testUtil.takeScreenshot(screenNameHOS);
		selectHospitalLink.click();

		
	}
	////REGULAR-HOSPITAL DETAILS METHOD() ENDS*************************************************************
	
	//*************TAGGING HOSPITAL DOCUMENTS**************************************
	//*************************************************************************************
	
	public void tagHospitalDocuments() {
		
		//hospitalDocumentsDD
		Select dd = new Select(hospitalDocumentsDD);
		List<WebElement> ddOptions = dd.getOptions();
		
		System.out.println("ddOptions---" + ddOptions);
		int docCount = ddOptions.size()-1;
		System.out.println("docCount---" + docCount);
		//hospFormIdsButton
		//Iterator iterator = ddOptions.iterator();
		
		//while(iterator.hasNext()) {
			for(int i=1;i<=docCount;i++) {
				
			dd.selectByIndex(i);
			System.out.println("i value--"+i);
		//	if(i==docCount)
			//	break;
			//iterator.next();
			
			
			testUtil.delayToSync();
		
			
		
			hospFormIdsButton.click();
			testUtil.delayToSync();
			
			String screenNameDocTag = "Doc tagging";
			testUtil.takeScreenshot(screenNameDocTag);
		}
		
		
	}
		
		

	

	//********************Capturing Preauth Number****************************************************
	//*****************************************************************************
	
	public String capturePreauthNumber()
	{
		
		String preauthNo = preAuthNoTextField.getAttribute("value");
		return preauthNo;
		
	}
	
	
	//********************Additional Details*************************************************************************
	//**************************************************************************
	
	@FindBy(xpath= "//a[@data-open='AdditionalDetails']")
	WebElement  additionalDetailsLink;
	
	//
	
	@FindBy(xpath= "//input[@id='additionalDetailVO.referenceNbr']")
	WebElement  referenceNoTextField;
	
	
	@FindBy(xpath= "//input[@id='additionalDetailVO.employeeNbr']")
	WebElement  empNoTextField;
	
	@FindBy(xpath= "//input[@id='additionalDetailVO.employeeName']")
	WebElement  empNameTextField;
	
	
	
	public void clickOnAdditionalDetailsLink() {
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-1000)", "");
		
		testUtil.delayToSync();
		
		
		
		String preauthType = preauthTypeTextField.getAttribute("value");
		System.out.println("addnl details preauthType before if cond---"+preauthType);
		if(preauthType.equalsIgnoreCase("Regular")) {
			System.out.println("addnl details preauthType after if cond---"+preauthType);
			return;
		}
		
		
		testUtil.delayToSync();
		
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		testUtil.delayToSync();
		
	
		
		additionalDetailsLink.click();
		
		testUtil.delayToSync();
		
		//FOR REGULAR PREAUTH
		
/*		boolean b=empNoTextField.isEnabled();
		System.out.println("empNoTextField---"+b);
		
		boolean bb=referenceNoTextField.isEnabled();
		System.out.println("referenceNoTextField---"+bb);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!empNoTextField.isEnabled()) {
			
			
			return;
		}
		

		if(referenceNoTextField.isEnabled()) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE).perform();
			return;
		}*/
		
		
		
		//FOR REGULAR PREAUTH
		
		empNoTextField.sendKeys("1023");
		testUtil.delayToSync();
		empNameTextField.sendKeys("EMPname");
		testUtil.delayToSync();
		
		String clickOnAdditionalDetailsLink = "clickOnAdditionalDetailsLink";
		
	
		
		testUtil.takeScreenshot(clickOnAdditionalDetailsLink);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
	}
	

	
	
	//********************Additional Details*************************************************************************
	//**************************************************************************
	
	
	//********************CorpNonCorp Details*************************************************************************
	//**************************************************************************
	@FindBy(xpath= "//a[@data-open='CorporateDetails']")
	WebElement  corporateNonCorpDetailsLink;
	
	@FindBy(id= "claimantVO.groupID")
	WebElement  groupIdTextFieldDisabled;
	
	@FindBy(xpath= "//img[@id='corpnoncorpEdit']")
	WebElement  corporateNonCorpDetailsEditIcon;
	
	/*@FindBy(xpath= "//a[@open-data='CorporateDetails']")
	WebElement  corporateNonCorpDetailsEditIcon;*/
	
	//CorporateDetails
	
	@FindBy(xpath= "//input[@id='groupId']")
	WebElement  groupIdTextField;
	
	
	@FindBy(xpath= "//button[@id='corporateId']")
	WebElement  searchButton;
	
	
	@FindBy(linkText= "2001")
	WebElement  selectGroupIdLink;
	
	
public void clickOnCorporateNonCorpDetailsLink() {
	

	testUtil.delayToSync();
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-1000)", "");
	

	testUtil.delayToSync();
	
	String preauthType = preauthTypeTextField.getAttribute("value");
	System.out.println("corp/noncorp details preauthType before if cond---"+preauthType);
	if(preauthType.equalsIgnoreCase("Regular")) {
		System.out.println("corp/noncorp details preauthType after if cond---"+preauthType);
		return;
	}
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	
	
	
	/*
	String preauthType = preauthTypeTextField.getAttribute("value");
	if(preauthType.equalsIgnoreCase("Regular")) {
		return;
	}*/
	
	System.out.println("corp/noncorp details preauthType after if condddddionnnn---"+preauthType);
	testUtil.delayToSync();
	
	corporateNonCorpDetailsLink.click();
	
	testUtil.delayToSync();
	
	//FOR REGULAR PREAUTH
	
	/*boolean b=groupIdTextFieldDisabled.isEnabled();
	System.out.println("groupIdTextFieldDisabled---"+b);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	if(groupIdTextFieldDisabled.isEnabled()) {
		return;
	}*/
	
	//FOR REGULAR PREAUTH
	
	corporateNonCorpDetailsEditIcon.click();
	groupIdTextField.sendKeys("2001");
	searchButton.click();
	testUtil.delayToSync();
	selectGroupIdLink.click();
	
	
	String clickOnCorporateNonCorpDetailsLink = "clickOnCorporateNonCorpDetailsLink";
	testUtil.takeScreenshot(clickOnCorporateNonCorpDetailsLink);
		
	}
	//*********************CorpNonCorp Details*************************************************************************
	//**************************************************************************
}
	

