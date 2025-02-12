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

public class InboundDocumentsScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createInboundDocuments(String firsttechnology, String firstaddress, String casetype, String secondtechnology, String secondaddress) {

		try {
			TestObject addNewButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_addnew')
			TestObject addAddress = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/input_path_address')
			TestObject addCaseType = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_case_type')
			TestObject addTechnology = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_technology')
			TestObject addCaseTypeUpdated = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_casetype_updated')
			TestObject saveButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_save')
			TestObject previuoslyCreatedOption = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_previously_created')
			TestObject verifyFileLocation = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/verify_FileLocation')

			WebUI.click(addNewButton)
			WebUI.click(addTechnology)
			WebUI.selectOptionByLabel(addTechnology, firsttechnology, false)
			WebUI.setText(addAddress, firstaddress)
			WebUI.click(addCaseType)
			WebUI.click(addCaseTypeUpdated)
			//WebUI.selectOptionByValue(addCaseType, casetype, true)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("New Inbound Document creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateInboundDocuments(String secondtechnology) {

		try {
			TestObject addTechnology = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_technology')
			TestObject addTechnologyUpdatedNew = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_casetype_updated_new')
			TestObject saveButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_save')
			TestObject previuoslyCreatedOption = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_previously_created')
			TestObject verifyWebDav = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/verify_WebDav')

			WebUI.click(addTechnology)
			WebUI.selectOptionByLabel(addTechnology, secondtechnology, false)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {

			log.logFailed("Update exisiting Inbound Documentstep failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteInboundDocuments() {

		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_delete')
			TestObject verifyFileLocation = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/verify_FileLocation')

			WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("Inbound Document deletion step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createInboundDocumentsOAuth2(String firsttechnology, String firstaddress, String casetype, String secondtechnology, String secondaddress, String tenantid, String clientid, String clientsecret) {

		try {
			TestObject addNewButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_addnew')
			TestObject addAddress = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/input_path_address')
			TestObject addCaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/select_case_type_oauth')
			TestObject addCaseTypeUpdated = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_casetype_updated')
			TestObject addTechnology = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/select_technology_web')
			TestObject saveButton = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/btn_save')
			TestObject previuoslyCreatedOption = findTestObject('Object Repository/Web/Adjustment/Maintain/Inbound Documents/select_previously_created')
			TestObject toggleOAuth2 = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/input_Basic Auth_useOAuth')
			TestObject setTenantid = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/input_tenantid')
			TestObject setClientid = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/input_clientid')
			TestObject setClientSecret = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/input_clientsecret')
			TestObject verifyExchangeWeb = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/verify_ExchangeWeb')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/InboundDocuments/Page_Inbound Document Maintenance/btn_delete')

			WebUI.click(addNewButton)
			WebUI.click(addTechnology)
			WebUI.selectOptionByValue(addTechnology, firsttechnology, true)
			WebUI.setText(addAddress, firstaddress)
			WebUI.click(addCaseType)
			WebUI.click(addCaseTypeUpdated)
			//WebUI.selectOptionByValue(addCaseType, casetype, true)
			WebUI.click(toggleOAuth2)
			WebUI.setText(setTenantid, tenantid)
			WebUI.setText(setClientid, clientid)
			WebUI.setText(setClientSecret, clientsecret)
			WebUI.click(saveButton)
			WebUI.verifyElementPresent(verifyExchangeWeb, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {

			log.logFailed("New Inbound Document creation for OAuth2 step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}