package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class PayPage {
	private WebDriver driver = null;
	By cancelIconOnPayPage = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/section/section[contains(@class,'active__payment')]/section[contains(@class,'checkout')]/div[contains(@class,'rodal rodal-fade-enter checkout__rodal')]/div[contains(@class,'rodal-dialog rodal-slideLeft-enter')]/section[@id='checkout']/section[contains(@class,'clearfix checkout__box')]/div[contains(@class,'close__checkout')]/span/*[1]");
	By editButtonOnPayPage = By.xpath("//span[contains(@class,'checkout__order__edit__link')]");
	By arrowWalletCardsDropDown = By.xpath("//section[contains(@id,'walletCards')]//section[contains(@class,'select--input required__warning')]//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By cardNumberTextField = By.xpath("//*[contains(@id, 'walletCards')]//*[contains(@class, 'Select-control')]//*[contains(@class, 'Select-input') and contains(@role, 'combobox')]");
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
	By otpTextField = By.xpath("//input[@id='otp']");

	public PayPage(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	public void VerifyOtpTextFieldIsPresent() {
		if (driver.findElement(otpTextField).isDisplayed()) {
			System.out.println("otpTextField is Present");
		} else {
			System.out.println("otpTextField is Absent");
		}
	}
	public void VerifyCancelIconOnAccountTypeToVerifyNotSureIsDefaulted() {
		if (driver.findElement(cancelIconOnAccountTypeToVerifyNotSureIsDefaulted).isDisplayed()) {
			System.out.println("cancelIconOnAccountTypeToVerifyNotSureIsDefaulted is Present");
		} else {
			System.out.println("cancelIconOnAccountTypeToVerifyNotSureIsDefaulted is Absent");
		}
	}
	public void VerifyCancelIconOnWalletCardsToVerifyPreviousCardIsDefaulted() {
		if (driver.findElement(cancelIconOnWalletCardsToVerifyPreviousCardIsDefaulted).isDisplayed()) {
			System.out.println("cancelIconOnWalletCardsToVerifyPreviousCardIsDefaulted is Present");
		} else {
			System.out.println("cancelIconOnWalletCardsToVerifyPreviousCardIsDefaulted is Absent");
		}
	}
	public void VerifyErrMsgCardExpiredIsPresent() {
		if (driver.findElement(errMsgCardExpired).isDisplayed()) {
			System.out.println("errMsgCardExpired is Present");
		} else {
			System.out.println("errMsgCardExpired is Absent");
		}
	}
	public void VerifyErrMsgInvalidCvvIsPresent() {
		if (driver.findElement(errMsgInvalidCvv).isDisplayed()) {
			System.out.println("errMsgInvalidCvv is Present");
		} else {
			System.out.println("errMsgInvalidCvv is Absent");
		}
	}
	public void VerifyErrMsgInvalidDateIsPresent() {
		if (driver.findElement(errMsgInvalidDate).isDisplayed()) {
			System.out.println("errMsgInvalidDate is Present");
		} else {
			System.out.println("errMsgInvalidDate is Absent");
		}
	}
	public void VerifyErrMsgInvalidCardNumberIsPresent() {
		if (driver.findElement(errMsgInvalidCardNumber).isDisplayed()) {
			System.out.println("errMsgInvalidCardNumber is Present");
		} else {
			System.out.println("errMsgInvalidCardNumber is Absent");
		}
	}
	public void VerifyErrMsgInvalidPinIsPresent() {
		if (driver.findElement(errMsgInvalidPin).isDisplayed()) {
			System.out.println("errMsgInvalidPin is Present");
		} else {
			System.out.println("errMsgInvalidPin is Absent");
		}
	}
	public void VerifyErrMsgPinIsRequiredIsPresent() {
		if (driver.findElement(errMsgPinIsRequired).isDisplayed()) {
			System.out.println("errMsgPinIsRequired is Present");
		} else {
			System.out.println("errMsgPinIsRequired is Absent");
		}
	}
	public void VerifyErrMsgCvvIsRequiredIsPresent() {
		if (driver.findElement(errMsgCvvIsRequired).isDisplayed()) {
			System.out.println("errMsgCvvIsRequired is Present");
		} else {
			System.out.println("errMsgAccountTypeIsRequired is Absent");
		}
	}
	public void VerifyErrMsgExpiryDateIsRequiredIsPresent() {
		if (driver.findElement(errMsgExpiryDateIsRequired).isDisplayed()) {
			System.out.println("errMsgExpiryDateIsRequired is Present");
		} else {
			System.out.println("errMsgExpiryDateIsRequired is Absent");
		}
	}
	public void VerifyErrMsgAccountTypeIsRequiredIsPresent() {
		if (driver.findElement(errMsgAccountTypeIsRequired).isDisplayed()) {
			System.out.println("errMsgAccountTypeIsRequired is Present");
		} else {
			System.out.println("errMsgAccountTypeIsRequired is Absent");
		}
	}
	public void VerifyErrMsgCardIsRequiredIsPresent() {
		if (driver.findElement(errMsgCardIsRequired).isDisplayed()) {
			System.out.println("errMsgCardIsRequired is Present");
		} else {
			System.out.println("errMsgCardIsRequired is Absent");
		}
	}
	public void clickOnPayButton() {
		driver.findElement(payButton).click();
		System.out.println("payButton clickOn successfully");
	}
	public void VerifyPayButtonIsPresent() {
		if (driver.findElement(payButton).isDisplayed()) {
			System.out.println("payButton is Present");
		} else {
			System.out.println("payButton is Absent");
		}
	}
	public void clickOnPinNumberDEL() {
		driver.findElement(pinNumberDEL).click();
		System.out.println("pinNumberDEL clickOn successfully");
	}
	public void clickOnPinNumberCLR() {
		driver.findElement(pinNumberCLR).click();
		System.out.println("pinNumberCLR clickOn successfully");
	}
	public void clickOnPinNumber0() {
		driver.findElement(pinNumber0).click();
		System.out.println("pinNumber0 clickOn successfully");
	}
	public void clickOnPinNumber9() {
		driver.findElement(pinNumber9).click();
		System.out.println("pinNumber9 clickOn successfully");
	}
	public void clickOnPinNumber8() {
		driver.findElement(pinNumber8).click();
		System.out.println("pinNumber8 clickOn successfully");
	}
	public void clickOnPinNumber7() {
		driver.findElement(pinNumber7).click();
		System.out.println("pinNumber7 clickOn successfully");
	}
	public void clickOnPinNumber6() {
		driver.findElement(pinNumber6).click();
		System.out.println("pinNumber6 clickOn successfully");
	}
	public void clickOnPinNumber5() {
		driver.findElement(pinNumber5).click();
		System.out.println("pinNumber5 clickOn successfully");
	}
	public void clickOnPinNumber4() {
		driver.findElement(pinNumber4).click();
		System.out.println("pinNumber4 clickOn successfully");
	}
	public void clickOnPinNumber3() {
		driver.findElement(pinNumber3).click();
		System.out.println("pinNumber3 clickOn successfully");
	}
	public void clickOnPinNumber2() {
		driver.findElement(pinNumber2).click();
		System.out.println("pinNumber2 clickOn successfully");
	}
	public void clickOnPinNumber1() {
		driver.findElement(pinNumber1).click();
		System.out.println("pinNumber1 clickOn successfully");
	}
	public void clickOnPinButton() {
		driver.findElement(pinButton).click();
		System.out.println("pinButton clickOn successfully");
	}
	public void EnterExpiryDateField(String text) {
		driver.findElement(expiryDateField).sendKeys(text);
		System.out.println("expiryDateField Successfully Entered");
	}
	public void clickOnArrowToDropdownAccountType() {
		driver.findElement(arrowToDropdownAccountType).click();
		System.out.println("arrowToDropdownAccountType clickOn successfully");
	}
	public void clickOnArrowWalletCardsDropDown() {
		driver.findElement(arrowWalletCardsDropDown).click();
		System.out.println("arrowWalletCardsDropDown clickOn successfully");
	}
	public void clickOnEditButtonOnPayPage() {
		driver.findElement(editButtonOnPayPage).click();
		System.out.println("editButtonOnPayPage clickOn successfully");
	}
	public void clickOnCancelIconOnPayPage() {
		driver.findElement(cancelIconOnPayPage).click();
		System.out.println("cancelIconOnPayPage clickOn successfully");
	}
	
	public void EnterCardNumberInTextField(String text) {
		driver.findElement(cardNumberTextField).sendKeys(text);
		System.out.println("cardNumberTextField Successfully Entered");
	}
	public void EnterExpiryDate(String text) {
		driver.findElement(expiryDateField).sendKeys(text);
		System.out.println("expiryDateField Successfully Entered");
	}
	public void EnterCvv(String text) {
		driver.findElement(cvv).sendKeys(text);
		System.out.println("cvv Successfully Entered");
	}
	
}

