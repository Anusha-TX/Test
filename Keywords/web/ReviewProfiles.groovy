package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
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

public class ReviewProfiles {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def addNewReviewProfiles(String accountvalidation, String namevalue, String setlevel) {

		try {
			TestObject newButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/span_New')
			TestObject selectAction =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/div_select_action')
			TestObject accountValidation =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/div_account_validation')
			TestObject name =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/input_Name_name')
			TestObject level =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/input_Level_levelID')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/button_Save')
			TestObject deleteButton =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/btn_delete')
			TestObject deleteButtonSecond =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/btn_delete_second')
			TestObject verifyReviewProfile =findTestObject('Object Repository/Web/Dispute/Maintain/Users/Review Profiles/Page_Review Profiles Maintenance/verify_newprofile')

			WebUI.click(newButton)
			WebUI.click(selectAction)
			WebUI.click(accountValidation)
			WebUI.setText(name, namevalue)
			WebUI.setText(level,setlevel)
			WebUI.click(saveButton)

			// Test verifications
			assert WebUI.verifyElementPresent(verifyReviewProfile, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
			WebUI.click(deleteButtonSecond)
		}catch(StepFailedException e) {

			log.logFailed("Add Review Profile step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
