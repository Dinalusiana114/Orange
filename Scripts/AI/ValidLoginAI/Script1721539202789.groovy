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

//create a function named login which receives 2 parameter : username & password
//open browser, go to https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
//maximize window
//click h5_Login
//enter username in input_Nombre de usuario_username 
//enter password in input_Contrasea_password
//click button_Login
// Open browser and navigate to the specified URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')

// Maximize the browser window
WebUI.maximizeWindow()

// Enter the username in the 'input_Nombre de usuario_username' field
WebUI.setText(findTestObject('Object Repository/Page OrangeHRM/input_Nombre de usuario_username'), GlobalVariable.username)

// Enter the password in the 'input_Contrasea_password' field
WebUI.setText(findTestObject('Object Repository/Page OrangeHRM/input_Contrasea_password'), GlobalVariable.password)

// Click on the 'button_Login' element
WebUI.click(findTestObject('Object Repository/Page OrangeHRM/button_Login'))

