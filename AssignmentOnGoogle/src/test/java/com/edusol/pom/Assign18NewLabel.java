package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign18NewLabel {
	WebDriver driver;

	@Test
	public void New_label() throws InterruptedException {

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

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("More_btn")))).perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("More_btn"))).click();

		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].scrollIntoView(true);", CreateNewlabel);
		// CommonMethods.jsScroll(driver,
		// driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("CreateNewlabel"))));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("CreateNewlabel"))));
		Thread.sleep(3000);

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("CreateNewlabel"))).click();
		

		/*
		 * Alert alert=driver.switchTo().alert(); String alertText=alert.getText();
		 * System.out.println("alertText is Given"+alertText);
		 */
		//alert.sendKeys("Testing");
		Thread.sleep(3000);
		//driver.switchTo().frame("apiproxycc5c6d73a569e16213bb7e37f7b9d90fcc28313e0.1928010523");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("NewLabelAlerts"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("NewLabelAlerts"))).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("CreateBtn"))).click();
		Thread.sleep(2000);
	}
	
		
	}


