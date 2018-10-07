import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.Variable
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import org.openqa.selenium.WebElement as WebElement
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction as TouchAction
import java.time.Duration;


Mobile.startApplication('C:\\Users\\Noelia\\Documents\\Trabajo\\CMO\\app-forTestFlavor-release-1.0-37.apk', 
    false)

Mobile.openNotifications()

Mobile.waitForElementPresent(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 20)

Mobile.tap(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 15)

Mobile.waitForElementPresent(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 20)

Mobile.tap(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 15)

Mobile.tap(findTestObject('popUpInicial/android.widget.Button0 - NO'), 0, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Pantalla principal/android.widget.CheckBox0'), 20)

Mobile.tap(findTestObject('Pantalla principal/android.widget.CheckBox0'), 10)

Mobile.tap(findTestObject('Pantalla principal/btnIngresarConsultorio'), 10)

Mobile.tap(findTestObject('Pantalla principal/brnAceptarTiempoEspera'), 15, FailureHandling.OPTIONAL)

Mobile.waitForElementPresent(findTestObject('Videoconsulta/btnIngresarVideoconsulta'), 60)

Mobile.tap(findTestObject('Videoconsulta/btnIngresarVideoconsulta'), 15)

Mobile.waitForElementPresent(findTestObject('Videoconsulta/pantallaVC'), 60)

Mobile.tap(findTestObject('Videoconsulta/pantallaVC'), 10)

Mobile.waitForElementPresent(findTestObject('Videoconsulta/btnChat'), 30)

Mobile.tap(findTestObject('Videoconsulta/opcionesVC/btnChat'), 10)

Mobile.waitForElementPresent(findTestObject('Videoconsulta/opcionesVC/Chat/campoEscribirChat'), 30)

Mobile.setText(findTestObject('Videoconsulta/opcionesVC/Chat/campoEscribirChat'), 'Buenos días', 15)

Mobile.tap(findTestObject('Videoconsulta/opcionesVC/Chat/enviarChat'), 15)

Mobile.takeScreenshot()

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/Chat/ChatAbierto'))

Thread.sleep(600)

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/btnCamara'))

Mobile.takeScreenshot()

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/btnCamara'))

Thread.sleep(600)

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/btnMicrofono'))

Mobile.takeScreenshot()

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/btnMicrofono'))

visualizarBotones(findTestObject('Videoconsulta/opcionesVC/btnFinalizar'))

Mobile.verifyElementText(findTestObject('Videoconsulta/opcionesVC/Finalizar/android.widget.TextView0 - Est seguro que desea finalizar la consulta'), 
    '¿Está seguro que desea finalizar la consulta?')

Mobile.tap(findTestObject('Videoconsulta/opcionesVC/Finalizar/btnSiFinalizarVC'), 15)

Mobile.takeScreenshot()

Mobile.waitForElementPresent(findTestObject('CalificarVC/ingresarComentarioVC'), 30)

Mobile.setText(findTestObject('CalificarVC/ingresarComentarioVC'), 'Excelente AT1', 15)

Mobile.tap(findTestObject('CalificarVC/btn4estrellas'), 10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('CalificarVC/btnCalificar'), 10)

Mobile.waitForElementPresent(findTestObject('Agradecimientos/android.widget.TextView0 - Gracias por utilizar nuestro servicio'), 
    30)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Agradecimientos/btnSalir'), 10)

Mobile.closeApplication()

void visualizarBotones(TestObject objeto) {
	int y = 0
    while (y <= 0) {
        try {
			AppiumDriver<?> driver = MobileDriverFactory.getDriver()
			MultiTouchAction multiTouch = new MultiTouchAction(driver)
			TouchAction action1 = new TouchAction(driver)
			
			WebElement pantallaVC = driver.findElementByXPath("//*[@resource-id = 'ar.com.portalsalud.osde:id/callView']")
			action1.longPress(pantallaVC).perform()
			Mobile.tap(objeto, 10)
            break	
        }
        catch (Exception e) {
			System.out.println(e)
            Mobile.tap(findTestObject('Videoconsulta/pantallaVC'), 10)
        } 
    }
}