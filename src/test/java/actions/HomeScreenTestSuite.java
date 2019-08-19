package actions;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.log4jLogging;
import pages.Dashboard;
import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.TopBarHeader;
import pages.URL;

public class HomeScreenTestSuite {
		static WebDriver driver = null;
		URL baseUrl = new URL();
		public static Logger logger = LogManager.getLogger(HomeScreenTestSuite.class);
		

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
			
			NavigateToURL startWebsite = new NavigateToURL(driver);
			startWebsite.launchURL();
			driver.manage().window().setSize(new Dimension(375, 667));
			try {
				System.out.println("screen-resolution set successfully");
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
				TopBarHeader test = new TopBarHeader(driver);
				test.VerifyReferralsIconIsPresent();
				logger.debug("its the time to try out this");
			} catch (Exception e) {
				logger.error(e.getMessage());
				logger.trace(e.getStackTrace());
				logger.debug("its the time to debug");
				
				e.printStackTrace();
			}
			
			System.out.println("Test Passed");
		}

		@AfterTest
		public void tearDown() {

			driver.quit();
		}

	}

