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

/*Write a Katalon Studio Test Case to perform the following steps:
 * 1. Open a Browser to the URL stored in the LocalVariable.SiteURL
 * 2. Maximize the browser
 * 3. Click the make appointment button with the id 'Object Repository/Page_CURA Healthcare Service/button_Book Appointment'
 * 4. Fill in the username 'Page_CURA Healthcare Service/input_Username_username' with the value of the local variable 'username'
 * 5. Fill in the password 'Page_CURA Healthcare Service/input_Password_password' with the value of the local variable 'password'
 * 6. Click the login button with id 'Page_CURA Healthcare Service/button_Login'
 * 7. Verify thet the appointment div 'Page_CURA Healthcare Service/h2_Make Appointment' exists with timeout 5s
 * 8. Close the browser * 
 */
// 1. Open a Browser to the URL stored in the LocalVariable.SiteURL
WebUI.openBrowser(GlobalVariable.SiteURL)

// 2. Maximize the browser
WebUI.maximizeWindow()

// 3. Click the make appointment button with the id 'Object Repository/Page_CURA Healthcare Service/button_Book Appointment'
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

// 4. Fill in the username 'Page_CURA Healthcare Service/input_Username_username' with the value of the local variable 'username'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), username)

// 5. Fill in the password 'Page_CURA Healthcare Service/input_Password_password' with the value of the local variable 'password'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), password)

// 6. Click the login button with id 'Page_CURA Healthcare Service/button_Login'
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

// 7. Verify the appointment div 'Page_CURA Healthcare Service/h2_Make Appointment' exists with timeout 5s
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 5)

// 8. Close the browser
WebUI.closeBrowser()
