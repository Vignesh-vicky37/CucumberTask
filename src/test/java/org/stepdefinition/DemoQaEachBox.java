package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.DemoQaRegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQaEachBox extends BaseClass{
	String bookName = "CUCUMBERTASK";
	String sheetName = "DemoQa";
	DemoQaRegisterPage d;
	
	@When("user passing text to first name text box")
	public void userPassingTextToFirstNameTextBox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getFirstNameBox(), readParticularcell(bookName, sheetName, 2, 1));
		
	}

	@Then("to validate first name whether box contains input given by the user")
	public void toValidateFirstNameWhetherBoxContainsInputGivenByTheUser() throws IOException {
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getFirstNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 2, 1)));
	}

	@When("user passing text to last name text box")
	public void userPassingTextToLastNameTextBox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getLastNameBox(), readParticularcell(bookName, sheetName, 3, 1));
	}

	@Then("to validate last name whether box contains input given by the user")
	public void toValidateLastNameWhetherBoxContainsInputGivenByTheUser() throws IOException {
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getLastNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 3, 1)));
	}

	@When("user passing text to user name text box")
	public void userPassingTextToUserNameTextBox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getUserNameBox(), readParticularcell(bookName, sheetName, 4, 1));
	}

	@Then("to validate user name whether box contains input given by the user")
	public void toValidateUserNameWhetherBoxContainsInputGivenByTheUser() throws IOException {
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getUserNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 4, 1)));
	}

	@When("user passing text to password text box")
	public void userPassingTextToPasswordTextBox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getPassWordBox(), readParticularcell(bookName, sheetName, 5, 1));
	}

	@Then("to validate password whether box contains input given by the user")
	public void toValidatePasswordWhetherBoxContainsInputGivenByTheUser() throws IOException {
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getPassWordBox())
				.contentEquals(readParticularcell(bookName, sheetName, 5, 1)));
	}

}
