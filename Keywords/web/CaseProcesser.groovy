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
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import internal.GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger

public class CaseProcesser {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoCaseProcesser() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Page_TRIPS/div_Process')
			WebUI.click(Process)
			TestObject CaseProcesser = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Page_TRIPS/div_Case Processor')
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
}

