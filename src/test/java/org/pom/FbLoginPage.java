package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {

	public FbLoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement emailTxtBox;

	@FindBy(id = "pass")
	private WebElement passWordTxtBox;

	@FindBy(xpath = "//div[@class='_9lsa']")
	private WebElement eyeBallBtn;

	@FindAll({ @FindBy(name = "login"),
			   @FindBy(xpath = "//button[@data-testid='royal_login_button']"),
			   @FindBy(xpath="//button[@value='1']"),
			   @FindBy(xpath="//button[@type='submit']")
			 })
	private WebElement loginBtn;

	@FindBy(xpath = "//div[@class='_9ay7']")
	private WebElement errorMsg;

	@FindBy(name = "firstname")
	private WebElement firstNameBox;

	@FindBy(name = "lastname")
	private WebElement surNameBox;

	@FindBy(name = "reg_email__")
	private WebElement mobAndEmailBox;

	@FindBy(id = "password_step_input")
	private WebElement newPassWordBox;

	@FindBy(id = "day")
	private WebElement dayDD;

	@FindBy(id = "month")
	private WebElement monthDD;

	@FindBy(id = "year")
	private WebElement yearDD;

	@FindBy(xpath = "//label[text()='Female']")
	private WebElement femaleRB;

	@FindBy(xpath = "//label[text()='Male']")
	private WebElement maleRB;

	@FindBy(name = "websubmit")
	private WebElement signUpBtn;
	
	@FindBy (xpath="//a[text()='Create new account']")
	private WebElement createNewAccBtn;
	
	@FindBy (xpath="//img[@class='_8idr img']")
	private WebElement closeBtn;

	@FindBy (name="reg_email_confirmation__")
	private WebElement confirmMailBox;
	
	
	public WebElement getConfirmMailBox() {
		return confirmMailBox;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getCreateNewAccBtn() {
		return createNewAccBtn;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPassWordTxtBox() {
		return passWordTxtBox;
	}

	public WebElement getEyeBallBtn() {
		return eyeBallBtn;
	}

	public WebElement getFirstNameBox() {
		return firstNameBox;
	}

	public WebElement getSurNameBox() {
		return surNameBox;
	}

	public WebElement getMobAndEmailBox() {
		return mobAndEmailBox;
	}

	public WebElement getNewPassWordBox() {
		return newPassWordBox;
	}

	public WebElement getDayDD() {
		return dayDD;
	}

	public WebElement getMonthDD() {
		return monthDD;
	}

	public WebElement getYearDD() {
		return yearDD;
	}

	public WebElement getFemaleRB() {
		return femaleRB;
	}

	public WebElement getMaleRB() {
		return maleRB;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
