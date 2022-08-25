package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends AbstractPage {

	@FindBy(css = ".skip-account .label")
	private WebElementFacade accountLink;
	@FindBy(css = "[title='Log In']")
	private WebElementFacade loginLink;
	@FindBy(css = "[title='Register']")
	private WebElementFacade registerLink;
	@FindBy(id = "search")
	private WebElementFacade searchField;
	@FindBy(css = "[title='Search']")
	private WebElementFacade searchIcon;
	@FindBy(id = "select-language")
	private WebElementFacade languageDropdown;

	public void clickAccountLink() {
		clickOn(accountLink);
	}

	public void clickLoginLink() {
		clickOn(loginLink);
	}
	
	public void clickRegisterLink() {
		clickOn(registerLink);
	}

	public void setSearchField(String keyword) {
		typeInto(searchField, keyword);
	}

	public void clickSearchIcon() {
		waitFor(searchField);
		clickOn(searchIcon);
	}
}
