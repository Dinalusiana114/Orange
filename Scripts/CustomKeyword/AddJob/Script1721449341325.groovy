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

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/h6_Job Titles'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/h6_Add Job Title'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/label_Job Title'))

CustomKeywords.'customKeyword.AddJob.InputJobTitle'('QA')

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/label_Job Description'))

CustomKeywords.'customKeyword.AddJob.InputJobDescription'('QA adalah')

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/label_Job Specification'))

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/label_Note'))

CustomKeywords.'customKeyword.AddJob.InputJobNote'('Catatan Kerja')

WebUI.click(findTestObject('Object Repository/Job/Page_OrangeHRM/button_Save'))

