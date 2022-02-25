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

'Tap Login with Email'
Mobile.tap(findTestObject('null'), 0)

'tap input email'
Mobile.tap(findTestObject('null'), 0)

'Ingresar email'
Mobile.setText(findTestObject('null'), 'lorena.restrepo@sundevs.com', 
    0)

'tap input password'
Mobile.tap(findTestObject('null'), 0)

'Ingresar password'
Mobile.setText(findTestObject('null'), 'Sundevs_2021', 0)

'Tap botón Login'
Mobile.tap(findTestObject('null'), 0)

'Scroll para ver botón New Order'
Mobile.swipe(0, 400, 0, 200)

'Tap en botón New Order '
Mobile.tap(findTestObject(''), 10)

'Tap botón Edit Pickup'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Find Restaurant'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Mientras la app este uso'
Mobile.tap(findTestObject('null'), 0)

'Tap input Search city, state, or zip code'
Mobile.tap(findTestObject('null'), 0)

'Enviar texto para buscar el restaurant'
Mobile.setText(findTestObject('null'), 
    'Salt lake', 0)

'Tap en el input seach con el texto ingresado'
Mobile.tap(findTestObject('null'), 
    0)

'Tap mantenido en la lista de restaurantes'
Mobile.tapAndHold(findTestObject(''), 0, 0)

'Tap botón Order now para elejir un restaurante, en este caso City Creek'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Edit Date para desplegar el calendario'
Mobile.tap(findTestObject('null'), 0)

'Tap botón next del calendario para cambiar de mes'
Mobile.tap(findTestObject('null'), 0)

'Tap en el día 31 del mes marzo 2022'
Mobile.tap(findTestObject('null'), 0)

'Tap botón OK del calendario'
Mobile.tap(findTestObject('null'), 0)

'Tap card BURRITO'
Mobile.tap(findTestObject('null'), 0)

'Tap card FLOUR'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Next'
Mobile.tap(findTestObject('null'), 0)

'Tap card SWEET PORK BARBACOA'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Next'
Mobile.tap(findTestObject(''), 0)

'Tap card CILANTRO LIME RICE'
Mobile.tap(findTestObject('null'), 0)

'Tap Botón Next'
Mobile.tap(findTestObject(''), 0)

'Tap card BLACK BEANS'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Next'
Mobile.tap(findTestObject(''), 0)

'Tap card MILD - ROASTED TOMATILLO'
Mobile.tap(findTestObject('null'), 0)

'Tap Botón Next'
Mobile.tap(findTestObject(''), 0)

'Tap card SOUCE & CHEESEE ON TOP'
Mobile.tap(findTestObject('null'), 0)

'Tap Botón Next'
Mobile.tap(findTestObject(''), 0)

'Tap botón Add to Bag'
Mobile.tap(findTestObject('null'), 0)

'Validar que información llega en la dirección'
Mobile.tap(findTestObject('null'), 0)

'Tap Checkout'
Mobile.tap(findTestObject('null'), 0)

'Tap input email checkout'
Mobile.tap(findTestObject('null'), 0)

'Clear text email'
Mobile.clearText(findTestObject('null'), 
    0)

'Enviar texto de email '
Mobile.setText(findTestObject(''), 'edward.abreu@sundevs.com', 0)

Mobile.hideKeyboard()

'Se activa el radio button Carry-Out'
Mobile.tap(findTestObject('null'), 0)

Mobile.swipe(0, 600, 0, 100)

Mobile.swipe(0, 600, 0, 200)

'Tap Order Summary'
Mobile.tap(findTestObject('null'), 0)

'Tap price Order Summary'
Mobile.tap(findTestObject('null'), 0)

'Tap Total Amount'
Mobile.tap(findTestObject('null'), 0)

'Tap price Total Amount'
Mobile.tap(findTestObject('null'), 0)

'Tap Tax'
Mobile.tap(findTestObject('null'), 0)

'Tap Tax Amount'
Mobile.tap(findTestObject('null'), 0)

'Tap Grand Total'
Mobile.tap(findTestObject('null'), 0)

'Tap Amount Grand Total'
Mobile.tap(findTestObject('null'), 0)

'Tap botón Place Order'
Mobile.tap(findTestObject('null'), 0)

'Tap title ORDER CONFIRMATION'
Mobile.tap(findTestObject('null'), 0)

'Tap text THANK YOU AMIGO!'
Mobile.tap(findTestObject('null'), 0)

'We\'ve received your delicious order!'
Mobile.tap(findTestObject('null'), 0)

'Tap text Keep your app open to see your order status and let us know when you arrive.'
Mobile.tap(findTestObject('null'), 0)

'Tap text It\'s just that easy!'
Mobile.tap(findTestObject('null'), 0)

'Tap Contact Details'
Mobile.tap(findTestObject('null'), 0)

'Tap text Full name:'
Mobile.tap(findTestObject('null'), 0)

'Tap text real name "Lorena TEST-SUNDEVS"'
Mobile.tap(findTestObject('null'), 0)

'Tap text email'
Mobile.tap(findTestObject('null'), 0)

'Tap text real email "edward.abreu@sundevs.com"'
Mobile.tap(findTestObject('null'), 0)

'Tap text Phone Number:'
Mobile.tap(findTestObject('null'), 0)

'Tap text real Phone Number "3148518506"'
Mobile.tap(findTestObject('null'), 0)

'Tap text Order Confirmation'
Mobile.tap(findTestObject('null'), 0)

'Tap Order number:'
Mobile.tap(findTestObject('null'), 0)

'Tap real Order number, validar que no venga empty'
Mobile.tap(findTestObject('null'), 0)

'Tap text Order date:'
Mobile.tap(findTestObject('null'), 0)

'Tap text real Order date: "Feb 23 2022" validar con la selección del calendario para cambiar fecha'
Mobile.tap(findTestObject('null'), 0)

'Tap text Pickup date & time: '
Mobile.tap(findTestObject('null'), 0)

'Tap real text Pickup & time, validar que no sea Empty'
Mobile.tap(findTestObject('null'), 0)

'Tap text Pickup location:'
Mobile.tap(findTestObject('null'), 0)

'Tap text Pickup Location "City Creek, Salt Lake City" validar con la selección del restaurante'
Mobile.tap(findTestObject('null'), 0)

'Tap text My order'
Mobile.tap(findTestObject('null'), 0)

'Tap lista de items seleccionados para la orden, comparar con la tarjeta en la vista de la bolsa'
Mobile.tap(findTestObject('null'), 0)

Mobile.swipe(0, 600, 0, 200)

'Tap texto Subtotal'
Mobile.tap(findTestObject('null'), 0)

'Tap amount Subtotal'
Mobile.tap(findTestObject('null'), 0)

'Tap Tax'
Mobile.tap(findTestObject('null'), 0)

'Tap amount Tax'
Mobile.tap(findTestObject('null'), 0)

'Tap text Grand Total'
Mobile.tap(findTestObject('null'), 0)

'Tap amount Grand Total'
Mobile.tap(findTestObject('null'), 0)

'Tap text Payment Method'
Mobile.tap(findTestObject('null'), 0)

'Texto de TDC validar si es útil '
Mobile.tap(findTestObject('null'), 0)

'Tap amount pay TDC'
Mobile.tap(findTestObject('null'), 0)

'Tap text Something wrong?'
Mobile.tap(findTestObject('null'), 0)

'Tap text Call the Cafe Rio Customer Care Team'
Mobile.tap(findTestObject('null'), 0)

'Obtener texto de telefono 8886601643'
Mobile.getText(findTestObject('null'), 0)

'Tap botón Return to home'
Mobile.tap(findTestObject('null'), 0)

'Tap card home con los datos de la orden'
Mobile.tap(findTestObject('null'), 0)

Mobile.closeApplication()

