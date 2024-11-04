package com.java.project.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheMainPage {

	WebDriver driver;
	
	public TheMainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][text()='Recruitment']")
	WebElement recruitmentTabButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addButton;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@name='middleName']")
	WebElement middleNameTextField;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameTextField;
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	WebElement vacancyDropdown;
	
	@FindBy(xpath = "//div[@role='option']/span[text()='Payroll Administrator']")
	WebElement payrollAdministratorDropdownOption;
	
	public WebElement recruitmentTabButton() {
		return recruitmentTabButton;
	}
	
	public WebElement addButton() {
		return addButton;
	}
	
	public WebElement firstNameTextField() {
		return firstNameTextField;
	}
	
	public WebElement middleNameTextField() {
		return middleNameTextField;
	}
	
	public WebElement lastNameTextField() {
		return lastNameTextField;
	}
	
	public WebElement vacancyDropdown() {
		return vacancyDropdown;
	}
	
	public WebElement payrollAdministratorDropdownOption() {
		return payrollAdministratorDropdownOption;
	}
}
