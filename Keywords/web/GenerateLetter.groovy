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


public class GenerateLetter {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def generateLetter() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
			TestObject mycase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_My Cases')
			TestObject caseid = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_caseid')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject generateletter2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter2')
			WebUI.click(mycase)
			WebUI.click(atm)
			WebUI.click(caseid)
			WebUI.rightClick(timelinesearch)
			WebUI.click(generateletter)

			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("GenerateLetter step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def generateLetter1() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject caseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_FirstCaseId')
			TestObject flagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Flag Case')
			TestObject selectflagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Select a Flag')
			TestObject selectgreenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Green Flag')
			TestObject sendbutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Send')
			TestObject greenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/icongreenflag')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject generateletter2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter2')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			GlobalVariable.globalMediumDelay

			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			GlobalVariable.globalMediumDelay
			if(WebUI.verifyElementPresent(generateletter2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(generateletter2)
			}
			else {
				WebUI.click(generateletter)
			}
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("generateletter step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generatelettermail() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def generateletterfax() {
		try {
			TestObject fax =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Fax')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			//TestObject senttokenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/faxkenny')
			TestObject senttokenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			WebUI.switchToWindowIndex(2)
			WebUI.click(fax)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generateletterfax contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def generateletteremail() {
		try {
			TestObject email =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Email')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttokenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_(Assigned User) Kenneth Hillyard')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			WebUI.switchToWindowIndex(2)
			WebUI.click(email)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generateletteremail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def generateletteraudit() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_User Performed Generate Letter_Audit')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject PDF =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Provisional Credit')
			TestObject attachment =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Attachments  1')
			WebUI.click(audit)
			//WebUI.scrollToElement(mail, 0)
			//WebUI.delay(5)
			//WebUI.click(mail)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
			//WebUI.scrollToElement(attachment, 0)
			WebUI.click(attachment)
			GlobalVariable.globalMediumDelay
			WebUI.verifyElementPresent(PDF, 0)
		}catch(StepFailedException  e) {
			log.logFailed("generateletter step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generatelettermailfaxrequiredfields() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject fax =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Fax')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			WebUI.switchToWindowIndex(2)
			WebUI.click(fax)
			WebUI.verifyElementPresent(sendto, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(selecttemplate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(selectbodytemplate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementNotClickable(savebutton)
			WebUI.click(mail)
			WebUI.verifyElementPresent(sendto, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(selecttemplate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(selectbodytemplate, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generatelettermailpdf() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject print =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attachments_print')
			TestObject attachement =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attachments_tags-standard')
			TestObject attachementoption1 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/li_Provisional Credit')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject generateletter2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter2')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(generateletter2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(generateletter2)
			}
			else {
				WebUI.click(generateletter)
			}
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(attachement)
			WebUI.click(attachementoption1)
			WebUI.click(print)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generateHidefromCase() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectanybodytemplate')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject attachement =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attachments_tags-standard')
			TestObject hidefromcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attach_hideOnWeb')
			TestObject attachletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/li_Provisional Credit')
			TestObject attachmentview =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Attachments  1')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject generateletter2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter2')
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(generateletter2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(generateletter2)
			}
			else {
				WebUI.click(generateletter)
			}
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(attachement)
			WebUI.click(attachletter)
			WebUI.click(hidefromcase)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(attachmentview)
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generateletterRequestordebtor() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject debtor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Debtor')
			TestObject requestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor')
			TestObject newrequestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/span_Add New Requestor')
			TestObject inputrequestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/input_Name')
			TestObject newdeptor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/div_Add New Debtor')
			TestObject inputdebtor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/input_Name_name')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/button_Save')
			TestObject select_activedue= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/activedue')
			TestObject johny= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/Johny')
			TestObject cancel =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/button_Cancel')
			TestObject requestor2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor2')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject debtor2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Debtor2')
			GlobalVariable.globalMediumDelay

			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(requestor2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(requestor2)
			}
			else {
				WebUI.click(requestor)
			}
			WebUI.switchToWindowIndex(2)
			WebUI.click(newrequestor)
			WebUI.setText(inputrequestor,'Johny')
			WebUI.click(save)
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			if(WebUI.verifyElementPresent(debtor2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(debtor2)
			}
			else {
				WebUI.click(debtor)
			}
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			WebUI.click(newdeptor)
			WebUI.setText(inputdebtor,'Jonu')
			WebUI.click(save)
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowTitle('Case Processor')
			GlobalVariable.globalMediumDelay
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			WebUI.mouseOver(requestor)
			WebUI.click(generateletter)
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generatelettermaildownload() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject selecttemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_Select a template')
			TestObject selectcovertemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_anycovertemplate')
			TestObject selectbodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/select_bodytemplate')
			TestObject senttojohn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_John Doe - XXXX0001')
			TestObject selectanybodytemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/selectbodytemplated')
			TestObject savebutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/button_Save')
			TestObject print =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attachments_print')
			TestObject attachement =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Attachments_tags-standard')
			TestObject attachementoption1 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/li_Provisional Credit')
			TestObject kenny =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/div_kenny')
			TestObject upload =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/upload')
			TestObject download =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/download')
			WebUI.switchToWindowIndex(2)
			WebUI.click(mail)
			WebUI.click(sendto)
			WebUI.click(kenny)
			WebUI.click(selecttemplate)
			WebUI.click(selectcovertemplate)
			WebUI.click(selectbodytemplate)
			WebUI.click(selectanybodytemplate)
			WebUI.click(attachement)
			WebUI.click(download)
			WebUI.verifyElementPresent(upload, 0, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(savebutton)
			WebUI.switchToWindowTitle('Case Processor')
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def letterattachment() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_User Performed Generate Letter_Audit')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject PDF =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Provisional Credit')
			TestObject attachment =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Attachments  1')
			WebUI.scrollToElement(attachment, 0)
			WebUI.click(attachment)
			GlobalVariable.globalMediumDelay
			WebUI.verifyElementPresent(PDF, 0)
		}catch(StepFailedException  e) {
			log.logFailed("generateletter step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def generateletterRequestor() {
		try {
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_mail')
			TestObject sendto =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/input_Send To')
			TestObject timelinesearch =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/i_Timeline_fas fa-search')
			TestObject atm = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Process/span_ATM')
			TestObject generateletter =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Generate Letter')
			TestObject debtor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Debtor')
			TestObject requestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor')
			TestObject requestor2 =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Requestor2')
			TestObject newrequestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/span_Add New Requestor')
			TestObject inputrequestor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Requestor/input_Name')
			TestObject newdeptor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/div_Add New Debtor')
			TestObject inputdebtor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/input_Name_name')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/button_Save')
			TestObject select_activedue= findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Funds Acquisition/activedue')
			TestObject johny= findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate Letter/Johny')
			TestObject cancel =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Debtor/button_Cancel')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)

			if(WebUI.verifyElementPresent(requestor2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(requestor2)
			}
			else {
				WebUI.click(requestor)
			}

			WebUI.switchToWindowIndex(2)
			WebUI.click(newrequestor)
			WebUI.setText(inputrequestor,'Johny')
			WebUI.click(save)
		}catch(StepFailedException  e) {
			log.logFailed("generatelettermail contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


