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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Web Tables'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), 'Coba')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), 'Satu')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'coba@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Age_age'), '22')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), '20000000')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Department_department'), 'Technology')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Add_searchBox'), 'coba')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Coba'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Satu'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_22'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_cobagmail.com'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_20000000'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Technology'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_First Name'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), 'adnan')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), 'Satu')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Last Name'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), 'Dua')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_adnan'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Dua'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/path'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Add'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Add_searchBox'), '')


