package web

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import config.ConfigurationManager
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class WebRequestHandler {
	static void navigateToUrl() {
		String baseUrl = ConfigurationManager.getBaseUrl('web')
		WebUI.navigateToUrl(baseUrl)
	}
}