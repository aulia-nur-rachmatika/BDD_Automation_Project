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

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Email_login'))

WebUI.setText(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Email_login'), 'harnyotota2@gmail.com')

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Email_login'))

WebUI.setEncryptedText(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Kata Sandi_password'), 
    'B4DlBxvXJ9A2etqy0aO9hw==')

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Diskusi/a_Penilaian CBT'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Test/span_Ketua Jurusan'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Test/a_Penentu Ujian'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Penentu Nilai/div_Soal Uji Coba Sistem (kj) (1)'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Penentu Nilai/td_Soal Uji Coba Sistem (kj)'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/div_aaa_o-checkbox d-inline-block me-2'))

WebUI.setText(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/input_Nilai Ketua Jurusan_score_kajur'), 
    '2')

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/button_Simpan'))

WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/td_2,50'))

