package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({

		RegisterSuite.class,
		LoginSuite.class, 
		SearchSuite.class,
		ChangedPasswordSuite.class

})

@RunWith(Suite.class)
public class RegressionSuite {

}