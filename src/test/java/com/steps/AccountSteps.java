package com.steps;

import com.pages.AccountPage;
import com.utils.constants.Constants;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	private AccountPage accountPage;;

    @Step
    public void verifySuccessRegistrationMessage() {
    	accountPage.verifySuccessRegistrationMessage();
    }
    
    @Step
    public void inputCurrentPassword(String currentPassword) {
    	accountPage.inputCurrentPassword(currentPassword);
    }
    
    @Step
    public void inputNewtPassword(String newPassword) {
    	accountPage.inputNewPassword(newPassword);
    }
    
    @Step
    public void inputConfirmationPassword(String confirmationPassword) {
    	accountPage.inputConfirmationPassword(confirmationPassword);
    }
    
    @Step
    public void clickOnSave() {
    	accountPage.clickOnSave();
    }
    
    @Step
    public void clickOnChangePassword() {
    	accountPage.clickOnChangePassword();
    }
    
    @Step 
    public void changePassword() {
    	clickOnChangePassword();
    	inputCurrentPassword(Constants.USER_PASS);
    	inputNewtPassword(Constants.NEW_USER_PASS);
    	inputConfirmationPassword(Constants.NEW_USER_PASS);
    	clickOnSave();
    	verifyAccountInformationSuccessMessage();
    }
    
    @Step
    public void verifyAccountInformationSuccessMessage() {
    	accountPage.verifyAccountInformationSuccessMessage();
    }
}
