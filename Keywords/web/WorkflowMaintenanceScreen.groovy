package web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.runner.notification.Failure
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

// Keywords Functions

public class WorkflowMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createWorkflow(String workflowName, String workflowDescription) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/btn_New')
			TestObject entername = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/input_Workflow_Name')
			TestObject enterDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/input_Description_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/btn_Save')

			WebUI.click(btnNew)
			WebUI.setText(entername,workflowName)
			WebUI.setText(enterDescription,workflowDescription)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAndResearch() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Locked_Workflow/span_Locked Workflow')
			TestObject verify = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Locked_Workflow/div_Workflow_Locked_Testing_Xperts')
			TestObject btnResearch = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Locked_Workflow/button_Enter in research')

			WebUI.click(sltWorkflow)
			WebUI.click(btnResearch)
		} catch(StepFailedException e) {
			log.logFailed("Select And Research Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestionnarieAction(String addAction) {
		try {
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Entry_Node_to_Add_Action')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/a_Questionnaire')

			WebUI.click(addEntryNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction,addAction)
			WebUI.click(sltAction)
		}   catch(StepFailedException e) {
			log.logFailed("Create Questionnarie Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createGenerateLetterAction(String addAction2) {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Questionnaire_Node_Add_Action')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/a_Generate Letter')

			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction)
		}  catch(StepFailedException e) {
			log.logFailed("Create Generate Letter Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAddTransactionAction(String addAction3) {
		try {
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Generatte_Letter_Node_Add_Action')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/a_Add Transaction')

			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction, addAction3)
			WebUI.click(sltAction)
		} catch(StepFailedException e) {
			log.logFailed("Create Add Transaction Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createExitPoint() {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Add_Trans_Node_Add_Action')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/button_Save')

			WebUI.click(addEntryNode)
			WebUI.click(addExitPoint)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Create Exit Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editQuestionnarieButton() {
		try {
			TestObject btnEdit = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Edit Questionnaire')

			WebUI.click(btnEdit)
		}    catch(StepFailedException e) {
			log.logFailed("Edit Questionnarie Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def saveWorkflow() {
		try {
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/button_Save')

			WebUI.click(btnSave)
		}   catch(StepFailedException e) {
			log.logFailed("Save Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Locked_Workflow/span_Locked Workflow')

			WebUI.click(sltWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Select Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionnarieMinAndMaxValue(String questionTypeQues, String minValue, String maxValue) {
		try {
			TestObject que2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/input_Question_text')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addMinValue = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/input_Min Value_minValue')
			TestObject addMaxValue = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/input_Max Value_maxValue')
			TestObject btnOk =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_OK')
			TestObject btnSave =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')
			TestObject sltQues =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/div_Questionnaire')
			TestObject btnEdit = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Edit Questionnaire')

			WebUI.click(que2)
			WebUI.setText(textQuestion,questionTypeQues)
			WebUI.setText(addMinValue,minValue)
			WebUI.setText(addMaxValue,maxValue)
			WebUI.click(btnOk)
			WebUI.click(btnSave)
			WebUI.click(sltQues)
			WebUI.click(btnEdit)
			WebUI.click(que2)
			WebUI.clearText(addMinValue)
			WebUI.clearText(addMaxValue)
			WebUI.click(que2)
			WebUI.clearText(que2)
			WebUI.setText(textQuestion,questionTypeQues)
		} catch(StepFailedException e) {
			log.logFailed("Questionnarie Min And Max Value Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectYesNoQuestionFirst(String yesNoQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject yesno = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_YesNo')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject newDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Required_createNewDecision')
			TestObject clkDataField  = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Data Field_Not_Configured')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Data_Field_Not_Configured_textdata')
			TestObject sltValue = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/a_Dispute.CaseAccounts.AccountToken')
			TestObject btnSave =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Data_Field_Save')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(yesno)
			WebUI.setText(textQuestion,yesNoQues)
			WebUI.click(newDecision)
			WebUI.click(clkDataField)
			WebUI.click(textDataField)
			WebUI.click(sltValue)
			WebUI.click(btnSave)
		}   catch(StepFailedException e) {
			log.logFailed("Select Yes No Question First Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectYesNoQuestionSecond(String yesNoQues2) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject yesno = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_YesNo')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject newDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Required_createNewDecision')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(yesno)
			WebUI.setText(textQuestion,yesNoQues2)
			WebUI.click(newDecision)
		}   catch(StepFailedException e) {
			log.logFailed("Select Second Yes No Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkAndCreateMultipleConditions() {
		try {
			TestObject btnOk = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_OK')
			TestObject verifyDecisionPoint = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/condittion_connect_with_Ques_Action')
			TestObject Condition1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Questionnaire_Decision_Address')
			TestObject Condition2 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Questionnarie_Decision_2')
			TestObject sltCondition = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/span_AccountToken  1')
			TestObject btnTest = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Test')
			TestObject textPassed =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Test Passed')
			TestObject conditionSavebtn = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Condition_Save')
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/svg_condition_node')
			TestObject addDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Add Decision_With_Condition')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/button_Save')

			WebUI.click(btnOk)
			WebUI.click(Condition1)
			WebUI.click(sltCondition)
			WebUI.click(btnTest)
			//			WebUI.verifyElementPresent(textPassed, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(conditionSavebtn)
			WebUI.click(btnSave)
		}    catch(StepFailedException e) {
			log.logFailed("Check And Create Multiple Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkAndCreateConditions() {
		try {
			TestObject btnOk = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_OK')
			TestObject verifyDecisionPoint = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/condittion_connect_with_Ques_Action')
			TestObject Condition1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Questionnaire_Decision_Address')
			TestObject Condition2 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Questionnarie_Decision_2')
			TestObject sltCondition = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/span_AccountToken  1')
			TestObject btnTest = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Test')
			TestObject textPassed =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Test Passed')
			TestObject conditionSavebtn = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Condition_Save')
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/svg_Is this your Address_Node')
			TestObject addDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Add Decision_With_Condition')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/button_Save')

			WebUI.click(btnOk)
			GlobalVariable.globalShortDelay
			WebUI.click(Condition1)
			WebUI.click(sltCondition)
			WebUI.click(btnTest)
			//			WebUI.verifyElementPresent(textPassed, GlobalVariable.globalShortDelay)
			WebUI.click(conditionSavebtn)
			GlobalVariable.globalShortDelay
			WebUI.click(btnSave)
		}    catch(StepFailedException e) {
			log.logFailed("Check And Create Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteWorkflow(String deleteWorkflow) {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/span_Provisional Debit')
			TestObject btnDeleteWorkflow =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete Workflow')
			TestObject verifyWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/i_Workflow_used_in_Case_Type')
			TestObject inputDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/input_to_delete_workflow')
			TestObject btnDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete')

			WebUI.click(sltWorkflow)
			GlobalVariable.globalShortDelay
			WebUI.click(btnDeleteWorkflow)
			WebUI.verifyElementPresent(verifyWorkflow, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(inputDelete,deleteWorkflow)
			WebUI.click(btnDelete)
		}  catch(StepFailedException e) {
			log.logFailed("Delete workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkworkflowHistory(String addAction) {
		try {
			TestObject sltHistory1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/clk_History')
			TestObject sltDate1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_Today Record Date')
			TestObject verifyRecord = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/div_Today Record')
			TestObject historyDropdown1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_History_Dropdown')
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_Entry Node for Action')
			TestObject clkAddAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/div_Add Action')
			TestObject addActionName1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/input_Action_Name')
			TestObject sltQues = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_Questionnaire')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/btn_Save')
			TestObject sltHistory2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/clk_History')
			TestObject sltDate2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_Today Record Date')
			TestObject validateQuestionnarie = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/td_Questionnaire')
			TestObject historyDropdown2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_History_Dropdown')

			WebUI.click(sltHistory1)
			WebUI.click(sltDate1)
			WebUI.verifyElementPresent(verifyRecord, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE )
			WebUI.click(historyDropdown1)
			WebUI.click(sltNode)
			WebUI.click(clkAddAction)
			WebUI.setText(addActionName1,addAction)
			WebUI.click(sltQues)
			WebUI.click(btnSave1)
			WebUI.refresh()
			GlobalVariable.globalMediumDelay
			WebUI.click(sltHistory2)
			WebUI.click(sltDate2)
			WebUI.verifyElementPresent(validateQuestionnarie, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(historyDropdown2)
		} catch(StepFailedException e) {
			log.logFailed("Create Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createTransactionAction(String addAction2) {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Questionnaire_Node_Add_Action')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/a_Add Transaction')

			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction, addAction2)
			WebUI.click(sltAction)
		} catch(StepFailedException e) {
			log.logFailed("Create Add Transaction Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openHistory() {
		try {
			TestObject sltHistory3 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/clk_History')
			TestObject sltDate3 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/slt_Today Record Date')

			WebUI.click(sltHistory3)
			WebUI.click(sltDate3)
		} catch(StepFailedException e) {
			log.logFailed("Open History Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setExpirationDays(String staticDataField, String addStaticData) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/span_Edit Expiration Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/a_Dispute.Cases.CreationDate')
			TestObject dataFieldSave  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/select_operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnExpirationSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnExpirationSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Expiration Days Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def creatEexpiredClock(String addAction2) {
		try {
			TestObject sltAlarmExpiredNode =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/svg_Questionnaire_Clock_Expired')
			TestObject addAction =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Action_textarea')
			TestObject sltAction =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/a_Change Case Status')
			TestObject sltStatusNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/svg_Change Case Status_Node')
			TestObject addExit = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/div_Add Exit Point')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/btn_Save')

			WebUI.click(sltAlarmExpiredNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction)
			WebUI.click(sltStatusNode)
			WebUI.click(addExit)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Creat Eexpired Clock Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestion(String questionTypeQues) {
		try {
			TestObject que1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/input_Question_text1')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(que1)
			WebUI.setText(textQuestion,questionTypeQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def configureDataField() {
		try {
			TestObject dataField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/input_Data_Field_Not_Data_Ques')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/input_Data_Field_text_Question')
			TestObject sltData =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/a_Dispute.CaseAccounts.AccountToken')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Configure Data Field Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createStatementQuestion(String statementQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Statement')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,statementQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Statement Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createMultipleChoiceQuestion(String multipleChoiceQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Multiple Choice Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def multipleChoiceQuestionForQuestionnarie(String multipleChoiceQues, String multipleChoiceAns) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnsweer = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Multiple_Choice_Answer_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(addAnswer)
			WebUI.setText(setAnsweer,multipleChoiceAns)
		}  catch(StepFailedException e) {
			log.logFailed("Create Multiple Choice Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createMultipleSelect(String multipleSelectQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Select')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleSelectQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Multiple Select Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def MultipleSelectQuestionForQuestionnarie(String multipleSelectQues, String multipleSelectAns1, String multipleSelectAns2) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Select')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Select_Answer')
			TestObject setAnsweer1  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Multiple_Select_Answer_text1')
			TestObject setAnsweer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Multiple_Select_Answer_text2')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleSelectQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.setText(setAnsweer1,multipleSelectAns1)
			WebUI.setText(setAnsweer2,multipleSelectAns2)
		}  catch(StepFailedException e) {
			log.logFailed("Create Multiple Select Question For Questionnaire Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectYesNoQuestionForQuestionnarie(String yesNoQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject yesno = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_YesNo')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject newDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Required_createNewDecision')
			TestObject question1 = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Yes_No_Question1')
			TestObject question2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Yes_No_Question2')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(yesno)
			WebUI.setText(textQuestion,yesNoQues)
			WebUI.click(newDecision)
			WebUI.click(question1)
			WebUI.click(question2)
		}   catch(StepFailedException e) {
			log.logFailed("Select Yes No Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataTypeQuestionForQuestionnarie(String dataTypeQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Data')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,dataTypeQues)
		}  catch(StepFailedException e) {
			log.logFailed("Data Type Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createDataTypeCondition(String addStaticData) {
		try {
			TestObject editCondition = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/span_Data_Type_Edit_Condition')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Data_Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured')
			TestObject textDataField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured_text')
			TestObject sltdata =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/a_Dispute.CaseAccounts.AccountToken')
			TestObject dataFieldSave  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Operator')
			TestObject textOperator =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/select_Data_Type_Operatoe_textarea')
			TestObject operator  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/select_operator')
			TestObject staticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Stati_Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_static_Field_textarea')
			TestObject btnSave =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Save')

			WebUI.click(editCondition)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.click(sltdata)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create Data Type Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataSetterQuetionForQuestionnarie(String dataSetterQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Data Setter')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,dataSetterQues)
		}   catch(StepFailedException e) {
			log.logFailed("Data Setter Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def attachmentQuestionForQuestionnarie(String attachmentQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Attachment')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,attachmentQues)
		} catch(StepFailedException e) {
			log.logFailed("Attachment Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def accountQuestionForQuestionnarie(String accountQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Account')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,accountQues)
		}  catch(StepFailedException e) {
			log.logFailed("Account Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def routingTransitQuestionForQuestionnarie(String routingTransitQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Routing Transit')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,routingTransitQues)
		}  catch(StepFailedException e) {
			log.logFailed("Routing Transit Question For Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectOk() {
		try {
			TestObject bntOk =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_OK')

			WebUI.click(bntOk)
		}    catch(StepFailedException e) {
			log.logFailed("Select Ok Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestionUnderYesNo(String multipleChoiceQues, String statementQues) {
		try {
			TestObject question1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/button_Yes_No_Question1')
			TestObject textField1  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/input_Yes_Question_text1')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/div_Answer_Type_Question')
			TestObject sltMultiple =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/div_Yes_Path_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject question2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/button_Yes_No_Question2')
			TestObject textField2 =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/input_No_Question_text2')
			TestObject sltStatement =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/div_Statement')

			WebUI.click(question1)
			WebUI.click(textField1)
			WebUI.click(question)
			WebUI.click(sltMultiple)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(question2)
			WebUI.click(textField2)
			WebUI.click(question)
			WebUI.click(sltStatement)
			WebUI.setText(textQuestion,statementQues)
		}   catch(StepFailedException e) {
			log.logFailed("create QuestionUnder Under Yes No Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def copyPasteInsideYesNo() {
		try {
			TestObject yesChildQus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/input_Yes_Multi_Choice_Ques_text')
			TestObject copyQues = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/div_Yes_Multiple_Choice_Copy')
			TestObject yesChildAns = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/input_Yes_Multi_Choice_Ans_text')
			TestObject pasteQues = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/div_Yes_Multi_Choice_Ans_Paste')

			WebUI.click(yesChildQus)
			WebUI.rightClick(yesChildQus)
			WebUI.click(copyQues)
			WebUI.click(yesChildAns)
			WebUI.rightClick(yesChildAns)
			WebUI.click(pasteQues)
		}    catch(StepFailedException e) {
			log.logFailed("Copy Paste Inside Yes No Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def copyAllQuestionarie() {
		try {
			TestObject sltYesNoQues =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/span_Yes_No_Question_select')
			TestObject yesNoQuesCopy = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/span_Yes_No_Question_Copy')

			WebUI.click(sltYesNoQues)
			WebUI.rightClick(sltYesNoQues)
			WebUI.click(yesNoQuesCopy)
		}   catch(StepFailedException e) {
			log.logFailed("Copy All Questionarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def pasteInOtherQuestionnarie() {
		try {
			TestObject clickQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/span_Ques_another_Questionnarie')
			TestObject pasteQuestionnarie =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Copy_Paste_Questionnarie/span_Ques_Paste_Questionnarie')

			WebUI.rightClick(clickQuestion)
			WebUI.click(pasteQuestionnarie)
		}   catch(StepFailedException e) {
			log.logFailed("Paste In Other Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def verifyWorkflow() {
		try {
			TestObject demoType1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Demo Type 1')
			TestObject icon = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/svg_Demo_Modified_Over_Base')
			TestObject verifyEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Entry Node')
			TestObject verifyQuesAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Questionnaire')
			TestObject verifyGenLetAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Generate Letter')
			TestObject verifyTranAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Add Transaction')
			TestObject verifyExitNode = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Alter Workflow/div_Alter_Exit Point')

			WebUI.verifyElementPresent(verifyEntryNode, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyQuesAction, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyGenLetAction, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyTranAction, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(verifyExitNode, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
		}   catch(StepFailedException e) {
			log.logFailed("Verify Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createFundsAcquisitionAction(String addAction) {
		try {
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Entry_Node_to_Add_Action')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Action_Parameters/a_Funds Acquisition')

			WebUI.click(addEntryNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction,addAction)
			WebUI.click(sltAction)
		}  catch(StepFailedException e) {
			log.logFailed("create Funds Acquisition Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setActionParameters(String sltTemplate1, String sltTemplate2, String sltTemplate3) {
		try {
			TestObject sltFeeAmountTemp = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Action_Parameters/select_Fee_Amount_Template')
			TestObject sltHoldAmountTemp = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Action_Parameters/select_Hold_Amount_Template')
			TestObject sltTakeAmountTemp = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Action_Parameters/select_Take_Amount_Template')

			WebUI.click(sltFeeAmountTemp)
			WebUI.selectOptionByLabel(sltFeeAmountTemp, sltTemplate1, true)
			WebUI.click(sltHoldAmountTemp)
			WebUI.selectOptionByLabel(sltHoldAmountTemp, sltTemplate2, true)
			WebUI.click(sltTakeAmountTemp)
			WebUI.selectOptionByLabel(sltTakeAmountTemp, sltTemplate3, true)
		}   catch(StepFailedException e) {
			log.logFailed("Set Action Parameters Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createNewWorkflow(String anotherWorkflow, String workflowDescription) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/btn_New')
			TestObject nameRequired = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Create_New_Workflow/div_Name is required')
			TestObject entername = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/input_Workflow_Name')
			TestObject descriptionRequired = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Create_New_Workflow/div_Description is required')
			TestObject enterDescription = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_History/input_Description_Name')

			WebUI.click(btnNew)
			WebUI.mouseOver(nameRequired)
			WebUI.setText(entername,anotherWorkflow)
			WebUI.mouseOver(descriptionRequired)
			WebUI.setText(enterDescription,workflowDescription)
		} catch(StepFailedException e) {
			log.logFailed("Create New Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickWorkflowMaintenance() {
		try {
			TestObject homeWorkflow =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Create_New_Workflow/div_Workflow Maintenance')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Create_New_Workflow/span_verify_Account Check')

			WebUI.click(homeWorkflow)
			WebUI.click(sltWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Click Workflow Maintenance Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createChangeCaseStatusAction(String addAction, String sltTemplate1) {
		try{
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Entry_Node_to_Add_Action')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAaction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/a_Change Case Status')
			TestObject actionParameter =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/div_Change_Case_Status')
			TestObject newStatus = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/select_New_Status')
			TestObject sltCaseStatus =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/ddl_Select_Status_Change_Case_Status')

			WebUI.click(addEntryNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction, addAction)
			WebUI.click(sltAaction)
			WebUI.click(newStatus)
			WebUI.selectOptionByLabel(newStatus, sltTemplate1, true)
		}  catch(StepFailedException e) {
			log.logFailed("Create Change Case Status Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountingEntriesAction(String addAction2, String sltTemplate2) {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/svg_Change_Case_Status_Entry_Node')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/a_Create Accounting Entries')
			TestObject chkBoxExternalEntry = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/chk_Action_Parameters_ExternalEntry')
			TestObject tempalte = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/select_Create_Accounting_Entries_Tmp')
			TestObject sltTemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/ddl_Slt_Template_Create_Acc_Entries')

			WebUI.click(sltNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction)
			WebUI.click(tempalte)
			WebUI.selectOptionByLabel(tempalte, sltTemplate2, true)
		}  catch(StepFailedException e) {
			log.logFailed("Create Accounting Entries Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createTestButton() {
		try {
			TestObject clkTestButton = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/button_Test')

			WebUI.click(clkTestButton)
		} catch(StepFailedException e) {
			log.logFailed("Create Test Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowToDelete1() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/span_Create_Delete_Workflow')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow To Delete Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteNewCreatedWorkflow() {
		try {
			TestObject btnDeleteWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete Workflow')
			TestObject verifytext = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/p_you want to Delete entire workflow')
			TestObject verify =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/div_To_Delete_work,_type delete_txt in field')

			WebUI.click(btnDeleteWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Delete New Created Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def wantToDeleteWorkflow(String deleteWorkflow) {
		try {
			TestObject textField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/input_to_delete_workflow')
			TestObject btnDelete = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete_Workflow_Delete')

			WebUI.setText(textField,deleteWorkflow)
			WebUI.click(btnDelete)
		}  catch(StepFailedException e) {
			log.logFailed("Want To Delete Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def buttonCommitVersion() {
		try {
			TestObject btnCommitVersion  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/button_Commit_Version')

			WebUI.click(btnCommitVersion)
		}  catch(StepFailedException e) {
			log.logFailed("Button Commit Version Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def commitWorkflowDetails(String changeWorkflowDetail) {
		try {
			TestObject chageDetails = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/input_Commit_Workflow_Cng_Dlt')
			TestObject sltUpgradecases = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/input_Upgrade_Case_Type')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/button_Commit_Workflow_Save')

			WebUI.setText(chageDetails,changeWorkflowDetail)
			WebUI.click(btnSave)
		}   catch(StepFailedException e) {
			log.logFailed("Commit Workflow Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkInfoExpander() {
		try {
			TestObject sltInfo = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/div_Workflow_Information')

			WebUI.click(sltInfo)
		} catch(StepFailedException e) {
			log.logFailed("Check Info Expander Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def multiplechoiceWithDecisionPoint(String multipleChoiceQues, String multipleChoiceAns, String multipleChoiceAns2, String multipleChoiceAns3) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnswer = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Answer_text1')
			TestObject setAnswer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text2')
			TestObject setAnswer3 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text3')
			TestObject newDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Required_createNewDecision')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(setAnswer)
			WebUI.setText(setAnswer,multipleChoiceAns)
			WebUI.click(newDecision)
			WebUI.click(setAnswer2)
			WebUI.setText(setAnswer2, multipleChoiceAns2)
			WebUI.click(newDecision)
			WebUI.click(setAnswer3)
			WebUI.setText(setAnswer3,multipleChoiceAns3)
			WebUI.click(newDecision)
		} catch(StepFailedException e) {
			log.logFailed("Multiple Choice With Decision Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createExitPoint1() {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node1')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
		} catch(StepFailedException e) {
			log.logFailed("Create Exit Point1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createExitPoint2() {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Point2')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
		} catch(StepFailedException e) {
			log.logFailed("Create Exit Point2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createExitPoint3() {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node3')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
		} catch(StepFailedException e) {
			log.logFailed("Create Exit Point3 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createExitPoint4() {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node4')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
		} catch(StepFailedException e) {
			log.logFailed("Create Exit Point4 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteMultipleExitPointWorkflow(String deleteWorkflow) {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/span_Multiple Exit Points')
			TestObject btnDeleteWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete Workflow')
			TestObject verifyWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/i_Workflow_used_in_Case_Type')
			TestObject inputDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/input_to_delete_workflow')
			TestObject btnDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/button_Delete')

			WebUI.click(sltWorkflow)
			GlobalVariable.globalShortDelay
			WebUI.click(btnDeleteWorkflow)
			GlobalVariable.globalShortDelay
			WebUI.setText(inputDelete,deleteWorkflow)
			WebUI.click(btnDelete)
		}  catch(StepFailedException e) {
			log.logFailed("Delete Multiple Exit Point workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowToDelete2() {
		try {
			TestObject sltWorkflow =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/span_Base_Workflow_Case_Type')
			TestObject sltDropdown =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/svg_Base_Workflow_Case_Type_Drop')
			TestObject caseType  = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Delete/div_Grouped_By_Case')

			WebUI.click(sltWorkflow)
			WebUI.click(sltDropdown)
			//	WebUI.click(caseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Workflow To Delete 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQuestionnarieAction() {
		try {
			TestObject sltAction  =	 findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Modify_Workflow/div_Questionnaire')

			WebUI.click(sltAction)
		}  catch(StepFailedException e) {
			log.logFailed("Select Questionnarie Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultiplechoiceWithDecisionPoint(String multipleChoiceQues, String multipleChoiceAns, String multipleChoiceAns2, String multipleChoiceAns3, String multipleChoiceAns4) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnswer = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Answer_text1')
			TestObject setAnswer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text2')
			TestObject setAnswer3 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text3')
			TestObject setAnswer4 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text4')
			TestObject newDecision = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/input_Required_createNewDecision')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(setAnswer)
			WebUI.click(setAnswer)
			WebUI.setText(setAnswer,multipleChoiceAns)
			WebUI.click(newDecision)
			WebUI.click(setAnswer2)
			WebUI.setText(setAnswer2, multipleChoiceAns2)
			WebUI.click(newDecision)
			WebUI.click(setAnswer3)
			WebUI.setText(setAnswer3,multipleChoiceAns3)
			WebUI.click(newDecision)
			WebUI.click(setAnswer4)
			WebUI.setText(setAnswer4,multipleChoiceAns4)
			WebUI.click(newDecision)
		} catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice With Decision Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createProvisionalCreditExitPoint1(String exitPoint1) {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node1')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject entryField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/textarea_Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
			WebUI.setText(entryField,exitPoint1)
		} catch(StepFailedException e) {
			log.logFailed("create Provisional Credit Exit Point1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createFinalWriteOffExitPoint2(String exitPoint2) {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Point2')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject entryField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/textarea_Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
			WebUI.setText(entryField,exitPoint2)
		} catch(StepFailedException e) {
			log.logFailed("create Final Write Off Exit Point2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createMRCExitPoint3(String exitPoint3) {
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node3')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject entryField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/textarea_Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
			WebUI.setText(entryField,exitPoint3)
		} catch(StepFailedException e) {
			log.logFailed("Create MRC Exit Point3 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createDenyDisputeExitPoint4(String exitPoint4){
		try {
			TestObject sltNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/svg_Exit_Node4')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject entryField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/textarea_Exit Point')

			WebUI.click(sltNode)
			WebUI.click(addExitPoint)
			WebUI.setText(entryField,exitPoint4)
		} catch(StepFailedException e) {
			log.logFailed("Create Deny Dispute Exit Point4 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkDecisionPoints() {
		try {
			TestObject decision1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/div_Questionnaire_Decision1')
			TestObject decision2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/div_Questionnaire_Decision2')
			TestObject decision3 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/div_Questionnaire_Decision3')
			TestObject decision4 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/div_Questionnaire_Decision4')

			WebUI.click(decision1)
			WebUI.click(decision2)
			WebUI.click(decision3)
			WebUI.click(decision4)
		}  catch(StepFailedException e) {
			log.logFailed("Check Decision Points Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteQuestionnarie() {
		try {
			TestObject sltDelete = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Questions/svg_Delete_Answer')

			WebUI.click(sltDelete)
		} catch(StepFailedException e) {
			log.logFailed("Delete Questionnarie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleSelectWithDecisionPoint(String multipleSelectQues, String multipleSelectAns1, String multipleSelectAns2) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Select')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnswer = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Answer_text1')
			TestObject setAnswer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text2')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleSelectQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.setText(setAnswer,multipleSelectAns1)
			WebUI.click(setAnswer2)
			WebUI.setText(setAnswer2, multipleSelectAns2)
		} catch(StepFailedException e) {
			log.logFailed("Multiple Choice With Decision Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteMultipleChoiceWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Questions/span_Create_Multiple_Choice')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Delete Multiple Choice Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteMultipleSelectWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Questions/span_Create_Multiple_Select')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Delete Multiple Select Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteLinkDecisionPointsWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/span_Link_Decision_Points')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Delete Multiple Select Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteTranscodeQuestionWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/span_Transcode_Question')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Delete Transcode Question Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTypeSpecificWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_validate_Signal_R/span_Type_Specific')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Type Specific Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateExitPointName(String exitPoint1) {
		try {
			TestObject sltExitPoint = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_validate_Signal_R/div_Exit Point')
			TestObject entryField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Link_Questions/textarea_Exit Point')

			WebUI.click(sltExitPoint)
			WebUI.click(entryField)
			WebUI.setText(entryField,exitPoint1)
		} catch(StepFailedException e) {
			log.logFailed("Update Exit Point Name Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def configureQuestionDataField(String addStaticData1) {
		try {
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/input_Data_Field_Not_Data_Ques')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/input_Data_Field_text_Question')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/a_Dispute.CaseOrderInformation.ReleaseDate')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, addStaticData1)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Configure Question Data Field Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createFundsReleaseAction(String addAction2) {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Questionnaire_Node_Add_Action')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/a_Funds_Release')

			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction)
		}  catch(StepFailedException e) {
			log.logFailed("Create Funds Release Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setDelayedStartDays(String staticDataField, String addStaticData) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/span_Edit_Delayed_Start_Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/mark_Dispute.CaseActions.DelayedStartDate')
			TestObject dataFieldSave  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/select_Equal_Operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnExpirationSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnExpirationSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Delayed Start Days Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectVersionUpgradeWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Upgrade_Version_Workflow/span_Version_Upgrade')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Version Upgrade Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def commitWorkflowUpgradeDetails(String changeWorkflowDetail) {
		try {
			TestObject chageDetails = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/input_Commit_Workflow_Cng_Dlt')
			TestObject sltUpgradecases = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/input_Upgrade_Case_Type')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Commit_Workflow/button_Commit_Workflow_Save')

			WebUI.setText(chageDetails,changeWorkflowDetail)
			WebUI.click(sltUpgradecases)
			WebUI.click(btnSave)
		}   catch(StepFailedException e) {
			log.logFailed("Commit Version Upgrade Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataSetterQuesWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/span_Data_Setter_Ques')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Setter Ques Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAccountingEntriesAction(String addAction) {
		try {
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Entry_Node_to_Add_Action')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/a_Create Accounting Entries')

			WebUI.click(addEntryNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction,addAction)
			WebUI.click(sltAction)
		}   catch(StepFailedException e) {
			log.logFailed("Create Accounting Entries Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def verifyGeneralSetting() {
		try {
			TestObject timeEstimation = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/input_Time_Estimate')
			TestObject userLevel = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/label_User_Level')
			TestObject delayedDays = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/span_Edit_Delayed_Start_Days')
			TestObject expirationdays = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/span_Edit_Expiration_Days')
			TestObject watchdays = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/input_Watch_Days')
			TestObject chkbox = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/chk_Watch_Days_CaseLevel')

			WebUI.verifyElementPresent(timeEstimation, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(userLevel, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(delayedDays, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(expirationdays, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(watchdays, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(chkbox, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		}   catch(StepFailedException e) {
			log.logFailed("Verify general Setting Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setDelayedStartDaysCondition(String staticDataField, String addStaticData) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/span_Edit_Delayed_Start_Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/mark_Dispute.Cases.CreationDate')
			TestObject dataFieldSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/select_AddBusinessDays_Operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnDelauedSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnDelauedSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Delayed Start Days Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setExpirationDaysCondition(String staticDataField, String addStaticData) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/span_Edit Expiration Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/mark_Dispute.Cases.CreationDate')
			TestObject dataFieldSave  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/select_AddDays_Operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnExpirationSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnExpirationSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Expiration Days Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectConditionEditiorWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/span_Condition_Editor')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Condition Editior Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setDelayedStartDaysCalculatedAction(String staticDataField, String addStaticData) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/span_Edit_Delayed_Start_Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/mark_Dispute.Cases.CreationDate')
			TestObject dataFieldSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Calculated_Actions_Workflow/select_Plus_Operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnDelauedSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnDelauedSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Delayed Start Days Calculated Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setExpirationDaysCalculatedAction(String staticDataField, String addStaticData1) {
		try {
			TestObject setExpiration = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/span_Edit Expiration Days')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Data Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configure')
			TestObject textDataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Data_Field_Not_Configured_textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/mark_Dispute.Cases.CreationDate')
			TestObject dataFieldSave  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Data_Field_Text_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Operator')
			TestObject textOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Operator_textarea')
			TestObject operator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Calculated_Actions_Workflow/select_Plus_Operator')
			TestObject staticField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/button_Static Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Action_Expiration/input_Required_static_Field_textarea')
			TestObject btnExpirationSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/button_Expiration_Days_Editor_Text_Save')

			WebUI.click(setExpiration)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.setText(textDataField,staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData1)
			WebUI.click(btnExpirationSave)
		} catch(StepFailedException e) {
			log.logFailed("Set Expiration Days Calculated Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCalculatedActionWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Calculated_Actions_Workflow/span_Calculated_Actions')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Calculated Action Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def configureMultipleChoiceQuestionWithOptionQuery(String multipleChoiceQues, String multipleChoiceAns, String multipleChoiceAns2, String defaultQuery) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnswer = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Answer_text1')
			TestObject setAnswer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text2')
			TestObject queryText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/textarea_Multiple_Choice_Query_Text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.setText(setAnswer,multipleChoiceAns)
			WebUI.click(setAnswer2)
			WebUI.setText(setAnswer2, multipleChoiceAns2)
			WebUI.click(queryText)
			WebUI.setText(queryText, defaultQuery)
		} catch(StepFailedException e) {
			log.logFailed("Configure Multiple Choice Question With Option Query Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def uncheckRequireCheckboxd() {
		try {
			TestObject sltCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/chk_Query_Required')


			WebUI.click(sltCheckbox)
		} catch(StepFailedException e) {
			log.logFailed("uncheck Require Checkboxd Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceReuiredWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/span_Multiple_Choice_Required')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Required Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataFieldForMultipleChoice(String staticDataField) {
		try {
			TestObject dataField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/input_Data_Field_Not_Data_Ques')
			TestObject addtext = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/input_Data_Field_textarea')
			TestObject sltData =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/mark_Dispute.Cases.OriginalBankID')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(addtext)
			WebUI.setText(addtext, staticDataField)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Data Field For Multiple Choice Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEntryCaseWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/span_Entry_Case')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Entry Case Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectReuiredWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/span_Multiple_Select_Required')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Required Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def multipleSelectRequiredQuestion(String multipleSelectQues, String multipleSelectAns1, String multipleSelectAns2, String defaultQuery) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Select')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/button_Multiple_Select_Answer')
			TestObject setAnsweer1  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/input_Multiple_Select_Answer_text1')
			TestObject setAnsweer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/input_Multiple_Select_Answer_text2')
			TestObject queryText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/textarea_Multiple_Choice_Query_Text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleSelectQues)
			WebUI.click(addAnswer)
			WebUI.click(addAnswer)
			WebUI.setText(setAnsweer1,multipleSelectAns1)
			WebUI.setText(setAnsweer2,multipleSelectAns2)
			WebUI.click(queryText)
			WebUI.setText(queryText, defaultQuery)
		}  catch(StepFailedException e) {
			log.logFailed("Multiple Select Required Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def configureMultipleChoiceQuestionWithoutOptions(String multipleChoiceQues, String defaultQuery) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Choice')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Multiple_Choice_Answer')
			TestObject setAnswer2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Updated_Version_Multiple_Exit_Points/input_Question_text2')
			TestObject queryText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/textarea_Multiple_Choice_Query_Text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleChoiceQues)
			WebUI.click(addAnswer)
			WebUI.click(queryText)
			WebUI.setText(queryText, defaultQuery)
		} catch(StepFailedException e) {
			log.logFailed("Configure Multiple Choice Question Without Option Query Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultiplChoiceWithoutOption() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/span_Multiple_Choice_Without_Option')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Without Option Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceNotRequiredWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/span_Multiple_Choice_Not_Required')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice No Required Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceNotQueryWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Choice_Required_Workflow/span_Multiple_Choice_Not_Query')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Not Query Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def multipleSelectRequiredWithoutQuery(String multipleSelectQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject question = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Questionnarie/div_Multiple Select')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')
			TestObject addAnswer  =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/button_Multiple_Select_Answer')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(question)
			WebUI.setText(textQuestion,multipleSelectQues)
			WebUI.click(addAnswer)
		}  catch(StepFailedException e) {
			log.logFailed("Multiple Select Required Without Query Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectWithoutOptionWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/span_Multiple Select_Without_Option')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Without Option Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotRequiredWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/span_Multiple Select_Not_Required')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Not Required Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotQueryWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Select_Required_Workflow/span_Multiple_Select_Not_Query')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Not Query Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectQuestionnarieDataFieldWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Set_Data_Field_Questionnarie/span_Questionnarie_Data_Field')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Questionnarie Data Field Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def actionParameterTemplate(String sltTemplate1) {
		try {
			TestObject sltActionTemp =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/select_Action_Parameter_Template')

			WebUI.click(sltActionTemp)
			WebUI.selectOptionByLabel(sltActionTemp, sltTemplate1, true)
		}   catch(StepFailedException e) {
			log.logFailed("Action Parameters Template Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dataSetterCondition(String staticDataField, String addStaticData) {
		try {
			TestObject sltCondition =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/span_Condition')
			TestObject notCongigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/input_Data_Field_Not_Configured')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/input_Data_Field_Not_Configured_Textarea')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/mark_Dispute.CaseAmount')
			TestObject dataFieldSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured_Save')
			TestObject sltStaticData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/button_Static_Field')
			TestObject staticDataText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Hide_Data_Setter_Ques/input_Required_Static_Text')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Save')

			WebUI.click(sltCondition)
			WebUI.click(notCongigured)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, staticDataField)
			WebUI.click(sltData)
			WebUI.click(dataFieldSave)
			WebUI.click(sltStaticData)
			WebUI.click(staticDataText)
			WebUI.setText(staticDataText, addStaticData)
			WebUI.click(btnSave)
		}   catch(StepFailedException e) {
			log.logFailed("Data Setter Condition Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addGenerateLetterAction(String addAction2) {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/svg_Create_Accounting_Entries_Node')
			TestObject addAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/a_Generate Letter')

			WebUI.click(addEntryNode)
			WebUI.click(addAction)
			WebUI.setText(textAction,addAction2)
			WebUI.click(sltAction)
		}  catch(StepFailedException e) {
			log.logFailed("Add Generate Letter Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addActionParameterBodyTemplate(String sltTemplate2) {
		try {
			TestObject bodyTemplate = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/select_Body_Template_Name')

			WebUI.click(bodyTemplate)
			WebUI.selectOptionByLabel(bodyTemplate, sltTemplate2, true)
		}   catch(StepFailedException e) {
			log.logFailed("Add Action Parameter Body Template Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectConditionBuilderWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Condition_Editior_Workflow/span_Condition_Builder')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Condition Builder Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestion2(String statementQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.setText(textQuestion,statementQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Question 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestion3(String multipleChoiceQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.setText(textQuestion,multipleChoiceQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Question 3 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestion4(String yesNoQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.setText(textQuestion,yesNoQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Question 4 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestion5(String dataTypeQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.setText(textQuestion,dataTypeQues)
		}  catch(StepFailedException e) {
			log.logFailed("Create Question 5 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataTypeQuestionnaireWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/span_Data_Types_Questionnaire')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Type Questionnaire Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionDataFieldAmount(String staticDataField) {
		try {
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Question_Data_Field')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Data_Field_text_Question')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/mark_Dispute.Cases.Amount')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, staticDataField)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Question Data Field Amount Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionDataFieldDate(String addStaticData) {
		try {
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Question_Data_Field')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Data_Field_text_Question')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/mark_Dispute.CaseTransactionsDate')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, addStaticData)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Question Data Field Date Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionDataFieldNumber(String addStaticData1) {
		try {
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Question_Data_Field')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Data_Field_text_Question')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/mark_Dispute.Case.ROLTransactionID')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, addStaticData1)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Question Data Field Number Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionDataFieldBoolean(String addStaticData2) {
		try {
			TestObject dataField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Question_Data_Field')
			TestObject dataFieldText = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/input_Data_Field_text_Question')
			TestObject sltData = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Data_Types_Questionnaire/mark_Dispute.CaseTransactions.Credit')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow_Min_Max_Value/button_Save')

			WebUI.click(dataField)
			WebUI.click(dataFieldText)
			WebUI.setText(dataFieldText, addStaticData2)
			WebUI.click(sltData)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Question Data Field Boolean Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseQuestionnaireWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Upgrade_Version_Workflow/span_Case_Questionnaire')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Questionnaire Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAutoWriteOffPathWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Write_Off/span_Auto_Write_Off_Path')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Auto Write Off Path Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAutNoWritePathWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Write_Off/span_Auto_No_Write_Path')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Auto No Write Path Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def configureAutoWritePath() {
		try {
			TestObject noWriteOffPath = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Write_Off/svg_Auto_No_Write_Off')
			TestObject writeOffPath =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Write_Off/svg_Auto_Write_Off')

			WebUI.mouseOver(noWriteOffPath)
			WebUI.verifyElementPresent(noWriteOffPath, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.mouseOver(writeOffPath)
			WebUI.verifyElementPresent(writeOffPath, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Configure Auto Write Path Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAutoWriteOffAction(String addAction) {
		try {
			TestObject addEntryNode= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Entry_Node_to_Add_Action')
			TestObject addAction1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Action')
			TestObject textAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/input_Workflow_Action')
			TestObject sltAction = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Auto_Write_Off/a_Auto Write Off')

			WebUI.click(addEntryNode)
			WebUI.click(addAction1)
			WebUI.setText(textAction,addAction)
			WebUI.click(sltAction)
		}   catch(StepFailedException e) {
			log.logFailed("Create Auto Write Off Action Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createYesNoQuestion(String yesNoQues) {
		try {
			TestObject btnQuestion =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/button_Question')
			TestObject sltQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_Question')
			TestObject yesno = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/div_YesNo')
			TestObject textQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Multiple_Conditions/textarea_Question_text')

			WebUI.click(btnQuestion)
			WebUI.click(sltQuestion)
			WebUI.click(yesno)
			WebUI.setText(textQuestion,yesNoQues)
		}   catch(StepFailedException e) {
			log.logFailed("Select Yes No Question Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def questionSourceType() {
		try {
			TestObject yesQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Apply_Source_Type/button_Question_Yes')
			TestObject noQuestion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Apply_Source_Type/button_Question_No')
			TestObject questionType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Apply_Source_Type/svg_Question_Type_Apply_To_All')
			TestObject sourceType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Apply_Source_Type/svg_Source_Type_Apply_To_All')

			WebUI.click(yesQuestion)
			WebUI.click(noQuestion)
			WebUI.click(questionType)
			WebUI.click(sourceType)
		}   catch(StepFailedException e) {
			log.logFailed("Question Source Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createQuestionnaireExitPoint() {
		try {
			TestObject addEntryNode = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/svg_Questionnaire_Node_Add_Action')
			TestObject addExitPoint =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/div_Add Exit Point')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Basic_Workflow/button_Save')

			WebUI.click(addEntryNode)
			WebUI.click(addExitPoint)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Create Questionnaire Exit Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectSourceTypeWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Apply_Source_Type/span_Source_Type')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Source Type Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCopyPasteWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Copy Paste Workflow')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Copy Paste Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAccountCheckWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Create_New_Workflow/span_verify_Account Check')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Account Check Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEntryPointWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Entry Point')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Entry Point Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAddWorkflow1() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Add Workflow1')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Add Workflow1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAddWorkflow2() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Add Workflow2')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Add Workflow2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAdhocWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Adhoc Workflow')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Adhoc Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectOneExitPointWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_One Exit Point')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select One Exit Point Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAddMultipleStageWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Add Multiple Stage')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select One Exit Point Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectNodeExitPointWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Stage Node Exit Point')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Node Exit Point Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectStageNodeAnotherExitPointWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Stage_Node_Another_Exit_Point')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Stage Node Another Exit Point Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectExitPointMultipleVersionWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Exit point with version')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Exit Point Multiple Version Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAddWorkflowVersionWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Workflow Maintenance_Assertions/span_Add Workflow Version')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Add Workflow Version Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectModifyWorkflowOverBaseWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Modify_Workflow/span_Modify_Workflow_Over_Base')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Modify Workflow Over Base Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectModifyCasewithoutBaseWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Modify_Workflow/span_Modify_Case_without_Base')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Modify Case Without Base Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTestActionParametersWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Test_Button_Action_Parameters/span_Test_Action_Parameters')

			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Select Test Action Parameters Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}