package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.search.SearchProductGuestTest;
import com.tests.search.SearchProductLoggedUserTest;

@SuiteClasses({
	
	SearchProductGuestTest.class,
	SearchProductLoggedUserTest.class

})

@RunWith(Suite.class)
public class SearchSuite {

}