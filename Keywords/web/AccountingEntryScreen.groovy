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

public class AccountingEntryScreen {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createAccountingEntryAdjustmentOffsetting(String entryname, String entrydescription, String casedescription, String caseoutputdescription, String debitTranscode, String creditTranscode, String caseseconddescription, String caseoutputseconddescription) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_new')
			TestObject entryName = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Name_name')
			TestObject entryDescription = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Description_description')
			TestObject caseDescription = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Description_name')
			TestObject caseOutputDescription = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Output Description')
			TestObject caseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_case')
			TestObject creditRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_credit')
			TestObject debitRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_debit')
			TestObject offsettingCaseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_offsetting_case')
			TestObject hardPostCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/checkbox_hard_post')
			TestObject creditTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_credit_transcode')
			TestObject debitTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_debit_transcode')
			TestObject clickOffsettingCase = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/div_Offsetting Case')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_save')
			TestObject btnAddNew = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/click_plus_icon')
			TestObject clickSame = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/click_accounting_same')
			TestObject clickOpposite = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/rdo_opposite')
			//TestObject remainingBalance = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/rdo_remaining_balance')
			TestObject balanceAffecting =findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/div_Balance Affecting')
			TestObject clickFixed =findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/div_Fixed')
			TestObject caseDescriptionSecond =findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Description_name_1')
			TestObject caseOutputDescriptionSecond = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/input_Output Desc_pstDesc2')
			TestObject verifyOffsetCase = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/span_Offset Case')
			TestObject deleteButton = 	findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/btn_delete')
			TestObject hardPostCheckboxSecond = findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/checkbox_hard_post_second')

			WebUI.click(btnNew)
			WebUI.setText(entryName,entryname)
			WebUI.setText(entryDescription,entrydescription)
			//WebUI.click(remainingBalance)

			//Data for 1st entry
			WebUI.setText(caseDescription,casedescription)
			WebUI.setText(caseOutputDescription,caseoutputdescription)
			WebUI.click(clickSame)
			WebUI.click(hardPostCheckbox)
			//			WebUI.setText(creditTranscodeValue,creditTranscode)
			//			WebUI.setText(debitTranscodeValue,debitTranscode)
			WebUI.click(offsettingCaseRadioButton)

			//Data for 2nd entry
			WebUI.click(btnAddNew)
			WebUI.setText(caseDescriptionSecond,caseseconddescription)
			WebUI.setText(caseOutputDescriptionSecond,caseoutputseconddescription)
			WebUI.click(clickOpposite)
			WebUI.click(balanceAffecting)
			WebUI.click(hardPostCheckboxSecond)
			//			WebUI.setText(creditTranscodeValue,creditTranscode)
			//			WebUI.setText(debitTranscodeValue,debitTranscode)
			//WebUI.click(clickFixed)
			WebUI.click(btnSave)
			WebUI.verifyElementPresent(verifyOffsetCase, GlobalVariable.globalMediumDelay,FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Offsetting template under Adjustment Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountingEntryOffsettingCredit(String entryname, String entrydescription, String casedescription, String caseoutputdescription, String debitTranscode, String creditTranscode) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_new')
			TestObject entryName = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_name')
			TestObject entryDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_description')
			TestObject caseDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_entry_description')
			TestObject caseOutputDescription =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_output_description')
			TestObject caseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_case')
			TestObject creditRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_credit')
			TestObject debitRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_debit')
			TestObject offsettingCaseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_offsetting_case')
			TestObject hardPostCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/checkbox_hard_post')
			TestObject creditTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_credit_transcode')
			TestObject debitTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_debit_transcode')
			TestObject clickOffsettingCase = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/div_Offsetting Case')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_save')
			TestObject btnAddNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/a_New')
			TestObject verifyOffsettingCredit =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/verify_offsetting_credit_template')
			TestObject deleteButton = 	findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/btn_delete')

			WebUI.click(btnNew)
			WebUI.setText(entryName,entryname)
			WebUI.setText(entryDescription,entrydescription)
			WebUI.click(caseRadioButton)
			WebUI.setText(caseDescription,casedescription)
			WebUI.setText(caseOutputDescription,caseoutputdescription)
			WebUI.click(creditRadioButton)
			WebUI.click(hardPostCheckbox)
			WebUI.setText(creditTranscodeValue,creditTranscode)
			//WebUI.setText(debitTranscodeValue,debitTranscode)
			WebUI.click(offsettingCaseRadioButton)
			WebUI.click(btnSave)
			WebUI.verifyElementPresent(verifyOffsettingCredit, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Offsetting Credit Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountingEntryOffsettingDebit(String entryname, String entrydescription, String casedescription, String caseoutputdescription, String debitTranscode, String creditTranscode) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_new')
			TestObject entryName = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_name')
			TestObject entryDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_description')
			TestObject caseDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_entry_description')
			TestObject caseOutputDescription =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_output_description')
			TestObject caseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_case')
			TestObject creditRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_credit')
			TestObject debitRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_debit')
			TestObject offsettingCaseRadioButton =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/rdo_offsetting_case')
			TestObject hardPostCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/checkbox_hard_post')
			TestObject creditTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_credit_transcode')
			TestObject debitTranscodeValue = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/input_debit_transcode')
			TestObject clickOffsettingCase = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/div_Offsetting Case')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/btn_save')
			TestObject btnAddNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/a_New')
			TestObject verifyOffsettingDebit =findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Accounting Entries/OffsettingCase/verify_offsetting_debit_template')
			TestObject deleteButton = 	findTestObject('Object Repository/Web/Adjustment/Maintain/Workflow/Templates/Accounting Templates/Page_Accounting Entry Maintenance/btn_delete')

			WebUI.click(btnNew)
			WebUI.setText(entryName,entryname)
			WebUI.setText(entryDescription,entrydescription)
			WebUI.click(caseRadioButton)
			WebUI.setText(caseDescription,casedescription)
			WebUI.setText(caseOutputDescription,caseoutputdescription)
			WebUI.click(debitRadioButton)
			WebUI.click(hardPostCheckbox)
			//WebUI.setText(creditTranscodeValue,creditTranscode)
			WebUI.setText(debitTranscodeValue,debitTranscode)
			WebUI.click(offsettingCaseRadioButton)
			WebUI.click(btnSave)
			WebUI.verifyElementPresent(verifyOffsettingDebit, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(deleteButton)
		} catch(StepFailedException e) {
			log.logFailed("Create Accounting Entry Offsetting Debit Template Step Failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}


