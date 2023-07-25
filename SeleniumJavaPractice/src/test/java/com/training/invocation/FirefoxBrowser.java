package com.training.invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main(String[] args) {
		
		//Invoke Firefox Browser
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Closing the driver
		driver.close();
	}
}
