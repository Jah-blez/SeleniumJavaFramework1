package actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MoreIconSubLink;
import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.QtLoginPage2;
import pages.StartBrowser;
import pages.URL;

public class requestLoanTestSuite {
	
	private WebDriver driver = null;
	URL baseUrl = new URL();
			
			
	@BeforeTest
	public void startbrowser() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}

	
	@Test
	public void makeLoanRequest() throws Exception {
	
		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	QTHomePageScreen2 icon = new QTHomePageScreen2(driver);
	icon.clickOnLoginButton();
	QtLoginPage2 credential = new QtLoginPage2(driver);
	credential.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
	credential.EnterPasswordInUserPasswordField("password");
	
	credential.ClickOnLoginButton();
	
    Thread.sleep(4000);
	
	icon.clickOnMoreIcon();
	
	MoreIconSubLink clickloanlink = new MoreIconSubLink(driver);
	
	
	
	clickloanlink.clickOnRequestLoanLink("34000","6170399804","Fidelity Bank Plc");
	
	
	
	
	
	
	
	}
	
//	
//	@AfterTest 
//	public void teardown() {
//		
//		driver.quit();
//		
//	}
}
