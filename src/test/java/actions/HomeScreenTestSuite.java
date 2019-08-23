package actions;

import org.testng.annotations.Test;

import Methods.StartBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
		static WebDriver driver;
		URL baseUrl = new URL();
		
		
		@BeforeTest
		public void startUp() throws IOException {
			StartBrowser openConnection = new StartBrowser();
			driver = openConnection.initializeBrowser();
		}
	
		@Test
		public void verifyHomeScreenElementsPresent() {
			
			NavigateToURL startWebsite = new NavigateToURL(driver);
			startWebsite.launchURL();
		//	Set the screenSize you prefer	
		//	driver.manage().window().setSize(new Dimension(375, 667));
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
							
			System.out.println("verifyHomeScreenElementsPresent. Test Passed");
		}

		@AfterTest
		public void tearDown() {

			driver.quit();
		}

	}

