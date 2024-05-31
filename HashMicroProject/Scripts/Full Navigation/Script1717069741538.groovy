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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.verifyMatch(WebUI.getWindowTitle(), 'Swag Labs', false)

WebUI.setText(findTestObject('Object Repository/Login/input_Swag Labs_user-name'), 'standard_user')

WebUI.setText(findTestObject('Object Repository/Login/input_Swag Labs_password'), 'secret_sauce')

WebUI.click(findTestObject('Object Repository/Login/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Full Navigation/button_Add to cart 2'))

WebUI.click(findTestObject('Object Repository/Full Navigation/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Full Navigation/a_1'))

WebUI.click(findTestObject('Object Repository/Full Navigation/button_Checkout'))

WebUI.verifyTextPresent('Checkout: Your Information', false, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Full Navigation/input_Checkout Your Information_firstName'))

WebUI.verifyElementVisible(findTestObject('Full Navigation/input_Checkout Your Information_lastName'))

WebUI.verifyElementVisible(findTestObject('Full Navigation/input_Checkout Your Information_postalCode'))

WebUI.verifyElementVisible(findTestObject('Full Navigation/input_Cancel_continue'))

WebUI.closeBrowser()

