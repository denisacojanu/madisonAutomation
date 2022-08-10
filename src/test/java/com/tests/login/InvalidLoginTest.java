package com.tests.login;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.HomePageSteps;
import com.steps.LoginSteps;
import com.tests.BaseTest;
import com.tools.data.fronted.CustomerLoginModel;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class InvalidLoginTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public HomePageSteps homePageSteps;

	private CustomerLoginModel invalidLoginData = new CustomerLoginModel("invalid");
	
	@Test
	public void loginWithInvalidCredentialsTest() {
		homePageSteps.navigateToHomepage();
		homePageSteps.navigateToLogin();
		loginSteps.setCredentials(invalidLoginData.getUserName(), invalidLoginData.getPassword());
		loginSteps.clickLogin();
	}
}
