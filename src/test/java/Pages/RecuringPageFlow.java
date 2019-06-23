package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecuringPageFlow {
	private WebDriver driver = null;
	//Elements on Recurring Recharge Page
	By recurringAirtimelIconDashboard = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[6]/section[1]/section[1]/section[2]/section[1]/section[1]");
	By cancelButtonOnRecurringAirtimePage = By.xpath("//body[contains(@class,'has__modal')]/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[@class='col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section']/section[@class='dashboard__card']/section[@class='dashboard__modal']/section[contains(@class,'dasboard__modal__box recurring')]/section[@class='close__modal']/span/*[1]");
	By filterSearchBoxAirtime = By.xpath("//input[@id='savedAirtimeSearchBox']");
	By addButtonRecurring = By.xpath("//button[@id='addAirtimeButton']");
	By checkBoxRecurring = By.xpath("//span[contains(@class,'checker unchecked')]");
	By firstRecurringRechargeItemOnTheListAirtime = By.xpath("//*[contains(@class, 'accordion__item')]//*[contains(@id, 'accordion__title-0')]");
	By arrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime = By.xpath("//*[contains(@class, 'accordion__item')]//*[contains(@id, 'accordion__title-0')]");
	By viewOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'View')]");
	By deleteOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'Delete')]");
	By disabledPause = By.xpath("//*[contains(@class, 'action-option')]//*[contains(@class,'option-row disabled-item')]");
	By pauseOption = By.xpath("//section[contains(@class,'data__extra')]//section[3]");
	By resumeOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'Resume')]");
	//Elements on Recurring Bills Page
	
	public RecuringPageFlow(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver  = driver;
	}
	public void clickOnResumeOptionAirtimePage(){
		driver.findElement(resumeOption).click();
		System.out.println("resumeOption click successfully");
	}
	public void clickOnPauseOptionAirtimePage(){
		driver.findElement(pauseOption).click();
		System.out.println("pauseOption click successfully");
	}
	public void clickOndeleteOptionAirtimePage(){
		driver.findElement(deleteOption).click();
		System.out.println("deleteOption click successfully");
	}
	public void clickOnViewOptionAirtimePage(){
		driver.findElement(viewOption).click();
		System.out.println("viewOption click successfully");
	}
	public void clickOnArrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime(){
		driver.findElement(arrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime).click();
		System.out.println("arrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime click successfully");
	}
	public void clickOnFirstRecurringRechargeItemOnTheListAirtimeOnTheListAirtime(){
		driver.findElement(firstRecurringRechargeItemOnTheListAirtime).click();
		System.out.println("firstRecurringRechargeItemOnTheListAirtime click successfully");
	}
	public void VerifyFirstRecurringRechargeItemOnTheListAirtimeIsPresent(){
		if( driver.findElement(firstRecurringRechargeItemOnTheListAirtime).isDisplayed())
		{
			System.out.println("firstRecurringRechargeItemOnTheListAirtime is Present");
		}else{
			System.out.println("firstRecurringRechargeItemOnTheListAirtime is Absent");
		}
	}
	public void clickOnCheckBoxRecurring(){
		driver.findElement(checkBoxRecurring).click();
		System.out.println("checkBoxRecurring click successfully");
	}
	public void clickOnAddButtonRecurring(){
		driver.findElement(addButtonRecurring).click();
		System.out.println("addButtonRecurring click successfully");
	}
	public void EnterFilterSearchBoxAirtime(String text) {
		driver.findElement(filterSearchBoxAirtime).sendKeys(text);
		System.out.println("filterSearchBoxAirtime Successfully Entered");
	}
	public void cancelButtonOnRecurringAirtimePage(){
		driver.findElement(cancelButtonOnRecurringAirtimePage).click();
		System.out.println("cancelButtonOnRecurringAirtimePage click successfully");
	}
	public void clickOnRecurringAirtimeIcon(){
		driver.findElement(recurringAirtimelIconDashboard).click();
		System.out.println("recurringAirtimelIcon click successfully");
	}
	public void VerifyRecurringAirtimeIconIsPresent(){
		if( driver.findElement(recurringAirtimelIconDashboard).isDisplayed())
		{
			System.out.println("RecurringAirtimeIcon is Present");
		}else{
			System.out.println("RecurringAirtimeIcon is Absent");
		}
	}

}
