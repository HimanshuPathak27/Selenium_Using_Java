package com.training.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragDrop {

	public static void main(String[] args) {
		
		//Invoking Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://demoqa.com/droppable";
		driver.get(url);
		
		//Creating Object instance of Actions class
		Actions act = new Actions(driver);
		
		//Locating web element for Drag and Drop button
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		//Handling Drag and Drop action
		act.dragAndDrop(draggable, droppable).perform();
		
		driver.quit();
	}

}
