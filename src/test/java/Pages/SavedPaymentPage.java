package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavedPaymentPage {

	private WebDriver driver = null;
	By savedPaymentsAirtimeIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[1]/section[1]/span[1]/*[1]");
	By savedPaymentsBillIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[1]/section[2]/span[1]/*[1]");
	By savedPaymentsTransferIcon = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[2]/section[1]/section[1]/section[2]/section[2]/section[1]/span[1]/*[1]");
	By firstItemTabRecharge = By.xpath("//section[@id='row_0']//div[@class='accordion__item']");
	By payButtonOnThirdItemInAirtelDataBundles = By.xpath("/html[1]/body[1]/section[1]/div[1]/section[1]/section[1]/header[1]/section[2]/section[1]/section[2]/section[2]/section[2]/section[1]/section[2]/section[1]/section[3]/section[1]/section[2]/section[2]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/section[3]/section[1]/section[4]/span[1]");
	By qRCodeElement = By.xpath("//span[contains(text(),'QR Code')]");
	By cardElement = By.xpath("//span[contains(text(),'Card')]");
	By addAirtimeButton = By.xpath("//button[@id='addAirtimeButton']");
	By thirdItemTabBills = By.xpath("//section[@id='row_2']//section[@class='data__sub__header']");
	By firstPayButtonOnThirdItemTabBills = By.xpath("/html[1]/body[1]/section[1]/div[1]/section[1]/section[1]/header[1]/section[2]/section[1]/section[2]/section[2]/section[2]/section[1]/section[2]/section[1]/section[3]/section[1]/section[2]/section[2]/div[1]/div[1]/section[3]/section[1]/div[1]/div[2]/section[1]/section[1]/section[4]/span[1]");
	By firstItemTabTransfer = By.xpath("//section[@id='row_0']//div[@class='accordion__item']");
	By firstPayButtonOnFirstItemTabTransfer = By.xpath("/html[1]/body[1]/section[1]/div[1]/section[1]/section[1]/header[1]/section[2]/section[1]/section[2]/section[2]/section[2]/section[1]/section[2]/section[1]/section[3]/section[1]/section[2]/section[2]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/section[1]/section[1]/section[4]/span[1]");
	By continueButtonTransfer = By.xpath("//button[@id='fundECashButton']");
	By editAmountFieldTransfer = By.xpath("//input[@id='amount']");
	By backLinkTransfer = By.xpath("//span[contains(text(),'Back')]");
	By descriptionField = By.xpath("//input[@id='remark']");
	By cancelButtonOnConfirmTransferAmountPage = By.xpath("//body[contains(@class,'has__modal')]/section[@id='root']/div[@id='wrapper']/section/section/header[@id='topBarHeader']/section[@id='topBarHeaderAccount']/section[@id='account']/section[@id='dashboardContainer']/section[contains(@class,'')]/section[contains(@class,'col-md-6 col-sm-12 col-lg-6 col-xl-4 col-xs-12 card__section')]/section[contains(@class,'dashboard__card')]/section[contains(@class,'dashboard__modal')]/section[contains(@class,'dasboard__modal__box payment favourites mid-box')]/section[contains(@class,'close__modal')]/span/*[1]");
	
	
	             	
	public SavedPaymentPage(WebDriver driver){
		this.driver  = driver;
	}
	public void VerifyCancelButtonOnConfirmTransferAmountPageIsPresent() {
		if (driver.findElement(cancelButtonOnConfirmTransferAmountPage).isDisplayed()) {
			System.out.println("cancelButtonOnConfirmTransferAmountPage is Present");
		} else {
			System.out.println("cancelButtonOnConfirmTransferAmountPage is Absent");
		}
	}
	public void VerifyDescriptionFieldIsPresent() {
		if (driver.findElement(descriptionField).isDisplayed()) {
			System.out.println("descriptionField is Present");
		} else {
			System.out.println("descriptionField is Absent");
		}
	}
	public void clickOnBackLinkTransfer(){
		driver.findElement(backLinkTransfer).click();
	}
	public void EnterAmountInEditAmountFieldTransfer(String text) {
		driver.findElement(editAmountFieldTransfer).sendKeys(text);
		System.out.println("editAmountFieldTransfer Successfully Entered");
	}
	public void clickOnContinueButtonTransfer(){
		driver.findElement(continueButtonTransfer).click();
	}
	public void clickOnFirstPayButtonOnFirstItemTabTransfer(){
		driver.findElement(firstPayButtonOnFirstItemTabTransfer).click();
	}
	public void clickOnFirstItemTabTransfer(){
		driver.findElement(firstItemTabTransfer).click();
	}
	public void clickOnTheFirstPayButtonOnThirdItemTabBills(){
		driver.findElement(firstPayButtonOnThirdItemTabBills).click();
	}
	public void clickOnTheThirdItemTabBills(){
		driver.findElement(thirdItemTabBills).click();
	}
	public void clickOnAddAirtimeButton(){
		driver.findElement(addAirtimeButton).click();
	}
	public void VerifyCardElementIsPresent(){
		if( driver.findElement(cardElement).isDisplayed())
		{
			System.out.println("cardElement is Present");
		}else{
			System.out.println("cardElement is Absent");
		}
	}
	public void VerifyQRCodeElementIsPresent(){
		if( driver.findElement(qRCodeElement).isDisplayed())
		{
			System.out.println("qRCodeElement is Present");
		}else{
			System.out.println("qRCodeElement is Absent");
		}
	}
	public void clickOnPayButtonOnThirdItemInAirtelDataBundles(){
		driver.findElement(payButtonOnThirdItemInAirtelDataBundles).click();
	}
	public void clickOnfirstItemTabRecharge(){
		driver.findElement(firstItemTabRecharge).click();
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
	
	
}
