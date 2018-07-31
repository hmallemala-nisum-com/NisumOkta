package com.nisum.deepu.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	public static void main(String args[]) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\JAR Files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver","C:\\JAR Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		driver.get("https://dev-572298.oktapreview.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='okta-signin-username']")).sendKeys("hmallemala@nisum.com");
		
		driver.findElement(By.xpath("//input [@name='password'] [@id='okta-signin-password']")).sendKeys("Honey$123");
		
		
		
		driver.findElement(By.xpath("//input[starts-with(@class,'button')]")).click();
		
	
		WebElement ehourDev=driver.findElement(By.xpath("//img[@src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']"));
		Actions action = new Actions(driver);
		action.moveToElement(ehourDev);
		
		action.click().build().perform();
		
		/*WebElement ehourDev=driver.findElement(By.cssSelector("img[src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']"));
		
	
		Actions action = new Actions(driver);
		action.moveToElement(ehourDev);
		action.click().build().perform();
		Thread.sleep(3000);*/
		
		/*WebElement txtBox = driver.findElement(By.xpath("//img[@src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']"));
		
		
		WebElement txtBox = driver.findElement(By.xpath("//img[@src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']"));
		input [contains(@id,'user')]
		WebElement txtBox = driver.findElement(By.xpath("img[contains(@src,'https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png')]"));
		*/
	/*WebElement element = driver.findElement(By.xpath("WebElement element = driver.findElement(By.xpath(\"/html/body[@class='home blog gecko']/div[@id='wrapper']/div[@id='bottom']/div[1]/a[@class='ext-link']\"));"));
	element.getText();
	System.out.println("printing"+element);
		//driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/span/input")).sendKeys("1234");
		
		

		//driver.findElement(By.className("home-link-text")).click();
		*/
	}
	
	

}
