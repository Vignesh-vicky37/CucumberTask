package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.DemoQaRegisterPage;

import io.cucumber.java.en.When;

public class DemoQaExcel extends BaseClass {
	DemoQaRegisterPage d;
	String bookName = "CUCUMBERTASK";
	String sheetName = "DemoQa";

	@When("Users clicking new user button")
	public void usersClickingNewUserButton() {
		d = new DemoQaRegisterPage();
		clickWebElement(d.getNewUserBtn());
	}

	@When("Users entering in firstname text box")
	public void usersEnteringInFirstnameTextBox() throws IOException {
		passTextTOWebElement(d.getFirstNameBox(), readParticularcell(bookName, sheetName, 2, 1));
	}

	@When("Users entering in lastname text box")
	public void usersEnteringInLastnameTextBox() throws IOException {
		passTextTOWebElement(d.getLastNameBox(), readParticularcell(bookName, sheetName, 3, 1));
	}

	@When("Users entering in username text box")
	public void usersEnteringInUsernameTextBox() throws IOException {
		passTextTOWebElement(d.getUserNameBox(), readParticularcell(bookName, sheetName, 4, 1));
	}

	@When("Users entering in password text box")
	public void usersEnteringInPasswordTextBox() throws IOException {
		passTextTOWebElement(d.getPassWordBox(), readParticularcell(bookName, sheetName, 5, 1));
	}

	@When("Users clicking checkbox im not robot")
	public void usersClickingCheckboxImNotRobot() throws InterruptedException {
		threadSleep(25000);
	}

	@When("Users clciking register button")
	public void usersClcikingRegisterButton() throws IOException {
		takeSS("Demoqareg_1");
		clickWebElement(d.getRegisterBtn());
	}

	@When("users entering registered in username textbox")
	public void usersEnteringRegisteredInUsernameTextbox() throws IOException {
		d = new DemoQaRegisterPage();
		passTextTOWebElement(d.getUserNameBox(), readParticularcell(bookName, sheetName, 4, 1));
	}

	@When("users entering registered in password text box")
	public void usersEnteringRegisteredInPasswordTextBox() throws IOException {
		passTextTOWebElement(d.getPassWordBox(), readParticularcell(bookName, sheetName, 5, 1));
	}

	@When("Users clicking login button in demoqa login page")
	public void usersClickingLoginButtonInDemoqaLoginPage() {
		clickWebElement(d.getLoginBtn());
	}

}
