package com.framework.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.utilities.BrowserFacctory;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.framework.pages.BaseClass;
import com.framework.pages.LoginPage;


public class LoginTestCRM extends BaseClass{

	@Test
	public void loginApp() {
		
		logger=report.createTest("Login to CRM");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Application started");
		loginPage.loginToCRMApplication(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login successfully.");
	}


}
