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

	public Dashboard(WebDriver driver){
		this.driver  = driver;
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
