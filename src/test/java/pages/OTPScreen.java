package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OTPScreen {
	private WebDriver driver = null;
	//Elements on Recurring Recharge Page
	By otpField = By.xpath("//input[@id='otp']");
	By payButtonOnOtpScreen = By.xpath("//button[@class='ladda-button btn btn-primary btn-block']");
	By resendOtpLink = By.xpath("//section[contains(text(),'Resend OTP')]");
	By EnterTheOtpSentToMessage = By.xpath("//span[@id='otpResponseMsg']");
	By errMsgInvalidOtp = By.xpath("//div[@class='toast toast-error']");
	By errMsgNoOtpEntered = By.xpath("//li[@class='parsley-required']");
	By cancelButton = By.xpath("//body/section[@id='root']/div[@id='wrapper']/section/section/section/section[@class='active__payment']/section[@class='checkout']/div[@class='rodal rodal-fade-enter checkout__rodal']/div[@class='rodal-dialog rodal-slideLeft-enter']/section[@id='checkout']/section[@class='clearfix checkout__box']/div[@class='close__checkout']/span/*[1]");
	By errMsgExpiredOtp = By.xpath("//div[@class='toast toast-error']");
	By otpWasResentSuccessfullyMessage = By.xpath("//div[@class='toast toast-success']");	
	
	public OTPScreen(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver  = driver;
	}
	
	public void clickOnPayButtonOnOtpScreen(){
		driver.findElement(payButtonOnOtpScreen).click();
		System.out.println("payButtonOnOtpScreen click successfully");
	}
	
	public void clickOnResendOtpLink(){
		driver.findElement(resendOtpLink).click();
		System.out.println("resendOtpLink click successfully");
	}
	
	public void VerifyOtpWasResentSuccessfullyMessageIsPresent(){
		if( driver.findElement(otpWasResentSuccessfullyMessage).isDisplayed())
		{
			System.out.println("otpWasResentSuccessfullyMessage is Present");
		}else{
			System.out.println("otpWasResentSuccessfullyMessage is Absent");
		}
	}
	public void VerifyPayButtonOnOtpScreenIsPresent(){
		if( driver.findElement(payButtonOnOtpScreen).isDisplayed())
		{
			System.out.println("payButtonOnOtpScreen is Present");
		}else{
			System.out.println("payButtonOnOtpScreen is Absent");
		}
	}
	public void VerifyOtpFieldIsPresent(){
		if( driver.findElement(otpField).isDisplayed())
		{
			System.out.println("otpField is Present");
		}else{
			System.out.println("otpField is Absent");
		}
	}
	public void VerifyErrMsgExpiredOtpIsPresent(){
		if( driver.findElement(errMsgExpiredOtp).isDisplayed())
		{
			System.out.println("errMsgExpiredOtp is Present");
		}else{
			System.out.println("errMsgExpiredOtp is Absent");
		}
	}
	
	public void VerifyErrMsgNoOtpEnteredIsPresent(){
		if( driver.findElement(errMsgNoOtpEntered).isDisplayed())
		{
			System.out.println("errMsgNoOtpEntered is Present");
		}else{
			System.out.println("errMsgNoOtpEntered is Absent");
		}
	}
	public void VerifyErrMsgInvalidOtpIsPresent(){
		if( driver.findElement(errMsgInvalidOtp).isDisplayed())
		{
			System.out.println("errMsgInvalidOtp is Present");
		}else{
			System.out.println("errMsgInvalidOtp is Absent");
		}
	}
	public void VerifyResendOtpLinkIsPresent(){
		if( driver.findElement(resendOtpLink).isDisplayed())
		{
			System.out.println("resendOtpLink is Present");
		}else{
			System.out.println("resendOtpLink is Absent");
		}
	}
	public void VerifyThatTheEnterOtpSentMessageIsPresent(){
		if( driver.findElement(EnterTheOtpSentToMessage).isDisplayed())
		{
			System.out.println("EnterTheOtpSentToMessage is Present");
		}else{
			System.out.println("EnterTheOtpSentToMessage is Absent");
		}
	}
	public void EnterOtpInOtpField(String text) {
		driver.findElement(otpField).sendKeys(text);
		System.out.println("OTP Successfully Entered");
	}
	

}
