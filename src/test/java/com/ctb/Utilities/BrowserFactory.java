package com.ctb.Utilities;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {

	public static WebDriver getDriver(String browser) {
		String os = System.getProperty("os.name");
		System.out.println(os);
		return null;
	}
}
