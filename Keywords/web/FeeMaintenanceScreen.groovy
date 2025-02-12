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
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

public class FeeMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def newFeeCreation(String bankid, String accountid, String feedescription, String amountvalue, String directtranscode, String analysistranscode) {

		try {
			TestObject newAddButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_addnew')
			TestObject bankId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_bankID')
			TestObject accountId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_account')
			TestObject clickAccountAddon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_account_addon')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_option_photocopy')
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directamount')
			TestObject directTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directtranscode')
			TestObject analysisTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_analysistranscode')
			TestObject saveBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_save')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/span_DDA')
			TestObject selectDDA =findTestObject('Object Repository/Web/Dispute/Maintain/Req General Instr/Page_ReqMaintenance/div_1 XXXX0001 DDA')
			TestObject selectPhotocopy =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_photocopy')
			TestObject feeMaintain =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/fee_maintain')
			
			WebUI.click(newAddButton)
			WebUI.setText(bankId,bankid)
			WebUI.setText(accountId,accountid)
			WebUI.click(clickAccountAddon)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.click(description)
			WebUI.click(selectPhotocopy)
			WebUI.setText(amount, amountvalue)
			WebUI.setText(directTranscode, directtranscode)
			//WebUI.setText(analysisTranscode, analysistranscode)
			WebUI.click(saveBtn)
		}catch(StepFailedException e) {
			log.logFailed("Fee creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def newFeeCreationWithDifferentDescription(String bankid, String accountid, String feedescription, String amountvalue, String directtranscode, String analysistranscode) {

		try {
			TestObject newAddButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_addnew')
			TestObject bankId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_bankID')
			TestObject accountId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_account')
			TestObject clickAccountAddon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_account_addon')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_option_photocopy')
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directamount')
			TestObject directTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directtranscode')
			TestObject analysisTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_analysistranscode')
			TestObject saveBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_save')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/span_DDA')
			TestObject selectDDA =findTestObject('Object Repository/Web/Dispute/Maintain/Req General Instr/Page_ReqMaintenance/div_1 XXXX0001 DDA')
			TestObject selectOtherOption =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_other_option')
			TestObject feeMaintain =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/fee_maintain')
					
			WebUI.click(newAddButton)
			WebUI.setText(bankId,bankid)
			WebUI.setText(accountId,accountid)
			WebUI.click(clickAccountAddon)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.click(description)
			WebUI.click(selectOtherOption)
			WebUI.setText(amount, amountvalue)
			WebUI.setText(directTranscode, directtranscode)
			//WebUI.setText(analysisTranscode, analysistranscode)
			WebUI.click(saveBtn)
		}catch(StepFailedException e) {

			log.logFailed("Fee creation with different description failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def newFeeCreationValidateFields(String bankid, String accountid, String feedescription, String amountvalue, String directtranscode, String analysistranscode) {

		try {
			TestObject newAddButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_addnew')
			TestObject bankId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_bankID')
			TestObject accountId = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_account')
			TestObject clickAccountAddon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_account_addon')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_option_photocopy')
			TestObject amount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directamount')
			TestObject directTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_directtranscode')
			TestObject analysisTranscode = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/input_analysistranscode')
			TestObject saveBtn = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/btn_save')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/span_DDA')
			TestObject selectDDA =findTestObject('Object Repository/Web/Dispute/Maintain/Req General Instr/Page_ReqMaintenance/div_1 XXXX0001 DDA')
			TestObject selectPhotocopy =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/select_photocopy')
			TestObject feeMaintain =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Fee/fee_maintain')
			
			WebUI.click(newAddButton)
			WebUI.verifyElementPresent(bankId, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(accountId, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(description, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(amount, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(directTranscode, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(saveBtn, GlobalVariable.globalLongDelay, FailureHandling.STOP_ON_FAILURE )
			
			WebUI.setText(bankId,bankid)
			WebUI.setText(accountId,accountid)
			WebUI.click(clickAccountAddon)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.click(description)
			WebUI.click(selectPhotocopy)
			WebUI.setText(amount, amountvalue)
			WebUI.setText(directTranscode, directtranscode)
			//WebUI.setText(analysisTranscode, analysistranscode)
			WebUI.click(saveBtn)
		}catch(StepFailedException e) {
			log.logFailed("Fee creation failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
