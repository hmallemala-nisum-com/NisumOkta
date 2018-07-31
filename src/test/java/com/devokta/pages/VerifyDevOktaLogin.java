package com.devokta.pages;

import java.util.Set;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.deepu.pagefactory.SoftAssertionCustomVerification;
import com.nisum.datadriven.InputData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//import com.nisum.datadriven.InputData;

public class VerifyDevOktaLogin {
	
	String a = "hmallemala@nisum.com";
	String b = "Honey$123";

	WebDriver driver;

	private void verifyLogin(boolean dataProvider,InputData inputData){
		WebDriver driver = PageUtil.getDriverDetails("https://dev-572298.oktapreview.com");

		DevOktaLoginPage login= new DevOktaLoginPage(driver);

		if(dataProvider){
			login.loginToDevOkta(inputData.getUserName(), inputData.getPassword());
		} else {
			login.loginToDevOkta(a, b);
		}

		ehourDevPage ehdpg= new ehourDevPage(driver);
		ehdpg.clickOnEhourDev();

		UserInfo uIF=new UserInfo(driver);
		//uIF.EmpInfo();

		String c= "8.00";

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs2.get(0));
		driver.close();
		driver.switchTo().window(tabs2.get(1));

		//String tabTitle = driver.getTitle();

		//driver.get("https://dev-timesheets.mynisum.com/eh/consultant/overview?1&openPanel=TIMESHEET");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String parentWindow = driver.getWindowHandle();

		Set<String> child_windows = driver.getWindowHandles();

		for(String childWindow:child_windows) {
			if(!parentWindow.equals(childWindow)) {
				System.out.println("Child window Name"+childWindow+":"+driver.getTitle());
				driver.switchTo().window(childWindow);
			}
		}

		//driver = PageUtil.getDriverDetails("https://dev-timesheets.mynisum.com/eh/consultant/overview?1&openPanel=TIMESHEET");
		//driver.switchTo().window(parentWindow);
		SoftAssertionCustomVerification softAssertionCustomVerification = new SoftAssertionCustomVerification();
		TimeSheet timeSheet = new TimeSheet(driver,softAssertionCustomVerification);
		timeSheet.enterDataToTimeSheet(c);

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		softAssertionCustomVerification.checkForVerificationErrors();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.close();

	}
	
	@Test
	public void verifyValidLogin() throws InterruptedException  {
		verifyLogin(false,null);
	}
	
	@Test(dataProvider="inputCsvData",dataProviderClass= InputData.class)
	public void inputDataDriverCSVFileData(InputData inputData) {
		verifyLogin(true,inputData);
	}

}


