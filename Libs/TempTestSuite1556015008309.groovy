import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Checkout')

suiteProperties.put('name', 'Checkout')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\User\\Katalon Studio\\SwagLabs\\Reports\\Checkout\\20190423_172323\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Checkout', suiteProperties, [new TestCaseBinding('Test Cases/Checkout/TC12 Click button add to chart in product list', 'Test Cases/Checkout/TC12 Click button add to chart in product list',  null), new TestCaseBinding('Test Cases/Checkout/TC13 View cart list', 'Test Cases/Checkout/TC13 View cart list',  null), new TestCaseBinding('Test Cases/Checkout/TC14 View the item details on the cart', 'Test Cases/Checkout/TC14 View the item details on the cart',  null), new TestCaseBinding('Test Cases/Checkout/TC15 Remove items on the cart', 'Test Cases/Checkout/TC15 Remove items on the cart',  null), new TestCaseBinding('Test Cases/Checkout/TC16 Click button checkout', 'Test Cases/Checkout/TC16 Click button checkout',  null), new TestCaseBinding('Test Cases/Checkout/TC17 Input complete buyer data', 'Test Cases/Checkout/TC17 Input complete buyer data',  null), new TestCaseBinding('Test Cases/Checkout/TC18 Input uncomplete buyer data', 'Test Cases/Checkout/TC18 Input uncomplete buyer data',  null), new TestCaseBinding('Test Cases/Checkout/TC19 Finish checkout', 'Test Cases/Checkout/TC19 Finish checkout',  null), new TestCaseBinding('Test Cases/Checkout/TC20 Cancel checkout', 'Test Cases/Checkout/TC20 Cancel checkout',  null)])
