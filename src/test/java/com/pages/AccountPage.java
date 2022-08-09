package com.pages;

import org.junit.Assert;

import com.utils.constants.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends AbstractPage {

	@FindBy(css = "p.hello strong")
	private WebElementFacade welcomeText;

	@FindBy(css = ".my-account li.success-msg")
	private WebElementFacade successMessage;
	
	@FindBy(css = ".box-content a")
	private WebElementFacade changePassword;
	
	@FindBy(id = "current_password")
	private WebElementFacade inputCurrentPassword;
	
	@FindBy(id = "password")
	private WebElementFacade inputNewPassword;
	
	@FindBy(id = "confirmation")
	private WebElementFacade inputConfirmationPassword;
	
	@FindBy(css = ".buttons-set button")
	private WebElementFacade saveButton;
	
	@FindBy(css = "li.success-msg span")
	private WebElementFacade accountInformationSuccessMessage;

	public void verifyWelcomeMessage(String userName) {
		welcomeText.shouldContainOnlyText("Hello, " + userName + "!");
	}

	public void verifySuccessRegistrationMessage() {
		waitForPageToLoad();
		successMessage.waitUntilVisible();
		Assert.assertTrue("Failure: Register success message was not found!",
				successMessage.getText().contains(Constants.REGISTER_SUCCESS_MESSAGE));
	}
	
	public void inputCurrentPassword(String currentPassword) {
		element(inputCurrentPassword).waitUntilVisible();
		inputCurrentPassword.sendKeys(currentPassword);
	}
	
	public void inputNewPassword(String newPassword) {
		inputNewPassword.sendKeys(newPassword);
	}
	
	public void inputConfirmationPassword(String confirmationPassword) {
		inputConfirmationPassword.sendKeys(confirmationPassword);
	}
	
	public void clickOnSave() {
		saveButton.click();
	}
	
	public void clickOnChangePassword() {
		changePassword.click();
	}
	
	public void verifyAccountInformationSuccessMessage() {
		waitForPageToLoad();
		Assert.assertTrue("Failure: Account information message is not displayed",
				accountInformationSuccessMessage.getText().contains(Constants.ACCOUNT_INFORMATION_SUCCESS_MESSAGE));
	}

}
