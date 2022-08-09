package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.registration.InvalidCustomerRegistration;
import com.tests.registration.ValidCustomerRegistration;

@SuiteClasses({
	
	ValidCustomerRegistration.class,
	InvalidCustomerRegistration.class

})

@RunWith(Suite.class)
public class RegisterSuite {

}