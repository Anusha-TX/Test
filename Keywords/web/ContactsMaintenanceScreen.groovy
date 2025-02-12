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
import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

public class ContactsMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createContact(String shortname, String nameaddress, String country, String city, String region, String zipcode, String phone) {

		try {
			TestObject newField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/add_new_button')
			TestObject shortnameField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/input_shortname')
			TestObject nameAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/name_address')
			TestObject selectCountry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/select_country')
			TestObject cityField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/city')
			TestObject selectRegion = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/select_region')
			TestObject zipcodeField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/zipcode')
			TestObject phoneField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/phone')
			TestObject saveBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/btn_save')
			TestObject verifyJulian =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/span_Julian')

			WebUI.click(newField)
			WebUI.setText(shortnameField, shortname)
			WebUI.setText(nameAddressField, nameaddress)
			WebUI.click(selectCountry)
			WebUI.selectOptionByLabel(selectCountry, country, false)
			WebUI.setText(cityField, city)
			WebUI.setText(zipcodeField, zipcode)
			//WebUI.setText(phoneField, phone)
			WebUI.click(saveBtn)
			WebUI.verifyElementPresent(verifyJulian, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
		}catch(StepFailedException e) {

			log.logFailed("Contact creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editContact(String shortnameupdated) {

		try {
			TestObject newField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/add_new_button')
			TestObject shortnameField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/input_shortname')
			TestObject nameAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/name_address')
			TestObject selectCountry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/select_country')
			TestObject cityField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/city')
			TestObject selectRegion = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/select_region')
			TestObject zipcodeField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/zipcode')
			TestObject phoneField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/phone')
			TestObject saveBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/btn_save')
			TestObject deleteBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/btn_delete')
			TestObject verifyHilter =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/span_Hitler')

			WebUI.setText(shortnameField, shortnameupdated)
			WebUI.click(saveBtn)
			WebUI.verifyElementPresent(verifyHilter, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE)
		}catch(StepFailedException e) {

			log.logFailed("Edit Contact step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteContact() {

		try {
			TestObject verifyJulian =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/span_Julian')
			TestObject deleteBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Contacts/ContactsMaintenance/btn_delete')

			WebUI.click(deleteBtn)
		}catch(StepFailedException e) {

			log.logFailed("Contact deletion step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
