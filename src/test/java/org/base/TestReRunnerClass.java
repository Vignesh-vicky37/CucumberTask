package org.base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Failed Scenario\\failed.txt",
				 glue="org.stepdefinition",
				 monochrome=true)
public class TestReRunnerClass {

	
	
}
