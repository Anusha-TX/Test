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

public class LegalCaseEntry {
	KeywordLogger log =new KeywordLogger()
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
			TestObject selectanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/select_Select an answer')
			TestObject selectanyanswer =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/selectanydrop')
			TestObject documentserved =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Date Served')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			WebUI.click(newclaim)
			WebUI.click(garnishment)
			WebUI.click(next)
			WebUI.click(tripsmenu)
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
	def legalCaseEntrydate1(String date1) {
		try {
			TestObject selectfirstcase =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/ResumeCase')
			TestObject documentdate =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Document Date')
			WebUI.click(selectfirstcase)
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
	def legalCaseEntrydate2(String date2, String judgeamt,String caseno) {
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
			WebUI.setText(releasedate,'12122024')
			WebUI.click(next)
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
	def legalCaseEntryquestionare() {
		try {
			TestObject homephone =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Best Phone Number_preferredPhone')
			TestObject inputphoneno =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/input_Phone_form-control')
			TestObject submit =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_Submit')
			TestObject casecreatedsuccess =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/h3_Case Created Successfully')
			TestObject titlecaseentry =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/div_Case Entry')
			TestObject btnnewclaim =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_New Claim (1)')
			TestObject caseid =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Entry/button_CaseEntryid')
			WebUI.scrollToElement(homephone, 0)
			WebUI.click(homephone)
			WebUI.click(inputphoneno)
			Random random=new Random()
			String randomphonenumber="9"+(random.nextInt(900000000)+100000000)
			WebUI.setText(inputphoneno,randomphonenumber)
			WebUI.click(submit)
			WebUI.verifyElementPresent(casecreatedsuccess, 0)
			WebUI.verifyElementPresent(titlecaseentry, 0)
			WebUI.verifyElementPresent(btnnewclaim, 0)
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
}
