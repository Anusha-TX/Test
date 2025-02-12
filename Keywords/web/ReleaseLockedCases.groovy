package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
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

import internal.GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import config.ConfigurationManager
import org.apache.commons.lang.RandomStringUtils

public class ReleaseLockedCases {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoReleaseLockedCases() {
		try {
			TestObject dispute = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_TRIPS/div_Dispute')
			WebUI.click(dispute)
			TestObject process = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_TRIPS/div_Process')
			WebUI.click(process)
			TestObject releaselockedcase = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_TRIPS/div_Release Locked Cases')
			WebUI.click(releaselockedcase)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to releaselockedcase step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def unlockSingleMultipleCases() {
		try {

			TestObject selectSinglecases = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/input_cases')
			TestObject selectMultiplecases = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/input_Cases2')
			TestObject id = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/Id_element')
			TestObject unlock = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock')
			TestObject unlockAll = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock All')
			boolean unlockall = WebUI.verifyElementPresent(unlockAll, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)
			if(unlockall) {
				WebUI.click(selectSinglecases)
				String elementID=WebUI.getText(id)
				println("Element text/ID to be deleted:"+elementID)
				WebUI.click(unlock)
				WebUI.waitForElementNotPresent(id, 0)
			}else {
				WebUI.comment("LockedCases not found.")
			}
		}catch(StepFailedException  e) {
			log.logFailed("UnlockSingleMultiplecases step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def unlockAll() {
		try {

			TestObject unlockAll = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock All')
			TestObject alertpopup = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/div_Are you Sure you want to unlock case(s)')
			TestObject unlock = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock')
			TestObject cancel = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Cancel')
			TestObject zerotestcases = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/zerotestcases')
			boolean unlockall = WebUI.verifyElementPresent(unlockAll, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)
			if(unlockall) {
				WebUI.click(unlockAll)
				WebUI.waitForElementVisible(alertpopup, GlobalVariable.globalMediumDelay)
				WebUI.click(unlock)
				WebUI.waitForElementVisible(zerotestcases, 10)
			}else {
				WebUI.comment("LockedCases not found.")
			}
		}catch(StepFailedException  e) {
			log.logFailed("UnlockAll step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def UIValidation() {
		try {

			TestObject unlockAll = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock All')
			TestObject alertpopup = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/div_Are you Sure you want to unlock case(s)')
			TestObject unlock = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Unlock')
			TestObject cancel = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/button_Cancel')
			TestObject selectSinglecases = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/input_cases')
			TestObject id = findTestObject('Object Repository/Web/Dispute/Process/Release Locked Cases/Page_Release Locked Cases/Id_element')
			boolean unlockall = WebUI.verifyElementPresent(unlockAll, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)
			if(unlockall) {
				WebUI.click(unlockAll)
				WebUI.waitForElementVisible(alertpopup, GlobalVariable.globalMediumDelay)
				WebUI.click(cancel)
				WebUI.click(selectSinglecases)
				String elementID=WebUI.getText(id)
				println("Element text/ID to be deleted:"+elementID)
				WebUI.click(unlock)
				WebUI.waitForElementNotPresent(id, 0)
			}else {
				WebUI.comment("LockedCases not found.")
			}
		}catch(StepFailedException  e) {
			log.logFailed("UIValidation step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}