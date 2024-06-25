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

WebUI.setText(findTestObject('Object Repository/tes/Page_Login  My Website/input_Email_login'), 'aulianurrachmatika02@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tes/Page_Login  My Website/input_Kata Sandi_password'), 'HXRQlBZtILolxFVf9q2LbQ==')

WebUI.click(findTestObject('Object Repository/tes/Page_Login  My Website/button_Log masuk'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Diskusi/a_Penilaian CBT'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Soal Test/button_Baru'))

WebUI.setText(findTestObject('Object Repository/tes/Page_Poltekad - Baru/input_Judul Survei_title'), 'tes')

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/input_Jurusan_jurusan_id'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/a_Elektronika'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/input_Prodi_prodi_id'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/a_D4 - Teknik Elektronika Sistem Senjata'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/input_Mata Kuliah_matkul_id'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/a_TE-2109 - PERANCANGAN ELKA SISTA'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - Baru/button_Import Soal Ujian'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - tes/label_Unggah file Anda'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - tes/button_Apply'))

WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - tes/button_OK'))

