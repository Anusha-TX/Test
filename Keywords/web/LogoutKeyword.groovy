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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

class LogoutKeyword {

	@Keyword
	def signOut() {

		// Define the Test Objects for menu button and logout button
		TestObject menuButton = findTestObject('Object Repository/Web/CommonOperations/Top_Navigation/MenuIcon')
		TestObject logoutButton = findTestObject('Object Repository/Web/CommonOperations/Top_Navigation/btn_Logout')
		// Ensure the menu button is present and visible
		if (WebUI.verifyElementPresent(menuButton, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE)) {
			WebUI.comment("Menu button found, clicking to reveal logout option.")
			// Click on the menu button to reveal the logout button
			WebUI.click(menuButton)
			// Wait for the logout button to become visible after the menu is clicked
			GlobalVariable.globalShortDelay
			WebUI.waitForElementVisible(logoutButton, GlobalVariable.globalMediumDelay)
			// Now click on the logout button
			WebUI.click(logoutButton)
			GlobalVariable.globalShortDelay
			WebUI.comment("User has been logged out successfully.")
		} else {
			WebUI.comment("Unable to logout successfully.")
		}
	}
}