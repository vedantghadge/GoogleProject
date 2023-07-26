package com.edusol.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.Constants;
import com.edusol.pom.Account_POM;

import com.edusol.pom.Play_POM;
import com.edusol.pom.Assign02Search_POM;
import com.edusol.utilities.PropertyFileReader;

public class Runner2 {

	WebDriver driver;
    Assign02Search_POM searchPage;
    Account_POM AccPage;
	Play_POM playPage;

	@Test(priority=0)
	public void run1() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		Play_POM playPage = new Play_POM(driver);
		playPage.playMethod(driver);

	}
	

	@Test(priority=1,dependsOnMethods = {"run1"})
	public void run2() throws Exception {
		
		 Account_POM AccPage=new Account_POM(driver);
		 AccPage.accountMethod(driver);
		
	}
	
	
	
	
	
}
