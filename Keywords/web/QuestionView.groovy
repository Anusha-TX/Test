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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import org.apache.commons.lang.RandomStringUtils
import java.util.Random

public class QuestionView {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def questionview() {
		try {
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject contact =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_contact')
			TestObject personcontact =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.click(mycase)
			WebUI.click(atm)
			WebUI.click(caseid)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("QuestionView step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def questionview1() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			WebUI.click(homesearch)
			GlobalVariable.globalMediumDelay
			WebUI.click(homesearchbtn)
			GlobalVariable.globalMediumDelay
			WebUI.doubleClick(firstcaseID)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("QuestionView step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def viewquestions() {
		try {
			TestObject questionview = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Questions')
			TestObject questionview1 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_1 - 071524 Deposit 50.00  Deposit')
			TestObject questionview2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Open Case Questionnaire')
			TestObject element =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/label_What is the date of the correct transaction')
			WebUI.click(questionview)
			WebUI.click(questionview1)
			WebUI.click(questionview2)
		}catch(StepFailedException  e) {
			log.logFailed("QuestionView step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def viewAssociated() {
		try {
			TestObject associatedview = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Associated Cases 2')
			TestObject catatory =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Categoryarrow_downward')
			TestObject caseid =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Categoryarrow_downward')
			TestObject groupby =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Grouped By')
			WebUI.click(associatedview)
			WebUI.verifyElementPresent(groupby,0)
			WebUI.click(catatory)
			WebUI.verifyElementPresent(caseid,0)
		}catch(StepFailedException  e) {
			log.logFailed("AssoicatedView step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
