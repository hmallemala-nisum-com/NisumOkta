package com.nisum.deepu.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EhourDev {
	
	public static void main (String args[] ){
		
		System.setProperty("webdriver.gecko.driver","C:\\JAR Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://dev-572298.oktapreview.com/app/UserHome");
		
		driver.findElement(By.xpath("//img[src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']")).click();

	}

}
