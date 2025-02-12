package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import config.TestDataManager
import internal.GlobalVariable as GlobalVariable
public class Static_AccountMaintenace {


	KeywordLogger log=new KeywordLogger()
	@Keyword
	def createNewAccount(String bankIDfield,String actfield,String nameandaddressfield,String county,String selectcity,String region,String zipnum,String numberfield,String homefieldnum,String email,String costcenter){
		try {
			TestObject navigateTostaticAccounts = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/TRIPS_StaticAccount/link_Internal Accounts')
			TestObject bankIdField= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Bank')
			TestObject navigateToAccountField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Account')
			TestObject searchfield = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/Number_Field')
			TestObject Selectfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Select')
			TestObject svingsfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/span_Savings')
			TestObject NameandAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/textarea_Name')
			TestObject Numberfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Home')
			TestObject HomeNumberField=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_PhoneNum')
			TestObject Email= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_SecureEmailAddress')
			TestObject Country= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_SelectCountry')
			TestObject City= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountStatus=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_typeAccount')
			TestObject Zip=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/txt_Zip')
			TestObject SelectByRegion=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_Select Region')
			TestObject saveButton= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Save')
			TestObject SelectCity= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountMaintenace = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/lnk_Accounts Maintenance')
			TestObject ClearBtn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Clear')
			TestObject DiectCharge_rdo= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/rdp_DirectCharge')
			TestObject CostCenter=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_CostCenter')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/span_History')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/History_view')


			WebUI.click(navigateTostaticAccounts)
			WebUI.setText(bankIdField,bankIDfield)
			WebUI.setText(navigateToAccountField,actfield)
			WebUI.click(searchfield)
			WebUI.click(Selectfield)
			WebUI.click(svingsfield)
			WebUI.setText(NameandAddressField,nameandaddressfield)
			GlobalVariable.globalMediumDelay
			//WebUI.selectOptionByValue(Country,county,true)
			WebUI.setText(SelectCity,selectcity)
			GlobalVariable.globalMediumDelay
			//WebUI.selectOptionByValue(SelectByRegion,region, true)
			GlobalVariable.globalMediumDelay
			WebUI.setText(Zip,zipnum)
			WebUI.setText(Numberfield,numberfield)
			WebUI.setText(HomeNumberField, homefieldnum)
			//WebUI.selectOptionByValue(AccountStatus, 'N', true)
			GlobalVariable.globalMediumDelay
			WebUI.setText(Email,email)
			WebUI.selectOptionByValue(AccountStatus, 'N', false)
			WebUI.click(DiectCharge_rdo)
			WebUI.setText(CostCenter,costcenter)
			WebUI.click(saveButton)
			WebUI.refresh()
			GlobalVariable.globalMediumDelay
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

	def EditAccount(String nameandaddressfield,String county,String selectcity,String region,String numberfield,String homefieldnum,String email,String costcenter) {

		try {
			TestObject navigateTostaticAccounts = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/TRIPS_StaticAccount/link_Internal Accounts')
			TestObject existing_one=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/existingBank')
			TestObject bankIdField= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Bank')
			TestObject navigateToAccountField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Account')
			TestObject searchfield = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/Number_Field')
			TestObject Selectfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/div_Select')
			TestObject svingsfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/span_Savings')
			TestObject NameandAddressField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/textarea_Name')
			TestObject Numberfield= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/input_Home')
			TestObject HomeNumberField=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_PhoneNum')
			TestObject Email= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_SecureEmailAddress')
			TestObject Country= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_SelectCountry')
			TestObject City= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountStatus=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_typeAccount')
			TestObject Zip=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/txt_Zip')
			TestObject SelectByRegion=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/select_Select Region')
			TestObject saveButton= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_Accounts Maintenance/button_Save')
			TestObject SelectCity= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_City')
			TestObject AccountMaintenace = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/lnk_Accounts Maintenance')
			TestObject ClearBtn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Clear')
			TestObject DiectCharge_rdo= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/rdp_DirectCharge')
			TestObject CostCenter=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/input_CostCenter')
			TestObject History_btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/span_History')
			TestObject Click_history= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/History_view')

			TestObject Click_Account= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/td_Accounts')
			TestObject ClearBbtn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Clear')


			TestObject Save_Btn= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Save')


			WebUI.click(navigateTostaticAccounts)
			//WebUI.setText(bankIdField,bankIDfield)
			//WebUI.setText(navigateToAccountField,actfield)
			//WebUI.click(searchfield)
			//WebUI.click(Selectfield)
			WebUI.click(existing_one)
			WebUI.setText(NameandAddressField,nameandaddressfield)
			GlobalVariable.globalMediumDelay
			//WebUI.selectOptionByValue(Country,county,true)
			WebUI.setText(SelectCity,selectcity)
			GlobalVariable.globalMediumDelay
			//WebUI.selectOptionByValue(SelectByRegion,region, true)
			GlobalVariable.globalMediumDelay
			WebUI.setText(Zip,'1779')
			WebUI.setText(Numberfield,numberfield)
			WebUI.setText(HomeNumberField, homefieldnum)
			//WebUI.selectOptionByValue(AccountStatus, 'N', true)
			GlobalVariable.globalMediumDelay
			WebUI.setText(Email,email)
			WebUI.selectOptionByValue(AccountStatus, 'N', false)
			WebUI.click(DiectCharge_rdo)
			WebUI.setText(CostCenter,costcenter)
			WebUI.click(saveButton)
			WebUI.refresh()
			GlobalVariable.globalMediumDelay
			WebUI.click(History_btn)
			//WebUI.click(Click_history)

			//WebUI.click(Click_Account)


			//WebUI.setText(Zip,'17788')
			//WebUI.click(ClearBbtn)
			//WebUI.scrollToElement(Save_Btn, 10)
			//  WebUI.click(Save_Btn)

			//WebUI.click(AccountMaintenace)
		} catch(StepFailedException e) {
			log.logFailed("Edit account step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def DeleteAccount() {
		try {
			TestObject navigateTostaticAccounts = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/TRIPS_StaticAccount/link_Internal Accounts')
			TestObject existing_one=findTestObject('Object Repository/Web/Dispute/Maintain/Bank Maintenance/Page_Bank Maintenance/existingBank')
			//TestObject Click_Account= findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/td_Accounts')

			TestObject DeleteAccount=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Delete')

			TestObject btn_Cancel=findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Internal Accounts/Page_Accounts Maintenance/button_Cancel')
			WebUI.click(navigateTostaticAccounts)
			WebUI.click(existing_one)
			WebUI.click(DeleteAccount)
			WebUI.click(btn_Cancel)
			//WebUI.click(DeleteAccount)
			//GlobalVariable.globalShortDelay
			//WebUI.click(DeleteAccount)
			//WebUI.click(DeleteAccount)
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


















