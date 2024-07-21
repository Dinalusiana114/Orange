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

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/h6_PIM'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/li_Configuration'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/li_Optional Fields'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/p_Optional Fields'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/h6_Show Deprecated Fields'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/p_Show Nick Name, Smoker and Military Servi_657bbe'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/h6_Country Specific Information'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/p_Show SSN field in Personal Details'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/p_Show SIN field in Personal Details'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/p_Show US Tax Exemptions menu'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/PIM/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.delay(3)

