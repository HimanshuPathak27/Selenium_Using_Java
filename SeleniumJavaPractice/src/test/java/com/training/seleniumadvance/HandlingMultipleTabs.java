package com.training.seleniumadvance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleTabs {
	public static void main(String[] args) throws InterruptedException {
		//Set system property for firefox driver
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

		//Create the instance of firefox driver
		WebDriver driver = new FirefoxDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);
		System.out.println("Parent Browser Tab is opened");

		System.out.println();

		//Locating Web Element for New Browser Tab button
		WebElement newBrowserTabBtn = driver.findElement(By.name("145newbrowsertab234"));
		newBrowserTabBtn.click();
		System.out.println("Child Browser tab is opened");

		System.out.println();

		//Getting Tabs ID
		Set<String> tabsId = driver.getWindowHandles();

		Iterator<String> iterator =  tabsId.iterator();

		//Storing/Assigning windowsID to respective browser tabs
		String parentBrowserTab = iterator.next();
		String childBrowserTab = iterator.next();

		System.out.println("Parent Browser Tab ID is: "+ parentBrowserTab);
		System.out.println("Child Browser Tab ID is: "+ childBrowserTab);

		//Switching control to child browser tab
		driver.switchTo().window(childBrowserTab);

		//Maximize child browser tab
		driver.manage().window().maximize();

		Thread.sleep(2000);

		//Clicking on Python for automation
		WebElement pyForAutomation = driver.findElement(By.linkText("Python for Automation"));
		pyForAutomation.click();

		//Close the child browser tab
		driver.close();

		//Switching control to parent browser tab
		driver.switchTo().window(parentBrowserTab);

		//Click on home link
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		homeLink.click();

		//Close the browser
		driver.quit();
	}
}
