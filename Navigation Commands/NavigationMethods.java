package com.NavigationTestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	
	WebDriver driver;
	
	@Test(priority = 0)
	public void NavigateToDemo() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        driver.quit();
	}
	
    @Test(priority = 1)
    public void NavigateBackDemo() {
    	driver = new ChromeDriver();
    	driver.navigate().to("https://www.opencart.com/");
		 System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        
	        driver.navigate().to("https://www.bing.com/");
	       String URL = driver.getCurrentUrl();
	        System.out.println(URL);
	
		        
		    driver.navigate().back();
		        URL = driver.getCurrentUrl();
		        System.out.println(URL);
		        driver.quit();
		
}
    @Test(priority = 2)
    public void NavigateRefreshDemo() {
    	driver = new ChromeDriver();
    	driver.navigate().to("https://www.opencart.com/");
		 System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        
	        driver.navigate().to("https://www.myntra.com/");
	       String URL = driver.getCurrentUrl();
	        System.out.println(URL);
	
		        
		    driver.navigate().refresh();
		        URL = driver.getCurrentUrl();
		        System.out.println(URL);
		        driver.quit();
    }
    
    @Test(priority = 3)
    public void NavigateForwardDemo() {
    	driver = new ChromeDriver();
    	driver.navigate().to("https://www.opencart.com/");
		 System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        
	        driver.navigate().to("https://www.myntra.com/");
	       String URL = driver.getCurrentUrl();
	        System.out.println(URL);
	
		        
		    driver.navigate().back();
		        URL = driver.getCurrentUrl();
		        System.out.println(URL);
		        
		    driver.navigate().forward();
		        URL = driver.getCurrentUrl();
		        System.out.println(URL);    
		        
    }
    
}
		        
    	