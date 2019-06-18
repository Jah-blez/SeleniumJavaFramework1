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
import pages.BuyAirtimePage;
import pages.Dashboard;
import pages.PayPage;
import pages.QTHomePageScreen2;
import pages.QtHomePageScreen;
import pages.QtLoginPage;
import pages.QtLoginPage2;

public class BuyAirtimeTestSuite {
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
	public void buyAirtimeFlow() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HomeScreenObjects.clickOnBuyAirtimeIcon();
		
		BuyAirtimePage BuyAirtimePageObjects = new BuyAirtimePage(driver);
	/*	BuyAirtimePageObjects.clickOnArrowNetworkFieldDropDownSelfRecharge();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BuyAirtimePageObjects.selectAirtelRechargePinOptionFromDropDown();*/
		BuyAirtimePageObjects.clickOnArrowToTopUpOthersDropDown();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BuyAirtimePageObjects.EnterMobileNumberInFieldInTopOtherNumbersSection("08038710144");
		BuyAirtimePageObjects.EnterAmountInRechargeOthersField("100");
		BuyAirtimePageObjects.clickOnContinueButtonRechargeOthers();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPage PayPageObjects = new PayPage(driver);
		PayPageObjects.EnterExpiryDate("1");
		PayPageObjects.EnterExpiryDate("1");
		PayPageObjects.EnterExpiryDate("3");
		PayPageObjects.EnterExpiryDate("1");
		PayPageObjects.EnterCvv("123");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Passed");
		}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
