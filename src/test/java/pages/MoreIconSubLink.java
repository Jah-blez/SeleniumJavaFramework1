package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MoreIconSubLink {

	private WebDriver driver = null;
	By bookFlight = By.xpath("//span[contains(text(),'Book Flight')]");
	By requestLoan = By.xpath("//span[contains(text(),'Request Loan')]");
	By shoppingMall = By.xpath("//span[contains(text(),'Shopping Mall')]");
	By eventTicketing = By.xpath("//span[contains(text(),'Event Ticketing')]");
	By requestLoan_loanamount = By.xpath("//input[@id='amount']");
	By requestLoan_acctNumber = By.xpath("//*[contains(@id, 'accountNumber')]//*[contains(@class, 'Select-input') and contains(@role, 'combobox')] ");
	
	By requestLoan_selectbank = By.xpath("//div[contains(text(),'Select Bank')]");
	By requestLoan_continue = By.xpath("//button[@id='transferButton']");
	
	

	public MoreIconSubLink (WebDriver driver) {
			
		this.driver  = driver;
	}
	
	
	public void VerifyRequestLoanLinkIsPresent() {
		if (driver.findElement(requestLoan).isDisplayed()) {
			System.out.println("requestLoanLink is Present");
		} 
		else {
			System.out.println("requestLoanLink is Absent");
		}
	}
	
	public void VerifyBookFlightLinkIsPresent() {
		if (driver.findElement(bookFlight).isDisplayed()) {
			System.out.println("BookflightLink is Present");
		} 
		else {
			System.out.println("BookflightLink is Absent");
		}
	}
	
	public void VerifyShoppingMallLinkIsPresent() {
		if (driver.findElement(shoppingMall).isDisplayed()) {
			System.out.println("ShoppingMallLink is Present");
		} 
		else {
			System.out.println("ShoppingMallLink is Absent");
		}
	}
	
	public void VerifyEventTicketingLinkIsPresent() {
		if (driver.findElement(eventTicketing).isDisplayed()) {
			System.out.println("EventTicketingLink is Present");
		} 
		else {
			System.out.println("EventTicketingLink is Absent");
		}
	}
	
	
	public void clickOnRequestLoanLink(String loan_amount, String acct, String Sel_Bank ) throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(requestLoan).click();
		
		System.out.println("RequestLoanLink clickOn successfully");
		
		if (driver.findElement(requestLoan_acctNumber).isDisplayed()) {
			System.out.println("Account number field is Present");
		} 
		else {
			System.out.println("Account number field is Absent");
		}
		
	
	
	if (driver.findElement(requestLoan_loanamount).isDisplayed()) {
		System.out.println("Loan Amount field is Present");
	} 
	else {
		System.out.println("Loan Amount field is Absent");
	}
	
	if (driver.findElement(requestLoan_selectbank).isDisplayed()) {
		System.out.println("Select bank field is Present");
	} 
	else {
		System.out.println("Select bank field is Absent");
	}
	
	if (driver.findElement(requestLoan_continue).isDisplayed()) {
		System.out.println("continue button is Present");
	} 
	else {
		System.out.println("continue button is Absent");
	}
	
	driver.findElement(requestLoan_loanamount).sendKeys(loan_amount);
	System.out.println("loan amount entered successfully");
	
		
	
	driver.findElement(requestLoan_acctNumber).sendKeys(acct);
	
	
	System.out.println("account number entered successfully");
	
	driver.findElement(requestLoan_selectbank).sendKeys(Sel_Bank);
	System.out.println("Bank selected successfully");
	
	driver.findElement(requestLoan_continue).click();
	System.out.println("continue button clicked successfully");
}
	
	public void clickOnBookFlightLink() {
		driver.findElement(bookFlight).click();
		System.out.println("BookFlightLink clickOn successfully");
		
		
		if (driver.findElement(bookFlight).isDisplayed()) {
			System.out.println("BookflightLink is Present");
		} 
		else {
			System.out.println("BookflightLink is Absent");
		}
		
	}
	
	public void clickOnShoppingMallLink() {
		driver.findElement(shoppingMall).click();
		System.out.println("ShoppingMallLink clickOn successfully");
	}
	
	public void clickOnEventTicketingLink() {
		driver.findElement(eventTicketing).click();
		System.out.println("EventTicketingLink clickOn successfully");
	}
	
}
