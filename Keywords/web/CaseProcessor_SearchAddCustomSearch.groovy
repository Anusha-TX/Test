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


public class CaseProcessor_SearchAddCustomSearch {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def search_AddCustomsearchfield(String sourcedescription) {

		try {

			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/home_search_button')
			TestObject plusButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/plus_button')
			TestObject combobox = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/combobox')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/description_name')
			TestObject fieldValue = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/field_value')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/save_button')
			TestObject customeField = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/custom_field')

			WebUI.click(homeSearchButton)
			WebUI.click(plusButton)
			WebUI.click(combobox)
			WebUI.setText(combobox,'Dispute.CaseAccountRelationships.AccountToken')
			//WebUI.click(sourceaccount_Type)
			WebUI.setText(description,'4' )

			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Source creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}



	@Keyword
	def search_deletCustomSearchField(String sourcedescription) {

		try {

			TestObject trashButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/btn_trash')
			TestObject customeField = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/custom_field')
			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/home_search_button')
			WebUI.click(homeSearchButton)
			WebUI.scrollToElement(customeField, 10)
			WebUI.click(trashButton)
		}catch(StepFailedException e) {

			log.logFailed("Source creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


