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

class penilaianKajur {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Ketua Jurusan membuka halaman login")
	def masukSistemKajur() {
		println ("Dosen diarahkan ke login")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Ketua Jurusan memasukkan (.*) dan (.*) yang valid")
	def LoginKajur(String email, String password) {
		println ("\n Ketua Jurusan input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Ketua Jurusan klik tombol login")
	def KajurLogin() {
		println ("\n Dosen klik tombol login")
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Ketua Jurusan diarahkan ke halaman sistem")
	def sistemMasuk() {
		println ("Ketua Jurusan diarahkan ke halaman sistem")
	}

	@Given("Ketua Jurusan memilih menu penilaian cbt")
	def PilihMenu() {
		println ("Memilih menu penilaian cbt")
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Diskusi/a_Penilaian CBT'))
	}
	@And("Ketua Jurusan memilih menu Ketua Jurusan")
	def klikMenuKajur() {
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Test/span_Ketua Jurusan'))
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Test/a_Penentu Ujian'))
	}
	@When("Terdapat jawaban dari mahasiswa sesuai jurusan")
	def JawabanUjian() {
		println ("Kajur melihat jawaban ujian")
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Penentu Nilai/div_Soal Uji Coba Sistem (kj) (1)'))
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Penentu Nilai/td_Soal Uji Coba Sistem (kj)'))
	}

	@And("Pilih jawaban mahasiswa dan terdapat tanda membutuhkan validasi Ketua Jurusan")
	def pilihSoal() {
		println ("memilih jawaban yang terdapat tanda validisi!")
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/div_aaa_o-checkbox d-inline-block me-2'))
	}

	@Then("Memberikan penilaian jika terdapat tanda centang validasi")
	def nilaiUjian() {
		def nilai="2"
		println ("Berikan nilai !")
		WebUI.setText(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/input_Nilai Ketua Jurusan_score_kajur'),nilai)
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/button_Simpan'))
	}

	@And("Nilai berhasil disimpan")
	def soalUjian() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/penilaianKajur/Page_Poltekad - Soal Uji Coba Sistem (kj)/td_2,50'))
		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)


	}
}
