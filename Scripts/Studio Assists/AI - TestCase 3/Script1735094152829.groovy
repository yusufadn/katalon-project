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


/*I have a list of test objects as blow:
 - Make appointment button: Page_CURA Healthcare Service/a_Make Appointment
 - Username: Page_CURA Healthcare Service/input_Username_username
 - Password: Page_CURA Healthcare Service/input_Password_password
 - Login button: Page_CURA Healthcare Service/button_Login
 - Appointment div element: Page_CURA Healthcare Service/h2_Make Appointment
 
 I also have a URL: GlobalVariable.SiteURL, and two local variables 'username' and 'password'
 
 Write me a test case to perform the following steps
 1. Open browser to the URL stored in G SiteURL
 2. Click the make appointment button
 3. Fill in the username and password fields based on the variables
 4. Click the login button
 5. Verify that the appointment div exists with timeout 5s
 6. Close the browser
 */
// Open browser to the URL stored in GlobalVariable.SiteURL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.SiteURL)

// Click the make appointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

// Fill in the username and password fields based on the variables
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), username)
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), password)

// Click the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

// Verify that the appointment div exists with timeout 5s
WebUI.waitForElementVisible(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 5)

// Close the browser
WebUI.closeBrowser()
