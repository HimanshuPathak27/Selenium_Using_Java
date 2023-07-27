package com.training.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentications {
	public static void main(String[] args) {
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Normal URL
		//String url = "http://the-internet.herokuapp.com/basic_auth";

		//Authenticated URL
		String authenticatedUrl = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(authenticatedUrl);

		WebElement successMsg = driver.findElement(By.xpath("//p[contains(.,'Congratulations! You must have the proper credentials.')]"));
		if(successMsg.isDisplayed()) {
			System.out.println("Success Message is displayed");

			String actualSuccessMsg = successMsg.getText();
			String expectedSuccessMsg = "Congratulations! You must have the proper credentials.";
			if(actualSuccessMsg.equals(expectedSuccessMsg)) {
				System.out.println("Both Actual and Expected Success messages are same");
				System.out.println("Success Message text is: " + actualSuccessMsg);
			}
			else {
				System.out.println("Both Actual and Expected Success messages are not same");
				System.out.println("Actual Message text is: " + actualSuccessMsg);
				System.out.println("Expected Message text is: " + expectedSuccessMsg);
			}
		}
		else {
			System.out.println("Success Message is not displayed");
		}	
	}
}
