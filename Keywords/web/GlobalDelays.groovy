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

import internal.GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import config.ConfigurationManager
import org.apache.commons.lang.RandomStringUtils

public class GlobalDelays {
	private static final int SHORT_DELAY=2;
	private static final int MEDIUM_DELAY=5;
	private static final int LONG_DELAY=10;
	KeywordLogger log =new KeywordLogger()
	@Keyword 
	def shortDelay() {
		WebUI.delay(SHORT_DELAY)
	}
	@Keyword
	def mediumDelay() {
		WebUI.delay(MEDIUM_DELAY)
	}
	@Keyword
	def longDelay() {
		WebUI.delay(LONG_DELAY)
	}
}
