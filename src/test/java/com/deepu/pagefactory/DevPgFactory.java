package com.deepu.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DevPgFactory {
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='okta-signin-username']")
	WebElement username;
	
	@FindBy(xpath="//input [@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[starts-with(@class,'button')]")
	WebElement signinbutton;
	
	
	public DevPgFactory(WebDriver driver) {
		
		this.driver=driver;
		  //This initElements method will create all WebElements
		PageFactory.initElements(driver,this);
		
	}
	
	public void loginToOktaPgFactory(String a, String b) {
		
		username.sendKeys(a);
		password.sendKeys(b);
		signinbutton.click();
	}
}
