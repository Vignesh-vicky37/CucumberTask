package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbDetailsLogin extends BaseClass {
	FbLoginPage f;

	@When("user entering email")
	public void userEnteringEmail() {
		f = new FbLoginPage();
		passTextTOWebElement(f.getEmailTxtBox(), "java@gmail.com");
	}

	@When("user entering password")
	public void userEnteringPassword() {
		passTextTOWebElement(f.getPassWordTxtBox(), "java@123");
	}

	@When("user click login")
	public void userClickLogin() {
		clickWebElement(f.getLoginBtn());
	}

	@Then("to validate user present in error page")
	public void toValidateUserPresentInErrorPage() {

		Assert.assertTrue("user not present in error page", f.getErrorMsg().getText()
				.contains("The password that you've entered is incorrect"));
	}

}
