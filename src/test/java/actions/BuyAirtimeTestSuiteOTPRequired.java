package actions;
import org.testng.annotations.Test;

import Methods.StartBrowser;

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
import pages.Toggle;
import pages.URL;

public class BuyAirtimeTestSuiteOTPRequired {
	WebDriver driver = null;

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser();
		driver = openConnection.initializeBrowser();
	}

	public BuyAirtimeTestSuiteOTPRequired(WebDriver driver){
		this.driver = driver;
	}
	
	@Test(priority = 1)
	public void buyAirtimeFlow() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();

		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buy Airtime')]")));
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.VerifyRecurringAirtimeIconIsPresent();
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
		BuyAirtimePageObjects.EnterMobileNumberInFieldInTopOtherNumbersSection("08124888436");
		BuyAirtimePageObjects.EnterAmountInRechargeOthersField("500");
		Toggle clickOnToggle = new Toggle(driver);
		clickOnToggle.clickOntoggleBackward();
		BuyAirtimePageObjects.clickOnContinueButtonRechargeOthersSection();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPage PayPageObjects = new PayPage(driver);
		PayPageObjects.EnterCardNumberInTextField("5060990580000217499");
		PayPageObjects.EnterExpiryDate("0");
		PayPageObjects.EnterExpiryDate("3");
		PayPageObjects.EnterExpiryDate("5");
		PayPageObjects.EnterExpiryDate("0");
		PayPageObjects.EnterCvv("111");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement pinPad = driver.findElement(By.xpath("//div[contains(@class,'open__pinpad')]"));
		js.executeScript("arguments[0].scrollIntoView();", pinPad);
		PayPageObjects.clickOnPinNumber1();
		PayPageObjects.clickOnPinNumber1();
		PayPageObjects.clickOnPinNumber1();
		PayPageObjects.clickOnPinNumber1();
		
		WebElement payButton = driver.findElement(By.xpath("//button[@id='webpayPay']"));
		js.executeScript("arguments[0].scrollIntoView();", payButton);
		PayPageObjects.VerifyPayButtonIsPresent();
		PayPageObjects.clickOnPayButton();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPageObjects.VerifyOtpTextFieldIsPresent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Test Passed");
		}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
