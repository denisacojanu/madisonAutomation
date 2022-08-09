package com.steps;

import com.pages.RegisterPage;
import com.tools.data.fronted.CustomerRegistrationModel;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private RegisterPage registerPage; 
	
	@Title("Fill Create Customer Form")
	@Step
	public void fillCustomerRegisterForm(CustomerRegistrationModel registrationModel) {
		inputFirstname(registrationModel.getFirstname());
		inputLastname(registrationModel.getLastname());
		inputEmailAddress(registrationModel.getEmail());
		inputPassword(registrationModel.getPassword());
		inputConfirmationPassword(registrationModel.getPassword());
		
		clickNewsletterCheckbox();
		clickRegisterButton();
	}
	
	@Step
	public void inputFirstname(String firstname) {
		registerPage.inputFirstname(firstname);
	}
	
	@Step
	public void inputLastname(String lastname) {
		registerPage.inputLastname(lastname);
	}
	
	@Step
	public void inputEmailAddress(String emailAddress) {
		registerPage.inputEmailAddress(emailAddress);
	}
	
	@Step
	public void inputPassword(String password) {
		registerPage.inputPassword(password);
	}
	
	@Step
	public void inputConfirmationPassword(String password) {
		registerPage.inputConfirmPassword(password);
	}
	
	@Step
	public void clickNewsletterCheckbox() {
		registerPage.clickNewsletterCheckbox();
	}
	
	@Step
	public void clickRegisterButton() {
		registerPage.clickRegister();
	}
	
	@Step
	public void verifyRequiredFirstName() {
		registerPage.verifyRequiredFirstName();
	}
}
