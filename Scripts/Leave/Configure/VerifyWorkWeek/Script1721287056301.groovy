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

WebUI.callTestCase(findTestCase('Login/ValidLogin'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/li_Configure'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/li_Work Week'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/p_Work Week'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Monday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Tuesday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Wednesday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Thursday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Friday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Saturday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/label_Sunday'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/p_Required'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Leave/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.delay(3)

