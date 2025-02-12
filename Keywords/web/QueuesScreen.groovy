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

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import internal.GlobalVariable

public class QueuesScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createQueue(String queuename) {

		try {

			TestObject queueField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/queue_name')
			TestObject editRuleField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/rule')
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/data_field')
			TestObject staticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/static_field')
			TestObject staticValue = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/static_value')
			TestObject saveField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/save_button')
			TestObject saveMainField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/save_main_button')
			TestObject yesButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/btn_yes')
			TestObject verifyQueueName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/verify_queue_name')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Queues/QueueMaintenance/delete_button')

			WebUI.setText(queueField,queuename)
			WebUI.click(editRuleField)
			WebUI.click(dataField)
			WebUI.click(staticField)
			WebUI.click(staticValue)
			WebUI.click(saveField)
			WebUI.click(saveField)
			WebUI.click(saveMainField)
			WebUI.click(yesButton)

			//Test validations
			WebUI.verifyElementPresent(verifyQueueName, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
			WebUI.click(saveMainField)
			WebUI.click(yesButton)
			
		}catch(StepFailedException e) {

			log.logFailed("Queue creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
