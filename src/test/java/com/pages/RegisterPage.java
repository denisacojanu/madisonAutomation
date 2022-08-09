package com.pages;

import org.junit.Assert;

import com.utils.constants.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {
	@FindBy(id = "firstname")
	private WebElementFacade inputFirstName;
	@FindBy(id = "lastname")
	private WebElementFacade inputLastName;
	@FindBy(id = "email_address")
	private WebElementFacade inputEmailAddress;
	@FindBy(id = "password")
	private WebElementFacade inputPassword;
	@FindBy(id = "confirmation")
	private WebElementFacade inputConfirmPassword;
	@FindBy(id = "is_subscribed")
	private WebElementFacade newsletterCheckbox;
	@FindBy(css = ".button[title='Register']")
	private WebElementFacade registerButton;
	@FindBy(id = "advice-required-entry-firstname")
	private WebElementFacade firstNameRequiredField;
	
	public void inputFirstname(String firstname) {
		element(inputFirstName).waitUntilVisible();
		inputFirstName.sendKeys(firstname);
	}
	
	public void inputLastname(String lastname) {
		inputLastName.sendKeys(lastname);
	}
	
	public void inputEmailAddress(String email) {
		inputEmailAddress.sendKeys(email);
	}
	
	public void inputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void inputConfirmPassword(String password) {
		inputConfirmPassword.sendKeys(password);
	}
	
	public void clickNewsletterCheckbox() {
		newsletterCheckbox.click();
	}
	
	public void clickRegister() {
		registerButton.click();
	}
	
	public void verifyRequiredFirstName() {
		Assert.assertTrue("Failure: Required field message is not present!",
				firstNameRequiredField.getText().contains(Constants.REQUIRED_FIELD_MESSAGE));
	}

}
