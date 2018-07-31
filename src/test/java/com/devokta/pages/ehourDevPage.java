package com.devokta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ehourDevPage {

	WebDriver driver;

	By ehourdev = By.xpath(
			"//img[@src='https://op1static.oktacdn.com/assets/img/logos/default.6770228fb0dab49a1695ef440a5279bb.png']");

	public ehourDevPage(WebDriver driver) {
		this.driver = driver;

	}

	public void clickOnEhourDev() {

	WebElement eDev=driver.findElement(ehourdev);
	Actions action = new Actions(driver);
	action.sendKeys(Keys.CONTROL +"t");
	action.moveToElement(eDev);	
	action.click().build().perform();
	}

}

