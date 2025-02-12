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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

public class Batch_CashierCheckPrinter{

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def workflow_page() {

		try {


			TestObject WorkFlow = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/i_Workflows_fas fa-laptop-code')
			TestObject selct_Workflow = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/span_Batch Cashiers Check')
			TestObject inputSearch = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/div_Account Identification Action')
			TestObject add_action = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/input_Action_action')
			TestObject Select_action=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/a_Account Identification Action')
			TestObject save_btn = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Workflow Maintenance/button_Save')

			//WebUI.click(WorkFlow)
			WebUI.click(selct_Workflow)
			WebUI.click(inputSearch)
			WebUI.clearText(inputSearch)

			WebUI.setText(add_action,'Account Identification Action' )

			WebUI.click(Select_action)

			WebUI.click(save_btn)
		}catch(StepFailedException e) {

			log.logFailed("Work flow set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def Requestor_add() {
		try {

			TestObject timeline=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/div_11262024')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Requestor')
			TestObject Add_requestor = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Requestor/span_Add New Requestor')
			TestObject inputSearch = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Requestor/input_Name_name')
			TestObject save_btn = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Requestor/button_Save')


			WebUI.rightClick(timeline)
			WebUI.click(requestor)
			WebUI.switchToWindowIndex(2)
			//WebUI.click(requestor)
			WebUI.click(Add_requestor)
			WebUI.setText(inputSearch,'Kyel' )

			WebUI.click(save_btn)
		}catch(StepFailedException e) {

			log.logFailed("Requestor set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def CashiersCheck() {
		try {

			TestObject timeline=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/div_11262024')
			TestObject requestor = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Requestor')
			TestObject Cashiers_Check = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Case Processor/span_Cashiers Check')
			TestObject Save = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_CashiersCheck/button_Save')

			WebUI.rightClick(timeline)

			WebUI.mouseOver(requestor)

			WebUI.click(Cashiers_Check)
			WebUI.switchToWindowIndex(2)
			WebUI.click(Save)
		}catch(StepFailedException e) {

			log.logFailed("Cashier set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}



	@Keyword
	def Bathch_gettingrecord() {
		try {

			TestObject check_box=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Void_jss20')
			TestObject show_void = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Show Printed_showVoided')
			TestObject show_printed = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Specify_showPrinted')
			TestObject select_field=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Today_sevenDays')


			WebUI.switchToWindowIndex(1)
			WebUI.click(select_field)
			WebUI.click(check_box)

			WebUI.click(show_void)
			WebUI.click(show_printed)
		}catch(StepFailedException e) {

			log.logFailed("Getting record set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def Bathch_VoidCheck() {
		try {

			TestObject check_box=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Void_jss20')
			TestObject void_btn = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/button_Void')
			TestObject void_reson = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/textarea_Void Reason_voidReason')
			TestObject btn_Ok=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/button_OK')

			WebUI.switchToWindowIndex(1)
			WebUI.click(check_box)
			WebUI.click(void_btn)

			WebUI.setText(void_reson,'Cancel Check')

			WebUI.click(btn_Ok)
		}catch(StepFailedException e) {

			log.logFailed("Void check set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def Bathch_printCheck() {
		try {

			TestObject check_box=findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/input_Void_jss20')
			TestObject print = findTestObject('Object Repository/Web/Legal/Case Processor/Case Processor/Page_Batch Cashiers Check Printer/button_Print')


			WebUI.switchToWindowIndex(1)
			WebUI.click(check_box)
			WebUI.click(print)
		}catch(StepFailedException e) {

			log.logFailed("Cashier set up   step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {

			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createBatchLetterAction(String addAction1,String addAction2,String addAction3) {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Questionnaire_Node_to_Add_Action')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/Page_Workflow Maintenance/a_Debtor')
			TestObject sltAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/Page_Workflow Maintenance/svg_Debtor_bi bi-arrow-down-short')
			TestObject sltAction2=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/Page_Workflow Maintenance/a_Account Identification Action')
			TestObject sltAction3=findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/Page_Workflow Maintenance/a_Cashiers Check')


			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction1)
			WebUI.click(sltAction)
			WebUI.click(sltAction1)
			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction2)
			WebUI.click(sltAction1)
			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction3)
			WebUI.click(sltAction3)
		}  catch(StepFailedException e) {
			log.logFailed("Create  Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
