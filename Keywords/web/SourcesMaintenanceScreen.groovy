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

public class SourcesMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createSourceWithWorkflowVersion(String newsSourceName) {
		try {
			TestObject sourceName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/input_Source_Name')
			TestObject clkWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/select_Source_Workflow')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/ddl_Source_Workflow_Version_Upgrade')

			WebUI.click(sourceName)
			WebUI.setText(sourceName, newsSourceName)
			WebUI.click(clkWorkflow)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Create Source With Workflow Version Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowVersionSources() {
		try {
			TestObject sltSource = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/span_Workflow_Version')

			WebUI.click(sltSource)
		} catch(StepFailedException e) {
			log.logFailed("select Workflow Version Sources Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseEntrySource() {
		try {
			TestObject sltSource = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/span_Case_Entry_Source')

			WebUI.click(sltSource)
		} catch(StepFailedException e) {
			log.logFailed("select Case Entry Source Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTranscodeQuestionWorkflow() {
		try {
			TestObject clkWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/select_Source_Workflow')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Trancode_Question')

			WebUI.click(clkWorkflow)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("select Trancode Question Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectOpenCaseWorkflow() {
		try {
			TestObject sltRecord = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/span_Case_Entry_Source')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/Page_Source_Main_Records/ddl_Workflow_Open_Case')

			WebUI.click(sltRecord)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("select Open Case Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}
