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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

public class LegalActionMaintenance {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createDebtor(String debtorname) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_Debtor')
			TestObject addNewRequestorOnDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/add_new_debtor')
			TestObject setDebtorName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_debtor_name')
			TestObject setBusinessName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_business_name')
			TestObject setAddress = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_address')
			TestObject cancelButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/btn_cancel')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyDebtorAddedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_debtor_added_audit')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject openCaseChildSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/open_child_support')
			TestObject childSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Child Support')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			// flow for validating the debtor name
			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(generateLetter)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(addNewRequestorOnDebtor)
			WebUI.setText(setDebtorName, debtorname)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.scrollToElement(verifyDebtorAddedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyDebtorAddedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("New user creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDebtor(String debtornameupdated) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_Debtor')
			TestObject addNewRequestorOnDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/add_new_debtor')
			TestObject setDebtorName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_debtor_name')
			TestObject setBusinessName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_business_name')
			TestObject setAddress = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_address')
			TestObject cancelButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/btn_cancel')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyDebtorUpdatedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_debtor_updated_audit')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject spanExName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Ex')
			TestObject changeName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_Name_name')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(generateLetter)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(spanExName)
			WebUI.clearText(changeName)
			WebUI.setText(changeName, debtornameupdated)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.scrollToElement(verifyDebtorUpdatedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyDebtorUpdatedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Edit debtor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteDebtor() {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_Debtor')
			TestObject deleteButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_delete')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyDebtorDeletedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_deleted_audit')
			TestObject trashButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/svg_Ex_bi bi-trash')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(generateLetter)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(trashButton)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.scrollToElement(verifyDebtorDeletedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyDebtorDeletedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Delete debtor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addNewRequestor(String requestorname, String requestorcontact) {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case_under_legal')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')
			TestObject addNewRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/add_new_requestor')
			TestObject setName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_name_new')
			TestObject setContact = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_contact_new')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject expandAddedRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/expand_added_requestor')
			TestObject verifyJohnDoe = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_johndoe')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyNewRequestorAudit =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_new_requestor_added')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject openCaseChildSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/open_child_support')
			TestObject childSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Child Support')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(requestor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(addNewRequestor)
			WebUI.setText(setName, requestorname)
			WebUI.setText(setContact, requestorcontact)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifyNewRequestorAudit, GlobalVariable.globalMediumDelay)
			WebUI.click(verifyNewRequestorAudit)

			// Test verifications
			WebUI.verifyElementPresent(verifyNewRequestorAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("New Requestor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addExistingRequestor(String requestorname) {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case_under_legal')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/my_cases')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')
			TestObject addNewRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/add_new_requestor')
			TestObject setName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_name_new')
			//TestObject setName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_existing_name')
			TestObject setContact = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_contact_new')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject expandAddedRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/expand_added_requestor')
			TestObject verifyJohnDoe = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_johndoe')
			TestObject verifyNewRequestorAudit =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_new_requestor_added')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyExistingRequestorAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_audit_existing_user')
			TestObject selectSeema = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/a_Seema')
			TestObject openCaseChildSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/open_child_support')
			TestObject childSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Child Support')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(requestor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(addNewRequestor)
			WebUI.click(setName)
			//WebUI.scrollToElement(selectSeema, GlobalVariable.globalLongDelay)
			WebUI.click(selectSeema)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifyExistingRequestorAudit, GlobalVariable.globalLongDelay)
			WebUI.click(verifyExistingRequestorAudit)

			// Test verifications
			WebUI.verifyElementPresent(verifyExistingRequestorAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Add Existing Requestor Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteRequestor() {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')
			TestObject addNewRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/add_new_requestor')
			TestObject setName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_name_new')
			TestObject setContact = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_contact_new')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifyDeleteAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/deleted_requestor_audit')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject deleteButton =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_trash')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(requestor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(deleteButton)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			// Test verifications
			WebUI.scrollToElement(verifyDeleteAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(verifyDeleteAudit)
			WebUI.verifyElementPresent(verifyDeleteAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Delete Requestor Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def pdfAuditAttachment() {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_attachment_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/view_attachments')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			WebUI.doubleClick(caseId)
			WebUI.click(auditNote)
			WebUI.click(createAuditAttachment)

			// Test verifications
			WebUI.verifyElementPresent(verifySuccessMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(viewAttachments)
		}catch(StepFailedException e) {

			log.logFailed("PDF Audit Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editAttachment() {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_attachment_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/edit_attachment')
			TestObject deleteAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/delete_attachment')
			TestObject yesButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_yes')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject dropFiles = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/editattachment/dropattachment')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifyDeletedAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/editattachment/verify_deleted_attachment_audit')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject actionDue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Actions Due')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(editAttachment)
			WebUI.switchToWindowIndex(2)
			WebUI.sendKeys(dropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\Adjustments.pdf')
			WebUI.waitForElementClickable(deleteAttachment, GlobalVariable.globalLongDelay)
			WebUI.click(deleteAttachment)
			WebUI.click(yesButton)
			WebUI.waitForElementVisible(saveButton, GlobalVariable.globalLongDelay)
			WebUI.click(saveButton)

			//commenting as not required
			//			WebUI.doubleClick(caseId)
			//			WebUI.rightClick(rightClickOnTimeline)
			//			WebUI.mouseOver(accountIdentification)
			//			WebUI.click(editAttachment)
			//			WebUI.switchToWindowIndex(2)
			//			WebUI.waitForElementClickable(deleteAttachment, 20)
			//			WebUI.click(deleteAttachment)
			//			WebUI.click(yesButton)
			//			WebUI.click(saveButton)

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.scrollToElement(verifyDeletedAttachment, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(verifyDeletedAttachment)
			WebUI.verifyElementPresent(verifyDeletedAttachment, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Edit Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def debtorActionValidation(String debtorfullname, String businessname, String debtoraddress) {

		try {
			// commenting the legal repo's
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case_under_legal')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/my_cases')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_Debtor')
			TestObject addNewRequestorOnDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/add_new_debtor')
			TestObject setDebtorName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_debtor_name')
			TestObject setBusinessName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_business_name')
			TestObject setAddress = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_address')
			TestObject cancelButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/btn_cancel')
			TestObject openCaseChildSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/open_child_support')
			TestObject childSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Child Support')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			// flow for validating the debtor name
			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(generateLetter)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(addNewRequestorOnDebtor)
			WebUI.setText(setDebtorName, debtorfullname)
			WebUI.verifyElementPresent(addNewRequestorOnDebtor, GlobalVariable.globalLongDelay)
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("Debtor Action Required fields step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def multipleDebtor(String debtorfirstname, String debtorsecondname) {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case_under_legal')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/right_click_timeline')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_Debtor')
			TestObject addNewRequestorOnDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/add_new_debtor')
			TestObject setDebtorName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_debtor_name')
			TestObject setDebtorSecondName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_debtor_secondname')
			TestObject setBusinessName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_business_name')
			TestObject setAddress = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_address')
			TestObject cancelButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/btn_cancel')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyFirstDebtorAddedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_first_debtor_added_audit')
			TestObject verifySecondDebtorAddedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_second_debtor_added_audit')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			// flow for validating the debtor name
			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(generateLetter)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(2)
			WebUI.click(addNewRequestorOnDebtor)
			WebUI.setText(setDebtorName, debtorfirstname)
			WebUI.click(addNewRequestorOnDebtor)
			WebUI.setText(setDebtorSecondName, debtorsecondname)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.scrollToElement(verifyFirstDebtorAddedAudit, GlobalVariable.globalMediumDelay)
			WebUI.click(verifyFirstDebtorAddedAudit)
			WebUI.verifyElementPresent(verifyFirstDebtorAddedAudit, GlobalVariable.globalMediumDelay,  FailureHandling.STOP_ON_FAILURE)

			WebUI.scrollToElement(verifySecondDebtorAddedAudit, GlobalVariable.globalMediumDelay)
			WebUI.click(verifySecondDebtorAddedAudit)
			WebUI.verifyElementPresent(verifySecondDebtorAddedAudit, GlobalVariable.globalMediumDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Multiple Debtor Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def requestorActionValidation(String requestornewname, String requestornewcontact, String requestoraddress) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_attachment_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')
			TestObject addNewRequestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/add_new_requestor')
			TestObject setName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_name_new')
			TestObject setContact = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_contact_new')
			TestObject setAddress = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/input_address')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject cancelButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/btn_cancel')
			TestObject openCaseChildSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/open_child_support')
			TestObject childSupport =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Child Support')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(requestor)
			WebUI.switchToWindowIndex(2)

			// flow for validating the debtor name
			WebUI.click(addNewRequestor)
			WebUI.setText(setName, requestornewname)
			WebUI.verifyElementPresent(addNewRequestor, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("Requestor Action Required fields step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def bulkAttachmentRequest() {

		try {
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_attachment_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/view_attachments')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject bulkRequests = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/select_account')
			TestObject selectValue = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/a_Case Attachments')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/audit_BulkAttachmentsRequests')
			TestObject dropFiles = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_dropfiles')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject actionDue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Actions Due')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')

			WebUI.doubleClick(caseId)
			WebUI.click(actionDue)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(requestor)
			WebUI.click(bulkRequests)
			WebUI.switchToWindowIndex(2)
			WebUI.click(accounts)
			WebUI.click(selectValue)
			WebUI.sendKeys(dropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\Adjustments.pdf')
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.verifyElementPresent(verifyBulkRequestMessage, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Bulk Attachment Request step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def bulkAttachmentResults() {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/view_attachments')
			TestObject bulkRequests = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/select_account')
			TestObject selectValue = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/a_Case Attachments')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/audit_BulkAttachmentsRequests')
			TestObject dropFiles = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_dropfiles')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject bulkResults = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_Bulk Attachments Results')
			TestObject expandArrow =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/arrowExpand')
			TestObject checkboxSelect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_selected')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/edit_attachment')
			TestObject saveEditBtn = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/button_Save Edit')
			TestObject checkboxDeselect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_deselect')
			TestObject accountIdentityAction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_account_action')
			TestObject actionDue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Actions Due')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(requestor)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(expandArrow)
			WebUI.click(checkboxSelect)
			WebUI.click(editAttachment)
			WebUI.scrollToElement(saveEditBtn, GlobalVariable.globalMediumDelay)
			WebUI.click(saveEditBtn)
			WebUI.waitForElementVisible(saveButton, GlobalVariable.globalMediumDelay)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay

			//repeat steps to verify
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			//WebUI.mouseOver(requestor)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(expandArrow)
			WebUI.click(checkboxDeselect)
			WebUI.click(saveButton)

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.verifyElementPresent(verifyBulkRequestMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Bulk Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def bulkAttachmentResultsAndAddSignature() {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/view_attachments')
			TestObject bulkRequests = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/select_account')
			TestObject selectValue = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/a_Case Attachments')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/audit_BulkAttachmentsRequests')
			TestObject dropFiles = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/span_dropfiles')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject bulkResults = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_Bulk Attachments Results')
			TestObject expandArrow =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/arrowExpand')
			TestObject checkboxSelect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_selected')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/edit_attachment')
			TestObject saveEditBtn = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/button_Save Edit')
			TestObject checkboxDeselect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_deselect')
			TestObject accountIdentityAction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_account_action')
			TestObject selectSignature = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkResultsSignature/div_Select a signature')
			TestObject addNewSignature = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkResultsSignature/div_Add New Signature')
			TestObject inputDropFiles =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkResultsSignature/add_signature')
			TestObject cancelButton =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkResultsSignature/button_Cancel')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')

			//WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(requestor)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(expandArrow)
			WebUI.click(checkboxSelect)
			WebUI.click(editAttachment)

			//Add signature and cancel
			WebUI.click(selectSignature)
			WebUI.click(addNewSignature)
			WebUI.sendKeys(inputDropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\signature.png')
			WebUI.click(cancelButton)

			//Add signature and save
			WebUI.click(selectSignature)
			WebUI.click(addNewSignature)
			WebUI.sendKeys(inputDropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\signature.png')
			WebUI.click(saveButton)

			WebUI.scrollToElement(saveEditBtn, GlobalVariable.globalMediumDelay)
			WebUI.click(saveEditBtn)
			WebUI.waitForElementVisible(saveButton, GlobalVariable.globalMediumDelay)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay

			//repeat steps to verify
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			//WebUI.mouseOver(requestor)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(expandArrow)
			WebUI.click(checkboxDeselect)
			WebUI.click(saveButton)

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			WebUI.verifyElementPresent(verifyBulkRequestMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Bulk Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def accountsView() {
		try {
			TestObject toggleToDetail = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/redactAttachment/toggle_to_detail')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/redactAttachment/span_Attachments  1')

			WebUI.click(viewAttachments)
			WebUI.click(toggleToDetail)
		}catch(StepFailedException e) {

			log.logFailed("Bulk Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
