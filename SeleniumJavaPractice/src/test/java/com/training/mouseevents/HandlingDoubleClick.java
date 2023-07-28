package com.training.mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {

	public static void main(String[] args) {
		
		//Invoking Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Loading URL
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		
		//Creating Object instance of Actions class
		Actions act = new Actions(driver);
		
		//Locating web element for Double Click Me button
		WebElement dblClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		//Handling double click action
		act.moveToElement(dblClickButton).doubleClick().perform();
		
		//Fetching validation message
		WebElement dblClickMessage = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
		String dblClickMessageTxt = dblClickMessage.getText();
		System.out.println(dblClickMessageTxt);
		
		driver.quit();
	}

}
