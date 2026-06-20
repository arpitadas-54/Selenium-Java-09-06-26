package com.LocatorsTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGmethods {
	WebDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();	
	}
	
	@Test
	public void LocatorsTest() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.contains("Logged In Successfully")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
}
