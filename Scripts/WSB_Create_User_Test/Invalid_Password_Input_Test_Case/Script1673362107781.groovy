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


// OPEN browser, where url global variable set as URL: WSB Create Acc. page in WSB_registration_profile)
WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

// Extend extra option, by click  &  agree to 'Terms of Service'

WebUI.click(findTestObject('Object Repository/Rekrutacja_rejestracja/Show_More_button'))

WebUI.click(findTestObject('Object Repository/Rekrutacja_rejestracja/Check_box_Allow'))



// Fill out 5 forms

WebUI.setText(findTestObject('Object Repository/Rekrutacja_rejestracja/First_Name'), first_name)

WebUI.setText(findTestObject('Object Repository/Rekrutacja_rejestracja/Last_Name'), last_name)

WebUI.setText(findTestObject('Object Repository/Rekrutacja_rejestracja/Email'), email)

WebUI.setText(findTestObject('Object Repository/Rekrutacja_rejestracja/Password'), password)

WebUI.setText(findTestObject('Object Repository/Rekrutacja_rejestracja/PESEL'), pesel)


// Submit

WebUI.click(findTestObject('Object Repository/Rekrutacja_rejestracja/Submit_button'))


// condition holds value " at least one digit " for element that will only exist if request is true

String n = WebUI.getText(findTestObject('Object Repository/Rekrutacja_rejestracja/checklist_pwd_ver_at_least_one'))

assert condition == n


WebUI.closeBrowser()
