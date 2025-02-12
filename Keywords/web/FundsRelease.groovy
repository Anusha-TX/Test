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

public class FundsRelease {

	KeywordLogger log =new KeywordLogger()
	@Keyword
	def jurisdictionsFL(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_Garnishment')
			TestObject fl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/button_FL')
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
}
