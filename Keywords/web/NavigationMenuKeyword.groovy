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
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

public class NavigationMenuKeyword {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def navigateToContacts() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToMiscField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Misc')
			TestObject navigateToContactsField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Contacts')

			WebUI.delay(10)
			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToMiscField)
			WebUI.click(navigateToContactsField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Contacts Maintenance step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToFee() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToMiscField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Misc')
			TestObject navigateToFeeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Fee')

			WebUI.delay(10)
			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToMiscField)
			WebUI.click(navigateToFeeField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Fee Maintenance step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToCaseProcessor() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToProcessField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Process')
			TestObject navigateToCaseProcessorField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_CaseProcessor')

			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToProcessField)
			WebUI.click(navigateToCaseProcessorField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Case Processor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToInboundDocuments() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToMiscField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Misc')
			TestObject navigateToInboundDocumentsField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_InboundDocuments')

			WebUI.delay(10)
			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToMiscField)
			WebUI.click(navigateToInboundDocumentsField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Inbound Documents step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToApplicationSettings() {

		try {
			TestObject navigateToCommonField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Common')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToSettingsField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Settings')

			WebUI.click(navigateToCommonField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToSettingsField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Application Maintenance step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToUsersMaintenanceFromDispute() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToUsersField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Users')

			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToUsersField)
			WebUI.click(navigateToUsersField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Users Maintenance step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def navigateToActionsFromLegal() {

		try {
			TestObject navigateToLegalField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToProcessesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Misc')
			TestObject navigateToActionsField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_InboundDocuments')

			WebUI.delay(5)
			WebUI.click(navigateToLegalField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToProcessesField)
			WebUI.click(navigateToActionsField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Actions from Legal step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToAccountingEntriesFromAdjustment() {

		try {
			TestObject navigateToAdjustmentField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Adjustment')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToWorkflowField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Workflow')
			TestObject navigateToTemplatesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Templates')
			TestObject navigateToAccountingTemplatesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Accounting Templates')

			WebUI.delay(5)
			WebUI.click(navigateToAdjustmentField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToWorkflowField)
			WebUI.click(navigateToTemplatesField)
			WebUI.click(navigateToAccountingTemplatesField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Accounting Templates from Adjustment step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	def navigateToAccountingEntriesFromDispute () {
		try {
			TestObject navigateToDisputeField =  findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToTemplatesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Templates')
			TestObject navigateToAccountingEntriesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Accounting Entries')

			WebUI.delay(5)
			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToTemplatesField)
			WebUI.click(navigateToAccountingEntriesField)
		} catch(StepFailedException e) {
			log.logFailed("Navigation to Accounting Entries from Dispute step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToReportGeneratorFromDispute() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToMiscField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Misc')
			TestObject navigateToReportsField = findTestObject('Object Repository/Web/Navigation_Objects/div_Report Generator')

			GlobalVariable.globalShortDelay
			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToMiscField)
			WebUI.click(navigateToReportsField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Report Generator step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToReviewProfilesFromDispute() {

		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Dispute')
			TestObject navigateToMaintainField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Maintain')
			TestObject navigateToUsersField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_Users')
			TestObject navigateToReviewProfilesField = findTestObject('Object Repository/Web/Navigation_Objects/navigate_To_ReviewProfiles')

			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintainField)
			WebUI.click(navigateToUsersField)
			WebUI.click(navigateToReviewProfilesField)
		}catch(StepFailedException e) {

			log.logFailed("Navigation to Review Profiles step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


