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
import java.util.ArrayList as ArrayList
import java.util.Iterator as Iterator
import java.util.ListIterator as ListIterator
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\ntedesco\\Documents\\Proyectos\\Frente inovacion\\CMO\\APK\\app-forTestFlavor-release-1.0-37.apk', 
    false)

Mobile.openNotifications()

Mobile.waitForElementPresent(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 60)

Mobile.tap(findTestObject('Notificacion/android.widget.TextView8 - OSDE CMOnLine'), 15)

Mobile.waitForElementPresent(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 10)

Mobile.tap(findTestObject('Mensaje/Ingresar - Mensaje de texto'), 30)

Mobile.tap(findTestObject('popUpInicial/android.widget.Button0 - NO'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Pantalla principal/android.widget.TextView3 - Trminos y Condiciones'), 15)

Mobile.waitForElementPresent(findTestObject('Terminos y Condiciones/Texto1'), 15)

verificarTexto()

void verificarTexto() {
    List<Object> texto = new ArrayList<Object>(70)
	List<String> txt = new ArrayList<String>(70)

    int y = 1

    for (y = 1; y <= 70; y++) {
        TestObject element = new TestObject()
        element = findTestObject(('Terminos y Condiciones/Texto' + y) + '')
        texto.add(element)
		txt.add(element.findPropertyValue("text"))
    }
    
    Iterator<String> itr = txt.iterator()

    int i = 0

    while (itr.hasNext()) {
        Mobile.scrollToText(txt[i])
		Mobile.verifyElementText(texto[i], txt[i])
		
        i++
    }
}

