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
import com.kms.katalon.core.configuration.RunConfiguration

public class LegalFundsAcq {

	KeywordLogger log =new KeywordLogger()

	@Keyword
	def jurisdictionsFL(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject fl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_Save')
			TestObject usebranch =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			WebUI.click(garnishment)
			WebUI.click(fl)
			WebUI.click(allowFees)
			WebUI.click(takefeeLast)
			WebUI.setText(feeAmount,feeAmt)
			WebUI.setText(maxFees,maxFee)
			WebUI.setText(minFees,minFee)
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.setText(minAccountBalance,MinactBal)
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
	def openFloridaJurisdictions(String minimumaccountbalance, String setfeeamount, String setminimumfee, String setmaximumfee) {
		try {
			TestObject selectFLJurisdiction = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Jurisdiction Maintenance/button_FL')
			TestObject allowFeesRegardlessOfNegativeBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Jurisdiction Maintenance/allow_fees_regardless_ofNegative_balance')
			TestObject takeFeeLast = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Jurisdiction Maintenance/take_fee_last')
			TestObject enterMinimumAccountBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Jurisdiction Maintenance/input_minimum_account_balance')
			TestObject save = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_Jurisdiction Maintenance/button_Save')
			TestObject feeAmount = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_fee_amount')
			TestObject minimumFee=findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_minimum_fee')
			TestObject maximumFee = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_maximum_fee')

			WebUI.click(selectFLJurisdiction)
			//			String classAttr = WebUI.getAttribute(allowFeesRegardlessOfNegativeBalance, 'class')
			//
			//			if(classAttr.contains('active')) {
			//				WebUI.click(allowFeesRegardlessOfNegativeBalance)
			//				WebUI.comment("Turning Negative Balance Toggle button OFF")
			//			}
			//			else {
			//				WebUI.comment("Negative Balance Toggle button already OFF")
			//			}
			//
			//			if(classAttr.contains('active')) {
			//
			//				WebUI.comment("Take FeeLast Toggle button is already set ON")
			//			}
			//			else {
			//				WebUI.click(takeFeeLast)
			//				WebUI.comment("Take FeeLast Toggle button is now set ON")
			//			}

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
	def navigatetolegalCaseEntry() {
		try {
			TestObject Legal = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/svg_Legal_bi bi-chevron-down')
			WebUI.click(Legal)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/Page_TRIPS/div_Process')
			WebUI.click(Process)
			TestObject CaseEntry = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_TRIPS/div_Case Entry')
			WebUI.click(CaseEntry)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate CaseEntry step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def legalCaseEntry() {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Next')
			TestObject judgementamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Judgement Amount')
			TestObject requesteddoc =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Requested Docs')
			TestObject dropdown =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Drop files here')
			TestObject casenumber =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Case Number')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Document Date')
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Date Served_Question_20_undefined')
			WebUI.click(newclaim)
			WebUI.click(garnishment)
			WebUI.click(next)
			//WebUI.click(documentdate)
			WebUI.setText(documentdate,'12112024')
		}catch(StepFailedException  e) {
			log.logFailed("CaseEntry step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def legalCaseEntrydate() {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Next')
			TestObject judgementamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Judgement Amount')
			TestObject requesteddoc =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Requested Docs')
			TestObject dropdown =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Drop files here')
			TestObject casenumber =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Case Number')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Document Date')
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Date Served_Question_20_undefined')
			TestObject caseid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_CaseEntryid')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject fundsDate =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/funds_date')

			WebUI.setText(documentserved,'12112024')
			WebUI.setText(judgementamt,'10000')
			WebUI.click(selectanswer)
			WebUI.click(selectanyanswer)
			WebUI.setText(casenumber,'100')
			//WebUI.click(dropdown)
			//WebUI.switchToWindowIndex(1)
			WebUI.sendKeys(dropdown, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			//WebUI.switchToWindowIndex(0)
			WebUI.click(requesteddoc)
			WebUI.setText(fundsDate,'12112024')
			WebUI.click(next)
			WebUI.doubleClick(caseid)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("CaseEntry step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openGarnishmentCase() {
		try {
			TestObject jurisdictionView = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/jurisdiction_FL_view')
			TestObject allowFeesRegardlessOfNegativeBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/allow_fees_regardless_of_negative_balance')
			TestObject takeFeeLast = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/take_fee_last')
			TestObject feeAmount = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_fee_amount')
			TestObject minimumFee=findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_minimum_fee')
			TestObject maximumFee = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_maximum_fee')
			TestObject enterMinimumAccountBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Case Processor/input_minimum_account_balance')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')

			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
			WebUI.click(jurisdictionView)
			WebUI.verifyElementPresent(allowFeesRegardlessOfNegativeBalance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(takeFeeLast, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeAmount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(minimumFee, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(maximumFee, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.scrollToElement(enterMinimumAccountBalance, GlobalVariable.globalMediumDelay)
			WebUI.verifyElementPresent(enterMinimumAccountBalance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
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
	def legalfundsacquisitionviews() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_60_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
			WebUI.click(fundsacquistion)
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(backid, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def legalfundsacquisitionErrorValidation(String feeamounttoerrorout) {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectholdamt')
			//TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject feeamountNew =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountNew')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject errormsg = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/error_msg')
			TestObject cancelbutton = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/btn_cancel')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')
		
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
			WebUI.click(fundsacquistion)
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.scrollToElement(feeamountNew, 5)
			WebUI.verifyElementPresent(feeamountNew, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.clearText(feeamountNew)
			WebUI.setText(feeamountNew,feeamounttoerrorout)
			WebUI.verifyElementPresent(errormsg, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(cancelbutton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def legalfundsacquisitionEntriesVerifySeventyBalance() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_70_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
			WebUI.click(fundsacquistion)
			GlobalVariable.globalLongDelay
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.click(takeamount_selecttemplate)
			WebUI.click(takeamountvalue)
			WebUI.click(feeamount_selecttemplate)
			WebUI.click(feeamountvalue)
			WebUI.verifyElementPresent(acttype, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(backid, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(accountingentries)
			WebUI.verifyElementPresent(debitentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(creditentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def legalfundsacquisitionEntriesVerifyOneSixtyBalance() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_160_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
			WebUI.click(fundsacquistion)
			GlobalVariable.globalLongDelay
			//navigating to funds page
			WebUI.switchToWindowIndex(2)
			WebUI.click(takeamount_selecttemplate)
			WebUI.click(takeamountvalue)
			WebUI.click(feeamount_selecttemplate)
			WebUI.click(feeamountvalue)
			WebUI.verifyElementPresent(acttype, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(backid, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balance, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(accountingentries)
			WebUI.verifyElementPresent(debitentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(creditentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def legalfundsacquisitionEntriesVerifyOneZeroTwoBalance() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_102_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
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
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(accountingentries)
			WebUI.verifyElementPresent(debitentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(creditentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def legalfundsacquisitionEntriesVerifyOneOneZeroBalance() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_110_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
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
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(accountingentries)
			WebUI.verifyElementPresent(debitentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.verifyElementPresent(creditentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
	def caseAccountsView() {
		try {
			TestObject account = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Account')
			TestObject balance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Balance')
			TestObject balanceFA =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Balance at FA')
			TestObject feesAcquired =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Fees Acquired')
			TestObject fundsAcquired =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Funds Acquired')
			TestObject fundsDate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Funds Date')
			TestObject fundsHeld =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Funds Held')
			TestObject fundsProtected =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Funds Protected')
			TestObject fundsRelease =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Funds Release')
			TestObject status =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Status')
			TestObject type =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/span_Type')
			TestObject caseView =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/CaseAccountsView/click_case_accounts_view')

			WebUI.scrollToElement(caseView, GlobalVariable.globalShortDelay)
			WebUI.click(caseView)
			WebUI.scrollToElement(account, GlobalVariable.globalShortDelay)
			WebUI.verifyElementPresent(account, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balance, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(balanceFA, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feesAcquired, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(fundsAcquired, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(fundsDate, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(fundsHeld, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(fundsProtected, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(fundsRelease, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(status, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(type, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
		}catch(StepFailedException  e) {
			log.logFailed("Case Accounts view step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def legalfundsacquisitionEntriesVerifyFPF() {
		try {

			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/td_70_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJurisdictionsrepos/Page_Funds Acquisition/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')
			TestObject selectDropDown =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/select_dropdown_fpf')
			TestObject selectCheckbox =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/select_checkbox_transaction')
			TestObject debtor = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/click_timeline_debtor')
			TestObject generateLetter = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Generate Letter')

			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(generateLetter)
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
			WebUI.verifyElementPresent(balamt, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeamount, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(selectDropDown)
			WebUI.click(selectCheckbox)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalLongDelay
			//case processor is not loading so again double clicking on the caseid
			WebUI.doubleClick(caseId_cp)
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
}