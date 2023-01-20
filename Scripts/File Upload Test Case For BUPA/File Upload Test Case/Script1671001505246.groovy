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

WebUI.navigateToUrl('https://mybupa-uat-resgrp-cd.azurewebsites.net/login')

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_login  myBupa/button_Next'))

WebUI.setText(findTestObject('Object Repository/File Upload TO/Page_Sign in/input_Email Address_Sign in name'), 'UAT6019340617101114@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/File Upload TO/Page_Sign in/input_Forgot your password_Password'), 
    'R2dZ4hvJ2ugbxLgaHgFasA==')

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_home  myBupa/a_Claim Submission'))

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_Claim Submission  myBupa/div_Clinical  Outpatient treatment'))

WebUI.setText(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/input_Date of treatment_DATEOFTREATMENT'), 
    '07-12-2022')

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/td_7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/select_Please selectGeneral Practitioner'), 
    'string:C050', true)

WebUI.setText(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/input_remove_Amount_General'), 
    '80000')

WebUI.setText(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/input_(optional)_SYMPTOMDATE'), 
    '')

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/input_(optional)_SYMPTOMDATE'))

WebUI.click(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/td_1'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Object Repository/File Upload TO/Page_File a Clinical Claim  myBupa/button_Please select a file for a new file - 1'), 
    '/Users/bhagyesh/Downloads/KatalonSettings.png')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('File Upload TO/Page_File a Clinical Claim  myBupa/button_Please select a file for a new file - 2'), 
    '/Users/bhagyesh/Downloads/KatalonSettings.png')

WebUI.delay(5)

not_run: WebUI.closeBrowser()

