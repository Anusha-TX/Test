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

public class RequirementMaintenanceAcct {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoRequirementMaintenance() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject requirementMaintence = findTestObject('Object Repository/Web/Dispute/Maintain/Page_TRIPS/div_Requirement Maintenance')
			WebUI.click(requirementMaintence)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def multipleAccount() {
		try {
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_DDA')
			TestObject selectDDA =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_1 XXXX0001 DDA')
			TestObject account1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Account_account')
			TestObject bank1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Bank_bankID')
			TestObject nameandaddress =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_nameaddress')
			TestObject gl =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_selectbank')

			TestObject select =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_select')
			TestObject generalInstructions =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/span_General Instructions')
			TestObject highamt1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_High Amount_highAmount')
			TestObject lowamt1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Low Amount_lowAmount')
			TestObject message =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Message_message')
			TestObject btn_Save= findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_Save')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			WebUI.click(selectDDA)
			WebUI.setText(bank1,'1')
			WebUI.setText(account1,'1')
			WebUI.click(nameandaddress)
			WebUI.click(btn_Save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to requirementMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def singleAccount() {
		try {
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_DDA')
			TestObject selectDDA =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_1 XXXX0001 DDA')
			TestObject account1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Account_account')
			TestObject bank1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Bank_bankID')
			TestObject nameandaddress =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_nameaddress')
			TestObject gl =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_selectbank')

			TestObject select =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_select')
			TestObject generalInstructions =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/span_General Instructions')
			TestObject highamt1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_High Amount_highAmount')
			TestObject lowamt1 =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Low Amount_lowAmount')
			TestObject message =findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/input_Message_message')
			TestObject btn_Save= findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/div_Save')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			WebUI.click(selectDDA)
			WebUI.setText(bank1,'1')
			WebUI.setText(account1,'1')
			WebUI.click(nameandaddress)
			WebUI.click(btn_Save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to requirementMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generalInstructions() {
		try {
			String Kenny="Kenny";
			TestObject caseprocessor= findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/Page_Case Processor/div_Case Processor')
			TestObject Message=findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/Page_Case Processor/div_Jhon D Austria Kenny')
			TestObject generalinstr=findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/Page_Case Processor/span_General Instructions 1')
			TestObject recentcases=findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/Page_Case Processor/div_Recentcase')
			TestObject caseid=findTestObject('Object Repository/Web/Dispute/Maintain/Page_Requirements Maintenance/Page_Case Processor/div_caseid')

			WebUI.verifyElementPresent(caseprocessor, 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(generalinstr)
			WebUI.verifyElementText(Message, Kenny)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to requirementMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
