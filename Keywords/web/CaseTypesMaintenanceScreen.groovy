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

// Keywords Functions

public class CaseTypesMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def createCaseType(String caseName) {
		try {
			TestObject btnNew =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Case_Type_New')
			TestObject addNewType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/span_Add_New_Type')
			TestObject casetypeName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/input_Type_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Save')

			WebUI.click(btnNew)
			WebUI.click(addNewType)
			WebUI.setText(casetypeName,caseName)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def typeOptionsViewInitiallyCollapsed() {
		try {
			TestObject sltCaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_View_Initially_Collapsed/button_Credit_Card_Bill')
			TestObject typeOptions = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_View_Initially_Collapsed/span_Type Options')

			WebUI.click(sltCaseType)
			WebUI.click(typeOptions)
			WebUI.click(typeOptions)
		} catch(StepFailedException e) {
			log.logFailed("Type Options View Initially Collapsed Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editCaseTypeNameDetails(String editName, String frontOffice, String backOffice, String creditWriteOff, String debitWriteOff, String removeCreditOff, String removeDebitOff) {
		try {
			TestObject sltcaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/button_Credit_Card_Rupay_Case')
			TestObject editname = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/input_Name_description')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/button_Save')
			TestObject typeOptions = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/div_Type Options')
			TestObject frontoffice = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/input_Front Office_webInstructions')
			TestObject backoffice = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/input_Back Office_Instructions')
			TestObject btnSave2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/button_Save')
			TestObject creditWrite = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/input_Credit Write Off_fLimit')
			TestObject debitWrite =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/input_Debit Write Off_Limit')
			TestObject sltDiffCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/button_ATM')
			TestObject sltCaseA =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Edit_Name_Type_Options/button_Credit_Card_Type_Case')

			WebUI.click(sltcaseType)
			WebUI.clearText(editname)
			WebUI.setText(editname,editName)
			WebUI.click(btnSave1)
			WebUI.click(typeOptions)
			WebUI.setText(frontoffice,frontOffice)
			WebUI.setText(backoffice,backOffice)
			WebUI.click(btnSave2)
			WebUI.setText(creditWrite,creditWriteOff)
			WebUI.setText(debitWrite,debitWriteOff)
			WebUI.click(btnSave2)
			WebUI.clearText(creditWrite)
			WebUI.setText(creditWrite,removeCreditOff)
			WebUI.clearText(debitWrite)
			WebUI.setText(debitWrite,removeDebitOff)
			WebUI.click(btnSave1)
			WebUI.refresh()
			WebUI.click(sltDiffCase)
			WebUI.click(sltCaseA)
			WebUI.click(typeOptions)
		} catch(StepFailedException e) {
			log.logFailed("Edit Case Type Name Details Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflowInTypecase(String workflowName) {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Matched_Case')
			TestObject editStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/svg_Progress Edit')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/slt_A_Workflow_Attach_Type Case')
			TestObject sltWorkflowDropdown =findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/select_Check_Workflow_In_Dropdown')
			TestObject btnClose = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Close')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Save')

			WebUI.click(sltCase)
			WebUI.click(editStage)
			WebUI.click(sltWorkflow)
			WebUI.selectOptionByLabel(sltWorkflow, workflowName, true)
			WebUI.click(btnClose)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Add Workflow In Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkStageWorkflow() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Matched_Case')
			TestObject editStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/svg_Progress Edit')
			TestObject sltWorkflow2 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/div_Check_Selected_Workflow')

			WebUI.click(sltCase)
			WebUI.click(editStage)
			WebUI.click(sltWorkflow2)
		}  catch(StepFailedException e) {
			log.logFailed("Check Stage Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editPasteStageInSameType() {
		try {
			TestObject sltcaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Debit_Card')
			TestObject hoverOver =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Copy Stage icon')
			TestObject copyStage =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Copy Stage icon')
			TestObject pasteStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Paste Stage Icon')
			TestObject editStage =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Edit Pasted Stage')
			TestObject close = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Close')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Save')

			WebUI.click(sltcaseType)
			WebUI.mouseOver(hoverOver)
			WebUI.click(copyStage)
			WebUI.click(pasteStage)
			WebUI.click(editStage)
			WebUI.click(close)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Edit Paste Stage In Same Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def copyStageFromOneType() {
		try {
			TestObject sltcaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Debit_Card_Visa')
			TestObject hoverOver =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Copy Stage icon')
			TestObject copyStage =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Copy Stage icon')

			WebUI.click(sltcaseType)
			WebUI.mouseOver(hoverOver)
			WebUI.click(copyStage)
		} catch(StepFailedException e) {
			log.logFailed("Copy Stage From One Typee Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def pasteStageInDifferentType() {
		try {
			TestObject sltCase2 =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Z_DNU')
			TestObject pasteSatge = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Paste Stage Icon')
			TestObject editStage =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/svg_Edit Pasted Stage')
			TestObject close = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Close')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Save')

			WebUI.click(sltCase2)
			WebUI.click(pasteSatge)
			WebUI.click(editStage)
			WebUI.click(close)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Paste Stage In Different Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDebitCardVisaType() {
		try {
			TestObject sltcaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage Copy Paste/button_Debit_Card_Visa')

			WebUI.click(sltcaseType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Debit Card Visa Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMainType() {
		try {
			TestObject sltMainType  = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/button_Main_Parent_Dispute')

			WebUI.click(sltMainType)
		}  catch(StepFailedException e) {
			log.logFailed("Select Main Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createDuplicateStage(String stageName) {
		try {
			TestObject sltPlusIcon = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_Add_Stages_Plus-Circle')
			TestObject stName = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/add_New_Submitted_Stage_Name')
			TestObject stageEdit =	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_New_Stages_Edit')

			WebUI.click(sltPlusIcon)
			WebUI.setText(stName,stageName)
			WebUI.click(stageEdit)
		}  catch(StepFailedException e) {
			log.logFailed("Create Duplicate Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createDuplicateSubmittedStage(String stageName) {
		try {
			TestObject sltPlusIcon = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_Add_Stages_Plus-Circle')
			TestObject stName =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/input_Create_Stage_Submitted')
			TestObject stageEdit =	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_New_Stages_Edit')

			WebUI.click(sltPlusIcon)
			WebUI.setText(stName,stageName)
			WebUI.click(stageEdit)
		}  catch(StepFailedException e) {
			log.logFailed("Create Duplicate Submitted Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflow1(String workflowName) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.selectOptionByLabel(clkWorkflow1,workflowName,true)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow 1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflow2(String anotherWorkflow) {
		try {
			TestObject clkWorkflow2 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow2')

			WebUI.click(clkWorkflow2)
			WebUI.selectOptionByLabel(clkWorkflow2,anotherWorkflow,true)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickCloseButton() {
		try {
			TestObject btnClose = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Close')

			WebUI.click(btnClose)
		}  catch(StepFailedException e) {
			log.logFailed("Click Close Button Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickSaveButton() {
		try {
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Save')

			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
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
	def createChildCaseType(String childCaseName) {
		try {
			TestObject parentCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/button_Debit Mastercard')
			TestObject newButtton = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/a_New_Add_Child_Case')
			TestObject childCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/input_case_Type_Name')

			WebUI.click(parentCase)
			WebUI.click(newButtton)
			WebUI.setText(childCase,childCaseName)
		} catch(StepFailedException  e) {
			log.logFailed("Create Child Type step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDebitMastercardType() {
		try {
			TestObject parentCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/button_Debit Mastercard')

			WebUI.click(parentCase)
		} catch(StepFailedException  e) {
			log.logFailed("Select Debit Mastercard Type step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def stageSection() {
		try {
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(editStage)
		}  catch(StepFailedException  e) {
			log.logFailed("Stage Section Step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflowInStage(String workflowName) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.selectOptionByLabel(clkWorkflow1,workflowName,true)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseType() {
		try {
			TestObject sltcase =   findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/button_Account Type')

			WebUI.click(sltcase)
		}   catch(StepFailedException e) {
			log.logFailed("Select Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteStages() {
		try {
			TestObject deleteStage1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/svg_In_Progress_Stage_Delete')
			TestObject deleteStage2 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/svg_Closed_Stage_Delete')

			WebUI.click(deleteStage1)
			WebUI.click(deleteStage2)
		}   catch(StepFailedException e) {
			log.logFailed("Delete Stages Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteNewSubmittedStages() {
		try {
			TestObject deleteStage1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_Delete_New_Submitted_Stages')

			WebUI.click(deleteStage1)
		}   catch(StepFailedException e) {
			log.logFailed("Delete New Submitted Stages Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createAnotherStage(String newStage) {
		try {
			TestObject sltPlusIcon = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/svg_Add_Stages_Plus-Circle')
			TestObject stageName =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/input_Create_Another_Stage')

			WebUI.click(sltPlusIcon)
			WebUI.setText(stageName,newStage)
		} catch(StepFailedException e) {
			log.logFailed("Create Another Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage() {
		try {
			TestObject sltCase =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/button_Account_Version')
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(sltCase)
			WebUI.click(editStage)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectVersionWorkflow(String workflowName) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.selectOptionByLabel(clkWorkflow1,workflowName, true)
		}  catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def updateStageWorkflowVersion(String updateVersion) {
		try {
			TestObject clickVersion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/select_Version_Field')
			TestObject sltVersion =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/select_Increase_Version_Number')

			WebUI.click(clickVersion)
			WebUI.selectOptionByLabel(clickVersion,updateVersion,true)
		} catch(StepFailedException e) {
			log.logFailed("Update Stage Workflow Version Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage1() {
		try {
			TestObject sltCase =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/button_Account_Multiple_Points')
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(sltCase)
			WebUI.click(editStage)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage2() {
		try {
			TestObject sltCase =  	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/button_Change Type')
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(sltCase)
			WebUI.click(editStage)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage3() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/button_Add_Entry_Point')
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(sltCase)
			WebUI.click(editStage)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 3 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectGroupedByCaseType() {
		try {
			TestObject sltCase = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/button_Grouped_By_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Grouped By Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editSubmittedStage() {
		try {
			TestObject submittedStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/svg_Submitted_Stages_Edit')

			WebUI.click(submittedStage)
			S
		} catch(StepFailedException e) {
			log.logFailed("Edit Submitted Stage Step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAnotherWorkflow(String anotherWorkflow) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/ddl_Workflow_Add_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.selectOptionByLabel(clkWorkflow1,anotherWorkflow,true)
		} catch(StepFailedException e) {
			log.logFailed("Add Another Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addEntryPoint() {
		try {
			TestObject clkStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/div_Right_Click')
			TestObject sltEntryPoint =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/div_Add Entry Point1')

			WebUI.rightClick(clkStage)
			WebUI.click(sltEntryPoint)
		} catch(StepFailedException e) {
			log.logFailed("Add Entry Point Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteStageWorkflow() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/select_Select_Workflow')
			TestObject delete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/slt_Delete_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.doubleClick(delete)
		}  catch(StepFailedException e) {
			log.logFailed("Delete Stage Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteCaseTypes() {
		try {
			TestObject btnDelete =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Type_Maintenance/button_Delete_Type')
			TestObject confirmDelete = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Type_Maintenance/button_Delete_Confirm')

			WebUI.click(btnDelete)
			WebUI.click(confirmDelete)
		} catch(StepFailedException e) {
			log.logFailed("Delete Case Types Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage5() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/button_Add_Case1')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 5 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage6() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/button_Add_Case2')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 6 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage7() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/button_Add_Case3')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 7 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createCaseType2(String caseName2) {
		try {
			TestObject btnNew =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Case_Type_New')
			TestObject addNewType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/span_Add_New_Type')
			TestObject casetypeName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/input_New_Type_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Save')

			WebUI.click(btnNew)
			WebUI.click(addNewType)
			WebUI.setText(casetypeName,caseName2)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create case Type 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createCaseType3(String caseName3) {
		try {
			TestObject btnNew =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Case_Type_New')
			TestObject addNewType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/span_Add_New_Type')
			TestObject casetypeName = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/input_New_Type_Name')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Case_Type_Options/button_Save')

			WebUI.click(btnNew)
			WebUI.click(addNewType)
			WebUI.setText(casetypeName,caseName3)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create case Type Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def detailsTypeOptions() {
		try {
			TestObject sltTypeOptions = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/div_Type_Options')
			TestObject chkCaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/chk_Case_Type_')
			TestObject chkRequiredAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/chk_Require_Account')

			WebUI.click(sltTypeOptions)
			WebUI.click(chkCaseType)
			WebUI.click(chkRequiredAccount)
			WebUI.click(sltTypeOptions)
		}  catch(StepFailedException e) {
			log.logFailed("Details Type Options Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage8() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage_Zoom_In_Out/button_Stage_Zoom_In_Out')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 8 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def scrollUpAndDown() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject scrollDown =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage_Zoom_In_Out/ddl_Workflow_Open_Case')
			TestObject scrollUp = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Stage_Zoom_In_Out/ddl_Workflow_Back_Office_Review')

			WebUI.click(clkWorkflow1)
			WebUI.scrollToElement(scrollDown, 3)
			WebUI.scrollToElement(scrollUp, 3)
		} catch(StepFailedException e) {
			log.logFailed("Scroll Up And Down Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickOutsideWorkflow() {
		try {
			TestObject clkStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/div_Right_Click')

			WebUI.click(clkStage)
		} catch(StepFailedException e) {
			log.logFailed("Click Outside Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def zoomIn() {
		try {
			WebUI.executeJavaScript('document.body.style.zoom="150%"', null)
		} catch(StepFailedException e) {
			log.logFailed("Zoom In Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def zoomOut() {
		try {
			WebUI.executeJavaScript('document.body.style.zoom="75%"', null)
		} catch(StepFailedException e) {
			log.logFailed("Zoom Out Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def resetZoom() {
		try {
			WebUI.executeJavaScript('document.body.style.zoom="100%"', null)
		} catch(StepFailedException e) {
			log.logFailed("Reset Zoom Out Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage9() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/button_Delete_Case_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 9 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteStageWorkflow2() {
		try {
			TestObject clkWorkflow3 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/select_Workflow_To_Delete')
			TestObject delete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/slt_Delete_Workflow')
			TestObject sltWorkfflow1 =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')

			WebUI.click(clkWorkflow3)
			WebUI.doubleClick(delete)
			WebUI.mouseOver(sltWorkfflow1)
		}  catch(StepFailedException e) {
			log.logFailed("Delete Stage Workflow 2 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflowInSubmittedStage(String workflowName) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.selectOptionByLabel(clkWorkflow1,workflowName,true)
		}   catch(StepFailedException e) {
			log.logFailed("Add Workflow In Submitted Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEditWorkflowCaseType() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Select Edit Workflow Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectWorkflowInStage10() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/button_Edit_Case_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Workflow In Stage 10 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseType11() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/button_Edit_Case_Workflow')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Type 11 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseType12() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/button_Edit_Workflow')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Type 12 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceCase() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Multiple_Choice')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectCase() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/button_Multiple Select')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseType15() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance_Questions/button_Stage Layout')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Type 15 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAnotherWorkflowInSameNode(String anotherWorkflow) {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/ddl_Workflow_Add_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.delay(2)
			WebUI.selectOptionByLabel(clkWorkflow1,anotherWorkflow,true)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow 1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkMultipleVersions() {
		try {
			TestObject clickVersion = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/select_Version_Field')

			WebUI.click(clickVersion)
		} catch(StepFailedException e) {
			log.logFailed("Check Multiple Versions Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addProvisionalWorkflowInCase() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Matched_Case')
			TestObject editStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/svg_Progress Edit')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/slt_A_Workflow_Attach_Type Case')
			TestObject sltWorkflowDropdown = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/ddl_Workflow_Provisional_Debit')
			TestObject btnClose = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Close')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/button_Save')

			WebUI.click(sltCase)
			WebUI.click(editStage)
			WebUI.click(sltWorkflow)
			WebUI.click(sltWorkflowDropdown)
			WebUI.click(btnClose)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("Add Provisional Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addEntryPointWorkflowInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Entry_Points/ddl_Workflow_Entry_Point')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Entry Point Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addStageNodeExitPointInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance_Questions/ddl_Stage_Node_Exit_Point')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Stage Node Exit Point In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addStageNodeAnotherExitPointInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltAnotherWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type Maintenance_Questions/ddl_Stage_Node_Another_Exit_Point')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltAnotherWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Stage Node Another Exit Point In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAddWorkflow1InCaseWorkflow() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/ddl_Workflow_Add_Workflow1')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow1 In Case Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAddWorkflow2InCaseWorkflow() {
		try {
			TestObject clkWorkflow2 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow2')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/ddl_Workflow_Add_Workflow2')

			WebUI.click(clkWorkflow2)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow 2 In Case Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAlterWorkflowInStage() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/ddl_Workflow_Alter_Workflow')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Alter Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleExitPointsInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/ddl_Workflow_Multiple_Exit_Points')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Multiple Exit Point In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addOneExitPointInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/ddl_Workflow_One_Exit_Point')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add One Exit Point In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleStageInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Create_Multiple_Stages/ddl_Workflow_Add_Multiple_Stage')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Multiple Stage In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addExitPointWithVersionInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/ddl_Exit_point_with_version')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Add Exit Point With Version In Case Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addWorkflowVersionInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Type_maintenance_Version/ddl_Add_Workflow_Version')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Add Workflow Version In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addBaseWorkflowCaseTypeInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/ddl_Workflow_Base_Workflow_Case_Type')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
		} catch(StepFailedException e) {
			log.logFailed("Add Workflow 1 Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addDeleteCaseTypeWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/ddl_Workflow_Delete_Case_Type_Workflow')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Delete Case Type Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addModifyCaseTypeWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/ddl_Workflow_Modify_Case_Type_Workflow1')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Modify Case Type Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addModifyCaseWithoutBaseInCase() {
		try {
			TestObject clkWorkflow1 =  findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/ddl_Workflow_Modify_Case_without_Base')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Modify Case Without Base In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addModifyWorkflowOverBaseInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Grouped_By_Case/ddl_Workflow_Modify_Workflow_Over_Base')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Modify Workflow Over Base In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addCreateMultipleChoiceInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/ddl_Workflow_Create_Multiple_Choice')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Create Multiple Choice In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addCreateMultipleSelectInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/ddl_Workflow_Create_Multiple_Select')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Create Multiple Select In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def stageProgressStage() {
		try {
			TestObject editStage = 	findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/svg_Progress_Stage_Edit')

			WebUI.click(editStage)
		}  catch(StepFailedException  e) {
			log.logFailed("Stage Progress Stage Step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectSpecificCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/button_Specific_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Specific Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addTypeSpecificWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/ddl_Workflow_Type_Specific')
			TestObject editWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(editWorkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Type Specific Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow2')
			TestObject deleteWorkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Workflow_Type_Maint/slt_Delete_Workflow')

			WebUI.click(sltWorkflow)
			WebUI.click(deleteWorkflow)
			WebUI.click(deleteWorkflow)
		}  catch(StepFailedException e) {
			log.logFailed("Delete Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editWorkflow() {
		try {
			TestObject sltWorkflow = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject edit = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(sltWorkflow)
			WebUI.click(edit)
		} catch(StepFailedException e) {
			log.logFailed("Edit Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseVersionType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/button_Case_Version')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Versione Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addVersionUpgradeWorkflowInStage() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/ddl_Workflow_Version_Upgrade')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Version Upgrade Workflow In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataSetterType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/button_Data Setter')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Setter Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addDataSetterQuesInStage() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/ddl_Data_Setter_Ques_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Data Setter Ques In Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultiplChoiceQueryeType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/button_Multiple_Choice_Query')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choiice Query Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleChoiceQueryInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Validate_Signal_R/ddl_Workflow_Multiple_Choice_Required')
			TestObject edit = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_AlterWorkflow_In_Child_Type/slt_Edit_Workflow')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
			WebUI.click(clkWorkflow1)
			WebUI.click(edit)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice Query In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseOffPathType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/button_Case_Off_Path')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Off Path Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseNoPathType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/button_Case_No_Path')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case No Path Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAutoWriteOffPathInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/ddl_Workflow_Auto_Write_Off_Path')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Auto Write Off Path In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAutoNoWritePathInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Web/Dispute/Maintain/Processes/Case Types/Page_Add_Workflow_Main_Type/select_Select_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/ddl_Workflow_Auto_No_Write_Path')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Auto No Write Path In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def setAmountTypeOption(String creditWriteOff, String debitWriteOff) {
		try {
			TestObject sltTypeOption =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/div_Type_Options')
			TestObject creditAmount = 	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/input_Credit_Write_Off')
			TestObject debitAmont = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Auto_Write_Off/input_Debit_Write_Off')

			WebUI.click(sltTypeOption)
			WebUI.setText(creditAmount, creditWriteOff)
			WebUI.setText(debitAmont, debitWriteOff)
		}   catch(StepFailedException e) {
			log.logFailed("Set Amount Type Option Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteCaseType() {
		try {
			TestObject sltDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Type_Maintenance/button_Delete_Type')
			TestObject confirmDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Delete_Type_Maintenance/button_Delete_Confirm')

			WebUI.click(sltDelete)
			WebUI.click(confirmDelete)
		} catch(StepFailedException e) {
			log.logFailed("Delete Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDecisionCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Decision_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Decision Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectSubmittedEditStage() {
		try {
			TestObject editSubStage = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/svg_Edit_Submitted_Stage')

			WebUI.click(editSubStage)
		} catch(StepFailedException e) {
			log.logFailed("Select Submitted Edit Stage Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addLinkDecisionPointInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Link_Decision_Points')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Link Decision Point In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAssignQuestionsType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Assign_Questions_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Assign Questions Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addTranscodeQuestionWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Trancode_Question')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Transcode Question Workflow Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataFieldCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Data Field Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Field Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addQuestionnarieDataFieldWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Questionnaire_Data_Field')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Questionnarie Data Field Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectDataQuestionType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Data_Type_Question')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Data Question Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addDataTypesQuestionnaireWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow	= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Data_Types_Questionnaire')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Data Type Questionnarie Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEntryCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Entry_Case_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Entry Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addEntryCaseWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow	= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Entry_Case')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Entry Case Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseEnterType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Case Enter')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Enter Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addAnotherEntryCaseWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow	= findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Entry_Case')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Another Entry Case Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCaseQuestionnaireType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Case_Questions_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Questionnaire Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addCaseQuestionnaireWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Case_Questionnaire')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Another Entry Case Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectActionCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Actions_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Action Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addCalculatedActionsWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Calculated_Actions')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Calculated Actions Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectBuildConditionCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Build_Condition_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Build Condition Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addConditionBuilderWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Condition_Builder')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Condition Builder Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectEditConditionCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Edit_Condition_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Edit Condition Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addConditionEditiorWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Condition_Editor')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Condition Editor Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoiceNotType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Multiple_Choice_Not_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Not Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleChoiceNotQueryWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/ddl_Workflow_Multiple_Choice_Not_Query')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice Not Query Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoicQueryeType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Multiple_Choice_Query')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Not Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleChoiceRequiredWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/ddl_Workflow_Multiple_Choice_Required')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice Required Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoicWithoutCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Multiple_Choice_Without_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Without Case Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleChoiceWithoutOptionWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/ddl_Workflow_Multiple_Choice_Without_Option')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice Without Option Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleChoicNotCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Multiple_Choice_Not_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Choice Not Case Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleChoiceNotRequiredWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/ddl_Workflow_Multiple_Choice_Not_Required')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Choice Without Option Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/button_Multiple_Select_Not_Type')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Not Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleSelectNotQuerydWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/ddl_Workflow_Multiple_Select_Not_Query')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Select Not Query Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectNotCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/button_Multiple_Select_Not_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Not Case Type Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleSelectNotRequireddWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/ddl_Workflow_Multiple_Select_Not_Required')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Select Not Required Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectWithoutCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/button_Multiple_Select_Without_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Without Case Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleSelectWithoutOptionWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/ddl_Workflow_Multiple_Select_Without_Option')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Select Without Option Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectMultipleSelectQueryType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/button_Multiple_Select_Query')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Multiple Select Query Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addMultipleSelectQueryWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Select_Queries/ddl_Workflow_Multiple_Select_Required')

			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Multiple Select Query Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectBuildQuestionCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Multiple_Choice_Queries/button_Build_Question_Case')

			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Build Question Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}		
	
	@Keyword
	def selectSmokeTestCaseType() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/button_Smoke_Test')
			
			WebUI.click(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Smoke Test CaseType  Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def selectCaseTypeOptions() {
		try {
			TestObject sltTypeOptions = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/div_Type_Options')
			TestObject chkCaseType = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/chk_Case_Type_')
			TestObject chkRequiredAccount = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Add_Multiple_Case_Type/chk_Require_Account')

			WebUI.click(sltTypeOptions)
			WebUI.click(chkCaseType)
			WebUI.click(sltTypeOptions)
		}  catch(StepFailedException e) {
			log.logFailed("Select Case Type Options Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	@Keyword
	def addFundsAcquisitionWorkflowInCase() {
		try {
			TestObject clkWorkflow1 = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Select_Case_Types/select_Stage_Workflow1')
			TestObject sltworkflow = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Case Types/Page_Selete_Workflow_In_Stage/ddl_Workflow_Funds_Acquisition')
			
			WebUI.click(clkWorkflow1)
			WebUI.click(sltworkflow)
		}   catch(StepFailedException e) {
			log.logFailed("Add Funds Acquisition Workflow In Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
	
}