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

WebUI.setText(findTestObject('Object Repository/cek_identitas/Page_Login  My Website/input_Email_login'), 'arhasbi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/cek_identitas/Page_Login  My Website/input_Kata Sandi_password'), 
    'iIwExHMbOKfngxcHqHi3Fg==')

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Diskusi/a_Penilaian CBT'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Soal Test/span_Dosen'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Soal Test/a_Soal Isian'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Penilaian Soal Isian Dan Uraian/div_Soal Uji Coba Sistem (9)'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Penilaian Soal Isian Dan Uraian/td_28022024 133159'))

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Soal Uji Coba Sistem/label_Identifikasi tanda'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/cek_identitas/Page_Poltekad - Soal Uji Coba Sistem/span_c49d22e6-b73c-4b43-b736-d08e2345db03'), 
    FailureHandling.STOP_ON_FAILURE)

