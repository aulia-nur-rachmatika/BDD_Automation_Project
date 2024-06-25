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

class DosenKoreksi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Dosen membuka halaman login")
	def masukSistemDosen() {
		println ("Dosen diarahkan ke login")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Dosen memasukkan (.*) dan (.*) yang valid")
	def LoginDosen(String email, String password) {
		println ("\n Mahasiswa input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/koreksi/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/koreksi/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Dosen klik tombol login")
	def DosenLogin() {
		println ("\n Dosen klik tombol login")
		WebUI.click(findTestObject('Object Repository/koreksi/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Dosen diarahkan ke halaman sistem")
	def sistemMasuk() {
		println ("Dosen diarahkan ke halaman sistem")
	}

	@Given("Dosen berhasil masuk ke dalam sistem")
	def DosenMasukWebsite() {
		println ("Dosen berahasil masuk ke sistem")
	}
	@Then("Dosen klik menu Penilaian CBT kemudian pilih Dosen")
	def klikMenuDosen() {
		WebUI.click(findTestObject('Object Repository/koreksi/Page_Poltekad - Diskusi/span_Penilaian CBT'))
		WebUI.click(findTestObject('Object Repository/koreksi/Page_Poltekad - Soal Test/span_Dosen'))
	}
	@And("Terdapat ujian mahasiswa yang perlu dinilai")
	def JawabanUjian() {
		println ("Mahasiswa berhasil melihat soal ujian")
		WebUI.click(findTestObject('Object Repository/koreksi/Page_Poltekad - Soal Test/a_Soal Isian'))
	}

	@When("Dosen memilih ujian yang akan dinilai")
	def pilihSoal() {
		println ("Soal Ujian Telah Tersedia!")
		WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Penilaian Soal Isian Dan Uraian/div_Soal Uji Coba 2 (1)'))
	}

	@And("Dosen memberikan penilaian pada setiap pertanyaan")
	def nilaiUjian() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Penilaian Soal Isian Dan Uraian/td_01032024 212939'))
		WebUI.click(findTestObject('Object Repository/Page_Poltekad - Soal Uji Coba Sistem/td_Didalam teori control ada beberapa macam_eb6b83'))
		WebUI.click(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/td_2,00'))
		def nilai="2,5"
		WebUI.setText(findTestObject('Object Repository/koreksiDOsen/Page_Poltekad - Soal Uji Coba 2/input_Nilai Dosen Utama_score_dosen'), nilai)
	}
	@Then("Dosen harus dapat menyimpan hasil penilaian dengan sukses")
	def simpan() {


		println ("nilai tersimpan")
	}
}



