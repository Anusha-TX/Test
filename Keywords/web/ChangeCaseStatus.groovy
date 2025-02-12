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

public class ChangeCaseStatus {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def changecase() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject changecasestatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Change Case Status')
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			WebUI.click(mycase)
			WebUI.click(atm)
			WebUI.click(caseid)
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(timelinesearch)
			WebUI.click(changecasestatus)
			GlobalVariable.globalMediumDelay
			WebUI.click(homesearch)
			GlobalVariable.globalMediumDelay
			WebUI.click(homesearchbtn)
			GlobalVariable.globalMediumDelay
			WebUI.doubleClick(firstcaseID)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecasestatus step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def changecase1() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject changecasestatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Change Case Status')
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.click(changecasestatus)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecasestatus step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def changecasestatus() {
		try {
			TestObject selectstatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Change Case Status/select_status')
			TestObject selectNewstatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Change Case Status/select_Newstatus')
			TestObject terminateworkflow =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Change Case Status/input_New Status_terminateWorkflow')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Change Case Status/button_Save')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject closestatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			TestObject statussymbol =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_User Performed Change Case Status')
			TestObject newstatus =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Change Case Status/New_status')
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			WebUI.switchToWindowIndex(2)
			WebUI.click(selectstatus)
			WebUI.click(selectNewstatus)
			WebUI.click(terminateworkflow)
			WebUI.click(saveButton)
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			//WebUI.scrollToElement(statussymbol, 0)
			//WebUI.click(statussymbol)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecasestatus step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
