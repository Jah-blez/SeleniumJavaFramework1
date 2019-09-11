package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QTHomePageScreen2 {

	private WebDriver driver = null;
	By loginButton = By.xpath("//button[@class='btn btn__login']");
	By DashBoardIcon = By.xpath("//span[@class='sidebar__icons home__icon']//*[@id='Capa_1']");
	By Send_ReceiveMoneyIcon = By.xpath("//span[contains(text(),'Send/Receive Money')]");
	By buyAirtimeIcon = By.xpath("//span[contains(text(),'Buy Airtime')]");
	By payBillsIcon = By.xpath("//span[@class='sidebar__label'][contains(text(),'Buy Airtime')]");
	By MoreIcon = By.xpath("//span[@class='sidebar__icons']//*[@id='Capa_1']");
	By ReferalDropDownIcon = By.xpath("//span[@id='ReferralDropDown']//*[@id='Capa_1']");
	By signUpButton = By.xpath("//button[@class='btn btn__signup space--left']");
	By payPointLink = By.xpath("//a[@id='paypointLink']");
	By DashboardSearchField = By.cssSelector("#homeSearchBox");
	By qTLogo = By.xpath("//a[@id='qtLogo']");
	By homePageWrapper = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/section[2]/section[1]");
	By switchToOldQuicktellerLink = By.id("oldQtLink");
	

	public static void main(String[] args) {

	}

	public QTHomePageScreen2(WebDriver driver){
		this.driver  = driver;
	}

	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
		System.out.println("loginButton ClickOn Successfully");
	}
	public void clickOnBuyAirtimeIcon(){
		driver.findElement(buyAirtimeIcon).click();
		System.out.println("buyAirtimeIcon ClickOn Successfully");
	}
	public void VerifyLoginButtonIsPresent(){
		if( driver.findElement(loginButton).isDisplayed())
		{
			System.out.println("loginButton is Present");
		}else{
			System.out.println("loginButton is Absent");
		}
	}
	public void VerifyDashboardIconIsPresent(){
		if( driver.findElement(DashBoardIcon).isDisplayed())
		{
			System.out.println("DashBoardIcon is Present");
		}else{
			System.out.println("DashBoardIcon is Absent");
		}
	}
	public void clickOnDashboardIcon(){
		driver.findElement(DashBoardIcon).click();
		System.out.println("DashboardIcon Click Successfully");
	}
	public void VerifySend_ReceiveMoneyIconIsPresent(){
		if( driver.findElement(Send_ReceiveMoneyIcon).isDisplayed())
		{
			System.out.println("Send_ReceiveMoneyIcon is Present");
		}else{
			System.out.println("Send_ReceiveMoneyIcon is Absent");
		}
	}
	public void ClickOnSend_ReceiveMoneyIcon(){
		driver.findElement(Send_ReceiveMoneyIcon).click();
		System.out.println("Send_ReceiveMoneyIcon Click Successfully");
	}
	
	public void VerifyBuyAirtimeIconIsPresent(){
		if( driver.findElement(buyAirtimeIcon).isDisplayed())
		{
			System.out.println("buyAirtimeIcon is Present");
		}else{
			System.out.println("buyAirtimeIcon is Absent");
		}
	}
	public void clickOnPayBillsIcon(){
		driver.findElement(payBillsIcon).click();
		System.out.println("DashboardIcon Click Successfully");
	}
	public void VerifyPayBillsIconIsPresent(){
		if( driver.findElement(payBillsIcon).isDisplayed())
		{
			System.out.println("PayBillsIcon is Present");
		}else{
			System.out.println("PayBillsIcon is Absent");
		}
	}
	public void clickOnMoreIcon(){
		driver.findElement(MoreIcon).click();
		System.out.println("MoreIcon Click Successfully");
	}
	public void verifyMoreIconIsPresent(){
		if( driver.findElement(MoreIcon).isDisplayed())
		{
			System.out.println("MoreIcon is Present");
		}else{
			System.out.println("MoreIcon is Absent");
		}
	}
	public void clickOnReferalDropDownIcon(){
		driver.findElement(ReferalDropDownIcon).click();
		System.out.println("ReferalDropDownIcon Click Successfully");
	}
	public void clickOnSignUpButton(){
		driver.findElement(signUpButton).click();
		System.out.println("signUpButton Click Successfully");
	}
	public void verifySignUpButtonIsPresent(){
		if( driver.findElement(signUpButton).isDisplayed())
		{
			System.out.println("signUpButton is Present");
		}else{
			System.out.println("signUpButton is Absent");
		}
	}
	public void verifyPayPointLinkIsPresent(){
		if( driver.findElement(payPointLink).isDisplayed())
		{
			System.out.println("payPointLink is Present");
		}else{
			System.out.println("payPointLink is Absent");
		}
	}
	public void verifyDashboardSearchFieldIsPresent(){
		if( driver.findElement(DashboardSearchField).isDisplayed())
		{
			System.out.println("DashboardSearchField is Present");
		}else{
			System.out.println("DashboardSearchField is Absent");
		}
	}
	public void verifyQTLogoIsPresent(){
		if( driver.findElement(qTLogo).isDisplayed())
		{
			System.out.println("qTLogo is Present");
		}else{
			System.out.println("qTLogo is Absent");
		}
	}
	public void clickOnQTLogo(){
		driver.findElement(qTLogo).click();
		System.out.println("qTLogo Click Successfully");
	}
	public void verifyHomePageWrapperIsPresent(){
		if( driver.findElement(homePageWrapper).isDisplayed())
		{
			System.out.println("homePageWrapper is Present");
		}else{
			System.out.println("homePageWrapper is Absent");
		}
	}
	public void verifySwitchToOldQuicktellerLinkIsPresent(){
		if( driver.findElement(switchToOldQuicktellerLink).isDisplayed())
		{
			System.out.println("switchToOldQuicktellerLink is Present");
		}else{
			System.out.println("switchToOldQuicktellerLink is Absent");
		}
	}
	public void SwitchToOldQuicktellerLink(){
		driver.findElement(switchToOldQuicktellerLink).click();
		System.out.println("switchToOldQuicktellerLink Click Successfully");
	}
	
}
