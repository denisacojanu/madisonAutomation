package com.tests.login;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.LoginSteps;
import com.tests.BaseTest;
import com.tools.data.fronted.CustomerLoginModel;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ValidLoginTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;

	private CustomerLoginModel validLoginData = new CustomerLoginModel();

	@Test
	public void loginWithValidCredentialsTest() {
		loginSteps.navigateToHomepage();
		loginSteps.navigateToLogin();
		loginSteps.setCredentials(validLoginData.getUserName(), validLoginData.getPassword());
		loginSteps.clickLogin();
		loginSteps.verifyUsernameMessage("Cosmin Fast");
	}

}
