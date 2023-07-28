package com.training.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		
		//Invoking Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://nxtgenaiacademy.com/";
		driver.get(url);
		
		//Creating Object instance of Actions class
		Actions act = new Actions(driver);
		
		//Locating web element for Demo Sites and hovering on it
		WebElement demoSites = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]"));
		act.moveToElement(demoSites).perform();
		
		//Locating web element for Demo Sites and hovering on it
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		act.moveToElement(practiceAutomation).perform();
		
		//Locating web element for Registration Form and hovering on it
		WebElement regForm = driver.findElement(By.linkText("Demo Site – Registration Form"));
		act.moveToElement(regForm).click().perform();
		
		driver.quit();
	}

}
