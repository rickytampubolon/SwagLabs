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

WebUI.setText(findTestObject('Object Repository/Login/TC04/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    'ricky1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/TC04/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), 
    '6/r0/aE9fcumoqDUc6810w==')

WebUI.click(findTestObject('Object Repository/Login/TC04/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_btn_action'))

