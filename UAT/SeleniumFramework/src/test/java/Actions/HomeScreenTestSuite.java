package actions;

import org.testng.annotations.Test;
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
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;

public class HomeScreenTestSuite {
		static WebDriver driver = null;

		@BeforeTest
		public void startUp() {
			/*
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 */
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		@Test
		public void verifyHomeScreenElementsPresent() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://qt-v5.qa.interswitchng.com/");
			driver.manage().window().maximize();

			QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
			HomeScreenObjects.verifySwitchToOldQuicktellerLinkIsPresent();
			HomeScreenObjects.verifyQTLogoIsPresent();
			HomeScreenObjects.verifyPayPointLinkIsPresent();
			HomeScreenObjects.VerifyLoginButtonIsPresent();
			HomeScreenObjects.verifySignUpButtonIsPresent();
			HomeScreenObjects.VerifyDashboardIconIsPresent();
			HomeScreenObjects.VerifySend_ReceiveMoneyIconIsPresent();
			HomeScreenObjects.VerifyBuyAirtimeIconIsPresent();
			HomeScreenObjects.VerifyPayBillsIconIsPresent();
			HomeScreenObjects.verifyDashboardSearchFieldIsPresent();
			HomeScreenObjects.verifyHomePageWrapperIsPresent();
			
			System.out.println("Test Passed");
		}

		@AfterTest
		public void tearDown() {

			driver.quit();
		}

	}
