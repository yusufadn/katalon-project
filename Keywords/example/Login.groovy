package example

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

import internal.GlobalVariable

public class Login {

	@Keyword
	def AppLogin() {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://demoqa.com/')

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Book Store Application'))

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Login'))

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_UserName_userName'), 'yusuf19')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_DEMOQA/input_Password_password'), 'SXcK+il7enjGPz2zn4KpFQ==')

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Login'))

		WebUI.waitForElementVisible(findTestObject('Page_DEMOQA/label_yusuf19'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}
