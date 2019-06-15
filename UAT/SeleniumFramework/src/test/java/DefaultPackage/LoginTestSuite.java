package DefaultPackage;

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
import Pages.Dashboard;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestSuite {
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
	public void InvalidUsernameAndValidPassword() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);

		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.cm");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.VerifyInvalidEmailOrMobileNo_ErrMsg2Displays();
		System.out.println("Test Passed");
		
	}

	@Test(priority = 2)
	public void validEmailAndInvalidPassword() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("passwrd");
		LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.VerifyInvalidPassword_ErrMsg2Displays();
		System.out.println("Test Passed");
		
	}

	@Test(priority = 3)
	public static void successfulLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.VerifyRecurringAirtimeIconIsPresent();

		// driver.close();
		System.out.println("Test Passed");
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
