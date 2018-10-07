import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\ntedesco\\Documents\\Proyectos\\Frente inovacion\\CMO\\APK\\app-forTestFlavor-release-1.0-37.apk', 
    false)

Mobile.openNotifications()

Mobile.waitForElementPresent(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 20)

Mobile.tap(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 15)

Mobile.waitForElementPresent(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 20)

Mobile.tap(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 15)

Mobile.waitForElementPresent(findTestObject('Pantalla principal/android.widget.CheckBox0'), 20)

Mobile.tap(findTestObject('Pantalla principal/android.widget.CheckBox0'), 15)

Mobile.tap(findTestObject('Pantalla principal/btnIngresarConsultorio'), 15)

Mobile.tap(findTestObject('Pantalla principal/brnAceptarTiempoEspera'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('CancelarVC/android.widget.TextView3 - Aceptar'), 15)

Mobile.tap(findTestObject('CancelarVC/android.widget.Button0 - Cancelar'), 15)

Mobile.tap(findTestObject('CancelarVC/android.widget.Button0 - NO'), 15)

Mobile.tap(findTestObject('CancelarVC/android.widget.Button0 - Cancelar'), 15)

Mobile.tap(findTestObject('CancelarVC/android.widget.Button1 - SI'), 15)

Mobile.tap(findTestObject('CancelarVC/android.widget.Button0 - ACEPTAR'), 15)

Mobile.tap(findTestObject('null'), 15)

Mobile.closeApplication()

