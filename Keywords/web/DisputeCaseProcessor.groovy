package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.google.api.client.util.Key
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

// Updated Keywords Functions

public class DisputeCaseProcessor {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def searchCase() {
		try {
			TestObject caseHomeSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_Home_search')
			TestObject statusOpen =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/div_Status_OpenPending')
			TestObject unchkOpen =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/input_Uncheck_Open')
			TestObject unchkPending = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/input_Uncheck_Pending')
			TestObject btnOk = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_OK')
			TestObject btnSearch = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_Home_bi bi-search')

			WebUI.click(caseHomeSearch)
			WebUI.click(statusOpen)
			WebUI.click(unchkOpen)
			WebUI.click(unchkPending)
			WebUI.click(btnOk)
			WebUI.click(btnSearch)
		} catch(StepFailedException e) {
			log.logFailed("Search Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCase() {
		try {
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/div_20241106000007')
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/div_Right_Click_White_Space')
			TestObject sltChangeCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_Change Case Status')

			WebUI.doubleClick(selectCase)
			GlobalVariable.globalShortDelay
			WebUI.rightClick(rightClick)
			WebUI.click(sltChangeCaseStatus)
		} catch(StepFailedException e) {
			log.logFailed("Select Cae Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def changeCaseStatusToOpen(String changeCaseStatus) {
		try {
			TestObject ddlCaseStatus  = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/select_Case_Status')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/btn_Save')

			WebUI.selectOptionByValue(ddlCaseStatus,changeCaseStatus,true)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Change Case Status To Open Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def changeCaseStatusToPending(String changeCaseStatus) {
		try {
			TestObject ddlCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/select_Case_Status')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/btn_Save')

			WebUI.selectOptionByValue(ddlCaseStatus,changeCaseStatus,true)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Change Case Status To Pending Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def changeCaseStatusToClosed(String changeCaseStatus) {
		try {
			TestObject ddlCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/select_Case_Status')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/btn_Save')

			WebUI.selectOptionByValue(ddlCaseStatus,changeCaseStatus,true)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Change Case Status To Closed Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def validateActions() {
		try {
			TestObject caseStatus =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/span_Merchant Returned_Credit')

			WebUI.verifyElementPresent(caseStatus, 3, FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Validate Actions Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def actionDue() {
		try {
			TestObject clkNavigation = 	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Action_Due/svg_Navigation_Pane')
			TestObject actionDue = 	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Action_Due/span_Actions_Due')
			TestObject questionnarie = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Action_Due/span_Questionnaire')

			WebUI.click(clkNavigation)
			WebUI.click(actionDue)
			WebUI.click(actionDue)
			WebUI.click(questionnarie)
		}  catch(StepFailedException e) {
			log.logFailed("Action Due Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQueueIcon() {
		try {
			TestObject sltQuesueIcon = 	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/button_Home_queues')

			WebUI.click(sltQuesueIcon)
		}  catch(StepFailedException e) {
			log.logFailed("Select Quesue Icon Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openQueuesCase() {
		try {
			TestObject sltQueuecase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/td_Open_Case_From_Queue')

			WebUI.doubleClick(sltQueuecase)
		}  catch(StepFailedException e) {
			log.logFailed("Open Queues Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCaseInfo() {
		try {
			TestObject sltCaseInfo = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Case_Info_Type')

			WebUI.click(sltCaseInfo)
			WebUI.takeScreenshot()
			WebUI.click(sltCaseInfo)
		}  catch(StepFailedException e) {
			log.logFailed("Open Case Info Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openAssociateCases() {
		try {
			TestObject sltAssociateCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Associated_Cases')

			WebUI.click(sltAssociateCase)
			WebUI.takeScreenshot()
			WebUI.click(sltAssociateCase)
		}  catch(StepFailedException e) {
			log.logFailed("Open Associate Cases Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openGeeralInstruction() {
		try {
			TestObject sltGeneralIns = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_General_Instructions')

			WebUI.click(sltGeneralIns)
			WebUI.click(sltGeneralIns)
		}  catch(StepFailedException e) {
			log.logFailed("Open Geeral Instruction Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCaseInstruction() {
		try {
			TestObject sltCaseIns = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Case_Instructions')

			WebUI.click(sltCaseIns)
			WebUI.click(sltCaseIns)
		}  catch(StepFailedException e) {
			log.logFailed("Open Case Instruction Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openQuestion() {
		try {
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Questions')

			WebUI.click(sltQuestion)
			WebUI.click(sltQuestion)
		}  catch(StepFailedException e) {
			log.logFailed("Open Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCaseAmount() {
		try {
			TestObject sltCaseAmount =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Case_Amount')

			WebUI.click(sltCaseAmount)
			WebUI.takeScreenshot()
			WebUI.click(sltCaseAmount)
		}  catch(StepFailedException e) {
			log.logFailed("Open Case Amount Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openNextCase() {
		try {
			TestObject sltNext = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/button_Next_Case_Queues')

			WebUI.click(sltNext)
			WebUI.click(sltNext)
		}  catch(StepFailedException e) {
			log.logFailed("Open Case Amount Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQueueCase() {
		try {
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/div_Right_Click_White_Space')
			TestObject sltChangeCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_Change Case Status')

			WebUI.rightClick(rightClick)
			GlobalVariable.globalShortDelay
			WebUI.click(sltChangeCaseStatus)
		} catch(StepFailedException e) {
			log.logFailed("Select Queue Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openQuestionInCase () {
		try {
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/span_Questions')
			TestObject sltQueDrop = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/div_Open_Questionnarie_Dropdown')
			TestObject dropdown1 =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/div_Questionnaire_Under_Dropdown1')
			TestObject dropdown2 = 	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Work_Queues/div_Questionnaire_Under_Dropdown2')

			WebUI.click(sltQuestion)
			WebUI.click(sltQueDrop)
			WebUI.click(dropdown1)
			//	WebUI.click(dropdown2)
		}  catch(StepFailedException e) {
			log.logFailed("Open Question In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openCase() {
		try {
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Change_Case_Status/div_20241106000007')

			WebUI.doubleClick(selectCase)
		} catch(StepFailedException e) {
			log.logFailed("Open Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openGenerateLetter() {
		try {
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/div_Right_Click_White_Space')
			TestObject sltGenerateLetter = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate_Letter_Action/span_Generate_Letter')

			WebUI.rightClick(rightClick)
			WebUI.click(sltGenerateLetter)
		} catch(StepFailedException e) {
			log.logFailed("Open Generate Letter Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def letterSendTo(String sltTemplate2) {
		try {
			TestObject sendTo = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate_Letter_Action/div_Send To')
			TestObject sltSender = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate_Letter_Action/div_Jhon D Austria - XXXX0001')
			TestObject sltBodyTemplate =findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate_Letter_Action/select_Body_Template_Generate_Letter')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Generate_Letter_Action/button_Save')

			WebUI.rightClick(sendTo)
			WebUI.click(sltSender)
			WebUI.click(sltBodyTemplate)
			WebUI.selectOptionByLabel(sltBodyTemplate, sltTemplate2, true)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Letter Send To Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseForTest() {
		try {
			TestObject selectCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Queues_Processor_Queues/div_20241106000003')
			TestObject rightClick =	findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/div_Right_Click_White_Space')
			TestObject sltChangeCaseStatus = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case Processor_Case_Search/btn_Change Case Status')

			WebUI.doubleClick(selectCase)
			//			GlobalVariable.globalShortDelay
			//			WebUI.rightClick(rightClick)
			//			WebUI.click(sltChangeCaseStatus)
		} catch(StepFailedException e) {
			log.logFailed("Select Case For Test Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
