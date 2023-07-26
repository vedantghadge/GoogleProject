package com.edusol.pom;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.CommonMethods;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign09 {

	WebDriver driver;
	// static Logger log= LogManager.getLogger(com.edusol.pom.Assign09.class);
	static Logger log = (Logger) LogManager.getLogger(Assign09.class);

	@Test
	public void gmail_Login() throws InterruptedException {
		log.error(" browser launch ");

		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GoogleAppsClick"))).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("GmailBTnCliCk"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("SignInBtn"))).click();

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("EmailSquare")))
				.sendKeys("softwaretestingdemo63@gmail.com");
		log.info(" id entered");

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("passwardSquare"))).sendKeys("Testing@121");
		log.info("password is entered");

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Next_Btn"))).click();
		log.info("click the next btn");

		////// ass16 Attachment mails count
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("has:attachment");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String count4 = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total attachment email:" + count4);
		log.info("Total attachment mails count succesfully");
		Thread.sleep(2000);
		driver.navigate().back();

		/////////////// ass10 Recived mails count
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("label:inbox");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String count0 = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total Recived email:" + count0);
		log.info("Total Recived mails count succesfully");

		driver.navigate().back();

		/////////// ass12 read mails count
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("label:read ");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String count2 = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total  Read email:" + count2);
		log.info("Total Read mails count succesfully");
		Thread.sleep(2000);
		driver.navigate().back();

		/////////// ass13 unread mails count
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("label:unread ");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		String count3 = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total Unread email:" + count3);
		log.info("Total UnRead mails count succesfully");
		Thread.sleep(2000);
		driver.navigate().back();

		////// ass11 starred mails count
		Thread.sleep(2000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys("is:starred ");
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("searchMail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String count1 = driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("totalmails"))).getText();
		System.out.println("Total starred email:" + count1);
		log.info("Total Starred mails count succesfully");
		Thread.sleep(2000);
		driver.navigate().back();

		
	////// Setting
		Thread.sleep(3000);
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Setting_Btn"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("See_AllSetting_Btn"))).click();
		log.info("Setting updated succesfully");
		driver.navigate().back();
		driver.close();
	}
}
