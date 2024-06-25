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

WebUI.navigateToUrl('http://smart.poltekad.online/web/login')

WebUI.setText(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/input_Email_login'), 'asepridwan9322@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/input_Kata Sandi_password'), 
    'ddmdYD2a8hdKfVC4Zj6UaA==')

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_My Portal  My Website/a_Soal Test'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Sh Survey Page Style 4  My Website/a_Soal Uji Coba Sistem (progres)'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Mulai Survei'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_0  completed'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Continue'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_33  completed'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Continue'))

WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_67  completed'))

