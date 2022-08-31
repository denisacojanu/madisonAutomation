package com.data;

import com.utils.FieldGenerators;
import com.utils.FieldGenerators.Mode;
import com.utils.constants.ConfigConstants;
import com.utils.constants.Constants;

public class CustomerLoginModel {

	private String userName;
	private String password;

	public CustomerLoginModel(String invalid) {
		try {
			setUserName();
			setPassword();
			setPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CustomerLoginModel() {
		this.setUserName(Constants.USER_EMAIL);
		this.setPassword(Constants.USER_PASS);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserName() throws Exception {
		this.userName = "aut_" + FieldGenerators.generateRandomString(12, Mode.ALPHANUMERIC) + "@"
				+ ConfigConstants.WEB_MAIL;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword() throws Exception {
		this.password = FieldGenerators.generateRandomString(13, Mode.ALPHANUMERIC) + "q1";
	}

	@Override
	public String toString() {
		return "CustomerLoginModel [userName=" + userName + ", password=" + password + "]";
	}
}
