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

WebUI.navigateToUrl('https://stp-dev.bupa.com.hk/content/forms/af/bupa-stp-form.html?lang=en')

WebUI.setText(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/input_Membership No. of Exisiting Group Member_M_MembershipNo_2'), 
    '02179118')

WebUI.setText(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/input_Membership No. of Exisiting Group Mem_29c7a5'), 
    '00388800')

WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/button_Next'))

WebUI.setText(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/input_I am a_Pre_Quote_Product_Age'), 
    Age)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/select_Gender Male Female'), 
    'gender', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/select_Gender Male Female'), 
    Gender, true)

if (PaymentMode.equals('Monthly')) {
    'Monthly'
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_MonthlyFirst 2 months subscription and levy will be charged as initial payment'))
}

'Yearly'
if (PaymentMode.equals('Yearly')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/span_Yearly'))
}

'Ward'
if (BenefitLevel.equals('Ward')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Ward'))
}

'Semi Private'
if (BenefitLevel.equals('Semiprivate')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Semi-Private'))
}

'Lump Sump'
if (BasicBenefit.equals('Lump sum hospital and surgical benefit')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Lump Sum Hospital  Surgical Benefit'))
}

'Itemised Hospital'
if (BasicBenefit.equals('Itemised hospital and surgical benefit')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Itemised Hospital  Surgical Benefit'))
}

'Supplementary Major Medical Benefit'
if (OptionalBenefit.equals('Supplementary major medical benefit')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Supplementary Major Medical Benefit'))
}

'Clinical Benefit'
if (OptionalBenefit.equals('Clinical benefit')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Clinical benefit'))
}

'Supplementary major medical benefit and Clincial benefit'
if (OptionalBenefit.equals('Supplementary major medical benefit and Clincial benefit')) {
    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Supplementary Major Medical Benefit'))

    WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/label_Clinical benefit'))
}

WebUI.click(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/button_Get my quote'))

String total = WebUI.getText(findTestObject('Rate Change TO/Page_Bupa STP Form/span_Total'))

System.out.println("Total Cost Is: "+total);

System.out.println("Expected Cost Is: "+ExpectedValue)

if(total.equals(ExpectedValue)) {
	
	assert(true);
	
}

else {
	
	System.out.println("Actual and Expected Value didn't match");
	assert(false);
	
}

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Rate Change TO/Page_Bupa STP Form/span_HK24,789.77'), 
    'HK$24,789.77')

WebUI.closeBrowser()

