package com.training.invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static void main(String[] args) {
		//Set system property for Firefox driver
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		//Create the instance of Firefox driver
		WebDriver driver = new FirefoxDriver();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		//Closing the driver
		driver.close();
	}
}
