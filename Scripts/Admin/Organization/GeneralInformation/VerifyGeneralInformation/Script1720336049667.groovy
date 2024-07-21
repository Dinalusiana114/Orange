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

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/li_Organization'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/li_General Information'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/h6_General Information'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Organization Name'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Registration Number'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Tax ID'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_Phone'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Fax'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Address Street 1'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Address Street 2'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_StateProvince'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_ZipPostal Code'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_Notes'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_Email'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_City'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Country'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/div_United States'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/label_Number of Employees'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_92'))

WebUI.click(findTestObject('Object Repository/Admin/Page_OrangeHRM/p_Required'))

WebUI.delay(5)

