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

public class SpecialInstructionsFunds {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def jurisdictionsSPL(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject de =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/DE')
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
			TestObject specialInstructions =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/input_SpecialInstructions')
			TestObject physicaladdress =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/physicaladdress')
			TestObject radiobtnphy =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/radiobtnphys')
			WebUI.click(garnishment)
			WebUI.click(de)

			String isCheckedphy=WebUI.getAttribute(radiobtnphy, 'checked')
			if(isCheckedphy==null||isCheckedphy=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(physicaladdress)
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
			WebUI.setText(feeAmount,'200')
			WebUI.clearText(maxFees)
			WebUI.setText(maxFees,'000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'000')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.clearText(minAccountBalance)
			WebUI.setText(minAccountBalance,'0000')
			String isChecked2=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked2==null||isChecked2=='false') {
				println('radio btn is unchecked')
			}else {
				println('radio btn is checked')
				WebUI.click(minbalanceacrossProfile)
			}
			WebUI.scrollToElement(workflow, 0)
			WebUI.clearText(multipler)
			WebUI.setText(multipler,'2')
			WebUI.setText(specialInstructions,'SPL')
			WebUI.click(save)
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
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/selectDE')
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
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition')
			TestObject takeamt200 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_200_takeAmount')
			TestObject select_activedue= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/activedue')
			TestObject specialinstr= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Specialinstructions')
			TestObject acknowledgeSPL=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AcknowledgeSPL')
			TestObject restrictedacctcheckbox =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/restrictedCheckbox')
			TestObject spftext=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/SPFfunds')
			TestObject spfamt=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/SDFAmt')
			TestObject exemption=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Exemption')
			TestObject caseId=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/NewcaseID')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			TestObject fundsacquistion1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/span_Funds Acquisition1')
			WebUI.switchToWindowTitle('Case Processor')
			//WebUI.click(select_activedue)
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(fundsacquistion, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.mouseOver(selectAcct_identification)
				WebUI.click(fundsacquistion)
			}
			else {
				WebUI.mouseOver(selectAcct_identification)
				WebUI.click(fundsacquistion1)
			}

			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(specialinstr, 0)
			WebUI.click(acknowledgeSPL)
			WebUI.verifyElementPresent(spftext, 0)
			WebUI.verifyElementPresent(spfamt, 0)
			WebUI.verifyElementPresent(exemption, 0)
			WebUI.scrollToElement(restrictedacctcheckbox, 0)
			WebUI.verifyElementChecked(restrictedacctcheckbox, 0)
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
}
