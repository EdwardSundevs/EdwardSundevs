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

Mobile.startExistingApplication('com.punchh.caferio')

if (Mobile.waitForElementPresent(findTestObject('Object Repository/SignUp_Success/android.view.View (3)'),5) == true) {
	
Mobile.tap(findTestObject('SignUp_Success/Hamburger_Menu'), 0)

Mobile.tapAndHold(findTestObject('SignUp_Success/Option_Log_Out'), 3, 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Modal_LogOut_Leave'), 0)

} else if (Mobile.waitForElementPresent(findTestObject('Object Repository/SignUp_Success/android.view.View'), 5) == true) {

Mobile.tap(findTestObject('SignUp_Success/Button_Next_Slide'), 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Next_Slide'), 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Next_Slide'), 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Next_Slide'), 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Next_Slide'), 0)

Mobile.tap(findTestObject('SignUp_Success/Get Started_Slide'), 0)

} else if (Mobile.waitForElementPresent(findTestObject('Object Repository/General_Alert/android.view.View (11)'), 5) == true) {

Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (6)'), 0)

} else if (Mobile.waitForElementPresent(findTestObject('Login_Error/android.widget.Button (2)'), 5) == true) {

Mobile.hideKeyboard()

Mobile.pressBack()
}


Mobile.tap(findTestObject('Object Repository/Continue_as_a_Guest/android.widget.Button'), 0)

def urlGuest = Mobile.getText(findTestObject('Object Repository/Continue_as_a_Guest/android.widget.EditText - caferio.com'), 0)

Mobile.verifyEqual(urlGuest, urlGuest_Dev)

Mobile.closeApplication()

