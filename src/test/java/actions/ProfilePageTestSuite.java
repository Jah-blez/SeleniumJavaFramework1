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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Dashboard;
import pages.NavigateToURL;
import pages.ProfilePage;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.StartBrowser;
import pages.TopBarHeader;
import pages.URL;

public class ProfilePageTestSuite {
	static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
		public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public static void changeFirstNameAndLastNameSuccessfully() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("fg@th.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clearFirstNameField();
		ProfilePageObjects.EnterFirstNameInFirstNameField("testing1");
		ProfilePageObjects.clearLastNameField();
		ProfilePageObjects.EnterLastNameInLastNameField("LastName");
	
		ProfilePageObjects.clickOnSaveChangesButton();
		ProfilePageObjects.verifySuccessfulProfileUpdatedMsgIsDisplayed();
		

		// driver.close();
		System.out.println("Test Passed");
	}
	
	@Test(priority = 2)
	public static void changePasswordInvalidOldPassword() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		URL baseUrl = new URL();
		driver.get(baseUrl.qTBaseUrlUAT);
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("passwooord");
		ProfilePageObjects.EnternewPassword("pass@123*");
		ProfilePageObjects.reTypePwdField("pass@123*");
		WebElement InnerChangePwdButton = driver.findElement(By.cssSelector("#changePasswordFormButton"));
		js.executeScript("arguments[0].scrollIntoView();", InnerChangePwdButton);
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.VerifyErrToastMsgInvalidCurrentPasswordSuppliedIsDisplayed();
	
		System.out.println("Test Passed");
	}

	@Test(priority = 3)
	public static void changePasswordAllFieldsEmpty() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		WebElement InnerChangePwdButton = driver.findElement(By.cssSelector("#changePasswordFormButton"));
		js.executeScript("arguments[0].scrollIntoView();", InnerChangePwdButton);
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.errMsgPleaseEnterYourNewPasswordIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourPasswordConfirmationIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourOldPasswordIsPresent();
			
		System.out.println("Test Passed");
	}
	@Test(priority = 4)
	public static void changePasswordNewPasswordAndReTypePasswordFieldsAreEmpty() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("password");
		WebElement InnerChangePwdButton = driver.findElement(By.cssSelector("#changePasswordFormButton"));
		js.executeScript("arguments[0].scrollIntoView();", InnerChangePwdButton);
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.errMsgPleaseEnterYourNewPasswordIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourPasswordConfirmationIsPresent();
					
		System.out.println("Test Passed");
	}
	
	@Test(priority = 5)
	public static void changePasswordSuccessfully() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("password");
		ProfilePageObjects.EnternewPassword("Password12");
		ProfilePageObjects.reTypePwdField("Password12");
		
		WebElement InnerChangePwdButton = driver.findElement(By.cssSelector("#changePasswordFormButton"));
		js.executeScript("arguments[0].scrollIntoView();", InnerChangePwdButton);
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.verifySuccessfulChangePwdMsgIsDisplayed();
					
		System.out.println("Test Passed");
	}
	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
