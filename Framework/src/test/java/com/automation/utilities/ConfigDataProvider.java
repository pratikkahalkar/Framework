package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis =new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to read property file"+e.getMessage());
		}
	
	}
	public String getDataFromConfig(String keyToSearch) {
		
		return pro.getProperty(keyToSearch);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	
	public String getQAURL() {
		return pro.getProperty("qaUrl");
	}
}	
	
	

