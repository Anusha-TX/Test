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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

// Fixed keywords and functions

public class MenuMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()


	@Keyword
	def createApplication(String appCodeName, String appName, String appFolderVersion, String appFolderName) {
		try {
			TestObject enterAppCode = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/input_Application_code')
			TestObject enterAppName = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/input_Application_Name')
			TestObject enterAppVersion = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/input_Application_Version')
			TestObject enterAppFolder = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/input_Application_Folder')
			TestObject clickSaveButton = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/btn_Save')

			WebUI.setText(enterAppCode,appCodeName)
			WebUI.click(enterAppName)
			WebUI.setText(enterAppName,appName)
			WebUI.setText(enterAppVersion,appFolderVersion)
			WebUI.setText(enterAppFolder,appFolderName)
			WebUI.click(clickSaveButton)
		} catch(StepFailedException e) {
			log.logFailed("Create Application Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def builtOutApplicationChildren(String app, String name1, String selectType1, String name2, String sltProgram, String sltClientApp, String name3) {
		try {
			TestObject plusCircl = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/slt_Appname_Plus_Circle',[('module'):app])
			TestObject enterName1  = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/input_Name_name')
			TestObject sltTypeMenu = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/select_--select type--  Program  Menu')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/button_Save')
			TestObject plusCirce2= findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/slt_Maintain_Plus-Circle',[('module'):app])
			TestObject entername2 = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/input_Name_name')
			TestObject sltTypeprogram = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/select_type_Program  Menu')
			TestObject sltClienApplication = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/select_Client_Application')
			TestObject btnSave2 = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/button_Save')
			TestObject getData = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Built_Out_Application/slt_Processes',[('name'):name3])
			TestObject clickSave = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/btn_Save')

			WebUI.click(plusCircl)
			WebUI.setText(enterName1,name1)
			WebUI.selectOptionByValue(sltTypeMenu,selectType1,true)
			WebUI.click(btnSave1)
			GlobalVariable.globalShortDelay
			WebUI.click(plusCirce2)
			WebUI.setText(entername2, name2)
			WebUI.selectOptionByValue(sltTypeprogram,sltProgram, true)
			WebUI.selectOptionByValue(sltClienApplication,sltClientApp, true)
			WebUI.click(btnSave2)
			WebUI.getText(getData).trim()
			WebUI.click(clickSave)
		} catch(StepFailedException e) {
			log.logFailed("Built Out Application Children Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def testMenuParameters(String question, String parameterType) {
		try {
			TestObject ddlMaintain = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/slt_Maintain_DropDown')
			TestObject clickThreeLines =  findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/slt_3lines_Edit_Menu_Parameter')
			TestObject clickPlusIcon = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/slt_ProcessesMenu_plus-circle')
			TestObject addQuestiontype = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/input_Question_text')
			TestObject setParametertype = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/input_Parameter_Name')
			TestObject btnAdd = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/button_Add')
			TestObject btnSave1 = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/button_Save')
			TestObject btnSave2 =  findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Test Menu Parameters/button_Save_1')

			WebUI.click(ddlMaintain)
			WebUI.click(clickThreeLines)
			WebUI.click(clickPlusIcon)
			WebUI.setText(addQuestiontype, question)
			WebUI.setText(setParametertype, parameterType)
			WebUI.click(btnAdd)
			WebUI.click(btnSave1)
			WebUI.click(btnSave2)
		} catch(StepFailedException e) {
			log.logFailed("Test Menu Parameters Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def deleteApplication() {
		try {
			TestObject dltApp = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/slt_Delete_Application')
			
			WebUI.click(dltApp)
		} catch(StepFailedException e) {
			log.logFailed("Delete Application Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def buttonSave() {
		try {
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Menu Maintenance/Page_Create Application/btn_Save')

			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Button Save Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}
