package com.steps;

import com.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private HomePage homePage;

	@Step
	public void navigateToHomepage() {
		homePage.open();
	}

	@Step
	public void navigateToLogin() {
		homePage.clickAccountLink();
		homePage.clickLoginLink();
	}

	@Step
	public void navigateToRegister() {
		homePage.clickAccountLink();
		homePage.clickRegisterLink();
	}

}
