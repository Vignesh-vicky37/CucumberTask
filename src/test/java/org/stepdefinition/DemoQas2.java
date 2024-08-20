package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.DemoQaRegisterPage;

import io.cucumber.java.en.When;

public class DemoQas2 extends BaseClass {
	String bookName = "CUCUMBERTASK";
	String sheetName = "DemoQa";
	DemoQaRegisterPage d;

	@When("User giving input in firstname text box")
	public void userGivingInputInFirstnameTextBox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getFirstNameBox(), readParticularcell(bookName, sheetName, 2, 1));
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getFirstNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 2, 1)));
	}

	@When("User giving input in lastname text box")
	public void userGivingInputInLastnameTextBox() throws IOException {
		passTextTOWebElement(d.getLastNameBox(), readParticularcell(bookName, sheetName, 3, 1));
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getLastNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 3, 1)));
	}
	@When("User giving input in username text box")
	public void userGivingInputInUsernameTextBox() throws IOException {
		passTextTOWebElement(d.getUserNameBox(), readParticularcell(bookName, sheetName, 4, 1));
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getUserNameBox())
				.contentEquals(readParticularcell(bookName, sheetName, 4, 1)));
	}
	@When("User giving input in password text box")
	public void userGivingInputInPasswordTextBox() throws IOException {
		passTextTOWebElement(d.getPassWordBox(), readParticularcell(bookName, sheetName, 5, 1));
		Assert.assertTrue("Input not given / matching......", getAttributeOfWebElement(d.getPassWordBox())
				.contentEquals(readParticularcell(bookName, sheetName, 5, 1)));
	}
	@When("User clicking im not robot")
	public void userClickingImNotRobot() throws InterruptedException {
		threadSleep(5000);
	}
	@When("User then clciking register button")
	public void userThenClcikingRegisterButton() {
		clickWebElement(d.getRegisterBtn());
	}

}
