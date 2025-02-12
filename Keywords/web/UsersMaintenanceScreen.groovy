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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import internal.GlobalVariable
import config.ConfigurationManager
public class UsersMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()
	@Keyword
	def addUser(String user, String securitylevel) {
		try {
			TestObject addNewButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_addnewuser')
			TestObject selectUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_user')
			TestObject selectGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_group')
			TestObject selectGroupValue = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_group_value')
			TestObject selectSecurityLevel = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_security_level')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_save')
			TestObject verifyUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/verify_user')
			TestObject selectUserCheck1 = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_user_check1')
			TestObject selectValue = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_value')
			WebUI.click(addNewButton)
			WebUI.click(selectUser)
			WebUI.click(selectUserCheck1)
			//Select group
			boolean isGroupVisible = WebUI.verifyElementVisible(selectGroup)
			if (isGroupVisible) {
				WebUI.click(selectGroup)
				WebUI.click(selectGroupValue)
			}
			WebUI.click(selectSecurityLevel)
			WebUI.click(selectValue)
			//WebUI.selectOptionByLabel(selectSecurityLevel, securitylevel, false
			WebUI.click(saveButton)
		}catch(StepFailedException e) {
			log.logFailed("New user creation step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editUser(String securitylevelchanged) {
		try {
			TestObject selectSecurityLevel = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_security_level')
			TestObject selectGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_group')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_save')
			TestObject selectNewHire = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_new_hire')
			TestObject verifyUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/verify_user')
			WebUI.click(selectSecurityLevel)
			WebUI.waitForElementVisible(selectNewHire, GlobalVariable.globalLongDelay)
			WebUI.click(selectNewHire)
			boolean isSaveEnabled = WebUI.verifyElementClickable(saveButton, FailureHandling.OPTIONAL)
			if (isSaveEnabled) {
				WebUI.click(saveButton)
			}
			else {
				WebUI.comment("Saved already")
			}
		}catch(StepFailedException e) {
			log.logFailed("Edit user step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def editdeleteUser() {
		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject deleteSecondButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete_sec')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_cancel')
			WebUI.scrollToElement(deleteButton, GlobalVariable.globalMediumDelay)
			WebUI.click(deleteButton)
			WebUI.click(deleteSecondButton)
			boolean isCancelVisible = WebUI.verifyElementVisible(cancelButton, FailureHandling.OPTIONAL)
			if (isCancelVisible) {
				WebUI.click(cancelButton)
				WebUI.comment("Leaving the page")
			}
			else {
				WebUI.comment("Already left the page")
			}
		}catch(StepFailedException e) {
			log.logFailed("Delete user step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteUser() {
		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject deleteSecondButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete_sec')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_cancel')
			WebUI.scrollToElement(deleteButton, GlobalVariable.globalMediumDelay)
			WebUI.click(deleteButton)
			WebUI.click(deleteSecondButton)
		}catch(StepFailedException e) {
			log.logFailed("Delete user step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteUserforUserGroups() {
		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_cancel')
			WebUI.scrollToElement(deleteButton, GlobalVariable.globalMediumDelay)
			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {
			log.logFailed("Delete user step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteUserForAddRemoveGroups() {
		try {
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject cancelButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_cancel')
			TestObject selectUserCreated = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_user_created')
			WebUI.click(selectUserCreated)
			WebUI.scrollToElement(deleteButton, GlobalVariable.globalMediumDelay)
			WebUI.click(deleteButton)
			WebUI.click(deleteButton)
		}catch(StepFailedException e) {
			log.logFailed("Delete user step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addRemoveUserToGroups(String newgroup) {
		try {
			TestObject selectGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_group')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_save')
			TestObject selectNewGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_new_group')
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/toggle_to_user_group')
			TestObject selectDesiredGroupFromList = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_desired_group')
			TestObject expandUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/expand_user')
			TestObject removeUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/remove_user')
			TestObject addNewProfile = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/add_new_profile')
			TestObject selectUserCheckbox = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/select_user_checkbox')
			TestObject addbutton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_add')
			TestObject verifyUser = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/verify_user')
			TestObject userCheck = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/user_Check1')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject deleteButtonSec = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete_sec')
			WebUI.click(selectGroup)
			WebUI.waitForElementVisible(selectNewGroup, GlobalVariable.globalLongDelay)
			WebUI.click(selectNewGroup)
			boolean isSaveEnabled = WebUI.verifyElementClickable(saveButton, FailureHandling.OPTIONAL)
			if (isSaveEnabled) {
				WebUI.click(saveButton)
				WebUI.comment("Selected new group")
			}
			else {
				WebUI.comment("Already new group selected")
			}
			WebUI.click(toggleToGroups)
			WebUI.click(selectDesiredGroupFromList)
			WebUI.click(expandUser)
			WebUI.click(userCheck)
			WebUI.click(removeUser)
			WebUI.click(saveButton)
			//to delete back the user created
			WebUI.click(toggleToGroups)
			WebUI.click(userCheck)
			WebUI.waitForElementVisible(deleteButton, GlobalVariable.globalMediumDelay)
			boolean isdeleteClickable = WebUI.verifyElementClickable(deleteButton, FailureHandling.OPTIONAL)
			if (isdeleteClickable) {
				WebUI.click(deleteButton)
				WebUI.comment("Deleted")
			}
			else {
				WebUI.comment("No delete")
			}
			boolean isdeleteButtonSecClickable = WebUI.verifyElementClickable(deleteButtonSec, FailureHandling.OPTIONAL)
			if (isdeleteClickable) {
				WebUI.click(deleteButtonSec)
				WebUI.comment("Deleted")
			}
			else {
				WebUI.comment("No delete")
			}

			//Commenting as UI changed

			//			WebUI.click(addNewProfile)

			//			WebUI.click(selectUserCheckbox)

			//			WebUI.click(addbutton)

			//			WebUI.click(saveButton)
		}catch(StepFailedException e) {
			log.logFailed("Add/Remove user to groups step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def adhocActionWorkflow() {
		try {
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/toggle_to_user_group')
			TestObject selectAdminGroup = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/select_admin_group')
			TestObject adhocMenu = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/adhoc_menu')
			TestObject selectActions = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_actions')
			TestObject addMenuItem = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_add_menu_item')
			TestObject sendToFed = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/send_to_fed')
			TestObject selectWorkflows = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_workflows')
			TestObject addWorkflowItem = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/add_workflows')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/btn_save')
			TestObject sendToViewPointe = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_view_pointe_action')
			WebUI.click(toggleToGroups)
			WebUI.click(selectAdminGroup)
			WebUI.click(adhocMenu)
			WebUI.click(addMenuItem)
			WebUI.click(selectActions)
			WebUI.scrollToElement(sendToViewPointe, GlobalVariable.globalLongDelay)
			WebUI.click(sendToViewPointe)
			boolean isSaveEnabled = WebUI.verifyElementClickable(saveButton, FailureHandling.OPTIONAL)
			if (isSaveEnabled) {
				WebUI.click(saveButton)
				WebUI.comment("Action menu added")
			}
			else {
				WebUI.comment("Already action menu added")
			}

			//Commenting as above logic worked

			//			// Check if the sendtoviewpointe is visible

			//			boolean isAdhocActionVisible = WebUI.waitForElementPresent(sendToViewPointe,  GlobalVariable.globalLongDelay, FailureHandling.OPTIONAL)

			//			//WebUI.verifyElementPresent(sendToViewPointe, 5, FailureHandling.OPTIONAL)

			//

			//			if(isAdhocActionVisible) {

			//				//			WebUI.click(selectActions)

			//				//			WebUI.scrollToElement(sendToViewPointe, GlobalVariable.globalLongDelay)

			//				WebUI.click(sendToViewPointe)

			//				WebUI.click(saveButton)

			//			}

			//			else {

			//				WebUI.comment("SenToViewPointe Action is added already")

			//			}
		}catch(StepFailedException e) {
			log.logFailed("Add adhoc action and workflow step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def adhocActionWorkflowDelete() {
		try {
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/toggle_to_user_group')
			TestObject selectAdminGroup = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/select_admin_group')
			TestObject adhocMenu = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/adhoc_menu')
			TestObject selectActions = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_actions')
			TestObject addMenuItem = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_add_menu_item')
			TestObject sendToFed = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/send_to_fed')
			TestObject selectWorkflows = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_workflows')
			TestObject addWorkflowItem = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/add_workflows')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/btn_save')
			TestObject sendToViewPointe = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/click_view_pointe_action')
			TestObject trashSendToViewPointe = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/btn_trash_send_to_view_pionte')

			//			WebUI.click(toggleToGroups)

			//			WebUI.click(selectAdminGroup)

			//			WebUI.click(adhocMenu)

			WebUI.click(trashSendToViewPointe)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {
			log.logFailed("Add adhoc action and workflow step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
	@Keyword
	def userGroupPermissionMinMaxGreaterValue(String minvalue, String maxvalue) {
		try {
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_save')
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/toggle_to_user_group')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject selectAdminGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_Admin')
			TestObject maxAmt = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/input_max_amt')
			TestObject minAmt = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/input_min_amt')
			TestObject trips =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/div_TRIPS')
			TestObject recentCases =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_Recent Cases')
			TestObject openCases =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_20241106000001')
			TestObject verifyEnterReadOnly =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/button_Enter in Read Only')
			TestObject closeButton =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/btn_close')
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			String userUrl= ConfigurationManager.getBaseUrl('web')+ '/user-maintenance/dispute/users'
			WebUI.navigateToUrl(userUrl)

			//set min and max value
			WebUI.click(toggleToGroups)
			WebUI.click(selectAdminGroup)
			WebUI.setText(minAmt, minvalue)
			WebUI.setText(maxAmt, maxvalue)
			boolean isSaveEnabled = WebUI.verifyElementClickable(saveButton, FailureHandling.OPTIONAL)
			if (isSaveEnabled) {
				WebUI.click(saveButton)
				WebUI.comment("Saved")
			}
			else {
				WebUI.comment("Already saved")
			}
			WebUI.click(trips)
			//navigate to caseprocessor
			String caseprocessorUrl= ConfigurationManager.getBaseUrl('web')+ '/case-processor/Dispute/'
			WebUI.navigateToUrl(caseprocessorUrl)

			//			WebUI.click(recentCases)

			//			WebUI.click(openCases)

			WebUI.click(myCases)
			WebUI.click(caseACH)
			WebUI.click(openCase)
			// Test verifications
			WebUI.switchToWindowIndex(0)
			WebUI.click(verifyEnterReadOnly)
			WebUI.click(trips)
		}catch(StepFailedException e) {
			log.logFailed("Users group Min Max Greater Value step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def userGroupPermissionMinMaxasZero(String minvalueaszero, String maxvaluenew) {
		try {
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_save')
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/toggle_to_user_group')
			TestObject deleteButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/Users/btn_delete')
			TestObject selectAdminGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_Admin')
			TestObject maxAmt = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/input_max_amt')
			TestObject minAmt = findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/input_min_amt')
			TestObject trips =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/div_TRIPS')
			TestObject recentCases =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_Recent Cases')
			TestObject openCases =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/span_20241106000001')
			TestObject verifyEnterReadOnly =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/button_Enter in Read Only')
			TestObject closeButton =findTestObject('Object Repository/Web/Dispute/Maintain/Users/UserGroupMinMax/btn_close')
			TestObject myCases = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/ViewPointeAction/view_pointe_my_cases')
			TestObject caseACH = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/caseACH')
			TestObject openCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/EditAttachmentValidation/open_case')
			//set min and max value
			WebUI.click(toggleToGroups)
			WebUI.click(selectAdminGroup)
			WebUI.setText(minAmt, minvalueaszero)
			WebUI.setText(maxAmt, maxvaluenew)
			boolean isSaveEnabled = WebUI.verifyElementClickable(saveButton, FailureHandling.OPTIONAL)
			if (isSaveEnabled) {
				WebUI.click(saveButton)
				WebUI.comment("Saved")
			}
			else {
				WebUI.comment("Already saved")
			}
			WebUI.click(trips)
			//navigate to caseprocessor
			String caseprocessorUrl= ConfigurationManager.getBaseUrl('web')+ '/case-processor/Dispute/'
			WebUI.navigateToUrl(caseprocessorUrl)
			//			WebUI.click(recentCases)

			//			WebUI.click(openCases)
			WebUI.click(myCases)
			WebUI.click(caseACH)
			WebUI.click(openCase)
			// Test verifications
			WebUI.verifyElementNotPresent(verifyEnterReadOnly, GlobalVariable.globalMediumDelay, FailureHandling.STOP_ON_FAILURE )
			WebUI.click(trips)
		}catch(StepFailedException e) {
			log.logFailed("Users group Min Max as zero step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def adhocMenuProfiles(String setMenuValue) {
		try {
			TestObject toggleToGroups = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/toggle_to_user_group')
			TestObject selectDemoGroup = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/select_demo1_group')
			TestObject adhocMenu = findTestObject('Object Repository/Web/Dispute/Process/Case Processor_shruD/adhocMenu/adhoc_menu')
			TestObject dropdownAdhocMenu = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/dropdown_adhoc_menu')
			TestObject addMenuItem = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/div_Add_New_Menu')
			TestObject setMenuItem = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/input_adhocMenuName')
			TestObject saveButton = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/button_Save')
			TestObject plusCircle = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/svg_None_bi bi-plus-circle')
			TestObject actions = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/div_Actions')
			TestObject bankCardReturns = findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/div_BankCardReturns')
			TestObject bankCardDelete =findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/svg_bankcard_bi bi-trash')
			TestObject trash= findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/btn_trash')
			TestObject deleteButton=findTestObject('Object Repository/Web/Dispute/Maintain/Users/AdhocMenuProfiles/button_Delete')
			WebUI.click(toggleToGroups)
			WebUI.click(selectDemoGroup)
			WebUI.click(adhocMenu)
			WebUI.click(dropdownAdhocMenu)
			WebUI.click(addMenuItem)
			WebUI.setText(setMenuItem,setMenuValue )
			WebUI.click(saveButton)
			WebUI.click(plusCircle)
			WebUI.click(actions)
			WebUI.click(bankCardReturns)
			WebUI.click(saveButton)
			WebUI.click(bankCardDelete)
			WebUI.click(trash)
			WebUI.click(deleteButton)
			WebUI.click(saveButton)
		}catch(StepFailedException e) {
			log.logFailed("Add adhoc menu groups step failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured:" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}

