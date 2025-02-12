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
import config.ConfigurationManager
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import org.apache.commons.lang.RandomStringUtils
import java.util.Random

public class RequestorPayout {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetolegalCaseProcesser() {
		try {
			TestObject Legal = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/svg_Legal_bi bi-chevron-down')
			WebUI.click(Legal)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Process')
			WebUI.click(Process)
			TestObject CaseProcesser = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Case Processor')
			WebUI.click(CaseProcesser)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate CaseProcesser step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def requestorPayout() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			//TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject requestorpayout =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor Payout')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(timelinesearch)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(requestorpayout)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Requestorpayout step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def requestorPayoutc() {
		try {
			TestObject requestpayoutsymbol =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Requestor Payout')
			TestObject selectfeeAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_Feeamttemplate')
			TestObject sendAmttemplateselect =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_Sendamttemplate')
			TestObject acctentries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/div_Accounting Entries')
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject sendAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_sendAmt')
			TestObject sendAmt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/input_Send Amount_itemAfter')
			TestObject feeAmt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/input_Fee Amount_itemAfter')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject feeAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_feeAmt')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.switchToWindowIndex(2)
			WebUI.setText(sendAmt,'21')
			WebUI.setText(feeAmt,'14')
			WebUI.click(sendAmttemplate)
			WebUI.click(sendAmttemplateselect)
			WebUI.click(feeAmttemplate)
			WebUI.click(selectfeeAmttemplate)
			WebUI.verifyElementPresent(acctentries, 0)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("RequestorPayout step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def requestorPayoutcal() {
		try {
			TestObject requestpayoutsymbol =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Requestor Payout')
			TestObject selectfeeAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_Feeamttemplate')
			TestObject sendAmttemplateselect =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_Sendamttemplate')
			TestObject acctentries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/div_Accounting Entries')
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject sendAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_sendAmt')
			TestObject sendAmt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/input_Send Amount_itemAfter')
			TestObject feeAmt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/input_Fee Amount_itemAfter')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject feeAmttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor Payout/select_feeAmt')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			TestObject amt1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_0.21requestotpayout')
			TestObject amt2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_0.41requestotpayout')
			WebUI.switchToWindowIndex(2)
			WebUI.setText(sendAmt,'210')
			WebUI.setText(feeAmt,'140')
			WebUI.click(sendAmttemplate)
			WebUI.click(sendAmttemplateselect)
			WebUI.click(feeAmttemplate)
			WebUI.click(selectfeeAmttemplate)
			//WebUI.verifyElementPresent(amt1, 0)
			//WebUI.verifyElementPresent(amt2, 0)
			WebUI.verifyElementPresent(acctentries, 0)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("RequestorPayout step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def amtentries() {
		try {
			TestObject entries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Entries - Amount')
			TestObject detail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Detail')
			TestObject acctentries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Accounting Entries')
			TestObject entriesbook =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/enteriesbook')
			WebUI.click(entriesbook)
			WebUI.click(detail)
			WebUI.verifyElementPresent(acctentries, 0)
		}catch(StepFailedException  e) {
			log.logFailed("RequestorPayout step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def requestor() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			//TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject requestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject inputname =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/input_Name')
			TestObject newrequestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/span_Add New Requestor')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/button_Save')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(timelinesearch)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(requestor)
			GlobalVariable.globalMediumDelay
			WebUI.click(newrequestor)
			WebUI.verifyElementPresent(inputname, 0)
			WebUI.click(save)
		}catch(StepFailedException  e) {
			log.logFailed("Requestorpayout step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

