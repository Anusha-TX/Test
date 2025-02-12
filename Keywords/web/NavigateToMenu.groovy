package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import internal.GlobalVariable
import config.TestDataManager
public class NavigateToMenu {

	KeywordLogger log=new KeywordLogger()
	@Keyword

	def navigateToMenu () {
		try {
			TestObject navigateToDisputeField = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Dispute')
			TestObject navigateToMaintain = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Maintain')
			TestObject navigateToMisc = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Accounts/Page_TRIPS/div_Misc')

			WebUI.click(navigateToDisputeField)
			WebUI.click(navigateToMaintain)
			WebUI.click(navigateToMisc)
		} catch(StepFailedException e) {
			log.logFailed("Login step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}