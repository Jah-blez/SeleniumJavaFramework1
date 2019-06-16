package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class PayPage {
	private WebDriver driver = null;
	By cancelIconOnPayPage = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/section/section[contains(@class,'active__payment')]/section[contains(@class,'checkout')]/div[contains(@class,'rodal rodal-fade-enter checkout__rodal')]/div[contains(@class,'rodal-dialog rodal-slideLeft-enter')]/section[@id='checkout']/section[contains(@class,'clearfix checkout__box')]/div[contains(@class,'close__checkout')]/span/*[1]");
	By editButtonOnPayPage = By.xpath("//span[contains(@class,'checkout__order__edit__link')]");
	By arrowWalletCardsDropDown = By.xpath("//section[contains(@id,'walletCards')]//section[contains(@class,'select--input required__warning')]//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By cardNumberTextField = By.xpath("//section[contains(@id,'walletCards')]//div[contains(@class,'Select-placeholder')]");
	By arrowToDropdownAccountType = By.xpath("//div[@id='accountType']//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By expiryDateField = By.xpath("//input[@id='expiry']");
	By cvv = By.xpath("//input[@id='cvv']");
	By pinButton = By.xpath("//div[contains(@class,'open__pinpad')]");
	By pinNumber1 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'1')]");
	By pinNumber2 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'2')]");
	By pinNumber3 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'3')]");
	By pinNumber4 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'4')]");
	By pinNumber5 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'5')]");
	By pinNumber6 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'6')]");
	By pinNumber7 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'7')]");
	By pinNumber8 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'8')]");
	By pinNumber9 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'9')]");
	By pinNumber0 = By.xpath("//span[contains(@class,'btn btn-pinpad')][contains(text(),'0')]");
	By pinNumberCLR = By.xpath("//span[contains(text(),'Clr')]");
	By pinNumberDEL = By.xpath("//span[contains(text(),'Del')]");
	By payButton = By.xpath("//button[@id='webpayPay']");
	By errMsgCardIsRequired = By.xpath("//li[contains(text(),'Please enter a card number')]");
	By errMsgAccountTypeIsRequired = By.xpath("//li[contains(text(),'This value is required.')]");
	By errMsgExpiryDateIsRequired = By.xpath("//li[contains(text(),'Expiry date is required')]");
	By errMsgCvvIsRequired = By.xpath("//li[contains(text(),'CVV is required')]");
	By errMsgPinIsRequired = By.xpath("//li[contains(text(),'PIN is required')]");
	By errMsgInvalidPin = By.xpath("//li[contains(@class,'parsley-minlength')]");
	By errMsgInvalidCardNumber = By.xpath("//li[contains(@class,'parsley-isValidCard')]");
	By errMsgInvalidDate = By.xpath("//li[contains(text(),'Invalid date')]");
	By errMsgInvalidCvv = By.xpath("//li[contains(text(),'Invalid CVV')]");
	By errMsgCardExpired = By.xpath("//li[contains(@class,'parsley-isExpiredCard')]");
	By cancelIconOnWalletCardsToVerifyPreviousCardIsDefaulted = By.xpath("//section[@id='walletCards']//span[contains(@class,'Select-clear')][contains(text(),'×')]");
	By cancelIconOnAccountTypeToVerifyNotSureIsDefaulted = By.xpath("//section[@id='walletCards']//span[contains(@class,'Select-clear')][contains(text(),'×')]");

	public PayPage(WebDriver driver) {
		
		this.driver  = driver;
	}
	/*public void clickOnArrowToTopUpOthersDropDown() {
		driver.findElement(arrowTopUpOthersDropDown).click();
		System.out.println("arrowTopUpOthersDropDown clickOn successfully");*/
	
	public void EnterExpiryDate(String text) {
		driver.findElement(expiryDateField).sendKeys(text);
		System.out.println("expiryDateField Successfully Entered");
	}
	public void EnterCvv(String text) {
		driver.findElement(cvv).sendKeys(text);
		System.out.println("cvv Successfully Entered");
	}
	/*
	public void VerifyRecurringAirtimeIconIsPresent() {
		if (driver.findElement(recurringAirtimelIcon).isDisplayed()) {
			System.out.println("RecurringAirtimeIcon is Present");
		} else {
			System.out.println("RecurringAirtimeIcon is Absent");
		}
	}
*/
}

