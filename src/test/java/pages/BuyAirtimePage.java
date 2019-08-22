package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyAirtimePage {
	private WebDriver driver = null;
	By buyAirtimeElement = By.xpath("//h5[contains(@class,'menu__content__main__header')]//span[contains(text(),'Buy Airtime')]");
	By selfRechargePhoneNumberLabel = By.xpath("//section[@id='selfRecharge']//a[contains(@class,'accordion__item__header')]");
	By selfRechargeDropDownArrow = By.xpath("//section[contains(@class,'payment__loader hidden')]");
	By networkFieldSelfRecharge = By.id("selfNetworkSelection");
	By arrowNetworkFieldDropDownSelfRecharge = By.xpath("//div[contains(@class,'Select Select--single is-searchable has-value')]//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By airtelRechargePinOption = By.xpath("//*[contains(@class, 'Select-menu-outer')]//*[contains(@class, 'Select-menu')]//*[contains(@class, 'Select-option') and contains(@title, 'Airtel Recharge Pins')]");
	By etisalatRechargeTopUpOption = By.xpath("//*[contains(@class,'Select-menu-outer')]//*[contains(@class,'Select-menu')]//*[contains(@class,'Select-option')and contains(@title,'Etisalat Recharge Top-Up')]");
	By mtnEChargePrepaidOption = By.xpath("//*[contains(@class, 'Select-menu-outer')]//*[contains(@class, 'Select-menu')]//*[contains(@class, 'Select-option') and contains(@title, 'MTN e-Charge Prepaid')]");
	By airtelOption = By.xpath("//*[contains(@class, 'Select-menu-outer')]//*[contains(@class, 'Select-menu')]//*[contains(@class, 'Select-option') and contains(@title, 'Airtel')]");
	By gloQuickChargeOption = By.xpath("//*[contains(@class, 'Select-menu-outer')]//*[contains(@class, 'Select-menu')]//*[contains(@class, 'Select-option') and contains(@title, 'Glo QuickCharge')]");
	By rechargeSelfAmountField = By.id("RechargeSelfAmount");
	By selfRechargeECashButton = By.id("selfRechargeECashButton");
	By useOtherPaymentMethodsLink = By.xpath("//span[contains(text(),'Use Other Payment Methods')]");
	By arrowTopUpOthersDropDown = By.xpath("//section[@id='rechageOthers']//span[@class='accordion__arrow']");
	By mobileNumberFieldInTopOtherNumbersSection = By.xpath("//*[contains(@id, 'mobileNumber')]//*[contains(@class, 'Select-input') and contains(@role, 'combobox')]");
	By arrowtoDropdownMobileNumberInTopUpOtherNumberSection = By.xpath("//section[@id='mobileNumber']//span[@class='Select-arrow']");
	By selectNetworkFieldsInTopOtherNumbersSection = By.xpath("//div[contains(text(),'Mobile Number')]");
	By arrowtoDropdownNetworkInTopUPOtherNumberSection = By.xpath("//section[contains(@id, 'networkSelection')]//section[contains(@class,'select--input required__warning no__float')]//span[contains(@class,'Select-arrow-zone')]//span[contains(@class,'Select-arrow')]");
	By amountRechargeOthersField = By.id("amount");
	By continueButtonRechargeOthers = By.xpath("//span[contains(text(),'Continue')]");
	By errMsgPleaseEnterAValidAmountRechargeOthersSection = By.xpath("//li[contains(@class,'parsley-minVal')]");
	By errMsgPleaseSelectANetworkRechargeOthersSection = By.xpath("//li[contains(text(),'Please enter an amount')]");
	By toggleButton = By.xpath("//div[@class='react-switch-handle']");
	//By payButtonOnPayPage = By.xpath("//button[@id='webpayPay']");
	
	public BuyAirtimePage(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	public void clickOnToggleButton() {
		driver.findElement(toggleButton).click();
		System.out.println("toggleButton clickOn successfully");
	}
	public void SelectGloQuickChargeOptionFromDropdown() {
		driver.findElement(etisalatRechargeTopUpOption).click();
		System.out.println("etisalatRechargeTopUpOption clickOn successfully");
	}
	public void SelectAirtelOptionFromDropdown() {
		driver.findElement(etisalatRechargeTopUpOption).click();
		System.out.println("etisalatRechargeTopUpOption clickOn successfully");
	}
	public void SelectMtnEChargePrepaidOptionFromDropdown() {
		driver.findElement(etisalatRechargeTopUpOption).click();
		System.out.println("etisalatRechargeTopUpOption clickOn successfully");
	}
	public void SelectEtisalatRechargeTopUpOptionFromDropdown() {
		driver.findElement(etisalatRechargeTopUpOption).click();
		System.out.println("etisalatRechargeTopUpOption clickOn successfully");
	}
	public void SelectAirtelRechargePinOptionFromDropdown() {
		driver.findElement(airtelRechargePinOption).click();
		System.out.println("airtelRechargePinOption clickOn successfully");
	}
	public void EnterOrSelectANetworkInNetworkFieldSelfRecharge(String text) {
		driver.findElement(networkFieldSelfRecharge).sendKeys(text);
		System.out.println("networkFieldSelfRecharge Successfully Entered");
	}
	
	public void clickOnSelfRechargeDropDownArrow() {
		driver.findElement(selfRechargeDropDownArrow).click();
		System.out.println("selfRechargeDropDownArrow clickOn successfully");
	}
	public void VerifySelfRechargePhoneNumberLabelIsPresent() {
		if (driver.findElement(selfRechargePhoneNumberLabel).isDisplayed()) {
			System.out.println("selfRechargePhoneNumberLabel is Present");
		} else {
			System.out.println("selfRechargePhoneNumberLabel is Absent");
		}
	}
	public void VerifyBuyAirtimeElementIsPresent() {
		if (driver.findElement(buyAirtimeElement).isDisplayed()) {
			System.out.println("buyAirtimeElement is Present");
		} else {
			System.out.println("buyAirtimeElement is Absent");
		}
	}
	public void VerifyErrMsgPleaseSelectANetworkRechargeOthersSectionIsPresent() {
		if (driver.findElement(errMsgPleaseSelectANetworkRechargeOthersSection).isDisplayed()) {
			System.out.println("errMsgPleaseSelectANetworkRechargeOthersSection is Present");
		} else {
			System.out.println("errMsgPleaseSelectANetworkRechargeOthersSection is Absent");
		}
	}
	public void VerifyErrMsgPleaseEnterAValidAmountRechargeOthersSectionIsPresent() {
		if (driver.findElement(errMsgPleaseEnterAValidAmountRechargeOthersSection).isDisplayed()) {
			System.out.println("errMsgPleaseEnterAValidAmountRechargeOthersSection is Present");
		} else {
			System.out.println("errMsgPleaseEnterAValidAmountRechargeOthersSection is Absent");
		}
	}
	public void clickOnContinueButtonRechargeOthersSection() {
		driver.findElement(continueButtonRechargeOthers).click();
		System.out.println("continueButtonRechargeOthers clickOn successfully");
	}
	public void EnterAmountInRechargeOthersField(String text) {
		driver.findElement(amountRechargeOthersField).sendKeys(text);
		System.out.println("amountRechargeOthersField Successfully Entered");
	}
	public void EnterMobileNumberInFieldInTopOtherNumbersSection(String text) {
		driver.findElement(mobileNumberFieldInTopOtherNumbersSection).sendKeys(text);
		System.out.println("mobileNumberFieldInTopOtherNumbersSection Successfully Entered");
	}
	public void clickOnArrowToTopUpOthersDropDown() {
		driver.findElement(arrowTopUpOthersDropDown).click();
		System.out.println("arrowTopUpOthersDropDown clickOn successfully");
	}
	public void clickOnUseOtherPaymentMethodsLink() {
		driver.findElement(useOtherPaymentMethodsLink).click();
		System.out.println("useOtherPaymentMethodsLink clickOn successfully");
	}
	
	public void clickOnSelfRechargeECashButton() {
		driver.findElement(selfRechargeECashButton).click();
		System.out.println("selfRechargeECashButton click successfully");
	}
	public void EnterRechargeSelfAmountField(String text) {
		driver.findElement(rechargeSelfAmountField).sendKeys(text);
		System.out.println("rechargeSelfAmount Successfully Entered");
	}
	
	public void selectgloQuickChargeOptionFromDropDown() {
		driver.findElement(gloQuickChargeOption).click();
		System.out.println("gloQuickChargeOption click successfully");
	}
	public void selectAirtelOptionFromDropDown() {
		driver.findElement(airtelOption).click();
		System.out.println("airtelOption click successfully");
	}
	public void selectMtnEChargePrepaidOptionFromDropDown() {
		driver.findElement(mtnEChargePrepaidOption).click();
		System.out.println("mtnEChargePrepaidOption click successfully");
	}
	public void selectEtisalatRechargeTopUpOptionFromDropDown() {
		driver.findElement(etisalatRechargeTopUpOption).click();
		System.out.println("etisalatRechargeTopUpOption click successfully");
	}
	public void selectAirtelRechargePinOptionFromDropDown() {
		driver.findElement(airtelRechargePinOption).click();
		System.out.println("airtelRechargePinOption click successfully");
	}

	public void clickOnArrowNetworkFieldDropDownSelfRecharge() {

		driver.findElement(arrowNetworkFieldDropDownSelfRecharge).click();
		System.out.println("arrowNetworkFieldDropDownSelfRecharge click successfully");
	}

	

}

