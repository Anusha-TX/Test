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
import config.ConfigurationManager

public class TypeMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	def navigateToTypeMaintenance() {

		try {

			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Dispute/Navigation_Objects/navigate_To_Maintain (1)')
			TestObject navigateToProcessesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Processes')
			TestObject navigateToCaseTypesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_CaseTypes')
			TestObject selectAcquirerChargeback = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/select_acquirer_charge_back')
			TestObject addStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/add_Stage')

			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToProcessesField)
			WebUI.click(navigateToCaseTypesField)
			WebUI.click(selectAcquirerChargeback)
			WebUI.click(addStage)
		}catch(StepFailedException e) {

			log.logFailed("Type Maintenance step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
