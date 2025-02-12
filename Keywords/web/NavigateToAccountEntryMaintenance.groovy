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
import com.kms.katalon.entity.global.GlobalVariableEntity

import config.ConfigurationManager
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration



public class NavigateToAccountEntryMaintenance {

	KeywordLogger log=new KeywordLogger()
	@Keyword

	def CloneAccount() {
		try {

			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoexistingAccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/li_Holds Acquired')
			TestObject selectCloneTemplate=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Clone Template')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			WebUI.click(navigatetoAccountEntries)
			WebUI.rightClick(navigatetoexistingAccount)

			//WebUI.click(selectCloneTemplate)
			GlobalVariable.globalMediumDelay
		} catch(StepFailedException e) {
			log.logFailed("Delete account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def ReplaceCostCenter(String transName,String transDescription,String bankIDfield,String actfield) {
		try {
			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')
			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Opposite_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')

			TestObject ReplaceCost_Center1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject AccountingType2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_FixedLocation')
			TestObject ChoseNamedAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.From ScreenPosting BankOriginal Bank')
			TestObject ChoseBankfield = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.1  -  DDA Clearing2  -  Write Off')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject start_date= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_StartEnd')
			TestObject input_length = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Length')
			TestObject type_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_rbt')
			TestObject select_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/mark_Branch')
			TestObject save_accounttype= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			//TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)

			WebUI.setText(AccountName,transName)

			WebUI.setText(DescriptionNAme,transDescription)

			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bankIDfield)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(ReplaceCost_Center1)
			GlobalVariable.globalShortDelay

			WebUI.click(AccountName_field)
			//WebUI.setText(hardPostCreditTranscode,'1')

			WebUI.selectOptionByValue(start_date,'Start', true)
			WebUI.setText(input_length,'2')
			WebUI.click(allConfigured1)
			GlobalVariable.globalShortDelay
			WebUI.setText(configuredData1,'common.Accounts.Address3')
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave1)
			WebUI.click(Save_button)
			WebUI.click(AccountingType2)
			WebUI.click(AccountType)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
		} catch(StepFailedException e) {
			log.logFailed("Delete account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def UpdateBankandAccount(String transName,String transDescription,String bankIDfield,String actfield) {
		try {
			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')
			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Opposite_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')

			TestObject ReplaceCost_Center1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject AccountingType2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_FixedLocation')
			TestObject ChoseNamedAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.From ScreenPosting BankOriginal Bank')
			TestObject ChoseBankfield = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.1  -  DDA Clearing2  -  Write Off')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject start_date= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_StartEnd')
			TestObject input_length = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Length')
			TestObject type_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_rbt')
			TestObject select_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/mark_Branch')
			TestObject save_accounttype= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			//TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)

			WebUI.setText(AccountName,transName)

			WebUI.setText(DescriptionNAme,transDescription)

			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bankIDfield)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(ReplaceCost_Center1)
			GlobalVariable.globalShortDelay

			WebUI.click(AccountName_field)
			//WebUI.setText(hardPostCreditTranscode,'1')

			WebUI.selectOptionByValue(start_date,'Start', true)
			WebUI.setText(input_length,'2')
			WebUI.click(allConfigured1)
			GlobalVariable.globalShortDelay
			WebUI.setText(configuredData1,'common.Accounts.Address3')
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave1)
			WebUI.click(Save_button)
			WebUI.click(AccountingType2)
			WebUI.click(AccountType)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
		} catch(StepFailedException e) {
			log.logFailed("Delete account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def Test_Button(){
		try {
			TestObject navigatetoAccountEntries =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject existing_Account = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_Holds Acquired')

			TestObject Test_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Test')
			TestObject case_ID= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Case ID_caseID (1)')
			TestObject cancel_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Cancel')
			TestObject test2_btn=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Test2_btn')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(existing_Account)
			WebUI.click(Test_Button)
			WebUI.setText(case_ID,'102')
			WebUI.click(test2_btn)
			WebUI.click(cancel_Button)
		} catch(StepFailedException e) {
			log.logFailed("Delete account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountingEntryReplaceCostCenter_startPasition(String transName,String transDescription,String bankIDfield,String actfield) {
		try {



			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')

			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')

			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject balanceAffecting = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Accounting_Credit_isBalanceAffecting1')
			TestObject hardPost1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Credit Trancode1')
			//TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name_isReplaceCostCenter1')
			TestObject amountDatabaseColumn1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase_Column_1')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			TestObject ReplaceCost_Center1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject start_date= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_StartEnd')
			TestObject input_length = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Length')
			TestObject type_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_rbt')
			TestObject select_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/mark_Branch')
			TestObject save_accounttype= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject path_1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/path')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject statusOpen = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/ddl_Open_Status')
			TestObject chkStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/chk_Open_Status')
			TestObject btnOk = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_OK')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/td_Select_Case_ATM')
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Right_Click_White_Space')
			TestObject sltChangeCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Change Case Status')
			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			//TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject Accountingcredit1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')

			TestObject Primaryact=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Named_accountLocation2 (1)')
			TestObject Test_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Test')
			TestObject case_ID= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Case ID_caseID (1)')
			TestObject cancel_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Cancel')
			TestObject test2_btn=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Test2_btn')


			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,transName)

			WebUI.setText(DescriptionNAme,transDescription)
			WebUI.click(AccountingType1)
			WebUI.click(balanceAffecting)
			WebUI.click(hardPost1)
			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bankIDfield)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(ReplaceCost_Center1)
			GlobalVariable.globalShortDelay
			WebUI.click(select_account)
			WebUI.click(select_typeaccount)
			WebUI.click(AccountName_field)
			//WebUI.setText(hardPostCreditTranscode,'1')

			WebUI.selectOptionByValue(start_date,'Start', true)
			WebUI.setText(input_length,'2')
			WebUI.click(allConfigured1)
			GlobalVariable.globalShortDelay
			WebUI.setText(configuredData1,'common.Accounts.Address3')
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave1)
			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,'GL2')
			WebUI.click(Accountingcredit)
			WebUI.click(hardPost2)
			WebUI.click(Accountingcredit1)
			WebUI.click(Test_Button)
			WebUI.setText(case_ID,'102')
			WebUI.click(test2_btn)

			WebUI.click(cancel_Button)
			WebUI.click(Save_button)
		} catch(StepFailedException e) {
			log.logFailed("Replace cost center start Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}






	@Keyword
	def createAccountingEntryReplaceCostCenter_endPasition(String transName,String transDescription,String bankIDfield,String actfield) {
		try {

			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')

			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')

			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject balanceAffecting = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Accounting_Credit_isBalanceAffecting1')
			TestObject hardPost1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Credit Trancode1')
			//TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name_isReplaceCostCenter1')
			TestObject amountDatabaseColumn1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase_Column_1')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			TestObject ReplaceCost_Center1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject start_date= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_StartEnd')
			TestObject input_length = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Length')
			TestObject type_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_rbt')
			TestObject select_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/mark_Branch')
			TestObject save_accounttype= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject path_1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/path')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject statusOpen = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/ddl_Open_Status')
			TestObject chkStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/chk_Open_Status')
			TestObject btnOk = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_OK')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_bi bi-search')
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/td_Select_Case_ATM')
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Right_Click_White_Space')
			TestObject sltChangeCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Change Case Status')
			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			//TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject Accountingcredit1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')

			TestObject Primaryact=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Named_accountLocation2 (1)')
			TestObject Test_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Test')
			TestObject case_ID= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Case ID_caseID (1)')
			TestObject cancel_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Cancel')
			TestObject cancelBtn_2=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Cancel')
			TestObject test2_btn=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Test2_btn')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,transName)

			WebUI.setText(DescriptionNAme,transDescription)
			WebUI.click(AccountingType1)
			WebUI.click(balanceAffecting)
			WebUI.click(hardPost1)
			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bankIDfield)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(ReplaceCost_Center1)
			GlobalVariable.globalShortDelay
			WebUI.click(select_account)
			WebUI.click(select_typeaccount)
			WebUI.click(AccountName_field)
			//WebUI.setText(hardPostCreditTranscode,'1')

			WebUI.selectOptionByValue(start_date,'End', true)
			WebUI.setText(input_length,'2')
			WebUI.click(allConfigured1)
			GlobalVariable.globalShortDelay
			WebUI.setText(configuredData1,'common.Accounts.Address3')
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave1)
			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,'GL2')
			WebUI.click(Accountingcredit)
			WebUI.click(hardPost2)
			WebUI.click(Accountingcredit1)
			WebUI.click(Test_Button)
			WebUI.setText(case_ID,'102')
			WebUI.click(test2_btn)
			WebUI.click(cancel_Button)
		} catch(StepFailedException e) {
			log.logFailed("Replacecost center end position Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def DaysToHoldBox(String transName,String transDescription,String bankIDfield,String actfield,String day_holdBox) {
		try {
			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')

			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			//TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name_isReplaceCostCenter1')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject AccountingType2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_FixedLocation')
			TestObject ChoseNamedAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_BankOriginal Bank')
			TestObject ChoseBankfield = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_Choose')
			TestObject daysToHoldBox=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DaysToHold')

			TestObject Memo_Post= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_MemoPost1')

			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,transName)
			WebUI.setText(DescriptionNAme,transDescription)
			WebUI.click(Memo_Post)
			WebUI.setText(daysToHoldBox,day_holdBox)
			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bankIDfield)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(select_account)
			WebUI.click(select_typeaccount)
			WebUI.click(AccountName_field)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
			WebUI.click(Save_button)
		} catch(StepFailedException e) {

			log.logFailed("Days to Hold account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def Provisionalcredit() {
		try {
			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')
			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Opposite_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')

			TestObject ReplaceCost_Center1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject AccountingType2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_FixedLocation')
			TestObject ChoseNamedAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.From ScreenPosting BankOriginal Bank')
			TestObject ChoseBankfield = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Page_Accounting Entry Maintenance/select_Choose.1  -  DDA Clearing2  -  Write Off')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')
			TestObject start_date= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_StartEnd')
			TestObject input_length = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Length')
			TestObject type_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_rbt')
			TestObject select_accounting = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/mark_Branch')
			TestObject save_accounttype= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			//TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)

			WebUI.setText(AccountName,'Provisional Cridet')

			WebUI.setText(DescriptionNAme,'GL1')

			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId,'1')

			WebUI.setText(Account_Number, '1')
			WebUI.click(ReplaceCost_Center1)
			GlobalVariable.globalShortDelay

			WebUI.click(AccountName_field)
			//WebUI.setText(hardPostCreditTranscode,'1')

			WebUI.selectOptionByValue(start_date,'Start', true)
			WebUI.setText(input_length,'2')
			WebUI.click(allConfigured1)
			GlobalVariable.globalShortDelay
			WebUI.setText(configuredData1,'common.Accounts.Address3')
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave1)
			WebUI.click(Save_button)
			WebUI.click(AccountingType2)
			WebUI.click(AccountType)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
		} catch(StepFailedException e) {
			log.logFailed("Delete account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def Totalamontbutton() {
		try {


			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')

			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject AccountType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Database Column_entryAmountType1')
			TestObject include_totalamt1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Total Amount_isIncludeInTotal1')

			TestObject AccountingType2=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Opposite_accountingType2')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Database Column_entryAmountType2')
			TestObject  include_totalamt2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Total Amount_isIncludeInTotal2')

			TestObject AccountingType3=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Opposite_accountingType3')
			TestObject AccountType3=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Database Column_entryAmountType3')
			TestObject  include_totalamt3=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Total_accountentry/Page_Accounting Entry Maintenance/input_Total Amount_isIncludeInTotal3')

			TestObject path_1= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/path')

			TestObject account_type3=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Posted_entryAmountType2')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')

			TestObject Primaryact=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Named_accountLocation2 (1)')
			TestObject Test_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Test')
			TestObject case_ID= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Case ID_caseID (1)')
			TestObject cancel_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Cancel')
			TestObject test2_btn=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Test2_btn')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,'Total amount')

			WebUI.setText(DescriptionNAme,'Debit')
			WebUI.click(AccountingType1)
			WebUI.click(AccountType1)
			WebUI.click(include_totalamt1)
			WebUI.click(path_1)
			WebUI.setText(discription2,'Debit')
			WebUI.click(AccountingType2)
			WebUI.click(account_type3)
			WebUI.click(AccountType2)

			GlobalVariable.globalShortDelay
			WebUI.click(include_totalamt2)
			//WebUI.click(path_1)
			//WebUI.setText(discription2,'Credit')
			//WebUI.click(AccountingType3)
			//WebUI.click(AccountType3)
			//WebUI.click(include_totalamt3)

			WebUI.click(Test_Button)
			WebUI.setText(case_ID,'102')
			WebUI.click(test2_btn)

			WebUI.click(cancel_Button)
			WebUI.click(Save_button)
		} catch(StepFailedException e) {
			log.logFailed("Replace cost center start Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}



