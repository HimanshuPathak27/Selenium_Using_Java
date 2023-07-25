package com.training.invocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		//Invoke MS Edge Browser
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Closing the driver
		driver.close();
	}
}
