package Actions;

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

import Pages.QTHomePageScreen2;
import Pages.QtHomePageScreen;
import Pages.QtLoginPage;
import Pages.QtLoginPage2;
import Pages.TopBarHeader;
import Pages.Dashboard;
import Pages.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProfilePageTestSuite {
	
	static WebDriver driver = null;

	@BeforeTest
	public void startUp() {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Test(priority = 1)
	public static void changeFirstLastNameSuccessfully() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("abc@test.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.EnterFirstNameInFirstNameField("testing1");
		ProfilePageObjects.EnterLastNameInLastNameField("LastName");
		ProfilePageObjects.clickOnSaveChangesButton();
		ProfilePageObjects.verifySuccessfulProfileUpdatedMsgIsDisplayed();
		

		// driver.close();
		System.out.println("Test Passed");
	}
	
	@Test(priority = 2)
	public static void changePasswordInvalidOldPassword() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("abc@test.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("");
		ProfilePageObjects.EnternewPassword("");
		ProfilePageObjects.reTypePwdField("");
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.VerifyErrToastMsgInvalidCurrentPasswordSuppliedIsDisplayed();
	
		System.out.println("Test Passed");
	}

	@Test(priority = 3)
	public static void changePasswordAllFieldsEmpty() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("abc@test.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.errMsgPleaseEnterYourNewPasswordIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourPasswordConfirmationIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourOldPasswordIsPresent();
			
		System.out.println("Test Passed");
	}
	@Test(priority = 4)
	public static void changePasswordNewPasswordAndReTypePasswordFieldsAreEmpty() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("abc@test.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("");
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.errMsgPleaseEnterYourNewPasswordIsPresent();
		ProfilePageObjects.errMsgPleaseEnterYourPasswordConfirmationIsPresent();
					
		System.out.println("Test Passed");
	}
	
	@Test(priority = 5)
	public static void changePasswordSuccessfully() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("abc@test.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("");
		ProfilePageObjects.EnternewPassword("");
		ProfilePageObjects.reTypePwdField("");
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.verifySuccessfulChangePwdMsgIsDisplayed();
					
		System.out.println("Test Passed");
	}
	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
