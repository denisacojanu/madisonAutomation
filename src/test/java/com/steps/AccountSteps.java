package com.steps;

import com.pages.AccountPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private AccountPage accountPage;;

    @Step
    public void verifySuccessRegistrationMessage() {
    	accountPage.verifySuccessRegistrationMessage();
    }
}
