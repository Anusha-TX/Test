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
import org.apache.commons.lang.RandomStringUtils
//impport com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import config.ConfigurationManager
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable

public class ReportGenerator {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoReportGenerator() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject Misc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Misc')
			WebUI.click(Misc)
			TestObject ReportGenerator = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Currency/Page_TRIPS/div_Report Generator')
			WebUI.click(ReportGenerator)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def ReportMenuPick() {
		try {
			TestObject dailyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/Productivity Report')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(dailyReport)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def navigatetoMenuMaintainance() {
		try {
			TestObject common = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_TRIPS/div_Common')
			WebUI.click(common)
			WebUI.click(common)
			TestObject maintain = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_TRIPS/div_Maintain')
			WebUI.click(maintain)
			TestObject menuMaintainance = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_TRIPS/div_Menu Maintenance')
			WebUI.click(menuMaintainance)
			TestObject disputereport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Menu Maintenance/div_Reports')
			WebUI.click(disputereport)
			TestObject productivityreport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Menu Maintenance/div_ProductivityReports')
			WebUI.verifyElementPresent(productivityreport, 0)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to MenuMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def dailyReport() {
		try {
			TestObject dailyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/ProductivityReportDaily.prt')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(dailyReport)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def monthlyReport() {
		try {
			TestObject monthlyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/ProductivityReportMonthly.prt')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(monthlyReport)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def yearlyReport() {
		try {
			TestObject yearlyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/ProductivityReportYearly.prt')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(yearlyReport)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def casesClosedReportModeDMY() {
		try {
			TestObject caseClosedMonthlyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/span_CasesClosedMonthlyReport')
			TestObject caseClosedDailyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/span_CasesClosedDailyReport')
			TestObject caseClosedyearlyReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/span_CasesClosedYearlyReport')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject mode =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/input_MODE_MODE')
			TestObject save =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/button_Save')
			TestObject casesCloseddaily =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_TRIPS/div_CasesClosedDailyReport')
			WebUI.click(caseClosedDailyReport)
			WebUI.click(reporttemplate)
			WebUI.click(testReport)
			WebUI.click(mode)
			WebUI.click(save)
			WebUI.click(caseClosedMonthlyReport)
			WebUI.click(testReport)
			WebUI.setText(mode,'M')
			WebUI.click(save)
			WebUI.click(caseClosedyearlyReport)
			WebUI.click(testReport)
			WebUI.setText(mode,'Y')
			WebUI.click(save)
			WebUI.click(tripsmenu)
			WebUI.verifyElementPresent(casesCloseddaily, 0)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def casesOpenedTodayReport() {
		try {
			TestObject casesOpenedtoday = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/span_CasesOpenedToday.prt')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(casesOpenedtoday)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def currentOpenCases() {
		try {
			TestObject currentOpenCases = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Page_Report Generator Maintenance/span_CurrentOpenCasesReport.prt')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(currentOpenCases)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def holdReport() {
		try {
			TestObject holdReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/HoldReport')
			TestObject reporttemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/a_Report Template')
			TestObject menupick = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_New Menu Pick')
			TestObject testReport = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/button_Test Report')
			TestObject tripsmenu =findTestObject('Object Repository/Web/Legal/Process/CaseProcesser/Page_Jurisdiction Maintenance/div_TRIPS')
			TestObject successAlert =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Report Generator/successalert')
			WebUI.click(holdReport)
			WebUI.click(reporttemplate)
			WebUI.click(menupick)
			String enabletoastMessage=WebUI.getText(successAlert)
			WebUI.verifyMatch(enabletoastMessage, 'Menu Pick Inserted', false)
			WebUI.click(testReport)
			WebUI.click(tripsmenu)
		}catch(StepFailedException  e) {
			log.logFailed("ReportGenerator step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
