package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFact extends BaseMethod {

	public PageFact() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Continue with Facebook']")
	private WebElement facebook;
	 @FindBy(id="email")
	 private WebElement user;
	 
	 @FindBy(id="pass")
	 private WebElement pass;
	 
	 @FindBy(name="login")
	 private WebElement login;
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFacebook() {
		return facebook;
	}

	
}

