import cucumber.api.java.en.When

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class manajemenSoalDirbin {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Dirbindikjar masuk ke halaman login")
	def dirbinMasukSistem() {
		println ("Dirbindikjar diarahkan ke login")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Dirbindikjar memasukkan (.*) dan (.*) yang valid")
	def LoginDirbin(String email, String password) {
		println ("\n Dirbindikjar input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Dirbindikjar klik tombol login")
	def LoginKlik() {
		println ("\n Dirbindikjar klik tombol login")
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Dirbindikjar berhasil masuk ke sistem")
	def sistemMasukDirbin() {
		println ("Dirbindikjar diarahkan ke halaman sistem")
	}

	@When("Dirbindikjar mengunggah bank soal ujian")
	def UnggahSoal() {
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Diskusi/a_Penilaian CBT'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Test/button_Baru'))
	}


	@Then("Isi Judul, Jurusan, Prodi, Mata kuliah, Dosen utama dan Dosen cadangan")
	def isiForm() {
		def judul_survei="Soal Uji Coba 2"
		WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Judul Survei_title'), judul_survei)
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Jurusan_jurusan_id'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_Elektronika'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Prodi_prodi_id'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_D4 - Teknik ELektronika Sistem Senjata'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Mata Kuliah_matkul_id'))
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_TE-1104 - TEKNIK DIGITAL'))

		def dosenUtama="Riza Hasbi"
		WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Utama_dosen_utama_id'), dosenUtama)
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_11190030751194 - Riza Hasbi, S.T'))

		def dosenCadangan="Ali Imron"
		WebUI.setText(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/input_Dosen Cadangan_dosen_cadangan_id'), dosenCadangan)
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/a_21060183240586 - Ali Imron, S.T., M.T'))
	}
	@And("Import soal")
	def Import() {
		//unggah soal ujian
		//		String lokasiFile="C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\SOALUAS BI PRODI ELKASISTA DAN TELKOMMIL 2023"
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Baru/span_Import Soal Ujian'))



		// Klik pada elemen
		WebUI.click(findTestObject('Object Repository/tes/Page_Poltekad - tes/label_Unggah file Anda'))



		def autoItScriptPath = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\unggah.exe"
		def autoItScript = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\unggah.au3"
		def filename = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\unggah.exe"

		"${autoItScriptPath} ${autoItScript} ${filename}".execute()



		WebUI.delay(10)

		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_Apply'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Test_UploadSoal/Page_Poltekad - Soal Uji Coba 2/span_OK'))


		println ("Soal ujian berhasil diunggah")
	}




	@Then("Bank soal   berhasil disimpan dalam sistem")
	def bankSoal() {
		println ("Soal berhasil disimpan")
	}
}



