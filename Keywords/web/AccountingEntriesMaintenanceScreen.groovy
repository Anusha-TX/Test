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


public class AccountingEntriesMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createAccountingEntries(String entryName, String description1, String transCode1,String description2, String transCode2, String bank_ID, String bank_Account) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/btn_New')
			TestObject fieldName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Name')
			TestObject discription1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Description_name_1')
			TestObject Accountingcredit = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/rdo_Accounting_Credit_1')
			TestObject balanceAffecting = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/chk_Accounting_Credit_isBalanceAffecting1')
			TestObject hardPost1 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/chk_Hard Post_1')
			TestObject hardPostCreditTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Hard_Post_Credit Trancode1')

			// Data for 2nd Entries

			TestObject clickIPlusIcon = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/icon_Plus_Entries_2nd')
			TestObject discription2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Description_name_2')
			TestObject accountingDebit =	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/rdo_Accounting_Debit2')
			TestObject hardPost2 = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/chk_Hard Post_2')
			TestObject hardPostDebitTranscode = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Hard_Post_Debit Trancode_2')
			TestObject accountFixed = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/rdo_Account_Fixed_2')
			TestObject bankId = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Bank_bankID_2')
			TestObject bankAccount = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Account_account_2')
			TestObject accountName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_NameBank_Name')
			TestObject clkSelect = 	findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/span_Bank_Account_Select')
			TestObject accountType = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/div_GL_Account')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/btn_Save')

			WebUI.click(btnNew)
			WebUI.setText(fieldName,entryName)
			WebUI.setText(discription1,description1)
			WebUI.click(Accountingcredit)
			WebUI.click(balanceAffecting)
			WebUI.click(hardPost1)
			WebUI.setText(hardPostCreditTranscode,transCode1)

			// @2nd entry data
			GlobalVariable.globalShortDelay
			WebUI.click(clickIPlusIcon)
			WebUI.setText(discription2,description2)
			WebUI.click(accountingDebit)
			WebUI.click(hardPost2)
			WebUI.setText(hardPostDebitTranscode,transCode2)
			WebUI.click(accountFixed)
			WebUI.setText(bankId,bank_ID )
			WebUI.setText(bankAccount,bank_Account)
			WebUI.click(accountName)
			WebUI.click(clkSelect)
			WebUI.click(accountType)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountTemplate(String entryName) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/btn_New')
			TestObject fieldName = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/input_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/btn_Save')

			WebUI.click(btnNew)
			WebUI.setText(fieldName,entryName)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Create Account Template Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAccountTemplate() {
		try {
			TestObject sltTem = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/span_Account')

			WebUI.click(sltTem)
		}  catch(StepFailedException e) {
			log.logFailed("Select Account Template Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteAccount() {
		try {
			TestObject btnDelete = findTestObject('Object Repository/Web/Legal/Maintain/Templates/Accounting Entries/Page_Create_Account_Entry_Maint/button_Account_Delete')

			WebUI.click(btnDelete)
		}  catch(StepFailedException e) {
			log.logFailed("Delete Account Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}













