package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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

public class NavigateToUserMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def setWorkflowInGroup(String workflowName) {
		try {
			TestObject toogleGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/div_Groups_Toggle')
			TestObject sltGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/span_Admin')
			TestObject openCaseWorkflowOverride = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/input_Open_Case_Workflow_Override')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/a_Version Upgrade - Entry Node')

			WebUI.click(toogleGroup)
			WebUI.click(sltGroup)
			WebUI.setText(openCaseWorkflowOverride, workflowName)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Set Workflow In Group Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def saveButton() {
		try {
			TestObject btnSave =  findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/button_Save')

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Save Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkWorkflowVersion() {
		try {
			TestObject toogleGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/div_Groups_Toggle')
			TestObject sltGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/span_Admin')

			WebUI.click(toogleGroup)
			WebUI.click(sltGroup)
		} catch(StepFailedException e) {
			log.logFailed("Check Workflow Version Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setToogleToGroup() {
		try {
			TestObject toogleGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/div_Groups_Toggle')

			WebUI.click(toogleGroup)
		} catch(StepFailedException e) {
			log.logFailed("Set Toogle To Group Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def setToogleToUser() {
		try {
			TestObject toogleUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/div_Users')

			WebUI.click(toogleUser)
		} catch(StepFailedException e) {
			log.logFailed("Set Toogle To User Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectGroupCard() {
		try {
			TestObject sltGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/span_Admin')

			WebUI.click(sltGroup)
		} catch(StepFailedException e) {
			log.logFailed("Select Group Card Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectPlusIconToAddQueues() {
		try {
			TestObject plusIcon = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/svg_Queue_Hierarchy_Plus_Sign')

			WebUI.click(plusIcon)
		} catch(StepFailedException e) {
			log.logFailed("Select Plus Icon To Add Queues Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQueuesToAdd() {
		try {
			TestObject sltQueue = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/input_Add_Queues_To_Group')

			WebUI.click(sltQueue)
		} catch(StepFailedException e) {
			log.logFailed("Select Queues To Add Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAddButton() {
		try {
			TestObject clkAdd = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/button_Queues_Model_Add_Button')

			WebUI.click(clkAdd)
		} catch(StepFailedException e) {
			log.logFailed("Select Queues To Add Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteHierarchyQueues() {
		try {
			TestObject sltQueue = 	findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/div_Select_Queue')
			TestObject dltQueue = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/path_Delete_Queues')

			WebUI.mouseOver(sltQueue)
			WebUI.mouseOver(dltQueue)
			WebUI.click(dltQueue)
			WebUI.click(dltQueue)
		} catch(StepFailedException e) {
			log.logFailed("Delete Hierarchy Queues Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dragAndDropQueues() {
		try {
			TestObject dragQueue = 	findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/svg_Queue_Hierarchy_Drag')
			TestObject dropQueue = 	findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/svg_Queue_Hierarchy_Drop')

			WebUI.click(dragQueue)
			WebUI.click(dropQueue)
		} catch(StepFailedException e) {
			log.logFailed("Drag And Drop Queues Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCancelButton() {
		try {
			TestObject clkCancel = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Add_Delete_Queue_Hierarchy/button_Add_Queue_Cancel')

			WebUI.click(clkCancel)
		} catch(StepFailedException e) {
			log.logFailed("Select Cancel Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setEntryCaseWorkflowInGroup(String workflowName) {
		try {
			TestObject toogleGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/div_Groups_Toggle')
			TestObject sltGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/span_Admin')
			TestObject openCaseWorkflowOverride = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/input_Open_Case_Workflow_Override')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/a_Entry Case - Entry Node (version 1)')

			WebUI.click(toogleGroup)
			WebUI.click(sltGroup)
			WebUI.setText(openCaseWorkflowOverride, workflowName)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Set Entry Case Workflow In Group Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setCaseQuestionnaireWorkflowInGroup(String workflowName) {
		try {
			TestObject toogleGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/div_Groups_Toggle')
			TestObject sltGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/span_Admin')
			TestObject openCaseWorkflowOverride = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/input_Open_Case_Workflow_Override')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Auto_Upgrade_Version/a_Case Questionnaire - Entry Node')

			WebUI.click(toogleGroup)
			WebUI.click(sltGroup)
			WebUI.setText(openCaseWorkflowOverride, workflowName)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Set Case Questionnaire Workflow In Group Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseTypePermisiion() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Case_Type_Setting/div_Case_Type_Permissions')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Type Permission Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectPermisiionAllowWork() {
		try {
			TestObject sltNone = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Case_Type_Setting/Select_Case_Type_Permission_None')
			TestObject sltAllowAll = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Case_Type_Setting/Select_Case_Type_Permission_Allow_All')

			WebUI.click(sltNone)
			GlobalVariable.globalShortDelay
			WebUI.click(sltAllowAll)
		} catch(StepFailedException e) {
			log.logFailed("Select Permission Allow Work Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selecCaseEntryCheckbox() {
		try {
			TestObject sltChk = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Page_Case_Type_Setting/chk_Case_Entry')

			WebUI.click(sltChk)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Entry Checkbox Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}






