package customKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class AddJob {
	
	@Keyword
	def InputJobTitle(String JobTitle) {
		try {
			WebUI.setText(findTestObject('Object Repository/Job/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), JobTitle, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Username Field")
			KeywordUtil.markPassed("Username has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("fail to inputted on element")
		}
	}
	
	@Keyword
	def InputJobDescription(String JobDesc) {
		try {
			WebUI.setText(findTestObject('Object Repository/Job/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-t_4f7bba'), JobDesc, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Username Field")
			KeywordUtil.markPassed("Username has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("fail to inputted on element")
		}
	}
	
	@Keyword
	def InputJobNote(String JobNote) {
		try {
			WebUI.setText(findTestObject('Object Repository/Job/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), JobNote, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Username Field")
			KeywordUtil.markPassed("Username has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("fail to inputted on element")
		}
	}
}
