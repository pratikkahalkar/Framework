package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(name="email") WebElement userName; 
	@FindBy(name="password") WebElement passWord;
	@FindBy(xpath = "//div[text()='Login']") WebElement loginBtn;

	public void loginToCRMApplication(String usernameApplication,String passwordApplication)
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userName.sendKeys(usernameApplication);
		passWord.sendKeys(passwordApplication);
		loginBtn.click();
	}
}

