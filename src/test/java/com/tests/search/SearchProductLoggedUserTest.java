package com.tests.search;

import org.junit.Test;

import com.steps.LoginSteps;
import com.steps.SearchSteps;
import com.tests.BaseTest;
import com.steps.HomePageSteps;
import com.utils.constants.Constants;

import net.thucydides.core.annotations.Steps;

public class SearchProductLoggedUserTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public HomePageSteps homepageSteps;
    @Steps
    protected SearchSteps searchSteps;

	private String searchItem = "ankle boot";
	private String searchSecondItem = "alice";

	@Test
	public void searchProductTest() {
		homepageSteps.navigateToHomepage();
		homepageSteps.navigateToLogin();
		loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Ann Ankle Boot");
		searchSteps.doSearch(searchSecondItem);
		searchSteps.verifyProductInResults("Alice in wonderland");
	}
}
