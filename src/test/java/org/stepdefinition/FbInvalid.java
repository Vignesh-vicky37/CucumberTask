package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbInvalid extends BaseClass {
	String bookName = "CUCUMBERTASK";
	String sheetName = "FB";
	FbLoginPage fl;

	@When("user entering invalid id in email text box")
	public void userEnteringInvalidIdInEmailTextBox() throws Exception {
		fl = new FbLoginPage();
		passTextTOWebElement(fl.getEmailTxtBox(), readParticularcell(bookName, sheetName, 2, 1));
		System.out.println("hi there");
		System.out.println("1");
		System.out.println("2");
System.out.println("3");
	}

	@When("user entering invaild password in password text box")
	public void userEnteringInvaildPasswordInPasswordTextBox() throws IOException {

		passTextTOWebElement(fl.getPassWordTxtBox(), readParticularcell(bookName, sheetName, 3, 1));

	}

	@When("user clicking login btn")
	public void userClickingLoginBtn() {
		clickWebElement(fl.getEyeBallBtn());
		clickWebElement(fl.getLoginBtn());

	}

	@Then("validating whether user has redirected to error page")
	public void validatingWhetherUserHasRedirectedToErrorPage() throws IOException {
		Assert.assertTrue("User not present in error page....",
				getTextOfWebElement(fl.getErrorMsg()).contains(readParticularcell(bookName, sheetName, 4, 1)));
	}
}
