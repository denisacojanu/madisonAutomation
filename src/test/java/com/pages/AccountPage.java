package com.pages;

import org.junit.Assert;

import com.utils.constants.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends AbstractPage {

	@FindBy(css = "p.hello strong")
	private WebElementFacade welcomeText;

	@FindBy(css = ".my-account li.success-msg")
	private WebElementFacade successMessage;

	public void verifyWelcomeMessage(String userName) {
		welcomeText.shouldContainOnlyText("Hello, " + userName + "!");
	}

	public void verifySuccessRegistrationMessage() {
		waitForPageToLoad();
		successMessage.waitUntilVisible();
		Assert.assertTrue("Failure: Register success message was not found!",
				successMessage.getText().contains(Constants.REGISTER_SUCCESS_MESSAGE));
	}

}
