package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingErrorMessage {

	public static void main(String[] args) {
		//Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating Registration form title
		WebElement regFormTitle = driver.findElement(By.xpath("//h3[normalize-space()='Register For Demo']"));

		String expRegFormTitle = "Register For Demo";

		//Handling Error Message
		if(regFormTitle.isDisplayed()) {
			String actRegFormTitle = regFormTitle.getText();
			if(actRegFormTitle.equals(expRegFormTitle)) {
				System.out.println("Expected and Actual titles of Registration form are same");
			}
			else {
				System.out.println("Expected and Actual titles of Registration form are not same");
			}
		}
		else {
			System.out.println("Registration form title is not displayed");
		}

		//Locating Submit button
		WebElement submitBtn = driver.findElement(By.id("vfb-4"));
		submitBtn.click();

		//Handling First Name Error Message
		WebElement firstNameError = driver.findElement(By.xpath("//label[@for='vfb-5'][normalize-space()='This field is required.']"));

		String expfirstNameError = "This field is required.";

		if(firstNameError.isDisplayed()) {
			String actfirstNameError = firstNameError.getText();
			if(actfirstNameError.equals(expfirstNameError)) {
				System.out.println("Expected and Actual error message are same");
			}
			else {
				System.out.println("Expected and Actual error message are not same");
			}
		}
		else {
			System.out.println("Error Message is not displayed");
		}

		driver.close();

	}
}
