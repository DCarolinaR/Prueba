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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pru-gnp-portalideas.biaani.com/')

WebUI.setText(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/input_La contrasea quehas introducido es in_6ef811'), 
    'biaani.da')

WebUI.setEncryptedText(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/input_Deseas recuperar tucontrasea_password'), 
    'aCNOeMVT6E+hS+e2Ost8OQ==')

WebUI.click(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/img'))

WebUI.click(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/a_Aprende_svg'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/span_Cursos a los que an te puedes inscribir'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Aprende/Tu curso de inicio en GNP/span_Cursos a los que an te puedes inscribir'), 
    'Cursos a los que aún te puedes inscribir')

WebUI.closeBrowser()
