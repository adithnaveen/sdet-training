package com.sdet.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"resources/com/sdet/features"}, 
		glue={"com.sdet.step"}, 
		monochrome=true, 
		plugin={"pretty"}
	)
public class TestRunner {
}
