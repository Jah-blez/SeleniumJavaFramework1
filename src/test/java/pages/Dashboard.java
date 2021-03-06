package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	private WebDriver driver = null;
	By savedPaymentsAirtimeIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[1]/section[1]/span[1]/*[1]");
	By savedPaymentsBillIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[1]/section[2]/span[1]/*[1]");
	By savedPaymentsTransferIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[2]/section[1]/span[1]/*[1]");
	By checkStatusIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[3]/section[1]/section[1]/section[2]/section[1]/section[1]/span[1]/*[1]");
	By transactionHistoryIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[3]/section[1]/section[1]/section[2]/section[2]/section[1]");
	By cardsIcon = By.xpath("//section[contains(@class,'sub__box action__group')]//*[@id='Capa_1']");
	By bankAccountsIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[contains(@class,'col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section')]/section[contains(@class,'dashboard__card')]/section[contains(@class,'card__box')]/section[contains(@class,'clearfix card__group')]/section[contains(@class,'col-md-6 col-sm-6 col-xs-6')]/section[contains(@class,'sub__box action__group')]/span[contains(@class,'dashboard__bank')]/*[1]");
	By requestLoanIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[contains(@class,'col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section')]/section[contains(@class,'dashboard__card')]/section[contains(@class,'card__box')]/section[contains(@class,'clearfix card__group')]/section[contains(@class,'col-md-6 col-sm-6 col-xs-6')]/section[contains(@class,'sub__box__mini action__group')]/span[contains(@class,'override')]/*[1]");
	By outstandingLoansIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[contains(@class,'col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section')]/section[contains(@class,'dashboard__card')]/section[contains(@class,'card__box')]/section[contains(@class,'clearfix card__group')]/section[contains(@class,'col-md-6 col-sm-6 col-xs-6')]/section[contains(@class,'sub__box__mini to--left action__group')]/span/*[1]");
	By loanHistoryIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[5]/section[1]/section[1]/section[2]/section[2]/section[1]/span[1]/*[1]");
	By recurringAirtimeIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[6]/section[1]/section[1]/section[2]/section[1]/section[1]");
	By recurringBillIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[contains(@class,'col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section')]/section[contains(@class,'dashboard__card')]/section[contains(@class,'card__box')]/section[contains(@class,'clearfix card__group')]/section[contains(@class,'col-md-6 col-sm-6 col-xs-6')]/section[contains(@class,'sub__box__mini action__group')]/span[contains(@class,'dashboard__transfer')]/*[1]");
	By recurringTransferIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[6]/section[1]/section[1]/section[2]/section[2]/section[1]/span[1]/*[1]");
	By DashboardSearchField = By.xpath("//input[@id='dashboardSearchBox']");
	By HomeSearchField = By.cssSelector("#homeSearchBox");
	By BuNGN890AirtelSavedPayment = By.xpath("//section[contains(text(),'Buy NGN890 airtime for 08124393570')]");
	By PHEDCPostPaidBiller = By.xpath("//*[@class='dashboard__search__contents hidden-md-down']//*[@class='biller__card__desc']//span[contains(text(),'PHEDC Postpaid')]");
	By BritishAirwaysGTBPosBiller = By.xpath("//*[@class='dashboard__search__contents hidden-md-down']//*[contains(text(),'British Airways  GTB POS')]");
	
	
	public Dashboard(WebDriver driver){
		this.driver  = driver;
	}
	
	public void verifyBritishAirwaysGTBPosBillerIconIsPresent(){
		if( driver.findElement(BritishAirwaysGTBPosBiller).isDisplayed())
		{
			System.out.println("BritishAirwaysGTBPosBiller is Present");
		}else{
			System.out.println("BritishAirwaysGTBPosBiller is Absent");
		}
	}
	public void verifySavedPaymentsTransferIcon(){
		if( driver.findElement(savedPaymentsTransferIcon).isDisplayed())
		{
			System.out.println("savedPaymentsTransferIcon is Present");
		}else{
			System.out.println("savedPaymentsTransferIcon is Absent");
		}
	}
	public void verifySavedPaymentsAirtimeIcon(){
		if( driver.findElement(savedPaymentsAirtimeIcon).isDisplayed())
		{
			System.out.println("savedPaymentsAirtimeIcon is Present");
		}else{
			System.out.println("savedPaymentsAirtimeIcon is Absent");
		}
	}
	public void clearDashboardSearchField() {
		driver.findElement(DashboardSearchField).clear();
		System.out.println("DashboardSearchField Successfully Cleared");
	}
	public void VerifyBuNGN890AirtelSavedPaymentIsPresent(){
		if( driver.findElement(BuNGN890AirtelSavedPayment).isDisplayed())
		{
			System.out.println("BuNGN890AirtelSavedPayment is Present");
		}else{
			System.out.println("BuNGN890AirtelSavedPayment is Absent");
		}
	}
	public void EnterTextInDashboardSearchField(String text) {
		driver.findElement(DashboardSearchField).sendKeys(text);
		System.out.println("DashboardSearchField Successfully Entered");
	}
	public void clickDashboardSearchField(){
		driver.findElement(DashboardSearchField).click();
	}
	public void clickOnSavedPaymentsAirtimeIcon(){
		driver.findElement(savedPaymentsAirtimeIcon).click();
	}
	public void clickOnSavedPaymentsBillIcon(){
		driver.findElement(savedPaymentsBillIcon).click();
	}
	public void clickOnSavedPaymentsTransferIcon(){
		driver.findElement(savedPaymentsTransferIcon).click();
	}
	public void clickOnCheckStatusIcon(){
		driver.findElement(checkStatusIcon).click();
	}
	public void clickOnTransactionHistoryIcon(){
		driver.findElement(transactionHistoryIcon).click();
	}
	public void clickOnCardsIcon(){
		driver.findElement(cardsIcon).click();
	}
	public void clickOnBankAccountsIcon(){
		driver.findElement(bankAccountsIcon).click();
	}
	public void clickOnRequestLoanIcon(){
		driver.findElement(requestLoanIcon).click();
	}
	public void ClickOnOutstandingLoansIcon(){
		driver.findElement(outstandingLoansIcon).click();
	}
	public void ClickOnLoanHistoryIcon(){
		driver.findElement(loanHistoryIcon).click();
	}
	public void ClickOnRecurringAirtimeIcon(){
		driver.findElement(recurringAirtimeIcon).click();
	}
	public void ClickOnRecurringBillIcon(){
		driver.findElement(recurringBillIcon).click();
	}
	public void ClickOnRecurringTransferIcon(){
		driver.findElement(recurringTransferIcon).click();
	}
	
	public void VerifyRecurringAirtimeIconIsPresent(){
		if( driver.findElement(recurringAirtimeIcon).isDisplayed())
		{
			System.out.println("recurringAirtimeIcon is Present");
		}else{
			System.out.println("recurringAirtimeIcon is Absent");
		}
	}
}
