package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TopBarHeader {

	private WebDriver driver = null;
	By referralsIcon = By.xpath("//span[@id='ReferralDropDown']//*[@id='Capa_1']");
	By profileIcon = By.xpath("//span[@id='ProfileDropDown']//*[@id='Capa_1']");
	By innerProfileIcon = By.cssSelector("header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.header__account__buttons.relative section.row.no-margin section.no-padding.col.col-xs-6.isActive:nth-child(2) nav.submenu ul.submenu-ul li:nth-child(1) > a:nth-child(1)");
	By profileDropdownSignOutLink = By.cssSelector("header.header.container-fluid.clearfix:nth-child(2) section.header__account section.account section.header__account__buttons.relative section.row.no-margin section.no-padding.col.col-xs-6.isActive:nth-child(2) nav.submenu ul.submenu-ul li:nth-child(2) > a:nth-child(1)");
	public TopBarHeader(WebDriver driver){
		this.driver  = driver;
	}

	public void clickOnReferralsIcon(){
		driver.findElement(referralsIcon).click();
	}
	public void clickOnProfileIcon(){
		driver.findElement(profileIcon).click();
		if( driver.findElement(innerProfileIcon).isDisplayed() && driver.findElement(profileDropdownSignOutLink).isDisplayed())
		{
			System.out.println("profileIcon is Present");
		}else{
			System.out.println("profileIcon is Absent");
		}
	}
	public void clickOnInnerProfileIcon(){
		driver.findElement(innerProfileIcon).click();
	}	
	public void clickOnProfileDropdownSignOutLink(){
		driver.findElement(profileDropdownSignOutLink).click();
	}	
	public void VerifyProfileIconIsPresent(){
		if( driver.findElement(profileIcon).isDisplayed())
		{
			System.out.println("profileIcon is Present");
		}else{
			System.out.println("profileIcon is Absent");
		}
	}
	public void VerifyReferralsIconIsPresent(){
		if( driver.findElement(referralsIcon).isDisplayed())
		{
			System.out.println("referralsIcon is Present");
		}else{
			System.out.println("referralsIcon is Absent");
		}
	}
}
