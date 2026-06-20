//Write a program using Selenium WebDriver Count no. of links in Holland and Barrett application and print.
//TestNG Framework
package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTextDemo {
	WebDriver driver;
	int Total = 0;
	
	@BeforeTest
	public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.hollandandbarrett.com/");
	}
	@Test
	public void findElementBtId() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();	
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		Total = Total + links.size();
		
		System.out.println("Number of Links: "+linkCount);
		for(int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		
		
	}
	
}

