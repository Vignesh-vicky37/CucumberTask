package org.base;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.GenerateJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FBloginDetails.feature",
				 glue = "org.stepdefinition",
				 monochrome = true, dryRun = false,
				 strict = true,
				 snippets = SnippetType.CAMELCASE,
//				 tags= {"@fbinva"},
				 plugin ={
						 "junit:target\\Junit Report\\JunitReport.xml",
						 "json:target\\Json Report\\JsonReport.json", 
						 "html:target\\Html report",
						 "rerun:src\\test\\resources\\Failed Scenario\\failed.txt"
						 })
public class TestRunner {

	@AfterClass
	public static void toGenarateJvmReport() {

		GenerateJvmReport.report("C:\\Users\\JUJU\\eclipse-workspace\\CucumberTask\\target\\Json Report\\JsonReport.json");
			
	}

}
