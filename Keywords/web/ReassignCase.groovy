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

public class ReassignCase {
	KeywordLogger log =new KeywordLogger()
	@Keyword

	def reassigncase1() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject caseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_FirstCaseId')
			TestObject flagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Flag Case')
			TestObject selectflagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Select a Flag')
			TestObject selectgreenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Green Flag')
			TestObject sendbutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Send')
			TestObject greenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/icongreenflag')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject reassigncase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_Reassign Case')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(timelinesearch)
			WebUI.rightClick(timelinesearch)
			WebUI.click(reassigncase)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("phonecall step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def reassigncase() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject reassigncase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_Reassign Case')
			TestObject selecttype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_TypeReassign')
			TestObject typename =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/type_name')
			TestObject selectuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_Select User')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject typeuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/type_user')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject yes =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/yesButton')
			WebUI.switchToWindowIndex(2)
			WebUI.click(selecttype)
			WebUI.click(typename)
			WebUI.click(selectuser)
			WebUI.click(typeuser)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(yes)
			GlobalVariable.globalMediumDelay
			WebUI.click(audit)
			WebUI.click(close)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Reassign case step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def reassigntimeline() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject reassigncase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_Reassign Case')
			TestObject selecttype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_TypeReassign')
			TestObject typetimeline =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_timeline')
			TestObject selectuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_Select User')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject typeuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/type_user')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject yes =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/yesButton')
			WebUI.switchToWindowIndex(2)
			WebUI.click(selecttype)
			WebUI.click(typetimeline)
			GlobalVariable.globalMediumDelay
			WebUI.click(selectuser)
			WebUI.click(typeuser)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(yes)
			WebUI.click(audit)
			WebUI.click(close)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Reassign timeline step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def reassigncasebacktoUser() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject reassigncase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_Reassign Case')
			TestObject selecttype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_TypeReassign')
			TestObject casebacktouser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/reassigncase_backtouser')
			TestObject selectuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_Select User')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject typeuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/type_user')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject yes =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/yesButton')
			WebUI.switchToWindowIndex(2)
			WebUI.click(selecttype)
			WebUI.click(casebacktouser)
			GlobalVariable.globalMediumDelay
			WebUI.click(selectuser)
			WebUI.click(typeuser)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(yes)
			WebUI.click(audit)
			WebUI.click(close)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Reassign timeline step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def reassigntimelinebacktoUser() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject reassigncase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_Reassign Case')
			TestObject selecttype =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_TypeReassign')
			TestObject timelinebacktouser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/reassign_timelinebacktouser')
			TestObject selectuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/select_Select User')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject typeuser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/type_user')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject no =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Reassign Case/yesButton')
			WebUI.switchToWindowIndex(2)
			WebUI.click(selecttype)
			WebUI.click(timelinebacktouser)
			GlobalVariable.globalMediumDelay
			WebUI.click(selectuser)
			WebUI.click(typeuser)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(no)
			WebUI.click(audit)
			WebUI.click(close)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Reassign timeline step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
