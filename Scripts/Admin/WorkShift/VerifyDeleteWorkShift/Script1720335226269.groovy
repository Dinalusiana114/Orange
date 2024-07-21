import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Admin/VerifyAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/a_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_Sample'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_1000 AM'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_0500 PM'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_7.00'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_IT_oxd-icon-button oxd-table-cell-ac_5080e6'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_Are you Sure'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_The selected record will be permanently d_948fcd'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_Work Shifts'))

WebUI.delay(5)

