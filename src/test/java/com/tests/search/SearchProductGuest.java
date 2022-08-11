package com.tests.search;

import org.junit.Test;

import com.tests.BaseTest;

import net.thucydides.core.annotations.Steps;

import com.steps.HomePageSteps;

public class SearchProductGuest extends BaseTest {
	
	@Steps
	public HomePageSteps homepageSteps;


	private String searchItem = "necklace";

	@Test
	public void searchProductTest() {
		homepageSteps.navigateToHomepage();
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Ne");
	}

	@Test
	public void searchAnotherProductTest() {
		homepageSteps.navigateToHomepage();
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Ne");
	}
}
