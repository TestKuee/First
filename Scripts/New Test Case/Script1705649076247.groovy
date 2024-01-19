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

WebUI.navigateToUrl('http://130.211.243.37:96/login')

WebUI.setText(findTestObject('Object Repository/Elearning - Master elearning/Page_Login  Elearning CMS/input_email'), 'admin@indocyber.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Elearning - Master elearning/Page_Login  Elearning CMS/input_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Login  Elearning CMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Home  Elearning CMS/a_Master Elearning'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/div_Branch                                 _a0151a'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/div_Branch                                 _a0151a_1'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/div_Add                                    _54877b'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/button_Add                                 _6c91be'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/div_Add Branch                             _0d8da4'))

WebUI.setText(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/input_name'), 
    'hardy')

WebUI.setText(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/input_instanceCode'), 
    'iglo')

WebUI.click(findTestObject('Elearning - Master elearning/Page_Master Elearning  Elearning CMS/Object_select_user_pic/Page_1705649846123/panah_dropdown'))

WebUI.click(findTestObject('Elearning - Master elearning/Page_Master Elearning  Elearning CMS/Object_select_user_pic/Page_1705649846123/search_box'))

WebUI.setText(findTestObject('Elearning - Master elearning/Page_Master Elearning  Elearning CMS/Object_select_user_pic/Page_1705649846123/search_box'), 
    user_pic)

WebUI.click(findTestObject('Elearning - Master elearning/Page_Master Elearning  Elearning CMS/Object_select_user_pic/Page_1705649846123/selected_user'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/div_Active'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/input_isActive'))

WebUI.click(findTestObject('Object Repository/Elearning - Master elearning/Page_Master Elearning  Elearning CMS/button_Save'))

WebUI.delay(3)

WebUI.refresh()

WebUI.closeBrowser()

