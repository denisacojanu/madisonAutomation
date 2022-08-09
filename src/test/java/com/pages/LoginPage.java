package com.pages;

import java.time.Duration;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends AbstractPage {

	@FindBy(id = "email")
	private WebElementFacade emailField;
	@FindBy(id = "pass")
	private WebElementFacade passwordField;
	@FindBy(id = "send2")
	private WebElementFacade loginButton;

	public void setEmailField(String email) {
		typeInto(emailField, email);
	}

	public void setPasswordField(String password) {
		waitFor(passwordField);
		withTimeoutOf(Duration.ofSeconds(30)).waitFor(passwordField);
		typeInto(passwordField, password);
	}

	public void clickLoginButton() {
		clickOn(loginButton);
	}
}
