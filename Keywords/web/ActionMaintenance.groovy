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

public class ActionMaintenance {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createDebtor(String debtorname) {

		try {
			TestObject selectDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/click_Debtor')
			TestObject addNewButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_addnew')
			TestObject actionName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/input_actionname')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject verifyDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/DebtorExample')

			WebUI.click(selectDebtor)
			WebUI.click(addNewButton)
			WebUI.click(actionName)
			WebUI.setText(actionName, debtorname)
			WebUI.click(saveButton)
			WebUI.click(verifyDebtor)
		}catch(StepFailedException e) {

			log.logFailed("New user creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDebtor(String debtornameupdated) {

		try {
			TestObject selectDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/click_Debtor')
			TestObject addNewButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_addnew')
			TestObject actionName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/input_actionname')
			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_save')
			TestObject verifyDebtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/DebtorExample')

			WebUI.click(actionName)
			WebUI.setText(actionName, debtornameupdated)
			WebUI.click(saveButton)
			WebUI.click(verifyDebtor)
		}catch(StepFailedException e) {

			log.logFailed("Edit debtor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteDebtor() {

		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/btn_delete')

			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("Delete debtor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
