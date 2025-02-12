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

import config.ConfigurationManager
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.logging.KeywordLogger
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration
public class NavigateToActionMaintenance {
	KeywordLogger log=new KeywordLogger()
	@Keyword

	def createNewcoustomAction() {
		try {
			TestObject navigateToAction= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/lnk_Actions')
			TestObject navigatetocoustomAction= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/span_Generate Letter')
			TestObject select_new= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/span_New')
			TestObject input_Name= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_ActionName')
			TestObject template_Name= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_BodyTemplateName_tags')
			TestObject provisional_Credit = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_ProvisionalCredit')
			TestObject Final_credit = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_FinalCredit')
			TestObject MerchantReturned_Credit= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_MerchantReturnedCredit')
			TestObject Provisional_CreditMade_Final= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_ProvisionalCreditMadeFinal')
			TestObject Personal= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_Personal')
			TestObject Basic_template= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_BasicTemplate')
			TestObject Denial = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_Denial')
			TestObject Save_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/button_Save')
			TestObject Basic_Template1= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/link_Basic Template_1')

			WebUI.click(navigateToAction)
			WebUI.click(navigatetocoustomAction)
			WebUI.click(select_new)
			WebUI.setText(input_Name, 'Generate Letter1')
			WebUI.click(template_Name)
			WebUI.click(provisional_Credit)
			WebUI.click(template_Name)
			WebUI.click(Final_credit)
			WebUI.click(template_Name)
			WebUI.click(MerchantReturned_Credit)
			WebUI.click(template_Name)
			WebUI.click(Provisional_CreditMade_Final)
			WebUI.click(template_Name)
			WebUI.click(Personal)
			WebUI.click(template_Name)
			WebUI.click(Denial)
			WebUI.click(Save_Button)
		}catch(StepFailedException e) {
			log.logFailed("Create account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def validate_ActionMaintenance() {
		try {
			TestObject navigateToAction= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/lnk_Actions')
			TestObject existing_ID=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/span_Account Identification Action')
			TestObject action_name= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_Action Name_name')
			TestObject link_documentation= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_Link to documentationURL')
			TestObject link_width= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_Width_width')
			TestObject link_height= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/input_Height_height')
			TestObject Link_url = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/div_Universal Access')
			TestObject total_items = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Actions/Page_ActionMaintenance/span_Total Items')




			WebUI.click(navigateToAction)
			WebUI.click(existing_ID)

			WebUI.verifyElementPresent(action_name, 10, FailureHandling.STOP_ON_FAILURE)

			WebUI.verifyElementPresent(link_documentation, 10, FailureHandling.STOP_ON_FAILURE)

			WebUI.verifyElementPresent(link_width, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(link_height, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(Link_url, 10, FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Create account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

