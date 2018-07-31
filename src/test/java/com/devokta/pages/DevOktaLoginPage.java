package com.devokta.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class DevOktaLoginPage {

	WebDriver driver;

	By username = By.xpath("//input[@id='okta-signin-username']");

	By password = By.xpath("//input [@name='password'] [@id='okta-signin-password']");

	By signinbutton = By.xpath("//input[starts-with(@class,'button')]");

	public DevOktaLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToDevOkta(String a, String b) {

		driver.findElement(username).sendKeys(a);
		

		driver.findElement(password).sendKeys(b);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*By optionalCheck = By.xpath("//lable[@data-se-for-name='remember']");
		SoftAssert assertion = new SoftAssert();
		

		Assert.assertFalse(driver.findElement(optionalCheck).isSelected());

		System.out.println(driver.findElement(optionalCheck).isSelected());
		
		System.out.print("Assertion Passed successfully ");
		assertion.assertAll();
		*/
		
		driver.findElement(signinbutton).click();
       
	}
	
}



	

