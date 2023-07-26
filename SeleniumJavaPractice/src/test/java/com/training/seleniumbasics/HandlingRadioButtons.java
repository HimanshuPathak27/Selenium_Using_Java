package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

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
		WebElement femaleRadioBtn = driver.findElement(By.id("vfb-31-2"));

		//Handling Submit Button
		if(femaleRadioBtn.isDisplayed()) {
			if(femaleRadioBtn.isEnabled()) {
				if(femaleRadioBtn.isSelected()) {
					System.out.println("Female Radio Button is pre selected");
				}
				else {
					femaleRadioBtn.click();
				}
				
			}
			else {
				System.out.println("Female Radio Button is not enabled");
			}
		}
		else {
			System.out.println("Female Radio Button is not displayed");
		}
		
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female Radio Button is selected");
		}
		else {
			System.out.println("Female Radio Button is not selected");
		}
		
		driver.close();

	}
}
