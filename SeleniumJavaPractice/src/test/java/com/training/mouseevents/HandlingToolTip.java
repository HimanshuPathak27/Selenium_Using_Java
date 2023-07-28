package com.training.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingToolTip {

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
		
		//Locating web element for search box
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		//Handling tool tip
		act.moveToElement(searchBox).perform();
		String toolTipText = searchBox.getAttribute("title");
		System.out.println(toolTipText);
		
		driver.quit();
	}

}
