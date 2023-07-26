package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		//Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating Submit button
		WebElement submitBtn = driver.findElement(By.id("vfb-4"));

		//Handling Submit Button
		if(submitBtn.isDisplayed()) {
			if(submitBtn.isEnabled()) {
				submitBtn.click();
			}
			else {
				System.out.println("Submit Button is not enabled");
			}
		}
		else {
			System.out.println("Submit Button is not displayed");
		}

		driver.close();

	}
}
