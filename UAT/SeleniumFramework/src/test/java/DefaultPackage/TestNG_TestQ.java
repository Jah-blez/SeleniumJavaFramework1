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

import Pages.ProfilePage;
import Pages.QTHomePageScreen2;
import Pages.QtHomePageScreen;
import Pages.QtLoginPage;
import Pages.QtLoginPage2;
import Pages.TopBarHeader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_TestQ {
	static WebDriver driver = null;

	@BeforeTest
	public void startUp() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
	}
/*
	@Test
	public void testingQt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.get("https://google.com");
		 * driver.findElement(By.name("q")).sendKeys("Testing Guru");
		 * driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);
		 * 
		 * driver.close(); System.out.println("Test Passed");
		 
		QtHomePageScreen.loginButton(driver).click();

		QtLoginPage.usernameField(driver).sendKeys("dadubiaro@interswitch.com");
		QtLoginPage.passwordField(driver).sendKeys("password");
		QtLoginPage.button_Login(driver).click();
		
	}*/

	@Test
	public static void testingQt2() {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS);
		 * 
		 * driver.get("https://qt-v5.qa.interswitchng.com/");
		 * driver.manage().window().maximize();
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qt-v5.qa.interswitchng.com/");
		driver.manage().window().maximize();
		QTHomePageScreen2 HomeScreenObjects = new QTHomePageScreen2(driver);
		HomeScreenObjects.clickOnLoginButton();
		QtLoginPage2 LoginScreenObjects = new QtLoginPage2(driver);
		LoginScreenObjects.EnterUserNameInUserNameField("dadubiaro@interswitch.com");
		LoginScreenObjects.EnterPasswordInUserPasswordField("password");
		LoginScreenObjects.ClickOnLoginButton();
		TopBarHeader TopBarHeaderObjects = new TopBarHeader(driver);
		TopBarHeaderObjects.clickOnProfileIcon();
		TopBarHeaderObjects.clickOnInnerProfileIcon();
		ProfilePage ProfilePageObjects = new ProfilePage(driver);
		ProfilePageObjects.clickOnChangePwdButton();
		ProfilePageObjects.EnterOldPassword("password");
		ProfilePageObjects.EnternewPassword("testing");
		ProfilePageObjects.reTypePwdField("test");
		ProfilePageObjects.clickOnInnerChangePwdButton();
		ProfilePageObjects.errMsgPasswordDidNotMatchIsPresent();
		

		//driver.close();
		System.out.println("Test Passed");
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
