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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import internal.GlobalVariable

public class CaseSourceMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createAndSaveSource(String sourcename, String sourcedescription, String sourceinfo, String workflow) {

		try {

			TestObject newButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/add_new_button')
			TestObject sourceName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/source_name')
			TestObject sourceDescription= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/add_description')
			TestObject sourceInfo = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/source_info')
			TestObject selectWorkflow= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/select_workflow_value')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/save_delete_clear_History/btn_save')

			WebUI.click(newButton)
			WebUI.setText(sourceName, sourcename)
			WebUI.setText(sourceDescription, sourcedescription)
			WebUI.setText(sourceInfo, sourceinfo)
			WebUI.selectOptionByLabel(selectWorkflow, workflow, true)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Source creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteSource() {

		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/save_delete_clear_History/btn_delete')

			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("Source deletion failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
