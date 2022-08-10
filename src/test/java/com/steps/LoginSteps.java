package com.steps;

import com.pages.AccountPage;
import com.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private HomePageSteps homepageSteps;
	private LoginPage loginPage;
	private AccountPage accountPage;

	@Step
	public void setCredentials(String email, String pass) {
		loginPage.setEmailField(email);
		loginPage.setPasswordField(pass);
	}

	@Step
	public void clickLogin() {
		loginPage.clickLoginButton();
	}

	@Step
	public void verifyUsernameMessage(String userName) {
		accountPage.verifyWelcomeMessage(userName);
	}

	@Step
	public void doLogin(String email, String password) {
		homepageSteps.navigateToHomepage();
		homepageSteps.navigateToLogin();
		setCredentials(email, password);
		clickLogin();
	}
}
