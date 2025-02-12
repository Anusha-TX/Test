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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import config.ConfigurationManager
import org.apache.commons.lang.RandomStringUtils
public class TypeMaintenance {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoTagMaintainance() {
		try {
			TestObject dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(dispute)
			TestObject maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(maintain)
			TestObject processes = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_TRIPS/div_Processes')
			WebUI.click(processes)
			TestObject caseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_TRIPS/div_Case Types')
			WebUI.click(caseType)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to CaseType step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createCaseType(String caseType,String frontoffice,String backoffice,String credit,String debit) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(4)
			TestObject dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Dispute')
			TestObject newButtton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_New')
			TestObject addNewType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/span_Add New Type')
			TestObject nameFld = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Name')
			TestObject clickTypeOptions =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/span_Type Options')
			TestObject frontOffice =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Front Office_webInstructions (1)')

			TestObject backOffice =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Back Office_backOfficeInstructions (1)')
			TestObject creditNo = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Credit')
			TestObject debitNo =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Require Account_reuseCaseType')
			TestObject checkcaseType =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Is Case Type_requireAccount')
			TestObject saveTag = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Save')
			TestObject delete1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete1')
			TestObject delete2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete2')
			TestObject CardPin = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Card Pin')
			WebUI.click(dispute)
			WebUI.click(newButtton)
			WebUI.click(addNewType)
			WebUI.setText(nameFld,'Add pin')
			WebUI.click(clickTypeOptions)
			WebUI.waitForElementVisible(frontOffice,10)
			WebUI.click(frontOffice)
			WebUI.setText(frontOffice,frontoffice)
			WebUI.setText(backOffice,backoffice)
			WebUI.setText(creditNo,credit)
			WebUI.check(checkcaseType)
			WebUI.click(saveTag)
			WebUI.click(CardPin)
		}catch(StepFailedException  e) {
			log.logFailed("Create TypeMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def createChildCaseType(String childcaseType,String frontoffice,String backoffice,String credit,String debit) {
		try {

			TestObject CardPin = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Card Pin')
			TestObject newButtton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_New')
			TestObject name = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Name')
			TestObject frontOffice =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Front Office_webInstructions')
			TestObject backOffice =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Back Office_backOfficeInstructions')
			TestObject creditNo = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Credit Write Off_creditWriteOffLimit')
			TestObject debitNo =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Require Account_reuseCaseType')
			TestObject checkcaseType =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Require Account_reuseCaseType')
			TestObject saveTag = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Save')
			TestObject dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/button_Dispute')
			TestObject addNewType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/span_Add New Type')
			TestObject nameFld = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/input_Name')
			TestObject clickTypeOptions =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/span_Type Options')
			TestObject delete1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete1')
			TestObject delete2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete2')
			WebUI.click(dispute)
			WebUI.click(newButtton)
			WebUI.click(addNewType)
			WebUI.setText(nameFld,'Add pin')
			WebUI.click(saveTag)
			WebUI.click(CardPin)
			WebUI.click(newButtton)
			WebUI.setText(name,childcaseType)
			WebUI.waitForElementVisible(frontOffice,10)
			WebUI.setText(frontOffice,frontoffice)
			WebUI.setText(backOffice,backoffice)
			WebUI.setText(creditNo,credit)
			WebUI.check(checkcaseType)
			WebUI.click(saveTag)
			WebUI.click(CardPin)
			WebUI.click(delete1)
			WebUI.click(delete2)
		}catch(StepFailedException  e) {
			log.logFailed("Create ChildTypeMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deletetype() {
		try {
			TestObject delete1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete1')
			TestObject delete2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance/btn_delete2')
			WebUI.click(delete1)
			WebUI.click(delete2)
		}catch(StepFailedException  e) {
			log.logFailed("Delete TypeMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
