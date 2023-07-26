package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.CommonMethods;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign11StarEmail_POM {
	
	WebDriver driver;

  @Test
  public void starmails() throws InterruptedException {

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

		
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("is:starred ");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		
		String count = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total email:" + count);
		
  }
}