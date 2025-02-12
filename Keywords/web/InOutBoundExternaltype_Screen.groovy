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
import org.apache.commons.lang.RandomStringUtils
//impport com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import config.ConfigurationManager
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable

public class InOutBoundExternaltype_Screen {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoExternaltype() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject Misc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Misc')
			WebUI.click(Misc)
			TestObject ExternalType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_External Types')
			WebUI.click(ExternalType)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to ExternalType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createNewInBoundType(String systename, String externaltype, String name, String systemdescription,String selectcase) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(6)
			TestObject createNewInBoundType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/a_New')
			TestObject systemName = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/input_System')
			TestObject expandTab = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/extend_ExternalType')
			TestObject externalTypeName = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/input_External Type')
			TestObject namefd = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/input_Name')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/input_Description')
			TestObject selectCaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/select_Case')
			TestObject Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/btn_Save')
			WebUI.click(createNewInBoundType)
			WebUI.setText(systemName,randomName)
			WebUI.click(expandTab)
			WebUI.setText(externalTypeName,externaltype)
			WebUI.setText(namefd,name)
			WebUI.setText(description,systemdescription)
			WebUI.click(selectCaseType)
			WebUI.selectOptionByLabel(selectCaseType, selectcase, false)
			WebUI.click(Save)
		}catch(StepFailedException  e) {
			log.logFailed("ExternalInboundCreate step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteInOutBoundType() {
		try {
			TestObject delete = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/External Type Maintenance/btn_Delete')
			WebUI.click(delete)
			WebUI.click(delete)
		}catch(StepFailedException  e) {
			log.logFailed("ExternalInboundDelete step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def Encrypted_password() {
		try {
			TestObject email_pq=findTestObject('Object Repository/Web/Common/Maintain/Settings/Page_Application Settings Maintenance/span_Email PQ')
	
			TestObject set_password=findTestObject('Object Repository/Web/Common/Maintain/Settings/Page_Application Settings Maintenance/input_Made By_value_1')
	
			TestObject save_btn=findTestObject('Object Repository/Web/Common/Maintain/Settings/Page_Application Settings Maintenance/button_Save')
	
	
			WebUI.click(email_pq)
			WebUI.setEncryptedText(set_password,'iGDxf8hSRT4=')
			WebUI.click(save_btn)
		}catch(StepFailedException  e) {
			log.logFailed("Encrypted password step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
