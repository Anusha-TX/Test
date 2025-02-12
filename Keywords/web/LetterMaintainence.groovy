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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import config.ConfigurationManager
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import org.openqa.selenium.Keys
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration
public class LetterMaintainence {
	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoLetterMaintainance() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject template = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_TRIPS/div_Templates')
			WebUI.click(template)
			TestObject letter = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_TRIPS/div_Letters and Correspondence')
			WebUI.click(letter)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to letterMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def createLetter(String lettername,String textbankphone) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject creatNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/a_New')
			TestObject letterName = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/input_Name_name')
			TestObject templateUploadIcon = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/svg_Template_bi bi-file')
			TestObject templatetext = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/textarea_Template_templateText')

			TestObject saveLetter = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/button_Save')
			WebUI.click(creatNew)
			WebUI.setText(letterName,lettername)
			GlobalVariable.globalMediumDelay
			WebUI.click(templatetext)
			WebUI.setText(templatetext,textbankphone)
			WebUI.click(saveLetter)
		}catch(StepFailedException  e) {
			log.logFailed("Create LetterMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createNewLetter(String lettername) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject creatNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/a_New')
			TestObject letterName = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/input_Name_name')
			TestObject uploadDocument = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/svg_Template_bi bi-file')
			TestObject templatetext = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/textarea_Template_templateText')
			TestObject saveLetter = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/button_Save')
			TestObject uploadfile = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Letters and Correspondence/Page_Letter Maintenance/uploadfile')
			WebUI.click(creatNew)
			GlobalVariable.globalMediumDelay
			WebUI.setText(letterName,lettername)
			WebUI.sendKeys(uploadfile, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
			WebUI.click(saveLetter)
		}catch(StepFailedException  e) {
			log.logFailed("Create LetterMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

