package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.SearchResultsPage;

public class SearchSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void doSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductInResults(String productName){
        Assert.assertTrue(searchResultsPage.checkListForProduct(productName));
    }
}
