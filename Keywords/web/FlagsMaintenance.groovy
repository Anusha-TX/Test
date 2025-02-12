
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

public class FlagsMaintenance {

	KeywordLogger log =new KeywordLogger()
	@Keyword
	def navigatetoFlags() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject Misc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Misc')
			WebUI.click(Misc)
			TestObject Flags = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_TRIPS/div_Flags')
			WebUI.click(Flags)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to Flag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createFlag(String flagname) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(5)
			TestObject createNewFlag = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/a_New')
			TestObject flagName = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/input_Name')
			TestObject color = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/input_Color')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/input_Icon Search')
			TestObject Save = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/button_Save')
			TestObject btnFlag = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/button_flag')
			TestObject History = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/svg_History')
			TestObject createdflag =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Flags/Page_Flag Maintenance/newflagname')
			WebUI.click(createNewFlag)
			WebUI.setText(flagName,flagname)
			WebUI.click(color)
			WebUI.click(icon)
			WebUI.setText(icon,'Flag')
			WebUI.click(btnFlag)
			WebUI.click(Save)
			WebUI.click(History)
			WebUI.click(createdflag)
		}catch(StepFailedException  e) {
			log.logFailed("CreateFlag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()

			throw e
		}
	}

	@Keyword
	def addFlag() {
		try {
			TestObject homesearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/svg_Homesearch')
			TestObject homesearchbtn =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/btn_Home_search')
			TestObject caseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_FirstCaseId')
			TestObject flagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Flag Case')
			TestObject selectflagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Select a Flag')
			TestObject selectgreenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Green Flag')
			TestObject sendbutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Send')
			TestObject greenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_Contact_CaseGreenflag')
			WebUI.click(homesearch)
			GlobalVariable.globalMediumDelay
			WebUI.click(homesearchbtn)
			GlobalVariable.globalMediumDelay
			WebUI.rightClick(caseID)
			WebUI.click(flagcase)
			WebUI.click(selectflagcase)
			WebUI.click(selectgreenflag)
			WebUI.click(sendbutton)
			WebUI.verifyElementPresent(greenflag, 0)
		}catch(StepFailedException  e) {
			log.logFailed("AddRemoveFlag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def removeFlag() {
		try {
			TestObject caseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_FirstCaseId')
			TestObject flagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Flag Case')
			TestObject selectflagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Select a Flag')
			TestObject selectclearflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/a_Clear Flag')
			TestObject sendbutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Send')
			TestObject nogreenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Green Flag')
			WebUI.rightClick(caseID)
			WebUI.click(flagcase)
			WebUI.click(selectflagcase)
			WebUI.click(selectclearflag)
			WebUI.click(sendbutton)
			WebUI.verifyElementNotPresent(nogreenflag, 0)
		}catch(StepFailedException  e) {
			log.logFailed("AddRemoveFlag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkExistingFlag() {
		try {
			TestObject caseID =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_FirstCaseId')
			TestObject flagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/div_Flag Case')
			TestObject selectflagcase =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Select a Flag')
			TestObject selectclearflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/a_Clear Flag')
			TestObject sendbutton =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/button_Send')
			TestObject blackflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/a_Black Flag')
			TestObject greenflag =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor/i_Contact_CaseGreenflag')
			WebUI.rightClick(caseID)
			WebUI.click(flagcase)
			WebUI.click(selectflagcase)
			WebUI.verifyElementPresent(blackflag, 0)
			WebUI.verifyElementPresent(selectclearflag, 0)
			WebUI.click(blackflag)
			WebUI.click(sendbutton)
		}catch(StepFailedException  e) {
			log.logFailed("AddexistingFlag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
