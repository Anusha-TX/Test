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

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException

import internal.GlobalVariable

// Keywords Functions1

public class WorkCoordinatorScreen {
	KeywordLogger log = new KeywordLogger()

	@Keyword
	def WorkLoadMetricsCaseQueues(String metricsName) {
		try {
			TestObject clcikWorkloadMatrics = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/click_Workload Metrics')
			TestObject selectCaseQueues = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/select_Case_Queues')

			WebUI.click(clcikWorkloadMatrics)
			WebUI.selectOptionByValue(selectCaseQueues,metricsName, true)
		} catch(StepFailedException e) {
			log.logFailed("WorkLoad Metrics Case Queues Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def WorkloadMetricsCaseByType(String metricsName) {
		try {
			TestObject clcikWorkloadMatrics = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/click_Workload Metrics')
			TestObject selectCaseByTypes = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/select_case_queues')

			WebUI.click(clcikWorkloadMatrics)
			WebUI.selectOptionByValue(selectCaseByTypes,metricsName, true)
		}  catch(StepFailedException e) {
			log.logFailed("Workload Metrics Case By Type Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def WorkLoadMetricsCasesByStatus(String metricsName) {
		try {
			TestObject clcikWorkloadMatrics = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/click_Workload Metrics')
			TestObject selectCaseByTypes = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Queues/select_case_queues')

			WebUI.click(clcikWorkloadMatrics)
			WebUI.selectOptionByValue(selectCaseByTypes,metricsName, true)
		}  catch(StepFailedException e) {
			log.logFailed("WorkLoad Metrics Cases By Status Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def caseSearch() {
		try {
			TestObject caseSearch = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Search/lnk_Case_Search')
			TestObject enbCaseSearch = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Case_Search/enable_Case_Search')

			WebUI.click(caseSearch)
			WebUI.click(enbCaseSearch)
		} catch(StepFailedException e) {
			log.logFailed("Case Search Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def organizeWidgesCustomOrder() {
		try {
			TestObject dltActionException =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Action Exceptions_widgets')
			TestObject dltActivityGraph = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Activity Graphs_widgets')
			TestObject dltCaseProcessing = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Case Processing_widgets')
			TestObject dltSystemBalance = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_System Balance_widgets')
			TestObject dltSystemWorkload = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_System Workload_widgets')
			TestObject dltUserCapacity = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_User Capacity_widgets')
			TestObject dltAbsentUSerMemo = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Absent User Memo_widgets')
			TestObject dltCaseQueues  = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Case Queues_widgets')

			WebUI.click(dltActionException)
			WebUI.click(dltActivityGraph)
			WebUI.click(dltCaseProcessing)
			WebUI.click(dltSystemBalance)
			WebUI.click(dltSystemWorkload)
			WebUI.click(dltUserCapacity)
			WebUI.click(dltAbsentUSerMemo)
			WebUI.click(dltCaseQueues)
		} catch(StepFailedException e) {
			log.logFailed("Organize Widges Custom Order Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def dragAndDropWidges() {
		try {
			TestObject dragActException =   findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/arrow_Action Exceptions_move')
			TestObject dropActivityGraph = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/arrow_Activity Graphs_move')

			WebUI.click(dragActException)
			WebUI.click(dropActivityGraph)
		} catch(StepFailedException e) {
			log.logFailed("Drag And Drop Widges Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def userTimeOff(String userReason) {
		try {
			TestObject clickUserTime = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/a_User Time Off')
			TestObject user = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/select_User_Name')
			TestObject sltUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/ddl_Select_User_Kyle')
			TestObject reason = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/input_Reason')
			TestObject btnSave = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/svg_Actions_Save')

			WebUI.click(clickUserTime)
			WebUI.click(user)
			WebUI.click(sltUser)
			WebUI.click(reason)
			WebUI.setText(reason,userReason)
			WebUI.click(btnSave)
		}  catch(StepFailedException e) {
			log.logFailed("User Time Off's Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetsExportData() {
		try {
			TestObject systemWorkload = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload')
			TestObject exportSystemWorkload = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_Export_Widgets/export_Widget_Data_System_Workload')
			TestObject exportUserCapacity = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_Export_Widgets/export_Widget_Data_User_Capacity')
			TestObject exportAbsentUserMemo = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_Export_Widgets/export_Widget_Data_Absent_User_Memo')
			TestObject exportCaseQueues = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_Export_Widgets/export_Widget_Data_Case_Queues')

			WebUI.mouseOver(systemWorkload)
			WebUI.click(exportSystemWorkload)
		} catch(StepFailedException e) {
			log.logFailed("Export Widgets Data Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def actionDueFilters() {
		try {
			TestObject sltActionDue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/a_Actions Due')
			TestObject type = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Type')
			TestObject assignedUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Assigned User')
			TestObject expirationdate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Expiration Date')
			TestObject daysutillDue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Days Until Due')
			TestObject timeEstimation = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Time Estimate')
			TestObject casenumber =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Case Number')
			TestObject caseType = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Case Type')
			TestObject creationDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Creation Date')
			TestObject transactionType = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Transaction Type')
			TestObject transactionAmount = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Transaction Amount')
			TestObject trace = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/span_Trace')
			TestObject users = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/label_User')
			TestObject usergroups = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/label_User Group')
			TestObject actions = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/label_Action')
			TestObject sltUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/selec_Users')
			TestObject user = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/ddl_Select_All_User')
			TestObject sltUserGroup = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/select_User_Group')
			TestObject userGroup = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/ddl_Select_Group_Admin')
			TestObject sltActions = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/select_All_Action')
			TestObject allAction = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/ddl_Select_All_Actions')

			WebUI.click(sltActionDue)
			WebUI.verifyElementPresent(type, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(assignedUser, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(expirationdate, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(daysutillDue, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(timeEstimation, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(casenumber, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(caseType, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(creationDate, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(transactionType, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(transactionAmount, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(trace, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(users, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(usergroups, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(actions, GlobalVariable.globalShortDelay, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(sltUser)
			WebUI.click(user)
			WebUI.click(sltUserGroup)
			WebUI.click(userGroup)
			WebUI.click(sltActions)
			WebUI.click(allAction)
		} catch(StepFailedException e) {
			log.logFailed("Action Due Filters Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetsActionExceptions() {
		try {
			TestObject dltActionException =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Dashboard_Widgets_Organize/btn_Delete_Action Exceptions_widgets')

			WebUI.mouseOver(dltActionException)
		} catch(StepFailedException e) {
			log.logFailed("Widgets Action Exceptions Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetsActivityGrapgh() {
		try {
			TestObject activityGraph = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_Activity_Graphs')
			TestObject sltToday = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/input_Today_Activity_Graph')
			TestObject startDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/input_Activity_Graphs_StartDate')
			TestObject endDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/input_Activity_Graph_EndDate')

			WebUI.mouseOver(activityGraph)
			WebUI.click(sltToday)
		} catch(StepFailedException e) {
			log.logFailed("Widgets Activity Grapgh Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetsCaseProcessing() {
		try {
			TestObject caseProcessingGrapgh = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_Case Processing')
			TestObject caseProcessingChart = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/svg_Case_Processing_Canvas')

			WebUI.mouseOver(caseProcessingGrapgh)
		}  catch(StepFailedException e) {
			log.logFailed("Widgets Case Processing Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetSystemBalance() {
		try {
			TestObject systemBalanca = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Balance')
			TestObject yesterdayBalance = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Balance_Yesterday_Balance')
			TestObject todayBalance = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Balance_Todays_Balance')

			WebUI.mouseOver(systemBalanca)
			String previousDay = WebUI.getText(yesterdayBalance)
			String currentDay  = WebUI.getText(todayBalance)
			println(previousDay)
			println(currentDay)
		}  catch(StepFailedException e) {
			log.logFailed("Widgets System Balance Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetSystemWorkload() {
		try {
			TestObject systemWorkload = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload')
			TestObject verifyTotal = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Total')
			TestObject totalCases = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Total_Cases')
			TestObject totalActions = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Total_Actions')
			TestObject verifyTodayAction = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Todays_Actions')
			TestObject processedTodayAction = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Processed_Todays_Action')
			TestObject failedTodayActions = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Failed_Todays_Action')
			TestObject verifyActionPerHour = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Actions_Per_Hour')
			TestObject processedActionPerHour = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_Sys_Work_Act_Per_Hour_Pro')
			TestObject failedActionPerHour = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_System_Workload_Actions_Per_Hour_Failed')

			WebUI.mouseOver(systemWorkload)
			WebUI.mouseOver(verifyTotal)
			String getTotalcase =	WebUI.getText(totalCases)
			String getTotalActions = WebUI.getText(verifyTotal)
			WebUI.mouseOver(verifyTodayAction)
			String getProcessedTodayAction = WebUI.getText(processedTodayAction)
			String getFailedTodayActions = WebUI.getText(failedTodayActions)
			WebUI.mouseOver(verifyActionPerHour)
			String getProcessedActionPerHour = WebUI.getText(processedActionPerHour)
			String getFailedActionPerHour  = WebUI.getText(failedActionPerHour)

			println(getTotalcase)
			println(getTotalActions)
			println(getProcessedTodayAction)
			println(getFailedTodayActions)
			println(getProcessedActionPerHour)
			println(getFailedActionPerHour)
		}  catch(StepFailedException e) {
			log.logFailed("Widgets System Workload Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetUserCapacity() {
		try {
			TestObject userCapacity = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_User_Capacity_Widgets')
			TestObject userName1 = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/User_Capacity_User_Name1')
			TestObject userName2 = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/User_Capacity_User_Name2')

			WebUI.mouseOver(userCapacity)
			String getUserData1 = WebUI.getText(userName1)
			String getUserData2 = WebUI.getText(userName2)

			println(getUserData1)
			println(getUserData2)
		} catch(StepFailedException e) {
			log.logFailed("Widget User Capacity Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def widgetCaseQueues() {
		try {
			TestObject caseQueues =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_Case_Queues')
			TestObject countQueues = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/Case_Queues_Count')

			WebUI.mouseOver(caseQueues)
			String getTotalQueues = WebUI.getText(countQueues)
			println(getTotalQueues)
		} catch(StepFailedException e) {
			log.logFailed("Widget Case Queues Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def homeScreenCaseSearch() {
		try {
			TestObject sltStatus =  findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Status_OpenPending')
			TestObject uncheckOpen = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/input_Uncheck_Open')
			TestObject uncheckPending = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/input_Uncheck_Pending')
			TestObject sltOk = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_OK')
			TestObject searchMagnifying =  findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/svg_Magnifying_Search')

			WebUI.click(sltStatus)
			WebUI.click(uncheckOpen)
			WebUI.click(uncheckPending)
			WebUI.click(sltOk)
			WebUI.click(searchMagnifying)
		} catch(StepFailedException e) {
			log.logFailed("Home Screen Case Search Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def selectCase() {
		try {
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Process/Case Processor/Page_Case_Queues_Processor_Queues/div_20241106000002')

			WebUI.rightClick(sltCase)
		} catch(StepFailedException e) {
			log.logFailed("Select Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def sendMemo() {
		try {
			TestObject sendMemo = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Send_Memo')
			TestObject sltUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/select_Select_User')
			TestObject sltMemo = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/ddl_Send_Memo_TestingXperts')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')
			TestObject msgBox = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_SendMemo_Message_Box')
			TestObject sltCancel = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Close')

			WebUI.click(sendMemo)
			WebUI.click(sltUser)
			WebUI.click(sltMemo)
			WebUI.click(sltSend)
			WebUI.click(sltCancel)
		} catch(StepFailedException e) {
			log.logFailed("Send Memo Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def assignCase() {
		try {
			TestObject sltAssignCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Assign_Case')
			TestObject assign = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/select_Assign_User')
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/ddl_Assign_Case_To_Kyle')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltAssignCase)
			WebUI.click(assign)
			WebUI.click(sltCase)
			WebUI.click(sltSend)
		} catch(StepFailedException e) {
			log.logFailed("Assign Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def flagCase() {
		try {
			TestObject sltFlagCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Flag_Case')
			TestObject sltFlag = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Select_Flag')
			TestObject blackFlag = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/a_Black_Flag')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltFlagCase)
			WebUI.click(sltFlag)
			WebUI.click(blackFlag)
			WebUI.click(sltSend)
		}  catch(StepFailedException e) {
			log.logFailed("Flag Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def clearFlagCase() {
		try {
			TestObject sltFlagCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Flag_Case')
			TestObject sltFlag = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Select_Flag')
			TestObject clearFlag = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/a_Clear_Flag')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltFlagCase)
			WebUI.click(sltFlag)
			WebUI.click(clearFlag)
			WebUI.click(sltSend)
		}  catch(StepFailedException e) {
			log.logFailed("Clear Flag Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def reQueueCase() {
		try {
			TestObject sltRequeue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Re-Queue_Case')
			TestObject btnCancel = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Close')

			WebUI.click(sltRequeue)
			WebUI.click(btnCancel)
		} catch(StepFailedException e) {
			log.logFailed("Re-Queue Case Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def attachWorkflow() {
		try {
			TestObject sltAttachWorkflow = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Attach_Workflow')
			TestObject sltWorkflow  = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/input_Select_Workflow')
			TestObject clkWorkflow =  findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/a_(Dispute) Adhoc Workflow - Entry Node 1')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltAttachWorkflow)
			WebUI.click(sltWorkflow)
			WebUI.click(clkWorkflow)
			WebUI.click(sltSend)
		} catch(StepFailedException e) {
			log.logFailed("Attach Workflow Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def userTimeScheduleGraph() {
		try {
			TestObject username = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/th_User_Time_User_Name')
			TestObject from = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/th_User_Time_From')
			TestObject to =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/th_User_Time_To')
			TestObject reason = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/th_User_Time_Reason')
			TestObject actions = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/th_User_Time_Actions')

			WebUI.verifyElementPresent(username, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(from, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(to, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(reason, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(actions, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		}  catch(StepFailedException e) {
			log.logFailed("User Time Schedule Graph Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openUserTimeOff() {
		try {
			TestObject clickUserTime = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Work Coordinator_User Time_Off/a_User Time Off')

			WebUI.click(clickUserTime)
		}  catch(StepFailedException e) {
			log.logFailed("Open User Time Off's Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def actionDueGraph() {
		try {
			TestObject type = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Type')
			TestObject assignedUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Assigned_User')
			TestObject expirationDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Expiration_Date')
			TestObject creationDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Creation_Date')
			TestObject caseType = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Case_Type')
			TestObject caseNumber = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Case_Number')
			TestObject timeEstimation = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Time_Estimate')
			TestObject actionDue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/a_Actions Due')

			WebUI.verifyElementPresent(type, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(assignedUser, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(expirationDate, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(creationDate, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(caseType, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(caseNumber, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(timeEstimation, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(actionDue, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Action Due Graph Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def openActionDue() {
		try {
			TestObject sltActionDue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Action_Due_Filters/a_Actions Due')

			WebUI.click(sltActionDue)
		} catch(StepFailedException e) {
			log.logFailed("Open Action Due Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def caseTransaction() {
		try {
			TestObject trace =	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Trace')
			TestObject transactionType = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Transaction_Type')
			TestObject transactionAmount = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Transaction_Amount')

			WebUI.verifyElementPresent(trace, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(transactionType, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(transactionAmount, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Case Transaction Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def transactionRecordsDisplay() {
		try {
			TestObject type = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Type')
			TestObject assignedUser = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Assigned_User')
			TestObject expirationDate = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Expiration_Date')
			TestObject timeEstimation = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Time_Estimate')
			TestObject daysUntillDue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/span_Action_Due_Days_Until_Due')

			WebUI.verifyElementPresent(type, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(assignedUser, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(expirationDate, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(timeEstimation, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(daysUntillDue, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Transaction Records Display Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def verifyRecords() {
		try {
			TestObject sltRecord = 	findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/td_20241107000017')
			TestObject sendMemo = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/div_Send_Memo')
			TestObject reassignCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/div_Reassign Case')
			TestObject copyCellValue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/div_Copy Cell Value To Clipboard')
			TestObject selectedValue = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/div_Save Selected Cases To XLSX')
			TestObject saveResults = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/div_Save Results To XLSX')

			WebUI.rightClick(sltRecord)
			WebUI.verifyElementPresent(sendMemo, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(reassignCase, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(copyCellValue, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(selectedValue, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(saveResults, GlobalVariable.globalShortDelay , FailureHandling.STOP_ON_FAILURE)
		} catch(StepFailedException e) {
			log.logFailed("Verify Records Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def showAll() {
		try {
			TestObject sltCheckbox =  findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_User_Time_Off_UI_Validation/input_Action_Show_All')

			WebUI.click(sltCheckbox)
		} catch(StepFailedException e) {
			log.logFailed("Show All Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def assignCaseToKyle() {
		try {
			TestObject sltAssignCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Assign_Case')
			TestObject assign = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/select_Assign_User')
			TestObject sltCase =findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/ddl_Assign_Case_To_Kyle')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltAssignCase)
			WebUI.click(assign)
			WebUI.click(sltCase)
			WebUI.click(sltSend)
		} catch(StepFailedException e) {
			log.logFailed("Assign Case To Jamie Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def assignCaseToOther() {
		try {
			TestObject sltAssignCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/div_Assign_Case')
			TestObject assign = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/select_Assign_User')
			TestObject sltCase = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/ddl_ReAssign_Case_Testing')
			TestObject sltSend = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_SendMemo_FlagCase_AssignCase1/button_Send')

			WebUI.click(sltAssignCase)
			WebUI.click(assign)
			WebUI.click(sltCase)
			WebUI.click(sltSend)
		} catch(StepFailedException e) {
			log.logFailed("Assign Case To Other Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}

	@Keyword
	def CheckCaseAssigned() {
		try {
			TestObject userCapacity = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/div_User_Capacity_Widgets')
			TestObject userName1 = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/User_Capacity_User_Name1')
			TestObject userName2 = findTestObject('Object Repository/Web/Dispute/Process/Work Coordinator/Page_Dashboard_Widgets/User_Capacity_User_Name2')

			WebUI.mouseOver(userCapacity)
			String getUserData1 = WebUI.getText(userName1)
			String getUserData2 = WebUI.getText(userName2)

			println("Assigned Cases Number: "+ getUserData1)
			println("Assigned Cases Number: "+ getUserData2)
		} catch(StepFailedException e) {
			log.logFailed("Check Case Assigned Step failed " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		} catch(Exception e) {
			log.logError("Unexpected error occured: " + e.getMessage())
			WebUI.takeScreenshot()
			throw e
		}
	}
}



