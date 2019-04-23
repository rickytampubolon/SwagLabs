import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\User\\AppData\\Local\\Temp\\Katalon\\20190423_172031\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://www.saucedemo.com/\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/div_Accepted usernames are              standard_user              locked_out_user              problem_user              performance_glitch_user\'))\n\nWebUI.setText(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name\'), \n    \'standard_user\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/div_Password for all users                secret_sauce\'))\n\nWebUI.setEncryptedText(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password\'), \n    \'qcu24s4901FyWDTwXGr6XA==\')\n\nWebUI.click(findTestObject(\'Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_btn_action\'))\n\nWebUI.click(findTestObject(\'Page_Swag Labs/button_ADD TO CART\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

