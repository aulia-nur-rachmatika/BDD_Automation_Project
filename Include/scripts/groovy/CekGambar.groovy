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

class CekGambar {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Mahasiswa membuka login page")
	def masukCekHalamanMhs() {
		println ("\n Mhs masuk halaman login")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Mahasiswa mengisi (.*) dan (.*) yang valid")
	def aksesCekLoginMasuk(String email, String password) {
		println ("\n Mahasiswa input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/cobaCekGabr/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/cobaCekGabr/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Mahasiswa klik button login")
	def cekLogin() {
		println ("\n Mahasiswa klik login")
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Mahasiswa masuk ke halaman sistem")
	def cekMasuk() {
		println ("\n Mahasiswa diarahkan ke halaman sistem")
	}
	@Given("Mahasiswa berhasil masuk sistem")
	def cekMasukSistem() {
		println ("\n Mahasiswa berahasil masuk ke sistem")
	}
	@When("Mahasiswa akses ujian")
	def cekAkses() {
		println ("Mahasiswa berhasil melihat soal ujian")
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_My Portal  My Website/span_Soal Test'))
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_My Portal  My Website/a_Soal Test'))
	}


	@Then("Mahasiswa akses soal ujian")
	def aksesSoalCek() {
		println ("Soal Ujian Telah Tersedia!")
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_Sh Survey Page Style 4  My Website/a_Soal Uji Coba Sistem (progres)'))
	}

	@And("Mahasiswa melihat pertanyaan ujian")
	def melihaSoal() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_Survey main page (take survey)  My Website/button_Mulai Survei'))
		//		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_Soal Ke 1                              _c6b245'))
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_Survey main page (take survey)  My Website/h2_Pilihan'))

	}

	@Then("Mahasiswa klik soal halaman berikutnya hingga menemukan soal isian")
	def berikutnya() {
		println ("Terdapat soal pilihan 1-20")
		WebUI.click(findTestObject('Object Repository/cobaCekGabr/Page_Survey main page (take survey)  My Website/button_Continue'))

		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)


	}

	@And("Lampirkan gambar")
	def lampirkanGambar() {

		WebUI.click(findTestObject("Object Repository/cekUploadGambar/Page_Survey main page (take survey)  My Website/div_Lampirkan Gambar                       _aec6a4"))

		def autoItScriptPath = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\uploagCekGambar.exe"
		def autoItScript = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\uploagCekGambar.au3"
		def filename = "C:\\Users\\AULIA NUR RACHMATIKA\\Downloads\\SKRIPSI\\BDD\\uploagCekGambar.exe"

		"${autoItScriptPath} ${autoItScript} ${filename}".execute()
		WebUI.delay(5)
		
		println ("Lampirkan gambar berhasil")
	}
	@Then("Klik refresh")
	def refresh() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		DriverFactory.getWebDriver().navigate().refresh()
		WebUI.delay(5)

		TestObject yourElement = findTestObject('// *[ @id="preview_107704"]')
		// Lakukan tindakan tertentu pada elemen yang ditemukan
		WebUI.click(yourElement)
		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)
	}
	@Then("Gambar harus tetap ada")
	def cekGambar() {

		//		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_Soal Ke 31                             _161911'))

		println ("Gambar berhasil")


	}
}



