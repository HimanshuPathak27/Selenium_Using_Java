package com.training.invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		//Closing the driver
		driver.close();
	}
}
