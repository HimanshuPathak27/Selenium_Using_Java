package com.trainig.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);	

		//JavaScriptExecutor instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Send Keys
		WebElement firstName = driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','Himanshu')", firstName);

		//Click
		WebElement maleRadioBtn = driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();",maleRadioBtn);

		//Click
		WebElement checkBox = driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",checkBox);
	}
}
