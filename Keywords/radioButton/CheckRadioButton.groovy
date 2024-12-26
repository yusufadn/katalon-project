package radioButton

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

public class CheckRadioButton {
	@Keyword
	def Check() {
		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Elements'))

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/li_Radio Button'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/label_Yes'), 0)

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/label_Yes'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/span_Yes'))

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/label_Impressive'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/span_Impressive'))

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/label_No'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/RadioButton/Page_DEMOQA/span_Impressive'))
	}
}
