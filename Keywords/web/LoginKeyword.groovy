package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import internal.GlobalVariable


class LoginKeyword {
	@Keyword
	def login(String username, String encryptedPassword) {
		// Test objects for the login fields and button
		TestObject usernameField = findTestObject('Object Repository/Web/Login/txt_Username')
		TestObject passwordField = findTestObject('Object Repository/Web/Login/txt_Password')
		TestObject loginButton = findTestObject('Object Repository/Web/Login/btn_Login')
		// Test object status for checking user login status
		TestObject logoutButton = findTestObject('Object Repository/Web/CommonOperations/Top_Navigation/btn_Logout')
		TestObject userProfileIcon = findTestObject('Object Repository/Web/CommonOperations/Top_Navigation/MenuIcon')

		// Check if the user is already logged in (using FailureHandling.OPTIONAL to avoid exceptions)
		boolean isLoggedIn = WebUI.verifyElementPresent(userProfileIcon, GlobalVariable.globalMediumDelay, FailureHandling.OPTIONAL)
		if (isLoggedIn) {
			WebUI.comment("User is already logged in.")
			// Log out the user
			WebUI.comment("Logging out the user.")
			WebUI.click(userProfileIcon)
			WebUI.delay(1)
			WebUI.click(logoutButton)
			// Wait for the login page to load
			WebUI.waitForElementPresent(usernameField, GlobalVariable.globalLongDelay)
		} else {
			WebUI.comment("User is not logged in. Proceeding to login.")
		}

		// Ensure the login page is loaded by checking the presence of the username field
		if (usernameField && passwordField && loginButton) {
			WebUI.comment("Filling in login details.")
			WebUI.setText(usernameField, username)
			try {
				WebUI.setText(passwordField, encryptedPassword)
			} catch (Exception e) {
				WebUI.comment("Failed to set encrypted text: ${e.message}")
				throw e
			}
			WebUI.click(loginButton)
			WebUI.comment("Login button clicked.")
		} else {
			throw new RuntimeException("One or more login page elements not found")
		}
	}
}