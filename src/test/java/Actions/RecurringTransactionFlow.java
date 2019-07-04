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
import pages.RecuringPageFlow;

public class RecurringTransactionFlow {
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
	public void verifyRecurringElements() {
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
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.ClickOnRecurringAirtimeIcon();
				try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RecuringPageFlow RecurringPageObjects = new RecuringPageFlow(driver);
		RecurringPageObjects.clickOnFirstRecurringRechargeItemOnTheListAirtimeOnTheListAirtime();
		RecurringPageObjects.clickOnArrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime();
		RecurringPageObjects.VerifydeleteOptionIsPresent();
		RecurringPageObjects.VerifyViewOptionIsPresent();
		RecurringPageObjects.VerifyResumeOptionIsPresent();
		RecurringPageObjects.VerifyPauseOptionIsPresent();
		RecurringPageObjects.clickOnViewOptionAirtimePage();
		RecurringPageObjects.VerifyScheduleReference1stElementIsPresent();
		RecurringPageObjects.VerifyStartDate1stElementIsPresent();
		RecurringPageObjects.VerifyEndDate1stElementIsPresent();
		RecurringPageObjects.VerifyNextBillingDate1stElementIsPresent();
		RecurringPageObjects.VerifyLastScheduledDate1stElementIsPresent();
		RecurringPageObjects.clickOnCloseButton();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test Passed");
		}
	
	/*@Test(priority = 1)
	public void addASchedule() {
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
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.ClickOnRecurringAirtimeIcon();
				try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RecuringPageFlow RecurringPageObjects = new RecuringPageFlow(driver);
		RecurringPageObjects.clickOnAddButtonRecurring();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test Passed");
		}*/

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
