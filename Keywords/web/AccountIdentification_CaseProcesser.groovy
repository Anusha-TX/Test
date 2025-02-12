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
import com.kms.katalon.core.webui.keyword.builtin.VerifyElementTextKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

import internal.GlobalVariable

public class AccountIdentification {

	KeywordLogger log = new KeywordLogger()





	@Keyword
	def navigateTolegalCaseprocesser() {
		try {

			TestObject navigateToLegal= findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_TRIPS/div_Legal')
			TestObject navigateToprocessor= findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_TRIPS/div_Process')
			TestObject navigateToCaseProcessor= findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_TRIPS/div_Case Processor')


			WebUI.click(navigateToLegal)
			WebUI.click(navigateToprocessor)
			WebUI.click(navigateToCaseProcessor)
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
	def addAccountIdentification(String bankId, String acct_num, String fee_Type,String namenadd, String country_input,String region_input,String input_Tax,String input_name1,String owner_Type,String acct_Input,String select_Jurisdiction) {

		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject new_caseId=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/New_CaseId')
			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
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
			TestObject select_country= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Country')
			TestObject select_city=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_City')
			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Name')
			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')

			WebUI.click(caseHomeSearch)
			WebUI.click(btnSearch)
			//WebUI.doubleClick(new_caseId)
			//WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			//WebUI.mouseOver(debtor)
			WebUI.waitForPageLoad(5)

			if(WebUI.verifyElementPresent(accountIdentification, 0)){
				WebUI.mouseOver(accountIdentification)
				WebUI.click(accountIdentification)
			}else {
				WebUI.mouseOver(accountIdentification)
				WebUI.click(accountIdentification)
			}
			WebUI.waitForPageLoad(5)
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)

			WebUI.click(search)
			WebUI.setText(enter_bankId,bankId)
			WebUI.setText(enetr_acctNum,acct_num)
			WebUI.click(nameandarea)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.selectOptionByValue(select_typeacct,'O', true)
			WebUI.setText(fee_type,fee_Type)
			WebUI.setText(nameandarea,namenadd)
			//WebUI.selectOptionByValue(select_country,country_input, true)
			//WebUI.setText(select_city,'NewYork')
			//WebUI.selectOptionByValue(selecy_region,region_input, true)
			//WebUI.click(path)
			//WebUI.setText(input_tax,input_Tax)
			//WebUI.setText(input_name,input_name1)
			//WebUI.selectOptionByValue(onwer_type,owner_Type, true)
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
	def create_newaccountIdentification(String bankId, String acct_num, String fee_Type,String namenadd, String country_input,String region_input,String input_Tax,String input_name1,String owner_Type,String acct_Input,String select_Jurisdiction) {
		try {

			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentification_Action/Case_CP')
			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
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
			TestObject select_country= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Country')
			TestObject select_city=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_City')
			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Name')
			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')

			//WebUI.click(caseHomeSearch)
			WebUI.doubleClick(btnSearch)
			//WebUI.doubleClick(select_case)
			//WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			WebUI.waitForPageLoad(5)

			if(WebUI.verifyElementPresent(accountIdentification, 0)){
				WebUI.mouseOver(accountIdentification)
				WebUI.click(accountIdentification)
			}else {
				WebUI.mouseOver(accountIdentification)
				WebUI.click(accountIdentification)
			}

			//WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)

			WebUI.click(search)
			WebUI.setText(enter_bankId,bankId)
			WebUI.setText(enetr_acctNum,acct_num)
			WebUI.click(nameandarea)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.selectOptionByValue(select_typeacct,'O', true)
			WebUI.setText(fee_type,fee_Type)
			WebUI.setText(nameandarea,namenadd)
			//WebUI.selectOptionByValue(select_country,country_input, true)
			//WebUI.setText(select_city,'NewYork')
			//WebUI.selectOptionByValue(selecy_region,region_input, true)
			//WebUI.click(path)
			//WebUI.setText(input_tax,input_Tax)
			//WebUI.setText(input_name,input_name1)
			//WebUI.selectOptionByValue(onwer_type,owner_Type, true)
			WebUI.click(save)
			//WebUI.setText(acct_input,	acct_Input)
			//WebUI.click(search_btn1)
			//WebUI.click(select_search)

			//WebUI.selectOptionByValue(jurisdiction,'IN', true)
			//WebUI.selectOptionByValue(select_jurisdiction,'36', true)
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

	def create_removeaccountIdentification(String bankId, String acct_num, String fee_Type,String namenadd, String country_input,String region_input,String input_Tax,String input_name1,String owner_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject search=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary')

			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Name')
			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')
			TestObject case_accounts1 =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_XXXXX5465_selectAll')
			TestObject select_caseacct= findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 0')
			TestObject case_Button =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Processor/path')
			TestObject click_case =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Processor/td_Removed XXXXXXXXX1AH2 relationship from the case')
			TestObject unselect_account=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/svg_Owner_bi bi-chevron-down')
			TestObject deselect=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/input_KY_2_selected')
			TestObject deselect2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/input_NY_1_selected')
			//TestObject save=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/button_Save')
			TestObject closeBtn=findTestObject('Object Repository/Page_Case Processor/Page_Case Processor/button_Close')



			//WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			//WebUI.mouseOver(debtor)

			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)



			//WebUI.selectOptionByValue(jurisdiction,'IN', true)
			//WebUI.selectOptionByValue(select_jurisdiction,'36', true)
			WebUI.click(case_accounts1)
			WebUI.click(save2)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(case_accounts)
		}catch(StepFailedException e) {

			log.logFailed("Remaove all accounts step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def create_accountIdentificationwithzerosandalphanumeric(String bankId, String acct_num,String input_Tax,String input_name1,String owner_Type,String acct_Input,String select_Jurisdiction) {
		try{
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
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
			TestObject select_country= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Country')
			TestObject select_city=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_City')
			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Name')
			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')

			WebUI.click(caseHomeSearch)
			WebUI.click(btnSearch)
			WebUI.doubleClick(select_case)
			//WebUI.doubleClick(caseId_cp)
			WebUI.rightClick(select_acct)
			//WebUI.mouseOver(debtor)

			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)

			WebUI.click(search)
			WebUI.setText(enter_bankId,bankId)
			WebUI.setText(enetr_acctNum,acct_num)
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
	def create_ManualAddAccount(String bankId, String acct_num, String fee_Type,String namenadd, String country_input,String region_input,String input_Tax,String input_name1,String owner_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
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
			TestObject select_country= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Country')
			TestObject select_city=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_City')
			TestObject selecy_region= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Select_Region')
			//TestObject path= findTestObject('Object Repository/record repos/Page_Account Identification Action 20240716000001/path')
			TestObject input_tax=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_TaxID')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Name')
			TestObject onwer_type= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a typeOwnerSigner')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')


			WebUI.click(caseHomeSearch)
			WebUI.click(btnSearch)
			WebUI.doubleClick(select_case)
			WebUI.rightClick(select_acct)
			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)
			//WebUI.switchToWindowTitle('Account Identification Action: 20240716000001')
			WebUI.click(search)

			WebUI.setText(enter_bankId,bankId)
			WebUI.verifyElementPresent(enter_bankId, 5)
			WebUI.setText(enetr_acctNum,acct_num)
			WebUI.verifyElementPresent(enetr_acctNum, 5)
			WebUI.click(nameandarea)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.selectOptionByValue(select_typeacct,'O', true)

			WebUI.setText(fee_type,fee_Type)
			WebUI.verifyElementPresent(fee_type, 10)

			WebUI.setText(nameandarea,namenadd)
			WebUI.verifyElementPresent(nameandarea, 10)

			WebUI.setText(input_tax,input_Tax)
			WebUI.verifyElementPresent(input_tax, 10)

			WebUI.setText(input_name,input_name1)

			WebUI.click(save)

			WebUI.selectOptionByValue(select_jurisdiction,'36', true)
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


	//with debtor

	@Keyword

	def create_Accountwithdebtor() {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			//TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/cases_type')
			//TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			//TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject select_case1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Case_select')
			TestObject select_timeline=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_CaseProcessor/TimelineActions')
			TestObject select_debtor= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/span_Debtor')
			TestObject select_addnewdebtor=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/span_Add New Debtor')


			TestObject enter_name= findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_Name')
			TestObject enetr_bussinessname = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_businessName')
			TestObject enter_acct = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_Account')
			TestObject enter_area=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_textarea')
			TestObject select_country=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/select_Country')
			TestObject enter_city=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_City')
			TestObject select_region=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/select_Region')
			TestObject enter_Zip=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_Zip')
			TestObject enter_taxid=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/input_taxID')
			TestObject save_debtor=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/button_Save')
			TestObject select_acount=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject selcct_debtor=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_CaseProcessor/Select_Debtor')
			TestObject acct_input=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/select_Select a Debtors')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_name')
			TestObject input_bussinessName=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_BusinessName')
			TestObject input_address=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_address')
			TestObject input_city=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_city')
			TestObject input_region=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/select_Region_act')
			TestObject input_zip=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_ZipCode')
			TestObject input_taxid=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_taxID')
			TestObject input_save=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/button_Save')
			TestObject select_caseaccounts=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccounts')
			TestObject selct_casememo=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/button_CaseMemos')
			TestObject view_debtor=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/td_User Performed Debtor')
			TestObject save1=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/button_Save')
			TestObject debtor_select=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/select_Select a DebtorJulie')

			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')

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

			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_Select a jurisdictionINMDMONYTXAKAZD_8c3acc')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Case Accounts 1')
			TestObject debtor=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject jurisdiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction2')
			TestObject save2=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/save_btn2')
			TestObject auditNote = findTestObject('Web/Dispute/Process/Case Processor/Page_Case Processor/audit_note')
			TestObject closeButton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Requestor/btn_close')
			TestObject verifyDebtorAddedAudit = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/verify_debtor_added_audit')
			WebUI.click(caseHomeSearch)
			WebUI.click(btnSearch)
			WebUI.doubleClick(select_case1)
			WebUI.rightClick(select_timeline)
			WebUI.click(select_debtor)
			WebUI.switchToWindowIndex(1)
			WebUI.click(select_addnewdebtor)
			WebUI.setText(enter_name, 'Julie')
			WebUI.setText(enetr_bussinessname,'Deo')
			WebUI.setText(enter_acct, '1')
			WebUI.setText(enter_area, 'Newyork')
			WebUI.selectOptionByValue(select_country,'Canada', true)
			WebUI.setText(enter_city, 'NY')
			WebUI.selectOptionByValue(select_region,'NT', true)
			WebUI.setText(enter_Zip, '5123')
			WebUI.setText(enter_taxid, '123456')

			WebUI.click(save_debtor)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.delay(2)
			WebUI.rightClick(select_timeline)
			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)
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
	def create_AccountNodebtor() {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			//TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action1/cases_type')
			//TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			//TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject select_case1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Case_select')
			TestObject select_timeline=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_CaseProcessor/TimelineActions')
			TestObject select_debtor= findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/span_Debtor')
			TestObject select_addnewdebtor=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/span_Add New Debtor')


			TestObject delete_debtor=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/svg_s_bi bi-trash')
			TestObject save_debtor=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Debtor/button_Save')
			TestObject select_acount=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject accountIdentification= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')
			TestObject selcct_debtor=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_CaseProcessor/Select_Debtor')
			TestObject acct_input=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/select_Select a Debtors')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject input_name=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_name')
			TestObject input_bussinessName=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_BusinessName')
			TestObject input_address=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_address')
			TestObject input_city=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_city')
			TestObject input_region=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/select_Region_act')
			TestObject input_zip=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_ZipCode')
			TestObject input_taxid=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/input_taxID')
			TestObject input_save=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_AccountIdentificationAction_Debtor/button_Save')
			TestObject select_caseaccounts=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccounts')
			TestObject selct_casememo=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/button_CaseMemos')
			TestObject view_debtor=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/td_User Performed Debtor')
			TestObject save1=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/button_Save')

			WebUI.click(caseHomeSearch)
			WebUI.click(btnSearch)
			WebUI.doubleClick(select_case1)
			WebUI.rightClick(select_timeline)

			WebUI.click(accountIdentification)
			WebUI.switchToWindowIndex(1)
			//WebUI.click(acct_input)
			//WebUI.selectOptionByValue(acct_input,'1', true)
			//WebUI.click(acct_input)
			//WebUI.verifyElementPresent(acct_input, 10)
			WebUI.verifyElementPresent(input_name, 10)
			WebUI.verifyElementPresent(input_bussinessName, 10)
			WebUI.verifyElementPresent(input_address, 10)
			WebUI.verifyElementPresent(input_region, 10)
			WebUI.verifyElementPresent(input_taxid, 10)
			WebUI.click(save1)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.delay(2)
			WebUI.click(select_caseaccounts)
		}catch(StepFailedException e) {

			log.logFailed("No Debtor search step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}



	@Keyword
	def addAccount_identification_FundsAcquistion(String bankId, String acct_num, String fee_Type,String acct_Input,String select_Jurisdiction) {
		try {
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			TestObject search_btn= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Bank_bankID')
			TestObject enetr_acctNum = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_DDA')
			TestObject fee_type= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Account_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/search_Jurisdiction')
			TestObject select_search= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/path')
			TestObject set_jursidiction=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/button_Save')

			WebUI.rightClick(select_acct)
			WebUI.click(selectAcct_identification)
			//WebUI.switchToWindowIndex(1)
			WebUI.switchToWindowTitle('2')
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
			log.logFailed("Open Florida Jurisdictions step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw  e
		}
	}
}


