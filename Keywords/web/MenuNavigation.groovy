package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.google.api.client.util.Key
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

public class MenuNavigation {
	private KeywordLogger log = new KeywordLogger()

	private void clickMenuItems(TestObject... menuItems) {
		for (TestObject item : menuItems) {
			WebUI.click(item)
		}
	}

	private void handleNavigation(String navigationName, Closure navigationAction) {
		try {
			navigationAction()
		} catch (StepFailedException e) {
			log.logFailed("Navigate to ${navigationName} Step failed: ${e.getMessage()}")
			WebUI.takeScreenshot()
			throw e
		} catch (Exception e) {
			log.logError("Unexpected error occurred: ${e.getMessage()}")
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigateToCaseStatuses() {
		handleNavigation("Case Status") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case Statuses')
					)
		}
	}

	@Keyword
	def navigateToCaseTypesMaintenance() {
		handleNavigation("Case Types") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case Types')
					)
		}
	}

	@Keyword
	def navigateToCaseProcessor() {
		handleNavigation("Case Processor") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Process'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case Processor')
					)
		}
	}

	@Keyword
	def navigateToAccountingEntriesMaintenance() {
		handleNavigation("Accounting Entries Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Templates'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Accounting Entries')
					)
		}
	}

	@Keyword
	def navigateToMenuMaintenance() {
		handleNavigation("Menu Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Common'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Menu Maintenance')
					)
		}
	}

	@Keyword
	def navigateToWorkCoordinator() {
		handleNavigation("Work Coordinator") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Process'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Work Coordinator')
					)
		}
	}

	@Keyword
	def navigateToAccountMaintenance() {
		handleNavigation("Account Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Accounts')
					)
		}
	}


	@Keyword
	def navigateToWorkflowsMaintenance() {
		handleNavigation("Workflow Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Workflows')
					)
		}
	}


	@Keyword
	def naviageToSecurityMaintenance() {
		handleNavigation("Security Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Common'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Security_Maintenance')
					)
		}
	}


	@Keyword
	def navigateToTagMaintenance() {
		handleNavigation("Tag Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Templates'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Tags')
					)
		}
	}


	@Keyword
	def navigateToCustomViewMaintenance() {
		handleNavigation("Custom Views Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Misc'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Custom Views')
					)
		}
	}


	@Keyword
	def navigateToCashiersCheckMaintenance() {
		handleNavigation("Cashiers Check maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Misc'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Cashiers Check')
					)
		}
	}


	@Keyword
	def navigateToAttachmentOverlapTemplate() {
		handleNavigation("Attachment Overlap Template Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Templates'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Attachment_Overlay')
					)
		}
	}

	@Keyword
	def navigateToBankMaintenance() {
		handleNavigation("Bank Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Misc'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Banks')
					)
		}
	}

	@Keyword
	def navigateToCaseEntry() {
		handleNavigation("Case Entry") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Process'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case Entry')
					)
		}
	}

	@Keyword
	def navigateToTranscodeMaintenance() {
		handleNavigation("Transcode Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Misc'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Trancodes')
					)
		}
	}

	@Keyword
	def naviageToApplicationSettingMaintenance() {
		handleNavigation("Application Setting Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Common'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Settings')
					)
		}
	}

	@Keyword
	def navigateToItemDataMaintenance() {
		handleNavigation("Item Data Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Data_Elements')
					)
		}
	}


	@Keyword
	def navigateToLegalWorkflowsMaintenance() {
		handleNavigation("Workflow Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Workflows')
					)
		}
	}


	@Keyword
	def navigateToInternalAccountsMaintenance() {
		handleNavigation("Internal Accounts Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Misc'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Internal_Accounts')
					)
		}
	}


	@Keyword
	def navigateToCaseSourcesMaintenance() {
		handleNavigation("Case Sources Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case_Sources')
					)
		}
	}

	@Keyword
	def navigateToUserMaintenance() {
		handleNavigation("User Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Users'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Users_Another')
					)
		}
	}


	@Keyword
	def navigateToQueuesMaintenance() {
		handleNavigation("Queues Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Queues')
					)
		}
	}

	@Keyword
	def navigateToDisputeAccountingEntriesMaintenance() {
		handleNavigation("Accounting Entries Maintenance") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Dispute'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Templates'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Accounting Entries')
					)
		}
	}

	@Keyword
	def navigateToLegalUserMaintenance() {
		handleNavigation("User Maintenance"){
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Users'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Users_Another')
					)
		}
	}

	@Keyword
	def navigateToLegalCaseEntry() {
		handleNavigation("Case Entry") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Process'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Case Entry')
					)
		}
	}
	
	@Keyword
	def navigateToLegalCaseTypesMaintenance() {
		handleNavigation("Case Types") {
			clickMenuItems(
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Legal'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Maintain'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Processes'),
					findTestObject('Object Repository/Web/Navigate_To_Objects/div_Types')
					)
		}
	}
	
}