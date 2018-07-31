package com.devokta.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserInfo {
	
	WebDriver driver;
	By popupWindow1;
	
	@SuppressWarnings("unused")	
 public UserInfo (WebDriver driver) {	 
	 this.driver=driver;
	 
	popupWindow1 = By.xpath(
	 "div[id='_wicket_window_1']");
	 
	 popupWindow1 = By.xpath("div[id='ida4']");
 }
 
 public void EmpInfo() {
	 driver.findElement(popupWindow1).getText();
	 System.out.println(driver);
	
	
 }
}



/*By location = By.xpath("//select[name='location']");
By drpLocation= By.xpath("//select[@name='location']/option[1]");



By grp = By.xpath("//select[name='department']");
//By drpgroup= By.xpath("//select[@name='department']/option[@select='selected']");
//By.xpath("//select[@id='groupSelect']/option[@value='data' and . = 'First value']")

//By employee= By.xpath("//select[@name='employeeType']/option[5]");

//By save = By.xpath("//span [@ text()='Save'");

By okbutton= By.xpath("//button[@type='button']");*/

/*
Select loc1 = new Select(driver.findElement(drpLocation));
Select funGrp = new Select(driver.findElement(grp));
funGrp.selectByVisibleText("Undetermined");

// Select emp = new Select(driver.findElement(employee));
// driver.findElement(save).click();
driver.findElement(okbutton).click();;
 */
