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

class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Pengguna membuka halaman login")
	def masukHalamanLogin() {
		println ("\n Pengguna diarahkan ke login")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://smart.poltekad.online/web/login')
	}
	@When("Pengguna memasukkan (.*) dan (.*) yang valid")
	def validasiAkun(String email, String password) {
		println ("\n Pengguna input email dan password")
		println ("email "+email)
		println ("password"+password)
		WebUI.setText(findTestObject('Object Repository/test_login_repository/Page_Login  My Website/input_Email_login'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/test_login_repository/Page_Login  My Website/input_Kata Sandi_password'), password)
	}
	@And("Pengguna klik tombol login")
	def klikLogin() {
		println ("\n Mahasiswa klik tombol login")
		WebUI.click(findTestObject('Object Repository/test_login_repository/Page_Login  My Website/button_Log masuk'))
	}

	@Then("Pengguna diarahkan ke halaman sistem")
	def masukSistem() {
		println ("\n Pengguna diarahkan ke halaman sistem")
	}
}



