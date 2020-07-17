package com.sdet.testrunner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"resources/com/sdet/features"}, 
		glue={"com.sdet.loan.step"}, 
		monochrome=true, 
		// 1. pretty, 2. html 
		// 3. usage 4. json 
		// plugin={"pretty", "html:target/html-reports"},
		 plugin={"json:target/json-reports", "pretty"},
//		plugin={"usage"}, 
		tags={"@Smoke,@Sanity"}
)
public class CucumberTestRunner {
// this class shall not have any source code rather 
// it will act as a place holder 
}
