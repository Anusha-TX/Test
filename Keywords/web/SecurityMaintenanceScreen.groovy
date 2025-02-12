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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

import config.TestDataManager as TestDataManager

// Keywords Functions

public class SecurityMaintenanceScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def addUser(String userID, String userName, String superVisorName, String userMailStop, String userEmail, String userPhoneNumber, String userDomain, String assignedGroupName) {
		try {
			TestObject sltToggle = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/select_Toggle')
			TestObject btnNew = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/btn_New')
			TestObject userid =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_User ID_name')
			TestObject name =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Full Name_fullName')
			TestObject superVisor = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Supervisor_name')
			TestObject mailStop = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Mail stop')
			TestObject email = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Email_emailAddress')
			TestObject phone =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Phone Number_form-control')
			TestObject domain = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Domain_domain')
			TestObject accountStatus = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_tripsUser.accountStatus.active')
			TestObject sltAssinedGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/ddl_Add_Group')
			TestObject clkGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/a_slt_Admin_Group')
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/button_Save')

			WebUI.click(sltToggle)
			WebUI.click(btnNew)
			WebUI.setText(userid,userID )
			WebUI.setText(name,userName)
			WebUI.setText(superVisor,superVisorName)
			WebUI.setText(mailStop,userMailStop)
			WebUI.setText(email,userEmail)
			WebUI.setText(phone,userPhoneNumber)
			WebUI.setText(domain,userDomain)
			WebUI.click(accountStatus)
			WebUI.setText(sltAssinedGroup,assignedGroupName)
			WebUI.click(clkGroup)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Add User Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addGroups(String groupName, String userName, String user1) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/a_New')
			TestObject gName =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/input_Group Name_name')
			TestObject clkAssigned = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/div_Assigned Users')
			TestObject addUser = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/input_Add User to group')
			TestObject clkUser = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/mark_Add_User_To_Group',[('user'):user1])
			TestObject verify = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/div_all_menus')
			TestObject dropdown = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/svg_Deny_bi bi-chevron-down')
			TestObject permission = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/div_ReadWrite')
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/button_Save')

			WebUI.click(btnNew)
			WebUI.setText(gName,groupName )
			WebUI.click(clkAssigned)
			WebUI.setText(addUser,userName)
			WebUI.click(clkUser)
			WebUI.click(dropdown)
			WebUI.click(permission)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Add Groups Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def createNewgroup(String groupName) {
		try {
			TestObject btnNew = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/a_New')
			TestObject gName =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/input_Group Name_name')
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/button_Save')

			WebUI.click(btnNew)
			WebUI.click(gName)
			WebUI.setText(gName,groupName )
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Create New Group Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addSitesToUser(String userID, String userName, String superVisorName, String userMailStop, String userEmail, String userPhoneNumber, String userDomain, String assignedGroupName) {
		try {
			TestObject sltToggle = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/select_Toggle')
			TestObject btnNew = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/btn_New')
			TestObject userid =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_User ID_name')
			TestObject name =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Full Name_fullName')
			TestObject superVisor = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Supervisor_name')
			TestObject mailStop = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Mail stop')
			TestObject email = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Email_emailAddress')
			TestObject phone =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Phone Number_form-control')
			TestObject domain = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Domain_domain')
			TestObject accountStatus = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_tripsUser.accountStatus.active')
			TestObject clkSites = findTestObject('Object Repository/Web/Common/Maintain/Setting Maintenance/Page_INI_Application_Setting/span_Sites')
			TestObject chkJhonD = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Site_To_Bank_Mapping/input_Sites_Jhon_D_Austria')
			TestObject chkUSBank = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Site_To_Bank_Mapping/input_Sites_US_Bank')
			TestObject sltAssinedGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/ddl_Add_Group')
			TestObject clkGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/a_slt_Admin_Group')
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/button_Save')

			WebUI.click(sltToggle)
			WebUI.click(btnNew)
			WebUI.setText(userid,userID )
			WebUI.setText(name,userName)
			WebUI.setText(superVisor,superVisorName)
			WebUI.setText(mailStop,userMailStop)
			WebUI.setText(email,userEmail)
			WebUI.setText(phone,userPhoneNumber)
			WebUI.setText(domain,userDomain)
			WebUI.click(accountStatus)
			WebUI.click(chkJhonD)
			WebUI.click(chkUSBank)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Add Sites To User Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def toogleToUser() {
		try {
			TestObject sltToggle = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/select_Toggle')

			WebUI.click(sltToggle)
		} catch(StepFailedException e) {
			log.logFailed("Toogle To User Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}


	@Keyword
	def selectCheckDemoUser(String user1) {
		try {
			TestObject sltuser = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/span_CheckDemo_User',[('user'):user1])

			WebUI.click(sltuser)
		} catch(StepFailedException e) {
			log.logFailed("Select Check Demo USer Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectTestUser(String user) {
		try {
			TestObject sltuser = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/txt_UserName',[('Username'):user])

			WebUI.click(sltuser)
		} catch(StepFailedException e) {
			log.logFailed("Select Test USer Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCheckTestUser(String user1) {
		try {
			TestObject sltuser = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/span_CheckTest_User',[('user'):user1])

			WebUI.click(sltuser)
		} catch(StepFailedException e) {
			log.logFailed("Select Check Test USer Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectGroup1() {
		try {
			TestObject sltGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/span_Group')

			WebUI.click(sltGroup)
		} catch(StepFailedException e) {
			log.logFailed("Select Group1 Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectAdminDemoGroup(String userGroup) {
		try {
			TestObject sltGroup = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add Groups/span_Group_Name',[('group'):userGroup])

			WebUI.click(sltGroup)
		} catch(StepFailedException e) {
			log.logFailed("Select Admin Demo Group Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def addTestUser(String userID, String userName) {
		try {
			TestObject sltToggle = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/select_Toggle')
			TestObject btnNew = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/btn_New')
			TestObject userid =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_User ID_name')
			TestObject name =  findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/input_Full Name_fullName')
			TestObject btnSave = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Add_Users/button_Save')

			WebUI.click(sltToggle)
			WebUI.click(btnNew)
			WebUI.setText(userid,userID )
			WebUI.setText(name,userName)
			WebUI.click(btnSave)
		} catch(StepFailedException e) {
			log.logFailed("Add Test User Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def deleteAccount() {
		try {
			TestObject btnDelete = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Site_To_Bank_Mapping/button_Account_Delete')
			TestObject delete = findTestObject('Object Repository/Web/Common/Maintain/Security Maintenance/Page_Site_To_Bank_Mapping/button_Confirmation_Delete')

			WebUI.click(btnDelete)
			WebUI.click(delete)
		}  catch(StepFailedException e) {
			log.logFailed("Select Delete Account Step Failed" + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}
