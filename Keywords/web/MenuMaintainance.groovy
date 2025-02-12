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

public class MenuMaintainance {
	KeywordLogger log =new KeywordLogger()
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
	def draganddropMenu() {
		try {
			TestObject source = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Menu Maintenance/div_Maintain')
			TestObject saveButton =findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Menu Maintenance/btn_Save')
			TestObject target = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Menu Maintenance/div_Reports')
			WebUI.dragAndDropToObject(target,source)
			GlobalVariable.globalMediumDelay
			WebUI.click(saveButton)
			WebUI.refresh()
			WebUI.refresh()
			WebUI.dragAndDropToObject(target,source)
			GlobalVariable.globalMediumDelay
			WebUI.click(saveButton)
			WebUI.refresh()
			WebUI.refresh()
			TestObject common = findTestObject('Object Repository/Web/Common/Maintain/Job schedules/Page_TRIPS/div_Common')
			WebUI.click(common)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to Dragandropmenu step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

