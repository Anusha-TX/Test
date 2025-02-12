
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


public class LegalFundsAcquistion {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def jurisdictionsFL(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject actidentification =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/Actidentification')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			TestObject workflow =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Workflow')
			TestObject multipler =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Multiplier_value')

			WebUI.click(garnishment)
			WebUI.click(fl)
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
			WebUI.setText(feeAmount,'500')
			WebUI.clearText(maxFees)
			WebUI.setText(maxFees,'30000')
			WebUI.clearText(minFees)
			WebUI.setText(minFees,'200')
			WebUI.clearText(balancethreshold)
			WebUI.setText(balancethreshold,balThreshold)
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
	def jurisdictionsFL1(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
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
			WebUI.setText(maxFees,'30000')
			WebUI.setText(minFees,'200')
			WebUI.setText(balancethreshold,balThreshold)
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
	def jurisdictionsFL3(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
			//WebUI.click(allowFees)
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

			WebUI.setText(feeAmount,'0000')
			WebUI.setText(maxFees,'200')
			WebUI.setText(minFees,'0000')
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.setText(minAccountBalance,'0000')
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
	def jurisdictionsFL4(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
			//WebUI.click(allowFees)
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

			WebUI.setText(feeAmount,'0000')
			WebUI.setText(maxFees,'200')
			WebUI.setText(minFees,'200')
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.setText(minAccountBalance,'0000')
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
	def jurisdictionsFL5(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
			//WebUI.click(allowFees)
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

			WebUI.setText(feeAmount,'0000')
			WebUI.setText(maxFees,'200')
			WebUI.setText(minFees,'200')
			WebUI.setText(balancethreshold,balThreshold)
			WebUI.setText(minAccountBalance,'0000')
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
	def jurisdictionsFL2(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
			//WebUI.click(allowFees)
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
	def jurisdictionsFL6(String feeAmt,String maxFee,String minFee,String balThreshold,String MinactBal) {
		try {
			TestObject garnishment = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Garnishment (1)')
			TestObject fl =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_FL')
			TestObject tripsmenu =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject delete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject confirmDelete = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Delete')
			TestObject childSupport = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Child Support')
			TestObject newJurisdiction = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/a_New Jurisdiction')
			TestObject enterJurisdictionName = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Jurisdiction_jurisdiction')
			TestObject save = findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/button_Save (1)')
			TestObject usebranch =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Use Branch Address')
			TestObject allowFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Allow Fees Regardless of Negative Balance')
			TestObject takefeeLast =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Take Fee Last')
			TestObject feeAmount =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Fee Amount_Fee Amount')
			TestObject maxFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Maximum Fee_Maximum Fee')
			TestObject minFees =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Fee_Minimum Fee')
			TestObject balancethreshold =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Balance Threshold_Balance Threshold')
			TestObject minbalanceacrossProfile =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/div_Minimum Balance Across Profile')
			TestObject minAccountBalance =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/input_Minimum Account Balance')
			TestObject radiobtn1 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn1')
			TestObject radiobtn2 =findTestObject('Web/Legal/Case Processor/Case Processor/Page_Jurisdiction Maintenance/radiobtn2')
			WebUI.click(garnishment)
			WebUI.click(fl)
			//WebUI.click(allowFees)
			String isChecked=WebUI.getAttribute(radiobtn1, 'checked')
			if(isChecked==null||isChecked=='false') {

				println('radio btn is unchecked')
			}else {
				WebUI.click(allowFees)
				println('radio btn is checked')
			}
			String isChecked1=WebUI.getAttribute(radiobtn2, 'checked')
			if(isChecked1==null||isChecked1=='false') {

				println('radio btn is unchecked')
			}else {
				WebUI.click(takefeeLast)
				println('radio btn is checked')
			}

			WebUI.setText(feeAmount,'200')
			WebUI.setText(maxFees,'0000')
			WebUI.setText(minFees,'000')
			WebUI.setText(balancethreshold,'0000')
			WebUI.setText(minAccountBalance,'0000')
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
	def navigatetolegalCaseEntry() {
		try {
			TestObject Legal = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/svg_Legal_bi bi-chevron-down')
			WebUI.click(Legal)
			TestObject Process = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/div_Processes')
			WebUI.click(Process)
			TestObject CaseEntry = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_TRIPS/case entry')
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
	def legalCaseEntry1(String date1) {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Next')

			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Document Date')

			WebUI.click(newclaim)
			WebUI.click(garnishment)
			WebUI.click(next)
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
	def legalCaseEntrydate1(String date2, String judgeamt,String caseno) {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Next')
			TestObject judgementamt =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Judgement Amount')
			TestObject requesteddoc =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Requested Docs')
			TestObject dropdown =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Drop files here')
			TestObject casenumber =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Case Number')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Document Date')
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Date Served_Question_20_undefined')
			TestObject caseid =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_CaseEntryid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/i_Timeline_fas fa-search')
			TestObject selectAcct_identification =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/span_Account Identification Action (1)')
			WebUI.setText(documentserved,'12112024')
			WebUI.setText(judgementamt,judgeamt)
			WebUI.click(selectanswer)
			WebUI.click(selectanyanswer)
			WebUI.setText(casenumber,caseno)
			WebUI.sendKeys(dropdown, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			WebUI.click(requesteddoc)
			WebUI.click(next)
			WebUI.doubleClick(caseid)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.delay(5)
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
	def navigatetolegalCaseProcesser() {
		try {
			TestObject Legal = findTestObject('Object Repository/Web/Legal/Maintain/Processes/Page_TRIPS/svg_Legal_bi bi-chevron-down')
			WebUI.click(Legal)
			TestObject Process = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Process')
			WebUI.click(Process)
			TestObject CaseProcesser = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Case Processor')
			WebUI.click(CaseProcesser)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate CaseProcesser step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def legalCaseProcesser(String bankid,String acctno,String actbal) {
		try {
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject selectAcct_identification =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/span_Account Identification Action (1)')
			TestObject enter_bankId =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/input_Bank_bankID')
			TestObject enter_acctNum =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/input_Account_account')
			TestObject search_btn =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/svg_Jurisdiction_bi bi-plus-circle')
			TestObject select_acc =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/div_Select (1)')
			TestObject select_dda =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/span_DDA')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/button_Save')
			TestObject actbalance =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/input_Available Balance_currentBalance')
			TestObject nameaddress =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/textarea_Name and Street Address_address')
			TestObject save1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/save1')
			TestObject actidentficationsymbol =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/i_Timeline_fas fa-universal-access')
			WebUI.rightClick(timelinesearch)
			WebUI.click(selectAcct_identification)
			WebUI.switchToWindowIndex(1)
			WebUI.click(search_btn)
			WebUI.setText(enter_bankId,bankid)
			WebUI.setText(enter_acctNum,acctno)
			WebUI.click(nameaddress)
			WebUI.click(select_acc)
			WebUI.click(select_dda)
			WebUI.setText(actbalance,actbal)
			WebUI.delay(5)
			WebUI.click(save)
			WebUI.click(save1)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(actidentficationsymbol)
		}catch(StepFailedException  e) {
			log.logFailed("CaseProcesser step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def legalActIdentificationview() {
		try {
			TestObject dda =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/td_DDA')
			TestObject close =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Account Identification Action/button_Close')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			WebUI.switchToWindowIndex(1)
			WebUI.verifyElementPresent(dda, 0)
			WebUI.click(close)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(timelinesearch)
			WebUI.click(fundsacquistion)
		}catch(StepFailedException  e) {
			log.logFailed("LegalActIdentificationview step failed" +e.getMessage())
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject takeamt200 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_200_takeAmount')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.verifyElementPresent(balance, 0)
			WebUI.verifyElementPresent(balamt, 0)
			WebUI.verifyElementPresent(feeamount, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdamt)
			WebUI.click(feeamt)
			WebUI.click(selectfeeamt)
			def value=WebUI.getText(takeamt200)
			WebUI.verifyEqual(value.toInteger(), 200)
			WebUI.setText(feeamtt,'200')
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
	def legalJurisdictionview() {
		try {

			TestObject feeamt =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_Fee Amount_Fee Amount')
			TestObject maxfee =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_Maximum Fee_Maximum Fee')
			TestObject minfee =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_Minimum Fee_Minimum Fee')
			TestObject orderfl =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/input_Order Jurisdiction_jurisdiction')
			WebUI.verifyElementPresent(orderfl, 0)
			WebUI.verifyElementPresent(feeamt, 0)
			WebUI.verifyElementPresent(maxfee, 0)
			WebUI.verifyElementPresent(minfee, 0)
		}catch(StepFailedException  e) {
			log.logFailed("legalJurisdictionview step failed" +e.getMessage())
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
			TestObject jurisdictionView = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/jurisdiction_FL_view')
			TestObject allowFeesRegardlessOfNegativeBalance = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/allow_fees_regardless_of_negative_balance')
			TestObject takeFeeLast = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/take_fee_last')
			TestObject feeAmount = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/input_fee_amount')
			TestObject minimumFee=findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/input_minimum_fee')
			TestObject maximumFee = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/input_maximum_fee')
			TestObject enterMinimumAccountBalance = findTestObject('Object Repository/Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_CaseProcessor/input_minimum_account_balance')

			WebUI.click(jurisdictionView)
			WebUI.verifyElementPresent(allowFeesRegardlessOfNegativeBalance, 10, FailureHandling.STOP_ON_FAILURE)
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
			TestObject timelinesearch=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Timeline_Action')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/Page_Case Processor/span_Account Identification Action')
			TestObject search_btn= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary')
			TestObject enter_bankId= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Bank_bankID')
			TestObject enter_acctNum = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Account_account')
			TestObject select_acc = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/div_Select')
			TestObject selectaccount_type=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/span_DDA')
			TestObject fee_type= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/input_Available Balance_currentBalance')
			TestObject save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject acct_input= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/input_Account_account_1')
			TestObject search_btn1= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/search_Jurisdiction')
			TestObject select_search= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Jurisdiction_btn btn-primary_1')
			TestObject select_jurisdiction= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/select_jurisdiction_type')
			TestObject case_accounts = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/path')
			TestObject set_jursidiction=findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/svg_Tax ID_bi bi-chevron-down')
			TestObject btn_Save= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/button_Save')
			TestObject homesearch = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/svg_Homesearch')






			WebUI.rightClick(timelinesearch)
			WebUI.click(selectAcct_identification)
			WebUI.switchToWindowIndex(1)
			WebUI.click(search_btn)
			WebUI.setText(enter_bankId,bankid)
			WebUI.setText(enter_acctNum,acctno)
			WebUI.click(fee_type)
			WebUI.click(select_acc)
			WebUI.click(selectaccount_type)
			WebUI.setText(acct_input,actbal)
			WebUI.delay(5)
			WebUI.click(save)
			WebUI.click(btn_Save)
			WebUI.switchToWindowTitle('Case Processor')
			W
		}catch(StepFailedException  e) {
			log.logFailed("Open Florida Jurisdictions Account Identification step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw  e
		}
	}
	@Keyword
	def legalfundsacquisitionview1() {
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

			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamount95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_95_takeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.verifyElementPresent(balance, 0)
			WebUI.verifyElementPresent(balamt, 0)
			WebUI.verifyElementPresent(feeamount5, 0)
			WebUI.verifyElementPresent(takeamount95, 0)
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
	def legalfundsacquisitionview2() {
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamount95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_95_takeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject takefee0 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_takeAmount')
			TestObject balamt60 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_60.00')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.verifyElementPresent(balance, 0)
			WebUI.verifyElementPresent(balamt60, 0)
			WebUI.verifyElementPresent(feeamtt, 0)
			WebUI.verifyElementPresent(takefee0, 0)
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
	def legalfundsacquisitionview3() {
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamount95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_95_takeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject takefee0 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_takeAmount')
			TestObject balamt60 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_60.00')
			TestObject balamt70 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_70.00')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject takefee5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_feeAmount')
			TestObject takeamt5=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_5_takeAmount')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
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
	def legalfundsacquisitionview4() {
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdamt)
			WebUI.click(feeamt)
			WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
			WebUI.setText(fundfeeamount,'210')
			WebUI.verifyElementText(errormessage,'Fees charged are greater than the maximum threshold of $2.00 for the jurisdiction: FL')
			WebUI.verifyElementNotClickable(save)
			WebUI.clearText(fundfeeamount)
			WebUI.setText(fundfeeamount,'200')
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
	def legalfundsacquisitionview5() {
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage1 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage1')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdamt)
			WebUI.click(feeamt)
			WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
			WebUI.setText(fundfeeamount,'199')
			WebUI.verifyElementText(errormessage1,'Fees charged are less than the minimum threshold of $2.00 for the jurisdiction: FL')
			WebUI.verifyElementNotClickable(save)
			WebUI.clearText(fundfeeamount)
			WebUI.setText(fundfeeamount,'200')
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
	def legalfundsacquisitionview6() {
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
			TestObject jurisdiction =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/td_160.00')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/input_0.00_feeAmount')
			TestObject errormessage2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/errormessage2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject fundsacquistion =findTestObject('Web/Legal/Case Processor/FundsAcquistionJurisdiction/Page_Jurisdiction_Maintenance/span_Funds Acquisition')
			TestObject fundfeeamount =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/Feeamtt')
			TestObject accountentries =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/AccountEntries')
			TestObject selectAcct_identification= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/span_Account Identification Action')
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(selectAcct_identification)
			WebUI.click(fundsacquistion)
			WebUI.switchToWindowIndex(2)
			WebUI.verifyElementPresent(acttype, 0)
			WebUI.verifyElementPresent(backid, 0)
			WebUI.click(takeamt)
			WebUI.click(selecttakeamt)
			WebUI.click(holdamt)
			WebUI.click(selectholdamt)
			WebUI.click(feeamt)
			WebUI.click(selectfeeamt)
			WebUI.click(accountentries)
			WebUI.setText(fundfeeamount,'300')
			WebUI.verifyElementText(errormessage2,'Fees are being taken without a minimum or maximum threshold configured for the jurisdiction. Valid fee amounts $0 and $2.00 for the jurisdiction: FL')
			WebUI.verifyElementNotClickable(save)
			WebUI.clearText(fundfeeamount)
			WebUI.setText(fundfeeamount,'000')
			//WebUI.verifyElementNotVisible(errormessage2)
			WebUI.verifyElementClickable(save)
			WebUI.clearText(fundfeeamount)
			WebUI.setText(fundfeeamount,'200')
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
	def legalCaseEntrynew() {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Next')
			TestObject judgementamt =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Judgement Amount')
			TestObject requesteddoc =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Requested Docs')
			TestObject dropdown =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Drop files here')
			TestObject casenumber =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Case Number')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Document Date')
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Date Served_Question_20_undefined')
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
	def legalCaseEntrydatenew() {
		try {
			TestObject newclaim = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_New Claim')
			TestObject garnishment = findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Garnishment')
			TestObject next =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Next')
			TestObject judgementamt =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Judgement Amount')
			TestObject requesteddoc =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Requested Docs')
			TestObject dropdown =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/div_Drop files here')
			TestObject casenumber =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Case Number')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Document Date')
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/input_Date Served_Question_20_undefined')
			TestObject caseid =findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_Case Entry/button_CaseEntryid')
			TestObject Fund_releaseQuestion=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Entry/input_FundsReleasedate')
			WebUI.setText(documentserved,'12112024')
			WebUI.setText(judgementamt,'10000')
			WebUI.click(selectanswer)
			WebUI.click(selectanyanswer)
			WebUI.setText(casenumber,'110')
			//WebUI.click(dropdown)
			//WebUI.switchToWindowIndex(1)
			//WebUI.sendKeys(dropdown, RunConfiguration.getProjectDir() +'\\UploadFile\\Dispute.pdf')
			WebUI.sendKeys(dropdown, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			//WebUI.switchToWindowIndex(0)
			WebUI.click(requesteddoc)
			WebUI.setText(Fund_releaseQuestion,'19112024')
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
	def legalfundsacquisitionEntriesVerify() {
		try {


			TestObject select_case= findTestObject('Object Repository/Web/Legal/Process/Case Processor/Page_AccountIdentification_Action/Page_Case Processor/div_CAse')
			TestObject acttype =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/div_AccountType')
			TestObject backid =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/div_BankID')
			TestObject balance =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/span_Balance')
			TestObject takeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/select_takeamt')
			TestObject selecttakeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/selectanttakeamt')
			TestObject holdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/holdamt')
			TestObject feeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/feeamt')
			TestObject selectfeeamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/selectfeesmt')
			TestObject selectholdamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/selectholdamt')
			TestObject feeamtt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/input_0.00_feeAmount')
			TestObject save =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/button_Save')
			TestObject jurisdiction =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/FundsAcqJ_srepos/Page_Funds Acquisition/span_Jurisdiction FL')
			TestObject balamt =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/td_70_verify')
			TestObject feeamount =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/input_0.00_feeAmount')
			TestObject errormessage =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/div_Fees')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/FundsAcqJ_srepos/Page_Funds Acquisition/select_acct')
			TestObject fundsacquistion =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/FundsAcqJ_srepos/Page_Funds Acquisition/span_Funds Acquisition')
			TestObject accountIdentification =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/Debtor/span_Account Identification Action')
			TestObject takeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/takeAmount_selecttemplate')
			TestObject feeamount_selecttemplate =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/feeAmount_selecttemplate')
			TestObject accountingentries =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/span_Accounting Entries')
			TestObject debitentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/div_Debit')
			TestObject creditentry =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/div_Credit')
			TestObject takeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/takeAmountvalue')
			TestObject feeamountvalue =findTestObject('Object Repository/Web/Legal/Maintain/Processes/FundsAcqJ_srepos/feeAmountvalue')
			TestObject caseId_cp =findTestObject('Object Repository/Web/Legal/Maintain/Processes/Actions/doubleclick_caseID')



			WebUI.doubleClick(select_case)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(accountIdentification)
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
			WebUI.verifyElementPresent(creditentry, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
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