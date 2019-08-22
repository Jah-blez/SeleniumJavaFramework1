package actions;
import org.testng.annotations.Test;

import Methods.StartBrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Dashboard;
import pages.OTPScreen;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.URL;

public class OTPTestSuite {
		static WebDriver driver = null;
		URL baseUrl = new URL();

		@BeforeTest
		public void startUp() throws IOException {
			StartBrowser openConnection = new StartBrowser();
			driver = openConnection.initializeBrowser();
		}
	
		@Test(priority = 1)
		public void verifyOTPScreenDisplays() {
			BuyAirtimeTestSuiteOTPRequired buyAirtime = new BuyAirtimeTestSuiteOTPRequired();
			buyAirtime.buyAirtimeFlow();
			
			OTPScreen OTPObjects = new OTPScreen(driver);
			OTPObjects.VerifyOtpFieldIsPresent();
			OTPObjects.VerifyPayButtonOnOtpScreenIsPresent();
			OTPObjects.VerifyResendOtpLinkIsPresent();
			OTPObjects.VerifyThatTheEnterOtpSentMessageIsPresent();
						
			System.out.println("Test Passed");
		}
		
		@Test(priority = 2)
		public void InvalidOTPTest() {
			OTPScreen OTPObjects = new OTPScreen(driver);
			OTPObjects.EnterOtpInOtpField("1234");
			OTPObjects.clickOnPayButtonOnOtpScreen();
			OTPObjects.VerifyErrMsgInvalidOtpIsPresent();
			
			
			System.out.println("Test Passed");
		}
		
		@Test(priority = 3)
		public void NoOTPTest() {
			OTPScreen OTPObjects = new OTPScreen(driver);
			OTPObjects.clickOnPayButtonOnOtpScreen();
			OTPObjects.VerifyErrMsgNoOtpEnteredIsPresent();
						
			System.out.println("Test Passed");
		}
		
		@Test(priority = 4)
		public void ResendOtp() {
			OTPScreen OTPObjects = new OTPScreen(driver);
			OTPObjects.VerifyResendOtpLinkIsPresent();
			OTPObjects.clickOnResendOtpLink();
			OTPObjects.VerifyOtpWasResentSuccessfullyMessageIsPresent();
			System.out.println("Test Passed");
		}
		
		@AfterTest
		public void tearDown() {

			driver.quit();
		}

	}

