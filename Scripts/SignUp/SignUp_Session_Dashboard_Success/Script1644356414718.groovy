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

Mobile.startExistingApplication(GlobalVariable.caferio_dev)

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

Mobile.tapAndHold(findTestObject('Object Repository/Test/android.widget.Button'), 3, 10)

Mobile.tap(findTestObject('SignUp_Success/Input_Email'), 0)

String tm_Email = System.currentTimeMillis().toString()
String ts_Email = System.currentTimeSeconds().toString();
Mobile.setText(findTestObject('SignUp_Success/Input_Email_Text'), tm_Email + ts_Email + email, 0)

//Mobile.setText(findTestObject('SignUp_Success/Input_Email_Text'), email, 0)

Mobile.tap(findTestObject('SignUp_Success/Input_Name'), 0)

String ts_Name = System.currentTimeSeconds().toString();

Mobile.setText(findTestObject('SignUp_Success/Input_Name_Text'), name + ts_Name , 0)

Mobile.tap(findTestObject('SignUp_Success/Input_LastName'), 0)

String ts_LastName = System.currentTimeSeconds().toString();

Mobile.setText(findTestObject('SignUp_Success/Input_LastName_Text'), lastName + ts_LastName, 0)

Mobile.tap(findTestObject('SignUp_Success/Input_Phone'), 0)

String tm_Phone = System.currentTimeMillis().toString()

phone = tm_Phone;

Mobile.setText(findTestObject('SignUp_Success/Input_Phone_Text'), phone, 0)

Mobile.tap(findTestObject('SignUp_Success/Input_Password'), 0)

Mobile.setText(findTestObject('SignUp_Success/Input_Password_Text'), password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('SignUp_Success/Input_Confirm_Password'), 0)

Mobile.setText(findTestObject('SignUp_Success/Input_Confirm_Password_Text'), confirm_Password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('SignUp_Success/Input_Birthday'), 0)

Mobile.tap(findTestObject('SignUp_Success/Calendar_Button_1'), 0)

Mobile.tap(findTestObject('SignUp_Success/Calendar_Year_1995'), 0)

Mobile.tap(findTestObject('SignUp_Success/Calendar_Day_24'), 0)

Mobile.tap(findTestObject('SignUp_Success/Calendar_Button_2'), 0)

Mobile.getText(findTestObject('SignUp_Success/Input_Birthday_Text'), 0)

Mobile.tap(findTestObject('SignUp_Success/Button_Save'), 0)

if (Mobile.waitForElementPresent(findTestObject('Object Repository/SignUp_Success/android.widget.ImageView'), 10)) {
	
	def today = new Date()
	def todaysDate = today.format('mm-dd-yy').toString()
	def nowTime = today.format("hh_mm a").toString()
	println(todaysDate)
	println (nowTime)
	
	Mobile.takeScreenshot()
	
	Mobile.closeApplication()
	
} else {
	
	Mobile.tap(findTestObject('SignUp_Success/Input_Email'), 0)
	
	String tmb = System.currentTimeMillis().toString()
	String tsb = System.currentTimeSeconds()..toString()
	Mobile.setText(findTestObject('SignUp_Success/Input_Email_Text'), tmb + tsb + email, 0)
	
	Mobile.tap(findTestObject('SignUp_Success/Button_Save'), 0)
	
	Mobile.waitForElementPresent(findTestObject('SignUp_Success/android.widget.Button (17)'), 10)
	
	Mobile.closeApplication()
	
}




