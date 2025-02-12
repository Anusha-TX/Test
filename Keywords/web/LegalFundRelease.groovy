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

public class LegalFundRelease {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def legalfundsacquisitionviewhold() {
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
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject fundsacquistion1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition1')
			TestObject Balfundamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Bal3505')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)

			if(WebUI.verifyElementPresent(fundsacquistion,  GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
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
			WebUI.verifyElementPresent(Balfundamt, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdamt)
			//WebUI.click(feeamt)
			//WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
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
	def legalfundsacquisitionviewnohold() {
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
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject fundsacquistion1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition1')
			TestObject Balfundamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Bal3505')
			TestObject selectholdd =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectholdamtnohold')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(fundsacquistion,  GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
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
			WebUI.verifyElementPresent(Balfundamt, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdd)
			//WebUI.click(feeamt)
			//WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
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
	def legalfundsreleaseviewhold() {
		try {
			TestObject acttype =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/span_Balance')

			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectFundrelease')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectfeerelease')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsrelease =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Release')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject releasefee =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_fee')
			TestObject releasehold =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_Holdamt')
			TestObject releaseamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_releaseamt')
			TestObject accounttemplates =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/select_fundsreleaseaccttemp')
			TestObject selectaccounttemplates =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectfundsreleaseact')
			TestObject releaseholdcheckbox =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Releaseholdcheckbox')
			TestObject amt3000hold =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_3000')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsrelease)
			WebUI.switchToWindowIndex(2)
			WebUI.click(accounttemplates)
			WebUI.click(selectaccounttemplates)
			WebUI.verifyElementPresent(releaseholdcheckbox, 0)
			//WebUI.verifyElementPresent(amt3000hold, 0)
			WebUI.verifyElementPresent(releasefee, 0)
			WebUI.verifyElementPresent(releasehold, 0)
			WebUI.verifyElementPresent(releaseamt, 0)
			WebUI.click(accountentries)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
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
	def legalfundsreleaseviewnoHold() {
		try {
			TestObject acttype =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/span_Balance')

			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectFundrelease')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectfeerelease')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsrelease =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Release')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject releasefee =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_fee')
			TestObject releasehold =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_Holdamt')
			TestObject releaseamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/release_releaseamt')
			TestObject accounttemplates =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/select_fundsreleaseaccttemp')
			TestObject selectaccounttemplates =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/selectfundsreleaseact')
			TestObject zerohold =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_noholdzero')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsrelease)
			WebUI.switchToWindowIndex(2)
			WebUI.click(accounttemplates)
			WebUI.click(selectaccounttemplates)
			WebUI.verifyElementPresent(zerohold, 0)
			WebUI.verifyElementPresent(releasefee, 0)
			WebUI.verifyElementPresent(releasehold, 0)
			WebUI.verifyElementPresent(releaseamt, 0)
			WebUI.click(accountentries)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
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
	def jurisdictionsLA(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject la =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_LA')
			TestObject actidentification =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/Actidentification')
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
			TestObject workflow =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_Workflow')
			TestObject multipler =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/input_Multiplier_value')
			TestObject radiobtn3 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtn3')
			TestObject useBranchrdobtn =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtnusebranch')
			WebUI.click(garnishment)
			WebUI.click(la)
			String isChecked3=WebUI.getAttribute(useBranchrdobtn, 'checked')
			if(isChecked3==null||isChecked3=='false') {

				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(usebranch)
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
			String isChecked2=WebUI.getAttribute(radiobtn3, 'checked')
			if(isChecked2==null||isChecked2=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(minbalanceacrossProfile)
			}
			WebUI.clearText(feeAmount)
			WebUI.setText(feeAmount,'500')
			WebUI.clearText(maxFees)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'6000')

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
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/selectLA')
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
}
