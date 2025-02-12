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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration


public class NavigateToTranscodeMaintance_Screen {


	KeywordLogger log=new KeywordLogger()
	@Keyword


	def navigateToCreateNewTrancode (String transID,String transName,String transDescription,String transEntry) {
		try {
			TestObject navigateToTranscodeMaintance = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_Trancodes')
			TestObject navigateTocreateNewTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_New')
			TestObject trancode_id = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Trancode_id')
			TestObject name_Transcode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Namedescription')
			TestObject name_description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Description')
			TestObject trancode_preentry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Pre-CaseEntry')
			TestObject button_Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/button_Save')


			WebUI.click(navigateToTranscodeMaintance)
			WebUI.click(navigateTocreateNewTranscode)
			WebUI.setText(trancode_id,transID)
			WebUI.setText(name_Transcode,transName)
			WebUI.verifyElementPresent(name_Transcode, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(name_description, transDescription)
			WebUI.setText(trancode_preentry, transEntry)
			WebUI.click(trancode_preentry)
			WebUI.click(trancode_preentry)
			WebUI.click(button_Save)
		} catch(StepFailedException e) {
			log.logFailed("Create new trancode step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword

	def navigatetoexistingTranscode() {
		try {
			TestObject navigatetoexistingTranscode= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/selectTranscode')

			TestObject select_linktype=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/label_ATM')

			TestObject saveButton=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/button_Save (1)')

			WebUI.click(navigatetoexistingTranscode)
			WebUI.click(select_linktype)
			WebUI.click(saveButton)
		} catch(StepFailedException e) {
			log.logFailed("existing trancode step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword

	def type_View() {
		try {
			TestObject navigateToTranscodeMaintance = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_Trancodes')
			TestObject select_typeView= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/label_Type View')
			TestObject Select_existingcase= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/select_type')
			TestObject select_link= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/select_Misc3')
			TestObject Select_Link2= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/label_8 - Misc 3')

			TestObject save_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/button_Save')

			WebUI.click(navigateToTranscodeMaintance)
			WebUI.click(select_typeView)
			WebUI.verifyElementPresent(select_typeView, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(Select_existingcase)
			//WebUI.click(select_link)
			WebUI.click(Select_Link2)
			WebUI.click(save_btn)
			WebUI.click(Select_existingcase)
		} catch(StepFailedException e) {
			log.logFailed("Type View step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword

	def validate_tancodecardview() {

		try {
			TestObject navigateToTranscodeMaintance = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_Trancodes')
			TestObject totalitems=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/span_Total Items')

			WebUI.click(navigateToTranscodeMaintance)
			WebUI.verifyElementPresent(totalitems, 10, FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("validate trancode step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword

	def childtypeTrancode (String transID,String transName,String transDescription,String transEntry) {
		try {
			TestObject navigateToTranscodeMaintance = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_Trancodes')
			TestObject navigateTocreateNewTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/lnk_New')
			TestObject trancode_id = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Trancode_id')
			TestObject name_Transcode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Namedescription')
			TestObject name_description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Description')
			TestObject trancode_preentry = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/input_Pre-CaseEntry')
			TestObject button_Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/button_Save')
			TestObject select_trancode=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/label_ATM')
			TestObject select_trancode2=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Transcode_Maintance/Page_Trancode Maintenance/label_Bill Pay')

			WebUI.click(navigateToTranscodeMaintance)
			WebUI.click(navigateTocreateNewTranscode)
			WebUI.setText(trancode_id,transID)
			WebUI.setText(name_Transcode,transName)
			WebUI.setText(name_description, transDescription)
			WebUI.setText(trancode_preentry, transEntry)
			WebUI.click(trancode_preentry)
			WebUI.click(trancode_preentry)
			//WebUI.click(select_trancode)
			WebUI.click(select_trancode2)
			WebUI.click(button_Save)

			WebUI.delay(2)
		} catch(StepFailedException e) {
			log.logFailed("childtypeTrancode step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}