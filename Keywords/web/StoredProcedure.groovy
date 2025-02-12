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
import config.ConfigurationManager
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable

public class StoredProcedure {

	KeywordLogger log =new KeywordLogger()
	@Keyword
	def addJob(String jobname,String runinterval,String triggerpath,String exearguments) {
		try {

			TestObject addNewButton = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/btn_new')
			TestObject inputName = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_run_days')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_run_Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_run_interval_run_interval')
			TestObject triggerPath = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_trigger_path')
			TestObject exeArguments = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/input_exe_arguments')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/btn_save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/btn_run_job_adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/run_job_adhoc_is_submitted')

			WebUI.click(addNewButton)
			WebUI.setText(inputName, jobname)
			WebUI.check(runDays)
			WebUI.check(runCheck)
			WebUI.setText(runInterval, runinterval)
			WebUI.setText(exeArguments, exearguments)
			WebUI.click(saveButton)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalLongDelay)
		}catch(StepFailedException  e) {
			log.logFailed("Add Single Stored Procedure Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def deleteJob() {
		try {

			TestObject deleteButton = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/btn_delete')
			
			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException  e) {
			log.logFailed("Delete Stored Procedure Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setRunSequentialFalse() {
		try {

			TestObject storedProcedureRunner = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/set_stored_procedure_runner')
			TestObject toggleRunSequential = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/label_run_seuqentially')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/btn_save')

			WebUI.scrollToElement(storedProcedureRunner, GlobalVariable.globalLongDelay)
			WebUI.click(storedProcedureRunner)
			WebUI.click(toggleRunSequential)
			WebUI.click(saveButton)
		}catch(StepFailedException  e) {
			log.logFailed("Setting Stored Procedure Runner step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setRunSequentialTrue() {
		try {

			TestObject storedProcedureRunner = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/set_stored_procedure_runner')
			TestObject toggleRunSequential = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/label_run_seuqentially')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/StoredProcedure/settings_RunSequential/btn_save')

			WebUI.scrollToElement(storedProcedureRunner, GlobalVariable.globalLongDelay)
			WebUI.click(storedProcedureRunner)
			WebUI.click(toggleRunSequential)
			WebUI.click(saveButton)
		}catch(StepFailedException  e) {
			log.logFailed("Setting Stored Procedure Runner step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}