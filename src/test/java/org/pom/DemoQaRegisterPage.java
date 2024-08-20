package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaRegisterPage extends BaseClass {

	public DemoQaRegisterPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "firstname")
	private WebElement firstNameBox;

	@FindBy(id = "lastname")
	private WebElement lastNameBox;

	@FindBy(id = "userName")
	private WebElement userNameBox;

	@FindBy(id = "password")
	private WebElement passWordBox;

	@FindBy(id = "register")
	private WebElement registerBtn;

	@FindBy(id = "gotologin")
	private WebElement goToLoginBtn;

	@FindBy(id = "login")
	private WebElement loginBtn;

	@FindBy(xpath="//button[text()='New User']")
	private WebElement newUserBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getNewUserBtn() {
		return newUserBtn;
	}

	public WebElement getGoToLoginBtn() {
		return goToLoginBtn;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getLastNameBox() {
		return lastNameBox;
	}

	public WebElement getUserNameBox() {
		return userNameBox;
	}

	public WebElement getPassWordBox() {
		return passWordBox;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

}
