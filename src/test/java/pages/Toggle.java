package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Toggle {

	private WebDriver driver = null;
	By toggleButton = By.xpath("//div[@class='react-switch-handle']");
	public Toggle(WebDriver driver){
		this.driver  = driver;
	}

	public void clickOntoggleForward(){
		driver.findElement(toggleButton).click();
	}

	public void clickOntoggleBackward(){
		
		driver.findElement(toggleButton).click();
	}
	/*public void VerifyRecurringAirtimeIconIsPresent(){
		if( driver.findElement(recurringAirtimeIcon).isDisplayed())
		{
			System.out.println("recurringAirtimeIcon is Present");
		}else{
			System.out.println("recurringAirtimeIcon is Absent");
		}
	}*/
}
