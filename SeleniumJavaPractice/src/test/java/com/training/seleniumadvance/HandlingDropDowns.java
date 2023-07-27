package com.training.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {
	
	public static void main(String[] args) {
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();

		//Loading URL
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		//Locating country dropdown
		WebElement countryDrpDwn = driver.findElement(By.id("vfb-13-country"));

		//Creating object instance for select class
		Select countryDD = new Select(countryDrpDwn);

		if(countryDrpDwn.isDisplayed()) {
			System.out.println("Country dropdown is Displayed");

			if(countryDrpDwn.isEnabled()) {
				System.out.println("Country dropdown is Enabled");

				//Declaring variables for selecting countries from dropdown
				String country1 = "Egypt";
				String country2 = "Australia";
				int indexOfArgentina = 7;

				//selecting Egypt by Visible Text
				countryDD.selectByVisibleText(country1);

				//Selecting Australia by Value
				countryDD.selectByValue(country2);

				//Selecting Argentina by Index
				countryDD.selectByIndex(indexOfArgentina);

			}
			else {
				System.out.println("Country dropdown is Disabled");
			}
		}
		else {
			System.out.println("Country dropdown is Not Displayed");
		}
		
		//Closing the browser
		driver.quit();
	}
}
