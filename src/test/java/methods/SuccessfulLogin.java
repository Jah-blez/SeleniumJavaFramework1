package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.Dashboard;
import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.QtLoginPage2;


public class SuccessfulLogin {
	private WebDriver driver = null;
	
	public SuccessfulLogin(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	public void successfulLogin() {
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.VerifyRecurringAirtimeIconIsPresent();
		
		System.out.println("Test Passed");
	}
}