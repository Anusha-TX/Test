package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException




public class GetCurrentURl {

	KeywordLogger log=new KeywordLogger()
	@Keyword


	def extractIDfromURL(String url,String urlPattern) {
		def matcher = (url=~urlPattern)
		String id = matcher ? matcher[0][1] : null
		if(id != null) {
			return id
		}else {
			return null
		}
	}
}
