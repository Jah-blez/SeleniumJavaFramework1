package actions;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyAirtimePage;
import pages.Dashboard;
import pages.PayPage;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.SavedPaymentPage;
import pages.URL;

public class SavedPaymentSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();
	@BeforeTest
	public void startUp() {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Test(priority = 1)
	public void verifyQROptionIsPresentWhenPayingFromSavedPaymentAirtime() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl.qTBaseUrlUAT);
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		
		SavedPaymentPage  SavedPaymentObjects = new SavedPaymentPage(driver);
		SavedPaymentObjects.clickOnSavedPaymentsAirtimeIcon();
		SavedPaymentObjects.clickOnfirstItemTabRecharge();
		SavedPaymentObjects.clickOnPayButtonOnThirdItemInAirtelDataBundles();
		SavedPaymentObjects.VerifyCardElementIsPresent();
		SavedPaymentObjects.VerifyQRCodeElementIsPresent();
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*WebElement payButton = driver.findElement(By.xpath("//button[@id='webpayPay']"));
		js.executeScript("arguments[0].scrollIntoView();", payButton);*/
		
		System.out.println("Test Passed");
		}
	
	@Test(priority = 2)
	public void verifyQROptionIsPresentWhenPayingFromSavedPaymentForBills() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl.qTBaseUrlUAT);
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		/*QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();*/
		
		SavedPaymentPage  SavedPaymentObjects = new SavedPaymentPage(driver);
		SavedPaymentObjects.clickOnSavedPaymentsBillIcon();
		SavedPaymentObjects.clickOnTheThirdItemTabBills();
		SavedPaymentObjects.clickOnTheFirstPayButtonOnThirdItemTabBills();
		SavedPaymentObjects.VerifyCardElementIsPresent();
		SavedPaymentObjects.VerifyQRCodeElementIsPresent();
		
		System.out.println("Test Passed");
		}
	
	@Test(priority = 3)
	public void verifyQROptionIsPresentWhenPayingFromSavedPaymentForTransfer() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl.qTBaseUrlUAT);
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		/*QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();*/
		
		SavedPaymentPage  SavedPaymentObjects = new SavedPaymentPage(driver);
		SavedPaymentObjects.clickOnSavedPaymentsTransferIcon();
		SavedPaymentObjects.clickOnFirstItemTabTransfer();
		SavedPaymentObjects.clickOnFirstPayButtonOnFirstItemTabTransfer();
		SavedPaymentObjects.EnterAmountInEditAmountFieldTransfer("200");
		SavedPaymentObjects.VerifyDescriptionFieldIsPresent();
		SavedPaymentObjects.clickOnContinueButtonTransfer();
		SavedPaymentObjects.VerifyQRCodeElementIsPresent();
		
		System.out.println("Test Passed");
		}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
