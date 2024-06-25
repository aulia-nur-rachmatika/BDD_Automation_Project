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

class presentaseProgress {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Mahasiswa akses login page")
	def masukHalamanMhs() {
		println ("\n Mhs masuk halaman login")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Mahasiswa masukkan (.*) dan (.*) yang valid")
	def aksesLoginMasuk(String email, String password) {
		println ("\n Mahasiswa input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Mahasiswa klik login")
	def preLogin() {
		println ("\n Mahasiswa klik login")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Mahasiswa diarahkan masuk ke halaman sistem")
	def preMasuk() {
		println ("\n Mahasiswa diarahkan ke halaman sistem")
	}
	@Given("Mahasiswa berhasil masuk ke sistem")
	def preSistem() {
		println ("\n Mahasiswa berahasil masuk ke sistem")
	}
	@When("Mahasiswa mengakses ujian")
	def preAkses() {
		println ("Mahasiswa berhasil melihat soal ujian")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_My Portal  My Website/span_Soal Test'))
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_My Portal  My Website/a_Soal Test'))
	}


	@Then("Mahasiswa mengakses soal ujian sesuai jadwal yang ditentukan")
	def preSoal() {
		println ("Soal Ujian Telah Tersedia!")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Sh Survey Page Style 4  My Website/a_Soal Uji Coba Sistem (progres)'))
	}

	@And("Mahasiswa melihat pertanyaan ujian yang dapat dijawab seteleh memulai soal")
	def preLihat() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Mulai Survei'))
		//		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_Soal Ke 1                              _c6b245'))
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_0  completed'))
		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)



	}

	@Then("Mahasiswa klik soal halaman berikutnya")
	def klikNext() {
		println ("Terdapat soal pilihan 1-20")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Continue'))
		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)


	}

	@And("Presentase berubah")
	def presentase() {

		//		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_Soal Ke 21                             _db3302'))
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_33  completed'))
		
		println ("Presentase menunjukkan kemajuan dengan progres 33% dari soal")


	}
	@Then("Klik halaman berikutnya")
	def next() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/button_Continue'))

		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)


	}
	@Then("Presentase berubah dan berhasil")
	def progress() {

		//		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_Soal Ke 31                             _161911'))
		WebUI.click(findTestObject('Object Repository/progress_presentase/Page_Survey main page (take survey)  My Website/div_67  completed'))
		println ("Presentase menunjukkan kemajuan dengan progres 67% dari soal")


	}
}



