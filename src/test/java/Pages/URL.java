package pages;

import org.openqa.selenium.WebDriver;

public class URL {
	private WebDriver driver = null;
	public String qtV5UrlUAT = "https://qt-v5.qa.interswitchng.com/";
	public String qtRecurringUrlUAT = "https://recurring.qa.interswitchng.com/";
	public String qTBaseUrlUAT = "https://qt-v5.qa.interswitchng.com/";
	
	
	//Used only when qtV5 is SUT
	public String qtV5Url() {
		return qtV5UrlUAT;
	}
	
	//Used only when QT Recurring is SUT
	public String qtRecurringUrlUAT() {
		return qtRecurringUrlUAT;
			
	}
	
	//Used throughOut the Tests
		public String qTBaseUrlUAT() {
			return qTBaseUrlUAT;
				
		}
	
		public void launchURL(){
			//URL baseUrl = new URL();
			driver.get(qTBaseUrlUAT);
			driver.manage().window().maximize();
		}

}
