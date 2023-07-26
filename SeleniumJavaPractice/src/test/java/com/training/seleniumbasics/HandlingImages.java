package com.training.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImages {

	public static void main(String[] args) {
		//Invoke Chrome Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating Robot Image
		WebElement robotImage = driver.findElement(By.xpath("//img[@alt='Automation']"));

		//Handling Robot Image
		if(robotImage.isDisplayed()) {
			String robotImageText = robotImage.getAttribute("alt");
			System.out.println(robotImageText);
		}
		else {
			System.out.println("Robot Image is not displayed");
		}

		//Locating Logo Image
		WebElement logoImage = driver.findElement(By.xpath("//img[@alt='NxtGen A.I Academy']"));

		//Handling Logo Image
		if(logoImage.isDisplayed()) {
			String logoImageText = logoImage.getAttribute("alt");
			System.out.println(logoImageText);
			logoImage.click();
		}
		else {
			System.out.println("Logo Image is not displayed");
		}

		driver.close();

	}
}
