package com.tests.registration;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.AccountSteps;
import com.steps.LoginSteps;
import com.steps.RegisterSteps;
import com.tests.BaseTest;
import com.tools.data.fronted.CustomerRegistrationModel;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class InvalidCustomerRegistration extends BaseTest {

	@Steps
	public RegisterSteps registerSteps;
	@Steps
	public LoginSteps loginSteps;
	@Steps
	public AccountSteps accountSteps;

	@Test
	public void invalidCustomerRegistration() {

		loginSteps.navigateToHomepage();
		loginSteps.navigateToRegister();
		registerSteps.clickRegisterButton();
		registerSteps.verifyRequiredFirstName();
	}

}
