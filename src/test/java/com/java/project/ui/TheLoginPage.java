package com.java.project.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheLoginPage {
	
	WebDriver driver;
	
	public TheLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameTextField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	public WebElement userNameTextField() {
		return userNameTextField;
	}
	
	public WebElement passwordTextField() {
		return passwordTextField;
	}

	
	public WebElement loginButton() {
		return loginButton;
	}
	
	public void loginApplication(String username, String password) {
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}


}
