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
public class PhoneCall {

	KeywordLogger log =new KeywordLogger()
	@Keyword
	def phonecall() {
		try {
			TestObject caseprocessor =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Case Processor')
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
			WebUI.rightClick(timelinesearch)
			WebUI.click(phonecall)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def phonecall1() {
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
			TestObject firstcaseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/selectfirstgeneratelettercase')
			TestObject phonecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Phone Call')
			TestObject select_acct=findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_AccountIdentification_Action/select_acct')
			TestObject phonecall2=findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/Phonecall2')
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(select_acct)
			WebUI.rightClick(select_acct)
			GlobalVariable.globalMediumDelay
			if(WebUI.verifyElementPresent(phonecall2, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)){
				WebUI.click(phonecall2)
			}
			else {
				WebUI.click(phonecall)
			}
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("phonecall step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def phonecallcontacts() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject contact =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_contact')
			TestObject personcontact =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/person_contact')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			WebUI.click(contact)
			WebUI.click(personcontact)
			WebUI.click(selectperson)
			WebUI.click(personcontacted)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall contact step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def phonecallcustomers() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject customer =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_customer')
			TestObject personcontact =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			TestObject customername =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/customername')
			GlobalVariable.globalMediumDelay
			WebUI.switchToWindowIndex(2)
			WebUI.click(customer)
			WebUI.scrollToElement(personcontacted, 0)
			WebUI.setText(customername,'kenny')
			WebUI.click(personcontacted)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall customer step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def phonecallmerchant(String personname) {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject merchant =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_merchant')
			TestObject personcontactt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.switchToWindowIndex(2)
			WebUI.click(merchant)
			WebUI.setText(personcontactt,personname)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
			WebUI.click(flag)
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall merchant step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def phonecallassigneduser() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject assigneduser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_assignedUser')
			TestObject personcontactt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.switchToWindowIndex(2)
			WebUI.click(assigneduser)
			WebUI.scrollToElement(personcontacted, 0)
			WebUI.click(personcontacted)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.verifyElementPresent(phone, 0)
			//WebUI.click(phone)
			//WebUI.click(closephnecall)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall assignuser step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def phonecallother(String personname) {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject other =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_other')
			TestObject personcontactt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.switchToWindowIndex(2)
			WebUI.click(other)
			WebUI.setText(personcontactt,personname)
			WebUI.click(saveButton)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall other step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def phonecallopeninguser() {
		try {
			TestObject phonenumber =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/drp_phonenumber')
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject phone =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_User Performed Phone Call_fas fa-phone')
			TestObject selectperson =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_person')
			TestObject openinguser =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/input_openingUser')
			TestObject personcontactt =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/select_persondropdown')
			TestObject saveButton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/button_Save')
			TestObject close =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/audit_close')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject personcontacted =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/svg_Person Contacted')
			TestObject flag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Flag_bi bi-chevron-down')
			TestObject closephnecall =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Phone Call/closephonecall')
			WebUI.switchToWindowIndex(2)
			WebUI.click(openinguser)
			WebUI.click(phonenumber)
			WebUI.clearText(phonenumber)
			Random random=new Random()
			String randomphonenumber="9"+(random.nextInt(900000000)+100000000)
			WebUI.setText(phonenumber,randomphonenumber)
			WebUI.click(personcontacted)
			WebUI.click(saveButton)
			WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(audit)
			WebUI.click(createaudit)
			GlobalVariable.globalMediumDelay
		}catch(StepFailedException  e) {
			log.logFailed("Phonecall opening user step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def navigatetosecuritymaintain() {
		try {
			TestObject trips = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_TRIPS')
			WebUI.click(trips)
			TestObject common = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Common')
			WebUI.click(common)
			TestObject maintain = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Maintain')
			WebUI.click(maintain)
			TestObject securitymaintain = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_TRIPS/div_Security Maintenance')
			WebUI.click(securitymaintain)
		}catch(StepFailedException  e) {
			log.logFailed("Navigateto security step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def securitymaintaintanance() {
		try {
			TestObject securitymaintaintitle = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Security Maintenance/div_Security Maintenance')
			TestObject user =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Security Maintenance/div_Users')
			WebUI.click(user)
			TestObject testingxperts = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Security Maintenance/span_Testing Xperts')
			WebUI.click(testingxperts)
			TestObject phonenumber = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Security Maintenance/input_Phone Number_form-control')
			WebUI.verifyElementPresent(phonenumber, 0)
		}catch(StepFailedException  e) {
			log.logFailed("securitymaintain step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def attachementview() {
		try {
			TestObject createaudit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Create Audit Attachment')
			TestObject mail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_User Performed Generate Letter_Audit')
			TestObject audit =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_audit')
			TestObject phonecallPDF =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/phonecallPDF')
			TestObject attachment =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/span_Attachments  1')
			TestObject detail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/attachement_detail')
			TestObject thumbnail =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/attachement_thumbnail')
			WebUI.refresh()
			WebUI.click(attachment)
			GlobalVariable.globalMediumDelay
			WebUI.scrollToElement(phonecallPDF, 0)
			WebUI.verifyElementPresent(phonecallPDF, 0)
			WebUI.click(phonecallPDF)
			WebUI.switchToWindowIndex(1)
			WebUI.switchToWindowIndex(0)
			//WebUI.switchToWindowTitle('Case Processor')
			WebUI.click(detail)
			WebUI.click(thumbnail)
			WebUI.verifyElementNotPresent(phonecallPDF, 0)
		}catch(StepFailedException  e) {
			log.logFailed("Attachement step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

