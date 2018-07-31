package com.devokta.pages;

import java.util.List;

import com.deepu.pagefactory.SoftAssertionCustomVerification;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeSheet<WebElement> {

	WebDriver driver;
	SoftAssertionCustomVerification softAssertionCustomVerification;
	
	public TimeSheet(WebDriver driver,SoftAssertionCustomVerification softAssertionCustomVerification) {
		this.driver = driver;
		this.softAssertionCustomVerification = softAssertionCustomVerification;
	}

	public void enterDataToTimeSheet(String timeSheetHour) {
		 By cancelButton = By.xpath("//a[@class='btn floatLeft']");
		 driver.findElement(cancelButton).click();
		 
		 
		By sundayTime = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:0:day:day']");
		//driver.findElement(sundayTime).sendKeys(timeSheetHour);
		setTimeSheetHours(sundayTime,timeSheetHour,driver);
		
		By mondayTime = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:1:day:day']");
		setTimeSheetHours(mondayTime,timeSheetHour,driver);
		
		By tuesDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:2:day:day']");
		setTimeSheetHours(tuesDay,timeSheetHour,driver);

		By wednesDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:3:day:day']");
		setTimeSheetHours(wednesDay,timeSheetHour,driver);

		By thursDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:4:day:day']");
		setTimeSheetHours(thursDay,timeSheetHour,driver);

		By friDay = By.xpath("//input[@name='blueFrame:blueFrame_body:customers:0:rows:3:days:5:day:day']");
		setTimeSheetHours(friDay,timeSheetHour,driver);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By storebutton=By.xpath("//a[@class='bluebutton store']");
		driver.findElement(storebutton).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		By okButton=By.xpath("//button[@class='swal2-confirm swal2-styled']");



		//assertTrue(driver.findElement(okButton).getText().equals("OK"));
		softAssertionCustomVerification.verifyTrue("OK button missing",driver.findElement(okButton).getText().equals("OK"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(okButton).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		By tdGrandTotal=By.xpath("//td[@class='total lastColumn grandTotal']");

		softAssertionCustomVerification.verifyTrue("Grand Total value should be minimum 40 hours",driver.findElement(tdGrandTotal).getText().equals("40.00"));

		//assertTrue(driver.findElement(By.linkText("Sign out")).getText().equals("Sign out"));

		softAssertionCustomVerification.verifyTrue("SigOut should exists after SignIn",driver.findElement(By.linkText("Sign out")).getText().equals("Sign out"));
		
        signOutClickLinkByHref("https://dev-timesheets.mynisum.com/eh/logout");


	}

	private void setTimeSheetHours(By byElement, String hours, WebDriver driver) {
		if (driver.findElement(byElement) != null && !(driver.findElement(byElement).getAttribute("value").equals(hours))) {
			driver.findElement(byElement).sendKeys(hours);
		}
	}
	public void signOutClickLinkByHref(String href) {
		 List<org.openqa.selenium.WebElement> anchors = driver.findElements(By.tagName("a"));
	       Iterator<org.openqa.selenium.WebElement> i = anchors.iterator();

	       int j = 0;
	       while(i.hasNext()) {
	           org.openqa.selenium.WebElement anchor = i.next();
	           if(anchor.getAttribute("href").contains(href)) {
	               j++;
	           }
	           if(anchor.getAttribute("href").contains(href)) {
	               anchor.click();
	               break;
	           }
	       }
	}	  
}
