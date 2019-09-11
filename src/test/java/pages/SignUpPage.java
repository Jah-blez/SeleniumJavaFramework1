package pages;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.SignUpWithReferral;
import actions.SignUpWithoutReferral;

public class SignUpPage {


	private WebDriver driver = null;
	By firstname = By.xpath("//input[@id='accountRegisterFormFirstname']");
	By lastname = By.xpath("//input[@id='accountRegisterFormLastname']");
	By email = By.xpath("//input[@id='accountRegisterFormEmail']");
	By mobilenumber = By.xpath("//input[@id='mobileNumber']");
	By password = By.xpath("//input[@id='accountRegisterFormPassword']");
	By referalphonenumber = By.xpath("//input[@id='accountRegisterFormReferral']");
	By continue_button_to_submit = By.xpath("//button[@id='accountRegisterFormButton']");
	By activation_code_field = By.xpath("//input[@id='accountActivateCodeFormCode']");
	By continue_button_for_activation = By.xpath("//span[contains(text(),'Continue')]");
	By confirmation_text = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Quickteller Paypoint'])[1]/following::span[3]");
	
	DecimalFormat df = new DecimalFormat("###.##");
	String Fname = "Wande";
	String Lname ="Coal";
	String emailcontent = "wc"; 
	String mobilenumbercontent = "09078989900";
	String referralphonenumbercontent = "08124888436";
	
	
	public SignUpPage (WebDriver driver) {
		
		this.driver  = driver;
	}
	
	
	public void VerifySignUpfieldsArePresent() {
		if (driver.findElement(firstname).isDisplayed()) {
			System.out.println("first name field is Present");
		} 
		else {
			System.out.println("first name field is Absent");
		}
		if (driver.findElement(lastname).isDisplayed()) {
			System.out.println("last name field is Present");
		} 
		else {
			System.out.println("last name field is Absent");
		}
		if (driver.findElement(email).isDisplayed()) {
			System.out.println("email field is Present");
		} 
		else {
			System.out.println("email field is Absent");
		}
		
		if (driver.findElement(mobilenumber).isDisplayed()) {
			System.out.println("mobilenumber field is Present");
		} 
		else {
			System.out.println("mobilenumber field is Absent");
		}
		
		if (driver.findElement(password).isDisplayed()) {
			System.out.println("password field is Present");
		} 
		else {
			System.out.println("password field is Absent");
		}
		
		if (driver.findElement(referalphonenumber).isDisplayed()) {
			System.out.println("referral phone number field is Present");
		} 
		else {
			System.out.println("referral phone number  field is Absent");
		}
		
		
		if (driver.findElement(continue_button_to_submit).isDisplayed()) {
			System.out.println("continue button to submit button is Present");
		} 
		else {
			System.out.println("continue button to submit button is Absent");
		}
	}
	
	
	public void FillSignUpwithoutReferralfields() {
		
		emailcontent = emailcontent + df.format(Math.random()*37898) + "@gmail.com";
		
		SignUpWithoutReferral.emailfordatabase1 = emailcontent;
		
		driver.findElement(firstname).sendKeys(Fname);
		System.out.println("firstname entered successfully");
		
			
		
		driver.findElement(lastname).sendKeys(Lname);
		System.out.println("lastname entered successfully");
		
		driver.findElement(email).sendKeys(emailcontent);
		System.out.println("email entered successfully");
		
		driver.findElement(mobilenumber).sendKeys(mobilenumbercontent);
		System.out.println("mobile number entered successfully");
		
		driver.findElement(password).sendKeys("password");
		System.out.println("password entered successfully");
		
		driver.findElement(continue_button_to_submit).click();
		System.out.println("continue_button_to_submit is clicked successfully");
		
		
	}
	
	
public void FillSignUpwithReferralfields() throws InterruptedException {
		
	emailcontent = emailcontent + df.format(Math.random()*37898) + "@gmail.com";
	SignUpWithReferral.emailfordatabase2 = emailcontent;
		driver.findElement(firstname).sendKeys(Fname);
		System.out.println("firstname entered successfully");
		
			
		
		driver.findElement(lastname).sendKeys(Lname);
		System.out.println("lastname entered successfully");
		
		driver.findElement(email).sendKeys(emailcontent);
		System.out.println("email entered successfully");
		
		driver.findElement(mobilenumber).sendKeys(mobilenumbercontent);
		System.out.println("mobile number entered successfully");
		
		driver.findElement(password).sendKeys("password");
		System.out.println("password entered successfully");
		
		driver.findElement(referalphonenumber).sendKeys(referralphonenumbercontent);
		System.out.println("referral number entered successfully");
		
		Thread.sleep(3000);
		driver.findElement(continue_button_to_submit).click();
		Thread.sleep(3000);
		driver.findElement(continue_button_to_submit).click();
		
		System.out.println("continue_button_to_submit is clicked successfully");
		
		
	}
	
	
	
public void activation(CharSequence code) {
	if (driver.findElement(activation_code_field).isDisplayed()) {
		System.out.println("activation code field is Present");
	} 
	else {
		System.out.println("activation code field is Absent");
	}
	if (driver.findElement(continue_button_for_activation).isDisplayed()) {
		System.out.println("continue button for activation is Present");
	} 
	else {
		System.out.println("continue button for activation  is Absent");
	}
	
	
	driver.findElement(activation_code_field).sendKeys(code);
	System.out.println("activation code entered successfully");
	
		
	
	driver.findElement(continue_button_for_activation).click();
	System.out.println("continue button for activation clicked successfully");
	
	
	
	
}
	
	
	
	
}
