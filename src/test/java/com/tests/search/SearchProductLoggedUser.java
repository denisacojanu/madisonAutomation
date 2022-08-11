package com.tests.search;

import org.junit.Test;

import com.steps.LoginSteps;
import com.tests.BaseTest;
import com.steps.HomePageSteps;
import com.utils.constants.Constants;

import net.thucydides.core.annotations.Steps;

public class SearchProductLoggedUser extends BaseTest {

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public HomePageSteps homepageSteps;

	private String searchItem = "necklace";

	@Test
	public void searchProductTest() {
		homepageSteps.navigateToHomepage();
		homepageSteps.navigateToLogin();
		loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Necklace");
	}

	@Test
	public void searchAnotherProductTest() {
		homepageSteps.navigateToHomepage();
		homepageSteps.navigateToLogin();
		loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Ne");
	}
}
