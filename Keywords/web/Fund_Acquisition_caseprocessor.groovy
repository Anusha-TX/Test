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


public class Funds_acquisition {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def funds_acquistion_FPFTranscation() {
		try {

			TestObject timeline_action =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/div_Timeline1')
			TestObject fund_acquistion =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/div_Funds Acquisition')
			TestObject fpf_amt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/span_FPF Amount')
			TestObject audit_view =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/button_Case Memos_btn btn-outline-secondary')
			TestObject performed_action=findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/td_User Performed Funds Acquisition')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(timeline_action)
			WebUI.click(fund_acquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.click(fpf_amt)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit_view)
			WebUI.verifyElementPresent(performed_action,10, FailureHandling.STOP_ON_FAILURE)
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
	def settings_FPFTranscation() {
		try {

			TestObject fund_select =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/span_Funds Acquisition')
			TestObject description1 =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/input_Description_label_1')
			TestObject save1 =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/button_Save')

			WebUI.click(fund_select)
			WebUI.setText(description1,'NEED FPF Transactions')

			WebUI.click(save1)
		}catch(StepFailedException e) {

			log.logFailed("Add settings FPF transcation  step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def legalfundsacquisitionEntriesVerifyFPF() {
		try {

			TestObject acttype =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_AccountType')
			TestObject backid =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_BankID')
			TestObject balance =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Balance')
			TestObject takeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_takeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_takeamt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_takeamt')
			TestObject feeamtt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject save =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/td_70_verify')
			TestObject feeamount =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/div_Timeline1')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')

			TestObject takeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmount_selecttemplate')
			//TestObject accountingentries =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/span_Accounting Entries')
			TestObject debitentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Debit')
			TestObject creditentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Credit')
			TestObject takeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmountvalue')
			//TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject selectDropDown =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_dropdown_fpf')
			TestObject selectCheckbox =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_checkbox_transaction')

			TestObject debtor = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/debtor1')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Account Identification Action')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(debtor)
			WebUI.click(fundsacquistion)
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.click(takeamount_selecttemplate)
			WebUI.click(takeamountvalue)
			WebUI.click(feeamount_selecttemplate)
			WebUI.click(feeamountvalue)
			WebUI.verifyElementPresent(acttype, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(backid, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			//WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(selectDropDown)
			WebUI.click(selectCheckbox)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			//case processor is not loading so again double clicking on the caseid
			//WebUI.doubleClick(caseId_cp)
		}catch(StepFailedException  e) {
			log.logFailed("Legal fundsacquisition Entries step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def legalfundsacquisitionErrorValidation() {
		try {
			TestObject acttype =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_AccountType')
			TestObject backid =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_BankID')
			TestObject balance =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Balance')
			TestObject takeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/select_takeamt')
			TestObject selecttakeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectanttakeamt')
			TestObject holdamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/holdamt')
			TestObject feeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeamt')
			TestObject selectfeeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectfeesmt')
			TestObject selectholdamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectholdamt')
			TestObject feeamtt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject save =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/td_70_verify')
			TestObject feeamount =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/div_Timeline1')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')

			TestObject takeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmount_selecttemplate')

			TestObject debitentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Debit')
			TestObject creditentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Credit')
			TestObject takeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmountvalue')

			TestObject selectDropDown =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_dropdown_fpf')
			TestObject selectCheckbox =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_checkbox_transaction')



			WebUI.switchToWindowTitle('Case Processor')

			WebUI.rightClick(select_acct)

			WebUI.click(fundsacquistion)
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.clearText(feeamount)
			//			WebUI.setText(feeamount,feeamounttoerrorout)
			//			WebUI.verifyElementPresent(errormsg, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Legalfundsacquisitionview step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openJursdiction(String minimumaccountbalance, String setfeeamount, String setminimumfee, String setmaximumfee) {
		try {
			TestObject selectFLJurisdiction = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject allowFeesRegardlessOfNegativeBalance = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/allow_fees_regardless_ofNegative_balance')
			TestObject takeFeeLast = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/take_fee_last')
			TestObject enterMinimumAccountBalance = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/input_minimum_account_balance')
			TestObject save = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/button_Save')
			TestObject feeAmount = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/input_fee_amount')
			TestObject minimumFee=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/input_minimum_fee')
			TestObject maximumFee = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Jurisdiction Maintenance/input_maximum_fee')

			WebUI.click(selectFLJurisdiction)

			WebUI.setText(feeAmount, setfeeamount)
			WebUI.setText(minimumFee, setminimumfee)
			WebUI.setText(maximumFee, setmaximumfee)
			WebUI.setText(enterMinimumAccountBalance, minimumaccountbalance)
			WebUI.click(save)
		}catch(StepFailedException  e) {
			log.logFailed("Open Florida Jurisdictions step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def jurisdictions_FL1(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			TestObject useBranchrdobtn =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtnusebranch')



			WebUI.click(garnishment)
			//WebUI.scrollToElement(me, 0)
			WebUI.click(me)
			String isChecked3=WebUI.getAttribute(useBranchrdobtn, 'checked')
			if(isChecked3==null||isChecked3=='false') {
				WebUI.click(usebranch)
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
			}
			String isChecked=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked==null||isChecked=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(allowFees)
			}
			String isChecked1=WebUI.getAttribute(radiobtn2, 'checked')
			if(isChecked1==null||isChecked1=='false') {
				WebUI.click(takefeeLast)
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
			}
			WebUI.clearText(feeAmount)
			WebUI.setText(feeAmount,feeAmt)
			WebUI.clearText(maxFees)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'2000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			String isChecked2=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked2==null||isChecked2=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(minbalanceacrossProfile)
			}

			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("FL Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def legalfundsacquisition() {
		try {
			TestObject acttype =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_AccountType')
			TestObject backid =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_BankID')
			TestObject balance =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Balance')
			TestObject takeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/select_takeamt')
			TestObject selecttakeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectanttakeamt')
			TestObject holdamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/holdamt')
			TestObject feeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeamt')
			TestObject selectfeeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectfeesmt')
			TestObject selectholdamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Application Settings Maintenance/selectholdamt')
			TestObject feeamtt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject save =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/td_70_verify')
			TestObject feeamount =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Case Processor/div_Timeline1')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')

			TestObject takeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmount_selecttemplate')

			TestObject debitentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Debit')
			TestObject creditentry =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/div_Credit')
			TestObject takeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/feeAmountvalue')

			TestObject selectDropDown =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_dropdown_fpf')
			TestObject selectCheckbox =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/select_checkbox_transaction')



			WebUI.switchToWindowTitle('Case Processor')

			WebUI.rightClick(select_acct)

			WebUI.click(fundsacquistion)
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			//			WebUI.clearText(feeamount)
			//			WebUI.setText(feeamount,feeamounttoerrorout)
			//			WebUI.verifyElementPresent(errormsg, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)

			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Legalfundsacquisitionview step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def jurisdictions_UseBranch(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_ME')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			TestObject useBranchrdobtn =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtnusebranch')



			WebUI.click(garnishment)
			//WebUI.scrollToElement(me, 0)
			WebUI.click(me)
			String isChecked3=WebUI.getAttribute(useBranchrdobtn, 'checked')
			if(isChecked3==null||isChecked3=='false') {
				WebUI.click(usebranch)
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
			}
			String isChecked=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked==null||isChecked=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(allowFees)
			}
			String isChecked1=WebUI.getAttribute(radiobtn2, 'checked')
			if(isChecked1==null||isChecked1=='false') {
				WebUI.click(takefeeLast)
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
			}
			WebUI.clearText(feeAmount)
			WebUI.setText(feeAmount,feeAmt)
			WebUI.clearText(maxFees)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'2000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			String isChecked2=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked2==null||isChecked2=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(minbalanceacrossProfile)
			}

			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("FL Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def jurisdictionsFL(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			WebUI.click(garnishment)
			WebUI.click(me)
			WebUI.click(allowFees)
			WebUI.click(takefeeLast)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'2000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			WebUI.click(minbalanceacrossProfile)
			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("FL Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def jurisdictions_IneligibleAccount(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_MN')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject ineligibleAct=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Ineligible Account Types_value')
			
			
			
			
			WebUI.click(garnishment)
			WebUI.click(me)
			WebUI.click(allowFees)
			WebUI.click(takefeeLast)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'2000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			WebUI.click(minbalanceacrossProfile)
			WebUI.setText(ineligibleAct,'I')
			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("Ineligible Account Types Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def jurisdictions_BalanceThershould(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_MN')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject ineligibleAct=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Ineligible Account Types_value')
			
			
			
			
			WebUI.click(garnishment)
			WebUI.click(me)
			WebUI.click(allowFees)
			WebUI.click(takefeeLast)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'50000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			WebUI.click(minbalanceacrossProfile)
			WebUI.setText(ineligibleAct,'I')
			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("Balance Thershould Types Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	
	@Keyword
	def jurisdictions_ProtectedFunds(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject me =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_MN')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Customer Physical Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject ineligibleAct=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Ineligible Account Types_value')
			TestObject funds_protected=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/div_Sort Funds Protected Last')
			
			
			
			WebUI.click(garnishment)
			WebUI.click(me)
			WebUI.click(allowFees)
			WebUI.click(takefeeLast)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,'2000')
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')
			WebUI.click(minbalanceacrossProfile)
			WebUI.click(funds_protected)
			WebUI.click(save)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("Balance Thershould Types Jurisdictions maintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}




