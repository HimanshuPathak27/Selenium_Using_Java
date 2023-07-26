package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

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
		WebElement testNGCheckBox = driver.findElement(By.id("vfb-20-2"));

		//Handling Submit Button
		if(testNGCheckBox.isDisplayed()) {
			if(testNGCheckBox.isEnabled()) {
				if(testNGCheckBox.isSelected()) {
					System.out.println("TestNG check box is pre selected");
				}
				else {
					testNGCheckBox.click();
				}
				
			}
			else {
				System.out.println("TestNG check box is not enabled");
			}
		}
		else {
			System.out.println("TestNG check box is not displayed");
		}
		
		if(testNGCheckBox.isSelected()) {
			System.out.println("TestNG check box is selected");
			testNGCheckBox.click();
			System.out.println("TestNG check box is deselected");
		}
		else {
			System.out.println("TestNG check box is not selected");
		}
		
		driver.close();

	}
}
