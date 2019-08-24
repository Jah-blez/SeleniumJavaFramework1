package actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiseTest {
	
	
	private static WebDriver driver;


	public practiseTest (WebDriver driver){
		this.driver = driver;
	}
	
	public static void startUpTests() throws IOException{
		//WebDriver driver;
		//driver = new FirefoxDriver();
		Properties config = new Properties(); 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
		config.load(fis);
		String browserName = config.getProperty("browser");
		System.out.println("browserNAME =" + browserName);
		
		System.out.println("chrome".getClass().getName());
		
		
		if (browserName == "chrome"){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();
		}
		else {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");	
		driver = new FirefoxDriver();
		}
//		else {
//			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\IEDriver\\IEDriverServer.exe");	
//			driver = new FirefoxDriver();
//		}
	
		
	}
	

	public static void main(String[] args) throws IOException {
	

		startUpTests();

}
	
}
