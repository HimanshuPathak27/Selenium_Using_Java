package com.training.seleniumadvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	
	public static void main(String[] args) {
		//Invoking Browser
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Loading URL
		String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		driver.get(url);
		
		//Package List frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		driver.switchTo().defaultContent();
		
		//Package Frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ChromeOptions")).click();
		driver.switchTo().defaultContent();
		
		//Class Frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//a[normalize-space()='Help'])[1]")).click();
		driver.switchTo().defaultContent();
	}
}
