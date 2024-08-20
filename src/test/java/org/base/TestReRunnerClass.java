package org.base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Failed Scenario\\failed.txt",
				 glue="org.stepdefinition",
				 monochrome=true)
public class TestReRunnerClass {

	
	
}
