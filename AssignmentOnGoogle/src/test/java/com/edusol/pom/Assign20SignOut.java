package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.CommonMethods;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign20SignOut {
	
	WebDriver driver;

	@Test
	public void Sign_Out() throws InterruptedException {

		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GoogleAppsClick"))).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GmailBTnCliCk"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("SignInBtn"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("EmailSquare")))
				.sendKeys("softwaretestingdemo63@gmail.com");

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("passwardSquare"))).sendKeys("Testing@121");

		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Google_Account"))).click();
	//	CommonMethods.getScreenshot(driver, "Goosle account click");
		
		//driver.findElements(By.tagName("Tagname"));
		//driver.switchTo().frame(driver.findElements(By.tagName("Tagname")).get(-1));
		//driver.switchTo().frame(10);
		
		//Int size = driver.findElements(By.tagName("iframe")).size();
		
		driver.switchTo().frame("account");
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Sign_Out"))).click();

	}

	
}

	


