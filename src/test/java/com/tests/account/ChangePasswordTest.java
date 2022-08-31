package com.tests.account;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.data.CustomerLoginModel;
import com.steps.AccountSteps;
import com.steps.HomePageSteps;
import com.steps.LoginSteps;
import com.tests.BaseTest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ChangePasswordTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public AccountSteps accountSteps;
	@Steps
	public HomePageSteps homepageSteps;

	private CustomerLoginModel validLoginData = new CustomerLoginModel();
	
	@Test
	public void changePasswordTest() {
		homepageSteps.navigateToHomepage();
		homepageSteps.navigateToLogin();
		loginSteps.doLogin(validLoginData.getUserName(), validLoginData.getPassword());
		loginSteps.verifyUsernameMessage("Cojanu Denisa");
		accountSteps.changePassword();
	}

}
