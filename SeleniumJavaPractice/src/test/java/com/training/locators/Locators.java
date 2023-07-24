package com.training.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		// Locator -1 : id
		//Locating 'First Name' field and filling value in it
		driver.findElement(By.id("vfb-5")).sendKeys("Himanshu");

		//Locating 'Last Name' field and filling value in it
		driver.findElement(By.id("vfb-7")).sendKeys("Pathak");

		// Locator -2 : name
		//Locating 'Street Address' field and filling value in it
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Gamma-2");

		//Locating 'Apt, Suite, Bldg Address' field and filling value in it
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("A-310, AVJ Heights");

		// Locator -3 : xpath
		//Locating 'City' field and filling value in it
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Greater Noida");

		//Locating 'Postal/ZIP code' field and filling value in it
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("201310");

		//Locator -4 : css selector
		//Locating 'State/Province/Region' field and filling value in it
		driver.findElement(By.cssSelector("#vfb-13-state")).sendKeys("Uttar Pradesh");

		//Locating 'Email' field and filling value in it
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("pathakhimanshu001@gmail.com");

		//Locator -5 : linkText
		//Clicking on Home link
		driver.findElement(By.linkText("Home")).click();

		//Locator -6 : partialLinkText
		//Clicking on Python for Automation link
		driver.findElement(By.partialLinkText("Python")).click();
		
	}
}
