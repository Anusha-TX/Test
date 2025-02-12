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



public class CommonMaintenanceScreen_new {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def searchAndReplaceOperation(String account, String bank) {

		try {
			TestObject search_box = findTestObject('Object Repository/Web/Common/Maintain/Settings/searchAndReplace/search_box')

			WebUI.click(search_box)
			WebUI.setText(search_box, account)
			WebUI.clearText(search_box)
			WebUI.setText(search_box, bank)
		}catch(StepFailedException e) {

			log.logFailed("Search and Replace step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def settingsEditApplication(String id, String name, String notes) {

		try {
			TestObject addID = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceEditApplication/add_id')
			TestObject addName = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceEditApplication/add_name')
			TestObject addNotes = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceEditApplication/add_notes')
			TestObject selectAchReturn = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceEditApplication/select_Ach_Return')

			WebUI.click(selectAchReturn)
			WebUI.setText(addID, id)
			WebUI.setText(addName, name)
			WebUI.setText(addNotes, notes)
		}catch(StepFailedException e) {

			log.logFailed("Edit application Settings failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def settingsHomeScreen() {

		try {
			TestObject search_box = findTestObject('Object Repository/Web/Common/Maintain/Settings/searchAndReplace/search_box')
			TestObject selectAccountingEntries = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceHomeScreen/select_Accounting_Entries')
			TestObject selectLegalAccountingEntries = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceHomeScreen/select_Legal_Accounting_Entries')

			WebUI.click(selectAccountingEntries)
			WebUI.click(search_box)
		}catch(StepFailedException e) {

			log.logFailed("Settings Maintenance Home Screen failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def settingsNavigationPane() {

		try {
			TestObject leftArrow = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceNavigationPane/arrow_left')
			TestObject rightArrow = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceNavigationPane/arrow_right')
			TestObject selectAccountingEntries = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceHomeScreen/select_Accounting_Entries')
			TestObject mouseOverElement = findTestObject('Object Repository/Web/Common/Maintain/Settings/settingsMaintenanceHomeScreen/mouseOverElement')

			WebUI.mouseOver(mouseOverElement)
			WebUI.click(leftArrow)
			WebUI.click(rightArrow)
			WebUI.click(selectAccountingEntries)
			WebUI.mouseOver(leftArrow)
			WebUI.click(leftArrow)
			WebUI.click(rightArrow)
		}catch(StepFailedException e) {

			log.logFailed("Settings Maintenance Navigation Pane failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def toggleAndListINISettings(String key, String value, String actionnotes) {

		try {
			TestObject clickCaseEntry = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/click_CaseEntry')
			TestObject selectToggle = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/toggle_recon')
			TestObject deleteButton = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/btn_delete')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/btn_save')
			TestObject clickCaseProcessor = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/click_CaseProcessor')
			TestObject actionKey = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/input_key')
			TestObject actionValue = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/input_value')
			TestObject actionNotes = findTestObject('Object Repository/Web/Common/Maintain/Settings/toggleAndListINISettings/input_actionnotes')

			WebUI.click(clickCaseEntry)
			WebUI.click(selectToggle)
			WebUI.click(saveButton)
			WebUI.click(clickCaseProcessor)
			WebUI.setText(actionKey, key)
			WebUI.setText(actionValue, value)
			WebUI.setText(actionNotes, actionnotes)
			WebUI.click(saveButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("Toggle and List INI Settings failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addRemoveMenuWidgets() {

		try {
			TestObject userdropDown = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/user_drop_down')
			TestObject userSettingsButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_user_settings')
			TestObject menuWidgetsButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_menu_widgets')
			TestObject addJobExe = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/add_job_executions')
			TestObject addMessages = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/add_messages')
			TestObject deleteButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_delete')
			TestObject sourceMessages = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/source_messages')
			TestObject targetJobExecutions = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/target_jobexecutions')

			WebUI.click(userdropDown)
			WebUI.click(userSettingsButton)
			WebUI.click(menuWidgetsButton)
			WebUI.click(addJobExe)
			WebUI.click(userdropDown)
			WebUI.click(userSettingsButton)
			WebUI.click(menuWidgetsButton)
			WebUI.click(addMessages)
			WebUI.dragAndDropToObject(sourceMessages, targetJobExecutions)
			//WebUI.click(arrowMove)
			//WebUI.click(dropToJobExecutions)
			//WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("Add/Remove Menu Widgets step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addCaseQueuesMenuWidgets() {

		try {
			TestObject userdropDown = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/user_drop_down')
			TestObject userSettingsButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_user_settings')
			TestObject menuWidgetsButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_menu_widgets')
			TestObject caseQueues = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/add_case_queues')
			TestObject deleteButton = findTestObject('Object Repository/Web/Common/Maintain/MenuMaintenance/btn_delete')

			WebUI.click(userdropDown)
			WebUI.click(userSettingsButton)
			WebUI.click(menuWidgetsButton)
			WebUI.click(caseQueues)
		}catch(StepFailedException e) {

			log.logFailed("Add Case Queues Menu Widgets step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}



	@Keyword
	def addCaseentry() {

		try {
			TestObject sorce_id = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Application Settings Maintenance/input_Source ID_value')
			TestObject case_entry = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Application Settings Maintenance/span_Case Entry')
			TestObject save_btn = findTestObject('Object Repository/Web/Dispute/Process/Case Entry/Page_Application Settings Maintenance/button_Save')

			WebUI.click(case_entry)
			WebUI.setText(sorce_id ,'47')
		}catch(StepFailedException e) {

			log.logFailed("Add source id to Case  step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def add_ReconBalancing() {

		try {
			TestObject sorce_id =findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/Page_Application Settings Maintenance/span_Case Entry')
			TestObject recon_balancing = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/Page_Application Settings Maintenance/div_Recon BalancingLast Edit  November 22nd_a2a138')
			TestObject save_btn = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/Page_Application Settings Maintenance/button_Save')
			WebUI.scrollToElement(sorce_id, 10)
			WebUI.click(sorce_id)
			WebUI.click(recon_balancing)
			WebUI.click(save_btn)
		}catch(StepFailedException e) {

			log.logFailed("Add source id to Case  step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

