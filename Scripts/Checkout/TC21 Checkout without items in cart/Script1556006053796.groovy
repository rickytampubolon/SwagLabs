import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Page_Swag Labs/div_Accepted usernames are              standard_user              locked_out_user              problem_user              performance_glitch_user'))

WebUI.setText(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    'standard_user')

WebUI.click(findTestObject('Page_Swag Labs/div_Password for all users                secret_sauce'))

WebUI.setEncryptedText(findTestObject('Checkout/TC21/Page_Swag Labs/div_Accepted usernames are              standard_user              locked_out_user              problem_user              performance_glitch_user'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_btn_action'))

WebUI.navigateToUrl('https://www.saucedemo.com/cart.html')

WebUI.click(findTestObject('Page_Swag Labs/a_CHECKOUT'))

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_first-name'), 'Ricky')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_last-name'), 'Halomoan')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_postal-code'), '22381')

WebUI.click(findTestObject('Page_Swag Labs/input_CANCEL_btn_primary cart_button'))

WebUI.click(findTestObject('Page_Swag Labs/a_FINISH'))

