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
import web.CurrentDatePicker as dateUtil
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import config.ConfigurationManager

public class DisputeCaseProcessorMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def addCustomSearch(String comboboxvalue, String casedescription) {

		try {
			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/home_search_button')
			TestObject plusButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/plus_button')
			TestObject combobox = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/combobox')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/description_name')
			TestObject fieldValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/field_value')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/save_button')
			TestObject customeField = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/custom_field')

			WebUI.click(homeSearchButton)
			WebUI.click(plusButton)
			WebUI.click(combobox)
			WebUI.setText(combobox, comboboxvalue)
			WebUI.setText(description,casedescription)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Add Custom search step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteCustomSearch() {

		try {
			TestObject trashButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/btn_trash')
			TestObject customeField = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/custom_field')

			WebUI.scrollToElement(customeField, GlobalVariable.globalLongDelay)
			WebUI.click(trashButton)
		}catch(StepFailedException e) {

			log.logFailed("Delete Custom search step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def navigationPaneInCaseProcessor() {

		try {
			TestObject actions_dueArrow = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/actions_due_arrow')
			TestObject reviewArrow= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/review_cases_arrow')
			TestObject flaggedCasesArrow =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/flagged_cases_arrow')
			TestObject myCasesArrow = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/my_cases_arrow')
			TestObject recentArrow = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/recent_cases_arrow')
			TestObject openCaseUnderATM = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/open_ATM_case_under_my_cases')
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')

			WebUI.click(actions_dueArrow)
			WebUI.click(reviewArrow)
			WebUI.click(flaggedCasesArrow)
			WebUI.click(myCases)
			//			WebUI.click(caseACH)
			//			WebUI.click(openCase)
			//			WebUI.click(recentArrow)
		}catch(StepFailedException e) {

			log.logFailed("Navigation Pane in Case Processor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def workQueueInCaseProcessor(String pendingaction) {

		try {
			TestObject queueIcon = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/queue_icon')
			TestObject selectQueue= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/select_queue')
			TestObject pendingAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/select_all_actions_pending_actions')
			TestObject nextButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/btn_next')

			WebUI.click(queueIcon)
			//WebUI.doubleClick(selectQueue)
			//WebUI.selectOptionByValue(pendingAction, pendingaction , true)
			//WebUI.click(nextButton)
		}catch(StepFailedException e) {

			log.logFailed("Navigation Pane in Case Processor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def viewPointeAction(String viewpointeamount) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			//TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject viewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/click_view_pointe_action')
			TestObject setViewPointeAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_amount')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifydAddedViewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/verify_view_pointe_audit')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(debtor)
			WebUI.click(viewPointeAction)
			WebUI.switchToWindowIndex(2)
			WebUI.setText(setViewPointeAmount, viewpointeamount)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifydAddedViewPointeAction, GlobalVariable.globalLongDelay)
			WebUI.click(verifydAddedViewPointeAction)
			// Test verifications
			assert WebUI.verifyElementPresent(verifydAddedViewPointeAction, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Send to View Pointe step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def viewPointeActionWindowAMG(String amgcashletter, String viewpointeamount, String viewpointecashlettertotal, String viewpointebundletotal ) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject viewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/click_view_pointe_action')
			TestObject dropdownCashLetter = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/viewPointeActionAMGType/amg_cash_letter')
			TestObject setViewPointeAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_amount')
			TestObject setViewPointeCashLetterTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/viewPointeActionAMGType/view_pointe_cash_letter_total')
			TestObject setViewPointeBundleTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/viewPointeActionAMGType/view_pointe_bundle_total')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifydAddedViewPointeActionAMG = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/viewPointeActionAMGType/audit_view_pointe_amg')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(debtor)
			WebUI.click(viewPointeAction)
			WebUI.switchToWindowIndex(2)
			WebUI.click(dropdownCashLetter)
			WebUI.selectOptionByValue(dropdownCashLetter, amgcashletter , true)
			WebUI.setText(setViewPointeAmount, viewpointeamount)
			WebUI.setText(setViewPointeCashLetterTotal, viewpointecashlettertotal)
			WebUI.setText(setViewPointeBundleTotal, viewpointebundletotal)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifydAddedViewPointeActionAMG, GlobalVariable.globalLongDelay)
			WebUI.click(verifydAddedViewPointeActionAMG)
			// Test verifications
			assert WebUI.verifyElementPresent(verifydAddedViewPointeActionAMG, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Sent To View Pointe by selecting AMG as Cash Letter Type step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def svpCoOutputAction(String cashletter, String svpcoamount, String svpcodate, String svpcocashlettertotal, String svpcobundletotal, String svpcoitembefore, String svpcoitemafter ) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject svpCoOutputAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/click_send_to_svpco_output')
			TestObject dropdownCashLetter = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/dropdown_cashletter')
			TestObject setSvpCoAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_svpco_amount')
			TestObject setSvpCoCashLetterDate = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_cash_letter_date')
			TestObject setSvpCoCashLetterTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_svpco_cashlettertotal')
			TestObject setSvpCoBundleTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_svpco_bundle total')
			TestObject setSvpCoitemafter = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_svpco_itemafter')
			TestObject setSvpCoitembefore = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/input_svpco_itembefore')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifySendSvpCoOutput = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/title_send_svpco_output')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(debtor)
			WebUI.click(svpCoOutputAction)
			WebUI.switchToWindowIndex(2)
			WebUI.click(dropdownCashLetter)
			WebUI.selectOptionByValue(dropdownCashLetter, cashletter , true)
			WebUI.setText(setSvpCoAmount, svpcoamount)
			WebUI.setText(setSvpCoCashLetterDate, svpcodate)
			WebUI.setText(setSvpCoCashLetterTotal, svpcocashlettertotal)
			WebUI.setText(setSvpCoBundleTotal, svpcobundletotal)
			WebUI.scrollToElement(setSvpCoitembefore, GlobalVariable.globalLongDelay)
			WebUI.setText(setSvpCoitembefore, svpcoitembefore)
			WebUI.setText(setSvpCoitemafter, svpcoitemafter)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifySendSvpCoOutput, GlobalVariable.globalLongDelay)
			WebUI.click(verifySendSvpCoOutput)
			// Test verifications
			assert WebUI.verifyElementPresent(verifySendSvpCoOutput, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("SvpCo Output Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def svpCoOutputActionValidation() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject svpCoOutputAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/SendToSvpCoOutput/click_send_to_svpco_output')
			TestObject dropdownCashLetterCategory = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/category')
			TestObject svpCoAmount = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_amount')
			TestObject svpCoResponseType = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/response_type')
			TestObject svpCoImageCount = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_image_count')
			TestObject svpCoCredit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/checkbox_Required_credit')
			TestObject svpCoHasImages = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/checkbox_Required_hasImages')
			TestObject svpCoWithoutEntry = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/checkbox_Required_withoutEntry')
			TestObject svpCoReferenceNumbert = 	findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_reference_number')
			TestObject svpCRoutingTransit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_routing_transit')
			TestObject svpCoCashLetterDate = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_cash_letter_date')
			TestObject svpCoCashLetterTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_cash_letter_total')
			TestObject svpCoBundleTotal = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/input_bundle_total')
			TestObject svpCoReturnCashLetterType = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/checkbox_return_cash_letter_type')
			TestObject svpCoCommentsBox = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/comments_box')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/validate_svpco/btn_cancel')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(debtor)
			WebUI.click(svpCoOutputAction)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(dropdownCashLetterCategory, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoAmount, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoResponseType, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoImageCount, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoCredit, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoHasImages, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoWithoutEntry, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoReferenceNumbert, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCRoutingTransit, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(svpCoCashLetterDate, GlobalVariable.globalLongDelay,  FailureHandling.STOP_ON_FAILURE)
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("SvpCo Output Validation Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editAttachmentNoAttachment() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject editAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/click_edit_attachment')
			TestObject verifyMessage = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/verify_message_no_attachments_to_edit')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/btn_save')
			TestObject attachmentsView = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/attachments_view_zero')
			TestObject viewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/click_view_pointe_action')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			//WebUI.mouseOver(viewPointeAction)
			WebUI.click(editAttachment)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(verifyMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(attachmentsView)
			WebUI.verifyElementPresent(attachmentsView, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
		}catch(StepFailedException e) {

			log.logFailed("Edit Attachment No Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editAttachmentValidation() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject attachmentsView = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/attachments_view_one')
			TestObject checkThumbnail = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/input_check_thumbnail')
			TestObject title = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/title')
			TestObject description= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/description')
			TestObject extension= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/extension')
			TestObject imageDate= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/image_date')
			TestObject imageSequence= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/image_sequence')
			TestObject addedDate= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/added_date')
			TestObject editAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/click_edit_attachment')
			TestObject labelAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/label_Attachment')
			TestObject labelDescription = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/label_Description')
			TestObject labelTitle = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/label_Title')
			TestObject replacementAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/replacement_Attachment')
			TestObject verifyDropAFileMessage = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/verify_drop_a_file_message')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/btn_delete')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/btn_cancel')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/btn_save')
			TestObject viewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/click_view_pointe_action')
			TestObject caseDispute = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/case_dispute')
			TestObject openCaseDispute =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/span_open_case_dispute')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(attachmentsView)
			WebUI.click(checkThumbnail)
			//WebUI.scrollToElement(title, GlobalVariable.globalLongDelay)
			WebUI.verifyElementPresent(title, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(description, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(extension, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(imageDate, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(imageSequence, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(addedDate, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			//WebUI.mouseOver(viewPointeAction)
			WebUI.click(editAttachment)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(labelAttachment, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(labelDescription, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(labelTitle, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(replacementAttachment, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyDropAFileMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(deleteButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(saveButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("Edit Attachment Validation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkAdhocMenuAction() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject sendToFed = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/send_to_fed')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/btn_cancel')

			WebUI.click(myCases)
			WebUI.click(caseACH)
			WebUI.click(openCase)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(sendToFed)
			WebUI.switchToWindowTitle('Send To Fed: 20240829000002')
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("Adhoc Menu Action step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editAttachmentReplacement() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject editAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ReplacementAttachment/click_edit_attachment')
			TestObject replacementAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/replacement_Attachment')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/btn_save')
			TestObject replacementClickAttachment = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ReplacementAttachment/click_replacement')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject verifyReplacementAudit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ReplacementAttachment/edit_attachment_replacement_audit')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject viewPointeAction = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentNoAttachment/click_view_pointe_action')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			//WebUI.mouseOver(viewPointeAction)
			WebUI.click(editAttachment)
			WebUI.switchToWindowIndex(2)
			WebUI.sendKeys(replacementClickAttachment, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifyReplacementAudit, GlobalVariable.globalLongDelay)
			WebUI.click(verifyReplacementAudit)
			// Test verifications
			assert WebUI.verifyElementPresent(verifyReplacementAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Edit Attachment Replacement step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def batchLetterPrinter(String contactname, String covertemplate, String bodytemplate) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			//TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/right_click_search')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject generateLetter = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/span_Generate Letter')
			TestObject mail = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/input_mail')
			TestObject sendto =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/select_bodytemplate')
			//TestObject senttoKenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/div_(Assigned User) Kenneth Hillyard')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/selectanybodytemplate')
			TestObject printButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/rdo_print')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/btn_save')
			TestObject auditNote = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/audit_note')
			TestObject verifyPrintedAudit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/verify_generate_letter_print_audit')
			TestObject closeButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/btn_close')
			TestObject senttoKenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/div_Kenny')
			TestObject openRecentCase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/open_recent_case')
			TestObject recentCases =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/span_Recent Cases')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(generateLetter)
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.scrollToElement(senttoKenny, GlobalVariable.globalLongDelay)
			WebUI.click(senttoKenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(printButton)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifyPrintedAudit, GlobalVariable.globalLongDelay)
			WebUI.click(verifyPrintedAudit)
			// Test verifications
			assert WebUI.verifyElementPresent(verifyPrintedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Batch Letter Printer step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def batchLetterPrinterprintPDF() {
		try {
			TestObject dropdownbox =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/dropdown_box')
			TestObject deleteButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_delete')
			TestObject printButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_print')
			TestObject printReviewButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_print_review')
			TestObject selectValue =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/selectvalue_box')
			TestObject selectCheckbox =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/checkbox_tick')

			WebUI.click(dropdownbox)
			WebUI.click(selectValue)
			WebUI.click(selectCheckbox)


			// Test verifications
			WebUI.verifyElementPresent(printButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(printReviewButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(deleteButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
		}catch(StepFailedException e) {

			log.logFailed("Batch Letter Printer print PDF step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def batchLetterPrinterTopSearchBar() {
		try {
			TestObject dropdownbox =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/dropdown_box')
			TestObject deleteButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_delete')
			TestObject printButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_print')
			TestObject printReviewButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/div_print_review')
			TestObject selectValue =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/selectvalue_box')
			TestObject inputToday =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/input_development_today')
			TestObject todayAll =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/input_Today_all')
			TestObject todaySevenDays =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/input_Today_sevenDays')
			TestObject todayThirtyDays =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/input_Today_thirtyDays')
			TestObject showPrinted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/input_Specify_showPrinted')
			TestObject selectCheckbox =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/BatchLetterPrinterPDFPrinter/checkbox_tick')

			WebUI.click(dropdownbox)
			WebUI.click(selectValue)
			WebUI.click(todaySevenDays)
			WebUI.click(todayThirtyDays)
			WebUI.click(todayAll)
			WebUI.click(showPrinted)
			WebUI.click(selectCheckbox)

			// Test verifications
			WebUI.verifyElementPresent(printButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(printReviewButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(deleteButton, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
		}catch(StepFailedException e) {

			log.logFailed("Batch Letter Printer print PDF step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def preDisputeAction(String arnnumber) {

		try {
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')
			TestObject createAuditAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_create_audit_attachment')
			TestObject verifySuccessMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/verify_success_message')
			TestObject verifyPreDisputeMessage = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/BulkAttachmentsRequest/audit_BulkAttachmentsRequests')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/span_ACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			TestObject preDisputeSubmit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/span_Pre Dispute Submit')
			TestObject openCaseDispute = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/openCase_predispute')
			TestObject checkboxIsEthoca =findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/input_Required_isEthoca')
			TestObject setARN = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/input_ARN_1_aRN')
			TestObject withdrawn = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/div_withdrawn')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/PreDisputeAction/btn_save')
			TestObject closeButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Batch Printer Letter/btn_close')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(debtor)
			WebUI.click(preDisputeSubmit)
			WebUI.switchToWindowIndex(2)
			WebUI.click(checkboxIsEthoca)
			//			WebUI.click(withdrawn)
			//			WebUI.setText(setARN, arnnumber)

			//Commenting save button as save button is not working on Web UI.
			//WebUI.click(btnSave)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)

			// Test verifications
			//WebUI.verifyElementPresent(verifyPreDisputeMessage, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Pre Dispute Action step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def mastercardTransactionLookUpValidation() {
		try {
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/div_Save')
			TestObject isTeamLeadCheckbox= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_Security Level_isTeamLead')
			TestObject testingXpertsUser= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_testingXperts')
			TestObject openCases= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_20241106000004')
			TestObject recentCases= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_Recent Cases')
			TestObject clickMasterCardLookUp= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_Mastercard')
			TestObject rightClickOnTimeline= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject enterConfigMode= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/path')
			TestObject verifyArn= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_ARN_aRN')
			TestObject verifyEndDate= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_End Date_endDate')
			TestObject verifyFromAmount= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_From Amount_fromAmount')
			TestObject verifyStartDate= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_PAN_pAN')
			TestObject verifyPan= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_Start Date_startDate')
			TestObject verifyToAmount= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/input_To Amount_toAmount')
			TestObject cancelButton= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/button_Cancel')

			//flow to check the team lead is selected and verify the config mode displays
			WebUI.click(testingXpertsUser)
			//boolean isCheckboxSelected= WebUI.verifyElementChecked(isTeamLeadCheckbox, GlobalVariable.globalMediumDelay, FailureHandling.CONTINUE_ON_FAILURE)

			boolean isCheckboxSelected= WebUI.verifyElementChecked(isTeamLeadCheckbox, GlobalVariable.globalMediumDelay, FailureHandling.CONTINUE_ON_FAILURE)
			if(isCheckboxSelected) {
				WebUI.comment("Team Lead is already checked")
			}
			else {
				WebUI.click(isTeamLeadCheckbox)
				WebUI.click(saveButton)
			}

			String caseprocessorUrl= ConfigurationManager.getBaseUrl('web')+ '/case-processor/Dispute/'
			WebUI.navigateToUrl(caseprocessorUrl)

			WebUI.click(recentCases)
			WebUI.click(openCases)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(clickMasterCardLookUp)
			WebUI.switchToWindowIndex(1)
			WebUI.click(enterConfigMode)
			//WebUI.verifyElementPresent(enterConfigMode, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)

			// Test verifications
			WebUI.verifyElementPresent(verifyPan, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyArn, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyStartDate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyEndDate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyToAmount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyFromAmount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')

			String userUrl= ConfigurationManager.getBaseUrl('web')+ '/user-maintenance/dispute/users'
			WebUI.navigateToUrl(userUrl)

			//flow to check the team lead is not selected and verify the config mode does not displays
			WebUI.click(testingXpertsUser)
			if(isCheckboxSelected) {
				WebUI.click(isTeamLeadCheckbox)
				WebUI.waitForElementVisible(saveButton, GlobalVariable.globalMediumDelay)
				WebUI.click(saveButton)
				WebUI.comment("Team Lead is unchecked")
			}
			else {
				WebUI.comment("Team Lead is already unchecked")
			}

			WebUI.navigateToUrl(caseprocessorUrl)
			WebUI.click(recentCases)
			WebUI.click(openCases)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(clickMasterCardLookUp)
			WebUI.switchToWindowIndex(1)

			// Test verifications
			WebUI.verifyElementNotPresent(enterConfigMode, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("Mastercard Transaction Lookup Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def mastercardTransactionLookUpSearchTransaction(String setarnnumber, String setpannumber) {
		try {
			TestObject openCases= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_20241106000004')
			TestObject recentCases= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_Recent Cases')
			TestObject clickMasterCardLookUp= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/span_Mastercard')
			TestObject rightClickOnTimeline= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject enterConfigMode= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/path')
			TestObject cancelButton= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercardlookup/button_Cancel')
			TestObject searchButton= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercard_lookup_search/btn_search')
			TestObject clearIcon= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercard_lookup_search/btn_clear_icon')
			TestObject setArn= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercard_lookup_search/input_ARN_aRN')
			TestObject setPan= findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/mastercard_lookup_search/input_PAN_pAN')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(clickMasterCardLookUp)
			WebUI.switchToWindowIndex(2)
			WebUI.click(searchButton)
			WebUI.click(clearIcon)
			WebUI.setText(setArn, setarnnumber)
			WebUI.clearText(setArn)
			WebUI.setText(setPan, setpannumber)
			WebUI.clearText(setPan)
			WebUI.click(cancelButton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {
			log.logFailed("Mastercard Transaction Lookup Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def fedAction(String datesetting, String receiveabanumber, String sendabanumber, String adjnumber, String refnumber) {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/div_my_cases')
			TestObject caseDebitCard = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/span_debit_card')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/span_opencase')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/right_click_search')
			TestObject sendToFed = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/span_send_to_fed')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/btn_cancel')
			TestObject abaNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/input_ABA_number')
			TestObject adjustmentNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/input_adjustment_amount')
			TestObject referenceNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/input_reference_number')
			TestObject sendAbaNumber = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/input_send_ABA_Number')
			TestObject selectCaseReso = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_caseRESO')
			TestObject selectCaseResoValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_caseRESO_Value')
			TestObject selectDisposition = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_DispositionDUP')
			TestObject selectDispositionValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_DispositionValue')
			TestObject selectProductClass = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_ProductClass')
			TestObject selectProductClassValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_ProductClassValue')
			TestObject selectRequestDebit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_RequestDebitDB')
			TestObject selectRequestDebitValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/select_RequestDebitDBValue')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/button_Save')
			TestObject verifySendToFedAudit = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/verify_send_to_fed')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject setDate = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/fedAction/set_date')
			TestObject auditNote = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/audit_note')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(sendToFed)
			WebUI.switchToWindowIndex(2)
			WebUI.click(selectDisposition)
			WebUI.click(selectDispositionValue)
			WebUI.click(selectRequestDebit)
			WebUI.click(selectRequestDebitValue)
			WebUI.click(selectCaseReso)
			WebUI.click(selectCaseResoValue)
			WebUI.setText(abaNumber, receiveabanumber)
			WebUI.setText(sendAbaNumber, sendabanumber)
			WebUI.setText(setDate, datesetting)
			WebUI.setText(adjustmentNumber, adjnumber)
			WebUI.click(selectProductClass)
			WebUI.click(selectProductClassValue)
			WebUI.scrollToElement(referenceNumber, GlobalVariable.globalMediumDelay)
			WebUI.setText(referenceNumber, refnumber)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.click(closeButton)
			WebUI.click(auditNote)
			WebUI.scrollToElement(verifySendToFedAudit,  GlobalVariable.globalLongDelay)

			// Test verifications
			WebUI.verifyElementPresent(verifySendToFedAudit, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(closeButton)
		}catch(StepFailedException e) {

			log.logFailed("Fed Action Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
