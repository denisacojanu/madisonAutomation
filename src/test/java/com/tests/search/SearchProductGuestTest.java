package com.tests.search;

import org.junit.Test;

import com.tests.BaseTest;

import net.thucydides.core.annotations.Steps;

import com.steps.HomePageSteps;
import com.steps.SearchSteps;

public class SearchProductGuestTest extends BaseTest {
	
	@Steps
	public HomePageSteps homepageSteps;
    @Steps
    protected SearchSteps searchSteps;


	private String searchItem = "necklace";
	private String searchSecondItem = "chelsea";

	@Test
	public void searchProductTest() {
		homepageSteps.navigateToHomepage();
		searchSteps.doSearch(searchItem);
		searchSteps.verifyProductInResults("Silver Desert Necklace");
	}

	@Test
	public void searchAnotherProductTest() {
		homepageSteps.navigateToHomepage();
		searchSteps.doSearch(searchSecondItem);
		searchSteps.verifyProductInResults("Chelsea Tee");
	}
}
