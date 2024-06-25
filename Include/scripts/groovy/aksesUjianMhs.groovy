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

class aksesUjianMhs {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Mahasiswa membuka halaman login")
	def masukHalaman() {
		println ("\n Mahasiswa diarahkan ke login")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Mahasiswa memasukkan (.*) dan (.*) yang valid")
	def LoginMahasiswa(String email, String password) {
		println ("\n Mahasiswa input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/akses_test_repository/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/akses_test_repository/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Mahasiswa klik tombol login")
	def MahasiswaLogin() {
		println ("\n Mahasiswa klik tombol login")
		WebUI.click(findTestObject('Object Repository/akses_test_repository/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Mahasiswa diarahkan ke halaman sistem")
	def masukSistem() {
		println ("\n Pengguna diarahkan ke halaman sistem")
	}
	@Given("Mahasiswa telah berhasil masuk ke dalam sistem")
	def masukWebsite() {
		println ("\n Pengguna berahasil masuk ke sistem")
	}
	@When("Mahasiswa mencoba untuk mengakses ujian")
	def aksesUjian() {
		println ("Mahasiswa berhasil melihat soal ujian")
		WebUI.click(findTestObject('Object Repository/akses_test_repository/Page_My Portal  My Website/span_Soal Test'))
	}


	@Then("Mahasiswa harus mengakses soal ujian sesuai jadwal yang ditentukan")
	def aksesSoal() {
		println ("Soal Ujian Telah Tersedia!")
		WebUI.click(findTestObject('Object Repository/akses_test_repository/Page_Sh Survey Page Style 4  My Website/a_Soal Uji Coba Sistem'))
	}

	@And("Mahasiswa harus melihat pertanyaan ujian yang dapat dijawab")
	def soalUjian() {
		println ("Soal Ujian Sudah Berhasil Diakses !")
		WebUI.click(findTestObject('Object Repository/akses_test_repository/Page_Survey main page (take survey)  My Website/button_Mulai Survei'))
		//		WebUI.verifyElementPresent("div_Soal Ke 1", 0)


	}
}



