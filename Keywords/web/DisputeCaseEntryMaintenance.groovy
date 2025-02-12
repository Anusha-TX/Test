package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.google.api.client.util.Key
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

import internal.GlobalVariable

// Keywords Functions

public class DisputeCaseEntryMaintenance {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def toogleToAccountBased() {
		try {
			TestObject sltToogle =	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/div_Account_Based_Claim_Toogle')

			WebUI.click(sltToogle)
		} catch(StepFailedException e) {

			log.logFailed("Toogle To Account Based step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/div_ATM')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Case Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickNextButton() {
		try {
			TestObject sltButton = 	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/button_Next')

			WebUI.click(sltButton)
		}  catch(StepFailedException e) {
			log.logFailed("Click Next Button step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickAcknowledge() {
		try {
			TestObject sltChk =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/chk_Acknowledge')

			WebUI.click(sltChk)
		}  catch(StepFailedException e) {
			log.logFailed("Click Acknowledge step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def corresepondencedetails(String homeNumber){
		try {
			TestObject sltHomePhone = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/rdo_Select_Home_Phone')
			TestObject enterHomeNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/input_Enter_Home_Phone')

			WebUI.click(sltHomePhone)
			WebUI.setText(enterHomeNumber,homeNumber)
		} catch(StepFailedException e) {
			log.logFailed("Corresepondence Details step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickSubmitButton() {
		try {
			TestObject sltButton  =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/button_Submit')

			WebUI.click(sltButton)
		} catch(StepFailedException e) {
			log.logFailed("Click Submit Button step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTransaction(String traCode) {
		try {
			TestObject transactionId = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/input_Trancode_Trancode')
			TestObject searchTransaction =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/svg_Transaction_Search')
			TestObject selectTransChk =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/chk_Select_Transaction')

			WebUI.click(transactionId)
			WebUI.setText(transactionId,traCode)
			WebUI.click(searchTransaction)
			WebUI.click(selectTransChk)
		} catch(StepFailedException e) {
			log.logFailed("Select Transaction step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAnotherTransaction() {
		try {
			TestObject selectTransChk = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/chk_Select_Another_Transaction')

			WebUI.click(selectTransChk)
		} catch(StepFailedException e) {
			log.logFailed("Select Another Transaction step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectClaimReason(String sltClaimReason) {
		try {
			TestObject selectClaim =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/select_New_Claim_Reason')

			WebUI.click(selectClaim)
			WebUI.selectOptionByLabel(selectClaim,sltClaimReason,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Claim Reason step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAnotherClaimReason(String sltClaimReason) {
		try {
			TestObject selectClaim =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/select_Another_Claim_Reason')

			WebUI.click(selectClaim)
			WebUI.selectOptionByLabel(selectClaim,sltClaimReason,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Another Claim Reason step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def corresepondencePageDetails(){
		try {
			TestObject sltHomePhone = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/rdo_Select_Home_Phone')
			//	TestObject enterHomeNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/input_Enter_Home_Phone')

			WebUI.click(sltHomePhone)
			//	WebUI.setText(enterHomeNumber,'1234567890' )
		} catch(StepFailedException e) {
			log.logFailed("Corresepondence Page Details step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQuestionDetails(String sltDropDownQues, String transAmount) {
		try {
			TestObject sltQues1 = 	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/select_Answer_dropdown')
			TestObject enterAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/input_Transaction_Amount')

			WebUI.click(sltQues1)
			WebUI.selectOptionByLabel(sltQues1,sltDropDownQues, true)
			WebUI.click(enterAmount)
			WebUI.setText(enterAmount,transAmount)
		} catch(StepFailedException e) {
			log.logFailed("Select Question Details step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectNewCaseType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/div_Add_Case1')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select New Case Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCorrectQuestion(String transAmount, String multipleChoiceAns) {
		try {
			TestObject amount =	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Amount_Question_Link')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Quest_Ans_Link_Questions')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
			WebUI.click(sltQues)
			WebUI.selectOptionByLabel(sltQues,multipleChoiceAns,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Correct Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAnotherCorrectQuestion(String transAmount, String multipleChoiceAns) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Amount_Field')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Quest_Ans_Link_Questions')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
			WebUI.click(sltQues)
			WebUI.selectOptionByLabel(sltQues,multipleChoiceAns,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Another Correct Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceQuestion(String transAmount, String multipleChoiceAns) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Amount_Field')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Select_Answer')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def selectMultipleSelectQuestion(String transAmount, String multipleSelecteAns) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Amount_Field')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Select_Answer')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
			//			WebUI.click(sltQues)
			//			WebUI.selectOptionByLabel(sltQues,multipleChoiceAns,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAndSearchClaim(String bankNumber, String signerName, String contactName) {
		try {
			TestObject newClaimButton = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/button_New_Claim')
			TestObject inputSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/input_search')
			TestObject clickSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/click_search')
			TestObject selectRdButton = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/select_rd_btn')
			TestObject chooseDropDown = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/choose_from_dropdown')
			TestObject inputContactName = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/input_contact_name')
			TestObject verifyName = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/verify_johndoe')
			TestObject nextButton = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/btn_next')

			WebUI.click(newClaimButton)
			WebUI.setText(inputSearch,bankNumber )
			WebUI.click(clickSearch)
			WebUI.click(selectRdButton)
			WebUI.click(chooseDropDown)
			WebUI.selectOptionByLabel(chooseDropDown, signerName, true)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {
			log.logFailed("Create And Search Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataSetterClaimType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/div_Data_Setter')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Data Setter Claim Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCreatedCase() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Account_Based_Claim/button_Open_Case_In_Case_Processor')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Open Created Case step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceRequired(String transAmount, String multipleChoiceAns) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Merchant_Question')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Pleaase_Select_Bank')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
			WebUI.click(sltQues)
			WebUI.selectOptionByLabel(sltQues,multipleChoiceAns,true)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Requied step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAmount(String transAmount) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Merchant_Question')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/select_Pleaase_Select_Bank')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
		} catch(StepFailedException e) {
			log.logFailed("Select Amount step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def enterQuestionDetails(String sltDropDownQues) {
		try {
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Provide_Your_Name')

			WebUI.click(sltQues)
			WebUI.setText(sltQues,sltDropDownQues)
		} catch(StepFailedException e) {
			log.logFailed("Enter Question Details step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelecteRequiredQues(String transAmount) {
		try {
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Merchant_Question')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Select_Bank_Checkbox')

			WebUI.click(amount)
			WebUI.setText(amount,transAmount)
			WebUI.click(sltQues)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Required Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQuestionnarieDataFieldDate(String transAmount) {
		try {
			TestObject clkDate = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Select_Date')

			WebUI.click(clkDate)
			WebUI.setText(clkDate, transAmount)
		} catch(StepFailedException e) {
			log.logFailed("Select Questionnarie Data Field Date step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTransactionAutoWriteOffPath(String traCode) {
		try {
			TestObject transactionId = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/input_Trancode_Trancode')
			TestObject searchTransaction =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/svg_Transaction_Search')
			TestObject selectTransChk =	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/chk_Select_Tra_Auto_Write_Off_Path')

			WebUI.click(transactionId)
			WebUI.setText(transactionId,traCode)
			WebUI.click(searchTransaction)
			WebUI.click(selectTransChk)
		} catch(StepFailedException e) {
			log.logFailed("Select Transaction Auto Write Off Path step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTransactionAutoNoWriteOffPath(String traCode) {
		try {
			TestObject transactionId = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/input_Trancode_Trancode')
			TestObject searchTransaction =  findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Create_Case_Transcode/svg_Transaction_Search')
			TestObject selectTransChk =	findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/chk_Select_Tra_No_Write_Off_Path')

			WebUI.click(transactionId)
			WebUI.setText(transactionId,traCode)
			WebUI.click(searchTransaction)
			WebUI.click(selectTransChk)
		} catch(StepFailedException e) {
			log.logFailed("Select Transaction Auto No Write Off Path step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataTypeQues(String transAmount, String StatementDate, String numberValue,  String sltDropDownQues) {
		try {
			TestObject addAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Provide_Account_Balance_Amount')
			TestObject addDate = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_When is the_Funds_Releasedue_date')
			TestObject addPin = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_Your Pin Code_Question_Number')
			TestObject chkCredit = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/chk_Credit')
			TestObject addAddress = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_This is your_Address_Boolean')
			TestObject addName = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Question/input_What is your name')

			WebUI.click(addAmount)
			WebUI.setText(addAmount, transAmount)
			WebUI.setText(addDate, StatementDate)
			WebUI.setText(addPin, numberValue)
			WebUI.click(chkCredit)
			//	WebUI.setText(addAddress, booleanValue)
			WebUI.setText(addName, sltDropDownQues)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Type Ques step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDecisionCaseType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Decision_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Decision Case Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Choice')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Select')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAssignQuestionsType() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Assign_Questions')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Assign Questions Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataFieldCaseType() {
		try {
			TestObject sltCaseType  = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Data_Field_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Data Field Case Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataTypeQuestion() {
		try {
			TestObject sltCaseType  = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Data_Type_Question')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Data Type Question step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseEnterClaim() {
		try {
			TestObject sltCaseType  = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Case_Enter')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Case Enter Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEnterCaseTypeClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Entry_Case_Type')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Enter Case Type Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseQuestionnaireTypeClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Case_Questions_Type')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Case Questionnaire Type Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectActionCaseTypeClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Actions_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Action Case Type Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectBuildConditioncaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Build_Condition_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Build Condition case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEditConditionCaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Edit_Condition_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Edit Condition Case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceNotTypeClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Choice_Not_Type')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Choice Not Type Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceQueryClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Choice_Query')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Choice Query Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceWithoutCaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Choice_Without_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Choice Without Case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceNotCaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Choice_Not_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Choice Not Case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotTypeClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Select_Not_Type')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Select Not Type Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotCaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Select_Not_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Select Not Case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectWithoutCaseClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Select_Without_Case')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Select Without Case Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectQueryClaim() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/div_Multiple_Select_Query')

			WebUI.click(sltCaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Multiiple Select Query Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selecNewClaimButton() {
		try {
			TestObject btnNewClaim = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Select_Claim_Type_Case/btn_New_Claim')

			WebUI.click(btnNewClaim)
		}  catch(StepFailedException e) {
			log.logFailed("Select New Claim Button step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}


