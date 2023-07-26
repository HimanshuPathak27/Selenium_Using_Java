package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {

	public static void main(String[] args) {

		//Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating First Name field
		WebElement firstName = driver.findElement(By.id("vfb-5"));

		//Handling First Name Textbox
		if(firstName.isDisplayed()) {
			if(firstName.isEnabled()) {
				firstName.sendKeys("Himanshu");
			}
			else {
				System.out.println("First Name text box is not enabled");
			}
		}
		else {
			System.out.println("First Name text box is not displayed");
		}

		firstName.clear();

		driver.close();
	}
}
