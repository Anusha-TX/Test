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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import config.ConfigurationManager
import org.apache.commons.lang.RandomStringUtils

public class GenericClaim {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoCaseType() {
		try {
			TestObject dispute = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_TRIPS/div_Dispute')
			WebUI.click(dispute)
			TestObject process = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_TRIPS/div_Process')
			WebUI.click(process)
			TestObject caseType = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_TRIPS/div_Case Entry')
			WebUI.click(caseType)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to CaseType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def createnewGenericCaseType() {
		try {

			TestObject newClaimbutton = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/button_New Claim')
			TestObject genericclaim = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Generic Claim')
			TestObject selectcase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_R360')
			TestObject next = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Next')
			TestObject next2 =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Please answer all required questionsNext')
			TestObject acknowledge = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/input_List')
			TestObject others =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/selectcheckbox2')
			WebUI.click(newClaimbutton)
			WebUI.click(genericclaim)
			WebUI.click(selectcase)
			WebUI.click(next)
			GlobalVariable.globalMediumDelay
			WebUI.check(acknowledge)
			WebUI.check(others)
			WebUI.click(next)
		}catch(StepFailedException  e) {
			log.logFailed("Create newGenericcaseType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def createnewGenericCase() {
		try {

			TestObject newClaimbutton = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/button_New Claim')
			TestObject genericclaim = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Generic Claim')
			TestObject selectcase = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_R360')
			TestObject next = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Next')
			TestObject next2 =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/div_Please answer all required questionsNext')
			TestObject acknowledge = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/input_List')
			TestObject others =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/selectcheckbox2')
			TestObject caseid =findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/caseiddoubleclick')
			WebUI.click(newClaimbutton)
			WebUI.click(genericclaim)
			WebUI.click(selectcase)
			WebUI.click(next)
			GlobalVariable.globalMediumDelay
			WebUI.check(acknowledge)
			WebUI.check(others)
			WebUI.click(next)
			WebUI.doubleClick(caseid)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("Create newGenericcaseType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
