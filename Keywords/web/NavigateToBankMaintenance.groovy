package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

import com.kms.katalon.core.testobject.TestObject
import config.ConfigurationManager
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

// Keywords Functions

public class NavigateToBankMaintenance {
	KeywordLogger log=new KeywordLogger()


	@Keyword
	def archivedBankId(String bankArchiId) {
		try {
			TestObject bankiD =   findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Archived_Bank/txt_Bank_id')
			TestObject nameField =  findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Archived_Bank/txt_Name_And_Address')

			WebUI.click(bankiD)
			WebUI.setText(bankiD,bankArchiId)
			WebUI.click(nameField)
		} catch(StepFailedException e) {
			log.logFailed("Archived Bank Id step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickArchivedNo() {
		try {
			TestObject btnNo = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Archived_Bank/btn_Activate_No')

			WebUI.click(btnNo)
		}  catch(StepFailedException e) {
			log.logFailed("Click Archived No step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickArchivedYes() {
		try {
			TestObject btnYes = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Archived_Bank/btn_Activate_Yes')

			WebUI.click(btnYes)
		}   catch(StepFailedException e) {
			log.logFailed("Click Archived Yes step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def searchBankCard(String bankArchiId) {
		try {
			TestObject serachBank = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Enter_Bank_Maintenance/txt_Search_Field')

			WebUI.setText(serachBank,bankArchiId)
		}  catch(StepFailedException e) {
			log.logFailed("Search Bank Card step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickDocumentationLink() {
		try {
			TestObject documentationLink = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Enter_Bank_Maintenance/btn_Documentation_Lnk')

			WebUI.click(documentationLink)
		} catch(StepFailedException e) {
			log.logFailed("Click Documentation Link step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clickBankMaintenance() {
		try {
			TestObject btnBankMaintenance =  findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Enter_Bank_Maintenance/lbl_Bank_Maintenance')

			WebUI.click(btnBankMaintenance)
		}  catch(StepFailedException e) {
			log.logFailed("Click Documentation Link step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectBank() {
		try {
			TestObject sltBank = findTestObject('Object Repository/Web/Dispute/Maintain/Misc/Bank Maintenance/Page_Archived_Bank/lbl_Bank of DSS')

			WebUI.click(sltBank)
		}  catch(StepFailedException e) {
			log.logFailed("Select Bank step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	
}


