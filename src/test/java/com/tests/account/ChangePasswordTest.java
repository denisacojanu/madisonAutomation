package com.tests.account;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.AccountSteps;
import com.steps.LoginSteps;
import com.tests.BaseTest;
import com.tools.data.fronted.CustomerLoginModel;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class ChangePasswordTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;
	
	@Steps
	public AccountSteps accountSteps;

	private CustomerLoginModel validLoginData = new CustomerLoginModel();

	@Test
	public void changePasswordTest() {
		loginSteps.doLogin(validLoginData.getUserName(), validLoginData.getPassword());
		loginSteps.verifyUsernameMessage("Cojanu Denisa");
		accountSteps.changePassword();
	}

}
