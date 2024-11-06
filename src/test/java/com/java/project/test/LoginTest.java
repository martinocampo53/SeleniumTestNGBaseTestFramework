package com.java.project.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends Browser{
	
	WebDriver driver;
	
	@Test
	public void TestRun() {
		
		theLoginPage.loginApplication("Admin", "admin123");
		theMainPage.recruitmentTabButton().click();
		theMainPage.addButton().click();;
		theMainPage.firstNameTextField().sendKeys("TestFirst");
		theMainPage.middleNameTextField().sendKeys("TestMiddle");
		theMainPage.lastNameTextField().sendKeys("TestLast");
		theMainPage.vacancyDropdown().click();
		theMainPage.payrollAdministratorDropdownOption().click();
	}

}

// trisha
