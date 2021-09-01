package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// Screenshots

	public static String captureScreenshots(WebDriver driver) {
		String screenshotpath = System.getProperty("user.dir") + "/Screenshots/FreeCRM_" + getCurrentDate() + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileHandler.copy(src, new File(screenshotpath));
			System.out.println("Screenshot Captured.");
		} catch (IOException e) {
			System.out.println("Unable to capture Screenshots." + e.getMessage());
		}
		return screenshotpath;
	}

	public static String getCurrentDate() {

		DateFormat currentDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return currentDateFormat.format(currentdate);
	}
}
