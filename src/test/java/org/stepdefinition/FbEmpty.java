package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbEmpty extends BaseClass {
	FbLoginPage fl;
	String expected = "The email address or mobile number you entered isn't connected to an account";

	@Given("User opening browser {string} and maximizing the window")
	public void userOpeningBrowserAndMaximizingTheWindow(String browserName) {
		launchBrowser(browserName);
		windowMaximize();
	}

	@When("user launching fb application")
	public void userLaunchingFbApplication() {
		launchUrl("https://www.facebook.com/");
		implicitWait(20);
	}

	@When("User entering email {string} to email field")
	public void userEnteringEmailToEmailField(String emailId) {
		fl = new FbLoginPage();
		passTextTOWebElement(fl.getEmailTxtBox(), emailId);
	}

	@When("User entering password {string} to password field")
	public void userEnteringPasswordToPasswordField(String passWord) {
		passTextTOWebElement(fl.getPassWordTxtBox(), passWord);
	}

	@When("User now clicking login button")
	public void userNowClickingLoginButton() {
		javaScriptClick(fl.getLoginBtn());
	}

	@Then("To validate whether user has redirected to error page")
	public void toValidateWhetherUserHasRedirectedToErrorPage() {
		Assert.assertTrue("User not present in error page....",
				getTextOfWebElement(fl.getErrorMsg()).contains(expected));
	}

	@Then("User now closing browser")
	public void userNowClosingBrowser() {
		closeWebBrowser();
	}

}
