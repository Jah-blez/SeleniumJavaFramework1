package Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main (String []args){
		
		//Old method to get your browser Working
		/*String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
				
		//System.setProperty("webdriver.gecko.driver", projectPath +"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();*/
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		driver.quit();
	}

}
