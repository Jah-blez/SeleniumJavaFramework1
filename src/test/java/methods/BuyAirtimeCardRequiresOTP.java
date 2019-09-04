package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.BuyAirtimePage;
import pages.Dashboard;
import pages.NavigateToURL;
import pages.PayPage;
import pages.QTHomePageScreen2;
import pages.QtLoginPage2;
import pages.SuccessfulLogin;
import pages.Toggle;


public class BuyAirtimeCardRequiresOTP {
	private WebDriver driver = null;
	
	public BuyAirtimeCardRequiresOTP(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	public void BuyAirtime7499CardRequiresOTP() {
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

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
		
		//this was previously used for login
		//LoginScreenObjects.doubleClickOnLoginButton();
		
		//LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.ClickOnLoginButton();
	

		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buy Airtime')]")));
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.VerifyRecurringAirtimeIconIsPresent();
		HomeScreenObjects.clickOnBuyAirtimeIcon();
		
		BuyAirtimePage BuyAirtimePageObjects = new BuyAirtimePage(driver);
	//	BuyAirtimePageObjects.clickOnArrowNetworkFieldDropDownSelfRecharge();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BuyAirtimePageObjects.selectAirtelRechargePinOptionFromDropDown();
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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPageObjects.EnterExpiryDate("3");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPageObjects.EnterExpiryDate("5");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PayPageObjects.EnterExpiryDate("0");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
		System.out.println("Test Passed");
		}
	
}