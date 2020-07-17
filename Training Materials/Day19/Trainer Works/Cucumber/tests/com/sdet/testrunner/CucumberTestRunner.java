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
		plugin={"pretty", "html:target/html-reports"}, 
		tags={"@Sanity"}
)
public class CucumberTestRunner {
// this class shall not have any source code rather 
// it will act as a place holder 
}
