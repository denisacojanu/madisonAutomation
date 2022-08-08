package com.tests;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.CartSteps;
import com.steps.ProductSteps;
import com.steps.SearchSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected CartSteps cartSteps;

    @Before
    public void maximize(){
        webDriver.manage().window().maximize();
    }

}
