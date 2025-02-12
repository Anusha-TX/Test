package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.configuration.RunConfiguration

public class CaseEntryMaintenanceScreen_New {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def accountBasedClaim(String banknumber, String signername, String contactname) {

		try {


			TestObject newClaimButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/button_New Claim')
			TestObject toggleAccountBased = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/toggle_to_account_based')
			TestObject inputSearch = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_search')
			TestObject clickSearch = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/click_search')
			TestObject selectRdButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_rd_btn')
			TestObject chooseDropDown = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/choose_from_dropdown')
			TestObject inputContactName = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_contact_name')
			TestObject verifyName = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_johndoe')
			TestObject nextButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject verifyBankID = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_bank_id')
			TestObject verifyAccountAndContactMessage = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/message_Please select an account and contact')

			WebUI.click(newClaimButton)
			//WebUI.click(toggleAccountBased)

			//Verify red message for account and contact selection
			WebUI.verifyElementPresent(verifyAccountAndContactMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.setText(inputSearch,banknumber )
			WebUI.click(clickSearch)
			WebUI.click(selectRdButton)
			WebUI.click(chooseDropDown)
			WebUI.selectOptionByLabel(chooseDropDown, signername, false)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Account Based Claim step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def transactionsPage(String searchdescription, String searchtrancode, String searchamount) {

		try {
			TestObject selectAccountJohnDoe = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_account_john_doe')
			TestObject selectExistingCases = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_existing_cases')
			TestObject caseID = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_id')
			TestObject searchDescription = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_description')
			TestObject searchTrancode = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_trancode')
			TestObject searchAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_amount')
			TestObject cardNumber = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_card_number')
			TestObject searchCriteriaButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/search_criteria')
			TestObject verifyDescription = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_deposit_description')
			TestObject verifyAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_amount')
			TestObject verifyTrancode = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_trancode')
			TestObject verifyCaseID = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_id')
			TestObject verifyCaseAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_amount')
			TestObject verifyCreatingUser = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_creating_user')
			TestObject verifyTypeATM= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_ATM')
			TestObject tickTransactioncheckbox= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/tick_transaction')
			TestObject nextButton= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject verifyTransactionMessage= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/message_Please select a transaction')
			TestObject verifyAssignedUser= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/span_Assigned User')
			TestObject verifyCreationDate= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/span_Creation Date')
			TestObject verifyTypeDescription= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/span_Type Description')
			TestObject verifyStatusDescription= findTestObject('WObject Repository/Web/Dispute/Process/Case Processor/Page_Case Entry/span_Status Description')

			WebUI.click(selectAccountJohnDoe)
			//			WebUI.click(selectExistingCases)
			//			WebUI.click(caseID)

			// Test verifications --UI changed
			//			WebUI.verifyElementPresent(verifyCaseID, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyTypeDescription, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyCaseAmount, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyCreatingUser, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyAssignedUser, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyStatusDescription, 10, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.verifyElementPresent(verifyCreationDate, 10, FailureHandling.STOP_ON_FAILURE)


			//WebUI.scrollToElement(verifyDescription, 10)
			WebUI.verifyElementPresent(verifyDescription, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyAmount, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyTrancode, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)


			WebUI.setText(searchDescription , searchdescription)
			//WebUI.setText(searchTrancode , searchtrancode)
			//WebUI.setText(searchAmount , searchamount)
			WebUI.click(searchCriteriaButton)

			//verify red message for transaction selection
			WebUI.verifyElementPresent(verifyTransactionMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(tickTransactioncheckbox)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Transactions Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def claimPage(String claimreason) {

		try {
			TestObject claimReason = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/claim_reason_dropdown')
			TestObject nextButton= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject verifyClaimReason = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/message_Please select a reason')

			//verify red message for claim and questions required
			WebUI.verifyElementPresent(verifyClaimReason, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(claimReason)
			WebUI.selectOptionByLabel(claimReason, claimreason, false)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Claim Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionnairePage(String amtvalue, String amtreceived, String addresslocation, String commentsvalue) {

		try {
			TestObject claimReason = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/claim_reason_dropdown')
			TestObject nextButton= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject amonutValue = findTestObject('Object RepositoryfindTestObject/Web/Dispute/Process/Case Processor/Page_Case Entry/input_amount_value')
			TestObject amountReceived = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/amount_received')
			TestObject addressLocation = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_address_location')
			TestObject comments = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_comments')
			TestObject rdYesNo = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_yes_no_a_receipt')
			TestObject acknowledgeButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_checkbox_acknowledge')
			TestObject verifyClaimReason = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/message_Please select a reason')
			TestObject verifyRequiredQuestions = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/message_Please answer all required questions')
			TestObject acknowledge = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_List')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/open_case_doubleclick')
			TestObject bankOtpionSelected = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_any_option_for_bank')
			TestObject checkOther = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_checkbox_other')
			TestObject bankDropDown = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_dropdown_for_bank')


			//verify red message for required questions in questionnaire Page
			//Commenting as UI changed

			//			WebUI.verifyElementPresent(verifyRequiredQuestions, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			//			WebUI.setText(amonutValue,amtvalue)
			//			WebUI.setText(amountReceived,amtreceived)
			//			WebUI.setText(addressLocation,addresslocation)
			//			WebUI.click(rdYesNo)
			//			WebUI.setText(comments,commentsvalue)
			//WebUI.click(acknowledgeButton)
			WebUI.check(acknowledge)

			//Commenting as fields are not mandatory
			//			WebUI.click(bankDropDown)
			//			WebUI.click(bankOtpionSelected)
			//			WebUI.click(checkOther)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Questionnaire Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def correspondencePage() {

		try {
			TestObject submitButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_submit')
			TestObject casesToCommit = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/cases_to_commit')
			TestObject newButtoWithSameAccount = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_new_case_with_same_account')
			TestObject newButtoWithDifferentAccount = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_new_case_with_different_account')
			TestObject verifyCaseHyperlinkt = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_case_hyperlink')
			TestObject clickCaseEntry =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_case_entry')
			TestObject resumeCase = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/resume_case')

			//Verify the required fields are shown up on screen
			//Need to uncomment this submit button as transaction gets greyed out just commented the line
			WebUI.click(submitButton)
		}catch(StepFailedException e) {

			log.logFailed("Correspondence Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def caseConfirmationePageAndNavigateToNewCaseWithSameAccount() {

		try {
			TestObject newButtoWithSameAccount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_new_case_with_same_account')

			//Verify the required fields are shown up on screen
			WebUI.click(newButtoWithSameAccount)
		}catch(StepFailedException e) {

			log.logFailed("Correspondence Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def caseConfirmationePageAndNavigateToNewCaseWithDifferentAccount() {

		try {
			TestObject newButtoWithDifferentAccount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_new_case_with_different_account')

			//Verify the required fields are shown up on screen
			WebUI.click(newButtoWithDifferentAccount)
		}catch(StepFailedException e) {

			log.logFailed("Correspondence Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def cancelCase(String cancelreason, String addcancelnotes) {

		try {
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_cancel_case')
			TestObject cancelReason = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/cancel_reason')
			TestObject addCancelNotes = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_cancel_notes')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_save')
			TestObject verifyCancelCase = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_cancel_case')

			WebUI.click(cancelButton)
			WebUI.click(cancelReason)
			WebUI.selectOptionByValue(cancelReason, cancelreason, true)
			WebUI.setText(addCancelNotes, addcancelnotes)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Cancel case step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addNotesToYourCase(String addnotestocase) {

		try {
			TestObject goToPath = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/go_to_notes_path')
			TestObject addNotesToCase = findTestObject('WObject Repository/Web/Dispute/Process/Case Processor/Page_Case Entry/add_your_case_note')
			//TestObject saveButton = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_save')
			TestObject crossButton =findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_cross')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/span_Save')

			WebUI.click(goToPath)
			WebUI.setText(addNotesToCase, addnotestocase)
			WebUI.click(saveButton)
			WebUI.click(crossButton)
		}catch(StepFailedException e) {

			log.logFailed("Add Notes to your case step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def searchAndAttachSupportedDocx(String todaysdate) {

		try {
			TestObject searchButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_search')
			TestObject deselectStatus = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/div_Open,Pending')
			TestObject selectDate = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/input_open_date')
			//			TestObject deselectOpen = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_open')
			//			TestObject deselectPending = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_pending')
			TestObject btnOK = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_ok')
			TestObject magnifyingSearch = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/magnifying_search')
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_case')
			TestObject toggleDetailedView = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/toggle_detailedview')
			TestObject clickAttachment = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_attachment')
			TestObject selectDropFiles = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_drop_Files')
			TestObject btnSubmit = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_submit (1)')
			TestObject btnClose = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_close')
			TestObject clickCaseEntry =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_case_entry')
			TestObject openCase =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/div_open_case')

			TestObject deselectOpen =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/Page_Case_Search/input_Uncheck_Open')
			TestObject deselectPending = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/Page_Case_Search/input_Uncheck_Pending')

			//			WebUI.click(searchButton)
			//			WebUI.click(deselectStatus)
			//			WebUI.click(deselectOpen)
			//			WebUI.click(deselectPending)
			//			WebUI.click(btnOK)
			//			WebUI.setText(selectDate, todaysdate)
			//			WebUI.click(magnifyingSearch)
			//			WebUI.click(selectCase)
			//WebUI.switchToWindowIndex(1)

			WebUI.click(clickCaseEntry)
			WebUI.click(openCase)
			WebUI.click(toggleDetailedView)
			WebUI.click(clickAttachment)
			WebUI.sendKeys(selectDropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			WebUI.click(btnSubmit)
			WebUI.click(btnClose)
		}catch(StepFailedException e) {

			log.logFailed("Search and Attach Document Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def searchAndAttachUnSupportedDocx(String todaysdate) {

		try {
			TestObject searchButton = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_search')
			TestObject deselectStatus = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/div_Open,Pending')
			TestObject selectDate = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/input_open_date')
			TestObject deselectOpen = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_open')
			TestObject deselectPending = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_pending')
			TestObject btnOK = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_ok')
			TestObject magnifyingSearch = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/magnifying_search')
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_case')
			TestObject toggleDetailedView = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/toggle_detailedview')
			TestObject clickAttachment = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_attachment')
			TestObject selectDropFiles = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_drop_Files')
			TestObject btnSubmit = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_submit (1)')
			TestObject btnClose = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_close')
			TestObject errormsg = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/file_type_not_allowed')
			TestObject clickCaseEntry =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_case_entry')
			TestObject openCase =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/div_open_case')

			//			WebUI.click(searchButton)
			//			WebUI.click(deselectStatus)
			//			WebUI.click(deselectOpen)
			//			WebUI.click(deselectPending)
			//			WebUI.click(deselectOpen)
			//			WebUI.click(deselectPending)
			//			WebUI.click(btnOK)
			//			WebUI.setText(selectDate, todaysdate)
			//			WebUI.click(magnifyingSearch)
			//			WebUI.doubleClick(selectCase)
			//			WebUI.switchToWindowIndex(1)

			WebUI.click(clickCaseEntry)
			WebUI.click(openCase)
			WebUI.click(toggleDetailedView)
			WebUI.click(clickAttachment)
			WebUI.sendKeys(selectDropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\CSV_TestData (1).csv')
			WebUI.verifyElementPresent(errormsg, 5,FailureHandling.STOP_ON_FAILURE )
			WebUI.click(btnClose)
		}catch(StepFailedException e) {

			log.logFailed("Search and Attach Document Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def searchAndAttachUnSupportedDocxFileSizeExceeded(String todaysdate) {

		try {
			TestObject searchButton = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_search')
			TestObject deselectStatus = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/div_Open,Pending')
			TestObject selectDate = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/input_open_date')
			TestObject deselectOpen = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_open')
			TestObject deselectPending = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/deselect_pending')
			TestObject btnOK = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_ok')
			TestObject magnifyingSearch = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/magnifying_search')
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_case')
			TestObject toggleDetailedView = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/toggle_detailedview')
			TestObject clickAttachment = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_attachment')
			TestObject selectDropFiles = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry_Case_Info_Modal/select_drop_Files')
			TestObject btnSubmit = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_submit (1)')
			TestObject btnClose = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/btn_close')
			TestObject errormsg = findTestObject('Web/Dispute/Process/Page_Case Entry (1)/file_type_not_allowed')
			TestObject clickCaseEntry =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/click_case_entry')
			TestObject openCase =findTestObject('Web/Dispute/Process/Page_Case Entry (1)/div_open_case')

			WebUI.click(clickCaseEntry)
			WebUI.click(openCase)
			WebUI.click(toggleDetailedView)
			WebUI.click(clickAttachment)
			WebUI.sendKeys(selectDropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\CSV_TestData (1).csv')
			WebUI.verifyElementPresent(errormsg, 5,FailureHandling.STOP_ON_FAILURE )
			WebUI.click(btnClose)
		}catch(StepFailedException e) {

			log.logFailed("Search and Attach Document Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def claimPageForMultipleTrans(String claimreasonnew) {

		try {
			TestObject claimReasonNew = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/claim_reason_dropdown')
			TestObject claimReasonNewSecond = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/claim_reason_dropdown_second')
			TestObject nextButton= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject verifyClaimReason = findTestObject('WObject Repository/Web/Dispute/Process/Case Processor/Page_Case Entry/message_Please select a reason')

			//verify red message for claim and questions required
			//WebUI.verifyElementPresent(verifyClaimReason, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(claimReasonNew)
			WebUI.selectOptionByLabel(claimReasonNew, claimreasonnew, false)
			WebUI.click(claimReasonNewSecond)
			WebUI.selectOptionByLabel(claimReasonNewSecond, claimreasonnew, false)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Claim Page for Multiple Transaction step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def transactionsPageForMultipleTrans(String searchdescriptionnew, String searchtrancodenew, String searchamountnew) {

		try {
			TestObject selectAccountJohnDoe = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_account_john_doe')
			TestObject selectExistingCases = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/select_existing_cases')
			TestObject caseID = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_id')
			TestObject searchDescription = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_description')
			TestObject searchTrancode = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_trancode')
			TestObject searchAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_amount')
			TestObject cardNumber = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/input_card_number')
			TestObject searchCriteriaButton = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/search_criteria')
			TestObject verifyDescription = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_deposit_description')
			TestObject verifyAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_amount')
			TestObject verifyTrancode = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_trancode')
			TestObject verifyCaseID = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_id')
			TestObject verifyCaseAmount = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_case_amount')
			TestObject verifyCreatingUser = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_creating_user')
			TestObject verifyTypeATM= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/verify_ATM')
			TestObject tickTransactioncheckbox= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/tick_transaction')
			TestObject nextButton= findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/btn_next')
			TestObject verifyTransactionMessage= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/message_Please select a transaction')
			TestObject verifyAssignedUser= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/span_Assigned User')
			TestObject verifyCreationDate= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/span_Creation Date')
			TestObject verifyTypeDescription= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/span_Type Description')
			TestObject verifyStatusDescription= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/span_Status Description')
			TestObject tickTransactioncheckboxSecond= findTestObject('Web/Dispute/Process/Page_Case Entry (1)/tick_transaction_second')

			WebUI.click(selectAccountJohnDoe)
			WebUI.verifyElementPresent(verifyDescription, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyAmount, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyTrancode, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)


			WebUI.setText(searchDescription , searchdescriptionnew)
			WebUI.setText(searchTrancode , searchtrancodenew)
			WebUI.setText(searchAmount , searchamountnew)
			WebUI.click(searchCriteriaButton)

			//verify red message for transaction selection
			WebUI.verifyElementPresent(verifyTransactionMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(tickTransactioncheckbox)
			WebUI.click(tickTransactioncheckboxSecond)
			WebUI.click(nextButton)
			WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Transactions Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def goToCaseProcessor() {

		try {
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Page_Case Entry (1)/open_case_doubleclick')

			//Double click on caseID generated in case entry and navigate to case processor
			WebUI.doubleClick(openCase)
		}catch(StepFailedException e) {

			log.logFailed("Correspondence Page step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
