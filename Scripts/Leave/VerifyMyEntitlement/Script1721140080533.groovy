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

WebUI.callTestCase(findTestCase('Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/li_Entitlements'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/li_My Entitlements'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/h5_My Leave Entitlements'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Leave Type'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Leave Period'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/p_Add Leave Entitlement'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Add to'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Employee Name'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Leave Type'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Multiple Employees'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/button_Save'))

WebUI.delay(3)

