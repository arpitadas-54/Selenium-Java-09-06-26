package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkTextDemo {
	WebDriver driver;
	int Total = 0;
	
	@BeforeTest
	public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	
	}
	@Test
	public void linkTest() throws Exception {
		driver.get("https://www.hollandandbarrett.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
	
		driver.findElement(By.partialLinkText("Vitamins")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		System.out.println("No.of links in Hollandandbarrett Application: " + linkCount);
		
		for(int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Vitamins";
			if (str == str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("(//a[conatins@type,'button')])[4]")).click();
			}
		}
		
		
	}
	
}

