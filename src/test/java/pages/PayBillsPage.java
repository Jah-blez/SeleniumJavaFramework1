package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class PayBillsPage {
	private WebDriver driver = null;
	By multiChoiceBiller = By.xpath("//span[contains(text(),'Multichoice Limited')]");
	By dashBoardSearchField = By.xpath("//input[@id='dashboardSearchBox']");
	
	
	public PayBillsPage(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	public void clickOnMultiChoiceBiller() {
		driver.findElement(multiChoiceBiller).click();
		System.out.println("multiChoiceBiller clickOn successfully");
	}
	
	public void VerifyMultiChoiceBillerIsPresent() {
		if (driver.findElement(multiChoiceBiller).isDisplayed()) {
			System.out.println("multiChoiceBiller is Present");
		} else {
			System.out.println("multiChoiceBiller is Absent");
		}
	}
	
	public void EnterBillerNameInDashBoardSearchField(String text) {
		driver.findElement(dashBoardSearchField).sendKeys(text);
		System.out.println("dashBoardSearchField Successfully Entered");
	}
	
}

