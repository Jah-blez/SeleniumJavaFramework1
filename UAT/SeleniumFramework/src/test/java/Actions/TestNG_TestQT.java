package Actions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.QTHomePageScreen2;
import Pages.QtHomePageScreen;
import Pages.QtLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_TestQT {
	static WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeTest	
	public void startUp(){
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void TestLogin() throws IOException {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		/* log(Status, details
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		// info(details)
		test.info("This step shows usage of info(details)");
		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");*/

		QtHomePageScreen.loginButton(driver).click();

		QtLoginPage.usernameField(driver).sendKeys("dadubiaro@interswitch.com");

		QtLoginPage.passwordField(driver).sendKeys("password");	

		QtLoginPage.button_Login(driver).click();
		test.pass("Test Passed");
	}
	@Test
	public void NotLoggedInActionsTest(){
	
		
	}
	
	
	@AfterTest
	public void tearDown(){

		driver.quit();
		extent.flush();
		System.out.println("Test Completed Successfully");
	}

	/*public static void testingQt2() {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.get("https://qt-v5.qa.interswitchng.com/");
				driver.manage().window().maximize();

			QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
			HomeScreenObjects.clickOnLoginButton();
			QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
			LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
			LoginScreenObjects.EnterPasswordInUserPasswordField("password");
			LoginScreenObjects.ClickOnLoginButton();

			driver.close();
			System.out.println("Test Passed");	
		}*/

}
