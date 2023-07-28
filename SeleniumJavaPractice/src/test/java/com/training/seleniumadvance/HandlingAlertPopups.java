package com.training.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertPopups {

	public static void main(String[] args) {

		//Invoking Chrome Driver
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);

		//Handling Alert box button
		WebElement alertBoxButton =  driver.findElement(By.xpath("//button[normalize-space()='Alert Box']"));
		alertBoxButton.click();

		driver.switchTo().alert().accept();

		//Handling Confirm Alert box button
		WebElement confirmAlertBoxButton =  driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']"));
		confirmAlertBoxButton.click();
		driver.switchTo().alert().accept();

		confirmAlertBoxButton.click();
		driver.switchTo().alert().dismiss();


		//Handling Prompt Alert box button
		WebElement promptAlertBoxButton =  driver.findElement(By.xpath("//button[normalize-space()='Prompt Alert Box']"));
		promptAlertBoxButton.click();
		driver.switchTo().alert().sendKeys("Prompted Alert");
		driver.switchTo().alert().accept();
		
		driver.quit();
	}
}
