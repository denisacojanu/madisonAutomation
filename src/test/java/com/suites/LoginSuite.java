package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.login.InvalidLoginTest;
import com.tests.login.ValidLoginTest;

@SuiteClasses({
	
	ValidLoginTest.class,
	InvalidLoginTest.class

})

@RunWith(Suite.class)
public class LoginSuite {

}