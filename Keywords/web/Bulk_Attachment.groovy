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


public class Bulk_Attachment_dispute {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createDebtor(String debtorname) {

		try {
			TestObject selectDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/click_Debtor')
			TestObject addNewButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_addnew')
			TestObject actionName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/input_actionname')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject verifyDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/DebtorExample')

			WebUI.click(selectDebtor)
			WebUI.click(addNewButton)
			WebUI.click(actionName)
			WebUI.setText(actionName, debtorname)
			WebUI.click(saveButton)
			WebUI.click(verifyDebtor)
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
	def bulkAttachmentRequest() {

		try {


			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/Timeline_select')
			TestObject auditNote = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/chevron-down')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject viewAttachments = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/view_attachments')
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_My Cases')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Garnishment')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_opencase')
			TestObject bulkRequests = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Legal/Maintain/Processes/BulkAttachmentsRequest/select_account')
			TestObject selectValue = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/a_1XXXX0001D')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Dispute/Maintain/Page_Case Processor/td_User PerformedBulk')
			TestObject dropFiles = findTestObject('Object Repository/Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_dropfiles')

			TestObject actionDue =findTestObject('Web/Legal/Maintain/Processes/FundsAcqJ_srepos/span_Actions Due')
			TestObject save = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/button_Save')
			TestObject close_button=findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/btn_close')
			WebUI.switchToWindowIndex(1)
			//WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(bulkRequests)
			WebUI.switchToWindowIndex(2)
			WebUI.click(accounts)
			WebUI.click(selectValue)
			WebUI.sendKeys(dropFiles, RunConfiguration.getProjectDir() +'\\UploadFile\\Dispute.pdf')
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
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
			TestObject selectdown = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/chevron-down')

			TestObject select_all =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/input_Pending_selectAll')
			TestObject select_type = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/svg_Attachment_bi bi-pencil-square')
			TestObject select_template =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/div_Select a template')
			TestObject bulkRequests = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/div_Demo2')
			TestObject selectValue = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/a_Case Attachments')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/Performed_BulkAttachmentsRequests')
			TestObject dropFiles = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_dropfiles')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/button_Save')
			TestObject closeButton = findTestObject('Web/Dispute/Maintain/Page_BulkAttachmentsResults/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject bulkResults = findTestObject('Object Repository/Web/Dispute/Maintain/Page_Case Processor/span_Bulk Attachments Results')
			TestObject expandArrow =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/arrowExpand')
			TestObject checkboxSelect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_selected')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/edit_attachment')
			TestObject saveEditBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/button_Save Edit')
			TestObject checkboxDeselect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_deselect')
			TestObject accountIdentityAction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_account_action')
			TestObject aduit_note1=findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/aduit_note')

			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(selectdown)
			WebUI.click(select_all)
			WebUI.click(select_template)
			WebUI.click(accounts)
			WebUI.scrollToElement(saveEditBtn, GlobalVariable.globalMediumDelay)
			WebUI.click(saveEditBtn)
			WebUI.waitForElementVisible(saveButton, GlobalVariable.globalMediumDelay)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay


			WebUI.click(aduit_note1)

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
	def editAttachmentResults() {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject selectdown = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/chevron-down')

			TestObject select_all =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/input_Pending_selectAll')
			TestObject select_type = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/svg_Attachment_bi bi-pencil-square')
			TestObject select_template =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/div_Select a template')
			TestObject bulkRequests = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_Bulk Attachments Requests')
			TestObject accounts = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/div_Demo2')
			TestObject selectValue = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/a_Case Attachments')
			TestObject verifyBulkRequestMessage = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/Performed_BulkAttachmentsRequests')
			TestObject dropFiles = findTestObject('Web/Legal/Maintain/Processes/BulkAttachmentsRequest/span_dropfiles')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/button_Save')
			TestObject closeButton = findTestObject('Web/Dispute/Maintain/Page_BulkAttachmentsResults/btn_close')
			TestObject caseId =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject bulkResults = findTestObject('Object Repository/Web/Dispute/Maintain/Page_Case Processor/span_Bulk Attachments Results')
			TestObject expandArrow =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/arrowExpand')
			TestObject checkboxSelect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_selected')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/edit_attachment')
			TestObject saveEditBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsResults/button_Save Edit')
			TestObject checkboxDeselect = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/checkbox_deselect')
			TestObject accountIdentityAction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsResults/span_account_action')
			TestObject aduit_note1=findTestObject('Object Repository/Web/Dispute/Maintain/Page_BulkAttachmentsRequests/aduit_note')


			WebUI.doubleClick(caseId)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(bulkResults)
			WebUI.switchToWindowIndex(2)
			WebUI.click(selectdown)
			WebUI.click(select_all)
			WebUI.click(select_template)
			WebUI.click(accounts)
			WebUI.scrollToElement(saveEditBtn, GlobalVariable.globalMediumDelay)
			WebUI.click(saveEditBtn)
			WebUI.waitForElementVisible(saveButton, GlobalVariable.globalMediumDelay)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.click(aduit_note1)

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
}

