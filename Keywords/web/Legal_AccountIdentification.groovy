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

public class LegalAccount_Identification {
	KeywordLogger log =new KeywordLogger()


	@Keyword
	def addAccountIdentificationFundsAcquistion1(String bankId, String acct_num, String fee_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject select_acct=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_acct')
			TestObject selectAcct_identification= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_Account Identification Action')
			TestObject search_btn= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account')
			TestObject select_acc = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/div_Select')
			TestObject selectaccount_type=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_DDA')
			TestObject fee_type= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			TestObject acct_input= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account_1')
			TestObject search_btn1= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/search_Jurisdiction')
			TestObject select_search= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/path')
			TestObject set_jursidiction=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			//TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject actionDue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Actions Due')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')

			TestObject Select_jurisdiction2=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdiction2')
			TestObject Select_jurisdiction1=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Select_jurisdiction1')

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
			//WebUI.selectOptionByValue(Select_jurisdiction1,'36', true)
			//WebUI.selectOptionByValue(Select_jurisdiction2,'36', true)
			WebUI.click(btn_Save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			//case processor is not loading so again double clicking on the caseid
			//WebUI.doubleClick(caseId_cp)
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
	@Keyword
	def createDebtor(String debtorname,String bankId, String acct_num, String fee_Type,String acct_Input,String select_Jurisdiction) {

		try {

			TestObject select_acct=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_acct')

			TestObject addNewRequestorOnDebtor = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/AddNew_Debtor')
			TestObject setDebtorName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_Name')

			TestObject saveButton = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/button_Save')

			TestObject debtor = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject accountIdentification = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')

			//TestObject select_acct=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_acct')
			TestObject selectAcct_identification= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_Account Identification Action')
			TestObject search_btn= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account')
			TestObject select_acc = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/div_Select')
			TestObject selectaccount_type=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_DDA')
			TestObject fee_type= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			TestObject acct_input= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account_1')
			TestObject search_btn1= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/search_Jurisdiction')
			TestObject select_search= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/path')
			TestObject set_jursidiction=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			//TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject actionDue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Actions Due')
			//TestObject debtor = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			//TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			//TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')


			// flow for validating the debtor name
			WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(accountIdentification)
			WebUI.click(debtor)
			WebUI.switchToWindowIndex(1)
			WebUI.click(addNewRequestorOnDebtor)
			WebUI.setText(setDebtorName, 'Kenny')
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')

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
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException e) {

			log.logFailed("New user creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword

	def create_Accountwithdebtor() {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			//TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/cases_type')
			//TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			//TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')

			TestObject select_acct=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_acct')

			TestObject search=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_bankID')
			TestObject enetr_acctNum = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/span_DDA')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/doubleclick_caseID')
			TestObject  actionsdue=findTestObject('Object Repository/FundAcquisition/Page_Case Processor/Page_Case Processor/span_Actions Due')
			TestObject select_typeacct= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Selectstatus')
			TestObject fee_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_currentBalance')
			TestObject nameandarea= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/textarea_Name_address')

			TestObject select_city=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_City')
			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')

			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			//TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')
			TestObject auditNote = findTestObject('Web/Dispute/Process/Case Processor/Page_Case Processor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyDebtorAddedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_debtor_added_audit')

			WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)

			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(2)
			WebUI.click(search)
			WebUI.setText(enter_bankId,'1')
			WebUI.setText(enetr_acctNum,'1')
			WebUI.click(nameandarea)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.selectOptionByValue(select_typeacct,'O', true)


			WebUI.click(save)
			//WebUI.setText(acct_input,	acct_Input)
			//WebUI.click(search_btn1)
			//WebUI.click(select_search)

			//WebUI.selectOptionByValue(jurisdiction,'IN', true)
			WebUI.selectOptionByValue(select_jurisdiction,'36', true)
			WebUI.click(save2)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(case_accounts)
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
	def addAccountIdentification_UseBranch(String bankId, String acct_num, String fee_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject select_acct=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_acct')
			TestObject selectAcct_identification= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_Account Identification Action')
			TestObject search_btn= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account')
			TestObject select_acc = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/div_Select')
			TestObject selectaccount_type=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/span_DDA')
			TestObject fee_type= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			TestObject acct_input= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/input_Account_account_1')
			TestObject search_btn1= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/search_Jurisdiction')
			TestObject select_search= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Web/Legal/Process/Case Processor/Account_Identification/path')
			TestObject set_jursidiction=findTestObject('Web/Legal/Process/Case Processor/Account_Identification/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Web/Legal/Process/Case Processor/Account_Identification/button_Save')
			//TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject actionDue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Actions Due')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')

			TestObject Select_jurisdiction2=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdiction2')
			TestObject Select_jurisdiction1=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Select_jurisdiction1')

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
			WebUI.selectOptionByValue(Select_jurisdiction1,'36', true)
			WebUI.selectOptionByValue(Select_jurisdiction2,'36', true)
			WebUI.click(btn_Save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			//case processor is not loading so again double clicking on the caseid
			//WebUI.doubleClick(caseId_cp)
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
