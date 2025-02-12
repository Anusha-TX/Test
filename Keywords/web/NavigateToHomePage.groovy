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
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

import internal.GlobalVariable
import javassist.bytecode.stackmap.BasicBlock.Catch
import net.bytebuddy.implementation.bytecode.Throw

// Keywords Functions

public class NavigateToHomePage {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def trips() {
		try {
			TestObject trips =	findTestObject('Object Repository/Web/Login/Page_TRIPS/div_TRIPS')

			WebUI.click(trips)
		} catch(StepFailedException e) {
			log.logFailed("Trips Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def loginOtherUser(String username, String password) {
		try {
			TestObject usernameField = findTestObject('Object Repository/Web/Login/txt_Username')
			TestObject passwordField = findTestObject('Object Repository/Web/Login/txt_Password')
			TestObject loginButton = findTestObject('Object Repository/Web/Login/btn_Login')

			WebUI.setText(usernameField, username)
			WebUI.setText(passwordField, password)
			WebUI.click(loginButton)
		} catch(StepFailedException e) {
			log.logFailed("Login Other User failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

