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

public class DisputeActionMaintenance {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def editAttachment() {

		try {
			TestObject myCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/my_cases')
			TestObject myRecentCases = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/recent_cases')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/child_support')
			TestObject recentCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case')
			TestObject openCase = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/open_recent_case')
			TestObject rightClickOnTimeline = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/right_click_search')
			TestObject editAttachment = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/click_requestor')
			TestObject deleteButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/add_new_requestor')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/input_name_new')

			WebUI.click(myCases)
			WebUI.click(childSupport)
			WebUI.click(openCase)
			WebUI.rightClick(rightClickOnTimeline)
			WebUI.click(editAttachment)
			WebUI.switchToWindowTitle('Requestor: 20240826000006')
			WebUI.click(deleteButton)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Edit Attachment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
