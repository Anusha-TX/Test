package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException


class LoginAuthKeyword {

	KeywordLogger log = new KeywordLogger()

	@Keyword
	def login(String username, String password) {

		try {

			TestObject usernameField = findTestObject('Object Repository/Web/CommonOperations/Page_Receivables/input_Username_identifier')
			TestObject passwordField = findTestObject('Object Repository/Web/CommonOperations/Page_Receivables/enter_password')
			TestObject NextButton = findTestObject('Object Repository/Web/CommonOperations/Page_Receivables/Next_button')
			TestObject Keep_Me_Signed_In_Button = findTestObject('Object Repository/Web/CommonOperations/Page_Receivables/label_Keep me signed in')
			TestObject VerifyButton = findTestObject('Object Repository/Web/CommonOperations/Page_Receivables/Verify_button')

			WebUI.setText(usernameField, username)
			//WebUI.click(Keep_Me_Signed_In_Button)
			//WebUI.click(NextButton)
			WebUI.setText(passwordField, password)
			WebUI.click(VerifyButton)
		}catch(StepFailedException e) {

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