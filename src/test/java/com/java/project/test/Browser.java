package com.java.project.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.java.project.ui.TheLoginPage;
import com.java.project.ui.TheMainPage;

public class Browser {
	
	WebDriver driver;
	TheLoginPage theLoginPage;
	TheMainPage theMainPage;
	
	@BeforeMethod
	public void OpenTheBrowser() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		theLoginPage = new TheLoginPage(driver);
		theMainPage = new TheMainPage(driver);
	}

}
