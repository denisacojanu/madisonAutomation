package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.account.ChangePasswordTest;
import com.tests.account.InvalidCurrentPasswordTest;

@SuiteClasses({
	
	ChangePasswordTest.class,
	InvalidCurrentPasswordTest.class

})

@RunWith(Suite.class)
public class ChangedPasswordSuite {

}