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

'Tap botón Login with Email'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.Button'), 0)

'Tap botón Forgot Password?'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.Button (1)'), 0)

'Validar que el texto sea "PASSWORD HELP"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View'), 0)

'Validar que el texto sea "We\'re here to help!"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (1)'), 0)

'Validar que el texto sea "Resetting your password is easy."'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (2)'), 0)

'Validar que el texto sea "Please enter the email address you used to register."'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (3)'), 0)

'Tap en el input email'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.EditText - exampleexample.com'), 0)

'Enviar texto "edward.abreu@sundevs.com"'
Mobile.setText(findTestObject('Object Repository/Foprgot_Password/android.widget.EditText - exampleexample.com (1)'), email_1, 
    0)

'Validar que el texto sea "Remembered your Password?"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (5)'), 0)

'Validar que el elemento botón "Login" exista'
Mobile.getText(findTestObject('Object Repository/Foprgot_Password/android.widget.Button (2)'), 0)

'Tap botón "Send"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.Button (3)'), 0)

'Validar que el texto sea "CHECK YOUR MAIL"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (6)'), 0)

'Validar que la imagen cargue "Nota en este momento no esta cargando"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.ImageView'), 0)

'Validar que el texto sea "Password reset instructions are on their way to you email!"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (7)'), 0)

'Validar que el texto sea "No email?"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (8)'), 0)

'Validar que el texto sea "It may be hiding in your spam filter"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (9)'), 0)

'Tap y validar que el texto del botón sea "Try another email address"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.Button (4)'), 0)

'Tap en el input email'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.EditText - exampleexample.com (2)'), 0)

'Insertar email diferente al primero'
Mobile.setText(findTestObject('Object Repository/Foprgot_Password/android.widget.EditText - exampleexample.com (3)'), email_2, 
    0)

'Tap en el botón Send'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.widget.Button (6)'), 0)

'Verificar texto "CHECK YOUR MAIL"'
Mobile.tap(findTestObject('Object Repository/Foprgot_Password/android.view.View (10)'), 0)

Mobile.closeApplication()

