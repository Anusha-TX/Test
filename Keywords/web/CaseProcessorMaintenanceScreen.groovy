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

public class CaseProcessorMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()
	@Keyword
	def addCustomSearch(String comboboxvalue, String casedescription) {

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
			WebUI.setText(combobox, comboboxvalue)
			WebUI.setText(description,casedescription)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Add Custom search step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteCustomSearch() {

		try {
			TestObject trashButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/btn_trash')
			TestObject customeField = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/custom_field')

			WebUI.scrollToElement(customeField, 10)
			WebUI.click(trashButton)
		}catch(StepFailedException e) {

			log.logFailed("Delete Custom search step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataFetch() {

		try {
			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/home_search_button')
			TestObject Search=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject case_search1=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case')

			TestObject timeline=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Timeline_Accordion')
			TestObject data_fetch= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Data Fetch')
			TestObject case_source=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/select_Select an API.Option1-Update Case So_048c51')
			TestObject save_btn= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Save')
			TestObject view_audits=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject performed_actions=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/td_User Performed Data Fetch')
			TestObject close_btn=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Close')

			WebUI.click(homeSearchButton)
			WebUI.click(Search)
			WebUI.doubleClick(case_search1)
			WebUI.rightClick(timeline)
			WebUI.click(data_fetch)
			WebUI.switchToWindowTitle('Data Fetch: 20241108000015')
			WebUI.click(case_source)
			WebUI.selectOptionByValue(case_source,'Option1-Update Case Source', true)
			WebUI.click(save_btn)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(view_audits)
			WebUI.verifyElementPresent(performed_actions ,10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(close_btn)
		}catch(StepFailedException e) {

			log.logFailed("DataFetch action performed failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def Open_multiCase() {

		try {
			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/button_Home_search')
			TestObject Search=findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/button_Saved Searches_btn btn-primary')
			TestObject case_search1=findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/input_Name_searchName')

			TestObject search_critira=findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/input_Name_applyToGroup')
			TestObject save= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Sources/create_source/button_Save')
			TestObject SearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/home_search_button')
			TestObject Search1=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')

			TestObject case_1=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_20241113000003')
			TestObject Open_Case1= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Open Case')
			TestObject Home=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Home')
			TestObject Case_2=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_20241113000003')
			TestObject close_btn=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/path')
			TestObject Case_3=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_20241113000004')

			WebUI.click(homeSearchButton)
			WebUI.click(Search)
			WebUI.doubleClick(case_search1)
			WebUI.setText(case_search1,'22')
			WebUI.click(search_critira)
			WebUI.click(save)
			WebUI.click(SearchButton)
			WebUI.click(Search1)

			WebUI.rightClick(case_1)
			WebUI.verifyElementPresent(Open_Case1 ,10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(Open_Case1)
			WebUI.click(close_btn)

			WebUI.rightClick(Case_2)
			WebUI.verifyElementPresent(Open_Case1 ,10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(Open_Case1)
			WebUI.click(close_btn)

			WebUI.rightClick(Case_3)
			WebUI.verifyElementPresent(Open_Case1 ,10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(Open_Case1)
			WebUI.click(close_btn)
		}catch(StepFailedException e) {

			log.logFailed("Open Multiple cases action performed failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def Schedule_Action() {

		try {
			TestObject homeSearchButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/home_search_button')
			TestObject Search=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject case_search1=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case')

			TestObject timeline=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Timeline_Accordion')

			TestObject search_critira=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Account Identification Action_bi bi-clock')
			TestObject save= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_OK (1)')

			TestObject date_input=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/date_input')

			WebUI.click(homeSearchButton)
			WebUI.click(Search)
			WebUI.doubleClick(case_search1)
			WebUI.rightClick(timeline)
			WebUI.click(Search)
			WebUI.doubleClick(case_search1)

			WebUI.click(search_critira)
			WebUI.setText(date_input,'11/23/2024')

			WebUI.click(save)
		}catch(StepFailedException e) {

			log.logFailed("Open Multiple cases action performed failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def workQueueInCaseProcessor() {

		try {
			TestObject queueIcon = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/Queue_icon')
			TestObject selectQueue= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/select_queue')


			WebUI.click(queueIcon)
			WebUI.doubleClick(selectQueue)
		}catch(StepFailedException e) {

			log.logFailed("Navigation Pane in Case Processor step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}