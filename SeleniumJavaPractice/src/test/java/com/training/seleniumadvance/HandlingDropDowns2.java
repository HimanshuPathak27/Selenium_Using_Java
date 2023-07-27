package com.training.seleniumadvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns2 {
	
	public static void main(String[] args) {
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Launch URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating country dropdown
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));

		//Creating object instance of select class
		Select dropdown = new Select(countryDropDown);

		List<WebElement> values = dropdown.getOptions();
		int countOfValues = values.size();
		System.out.println(countOfValues);


		for(WebElement value : values) {
				System.out.println(value.getText());
				if(value.getText().equals("India")) {
					value.click();
				}
		}
		
	}
}
