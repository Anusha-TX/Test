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

public class AccountEntries {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def Fundsaccounttentries() {
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
			WebUI.verifyElementPresent(amt95, 0)
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
	def noFundsaccounttentries() {
		try {
			TestObject creditgl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit GL')
			TestObject creditfeegl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit Processing Fee GL')
			TestObject debitacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account')
			TestObject debitfeeacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account for Processing Fee')
			TestObject amt95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/td_95.00')
			TestObject amt5 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_5.00')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			WebUI.verifyElementNotPresent(creditgl, 0)
			WebUI.verifyElementNotPresent(creditfeegl, 0)
			WebUI.verifyElementNotPresent(debitacct, 0)
			WebUI.verifyElementNotPresent(debitfeeacct, 0)
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
	def amtentries() {
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
			WebUI.verifyElementPresent(amt95, 0)
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
	@Keyword
	def amtentries2() {
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
			TestObject amt2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/div_2.00')
			WebUI.click(entriesbook)
			WebUI.verifyElementPresent(fundsacqu, 0)
			WebUI.click(detail)
			WebUI.scrollToElement(debitacctclient, 0)
			WebUI.verifyElementPresent(credit, 0)
			WebUI.verifyElementPresent(crditgl, 0)
			WebUI.verifyElementPresent(debitgl, 0)
			WebUI.verifyElementPresent(debitacctclient, 0)
			WebUI.verifyElementPresent(amt2, 0)
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
	@Keyword
	def auditaction() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject userperformfFQ=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/td_User Performed Funds Acquisition')
			TestObject userperformfFQSymbl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/i_User Performed Funds Acquisition')
			TestObject charged2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Case Processor/td_Charged 2.00')
			WebUI.click(audit)
			WebUI.delay(5)
			//WebUI.verifyElementPresent(userperformfFQ, 0)
			//WebUI.verifyElementPresent(userperformfFQSymbl, 0)
			//WebUI.verifyElementPresent(charged2, 0)
			WebUI.click(createaudit)
		}catch(StepFailedException  e) {
			log.logFailed("auditaction step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def Fundsaccounttentries2() {
		try {
			TestObject creditgl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit GL')
			TestObject creditfeegl =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Credit Processing Fee GL')
			TestObject debitacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account')
			TestObject debitfeeacct =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_Debit Client Account for Processing Fee')
			TestObject amt95 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/td_95.00')
			TestObject amt2 =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisitions/div_2.00')
			TestObject save =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/button_Save')
			WebUI.verifyElementPresent(creditgl, 0)
			WebUI.verifyElementPresent(creditfeegl, 0)
			WebUI.verifyElementPresent(debitacct, 0)
			WebUI.verifyElementPresent(debitfeeacct, 0)
			WebUI.verifyElementPresent(amt2, 0)

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
}
