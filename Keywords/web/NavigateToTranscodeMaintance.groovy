package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import config.TestDataManager

public class NavigateToTranscodeMaintance {
	KeywordLogger log=new KeywordLogger()

	@Keyword
	def selectTranscodeForAutoUpgradeVersion(String workflowName) {
		try {
			TestObject sltTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/span_7211_Card_ATM')
			TestObject trancode_preEntry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/input_Pre-CaseEntry')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/a_Version Upgrade - Entry Node (version 1)')
			TestObject button_Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/button_Save')

			WebUI.click(sltTranscode)
			WebUI.setText(trancode_preEntry,workflowName)
			WebUI.click(sltWorkflow)
			WebUI.click(button_Save)
		} catch(StepFailedException e) {
			log.logFailed("Select Transcode For Transcode Questionnariew step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTranscodeCardATM() {
		try {
			TestObject sltTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/span_7211_Card_ATM')
			TestObject trancode_preentry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/input_Pre-CaseEntry')

			WebUI.click(sltTranscode)
		} catch(StepFailedException e) {
			log.logFailed("Select Transcode For Transcode Questionnariew step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTranscodeForEntryCaseWorkflow(String workflowName) {
		try {
			TestObject sltTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/span_1080_Deposit')
			TestObject trancode_preEntry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/input_Pre-CaseEntry')
			TestObject sltWorkflow =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/a_Entry Case - Entry Node (version 1)')
			TestObject button_Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Questionnarie_Workflow/button_Save')

			WebUI.click(sltTranscode)
			WebUI.setText(trancode_preEntry,workflowName)
			WebUI.click(sltWorkflow)
			WebUI.click(button_Save)
		} catch(StepFailedException e) {
			log.logFailed("Select Transcode For Entry Case Workflow Step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}

