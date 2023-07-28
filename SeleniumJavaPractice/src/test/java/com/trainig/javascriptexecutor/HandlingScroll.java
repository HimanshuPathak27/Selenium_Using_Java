package com.trainig.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");	

		//JavaScriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Scroll down page by pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		//Returns position of page 
		System.out.println(js.executeScript("return window.pageYOffset;", ""));

		//Scroll down until a condition is met(Presence of element)
		WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();",flag);
		System.out.println(js.executeScript("return window.pageYOffset;", ""));

		//Scroll down till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));

		//Scroll up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
	}
}
