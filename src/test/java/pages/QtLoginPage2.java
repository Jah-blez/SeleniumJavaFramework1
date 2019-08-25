package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QtLoginPage2 {
	private WebDriver driver= null;

	By usenameField2 = By.cssSelector("#accountLoginFormUsername");
	By passwordField2 = By.cssSelector("#accountLoginFormPassword");
	By button_Login2 = By.cssSelector("#accountLoginFormButton");
	By forgotPassword_link2 = By.xpath("//span[contains(text(),'Forgot password?')]");
	By signUpHere_link2 = By.xpath("//a[@class='text__c--lemon']");
	By rememberMe_checkBox2 = By.cssSelector("body.has__modal:nth-child(4) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) section.checker__box.account__checkbox:nth-child(3) > span.checker.unchecked");
	By cancel_button2 = By.xpath("/html[1]/body[1]/section[1]/div[1]/section[1]/section[1]/header[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/a[1]/*");
	By invalidEmailOrMobileNo_ErrMsg2 = By.cssSelector("body.has__modal:nth-child(5) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) div.float__input.form-group:nth-child(1) div.relative ul.parsley-errors-list.filled > li.parsley-required");
	By invalidPassword_ErrMsg2 = By.cssSelector("body.has__modal:nth-child(5) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) div.float__input.form-group:nth-child(2) div.relative:nth-child(3) ul.parsley-errors-list.filled > li.parsley-required");

	public static void main(String[] args) {

	}

	public QtLoginPage2 (WebDriver driver){
		this.driver = driver;

	}
	public void ClearUserNameInUserNameField(){
		driver.findElement(usenameField2).clear(); 
		System.out.println("UserName Text Field Successfully Cleared");
	}
	public void EnterUserNameInUserNameField(String text){
		driver.findElement(usenameField2).sendKeys(text); 
		System.out.println("UserName Successfully Entered");
	}
	public void EnterPasswordInUserPasswordField(String text){
		driver.findElement(passwordField2).sendKeys(text);
		System.out.println("Password Successfully Entered");
	}
	public void ClickOnLoginButton(){
		driver.findElement(button_Login2).click();
		System.out.println("Login Button Clicked On");
	}
	public void doubleClickOnLoginButton(){
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(button_Login2);
		actions.doubleClick(elementLocator).perform();
		System.out.println("Login Button Double Clicked On Successfully");
	}
	
	public void VerifyfogotPassowrdLinkPresent(){
		if( driver.findElement(forgotPassword_link2).isDisplayed())
		{
			System.out.println("fogotPassowrdLink is Present");
		}else{
			System.out.println("fogotPassowrdLink is Absent");
		}
	}
	public void clickOnForgotPasswordLink(){
		driver.findElement(forgotPassword_link2).click();
	}
	public void ClickOnSignUpHere_link2(){
		driver.findElement(signUpHere_link2).click();
		System.out.println("SignUpHere_link has been clicked On");
	}
	public void VerifySignUpHere_link2Present(){
		if(driver.findElements(signUpHere_link2).size() != 0){
			System.out.println("signUpHere_link is Present");
		}else{
			System.out.println("signUpHere_link is Absent");
		}
	}
	public void CheckTheRememberMe_checkBox2(){
		driver.findElement(rememberMe_checkBox2).click();
		System.out.println("Remember Me CheckBox Has Been Clicked On");
	}
	public void VerifyCancel_button2Present(){
		if(driver.findElements(cancel_button2).size() != 0){
			System.out.println("Cancel_button is Present");
		}else{
			System.out.println("Cancel_button is Absent");
		}
	}
	public void clickOnCancel_button2(){
		driver.findElement(cancel_button2).click();
		System.out.println("Cancel Button has been clicked On");
	}
	public void VerifyInvalidEmailOrMobileNo_ErrMsg2Displays(){
		if(driver.findElements(invalidEmailOrMobileNo_ErrMsg2).size() != 0){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
		}
	}
	public void VerifyInvalidPassword_ErrMsg2Displays(){
		if(driver.findElements(invalidPassword_ErrMsg2).size() != 0){
			System.out.println("Element is Present");
		}else{
			System.out.println("Element is Absent");
		}
	}
}


