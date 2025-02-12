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


public class NavigateToBankMaintenance_Screen {


	KeywordLogger log=new KeywordLogger()
	@Keyword

	def navigateToCreateBankMaintenance(String transID,String nameandaddressfield,String country,String selectcity,String region,String zipnum,String numberfield,String email) {
		try {
			TestObject navigatetoBanks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_TRIPS/div_Banks')
			TestObject ClickNew= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/span_New')
			TestObject InputBank_Id=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Bank_id')
			TestObject TextName= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_textarea')
			TestObject Select_Country= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Country')
			TestObject Set_city= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_City')
			TestObject Select_Region =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Region')
			TestObject Zip =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Zip')
			TestObject Input_Phone = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Phone_form-control')
			TestObject Text_Email = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Email Address_email')
			//TestObject path=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Routing _Transit')
			//TestObject Bank_Transit = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_RoutingTransitFocusForm')
			//TestObject Select_type= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/select_SelectType1DDA Clearing2')
			TestObject BankID = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Bank_id')
			TestObject AccountID= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Account')
			TestObject Name_Account= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_accountName')
			TestObject acount_type=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/span_DDA')
			TestObject Save_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Save')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/span_History')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/History_view')
			TestObject select_type=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Page_Bank Maintenance/div_Select')
			TestObject Click_Banks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/td_Banks')
			TestObject Link_BankMaintenace= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/div_Bank Maintenance')

			WebUI.click(navigatetoBanks)
			WebUI.click(ClickNew)
			WebUI.setText(InputBank_Id,transID)
			WebUI.setText(TextName,nameandaddressfield)
			WebUI.selectOptionByValue(Select_Country,country, true)
			WebUI.setText(Set_city,selectcity)
			//WebUI.selectOptionByValue(Select_Region,region, true)

			WebUI.setText(Zip,zipnum)
			WebUI.setText(Input_Phone,numberfield)
			WebUI.setText(Text_Email, email)
			
			WebUI.refresh()
			WebUI.click(History_btn)
			//WebUI.click(Click_history)
			//WebUI.click(Click_Banks)
			//WebUI.click(Link_BankMaintenace)
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

	def validate_BankMainentance(String transID,String nameandaddressfield,String country,String selectcity,String region,String zipnum,String numberfield,String email) {
		try {
			TestObject navigatetoBanks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_TRIPS/div_Banks')
			TestObject ClickNew= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/span_New')
			TestObject InputBank_Id=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Bank_id')
			TestObject TextName= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_textarea')
			TestObject Select_Country= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Country')
			TestObject Set_city= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_City')
			TestObject Select_Region =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Region')
			TestObject Zip =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Zip')
			TestObject Input_Phone = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Phone_form-control')
			TestObject Text_Email = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Email Address_email')
			TestObject Save_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Save')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/span_History')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/History_view')
			TestObject select_type=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Page_Bank Maintenance/div_Select')
			TestObject Click_Banks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/td_Banks')
			TestObject Link_BankMaintenace= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/div_Bank Maintenance')
			TestObject Delete_button = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Delete')
			TestObject cancel_button= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Cancel')
			TestObject Delete_2=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Deletebtn_2')

			WebUI.click(navigatetoBanks)
			WebUI.click(ClickNew)
			WebUI.setText(InputBank_Id,transID)
			WebUI.setText(TextName,nameandaddressfield)
			WebUI.selectOptionByValue(Select_Country,country, true)
			WebUI.setText(Set_city,selectcity)
			//WebUI.selectOptionByValue(Select_Region,region, true)

			WebUI.setText(Zip,zipnum)
			WebUI.setText(Input_Phone,numberfield)
			WebUI.setText(Text_Email, email)


			WebUI.click(Save_Button)
			WebUI.verifyElementPresent(Save_Button, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.refresh()
			WebUI.click(Click_history)
			WebUI.verifyElementPresent(Click_history, 10, FailureHandling.STOP_ON_FAILURE)
			//WebUI.click(History_tab)
			WebUI.click(History_btn)
			WebUI.click(Delete_button)
			WebUI.verifyElementPresent(Delete_button, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(cancel_button)
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

	def enter_BankMainentance(String transID,String nameandaddressfield,String country,String selectcity,String region,String zipnum,String numberfield,String email) {
		try {
			TestObject navigatetoBank = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_TRIPS/div_Banks')

			TestObject navigatetoBanks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_TRIPS/div_Banks')
			TestObject ClickNew= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/span_New')
			TestObject InputBank_Id=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Bank_id')
			TestObject TextName= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_textarea')
			TestObject Select_Country= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Country')
			TestObject Set_city= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_City')
			TestObject Select_Region =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Select_Region')
			TestObject Zip =findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Zip')
			TestObject Input_Phone = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Phone_form-control')
			TestObject Text_Email = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/input_Email Address_email')
			TestObject Save_Button= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Save')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/span_History')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/History_view')
			TestObject select_type=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Page_Bank Maintenance/div_Select')
			TestObject Click_Banks= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/td_Banks')
			TestObject Link_BankMaintenace= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/div_Bank Maintenance')
			TestObject Delete_button = findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Delete')
			TestObject cancel_button= findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/button_Cancel')
			TestObject Delete_2=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/Deletebtn_2')

			WebUI.click(navigatetoBanks)
			WebUI.click(ClickNew)
			WebUI.setText(InputBank_Id,transID)
			WebUI.setText(TextName,nameandaddressfield)
			WebUI.selectOptionByValue(Select_Country,country, true)
			WebUI.setText(Set_city,selectcity)
			//WebUI.selectOptionByValue(Select_Region,region, true)

			WebUI.setText(Zip,zipnum)
			WebUI.setText(Input_Phone,numberfield)
			WebUI.setText(Text_Email, email)


			WebUI.click(Save_Button)
			WebUI.verifyElementPresent(Save_Button, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.refresh()
			WebUI.click(Click_history)
			WebUI.verifyElementPresent(Click_history, 10, FailureHandling.STOP_ON_FAILURE)
			//WebUI.click(History_tab)
			WebUI.click(History_btn)
			WebUI.click(Delete_button)
			WebUI.verifyElementPresent(Delete_button, 10, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(cancel_button)
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
