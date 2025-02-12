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
import internal.GlobalVariable

public class LegalAccountIdentification {
	KeywordLogger log =new KeywordLogger()


	@Keyword
	def addAccountIdentificationFundsAcquistion(String bankId, String acct_num, String fee_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/span_Account Identification Action')
			TestObject search_btn= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/span_DDA')
			TestObject fee_type= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/input_Account_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/search_Jurisdiction')
			TestObject select_search= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/path')
			TestObject set_jursidiction=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/button_Save')
			//TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject actionDue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Actions Due')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(debtor)

			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(2)
			//WebUI.switchToWindowTitle('Account Identification Action: 20240929000004')
			WebUI.click(search_btn)
			WebUI.setText(enter_bankId,bankId)
			WebUI.setText(enetr_acctNum,acct_num)
			WebUI.click(fee_type)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.setText(fee_type,fee_Type)
			WebUI.click(save)
			WebUI.click(btn_Save)
		}catch(StepFailedException  e) {
			log.logFailed("Add Account Identification Step Failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw  e
		}
	}
}
