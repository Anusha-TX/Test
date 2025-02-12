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
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import org.apache.commons.lang.RandomStringUtils
public class CurrencyMaintainance {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoCurrency() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject Misc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Misc')
			WebUI.click(Misc)
			TestObject Currency = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Page_TRIPS/div_Currencies')
			WebUI.click(Currency)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to Currency step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def createtoCurrency(String idno,String currencycode,String nameText) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/add_new_button')
			TestObject id = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ID_id')
			TestObject currencyCode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/Currency Code')
			TestObject name = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/Name_name')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/button_Save')
			TestObject inputid = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/input_ID')
			TestObject inputname =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/input_Name')
			TestObject inputcurrency =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/input_Currency Code')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/btn_Delete')
			WebUI.click(createNew)
			WebUI.setText(id,idno)
			WebUI.setText(currencyCode,currencycode)
			WebUI.setText(name,nameText)
			WebUI.click(saveButton)
			GlobalVariable.globalMediumDelay
			GlobalVariable.globalMediumDelay
			GlobalVariable.globalMediumDelay
			assert WebUI.verifyElementPresent(inputid, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			assert WebUI.verifyElementPresent(inputcurrency,  GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
		}catch(StepFailedException  e) {
			log.logFailed("Create Currency step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def deleteCurrency() {
		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/btn_Delete')
			WebUI.click(deleteButton)
		}catch(StepFailedException  e) {
			log.logFailed("Create Currency step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateCurrency(String editidno,String editcurrencyCode,String editnameText) {
		try {

			TestObject id = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ID_id')
			TestObject currencyCode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/Currency Code')
			TestObject name = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/Name_name')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/button_Save')
			TestObject skipRepair = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/input_Name_skipMicrRepair')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/btn_Delete')
			TestObject historyButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/btn_history')
			TestObject inputname =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/input_Name')
			WebUI.click(id)
			WebUI.clearText(id)
			WebUI.setText(id,editidno)
			WebUI.click(currencyCode)
			WebUI.clearText(currencyCode)
			WebUI.setText(currencyCode,editcurrencyCode)
			WebUI.click(name)
			WebUI.clearText(name)
			WebUI.setText(name,editnameText)
			WebUI.check(skipRepair)
			WebUI.click(saveButton)
			WebUI.takeFullPageScreenshot()
			WebUI.click(historyButton)
			WebUI.click(deleteButton)
			assert WebUI.verifyElementNotPresent(inputname, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
		}catch(StepFailedException  e) {
			log.logFailed("Update Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


