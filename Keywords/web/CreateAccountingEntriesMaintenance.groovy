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

public class CreateAccountingEntriesMaintenance {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createAccountingEntryTemplate() {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_New')
			TestObject fieldName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Name')
			TestObject discription1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_1')
			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Credit_1')
			TestObject balanceAffecting = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Accounting_Credit_isBalanceAffecting1')
			TestObject hardPost1  = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Credit Trancode1')
			TestObject amountDatabaseColumn1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase_Column_1')
			TestObject allConfigured1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_All_Configured_1')
			TestObject  configuredData1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_1')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_1')
			TestObject allowForAccountType = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_AllCDDDAGLLoanSavings_1')
			TestObject caseAccounts1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Case Accounts')

			// Data for 2nd Entries

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Description_name_2')
			TestObject accountingDebit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Accounting_Debit_2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/chk_Hard Post_2')
			TestObject hardPostDebitTranscode  = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Hard_Post_Debit Trancode_2')
			TestObject amountDatabaseColumn2 = 	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Amount_DataBase Column_2')
			TestObject allConfigured2 =	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Column_databaseColumn_2')
			TestObject configuredData2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Field_Select_Data_Not_Configured_2')
			TestObject btnSave2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save_NotConfigured_2')
			TestObject allowForAccountType2 =  findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/ddl_Allow For Account Type_2')
			TestObject accountFixed = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Account_Fixed_2')
			TestObject bankID = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Bank_bankID_2')
			TestObject bankAccount = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_Account_account_2')
			TestObject bankName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/input_NameBank_Name')

			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/btn_Save')
			TestObject navigatetoAccountEntries =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/Page_TRIPS/div_Accounting Entries')
			TestObject remainingBalance = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Accounting Entry Maintenance/rdo_Remaining Balance')

			WebUI.click(navigatetoAccountEntries)
			WebUI.click(btnNew)
			WebUI.delay(2)
			WebUI.setText(fieldName,'Funds Release')
			WebUI.setText(discription1,'Credit Customer')
			WebUI.click(Accountingcredit)
			WebUI.click(balanceAffecting)
			WebUI.click(hardPost1)
			WebUI.delay(3)
			WebUI.setText(hardPostCreditTranscode, '1234')
			WebUI.click(amountDatabaseColumn1)
			WebUI.delay(2)
			WebUI.click(allConfigured1)
			WebUI.delay(1)
			WebUI.setText(configuredData1,'Dispute.CaseAccounts.AccountToken')
			WebUI.delay(2)
			WebUI.click(btnSave1)
			WebUI.selectOptionByValue(allowForAccountType,'All',true)
			WebUI.click(caseAccounts1)

			// @2nd entry data
			WebUI.delay(3)

			WebUI.click(clickIPlusIcon)
			WebUI.delay(3)
			WebUI.setText(discription2, 'Debit GL')
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			WebUI.delay(3)
			WebUI.setText(hardPostDebitTranscode,'5678')
			WebUI.click(amountDatabaseColumn2)
			WebUI.delay(3)
			WebUI.click(allConfigured2)
			WebUI.setText(configuredData2,'Dispute.CaseAccounts.AccountToken')
			WebUI.delay(3)
			WebUI.click(btnSave2)
			WebUI.delay(3)
			WebUI.selectOptionByValue(allowForAccountType2,'All',true)
			WebUI.click(accountFixed)
			WebUI.delay(3)
			WebUI.setText(bankID,'1')
			WebUI.setText(bankAccount, 'XXXX0001')
			WebUI.delay(3)
			WebUI.click(bankName)
			WebUI.click(remainingBalance)
			WebUI.click(amountDatabaseColumn1)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Template Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
