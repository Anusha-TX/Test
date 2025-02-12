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
import internal.GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger


public class CustomViews {
	KeywordLogger log =new KeywordLogger()

	@Keyword
	def customDetails(String customTitle,String iconSearch) {
		try {
			TestObject titleField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/input_Custom_Title_title')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/input_Custom_Search_icon')
			TestObject click = 	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/span_Accessible_Icon')

			WebUI.setText(titleField,customTitle)
			WebUI.setText(icon,iconSearch)
			WebUI.click(click)
		}  catch(StepFailedException  e) {
			log.logFailed("Create Custom views Details step failed " +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickCancelButton() {
		try {
			TestObject btncancel = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/button_Custom_Cancel')

			WebUI.click(btncancel)
		}  catch(StepFailedException  e) {
			log.logFailed("click Cancel Button step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def mazimizePane() {
		try {
			TestObject leftPaneline = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/div_Size_Maximize_Pane')
			TestObject moveLeft =  findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/svg_Left_Pane')
			TestObject moveRight =  findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/svg_Right_Pane')

			WebUI.click(leftPaneline)
			WebUI.click(moveLeft)
			WebUI.click(moveRight)
		}  catch(StepFailedException  e) {
			log.logFailed("Mazimize Pane step failed " +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCustomView() {
		try {
			TestObject sltView = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Create_Custom View Maintenance/span_Demo Custom View')

			WebUI.click(sltView)
		}  catch(StepFailedException  e) {
			log.logFailed("Open Custom View step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	// BN Functions


	@Keyword
	def navigatetoCustomViews() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject Misc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Misc')
			WebUI.click(Misc)
			TestObject customViews = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_TRIPS/div_Custom Views')
			WebUI.click(customViews)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to CustomViews step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createtoCustomViews(String titlename,String Icontext) {
		try {
			TestObject createNew = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/a_New')
			TestObject title = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Title_title')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_icon')
			TestObject sdcard =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Sd Card')
			TestObject entertext = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_text')
			TestObject vertical =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-grip-vertical')
			TestObject inputcursor =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-input-cursor-text')
			TestObject forminput =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input__form-control')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Save')
			WebUI.click(createNew)
			WebUI.setText(title,titlename)
			WebUI.setText(icon,Icontext)
			WebUI.click(sdcard)
			WebUI.click(entertext)
			WebUI.click(vertical)
			WebUI.click(inputcursor)
		}catch(StepFailedException  e) {
			log.logFailed("Create Customviews step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deletecustomViews() {
		try {
			TestObject deleteButton =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Delete')
			TestObject createcustomview =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/Newcustomview')
			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException  e) {
			log.logFailed("Delete CustomViews step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def uiCustomViews(String titlename,String Icontext) {
		try {
			TestObject createNew = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/a_New')
			TestObject title = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Title_title')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_icon')
			TestObject sdcard =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Sd Card')
			TestObject entertext = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_text')
			TestObject vertical =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-grip-vertical')
			TestObject inputcursor =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-input-cursor-text')
			TestObject forminput =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input__form-control')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Save')
			WebUI.click(createNew)
			WebUI.verifyElementPresent(title, 0)
			WebUI.setText(title,titlename)
			WebUI.verifyElementPresent(icon, 0)
			WebUI.setText(icon,Icontext)
			WebUI.click(sdcard)
			WebUI.verifyElementPresent(entertext, 0)
			WebUI.click(entertext)
			WebUI.verifyElementPresent(vertical, 0)
			WebUI.click(vertical)
			WebUI.verifyElementPresent(inputcursor,0)
			WebUI.click(inputcursor)
			WebUI.verifyElementPresent(saveButton, 0)
		}catch(StepFailedException  e) {
			log.logFailed("Create Customviews step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateCustomViews(String titlename,String Icontext,String updatetitle) {
		try {
			TestObject createNew = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/a_New')
			TestObject title = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Title_title')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_icon')
			TestObject sdcard =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Sd Card')
			TestObject entertext = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input_Icon Search_text')
			TestObject vertical =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-grip-vertical')
			TestObject inputcursor =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/svg_Required_bi bi-input-cursor-text')
			TestObject forminput =findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/input__form-control')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Custom Views/Page_Custom View Maintenance/button_Save')
			WebUI.click(createNew)
			WebUI.setText(title,titlename)
			WebUI.setText(icon,Icontext)
			WebUI.click(sdcard)
			WebUI.click(entertext)
			WebUI.click(vertical)
			WebUI.click(inputcursor)

			WebUI.clearText(title)
			WebUI.setText(title,updatetitle)
		}catch(StepFailedException  e) {
			log.logFailed("Create Customviews step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
