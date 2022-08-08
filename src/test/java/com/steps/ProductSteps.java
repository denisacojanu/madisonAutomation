package com.steps;

import com.pages.SearchResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private SearchResultsPage searchResultsPage;

    @Step
    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }
}
