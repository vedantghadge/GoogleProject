package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign19LabelMove {
	
	WebDriver driver;
	
	@Test
	public void MoveToLabel() throws InterruptedException {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GoogleAppsClick"))).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GmailBTnCliCk"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("SignInBtn"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("EmailSquare")))
				.sendKeys("softwaretestingdemo63@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("passwardSquare"))).sendKeys("Testing@121");

		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("has:attachment");
		Thread.sleep(1000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Selectmail"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("MoveToLabel"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("LabelAs"))).sendKeys("Testing");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
	}
}
