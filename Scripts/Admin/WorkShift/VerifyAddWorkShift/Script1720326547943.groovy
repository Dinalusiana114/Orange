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

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/li_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_Work Shifts'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_Add Work Shift'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Shift Name'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'), 'Minggu')

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_Working Hours'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_From'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_To'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Duration Per Day'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_8.00'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Assigned Employees'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_OrangeHRM/input_Admin_oxd-input oxd-input--focus'), '')

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_Required'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_Work Shifts'))

WebUI.delay(5)

