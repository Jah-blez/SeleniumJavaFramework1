package actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ReportConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.log4jLogging;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;
import pages.RecuringTransactionFlow;

public class testQt {

	public static void main(String[] args) {

		testingQt3();
	}

	public static void testingQt() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://google.com");
			driver.findElement(By.name("q")).sendKeys("Testing Guru");
			driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);

			driver.close();
			System.out.println("Test Passed");*/
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();

		QtHomePageScreen.loginButton(driver).click();

		QtLoginPage.usernameField(driver).sendKeys("dadubiaro@interswitch.com");
		QtLoginPage.passwordField(driver).sendKeys("password");	
		QtLoginPage.button_Login(driver).click();

		driver.quit();
	}

	public static void testingQt2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://quicktellerrecurring-uat.k8.isw.la");
		driver.manage().window().maximize();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.VerifyDashboardIconIsPresent();
		HomeScreenObjects.verifyDashboardSearchFieldIsPresent();
		HomeScreenObjects.VerifyBuyAirtimeIconIsPresent();
		HomeScreenObjects.VerifySend_ReceiveMoneyIconIsPresent();
		HomeScreenObjects.clickOnLoginButton();
		HomeScreenObjects.verifyMoreIconIsPresent();
		HomeScreenObjects.VerifyPayBillsIconIsPresent();
		HomeScreenObjects.verifyPayPointLinkIsPresent();
		HomeScreenObjects.verifySignUpButtonIsPresent();
		HomeScreenObjects.verifyQTLogoIsPresent();
	
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.VerifyfogotPassowrdLinkPresent();
		LoginScreenObjects.VerifySignUpHere_link2Present();
		LoginScreenObjects.VerifyCancel_button2Present();
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();

		driver.close();
		System.out.println("Test Passed");	
	}
	public static void testingQt3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://quicktellerrecurring-uat.k8.isw.la");
		driver.manage().window().maximize();
		
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
				
		RecuringTransactionFlow recurringTransactionObjetcs = new RecuringTransactionFlow(driver);
		recurringTransactionObjetcs.clickOnRecurringAirtimeIcon();
		driver.close();
		System.out.println("Test Passed");
		
	}

}
