package pages;

public class URL {
	
	public String qtV5UrlUAT = "https://qt-v5.qa.interswitchng.com/";
	public String qtRecurringUrlUAT = "https://recurring.qa.interswitchng.com";
	public String qTBaseUrlUAT = "https://recurring.qa.interswitchng.com";
	
	
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


}
