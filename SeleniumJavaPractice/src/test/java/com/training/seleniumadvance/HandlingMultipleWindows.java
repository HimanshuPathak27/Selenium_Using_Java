package com.training.seleniumadvance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		//Invoking firefox driver
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);

		//Locating Web Element for New Browser Window button
		WebElement newBrowserWindowBtn = driver.findElement(By.name("newbrowserwindow123"));
		newBrowserWindowBtn.click();

		//Getting window's ID
		Set<String> windowsId = driver.getWindowHandles();

		Iterator<String> iterator =  windowsId.iterator();

		//Storing/Assigning windowsID to respective browser
		String parentBrowser = iterator.next();
		String childBrowser = iterator.next();

		System.out.println("Parent Browser ID is: "+ parentBrowser);
		System.out.println("Child Browser ID is: "+ childBrowser);

		//Switching control to child browser
		driver.switchTo().window(childBrowser);

		//Maximize child browser
		driver.manage().window().maximize();

		Thread.sleep(2000);

		//Clicking on Python for automation
		WebElement pyForAutomation = driver.findElement(By.linkText("Python for Automation"));
		pyForAutomation.click();

		//Close the child browser
		driver.close();

		//Switching control to parent browser
		driver.switchTo().window(parentBrowser);

		//Click on home link
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		homeLink.click();

		//Close the browser
		driver.quit();
	}
}
