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
public class ChangeCaseType {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def changecasetype() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject changecasetype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Change Case Type')
			WebUI.click(mycase)
			WebUI.click(atm)
			WebUI.click(caseid)
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(timelinesearch)
			WebUI.click(changecasetype)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecasetype step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def changecasetype1() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject changecasetype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Change Case Type')
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(timelinesearch)
			WebUI.rightClick(timelinesearch)
			WebUI.click(changecasetype)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecasetype step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def changeType() {
		try {
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject auditcasetype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/td_User Performed Change Case Type')
			TestObject newtype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change Case Type/newtype')
			TestObject selectnewtype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change Case Type/selectnewtype')
			TestObject selectworkflow =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change Case Type/selectworkflow')
			TestObject selectanyworkflow =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change Case Type/selectanyworkflow')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change Case Type/button_Save')
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			TestObject attachment =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Attachments  1')

			WebUI.switchToWindowIndex(2)
			WebUI.click(newtype)
			WebUI.click(selectnewtype)
			WebUI.click(selectworkflow)
			WebUI.click(selectanyworkflow)
			WebUI.click(save)
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			//WebUI.click(attachment)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("changecaseType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


