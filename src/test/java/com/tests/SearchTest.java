package com.tests;

import org.junit.Test;

import com.steps.LoginSteps;
import com.utils.constants.Constants;

import net.thucydides.core.annotations.Steps;

public class SearchTest extends BaseTest {

	@Steps
	public LoginSteps loginSteps;

	private String searchItem = "necklace";

	@Test
	public void searchProductTest() {
		loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Ne");
	}

	@Test
	public void searchAnotherProductTest() {
		loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Ne");
	}
}
