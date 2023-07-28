package com.training.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {

	public static void main(String[] args) {
		
		//Invoking Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		
		//Creating Object instance of Actions class
		Actions act = new Actions(driver);
		
		//Locating web element for Right Click Me button
		WebElement rightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Handling Right click action
		act.moveToElement(rightClickButton).contextClick().perform();
		
		//Locating web element for Copy button and performing action
		WebElement copyButton = driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
		copyButton.click();
		
		driver.quit();
	}

}
