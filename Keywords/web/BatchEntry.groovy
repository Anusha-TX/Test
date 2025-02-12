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

public class BatchEntry {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoBatchEntry() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Process (1)')
			WebUI.click(Process)
			TestObject batchentry = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Batch Entry')
			WebUI.click(batchentry)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate batch entry step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def batchentry() {
		try {
			TestObject batchentry = findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/div_Batch Entry')
			//TestObject selectanyoption =findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/input_List')
			TestObject  casetype=findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/select_Select A Case Type')
			TestObject caseid =findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/span_20240909000003')
			TestObject readonly =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Enter in Read Only')
			TestObject acknowledge = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Case Entry/input_List')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/button_Save')
			TestObject createdcases =findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/div_Created Cases')
			TestObject associatedview = findTestObject('Object Repository/Web/Dispute/Process/BatchEntry/Page_Batch Entry/associated_case')
			WebUI.click(casetype)
			GlobalVariable.globalMediumDelay
			WebUI.selectOptionByLabel(casetype, 'ACH', false)
			//WebUI.click(selectanyoption)
			GlobalVariable.globalMediumDelay
			WebUI.check(acknowledge)
			WebUI.click(save)
			WebUI.verifyElementPresent(createdcases, 0)
			WebUI.doubleClick(caseid)
			WebUI.switchToWindowIndex(1)
			//WebUI.click(readonly)
			//WebUI.click(readonly)
		}catch(StepFailedException  e) {
			log.logFailed("Batchentry step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
