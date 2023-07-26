package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		//Invoking Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Verify Title of Page
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);

		//Clicking on Python for Automation link
		driver.findElement(By.linkText("Python for Automation")).click();

		//Verify url of current page
		String urlOfPage = driver.getCurrentUrl();
		System.out.println(urlOfPage);

		//Verify current page source
		String pageSrc = driver.getPageSource();
		System.out.println(pageSrc);

		driver.close();
	}
}
