
package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.DemoQaRegisterPage;

import io.cucumber.java.en.When;

public class DemoQaReg extends BaseClass {

	DemoQaRegisterPage d;

	@When("User clicking new user button")
	public void userClickingNewUserButton() {
		d = new DemoQaRegisterPage();
		clickWebElement(d.getNewUserBtn());
	}

	@When("User entering {string} in firstname text box")
	public void userEnteringInFirstnameTextBox(String firstName) {
		passTextTOWebElement(d.getFirstNameBox(), firstName);
	}

	@When("User entering {string} in lastname text box")
	public void userEnteringInLastnameTextBox(String lastName) {
		passTextTOWebElement(d.getLastNameBox(), lastName);
	}

	@When("User entering {string} in username text box")
	public void userEnteringInUsernameTextBox(String userName) {
		passTextTOWebElement(d.getUserNameBox(), userName);
	}

	@When("User entering {string} in password text box")
	public void userEnteringInPasswordTextBox(String passWord) {
		passTextTOWebElement(d.getPassWordBox(), passWord);
	}

	@When("User clicking checkbox im not robot")
	public void userClickingCheckboxImNotRobot() throws InterruptedException {
		threadSleep(15000);
	}

	@When("User clciking register button")
	public void userClcikingRegisterButton() throws IOException {
		takeSS("Demoqareg");
		clickWebElement(d.getRegisterBtn());
	}

	@When("User entering {string} in firstname box")
	public void userEnteringInFirstnameBox(String firstName) {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getFirstNameBox(), firstName);

	}

	@When("User entering {string} in lastname box")
	public void userEnteringInLastnameBox(String lastName) {

		passTextTOWebElement(d.getLastNameBox(), lastName);
	}

	@When("User entering {string} in username box")
	public void userEnteringInUsernameBox(String userName) {

		passTextTOWebElement(d.getUserNameBox(), userName);
	}

	@When("User entering {string} in password box")
	public void userEnteringInPasswordBox(String passWord) {

		passTextTOWebElement(d.getPassWordBox(), passWord);

	}

	@When("user entering registered {string} in username textbox")
	public void userEnteringRegisteredInUsernameTextbox(String userName) {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getUserNameBox(), userName);
	}

	@When("user entering registered {string} in password text box")
	public void userEnteringRegisteredInPasswordTextBox(String passWord) {
		passTextTOWebElement(d.getPassWordBox(), passWord);
	}

	@When("User clicking login button in demoqa login page")
	public void userClickingLoginButtonInDemoqaLoginPage() {

		clickWebElement(d.getLoginBtn());
	}
}
