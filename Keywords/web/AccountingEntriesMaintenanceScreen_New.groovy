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
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

public class AccountingEntriesMaintenanceScreen_New {

	KeywordLogger log = new KeywordLogger()
	@Keyword
	def createAccountingEntries(String entryName, String description1, String transCode1,String description2, String transCode2, String bank_ID, String bank_Account) {
		try {
			TestObject navigatetoAccountEntries=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject btnNew = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_New')
			TestObject fieldName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject discription1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_1')
			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject hardPost1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Credit Trancode1')
			//	TestObject amountDatabaseColumn1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase_Column_1')
			//	TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			//	TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			//	TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			//	TestObject allowForAccountType = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_AllCDDDAGLLoanSavings_1')
			//	TestObject caseAccounts1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Case Accounts')

			// Data for 2nd Entries

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			//		TestObject amountDatabaseColumn2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase Column_2')
			//		TestObject allConfigured2 =	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_2')
			//		TestObject configuredData2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_2')
			//		TestObject btnSave2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_2')
			//		TestObject allowForAccountType2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_Allow For Account Type_2')
			//		TestObject accountFixed = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Fixed_2')
			//		TestObject bankID = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Bank_bankID_2')
			//		TestObject bankAccount = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account_account_2')
			//		TestObject bankName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_NameBank_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save')

			TestObject remainingBalance = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Remaining Balance')


			WebUI.click(navigatetoAccountEntries)
			WebUI.click(btnNew)
			WebUI.setText(fieldName,'Hold Entry')
			WebUI.setText(discription1,'GL1')
			WebUI.click(Accountingcredit)
			WebUI.click(hardPost1)
			WebUI.setText(hardPostCreditTranscode,'Credit')
			//	WebUI.click(amountDatabaseColumn1)
			//	WebUI.click(allConfigured1)
			//	WebUI.setText(configuredData1,configurationData1)
			//	WebUI.click(btnSave1)
			//	WebUI.selectOptionByValue(allowForAccountType,'All',true)
			//	WebUI.click(caseAccounts1)

			// @2nd entry data

			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,'GL2')
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			//WebUI.setText(hardPostDebitTranscode,'Debit')

			//	WebUI.click(amountDatabaseColumn2)
			//	WebUI.click(allConfigured2)
			//	WebUI.setText(configuredData2,configurationData2)
			//	WebUI.click(btnSave2)
			//	WebUI.selectOptionByValue(allowForAccountType2,'All',true)
			//	WebUI.click(accountFixed)
			//	WebUI.setText(bankID,bank_ID)
			//		WebUI.setText(bankAccount,bank_Account)
			//		WebUI.click(bankName)
			//		WebUI.delay(2)
			//	WebUI.click(remainingBalance)
			//	WebUI.click(amountDatabaseColumn1)

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Fees Release Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}



	@Keyword
	def createAccountingEntryFeesRelease1(String entryName, String description1, String transCode1, String description2, String transCode2) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_New')
			TestObject fieldName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject discription1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_1')
			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject hardPost1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Credit Trancode1')
			//	TestObject amountDatabaseColumn1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase_Column_1')
			//	TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			//	TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			//	TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			//	TestObject allowForAccountType = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_AllCDDDAGLLoanSavings_1')
			//	TestObject caseAccounts1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Case Accounts')

			// Data for 2nd Entries

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			//		TestObject amountDatabaseColumn2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase Column_2')
			//		TestObject allConfigured2 =	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_2')
			//		TestObject configuredData2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_2')
			//		TestObject btnSave2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_2')
			//		TestObject allowForAccountType2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_Allow For Account Type_2')
			//		TestObject accountFixed = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Fixed_2')
			//		TestObject bankID = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Bank_bankID_2')
			//		TestObject bankAccount = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account_account_2')
			//		TestObject bankName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_NameBank_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save')

			TestObject remainingBalance = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Remaining Balance')

			WebUI.click(btnNew)
			WebUI.setText(fieldName,entryName)
			WebUI.setText(discription1,description1)
			WebUI.click(Accountingcredit)
			WebUI.click(hardPost1)
			WebUI.setText(hardPostCreditTranscode,transCode1)
			//	WebUI.click(amountDatabaseColumn1)
			//	WebUI.click(allConfigured1)
			//	WebUI.setText(configuredData1,configurationData1)
			//	WebUI.click(btnSave1)
			//	WebUI.selectOptionByValue(allowForAccountType,'All',true)
			//	WebUI.click(caseAccounts1)

			// @2nd entry data

			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,description2)
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			WebUI.setText(hardPostDebitTranscode,transCode2)

			//WebUI.click(btnSave)
			//	WebUI.click(allConfigured2)
			//	WebUI.setText(configuredData2,configurationData2)
			//	WebUI.click(btnSave2)
			//	WebUI.selectOptionByValue(allowForAccountType2,'All',true)
			//	WebUI.click(accountFixed)
			//	WebUI.setText(bankID,bank_ID)
			//		WebUI.setText(bankAccount,bank_Account)
			//		WebUI.click(bankName)
			//		WebUI.delay(2)
			//	WebUI.click(remainingBalance)
			//	WebUI.click(amountDatabaseColumn1)

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Fees Release Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def create_holdApi(String entryName, String description1, String transCode1,String description2, String transCode2, String bank_ID, String actfield) {
		try {

			TestObject navigatetoNew= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/new_button')
			TestObject AccountName= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject DescriptionNAme= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description')

			TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			TestObject AccountingType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountingType1')
			TestObject AccountType = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Caseaccount1')
			TestObject Account_BankId = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_bankID')
			TestObject Account_Number = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account')
			//TestObject AccountName_field= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_accountName')
			//TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name_isReplaceCostCenter1')
			TestObject Save_button= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/button_Save')
			TestObject AccountingType2= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DebitType1')
			TestObject AccountType2 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_FixedLocation')
			TestObject ChoseNamedAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_BankOriginal Bank')
			TestObject ChoseBankfield = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/select_Choose')
			TestObject daysToHoldBox=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_DaysToHold')

			TestObject Memo_Post= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_MemoPost1')

			TestObject select_account=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/div_Select')
			TestObject select_typeaccount=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/span_DDA')

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save')
			TestObject ReplaceCost_Center= findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/Replace_CostCenter')

			//WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,entryName)
			WebUI.setText(DescriptionNAme,description1)
			WebUI.click(Memo_Post)
			//WebUI.setText(daysToHoldBox,day_holdBox)
			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bank_ID)
			WebUI.setText(Account_Number, actfield)
			WebUI.click(ReplaceCost_Center)
			WebUI.click(select_account)
			WebUI.click(select_typeaccount)
			WebUI.click(AccountName_field)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
			WebUI.click(Save_button)

			// @2nd entry data

			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,description2)
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			
			WebUI.click(btnSave)
		} catch(StepFailedException e) {

			log.logFailed(" Hold  API account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def create_entries(String entryName, String description1, String transCode1,String description2, String transCode2, String bank_ID, String actfield) {
		try {

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

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save')


			//WebUI.click(navigatetoAccountEntries)
			WebUI.click(navigatetoNew)
			WebUI.setText(AccountName,'Hold Entry')
			WebUI.setText(DescriptionNAme,description1)
			WebUI.click(Memo_Post)
			//WebUI.setText(daysToHoldBox,day_holdBox)
			WebUI.click(AccountingType1)
			WebUI.click(AccountType)
			WebUI.setText(Account_BankId, bank_ID)

			WebUI.setText(Account_Number, actfield)
			WebUI.click(select_account)
			WebUI.click(select_typeaccount)
			WebUI.click(AccountName_field)
			//WebUI.verifyTextPresent(ReplaceCost_Center, true)
			WebUI.click(Save_button)

			// @2nd entry data

			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,description2)
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			///WebUI.setText(hardPostDebitTranscode,transCode2)

			WebUI.click(btnSave)
		} catch(StepFailedException e) {

			log.logFailed(" Hold Enrty account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
