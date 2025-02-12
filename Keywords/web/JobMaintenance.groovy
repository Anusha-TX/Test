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
public class JobMaintenance {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoJobSchedules() {
		try {
			TestObject common = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_TRIPS/div_Common')
			WebUI.click(common)
			TestObject maintain = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_TRIPS/div_Maintain')
			WebUI.click(maintain)
			TestObject jobSchedules = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_TRIPS/div_Job Schedules')
			WebUI.click(jobSchedules)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to JobSchedules step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def addJob(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)
		}catch(StepFailedException  e) {
			log.logFailed("Add Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def addJobed(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			WebUI.click(createNew)
			WebUI.setText(namefld,randomName)
			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)
		}catch(StepFailedException  e) {
			log.logFailed("Add Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def deleteJob() {
		try {
			TestObject delete = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Delete')
			WebUI.click(delete)
			WebUI.click(delete)
		}catch(StepFailedException  e) {
			log.logFailed("Delete Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateJob(String editjobname,String editruninterval,String editselectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(3)
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDaystuesday = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Monday_runOnTuesday')
			TestObject runCheckone = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')

			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			WebUI.click(namefld)
			WebUI.clearText(namefld)
			WebUI.setText(namefld,editjobname)
			WebUI.check(runDaystuesday)
			WebUI.check(runDaystuesday)
			WebUI.click(runInterval)
			WebUI.setText(runInterval,editruninterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application,editselectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("Update Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def enabledisableJob() {
		try {
			TestObject disable = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Disable')
			TestObject disabledate = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_DisabledUntilAugust')
			TestObject redAlert = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Job3')
			TestObject disablealert = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Job temporarily disabled')
			TestObject enableAlert = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Job is enabled')
			TestObject enable = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Enable')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			if(WebUI.verifyElementPresent(enable, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)) {
				WebUI.click(enable)
				String enabletoastMessage=WebUI.getText(enableAlert)
				WebUI.verifyMatch(enabletoastMessage, 'Job is enabled', false)
				WebUI.click(disable)
				WebUI.click(disable)
				String disabletoastMessage=WebUI.getText(disablealert)
				WebUI.verifyMatch(disabletoastMessage, 'Job temporarily disabled', false)
			}
			else {
				WebUI.click(disable)
				WebUI.click(disable)
				String disabletoastMessage=WebUI.getText(disablealert)
				WebUI.verifyMatch(disabletoastMessage, 'Job temporarily disabled', false)
				WebUI.click(enable)
				String enabletoastMessage=WebUI.getText(enableAlert)
				WebUI.verifyMatch(enabletoastMessage, 'Job is enabled', false)
			}
		}catch(StepFailedException  e) {
			log.logFailed("Enable/Disable Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def HolidayJob(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject HolidayJob=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Saturday_runOnHolidays')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.check(HolidayJob)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)
		}catch(StepFailedException  e) {
			log.logFailed("Holiday Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def LastDayofMonthJob(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject LastDayofMonthJob=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Holidays_runOnLastDayOfMonth')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)

			WebUI.check(LastDayofMonthJob)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("LastDayofMonth Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def LastBussinessDayofMonthJob(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject LastBussinessDayofMonthJob=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Last Day of Month')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.check(LastBussinessDayofMonthJob)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("LastBussinessDayofMonthJob Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def NextBussinessDayJob(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject holidayJob=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Saturday_runOnHolidays')
			TestObject nextBussinessDay=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Last Business Day of Month')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.check(holidayJob)
			WebUI.check(nextBussinessDay)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("Holiday Job step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def jobWithInterval(String jobname,String runinterval,String selectapplication,String excutionpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject clock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div__MuiPickersClock-squareMask')
			TestObject path=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/path')
			TestObject okButton=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_OK')
			TestObject stopTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Stop Time')
			TestObject startTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Start Time')
			TestObject minClock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Start Time_MuiSvgIcon-root')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject stoptime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/clock_Stoptime')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)

			WebUI.click(path)
			WebUI.click(clock)
			WebUI.click(okButton)
			WebUI.click(stoptime)
			WebUI.click(clock)
			WebUI.click(clock)
			WebUI.delay(10)
			WebUI.click(okButton)

			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("Job Interval step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def jobRunsWithTrigger(String jobname,String runinterval,String selectapplication,String excutionpath,String invalidPath,String validpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject clock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div__MuiPickersClock-squareMask')
			TestObject path=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/path')
			TestObject okButton=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_OK')
			TestObject stopTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Stop Time')
			TestObject startTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Start Time')
			TestObject minClock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Start Time_MuiSvgIcon-root')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			//TestObject excution = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Currency Maintenance/ddl_ExecutionsQA')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			//TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Start Time_MuiSvgIcon-root')
			TestObject excution=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/select_Executions')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject stoptime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/clock_Stoptime')
			TestObject triggerpath=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Trigger Path')
			TestObject validationmsg=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Trigger Path needs to be validated')

			TestObject invalidError=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Invalid is not a valid path')
			TestObject validatelink=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Failed Triggerarrow')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.click(path)
			WebUI.click(clock)
			WebUI.click(okButton)
			WebUI.click(stoptime)
			WebUI.click(clock)
			WebUI.click(clock)
			WebUI.delay(10)
			WebUI.click(okButton)
			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.setText(triggerpath,invalidPath)
			WebUI.waitForElementPresent(invalidError,0)
			WebUI.click(triggerpath)
			WebUI.clearText(triggerpath)
			WebUI.setText(triggerpath,validpath)
			//WebUI.click(validatelink)
			WebUI.click(application)
			WebUI.selectOptionByLabel(application, selectapplication, false)
			WebUI.click(excution)
			WebUI.selectOptionByLabel(excution, excutionpath, false)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.scrollToElement(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)
			WebUI.delay(2)
			WebUI.click(triggerpath)
			WebUI.clearText(triggerpath)
			WebUI.delay(1)
			WebUI.setText(triggerpath," ")
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, 3)
			WebUI.click(history)
		}catch(StepFailedException  e) {
			log.logFailed("JobRunsTrigger step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def jobWithJobDependencies(String jobname,String runinterval,String selectapplication,String excutionpath,String invalidPath,String validpath,String invalidfilePath,String validfilepath,String selectjobsdepend) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject clock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div__MuiPickersClock-squareMask')
			TestObject path=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/path')
			TestObject okButton=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_OK')
			TestObject stopTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Stop Time')
			TestObject startTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Start Time')
			TestObject minClock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Start Time_MuiSvgIcon-root')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			TestObject excution=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/select_Executions')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject stoptime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/clock_Stoptime')
			TestObject triggerpath=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Trigger Path')
			TestObject invalidfilepatherror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Invalidfile is not a valid path')
			TestObject validationmsg=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Trigger Path needs to be validated')
			TestObject invalidError=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Invalid is not a valid path')
			TestObject filedependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_File Dependency_fileDependency')
			TestObject validate_filedependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_FileDependency')
			TestObject validate_filedependencieserror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_File Dependency needs to be validated')
			TestObject deletefiledependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/Deletefiledependencies')
			TestObject validate_jobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Expire')
			TestObject selectjobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/select_JobsExpireActionsE')
			TestObject jobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Job Dependency_jobDependency')
			TestObject deletefilejobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_button')
			TestObject selectlegalapplication=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectlegalapplication')
			TestObject selectjobdencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectjobdependencies')
			TestObject selectexepath=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectexepath')
			TestObject deletfiledependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_File Dependency_bi bi-trash')
			TestObject deletfilejobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Job Dependency_bi bi-trash')
			TestObject tvalidatelink=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Trigger_notEmptyAddBtnValue')
			TestObject validatelink=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Failed Triggerarrow')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.click(path)
			WebUI.click(clock)
			WebUI.click(okButton)
			WebUI.click(stoptime)
			WebUI.click(clock)
			WebUI.click(clock)

			WebUI.click(okButton)
			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.setText(triggerpath,invalidPath)
			WebUI.waitForElementPresent(invalidError,0)
			WebUI.click(triggerpath)
			WebUI.clearText(triggerpath)
			WebUI.setText(triggerpath,validpath)
			WebUI.click(application)
			WebUI.click(selectlegalapplication)
			WebUI.click(excution)
			WebUI.click(selectexepath)

			WebUI.setText(filedependencies,invalidfilePath)
			WebUI.waitForElementPresent(invalidfilepatherror, 0)
			WebUI.click(filedependencies)
			WebUI.clearText(filedependencies)
			WebUI.setText(filedependencies,validfilepath)

			WebUI.click(selectjobdependencies)
			WebUI.click(selectjobdencies)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.scrollToElement(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)

			WebUI.click(deletfilejobdependencies)
			WebUI.click(deletfiledependencies)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.scrollToElement(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("JobRunsdependencies step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def jobCreateTriggers(String jobname,String runinterval,String selectapplication,String excutionpath,String invalidPath,String validpath,String invalidfilePath,String validfilepath,String selectjobsdepend,String SuccessTriggerInvalidpath,String SuccessTriggervalidpath,String FailedTriggerInvalidpath,String FailedTriggervalidpath) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNew = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_New')
			TestObject namefld = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Name')
			TestObject clock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div__MuiPickersClock-squareMask')
			TestObject path=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/path')
			TestObject okButton=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_OK')
			TestObject stopTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Stop Time')
			TestObject startTime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Start Time')
			TestObject minClock=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Start Time_MuiSvgIcon-root')
			TestObject runDays = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Sunday_runOnMonday')
			TestObject runDaysWednesday=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Tuesday_runOnWednesday')
			TestObject runCheck = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_continuous')
			TestObject runInterval = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Run Interval_runInterval')
			TestObject application = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/ddl_Applications')
			TestObject saveButton = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Save')
			TestObject RunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Run Job Adhoc')
			TestObject alertRunAdhoc = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_Run Job Adhoc is submitted')
			TestObject excution=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/select_Executions')
			TestObject history=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/span_History')
			TestObject addedOn=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/p_Added On')
			TestObject stoptime=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/clock_Stoptime')
			TestObject triggerpath=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Trigger Path')
			TestObject invalidfilepatherror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Invalidfile is not a valid path')
			TestObject validationmsg=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Trigger Path needs to be validated')
			TestObject invalidError=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Invalid is not a valid path')
			TestObject filedependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_File Dependency_fileDependency')
			TestObject validate_filedependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_FileDependency')
			TestObject validate_filedependencieserror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_File Dependency needs to be validated')
			//TestObject validate_jobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/Jobvalidationlink')
			TestObject validate_jobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_Expire')
			TestObject selectjobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/select_JobsExpireActionsE')
			TestObject jobdependencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Job Dependency_jobDependency')
			TestObject tvalidatelink=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_Trigger_notEmptyAddBtnValue')
			TestObject validatelink=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Failed Triggerarrow')
			TestObject SuccessTrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Success Trigger')
			TestObject validate_SuccessTrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/btn_SuccessTrigger_AddBtnValue')
			TestObject validate_Successserror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Success Trigger needs to be validated')
			TestObject invalidSuccesspatherror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_SuccessInvalid is not a valid path')
			TestObject validate_FailedTrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_FailedTnotempty')
			TestObject deletesuccessfailedtrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/button_button')
			TestObject failedTrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/input_Failed Trigger')
			TestObject validate_Failederror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_Failed Trigger needs to be validated')
			TestObject invalidFailedpatherror=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/div_FailedInvalid is not a valid path')
			TestObject deletefailedtrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/DeleteFailedTrigger')
			TestObject deletesuccesstrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/DeleteSuccessTrigger')
			TestObject selectlegalapplication=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectlegalapplication')
			TestObject selectjobdencies=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectjobdependencies')
			TestObject selectexepath=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/selectexepath')
			TestObject deletsuccesstrigger=findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_Job Maintenance/svg_Success Triggers_bi bi-trash')
			WebUI.click(createNew)
			WebUI.setText(namefld,jobname)
			WebUI.click(path)
			WebUI.click(clock)
			WebUI.click(okButton)
			WebUI.click(stoptime)
			WebUI.click(clock)
			WebUI.click(clock)
			WebUI.click(okButton)
			WebUI.check(runDays)
			WebUI.check(runDaysWednesday)
			WebUI.check(runCheck)
			WebUI.setText(runInterval,runinterval)
			WebUI.setText(triggerpath,invalidPath)
			WebUI.waitForElementPresent(invalidError,0)
			WebUI.click(triggerpath)
			WebUI.clearText(triggerpath)
			WebUI.setText(triggerpath,validpath)
			WebUI.click(application)
			WebUI.click(selectlegalapplication)
			WebUI.click(excution)
			WebUI.click(selectexepath)

			WebUI.setText(SuccessTrigger,SuccessTriggerInvalidpath)
			WebUI.waitForElementPresent(invalidSuccesspatherror, 0)
			WebUI.click(SuccessTrigger)
			WebUI.clearText(SuccessTrigger)
			WebUI.setText(SuccessTrigger,SuccessTriggervalidpath)

			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.scrollToElement(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.click(RunAdhoc)
			WebUI.waitForElementVisible(alertRunAdhoc, GlobalVariable.globalMediumDelay)
			String runAdhoctoastMessage=WebUI.getText(alertRunAdhoc)
			WebUI.verifyMatch(runAdhoctoastMessage, 'Run Job Adhoc is submitted', false)

			WebUI.click(deletsuccesstrigger)
			WebUI.click(saveButton)
			WebUI.scrollToElement(history, GlobalVariable.globalMediumDelay)
			WebUI.click(history)
			WebUI.scrollToElement(addedOn, GlobalVariable.globalMediumDelay)
			WebUI.waitForElementVisible(addedOn, GlobalVariable.globalMediumDelay)
		}catch(StepFailedException  e) {
			log.logFailed("JobRunsdependencies step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


