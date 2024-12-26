package webTables

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

public class AddData {

	@Keyword
	def Add() {
		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Elements'))

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Web_Tables'))

		WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/button_Add'), 30)

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Add'))

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), 'Coba')

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), 'Satu')

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'coba@gmail.com')

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Age_age'), '22')

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), '20000000')

		WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Department_department'), 'Technology')

		WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))
	}
}
