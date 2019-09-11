package actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

import java.text.DecimalFormat;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.NavigateToURL;
import pages.QTHomePageScreen2;
import pages.SignUpPage;
import pages.StartBrowser;
import pages.URL;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUpWithoutReferral {

	public static String emailfordatabase1;

	private static CharSequence code = null;
	static WebDriver driver = null;
	URL baseUrl = new URL();
	
	

	Statement stmt = null;

	public static Connection connObj;
	public static String JDBC_URL = "jdbc:sqlserver://172.25.20.63;databaseName=uat_quickteller";

	@BeforeTest (alwaysRun = true)
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();	

	}

	@Test

	public void userregisterationDetailswithoutreferral () throws Exception{

		SignUpPage SignUpRep= new SignUpPage(driver);


		NavigateToURL startWebsite = new NavigateToURL(driver);
		startWebsite.launchURL();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		QTHomePageScreen2 signuplink= new QTHomePageScreen2(driver);
		signuplink.clickOnSignUpButton();


		Thread.sleep(5000);

		SignUpRep.VerifySignUpfieldsArePresent();
		SignUpRep.FillSignUpwithoutReferralfields();

		Thread.sleep(2000);		


		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connObj = DriverManager.getConnection(JDBC_URL, "paydirect", "");


		stmt = connObj.createStatement();
		String sql_activation_code;
		String sql_delete;
		String sql_delete_1;
		String sql_delete_2;
		String sql_delete_3;

		sql_activation_code= "SELECT *  FROM [uat_quickteller].[dbo].[UsersExtraData] where Username='"+emailfordatabase1+"'";



		ResultSet rs = stmt.executeQuery(sql_activation_code);


		while(rs.next()) {
			String activation_code  = rs.getString("ActivationToken");
			code= activation_code;
			
		}

		SignUpRep.activation(code);



		System.out.println("account has been successfully created and activated");

		Thread.sleep(5000);

		sql_delete= "Delete FROM [uat_quickteller].[dbo].[UsersExtraData] where Username='"+emailfordatabase1+"'";
		
//		sql_delete_1 = "Delete from  aspnet_Membership WHERE (Email='lima@test.com')";
//		
//		sql_delete_2="delete from aspnet_UsersInRoles WHERE  userid = (select userid from aspnet_Users where  UserName= 'lima@test.com')";
//		sql_delete_3 = "delete FROM [uat_quickteller].[dbo].[aspnet_Users]   where UserName = 'lima@test.com'";
		
		stmt.executeUpdate(sql_delete);
		System.out.println("email is deleted");


	}

	@AfterTest (alwaysRun = true)
	public void tearDown() {

		driver.quit();
	}


}
