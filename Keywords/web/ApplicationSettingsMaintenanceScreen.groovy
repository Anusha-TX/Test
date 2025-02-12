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

import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

// Keywords Functions

public class ApplicationSettingsMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def checkSites() {
		try {
			TestObject clkSecurityMain = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Site_To_Bank_Mapping/span_Security Maintenance')

			WebUI.click(clkSecurityMain)
		} catch(StepFailedException e) {
			log.logFailed("Check Sites Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkHideDataSetter() {
		try {
			TestObject clkQuestionnairre =	findTestObject('Object Repository/Web/Common/Maintain/Setting Maintenance/Page_INI_Application_Setting/span_Questionnaire')

			WebUI.click(clkQuestionnairre)
		} catch(StepFailedException e) {
			log.logFailed("Check Hide Data Setter Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkDisputeCaseProcessor() {
		try {
			TestObject clkCaseProcessor = findTestObject('Object Repository/Web/Common/Maintain/Setting Maintenance/Page_INI_Application_Setting/span_Case_Processor')
			TestObject sltViews = findTestObject('Object Repository/Web/Common/Maintain/Setting Maintenance/Page_INI_Application_Setting/div_Views')
			TestObject moveUptoValue = findTestObject('Object Repository/Web/Common/Maintain/Setting Maintenance/Page_INI_Application_Setting/input_INI_Value')

			WebUI.click(clkCaseProcessor)
			WebUI.mouseOver(sltViews)
			WebUI.mouseOver(moveUptoValue)
		} catch(StepFailedException e) {
			log.logFailed("Click Dispute Case Processor Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


