import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.bankmandiri.pageobjects.mobile.Login
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

Login login = new Login(Language)

'========================  Step 1  ========================'
'''Step Description: Input Organization'''
if(Organization !='') {
	if(Condition == "UI") {
		login.inputOrganization(Organization)
		login.verifyErrorlineOrganization()
	}else {
		login.inputOrganization(Organization)
	}
}
'========================  Step 2  ========================'
'''Step Description: Input email/username'''
if(Email !='') {
	if(Condition == "UI") {
		login.inputEmail(Email)
		login.tapLogin()
		login.verifyErrorlinePassword()
	}else {
		login.inputEmail(Email)
	}
}

'========================  Step 3  ========================'
'''Step Description: Input password'''
if(Password !='') {
	if(Condition == "UI") {
		login.inputPassword(Password)
		login.tapLogin()
		login.verifyErrorlinePassword6Char()
	}else {
		login.inputPassword(Password)
	}
}

'========================  Step 4  ========================'
'''Step Description: Login'''
login.tapLogin()



