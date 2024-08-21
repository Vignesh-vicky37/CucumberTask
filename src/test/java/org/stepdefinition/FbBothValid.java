package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.pom.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbBothValid extends BaseClass {
	FbLoginPage f;

	@Given("User opening browser {string} and maximizing the window and launching fb application")
	public void userOpeningBrowserAndMaximizingTheWindowAndLaunchingFbApplication(String browserName) {
		launchBrowser(browserName);
		windowMaximize();
		launchUrl("https://www.facebook.com/");
		implicitWait(20);
	}

	@When("User entering valid id {string} in email text box")
	public void userEnteringValidIdInEmailTextBox(String emailTxt) {

		f = new FbLoginPage();
		passTextTOWebElement(f.getEmailTxtBox(), emailTxt);
	}

	@When("User entering valid password {string} in password text box")
	public void userEnteringValidPasswordInPasswordTextBox(String passWordTxt) {
		passTextTOWebElement(f.getPassWordTxtBox(), passWordTxt);
	}

	@When("User clicking login button")
	public void userClickingLoginButton() throws IOException {
		takeSS("fblogin");
		clickWebElement(f.getLoginBtn());
		
	}

	@Then("User closing the edge browser")
	public void userClosingTheEdgeBrowser() {
		closeWebBrowser();
	}

}
