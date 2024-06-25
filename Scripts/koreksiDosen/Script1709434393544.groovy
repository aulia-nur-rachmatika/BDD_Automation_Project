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

WebUI.closeBrowser()

WebUI.navigateToUrl('http://smart.poltekad.online/web/login')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://smart.poltekad.online/web/login')

WebUI.setText(findTestObject('Object Repository/koreksiDOsen/Page_Login  My Website/input_Email_login'), 'arhasbi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/koreksiDOsen/Page_Login  My Website/input_Kata Sandi_password'), 
    'iIwExHMbOKfngxcHqHi3Fg==')

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Login  My Website/div_Log masuk                              _9d5646'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Diskusi/span_Penilaian CBT'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Test/span_Dosen'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Test/a_Soal Isian'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Penilaian Soal Isian Dan Uraian/div_Soal Uji Coba 2 (1)'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Penilaian Soal Isian Dan Uraian/td_Soal Uji Coba 2'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/td_2,00'))

WebUI.setText(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/input_Nilai Dosen Utama_score_dosen'), 
    '2,5')

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/div_PenilaianNilai Dosen UtamaNilai Dosen C_914435'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/button_Simpan'))

WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/td_2,50'))

