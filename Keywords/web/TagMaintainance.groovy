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
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import config.ConfigurationManager
import org.apache.commons.lang.RandomStringUtils

// Keywords Functions

public class TagMaintainance {
	KeywordLogger log =new KeywordLogger()

	@Keyword
	def createTag(String tagDescription, String addAlias, String addDefaultName, String addOperation) {
		try {
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Tag_Description_textarea')
			TestObject clkField =  findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Tag_Field_textarea')
			TestObject sltField = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/a_Dispute.Banks.ACHOrigin')
			TestObject alias = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Tag_Alias_textarea')
			TestObject defaulTtagName = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Tag_DefaultTagName_textarea')
			TestObject formatddl = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/ddl_format')
			TestObject sltDate = 	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/ddl_Tag_Format_Date')
			TestObject opertions = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Operations')

			WebUI.setText(description,tagDescription)
			WebUI.click(clkField)
			WebUI.click(sltField)
			WebUI.setText(alias,addAlias)
			WebUI.setText(defaulTtagName,addDefaultName)
			WebUI.click(formatddl)
			WebUI.click(sltDate)
			WebUI.setText(opertions,addOperation)
		}  catch(StepFailedException  e) {
			log.logFailed("Create Tag step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickNewButton(){
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/btn_New')

			WebUI.click(btnNew)
		}  catch(StepFailedException  e) {
			log.logFailed("click New Button step failed" +e.getMessage())
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
			TestObject btnCancel =	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/button_Tag_Cancel')

			WebUI.click(btnCancel)
		} catch(StepFailedException  e) {
			log.logFailed("Click Cancel Button step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def leaveTagPage() {
		try {
			TestObject sltLeave =	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/button_Tag_Leaving_Page_Leave')
			TestObject verify =	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/p_you want to leave without saving')

			//	WebUI.verifyElementPresent(verify,3)
			WebUI.click(sltLeave)
		}   catch(StepFailedException  e) {
			log.logFailed("Leave Tag Page step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickClearButton() {
		try {
			TestObject btnClear =	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/button_Tag_Clear')

			WebUI.click(btnClear)
		}   catch(StepFailedException  e) {
			log.logFailed("Click Clear Button step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def tagCondition(String addStaticData) {
		try {
			TestObject editCondition = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/span_Tag_Edit_Condition')
			TestObject dataField =	findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Data_Field')
			TestObject notConfigured = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured')
			TestObject textDataField =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_Not_Configured_text')
			TestObject sltdata =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/a_Dispute.CaseAccounts.AccountToken')
			TestObject dataFieldSave =	findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/input_Tag_Data_Field_Not_Configured_Save')
			TestObject sltOperator = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Operator')
			TestObject textOperator =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/select_Data_Type_Operatoe_textarea')
			TestObject operator  =  findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/select_operator')
			TestObject staticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/button_Data_Type_Stati_Field')
			TestObject textStaticField = findTestObject('Object Repository/Web/Dispute/Maintain/Processes/Workflows/Page_Different_Types_Question/input_Data_Type_static_Field_textarea')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/button_Tag_Condition_Editior_Save')

			WebUI.click(editCondition)
			WebUI.click(dataField)
			WebUI.click(notConfigured)
			WebUI.click(textDataField)
			WebUI.click(sltdata)
			GlobalVariable.globalShortDelay
			WebUI.click(dataFieldSave)
			GlobalVariable.globalShortDelay
			WebUI.click(sltOperator)
			WebUI.click(textOperator)
			WebUI.click(operator)
			WebUI.click(staticField)
			WebUI.setText(textStaticField,addStaticData)
			WebUI.click(btnSave)
		}  catch(StepFailedException  e) {
			log.logFailed("Tag Condition step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def checkHistoryExpandor() {
		try {
			TestObject sltHistory = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/div_History')
			TestObject sltdate = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/div_History_Date')
			TestObject verifyRecord = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/div_History_Record')

			WebUI.click(sltHistory)
		}  catch(StepFailedException  e) {
			log.logFailed("Check History Expandor step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickSaveButton() {
		try {
			TestObject saveTag = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/btn_Save')

			WebUI.click(saveTag)
		}  catch(StepFailedException  e) {
			log.logFailed("Click Save Button step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def tagMaintenaceHome() {
		try {
			TestObject homeTagMaintenance  = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Create_Tag_Maintenance/Page_Tag Maintenance')

			WebUI.click(homeTagMaintenance)
		}  catch(StepFailedException  e) {
			log.logFailed("Tag Maintenace Home step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	//  BN Functions

	@Keyword
	def navigatetoTagMaintainance() {
		try {
			TestObject Dispute = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Dispute')
			WebUI.click(Dispute)
			TestObject Maintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Maintain')
			WebUI.click(Maintain)
			TestObject template = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Templates')
			WebUI.click(template)
			TestObject tags = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/ExternalType/Page_TRIPS/div_Tags_NestedMenu')
			WebUI.click(tags)
		}catch(StepFailedException  e) {
			log.logFailed("Navigate to TagMaintainance step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createtags(String tagname,String opertion) {
		try {
			String randomName=RandomStringUtils.randomAlphabetic(4)
			TestObject creatNew = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/btn_New')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/input_Description')
			TestObject enterField = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/input_Operations')
			TestObject formatddl = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/ddl_format')
			TestObject opertions = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/input_Operations')
			TestObject saveTag = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/btn_Save')
			WebUI.click(creatNew)
			WebUI.setText(description,tagname)
			WebUI.setText(opertions,opertion)
			WebUI.click(saveTag)
		}catch(StepFailedException  e) {
			log.logFailed("Create TagMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deletetags() {
		try {
			TestObject delete = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/btn_Delete')
			WebUI.click(delete)
			WebUI.click(delete)
		}catch(StepFailedException  e) {
			log.logFailed("Delete TagMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def edittags(String editTagName,String editOpertion) {
		try {
			TestObject element = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/Page_TagMaintain')
			TestObject description = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/input_Description')
			TestObject opertions = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/input_Operations')
			TestObject save = findTestObject('Object Repository/Web/Dispute/Maintain/Templates/Tags/Page_Tag Maintenance/btn_Save')
			WebUI.click(element)
			WebUI.clearText(description)
			WebUI.setText(description,editTagName)
			WebUI.clearText(opertions)
			WebUI.setText(opertions,editOpertion)
			WebUI.click(save)
		}catch(StepFailedException  e) {
			log.logFailed("Edit TagMaintaince step failed" +e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}catch(Exception e) {
			log.logError("Unexcepted error occured"+e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}