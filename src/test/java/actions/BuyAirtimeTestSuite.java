package actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyAirtimePage;
import pages.Dashboard;
import pages.NavigateToURL;
import pages.PayPage;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.StartBrowser;
import pages.Toggle;
import pages.URL;

public class BuyAirtimeTestSuite {
	WebDriver driver = null;

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	//Yet to be implemeted as the flow to get Otp from ESB and pass it here is still in progress
	public void buyAirtimeFlowEnterOTPAndMakePaymentSuccessfully() {
		
		}
	
	@Test(priority = 2)
	//Yet to be implemeted as the flow to get Otp from ESB and pass it here is still in progress
	public void buyAirtimeFlowCardDoesNotRequireOTPAndMakePaymentSuccessfully() {
		
		}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
