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

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/input_Email_login'), 'aulianurrachmatika02@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/input_Kata Sandi_password'), 
    'HXRQlBZtILolxFVf9q2LbQ==')

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Diskusi/a_Penilaian CBT'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Test/button_Baru'))

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Judul Survei_title'), 'Soal Uji Coba 2')

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Jurusan_jurusan_id'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_Elektronika'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Prodi_prodi_id'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_D4 - Teknik Elektronika Sistem Senjata'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Mata Kuliah_matkul_id'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_TE-1104 - TEKNIK DIGITAL'))

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Utama_dosen_utama_id'), 
    'Riza Hasbi')

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_11190030751194 - Riza Hasbi, S.T'))

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Utama_dosen_utama_id'), 
    '11190030751194 - Riza Hasbi, S.T.')

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Cadangan_dosen_cadangan_id'), 
    'Ali Imron')

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_21060183240586 - Ali Imron, S.T., M.T'))

WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Cadangan_dosen_cadangan_id'), 
    '21060183240586 - Ali Imron, S.T., M.T.')

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/span_Import Soal Ujian'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_Unggah file Anda'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_Apply'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_OK'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_Pilihan'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/button__fa fa-chevron-right btn btn-seconda_866a5d'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/button__fa fa-chevron-right btn btn-seconda_866a5d'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/button__fa fa-chevron-right btn btn-seconda_866a5d'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/button__fa fa-chevron-right btn btn-seconda_866a5d'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/td_Isian'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/button__fa fa-chevron-right btn btn-seconda_866a5d'))

WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_Uraian'))

