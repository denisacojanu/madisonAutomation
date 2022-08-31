package com.tests.registration;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.data.CustomerRegistrationModel;
import com.steps.AccountSteps;
import com.steps.HomePageSteps;
import com.steps.LoginSteps;
import com.steps.RegisterSteps;
import com.tests.BaseTest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ValidCustomerRegistration extends BaseTest {

	@Steps
	public RegisterSteps registerSteps;
	@Steps
	public LoginSteps loginSteps;
	@Steps
	public AccountSteps accountSteps;
	@Steps
	public HomePageSteps homePageSteps;

	private CustomerRegistrationModel registrationModel = new CustomerRegistrationModel();

	@Test
	public void loginWithValidCredentialsTest() {
		
		homePageSteps.navigateToHomepage();
		homePageSteps.navigateToRegister();
		registerSteps.fillCustomerRegisterForm(registrationModel);
		accountSteps.verifySuccessRegistrationMessage();
	}

}
