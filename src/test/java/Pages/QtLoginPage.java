package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QtLoginPage {
	private static WebElement element = null;
	public static void main(String[] args) {

	}

	public static WebElement usernameField(WebDriver driver){
		element = driver.findElement(By.cssSelector("#accountLoginFormUsername"));
		return element;
	}

	public static WebElement passwordField(WebDriver driver){
		element = driver.findElement(By.cssSelector("#accountLoginFormPassword"));
		return element;
	}

	public static WebElement button_Login(WebDriver driver){
		element = driver.findElement(By.cssSelector("#accountLoginFormButton"));
		return element;
	}

	public static WebElement forgotPassword_link(WebDriver driver){
		element = driver.findElement(By.cssSelector("body.has__modal:nth-child(4) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) section.account__links:nth-child(5) section.text__align--center.account__links--item:nth-child(1) a.text__c--light-blue > span:nth-child(1)"));
		return element;
	}

	public static WebElement signUpHere_link(WebDriver driver){
		element = driver.findElement(By.cssSelector("body.has__modal:nth-child(4) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) section.account__links:nth-child(5) section.text__align--center.account__links--item:nth-child(2) > a.text__c--lemon"));
		return element;
	}

	public static WebElement rememberMe_checkBox(WebDriver driver){
		element = driver.findElement(By.cssSelector("body.has__modal:nth-child(4) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter section.account__sm--width form:nth-child(2) section.checker__box.account__checkbox:nth-child(3) > span.checker.unchecked"));
		return element;
	}

	public static WebElement cancel_button(WebDriver driver){
		element = driver.findElement(By.cssSelector("body.has__modal:nth-child(4) header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.account__modal div.rodal.rodal-fade-enter div.rodal-dialog.rodal-zoom-enter div.account__close--wrapper a.account__close svg:nth-child(1) g:nth-child(1) > polygon:nth-child(1)"));
		return element;
	}

	public static WebElement invalidEmailOrMobileNo_ErrMsg(WebDriver driver){
		element = driver.findElement(By.cssSelector(""));
		return element;
	}

	public static WebElement invalidPassword_ErrMsg(WebDriver driver){
		element = driver.findElement(By.cssSelector(""));
		return element;
	}
}
