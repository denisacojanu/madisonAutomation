package com.tools.data.fronted;

import com.utils.FieldGenerators;
import com.utils.FieldGenerators.Mode;
import com.utils.constants.ConfigConstants;

public class CustomerRegistrationModel {

	private String firstname;
	private String lastname;
	private String email;
	private String password;

	public CustomerRegistrationModel() {
		setFirstname(FieldGenerators.generateRandomString(8, Mode.ALPHA));
		setLastname(FieldGenerators.generateRandomString(8, Mode.ALPHA));
		setEmail("aut_" + FieldGenerators.generateRandomString(12, Mode.ALPHANUMERIC) + "@"
				+ ConfigConstants.WEB_MAIL);
		setPassword(FieldGenerators.generateRandomString(13, Mode.ALPHANUMERIC) + "q1");
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "CustomerRegistrationModel [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + "]";
	}

}
