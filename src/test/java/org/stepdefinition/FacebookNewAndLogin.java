package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookNewAndLogin extends BaseClass {
	FbLoginPage flp;
	String bookName = "CUCUMBERTASK";
	String sheetName = "FB";

	@When("User clicking create new account button in log in screen")
	public void user_clicking_create_new_account_button_in_log_in_screen() {
		flp = new FbLoginPage();
		clickWebElement(flp.getCreateNewAccBtn());
	}

	@Then("To validate whether user present in account creation page")
	public void to_validate_whether_user_present_in_account_creation_page() {

	}

	@When("User entering firstname {string}")
	public void user_entering_firstname(String firstName) {
		passTextTOWebElement(flp.getFirstNameBox(), firstName);
	}

	@When("User entering surname {string}")
	public void user_entering_surname(String lastName) {
		passTextTOWebElement(flp.getSurNameBox(), lastName);
	}

	@When("User entering mobile no or email address {string}")
	public void user_entering_mobile_no_or_email_address(String emailId) {
		passTextTOWebElement(flp.getMobAndEmailBox(), emailId);
		passTextTOWebElement(flp.getConfirmMailBox(), emailId);
	}

	@When("User entering new password {string}")
	public void user_entering_new_password(String newPassWord) {
		passTextTOWebElement(flp.getNewPassWordBox(), newPassWord);
	}

	@When("user selecting date of birth from day,month and year drop down")
	public void user_selecting_date_of_birth_from_day_month_and_year_drop_down() {
		String dayTxt = SelectGetOptionsTxt(flp.getDayDD(), 30);
		selectByVisibleText(dayTxt);
		String monthTxt = SelectGetOptionsTxt(flp.getMonthDD(), 6);
		selectByVisibleText(monthTxt);
		String yearTxt = SelectGetOptionsTxt(flp.getYearDD(), 31);
		selectByVisibleText(yearTxt);
	}

	@When("User selecting gender from radio button provided")
	public void user_selecting_gender_from_radio_button_provided() throws IOException {
		clickWebElement(flp.getMaleRB());
		takeSS("fb_ca");
	}

	@When("User clicks close icon")
	public void user_clicks_close_icon() {
		clickWebElement(flp.getCloseBtn());
	}

	@When("user entering registered username in username text box {string}")
	public void user_entering_registered_username_in_username_text_box(String userName) {
		flp = new FbLoginPage();
		passTextTOWebElement(flp.getEmailTxtBox(), userName);
	}

	@When("user entering registered password in password text box {string}")
	public void user_entering_registered_password_in_password_text_box(String passWord) throws IOException {
		passTextTOWebElement(flp.getPassWordTxtBox(), passWord);
		takeSS("fb_login");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		clickWebElement(flp.getLoginBtn());
	}

	@When("User clicking create new account button")
	public void user_clicking_create_new_account_button() {
		flp = new FbLoginPage();
		clickWebElement(flp.getCreateNewAccBtn());
	}

	@Then("To validate whether the user present in account creation page")
	public void to_validate_whether_the_user_present_in_account_creation_page() {

	}

	@When("User entering firstname")
	public void user_entering_firstname() throws IOException {
		passTextTOWebElement(flp.getFirstNameBox(), readParticularcell(bookName, sheetName, 5, 1));
	}

	@When("User entering surname")
	public void user_entering_surname() throws IOException {
		passTextTOWebElement(flp.getSurNameBox(), readParticularcell(bookName, sheetName, 6, 1));
	}

	@When("User entering mobile no or email address")
	public void user_entering_mobile_no_or_email_address() throws IOException {
		passTextTOWebElement(flp.getMobAndEmailBox(), readParticularcell(bookName, sheetName, 2, 1));
		passTextTOWebElement(flp.getConfirmMailBox(), readParticularcell(bookName, sheetName, 2, 1));
	}

	@When("User entering new password")
	public void user_entering_new_password() throws IOException {
		passTextTOWebElement(flp.getNewPassWordBox(), readParticularcell(bookName, sheetName, 3, 1));
	}

	@When("User entering username in username text box")
	public void user_entering_username_in_username_text_box() throws IOException {
		flp = new FbLoginPage();
		passTextTOWebElement(flp.getEmailTxtBox(), readParticularcell(bookName, sheetName, 2, 1));
	}

	@When("User entering password in password text box")
	public void user_entering_password_in_password_text_box() throws Exception {
		passTextTOWebElement(flp.getPassWordTxtBox(), readParticularcell(bookName, sheetName, 3, 1));
		takeSS("fb_login_excel");
	}

	@When("User now clicks login button")
	public void user_now_clicks_login_button() {
		clickWebElement(flp.getLoginBtn());
	}

}
