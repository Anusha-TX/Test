
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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import config.ConfigurationManager
import internal.GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration
public class FundsTakeAmt {
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
			TestObject radiobtn1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtn2')
			TestObject useBranchrdobtn =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtnusebranch')
			TestObject radiobtn3 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtn3')
			WebUI.click(garnishment)
			WebUI.click(fl)
			String isChecked3=WebUI.getAttribute(useBranchrdobtn, 'checked')
			if(isChecked3==null||isChecked3=='false') {

				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(usebranch)
			}
			String isChecked=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked==null||isChecked=='false') {
				WebUI.click(allowFees)
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
			}
			String isChecked1=WebUI.getAttribute(radiobtn2, 'checked')
			if(isChecked1==null||isChecked1=='false') {

				println('radio btn is unchecked')
			}else {
				WebUI.click(takefeeLast)
				println('radio btn is checked')
			}

			WebUI.setText(feeAmount,'500')
			WebUI.setText(maxFees,'0000')
			WebUI.setText(minFees,'000')
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.setText(minAccountBalance,'6000')
			String isChecked2=WebUI.getAttribute(radiobtn3, 'checked')
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
	def navigatetolegalCaseEntry() {
		try {
			TestObject Legal = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/svg_Legal_bi bi-chevron-down')
			WebUI.click(Legal)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Process')
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
	def legalCaseEntry(String date1) {
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
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Date Served')
			WebUI.click(newclaim)
			WebUI.click(garnishment)
			WebUI.click(next)
			WebUI.setText(documentdate,date1)
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
	def legalCaseEntrydate(String date2, String judgeamt,String caseno) {
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
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Date Served')
			TestObject caseid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_CaseEntryid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject selectAcct_identification =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Account Identification Action')
			TestObject releasedate =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_ReleaseDate')
			WebUI.setText(documentserved,date2)
			WebUI.setText(judgementamt,judgeamt)
			WebUI.click(selectanswer)
			WebUI.click(selectanyanswer)
			WebUI.setText(casenumber,caseno)
			WebUI.sendKeys(dropdown, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			WebUI.click(requesteddoc)
			GlobalVariable.globalMediumDelay
			WebUI.setText(releasedate,'12112024')
			WebUI.click(next)
			WebUI.doubleClick(caseid)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
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
			TestObject jurisdictionView = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/jurisdiction_FL_view')
			TestObject allowFeesRegardlessOfNegativeBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/allow_fees_regardless_of_negative_balance')
			TestObject takeFeeLast = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/take_fee_last')
			TestObject feeAmount = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/input_fee_amount')
			TestObject minimumFee=findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/input_minimum_fee')
			TestObject maximumFee = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/input_maximum_fee')
			TestObject enterMinimumAccountBalance = findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcquistionJurisdiction/Page_Case Processor/input_minimum_account_balance')
			TestObject caseId=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/NewcaseID')
			TestObject selectAcct_identification1= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action1')
			WebUI.doubleClick(caseId)
			WebUI.click(jurisdictionView)
			WebUI.verifyElementPresent(takeFeeLast, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(feeAmount, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(minimumFee, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(maximumFee, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.scrollToElement(enterMinimumAccountBalance, 10)
			WebUI.verifyElementPresent(enterMinimumAccountBalance, 10, FailureHandling.STOP_ON_FAILURE)
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
	def addAccount_identification_FundsAcquistion(String bankid,String acctno,String actbal) {
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
			TestObject select_activedue= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/activedue')
			TestObject caseId=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/NewcaseID')
			TestObject selectAcct_identification1= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action1')
			WebUI.doubleClick(caseId)
			WebUI.click(select_activedue)
			WebUI.waitForPageLoad(5)
			WebUI.delay(5)
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			GlobalVariable.globalMediumDelay
			if(WebUI.verifyElementPresent(selectAcct_identification, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.mouseOver(selectAcct_identification)
				WebUI.click(selectAcct_identification)
			}else {
				WebUI.mouseOver(selectAcct_identification1)
				WebUI.click(selectAcct_identification1)
			}
			WebUI.waitForPageLoad(5)
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			GlobalVariable.globalMediumDelay
			WebUI.click(search_btn)
			WebUI.setText(enter_bankId,bankid)
			WebUI.setText(enetr_acctNum,acctno)
			WebUI.click(fee_type)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			//WebUI.setText(select_acc,actname)
			WebUI.clearText(fee_type)
			WebUI.setText(fee_type,actbal)
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
	@Keyword
	def legalfundsacquisitionview() {
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
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamount95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_95_takeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject takefee0 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_takeAmount')
			TestObject balamt60 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_60.00')
			TestObject balamt70 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_70.00')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject takefee5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamt5=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_takeAmount')
			TestObject fundsacquistion1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition1')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(fundsacquistion, 0)){
				WebUI.mouseOver(selectAcct_identification)
				WebUI.click(fundsacquistion)
			}
			else {
				WebUI.mouseOver(selectAcct_identification)
				WebUI.click(fundsacquistion1)
			}
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.verifyElementPresent(balance, 0)
			WebUI.verifyElementPresent(balamt70, 0)
			WebUI.verifyElementPresent(takefee5, 0)
			WebUI.verifyElementPresent(takeamt5, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(feeamt)
			WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
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
	def Fundsaccounttentries1() {
		try {
			TestObject creditgl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit GL')
			TestObject creditfeegl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit Processing Fee GL')
			TestObject debitacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account')
			TestObject debitfeeacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account for Processing Fee')
			TestObject amt95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/td_95.00')
			TestObject amt5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_5.00')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			WebUI.verifyElementPresent(creditgl, 0)
			WebUI.verifyElementPresent(creditfeegl, 0)
			WebUI.verifyElementPresent(debitacct, 0)
			WebUI.verifyElementPresent(debitfeeacct, 0)
			WebUI.verifyElementPresent(amt5, 0)

			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("fundsaccountentries step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def amtentries1() {
		try {
			TestObject entries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Entries - Amount')
			TestObject detail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Detail')
			TestObject acctentries =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Accounting Entries')
			TestObject entriesbook =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/enteriesbook')
			TestObject fundsacqu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_Funds Acquisition')
			TestObject credit =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_Credit')
			TestObject crditgl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_Credit GL')
			TestObject debitgl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_Debit')
			TestObject debitacctclient =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_Debit Client Account')
			TestObject amt95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_95.00')
			TestObject amt5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_5.00')
			WebUI.click(entriesbook)
			WebUI.verifyElementPresent(fundsacqu, 0)
			WebUI.click(detail)
			WebUI.verifyElementPresent(credit, 0)
			WebUI.verifyElementPresent(crditgl, 0)
			WebUI.verifyElementPresent(debitgl, 0)
			WebUI.verifyElementPresent(debitacctclient, 0)
			WebUI.verifyElementPresent(amt5, 0)
		}catch(StepFailedException  e) {
			log.logFailed("amtenteries step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
