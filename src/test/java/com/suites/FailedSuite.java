package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.login.ValidLoginTest;
import com.tests.search.SearchProductGuestTest;

@SuiteClasses({
	
	SearchProductGuestTest.class,
	ValidLoginTest.class

})

@RunWith(Suite.class)
public class FailedSuite {

}