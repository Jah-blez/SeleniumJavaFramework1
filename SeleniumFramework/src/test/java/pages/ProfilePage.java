package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfilePage {
		private WebDriver driver = null;
		By firstNameField = By.cssSelector("#editProfileFormFirstname");
		By LastNameField = By.cssSelector("#editProfileFormLastname");
		By emailField = By.cssSelector("#editProfileFormEmail");
		By phoneNumberField = By.cssSelector("#editProfileFormMobilenumber");
		By saveChangesButton = By.cssSelector("#editProfileFormButton");
		By changePwdButton = By.xpath("//button[contains(text(),'Change Your Password')]");
		By stateField = By.cssSelector("#editProfileFormState");
		By cityField = By.cssSelector("#editProfileFormCity");
		By address1Field = By.cssSelector("#editProfileFormAddress1");
		By address2Field = By.cssSelector("#editProfileFormAddress2");
		By addressSaveChangesField = By.cssSelector("#editProfileFormButton2");
		By oldPasswordField = By.cssSelector("#changePasswordFormNewOldPassword");
		By newPasswordField = By.cssSelector("#changePasswordFormNewPassword");
		By reTypePwdField = By.cssSelector("#changePasswordFormConfirmPassword");
		By innerChangePwdButton = By.cssSelector("#changePasswordFormButton");
		By changePwdCancelButton = By.xpath("//button[contains(@class,'btn profile__btn btn-default pull-right')]");
		By editProfileSuccessMessage = By.xpath("//div[contains(@class,'toast toast-success')]");
		By addressLabel = By.xpath("//h5[contains(text(),'Address')]");
		By errPleaseEnterYourOldPassword = By.xpath("//li[contains(text(),'Please enter your old password')]");
		By errPleaseEnterYourNewPassword = By.xpath("//li[contains(text(),'Please enter your new password')]");
		By errPleaseEnterYourPasswordConfirmation = By.xpath("//li[contains(text(),'Please enter your password confirmation')]");
		By errPasswordDidNotMatch = By.xpath("//li[contains(@class,'parsley-equalto')]");
		By errToastMsgInvalidCurrentPasswordSupplied = By.xpath("//div[contains(@class,'toast-message')]");
		By successfulChangePwdMsg = By.xpath("//div[contains(@class,'toast toast-success')]");
		By successfulProfileUpdatedMsg = By.xpath("//div[contains(@class,'toast toast-success')]");
		
		

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	public void VerifyErrToastMsgInvalidCurrentPasswordSuppliedIsDisplayed() {
		if (driver.findElement(errToastMsgInvalidCurrentPasswordSupplied).isDisplayed()) {
			System.out.println("errToastMsgInvalidCurrentPasswordSupplied is Present");
		} else {
			System.out.println("errToastMsgInvalidCurrentPasswordSupplied is Absent");
		}
	}
	public void verifySuccessfulProfileUpdatedMsgIsDisplayed() {
		if (driver.findElement(successfulProfileUpdatedMsg).isDisplayed()) {
			System.out.println("successfulProfileUpdatedMsg is Present");
		} else {
			System.out.println("successfulProfileUpdatedMsg is Absent");
		}
	}
	public void verifySuccessfulChangePwdMsgIsDisplayed() {
		if (driver.findElement(successfulChangePwdMsg).isDisplayed()) {
			System.out.println("successfulChangePwdMsg is Present");
		} else {
			System.out.println("successfulChangePwdMsg is Absent");
		}
	}
	public void errMsgPasswordDidNotMatchIsPresent() {
		if (driver.findElement(errPasswordDidNotMatch).isDisplayed()) {
			System.out.println("errPasswordDidNotMatch is Present");
		} else {
			System.out.println("errPasswordDidNotMatch is Absent");
		}
	}
	public void errMsgPleaseEnterYourPasswordConfirmationIsPresent() {
		if (driver.findElement(errPleaseEnterYourPasswordConfirmation).isDisplayed()) {
			System.out.println("errPleaseEnterYourPasswordConfirmation is Present");
		} else {
			System.out.println("errPleaseEnterYourPasswordConfirmation is Absent");
		}
	}
	public void errMsgPleaseEnterYourOldPasswordIsPresent() {
		if (driver.findElement(errPleaseEnterYourOldPassword).isDisplayed()) {
			System.out.println("errPleaseEnterYourOldPassword is Present");
		} else {
			System.out.println("errPleaseEnterYourOldPassword is Absent");
		}
	}
	public void errMsgPleaseEnterYourNewPasswordIsPresent() {
		if (driver.findElement(errPleaseEnterYourNewPassword).isDisplayed()) {
			System.out.println("errPleaseEnterYourNewPassword is Present");
		} else {
			System.out.println("errPleaseEnterYourNewPassword is Absent");
		}
	}
	
	public void EnterFirstNameInFirstNameField(String text) {
		driver.findElement(firstNameField).sendKeys(text);
		System.out.println("firstName Successfully Entered");
	}

	public void EnterLastNameInLastNameField(String text) {
		driver.findElement(LastNameField).sendKeys(text);
		System.out.println("LastName Successfully Entered");
	}

	public void clickOnSaveChangesButton() {
		driver.findElement(saveChangesButton).click();
	}

	public void clickOnChangePwdButton() {
		driver.findElement(changePwdButton).click();
	}
	
	public void EnterOldPassword(String text) {
		driver.findElement(oldPasswordField).sendKeys(text);
		System.out.println("oldPasswordField Successfully Entered");
	}
	public void EnternewPassword(String text) {
		driver.findElement(newPasswordField).sendKeys(text);
		System.out.println("newPasswordField Successfully Entered");
	}
	public void reTypePwdField(String text) {
		driver.findElement(reTypePwdField).sendKeys(text);
		System.out.println("reTypePwdField Successfully Entered");
	}
	public void EnterStateField(String text) {
		driver.findElement(stateField).sendKeys(text);
		System.out.println("stateField Successfully Entered");
	}
	public void EnterCityField(String text) {
		driver.findElement(cityField).sendKeys(text);
		System.out.println("cityField Successfully Entered");
	}
	public void EnterAddress1Field(String text) {
		driver.findElement(address1Field).sendKeys(text);
		System.out.println("address1Field Successfully Entered");
	}
	public void EnterAddress2Field(String text) {
		driver.findElement(address2Field).sendKeys(text);
		System.out.println("address2Field Successfully Entered");
	}
	public void clickOnInnerChangePwdButton() {
		driver.findElement(innerChangePwdButton).click();
	}
	public void clickOnAddressSaveChangesField() {
		driver.findElement(addressSaveChangesField).click();
	}
	public void clickOnChangePwdCancelButton() {
		driver.findElement(changePwdCancelButton).click();
	}
	
	public void VerifyEmailFieldIsPresent() {
		if (driver.findElement(emailField).isDisplayed()) {
			System.out.println("emailField is Present");
		} else {
			System.out.println("emailField is Absent");
		}
	}
	public void VerifyAddressLabelIsPresent() {
		if (driver.findElement(addressLabel).isDisplayed()) {
			System.out.println("addressLabel is Present");
		} else {
			System.out.println("addressLabel is Absent");
		}
	}
	public void VerifyEditProfileSuccessMessage() {
		if (driver.findElement(editProfileSuccessMessage).isDisplayed()) {
			System.out.println("editProfileSuccessMessage is Present");
		} else {
			System.out.println("editProfileSuccessMessage is Absent");
		}
	}
	public void VerifyEmailFieldIsNotEditable() {
		assertTrue(!driver.findElement(emailField).isEnabled());
		System.out.println("emailField is not Editable");
	}

	public void VerifyPhoneNemberFieldIsNotEditable() {
		assertTrue(!driver.findElement(phoneNumberField).isEnabled());
		System.out.println("phoneNumberField is not Editable");
	}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
	}

}
