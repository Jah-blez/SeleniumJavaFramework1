package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecuringTransactionFlow {
	private WebDriver driver = null;
	By recurringAirtimelIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[6]/section[1]/section[1]/section[2]/section[1]/section[1]");
	

	public RecuringTransactionFlow(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver  = driver;
	}
	
	public void clickOnRecurringAirtimeIcon(){
		
		driver.findElement(recurringAirtimelIcon).click();
		System.out.println("recurringAirtimelIcon click successfully");
	}
	public void VerifyRecurringAirtimeIconIsPresent(){
		if( driver.findElement(recurringAirtimelIcon).isDisplayed())
		{
			System.out.println("RecurringAirtimeIcon is Present");
		}else{
			System.out.println("RecurringAirtimeIcon is Absent");
		}
	}

}
