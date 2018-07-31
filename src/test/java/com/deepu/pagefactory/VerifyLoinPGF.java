package com.deepu.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.devokta.pages.DevOktaLoginPage;

public class VerifyLoinPGF {

	WebDriver driver;
	
	String a= "hmallemala@nisum.com";
	String b = "Honey$123";
	

	@Test
	public void verifyPgFLogin() {
		
		System.setProperty("webdriver.gecko.driver","C:\\JAR Files\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://dev-572298.oktapreview.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
	DevPgFactory pglog= new DevPgFactory(driver);
	pglog.loginToOktaPgFactory(a, b);
	

	
	EhourDevPgFactory obj1= new EhourDevPgFactory(driver);
	obj1.clickonEhourDevPgF();
	
	}
}
