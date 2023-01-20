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
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stp-dev.bupa.com.hk/content/forms/af/bupa-stp-form.html?lang=en')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Membership No. of Exisiting Group Mem_29c7a5'), 
    '00388800')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Membership No. of Exisiting Group Member_M_MembershipNo_2'), 
    '02179118')

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Next (3)'))

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_I am a_Pre_Quote_Product_Age'), 
    '44')

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Gender Male Female'), 
    'gender', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Gender Male Female'), 
    'female', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Gender Male Female'), 
    'female', true)

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/span_Supplementary Major Medical Benefit'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/label_Clinical benefit'))

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Promotion Code (if any)_Pre_Quote_Discount'), 
    'GROUP')

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Submit'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Get my quote'))

WebUI.verifyElementText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/span_HK24,765.00'), 
    'HK$24,765.00')

'Add Robot at this step to scroll down'
WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/span_Buy Online'))

WebUI.delay(5)

WebUI.click(findTestObject('STP-AEM-CleanCase TO/Page_Bupa STP Form/Please scroll down'))

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor jsExec = (JavascriptExecutor) driver;

//Scroll Operation using JavaScript Executor
for(int i=0;i< 10; i++) {	

driver.executeScript('document.getElementById("Upfront_TC_div").scrollTop += 100');

WebUI.delay(2);

}

//Scroll using Robot class


//Robot robot = new Robot()
//
//for (int i = 0; i < 30; i++) {
//    robot.keyPress(KeyEvent.VK_DOWN)
//
//    robot.keyRelease(KeyEvent.VK_DOWN)
//
//    WebUI.delay(1)
//}

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Next'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/span_HK24,789.77'), 
    'HK$24,789.77')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_Last_Name_Eng'), 'Nanwani')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_First_Name_Eng'), 'Bhagyesh')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_DOB'), '22-11-1998')

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/td_22'))

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Please Select Terminated employment'), 
    'Married', true)

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Date of marriage  child birth_S_Married'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/td_11'))

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_Phone_No'), '9029134886')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_Email'), 'dungenmaster11@gmail.com')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_HKID_P'), 'N372280')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input__S_HKID_S'), '3')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_FlatRoomFloor_S_FRF'), 
    'Flat no 1904')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_BlockBuildingSiteEstate_S_Building'), 
    'Lodha Casa Maxima')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Street No.  Street Name_S_Street'), 
    'Fashion Street')

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Please SelectAdmiralty'), 
    'select', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/select_Please SelectAdmiralty'), 
    'a82912f0-7d23-ed11-9db2-000d3a817dd1', true)

WebUI.click(findTestObject('STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Next (1)'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/a_Start'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/span_inch'))

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Height_height_value'), 
    '73')

WebUI.setText(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Bupa STP Form/input_Weight_weight_value'), 
    '80')

WebUI.click(findTestObject('STP-AEM-Clean Case Final/Page_Bupa STP Form/button_Next (2)'))

WebUI.click(findTestObject('STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_No_sd-btn sd-navigation__next-btn'))

WebUI.click(findTestObject('Object Repository/STP-AEM-Clean Case Final/Page_Submission Form/input_radiobuttonNo'))

WebUI.click(findTestObject('STP-AEM-Clean Case Final/Page_Submission Form/button_Preview'))

WebUI.click(findTestObject('STP-AEM-Clean Case Final/Page_Submission Form/button_Complete'))

WebUI.delay(5)

WebUI.closeBrowser()

