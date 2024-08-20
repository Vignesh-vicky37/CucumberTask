package org.stepdefinition;

import org.base.BaseClass;
import org.pom.DemoQaRegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQaFandLname extends BaseClass {

	DemoQaRegisterPage dqrp;

	@Given("user opening web browser and maximizing it")
	public void user_opening_web_browser_and_maximizing_it() {
		launchBrowser("edge");
		windowMaximize();
	}

	@When("user launching web application")
	public void user_launching_web_application() {
		launchUrl("https://demoqa.com/register");
		implicitWait(20);
	}

	@When("user entering {string} in first name text box")
	public void user_entering_in_first_name_text_box(String firstName) {
		dqrp = new DemoQaRegisterPage();
		passTextTOWebElement(dqrp.getFirstNameBox(), firstName);
	}

	@When("user entering {string} in last name text box")
	public void user_entering_in_last_name_text_box(String surName) {
		passTextTOWebElement(dqrp.getLastNameBox(), surName);
	}

	@Then("user closing the web application and browser")
	public void user_closing_the_web_application_and_browser() {
		closeWebBrowser();
	}

}
