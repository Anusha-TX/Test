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

// Keywords Functions

public class StaticAccountsMaintenanceSceen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def applicatioBar(String bank_ID, String bank_Account, String bankAddress) {
		try {
			TestObject bank = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/input_Bank_bankID')
			TestObject account = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/input_Account_account')
			TestObject search = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/input_Account_Cards_Search_Input')
			TestObject select = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/div_Select_Account')
			TestObject sltAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/span_Savings_Account')
			TestObject nameAddress = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/textarea_Name_And_Address_address')

			WebUI.click(bank)
			WebUI.setText(bank, bank_ID)
			WebUI.click(account)
			WebUI.setText(account, bank_Account)
			WebUI.click(search)
			WebUI.click(select)
			WebUI.click(sltAccount)
			WebUI.click(nameAddress)
			WebUI.setText(nameAddress, bankAddress)
		}  catch(StepFailedException e) {
			log.logFailed("Application Bar Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def accountTitleBar() {
		try {
			TestObject accountTitle = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/div_Accounts_Maintenance')

			WebUI.click(accountTitle)
		} catch(StepFailedException e) {
			log.logFailed("Account Title Bar Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectStaticAccount() {
		try {
			TestObject sltAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/span_1 XXXX0001 Savings USS Bank')

			WebUI.click(sltAccount)
		}  catch(StepFailedException e) {
			log.logFailed("Select Static Account Step Failed" + e.getMessage())
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
			TestObject btnDelete = 	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/button_Account_Delete')
			TestObject delete = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Account_Enter_Maintenance/button_Confirmation_Delete')

			WebUI.click(btnDelete)
			WebUI.click(delete)
		}  catch(StepFailedException e) {
			log.logFailed("Select Delete Account Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
