package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) {

		//Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Click on Python For Automation link 
		driver.findElement(By.linkText("Python for Automation")).click();

		//Navigate to back page
		driver.navigate().back();
		
		//Navigate to forward page
		driver.navigate().forward();
		
		//Navigate to Home Page
		driver.findElement(By.linkText("Home")).click();
		
		//Refresh the Home Page
		driver.navigate().refresh();
		
		driver.close();
	}
}
