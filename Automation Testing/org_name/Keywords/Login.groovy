import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	
	void tapLogin() {
		Mobile.tap(btnLogin, 5)
	}
	
	void inputOrganization(String org_name) {
		if (Mobile.waitForElementPresent(txtOrganization, 20, FailureHandling.OPTIONAL)) {
			Mobile.setText(txtOrganization, org_name, 5)
			
		} else {
			KeywordUtil.markFailed("Unable to type Organization!")
		}
	}


void inputEmail(String email) {
		if (Mobile.waitForElementPresent(txtEmail, 20, FailureHandling.OPTIONAL)) {
			Mobile.setText(txtEmail, email, 5)
		} else {
			KeywordUtil.markFailed("Unable to type Email!")
		}
	}

void inputPassword(String password) {
		int actualTextLength = Mobile.getText(txtPassword, 5).length()
		if (Mobile.waitForElementPresent(txtPassword, 20, FailureHandling.OPTIONAL)) {
			Mobile.setText(txtPassword, password, 5)
			if (actualTextLength <= 5) {
				KeywordUtil.markPassed("The password field must be at least 6 characters")
			} else {
				KeywordUtil.markFailed("Maximum Character in 6 Character")
			}
		} else {
			KeywordUtil.markFailed("Unable to type Password!")
		}
	}

public void verifyErrorlineOrganization() {
	MobileHelpers.isContains(Mobile.getText(lblErrorlineOrganization, 5), i18n.getMobileLocalizations("//errorline", userLanguage))
}

public void verifyErrorlineEmail() {
	MobileHelpers.isContains(Mobile.getText(lblErrorlineOEmail, 5), i18n.getMobileLocalizations("//errorline", userLanguage))
}

public void verifyErrorlinePassword() {
	MobileHelpers.isContains(Mobile.getText(lblErrorlineOEmail, 5), i18n.getMobileLocalizations("//errorline", userLanguage))
}

public void verifyErrorlinePassword6Char() {
	MobileHelpers.isContains(Mobile.getText(lblErrorlineOEmail, 5), i18n.getMobileLocalizations("//errorline", userLanguage))
}

}
