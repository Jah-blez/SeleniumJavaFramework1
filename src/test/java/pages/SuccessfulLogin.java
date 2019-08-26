package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SuccessfulLogin {
	private WebDriver driver = null;
	
	public SuccessfulLogin(WebDriver driver) {	
		this.driver  = driver;
	}
	
	public void successfulLogin(String username, String password) {
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField(username);
		LoginScreenObjects.EnterPasswordInUserPasswordField(password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//LoginScreenObjects.ClickOnLoginButton();
		LoginScreenObjects.doubleClickOnLoginButton();
		Dashboard DashboardObjects = new Dashboard(driver);
		DashboardObjects.VerifyRecurringAirtimeIconIsPresent();
		
		System.out.println("Test Passed");
	}
}