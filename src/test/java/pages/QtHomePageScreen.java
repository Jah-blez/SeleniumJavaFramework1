package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QtHomePageScreen {

	static WebElement element = null;

	public static WebElement loginButton(WebDriver driver){
			element = driver.findElement(By.xpath("//button[@class='btn btn__login']"));
			return element;
		}

}
