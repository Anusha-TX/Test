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

public class DisputePostingReset {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def postingResetRecreateBatch() {
		try {
			TestObject refreshButton = findTestObject('Object Repository/Web/Dispute/Process/PostingReset/Page_Posting Reset/span_Refresh')
			TestObject inputDate = findTestObject('Object Repository/Web/Dispute/Process/PostingReset/Page_Posting Reset/input_date')
			TestObject reCreateBatch = findTestObject('Object Repository/Web/Dispute/Process/PostingReset/Page_Posting Reset/div_Recreate_Batch')
			TestObject reset = findTestObject('Object Repository/Web/Dispute/Process/PostingReset/Page_Posting Reset/div_Reset')
			TestObject verifyPostingReset = findTestObject('Object Repository/Web/Dispute/Process/PostingReset/Page_Posting Reset/div_Posting Reset')

			WebUI.click(refreshButton)

			// Test verifications
			WebUI.verifyElementPresent(refreshButton, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(inputDate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(reCreateBatch, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(reset, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(verifyPostingReset, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.takeFullPageScreenshot()
		} catch(StepFailedException e) {
			log.logFailed("posting Reset Batch Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
