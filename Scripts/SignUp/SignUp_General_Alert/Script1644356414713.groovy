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

'Tap link Sign up'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button'), 0)

'Tap input email'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText'), 0)

'Se escribe solo nombre de usuario de email'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (1)'), 'example', 0)

'Tap input First Name'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (2)'), 0)

'Se escribe el first name completo'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (3)'), 'Jake Ronald', 0)

'Tap alerta de correo electronico "A valid email should contain \'@\'"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View'), 0)

'Tap input Last Name'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (4)'), 0)

'Se escribe el apellido completo'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (5)'), 'Wilkinson Corprom', 0)

'Tap input Phone'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (6)'), 0)

'Se envía el phone completo'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (7)'), '1234567890', 0)

'Se comprueba el uso de la mascara para el input phone'
Mobile.getText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (123) 456-7890'), 0)

'Tap input password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (8)'), 0)

'Se envía el password "Caferio123++"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (9)'), 'Caferio123++', 0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Tap input confirm password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (10)'), 0)

'Se envía password "Caferio123++"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (11)'), 'Caferio123++', 0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Tap fondo de vista scroll'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.ScrollView'), 0)

'Scroll que inicia debajo del header y finaliza en el save "De arriba a abajo"'
Mobile.swipe(0, 200, 0, 600)

'Tap input email con el texto "example"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - example'), 0)

'Se envía el texto "example@"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - example (1)'), 'example@', 0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Scroll de abajo a arriba'
Mobile.swipe(0, 600, 0, 200)

'Tap botón "Save"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 0)

'Scroll debajo del Header de arriba a abajo'
Mobile.swipe(0, 200, 0, 600)

'Tap en la alerta email "example@" Intentar pasar un gettext'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (1)'), 0)

'Tap input email'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText'), 0)

'Envió de texto "example@server"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - example (3)'), 'example@server', 0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Scroll de abajo a arriba'
Mobile.swipe(0, 600, 0, 200)

'Tap botón "Save"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 0)

'Scroll debajo del Header de arriba a abajo'
Mobile.swipe(0, 200, 0, 600)

'Tap en la alerta email "example@server" Intentar pasar un gettext'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 0)

'Se envía el texto "example@server." para validar alerta email '
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - exampleserver'), 'example@server.', 
    0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Scroll de abajo a arriba'
Mobile.swipe(0, 600, 0, 200)

'Tap botón "Save"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 0)

'Scroll debajo del Header de arriba a abajo'
Mobile.swipe(0, 200, 0, 600)

'Tap input email'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - exampleserver (1)'), 0)

'Envío de texto "example.server.com"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - exampleserver (2)'), 'example@server2.com', 0)

'Se oculta el teclado'
Mobile.hideKeyboard()

'Scroll de abajo a arriba'
Mobile.swipe(0, 600, 0, 200)

'Tap input first name'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - Jake Ronald'), 0)

'Limpiar texto del input first text'
Mobile.clearText(findTestObject('Object Repository/General_Alert/android.widget.EditText - Jake Ronald (1)'), 0)

'Tap en la alerta input first name "This field is required"'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (2)'), 0)

'Tap input last name'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - Wilkinson Corprom (2)'), 0)

'Limpiar text del input last name'
Mobile.clearText(findTestObject('Object Repository/General_Alert/android.widget.EditText - Wilkinson Corprom (2)'), 0)

'Tap alerta last name vació'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (3)'), 0)

'Tap input first name'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (12)'), 0)

'Envió de texto "Jake Ronald" input First Name, Agregar script para verificar que se oculte la alerta'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (12)'), 'Jake Ronald', 0)

'Tap input email'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (14)'), 0)

'Envio de texto "Wilkinson Corprom" envíar una validación donde se verifique que se oculto la alerta'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (21)'), 'Wilkinson Corprom', 0)

'Tap input phone'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - (123) 456-7890 (1)'), 0)

'Limpiar texto input phone'
Mobile.clearText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (123) 456-7890 (2)'), 0)

'Tap alerta input phone vació'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (4)'), 0)

'Envió de texto para input phone, validar que se haya ocultado la alerta de campo requerido'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (16)'), '1234567890', 0)

'Validación de mascara phone'
Mobile.getText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (123) 456-7890 (3)'), 0)

'Validación de texto encriptado Password'
Mobile.getText(findTestObject('Object Repository/General_Alert/android.widget.EditText -'), 0)

'Tap para desencriptar password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (2)'), 0)

'Validar que el texto password se muestre luego de la desencriptación y OJO SI VIENE ENCRIPTADO '
Mobile.getText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (2)'), 0)

'Tap input password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - (9)'), 0)

'Envió de texto password no valido'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (9)'), 'Caferio123', 0)

'Tap input confirm password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - (11)'), 0)

'Envió de texto confirm password y el texto no cumple las caracteristicas password'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (11)'), 'Caferio12', 0)

'Ocultar teclado'
Mobile.hideKeyboard()

'Tap botón save'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 0)

'Tap alert input password luego de tener escrito un password correcto igual al del input confirm password, escribir un password que no sea valido'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (5)'), 0)

'Ocultar teclado'
Mobile.hideKeyboard()

'Tap alert confirm password "Password doesn\'t match."'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (6)'), 0)

'Ocultar teclado'
Mobile.hideKeyboard()

'Tap input confirm password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (12)'), 0)

'Envío de texto input confirm password igual al input password, donde se debe validar que se oculte la alerta coincidencia de passwords y mantener la alerta del input password ya que no es un password valido'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (12)'), 'Caferio123', 0)

'Tap alert password no valido'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (7)'), 0)

'Envió de password valido "Caferio123++"'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (13)'), 'Caferio123++', 
    0)

'Tap input confirm password'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText - (14)'), 0)

'Envío de texto valido para confirm password e igual que password, validar que se oculte la alerta de password no valido'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText - (14)'), 'Caferio123++', 0)

'Tap input invitation code'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (17)'), 0)

'Envío de texto para invitation code no valido'
Mobile.setText(findTestObject('Object Repository/General_Alert/android.widget.EditText (18)'), 'No found 123456', 0)

'Ocultar teclado'
Mobile.hideKeyboard()

'Tap input select Birthday calendar'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.EditText (22)'), 0)

'Tap select year calendar, validar que inicie con condición de mayor de 21 año'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (3)'), 0)

'Select year calendar'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (8)'), 0)

'Tap select month calendar'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (9)'), 0)

'Tap select day calendar'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.view.View (10)'), 0)

'Tap botón ok calendar'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (4)'), 0)

'Tap Botón Save'
Mobile.tap(findTestObject('Object Repository/General_Alert/android.widget.Button (1)'), 5)

'Validar que la fecha selecionada sea la correcta, formato de fecha MM/DD/YYYY'
Mobile.getText(findTestObject('Object Repository/General_Alert/android.widget.EditText - 1132005'), 0)

Mobile.closeApplication()

