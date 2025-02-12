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

import com.kms.katalon.core.configuration.RunConfiguration

import internal.GlobalVariable

// Keywords Functions

public class CashiersCheckMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()


	@Keyword
	def templateAddCashiersDetails() {
		try {
			TestObject bankName = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/ddl_Select_Bank')
			TestObject sltBank = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/Select_Bank_Name_0_Default')
			TestObject sltTempalteImage = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Add_Image_Tempate')

			WebUI.click(bankName)
			WebUI.click(sltBank)
			GlobalVariable.globalShortDelay
			WebUI.sendKeys(sltTempalteImage, RunConfiguration.getProjectDir() +'\\UploadFile\\CashiersCheck.pdf')
		}   catch(StepFailedException e) {
			log.logFailed("Template Add Cahiers Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editUpdateTemplate(){
		try {
			TestObject sltTempalteImage = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Add_Image_Tempate')

			WebUI.sendKeys(sltTempalteImage, RunConfiguration.getProjectDir() +'\\UploadFile\\ActionAudit.pdf')
		}   catch(StepFailedException e) {
			log.logFailed("Edit Update Template Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def documentProperties(String docWidth, String docHeight, String docLeftMargin, String docTopMargin, String docRightMargin, String docBottomMargin) {
		try {
			TestObject documentProperties = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/span_Document Properties')
			TestObject documentWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document Width')
			TestObject documentHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Height')
			TestObject documentLeftMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Left_Margin')
			TestObject documentTopMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Top_Margin')
			TestObject documentRightMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Right_Margin')
			TestObject documentBottomMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Bottom_Margin')

			WebUI.click(documentProperties)
			WebUI.click(documentWidth)
			WebUI.setText(documentWidth, docWidth)
			WebUI.click(documentHeight)
			WebUI.setText(documentHeight, docHeight)
			WebUI.click(documentLeftMargin)
			WebUI.setText(documentLeftMargin, docLeftMargin)
			WebUI.click(documentTopMargin)
			WebUI.setText(documentTopMargin, docTopMargin)
			WebUI.click(documentRightMargin)
			WebUI.setText(documentRightMargin, docRightMargin)
			WebUI.click(documentBottomMargin)
			WebUI.setText(documentBottomMargin, docBottomMargin)
		} catch(StepFailedException e) {
			log.logFailed("Document Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def backgroundProperties(String backWidth, String backHeight, String backLeftMargin, String backTopMargin, String backRightMargin, String backBottomMargin) {
		try {
			TestObject backgroundWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Width')
			TestObject backgroundHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Height')
			TestObject backgroundLeftMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Left')
			TestObject backgrounfTopMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Top')
			TestObject backgroundRightMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Right')
			TestObject backgroundBottomMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Bottom')
			TestObject inncludeBackgroundCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/chk_Include_Background')

			WebUI.click(backgroundWidth)
			WebUI.setText(backgroundWidth, backWidth)
			WebUI.click(backgroundHeight)
			WebUI.setText(backgroundHeight, backHeight)
			WebUI.click(backgroundLeftMargin)
			WebUI.setText(backgroundLeftMargin, backLeftMargin)
			WebUI.click(backgrounfTopMargin)
			WebUI.setText(backgrounfTopMargin, backTopMargin)
			WebUI.click(backgroundRightMargin)
			WebUI.setText(backgroundRightMargin, backRightMargin)
			WebUI.click(backgroundBottomMargin)
			WebUI.setText(backgroundBottomMargin, backBottomMargin)
			WebUI.click(inncludeBackgroundCheckbox)
		} catch(StepFailedException e) {
			log.logFailed("Background Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickOnImage() {
		try {
			TestObject clickImage =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/div_Template_Click')

			WebUI.click(clickImage)
		} catch(StepFailedException e) {
			log.logFailed("Click On Image Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def textProperties(String posX, String posY, String posHeight, String posWidth) {
		try {
			TestObject positionX = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_X')
			TestObject positionY = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Y')
			TestObject positionHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Height')
			TestObject positionWidth = 	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Width')

			WebUI.click(positionX)
			WebUI.clearText(positionX)
			WebUI.setText(positionX, posX)
			WebUI.click(positionY)
			WebUI.clearText(positionY)
			WebUI.setText(positionY, posY)
			WebUI.click(positionHeight)
			WebUI.clearText(positionHeight)
			WebUI.setText(positionHeight, posHeight)
			WebUI.click(positionWidth)
			WebUI.clearText(positionWidth)
			WebUI.setText(positionWidth, posWidth)
		} catch(StepFailedException e) {
			log.logFailed("Text Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataTag(String dataTagName, String exValue) {
		try {
			TestObject dataTag = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Data Tag')
			TestObject sltTag =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Bank Logo')
			TestObject exampleValue = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Data_Example_Value')
			TestObject chkRequired = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/chk_Data_Required')

			WebUI.click(dataTag)
			WebUI.setText(dataTag, dataTagName)
			WebUI.click(sltTag)
			WebUI.click(exampleValue)
			WebUI.setText(exampleValue, exValue)
			WebUI.click(chkRequired)
		} catch(StepFailedException e) {
			log.logFailed("Data Tag Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def fonts() {
		try {
			TestObject font = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Font_Type')
			TestObject fontType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Arial')
			TestObject fontSize = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Font_Size')
			TestObject sltSizze = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Font_Size_10')
			TestObject fontBold = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Bold')
			TestObject fontItalic = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Italic')
			TestObject fontUnderline = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Underline')
			TestObject fontRightJustified = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Right_Justified')
			TestObject fontLeftJustified = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Fond_Left_Justified')

			WebUI.click(font)
			WebUI.click(fontType)
			WebUI.click(fontSize)
			WebUI.click(sltSizze)
			WebUI.click(fontBold)
			WebUI.click(fontItalic)
			WebUI.click(fontUnderline)
			WebUI.click(fontRightJustified)
			WebUI.click(fontLeftJustified)
		} catch(StepFailedException e) {
			log.logFailed("Fonts Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def formatDetails(String maxLength, String forWidth, String forCharacter) {
		try {
			TestObject formatLength = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Format_Max_Length')
			TestObject formatPadding = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Font')
			TestObject sltPadding = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Padding_Font_Right')
			TestObject formatWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Width')
			TestObject formatChararacter = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Character')
			TestObject alignmentBottom = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Alignment_Bottom')
			TestObject writtenAmount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Alignment_Written_Amount')

			WebUI.click(formatLength)
			WebUI.setText(formatLength, maxLength)
			WebUI.click(formatPadding)
			WebUI.click(sltPadding)
			WebUI.click(formatWidth)
			WebUI.setText(formatWidth, forWidth)
			WebUI.click(formatChararacter)
			WebUI.setText(formatChararacter, forCharacter)
			WebUI.click(alignmentBottom)
			WebUI.click(writtenAmount)
		} catch(StepFailedException e) {
			log.logFailed("Format Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkHistory() {
		try {
			TestObject history = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/div_History')
			TestObject clkDate = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/div_Date_Expander')

			WebUI.click(history)
			WebUI.click(clkDate)
			GlobalVariable.globalShortDelay
			WebUI.takeScreenshot()
			WebUI.click(history)
		} catch(StepFailedException e) {
			log.logFailed("Check History Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTemplate() {
		try {
			TestObject sltExistingTemplat = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/span_0 - (Default)_Edit')

			WebUI.click(sltExistingTemplat)
		} catch(StepFailedException e) {
			log.logFailed("Select Template Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addTemplateImageActionAudit() {
		try {
			TestObject sltTempalteImage = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Add_Image_Tempate')

			WebUI.sendKeys(sltTempalteImage, RunConfiguration.getProjectDir() +'\\UploadFile\\ActionAudit.pdf')
		}   catch(StepFailedException e) {
			log.logFailed("Add Template Image Action Audit Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDocumentProperties(String docWidth, String docHeight, String docLeftMargin, String docTopMargin, String docRightMargin, String docBottomMargin) {
		try {
			TestObject documentProperties = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/span_Document Properties')
			TestObject documentWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document Width')
			TestObject documentHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Height')
			TestObject documentLeftMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Left_Margin')
			TestObject documentTopMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Top_Margin')
			TestObject documentRightMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Right_Margin')
			TestObject documentBottomMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Document_Bottom_Margin')

			WebUI.click(documentProperties)
			WebUI.click(documentWidth)
			WebUI.clearText(documentWidth)
			WebUI.setText(documentWidth, docWidth)
			WebUI.click(documentHeight)
			WebUI.clearText(documentHeight)
			WebUI.setText(documentHeight, docHeight)
			WebUI.click(documentLeftMargin)
			WebUI.clearText(documentLeftMargin)
			WebUI.setText(documentLeftMargin, docLeftMargin)
			WebUI.click(documentTopMargin)
			WebUI.clearText(documentTopMargin)
			WebUI.setText(documentTopMargin, docTopMargin)
			WebUI.click(documentRightMargin)
			WebUI.clearText(documentRightMargin)
			WebUI.setText(documentRightMargin, docRightMargin)
			WebUI.click(documentBottomMargin)
			WebUI.clearText(documentBottomMargin)
			WebUI.setText(documentBottomMargin, docBottomMargin)
		} catch(StepFailedException e) {
			log.logFailed("Edit Document Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickDocumentProperties() {
		try {
			TestObject documentProperties = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/span_Document Properties')

			WebUI.click(documentProperties)
		} catch(StepFailedException e) {
			log.logFailed("Click Document Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDocumentBackgroundProperties(String backWidth, String backHeight, String backLeftMargin, String backTopMargin, String backRightMargin, String backBottomMargin) {
		try {
			TestObject backgroundWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Width')
			TestObject backgroundHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Height')
			TestObject backgroundLeftMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Left')
			TestObject backgrounfTopMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Top')
			TestObject backgroundRightMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Right')
			TestObject backgroundBottomMargin = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Background_Margin_Bottom')
			TestObject inncludeBackgroundCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/chk_Include_Background')

			WebUI.click(backgroundWidth)
			WebUI.clearText(backgroundWidth)
			WebUI.setText(backgroundWidth, backWidth)
			WebUI.click(backgroundHeight)
			WebUI.clearText(backgroundHeight)
			WebUI.setText(backgroundHeight, backHeight)
			WebUI.click(backgroundLeftMargin)
			WebUI.clearText(backgroundLeftMargin)
			WebUI.setText(backgroundLeftMargin, backLeftMargin)
			WebUI.click(backgrounfTopMargin)
			WebUI.clearText(backgrounfTopMargin)
			WebUI.setText(backgrounfTopMargin, backTopMargin)
			WebUI.click(backgroundRightMargin)
			WebUI.clearText(backgroundRightMargin)
			WebUI.setText(backgroundRightMargin, backRightMargin)
			WebUI.click(backgroundBottomMargin)
			WebUI.clearText(backgroundBottomMargin)
			WebUI.setText(backgroundBottomMargin, backBottomMargin)
			//	WebUI.click(inncludeBackgroundCheckbox)
		} catch(StepFailedException e) {
			log.logFailed("Edit Document Background Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickOnImageToEdit() {
		try {
			TestObject clickImage =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/div_Template_Click')

			WebUI.click(clickImage)
		} catch(StepFailedException e) {
			log.logFailed("Click On Image Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editTextProperties(String posX, String posY, String posHeight, String posWidth) {
		try {
			TestObject positionX = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_X')
			TestObject positionY = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Y')
			TestObject positionHeight = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Height')
			TestObject positionWidth = 	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Position_Width')

			WebUI.click(positionX)
			WebUI.clearText(positionX)
			WebUI.setText(positionX, posX)
			WebUI.click(positionY)
			WebUI.clearText(positionY)
			WebUI.setText(positionY, posY)
			WebUI.click(positionHeight)
			WebUI.clearText(positionHeight)
			WebUI.setText(positionHeight, posHeight)
			WebUI.click(positionWidth)
			WebUI.clearText(positionWidth)
			WebUI.setText(positionWidth, posWidth)
		} catch(StepFailedException e) {
			log.logFailed("Text Properties Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editDataTag(String exValue) {
		try {
			TestObject dataTag = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Data Tag')
			TestObject sltTag =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Bank Logo')
			TestObject exampleValue = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Data_Example_Value')
			TestObject chkRequired = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/chk_Data_Required')

			WebUI.click(dataTag)
			WebUI.click(sltTag)
			WebUI.click(exampleValue)
			WebUI.clearText(exampleValue)
			WebUI.setText(exampleValue, exValue)
			//	WebUI.click(chkRequired)
		} catch(StepFailedException e) {
			log.logFailed("Edit Data Tag Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editFonts() {
		try {
			TestObject font = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Font_Type')
			TestObject fontType = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Arial')
			TestObject fontSize = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Font_Size')
			TestObject sltSizze = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Font_Size_10')
			TestObject fontBold = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Bold')
			TestObject fontItalic = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Italic')
			TestObject fontUnderline = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Underline')
			TestObject fontRightJustified = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Font_Right_Justified')
			TestObject fontLeftJustified = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/svg_Fond_Left_Justified')

			WebUI.click(font)
			WebUI.click(fontType)
			WebUI.click(fontSize)
			WebUI.click(sltSizze)
			WebUI.click(fontBold)
			WebUI.click(fontItalic)
			WebUI.click(fontUnderline)
			WebUI.click(fontRightJustified)
			WebUI.click(fontLeftJustified)
		} catch(StepFailedException e) {
			log.logFailed("Edit Fonts Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editFormatDetails(String maxLength, String forWidth, String forCharacter) {
		try {
			TestObject formatLength = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Format_Max_Length')
			TestObject formatPadding = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Font')
			TestObject sltPadding = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/a_Padding_Font_Right')
			TestObject formatWidth = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Width')
			TestObject formatChararacter = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Padding_Character')
			TestObject alignmentBottom = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Alignment_Bottom')
			TestObject writtenAmount = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/input_Alignment_Written_Amount')

			WebUI.click(formatLength)
			WebUI.clearText(formatLength)
			WebUI.setText(formatLength, maxLength)
			WebUI.click(formatPadding)
			WebUI.click(sltPadding)
			WebUI.click(formatWidth)
			WebUI.clearText(formatWidth)
			WebUI.setText(formatWidth, forWidth)
			WebUI.click(formatChararacter)
			WebUI.clearText(formatChararacter)
			WebUI.setText(formatChararacter, forCharacter)
			//	WebUI.click(alignmentBottom)
			//	WebUI.click(writtenAmount)
		} catch(StepFailedException e) {
			log.logFailed("Edit Format Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickCashiesrHome() {
		try {
			TestObject home = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Delete_Template/div_Cashier_Check_Maintenance')

			WebUI.click(home)
		} catch(StepFailedException e) {
			log.logFailed("Click Cashiesr Home Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def btnSave() {
		try {
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/button_Save')

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Click Save Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickCancel() {
		try {
			TestObject btnCancel = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Create_Cashiers_Check/button_Cancel')

			WebUI.click(btnCancel)
		} catch(StepFailedException e) {
			log.logFailed("Click Cancel Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def searchItem(String searchCard) {
		try {
			TestObject search =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Cashiers_Check_Enter_Maintenance/input_Item_Search')

			WebUI.setText(search,searchCard)
		}  catch(StepFailedException e) {
			log.logFailed("Search Item Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updatedSearchCard(String updateCard) {
		try {
			TestObject search =	findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Cashiers_Check_Enter_Maintenance/input_Item_Search')

			WebUI.setText(search,updateCard)
		}  catch(StepFailedException e) {
			log.logFailed("Updated Search Card Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickDocumentationLink() {
		try {
			TestObject clkDocument = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Cashiers_Check_Enter_Maintenance/btn_Documentation_Lnk')

			WebUI.click(clkDocument)
		} catch(StepFailedException e) {
			log.logFailed("Click Documentation Link Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def toogleTotemplate() {
		try {
			TestObject toolgeTem = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Cashiers Check/Page_Cashiers_Check_Enter_Maintenance/div_Toogle_Template')

			WebUI.click(toolgeTem)
		} catch(StepFailedException e) {
			log.logFailed("Toogle Template Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}
