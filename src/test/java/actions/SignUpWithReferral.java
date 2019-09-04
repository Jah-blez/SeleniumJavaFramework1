package actions;
import java.text.DecimalFormat;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.StartBrowser;
import pages.URL;

import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SignUpWithReferral {





	private static CharSequence code = null;
	static WebDriver driver = null;
	URL baseUrl = new URL();
	public static Properties prop= new Properties();
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	Statement stmt = null;

	public static Connection connObj;
	public static String JDBC_URL = "jdbc:sqlserver://172.25.20.63;databaseName=uat_quickteller";

	@BeforeTest (alwaysRun = true)
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();	

	}

	@Test

	public void userregisterationDetailswithreferral () throws Exception{

		DecimalFormat df = new DecimalFormat("###.##");
		String Fname = "Wande";
		String Lname ="Coal";
		String email = "wc"; 
		String mobilenumber = "09078989900";

		email= email + df.format(Math.random()*37898) + "@gmail.com";

		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		QTHomePageScreen2 signuplink= new QTHomePageScreen2(driver);
		signuplink.clickOnSignUpButton();


		Thread.sleep(5000);


		driver.findElement(By.xpath("//input[@id='accountRegisterFormFirstname']")).click();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormFirstname']")).clear();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormFirstname']")).sendKeys(Fname);

		driver.findElement(By.xpath("//input[@id='accountRegisterFormLastname']")).click();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormLastname']")).clear();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormLastname']")).sendKeys(Lname);


		driver.findElement(By.xpath("//input[@id='accountRegisterFormEmail']")).click();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormEmail']")).clear();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormEmail']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@id='mobileNumber']")).click();
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).clear();
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(mobilenumber);

		driver.findElement(By.xpath("//input[@id='accountRegisterFormPassword']")).click();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormPassword']")).clear();
		driver.findElement(By.xpath("//input[@id='accountRegisterFormPassword']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@id='accountRegisterFormReferral']")).sendKeys("08124888436");
		
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Referred By (Email or Mobile Number)'])[1]/following::span[1]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Referred By (Email or Mobile Number)'])[1]/following::span[1]")).click();
		
		
		
		Thread.sleep(4000);		

		//getting activation from database

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connObj = DriverManager.getConnection(JDBC_URL, "paydirect", "");


		stmt = connObj.createStatement();
		String sql_activation_code;
		String sql_delete;

		sql_activation_code= "SELECT *  FROM [uat_quickteller].[dbo].[UsersExtraData] where Username='"+email+"'";
		ResultSet rs = stmt.executeQuery(sql_activation_code);


		while(rs.next()) {
			String activation_code  = rs.getString("ActivationToken");
			code= activation_code;
			System.out.println(code);
		}
		
		
		//input activation code
		driver.findElement(By.xpath("//*[@id=\"accountActivateCodeFormCode\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"accountActivateCodeFormCode\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"accountActivateCodeFormCode\"]")).sendKeys(code);
		
		driver.findElement(By.xpath("//*[@id=\"accountActivateCodeFormButton\"]/span[1]")).click();
		




		WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Quickteller Paypoint'])[1]/following::span[3]"));
		String text= element.getText();
		if (text.contains(Fname)){

			System.out.println("Expected registered name is obtained");

		}
		else{

			System.out.println("Expected registered name is not obtained");

		}


		System.out.println("account has been successfully created and activated");

		Thread.sleep(5000);

		sql_delete= "Delete FROM [uat_quickteller].[dbo].[UsersExtraData] where Username='"+email+"'";
		stmt.executeUpdate(sql_delete);
		System.out.println("email is deleted");


	}

	@AfterTest (alwaysRun = true)
	public void tearDown() {

		driver.quit();
	}





}
