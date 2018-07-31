package com.deepu.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EhourDevPgFactory {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath="//img[@src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']")
	
	WebElement ehourdev;

	
	public EhourDevPgFactory(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		public  void clickonEhourDevPgF() {
			
   //	WebElement eDev=driver.findElement((By) ehourdev);
			Actions action = new Actions(driver);
			action.moveToElement(ehourdev);
			action.click().build().perform();
			
		
		
		
	}
}
