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

public class CreateCaseStatuses {
	KeywordLogger log = new KeywordLogger()


	@Keyword
	def createOpenCaseStatus(String caseStatusName) {
		try {
			TestObject clickNew = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_New')
			TestObject inputName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/input_Description')
			TestObject openStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/rdo_Open_Status')
			TestObject btnSave =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_Save')

			WebUI.click(clickNew)
			WebUI.setText(inputName,caseStatusName)
			WebUI.click(openStatus)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Open Case Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createPendingCaseStatus(String caseStatusName) {
		try {
			TestObject clickNew = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_New')
			TestObject inputName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/input_Description')
			TestObject pendingStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/rdo_Pending_Status')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_Save')

			WebUI.click(clickNew)
			WebUI.setText(inputName,caseStatusName)
			WebUI.click(pendingStatus)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Pending Case Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createClosedCaseStatus(String caseStatusName) {
		try {
			TestObject clickNew = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_New')
			TestObject inputName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/input_Description')
			TestObject closedStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/rdo_Closed_Status')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_Save')

			WebUI.click(clickNew)
			WebUI.setText(inputName,caseStatusName)
			WebUI.click(closedStatus)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Closed case Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editStatusDetails(String caseEditStatus1) {
		try {
			TestObject inputName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/input_Description')
			TestObject pendingStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/rdo_Pending_Status')
			//	TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_Save')

			WebUI.click(inputName)
			WebUI.clearText(inputName)
			WebUI.setText(inputName,caseEditStatus1)
			WebUI.click(pendingStatus)
		}   catch(StepFailedException e) {
			log.logFailed("Edit Status Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def saveCaseStatus() {
		try {
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/btn_Save')

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Save Case Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def historyRecords() {
		try {
			TestObject clkHistory =  findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/div_Status_History')
			TestObject historyDate = findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/div_History_Date')
			TestObject historyRecords = findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/div_History_Date_Records')

			WebUI.click(clkHistory)
			WebUI.click(historyDate)
			WebUI.verifyElementPresent(historyRecords,3)
			WebUI.click(clkHistory)
		}  catch(StepFailedException e) {
			log.logFailed("History Records Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDetailsAgain(String caseEditStatus2) {
		try {
			TestObject inputName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/input_Description')
			TestObject closedStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Statuses/Page_Status Maintenance/rdo_Closed_Status')

			WebUI.click(inputName)
			WebUI.clearText(inputName)
			WebUI.setText(inputName,caseEditStatus2)
			WebUI.click(closedStatus)
		}  catch(StepFailedException e) {
			log.logFailed("Edit Details Again Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickClearButton() {
		try {
			TestObject btnClear = findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/button_Status_Clear')

			WebUI.click(btnClear)
		}  catch(StepFailedException e) {
			log.logFailed("Click Clear Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickDeleteButton() {
		try {
			TestObject btnDelete =	findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/button_Status_Delete')

			WebUI.click(btnDelete)
		}   catch(StepFailedException e) {
			log.logFailed("Click Delete Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickCancelModelButton() {
		try {
			TestObject verify = findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/p_Status_you want Delete_item')
			TestObject btnCancel =  findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/btn_Status_Confir_Cancel')

			//	WebUI.verifyElementPresent(verify, 3)
			WebUI.click(btnCancel)
		} catch(StepFailedException e) {
			log.logFailed("Click Canncel Model Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickDeleteModelButton() {
		try {
			TestObject btnDelete = findTestObject('Web/Dispute/Maintain/Processes/Case Statuses/Page_Edit_Status/btn_Status_Confir_Delete')

			WebUI.click(btnDelete)
		}  catch(StepFailedException e) {
			log.logFailed("Click Delete Model Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}