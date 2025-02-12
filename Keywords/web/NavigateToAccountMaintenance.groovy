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

class NavigateToAccountMaintenance {


	KeywordLogger log=new KeywordLogger()
	@Keyword


	def navigateToCreateAccountMaintenance(String bankIDfield,String actfield,String nameandaddressfield,String county,String selectcity,String region,String zipnum,String numberfield,String homefieldnum,String email) {
		try {
			TestObject navigateToAccounts = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Accounts')
			TestObject bankIdField= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Bank')


			TestObject navigateToAccountField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Account')
			TestObject searchfield = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/Number_Field')
			TestObject Selectfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Select')
			TestObject savingsfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/span_DDA')
			TestObject NameandAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/textarea_Name')
			TestObject Numberfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Home')
			TestObject saveButton= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Save')


			TestObject Email= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_EmailAddress')
			TestObject Country= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_SelectCountry')
			TestObject City= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountStatus=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_Accounttype')
			TestObject Zip=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Zip')
			TestObject SelectByRegion=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_SelectRegion')

			TestObject SelectCity= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountMaintenace = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Accounts Maintenance')
			TestObject ClearBtn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Clear')
			TestObject DiectCharge_rdo= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_Accounttype')
			TestObject CostCenter=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_CostCenter')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/history_btn')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/history_tab')

			WebUI.click(navigateToAccounts)
			WebUI.setText(bankIdField,bankIDfield)
			WebUI.setText(navigateToAccountField,actfield)
			WebUI.click(searchfield)
			WebUI.click(Selectfield)
			WebUI.click(savingsfield)
			WebUI.setText(NameandAddressField,nameandaddressfield)

			//WebUI.selectOptionByValue(Country,county,true)
			WebUI.setText(SelectCity,selectcity)
			GlobalVariable.globalMediumDelay
			//WebUI.selectOptionByValue(SelectByRegion,region, true)
			GlobalVariable.globalMediumDelay
			WebUI.setText(Zip,zipnum)
			WebUI.setText(Numberfield,numberfield)
			WebUI.setText(Email,email)
			WebUI.selectOptionByValue(AccountStatus, 'N', false)
			WebUI.click(DiectCharge_rdo)
			WebUI.setText(CostCenter,'3')
			WebUI.click(saveButton)
			WebUI.refresh()

			WebUI.click(History_btn)
			//WebUI.click(Click_history)
			//WebUI.click(AccountMaintenace)
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



	@Keyword
	def validateAccount(String bankIDfield,String actfield,String nameandaddressfield,String county,String selectcity,String region,String numberfield,String homefieldnum,String email,String costcenter) {
		try {

			TestObject navigateToAccounts = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Accounts')
			TestObject bankIdField= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Bank')


			TestObject navigateToAccountField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Account')
			TestObject searchfield = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/Number_Field')
			TestObject Selectfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Select')
			TestObject savingsfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/span_DDA')
			TestObject NameandAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/textarea_Name')
			TestObject Numberfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Home')
			TestObject saveButton= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Save')


			TestObject Email= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_EmailAddress')
			TestObject Country= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_SelectCountry')
			TestObject City= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountStatus=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_Accounttype')
			TestObject Zip=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Zip')
			TestObject SelectByRegion=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_SelectRegion')

			TestObject SelectCity= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountMaintenace = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Accounts Maintenance')
			TestObject ClearBtn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Clear')
			TestObject DiectCharge_rdo= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/select_Accounttype')
			TestObject CostCenter=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_CostCenter')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/history_btn')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/history_tab')
			TestObject navigateToclearField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Clear')
			TestObject navigateToDelete = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Delete')


			WebUI.click(navigateToAccounts)
			WebUI.setText(bankIdField,bankIDfield)
			WebUI.setText(navigateToAccountField,actfield)
			WebUI.click(searchfield)
			WebUI.click(Selectfield)
			WebUI.click(savingsfield)
			WebUI.setText(NameandAddressField,nameandaddressfield)

			//WebUI.selectOptionByValue(Country,county,true)
			WebUI.setText(SelectCity,selectcity)
			GlobalVariable.globalShortDelay
			//WebUI.selectOptionByValue(SelectByRegion,region, true)
			GlobalVariable.globalShortDelay
			WebUI.setText(Zip,'1771')
			WebUI.setText(Numberfield,numberfield)
			WebUI.setText(Email,email)
			WebUI.selectOptionByValue(AccountStatus, 'N', false)
			WebUI.click(DiectCharge_rdo)
			WebUI.setText(CostCenter,costcenter)
			WebUI.verifyElementPresent(saveButton, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(saveButton)

			WebUI.refresh()
			WebUI.verifyElementPresent(History_btn, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(History_btn)

			//WebUI.click(Click_history)
			//WebUI.click(AccountMaintenace)
			WebUI.verifyElementPresent(navigateToclearField, 10, FailureHandling.STOP_ON_FAILURE)

			WebUI.verifyElementPresent(navigateToDelete, 10, FailureHandling.STOP_ON_FAILURE)

			GlobalVariable.globalShortDelay
		} catch(StepFailedException e) {
			log.logFailed("Account validation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}




