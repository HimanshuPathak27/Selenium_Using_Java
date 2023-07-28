package com.training.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeybaord {

	public static void main(String[] args) {
		
		//Invoking Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://www.google.com/";
		driver.get(url);
		
		//Creating Object instance of Actions class
		Actions act = new Actions(driver);
		
		//Locating web element for Search bar
		WebElement searchBar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		//Performing series of actions using keyboard
		act.keyDown(searchBar,Keys.SHIFT)
			.sendKeys(searchBar,"selenium")
			.keyUp(searchBar,Keys.SHIFT)
			.sendKeys(searchBar, Keys.ENTER)
			.perform();
		
		driver.quit();
	}

}
