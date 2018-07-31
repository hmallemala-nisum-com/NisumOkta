package com.devokta.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageUtil {
	 static WebDriver driver=null;
	public static WebDriver getDriverDetails(String driverUrl) {		
		
	
		System.setProperty("webdriver.chrome.driver","C:\\JAR Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://dev-572298.oktapreview.com");
		driver.get(driverUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}		
}



