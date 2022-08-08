package com.tests;

import org.junit.Test;

import com.steps.LoginSteps;
import com.utils.Constants;

import net.thucydides.core.annotations.Steps;

public class CartTest extends BaseTest {
@Steps
public LoginSteps loginSteps;

    @Test
    public void addProductToCart() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");
    }

    @Test
    public void verifyPricesTest() {
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");

        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");

//        navigare la cos

        cartSteps.checkCartSubtotalIsCorrect();
        cartSteps.checkCartGrandTotalIsCorrect();
    }
}
