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

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

import com.kms.katalon.core.configuration.RunConfiguration

public class AttachmentOverlayTemplateMaintenanceScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def addOverlaytemplatename(String attachmentTitle) {
		try {
			TestObject templatename =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/input_Include All_fileName_Field')

			WebUI.setText(templatename, attachmentTitle)
		} catch(StepFailedException e) {
			log.logFailed("Create Overlay Template Name Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addOverlaytemplateOtherFile() {
		try {
			TestObject sltFile = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/div_Add_Template_PDF')

			WebUI.sendKeys(sltFile, RunConfiguration.getProjectDir() +'\\UploadFile\\Letter.txt')
		} catch(StepFailedException e) {
			log.logFailed("Add Overlay Template Other File Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addOverlaytemplatePDFFile() {
		try {
			TestObject sltFile = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/div_Add_Template_PDF')

			WebUI.sendKeys(sltFile, RunConfiguration.getProjectDir() +'\\UploadFile\\CashiersCheck.pdf')
		} catch(StepFailedException e) {
			log.logFailed("Add Overlay Template PDF File Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickLeavingPageCancel() {
		try {
			TestObject verify = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/p_you want to leave without saving')
			TestObject sltCancel =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/button_Leaving_Page_Cancel')

			WebUI.click(sltCancel)
		}  catch(StepFailedException e) {
			log.logFailed("Click Leaving Page Cancel Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def sltTemplate() {
		try {
			TestObject sltTemp = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/span_Account_Attachment')

			WebUI.click(sltTemp)
		}  catch(StepFailedException e) {
			log.logFailed("Select Template Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addSignatureFile() {
		try {
			TestObject clkSignature = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/div_Select a signature')
			TestObject btnSignature = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/ddl_Add_New_Signature')
			TestObject sltSignatureFile = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/span_Add_Signature_File')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/button_Add_Signature_Save')

			WebUI.click(clkSignature)
			WebUI.click(btnSignature)
			WebUI.sendKeys(sltSignatureFile, RunConfiguration.getProjectDir() +'\\UploadFile\\CashiersCheck.PNG')
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Add Signature File Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addTextAndBarcode(String textData, String addBarcode) {
		try {
			TestObject addText = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/svg_Add_Text_Icon')
			TestObject addbarcode = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/i_Add_Barcode_Icon')
			TestObject textField = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Edit_Template/input_Text_PDF_Template')
			TestObject barcode =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Edit_Template/input_Barcode_PDF_Template')

			WebUI.click(addText)
			WebUI.click(addbarcode)
			WebUI.click(textField)
			WebUI.setText(textField,textData)
			WebUI.click(barcode)
			WebUI.setText(barcode,addBarcode)
		}   catch(StepFailedException e) {
			log.logFailed("Add Text And Barcode Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clearButton() {
		try {
			TestObject sltClearButton = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/button_Clear')

			WebUI.click(sltClearButton)
		}  catch(StepFailedException e) {
			log.logFailed("Clear Button Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editAttachmentDetails(String editAttachment) {
		try {
			TestObject templatename =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Attachment Overlay/Page_Attach_Overlay_Tmp_Maint/input_Include All_fileName_Field')

			WebUI.clearText(templatename)
			WebUI.setText(templatename, editAttachment)
		} catch(StepFailedException e) {
			log.logFailed("Edit Attachment Details Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}







