package actions;

import org.testng.annotations.Test;

import Methods.SuccessfulLogin;

import java.io.IOException;

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Dashboard;
import pages.NavigateToURL;
import pages.StartBrowser;
/*import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;*/
import pages.URL;

public class SearchFieldTestSuite {
		static WebDriver driver = null;
		URL baseUrl = new URL();

		@BeforeTest
		public void startUp() throws IOException {
			StartBrowser openConnection = new StartBrowser();
			driver = openConnection.initializeBrowser();
	}

		@Test(priority = 1)
		public void verifySearchFieldReturnsSavedPaymentItemsFirst() {
			NavigateToURL startWebsite = new NavigateToURL(driver);
			startWebsite.launchURL();
			
			SuccessfulLogin LogIn = new SuccessfulLogin(driver);
			LogIn.successfulLogin();
			
			Dashboard DashboardObjects = new Dashboard(driver);
			DashboardObjects.clickDashboardSearchField();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DashboardObjects.EnterTextInDashboardSearchField("ai");
			DashboardObjects.VerifyBuNGN890AirtelSavedPaymentIsPresent();
			
			System.out.println("verifySearchFieldReturnsSavedPaymentItemsFirst Test Passed");
		}
		
		@Test(priority = 2)
		public void verifyUserReturnstoDashBoardScreenWhenSearchCriteiraIsRemovedFromSearchField() {
			
			Dashboard DashboardObjects = new Dashboard(driver);
			DashboardObjects.clickDashboardSearchField();
			DashboardObjects.clearDashboardSearchField();
			DashboardObjects.verifySavedPaymentsTransferIcon();
			
			System.out.println("verifyUserReturnstoDashBoardScreenWhenSearchCriteiraIsRemovedFromSearchField Test Passed");
		}
		
		@Test(priority = 3)
		public void verifySearchFieldReturnsBillerListAfterSavedPaymentOptionsAreExausted() {
			
			Dashboard DashboardObjects = new Dashboard(driver);
			DashboardObjects.clickDashboardSearchField();
			DashboardObjects.EnterTextInDashboardSearchField("British");
			DashboardObjects.verifyBritishAirwaysGTBPosBillerIconIsPresent();
						
			System.out.println("verifySearchFieldReturnsBillerListAfterSavedPaymentOptionsAreExausted Test Passed");
		}
				
		@AfterTest
		public void tearDown() {

			driver.quit();
		}

	}

