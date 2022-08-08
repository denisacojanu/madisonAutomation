package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.pages.CartPage;
import com.pages.ProductPage;

public class CartSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void clickAddToCart(){
        productPage.clickAddToCartButton();
    }
    @Step
    public void verifySuccessMessage(String productName){
        cartPage.verifySuccessMessage(productName);
    }

    @Step
    public void checkCartSubtotalIsCorrect(){
        Assert.assertTrue(cartPage.isSubtotalPriceCalculatedCorrectly());
    }

    @Step
    public void checkCartGrandTotalIsCorrect(){
        Assert.assertTrue(cartPage.isGrandTotalPriceCorrect());
    }
}
