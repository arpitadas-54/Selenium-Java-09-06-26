package com.LocatorsTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameTestDmoExample {
		
		@Test
		public void NameLocator() {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println("title");
			//Locator Name
			driver.findElement(By.name("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
		}



}
