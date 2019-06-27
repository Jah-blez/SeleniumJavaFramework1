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
	By arrowDropdownOfFirstRecurringRechargeItemOnTheListAirtime = By.xpath("//section[@id='row_0']//section[@class='dropdown-holder']");
	By viewOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'View')]");
	By deleteOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'Delete')]");
	By disabledPause = By.xpath("//*[contains(@class, 'action-option')]//*[contains(@class,'option-row disabled-item')]");
	By pauseOption = By.xpath("//section[contains(@class,'data__extra')]//section[3]");
	By resumeOption = By.xpath("//*[contains(@class,'option-label') and contains(text(),'Resume')]");
	By scheduleReference1stElement = By.xpath("//span[contains(text(),'RBP|QXELL|QTELL|08124393570|EHP5WWLGL0')]");
	By startDate1stElement = By.xpath("//section[contains(@class,'data__row actionable edit-form')]//section[2]//span[2]");
	By endDate1stElement = By.xpath("//span[contains(text(),'2019-12-26')]");
	By lastScheduledDate1stElement = By.xpath("//span[contains(text(),'2019-06-27')]");
	By nextBillingDate1stElement = By.xpath("//section[@id='row_0']//section[5]//span[2]");
	By closeButton = By.xpath("//span[contains(text(),'Close')]");
	By mobileNumberFieldRecurring = By.xpath("//div[contains(text(),'Mobile Number')]");
	By descriptionFieldRecurring = By.xpath("//input[@id='description']");
	By networkFieldRecurring = By.xpath("//div[contains(text(),'Select a Network')]");
	By amountFieldRecurring = By.xpath("//input[@id='amount']");
	By continueButtonRecurring = By.xpath("//button[@id='addRecurringAirtime']");
	By backLinkRecurring = By.xpath("//span[contains(text(),'Back')]");
	By mobileNumberDropdownArrow = By.xpath("//section[@id='mobileNum']//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By selectANetworkDropdownArrow = By.xpath("//section[@id='networkSelection']//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By noAmountErrMsgRecurring = By.xpath("//div[contains(@class,'toast toast-error')]");
	By noNetworkErrMsgRecurring = By.xpath("//li[contains(text(),'Please select a network')]");
	By noMobileNumberErrMsg = By.xpath("//li[contains(text(),'Please enter a mobile number')]");
	By noDescriptionErrMsg = By.xpath("//li[contains(text(),'Please enter a description')]");
		
	
	//Elements on Recurring Bills Page
	public void clickOnCloseButton(){
		driver.findElement(closeButton).click();
		System.out.println("closeButton click successfully");
	}
	public void VerifyCloseButtonIsPresent(){
		if( driver.findElement(closeButton).isDisplayed())
		{
			System.out.println("closeButton is Present");
		}else{
			System.out.println("closeButton is Absent");
		}
	}
	public void VerifyNextBillingDate1stElementIsPresent(){
		if( driver.findElement(nextBillingDate1stElement).isDisplayed())
		{
			System.out.println("nextBillingDate1stElement is Present");
		}else{
			System.out.println("nextBillingDate1stElement is Absent");
		}
	}
	public void VerifyLastScheduledDate1stElementIsPresent(){
		if( driver.findElement(lastScheduledDate1stElement).isDisplayed())
		{
			System.out.println("lastScheduledDate1stElement is Present");
		}else{
			System.out.println("lastScheduledDate1stElement is Absent");
		}
	}
	public void VerifyEndDate1stElementIsPresent(){
		if( driver.findElement(endDate1stElement).isDisplayed())
		{
			System.out.println("endDate1stElement is Present");
		}else{
			System.out.println("endDate1stElement is Absent");
		}
	}
	public void VerifyStartDate1stElementIsPresent(){
		if( driver.findElement(startDate1stElement).isDisplayed())
		{
			System.out.println("startDate1stElement is Present");
		}else{
			System.out.println("startDate1stElement is Absent");
		}
	}
	public void VerifyScheduleReference1stElementIsPresent(){
		if( driver.findElement(scheduleReference1stElement).isDisplayed())
		{
			System.out.println("scheduleReference1stElement is Present");
		}else{
			System.out.println("scheduleReference1stElement is Absent");
		}
	}
	public RecuringPageFlow(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver  = driver;
	}
	public void clickOnResumeOptionAirtimePage(){
		driver.findElement(resumeOption).click();
		System.out.println("resumeOption click successfully");
	}
	public void VerifyResumeOptionIsPresent(){
		if( driver.findElement(resumeOption).isDisplayed())
		{
			System.out.println("resumeOption is Present");
		}else{
			System.out.println("resumeOption is Absent");
		}
	}
	public void clickOnPauseOptionAirtimePage(){
		driver.findElement(pauseOption).click();
		System.out.println("pauseOption click successfully");
	}
	public void VerifyPauseOptionIsPresent(){
		if( driver.findElement(pauseOption).isDisplayed())
		{
			System.out.println("pauseOption is Present");
		}else{
			System.out.println("pauseOption is Absent");
		}
	}
	public void clickOndeleteOptionAirtimePage(){
		driver.findElement(deleteOption).click();
		System.out.println("deleteOption click successfully");
	}
	public void VerifydeleteOptionIsPresent(){
		if( driver.findElement(deleteOption).isDisplayed())
		{
			System.out.println("deleteOption is Present");
		}else{
			System.out.println("deleteOption is Absent");
		}
	}
	public void clickOnViewOptionAirtimePage(){
		driver.findElement(viewOption).click();
		System.out.println("viewOption click successfully");
	}
	public void VerifyViewOptionIsPresent(){
		if( driver.findElement(viewOption).isDisplayed())
		{
			System.out.println("viewOption is Present");
		}else{
			System.out.println("viewOption is Absent");
		}
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
