package actions;

import org.testng.annotations.Test;

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
import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.StartBrowser;
import pages.SuccessfulLogin;
import pages.TopBarHeader;
import pages.URL;

public class LoginTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		this.driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void InvalidUsernameAndValidPassword() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);

		LoginScreenObjects.EnterUserNameInUserNameField("fg@th.colllllm");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.VerifyInvalidEmailOrMobileNo_ErrMsg2Displays();
				
		System.out.println("Test Passed");
	
	}

	@Test(priority = 2)
	public void validEmailAndInvalidPassword() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("fg@th.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("passwrpppd");
		LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.VerifyInvalidPassword_ErrMsg2Displays();
		
		System.out.println("Test Passed");
	
	}

	@Test(priority = 3)
	public void successfulLogin() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.doubleClickOnLoginButton();
	
		
		System.out.println("Test Passed");
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
