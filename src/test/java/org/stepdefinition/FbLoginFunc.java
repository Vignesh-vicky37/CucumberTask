package org.stepdefinition;

import org.base.BaseClass;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FbLoginFunc extends BaseClass {
	FbLoginPage flp;

	@Given("User opening browser and maximizing the window and launching fb application")
	public void user_opening_browser_and_maximizing_the_window_and_launching_fb_application() {

		launchBrowser("Edge");
		windowMaximize();
		launchUrl("https://www.facebook.com/");

	}

	@When("User entering email id and password in respective textbox")
	public void user_entering_email_id_and_password_in_respective_textbox() {
		
		flp = new FbLoginPage();
		passTextTOWebElement(flp.getEmailTxtBox(), "selenium@gmail.com");
		passTextTOWebElement(flp.getPassWordTxtBox(), "selenium@123");
	}

	@Then("validating username and password textbox whethere the input is entered correctly or not")
	public void validating_username_and_password_textbox_whethere_the_input_is_entered_correctly_or_not() {
		
		Assert.assertEquals("userName mismatch.....", "selenium@gmail.com",
				getAttributeOfWebElement(flp.getEmailTxtBox()));
		Assert.assertEquals("passWord mismatch.....", "selenium@123",
				getAttributeOfWebElement(flp.getPassWordTxtBox()));
	}

	@Then("user closing the browser")
	public void user_closing_the_browser() {

		closeWebBrowser();

	}

}
