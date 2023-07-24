package com.training.invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		//Set system property for Edge driver
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

		//Create the instance of Edge driver
		WebDriver driver = new EdgeDriver();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		//Closing the driver
		driver.close();
	}
}
