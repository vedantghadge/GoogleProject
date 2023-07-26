package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.edusol.base.BrowserFactory;
import com.edusol.base.CommonMethods;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;

public class Assign13Compose {

	WebDriver driver;

	@Test
	public void Compose() throws InterruptedException {

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
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("compose_btn"))).click();
		
		
	 //   driver.switchTo().frame(1);
	  //  driver.getWindowHandle()
		
		//driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("TO"))).click();
		
		//.sleep(5000);
		//CommonMethods.jsClick(driver, driver.findElement(By.xpath("//table//tbody//tr//td[@class='eV']")));
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='wA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='vO']")).sendKeys("vedantghadge050@gmail.com");
		
		//
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("CC"))).click();
		
	//	driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("ccbox"))).sendKeys("softwaretestingdemo63@gmail.com");
		
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("Subject"))).sendKeys("Test email");
		
		//driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("SendBtn"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(PropertyFileReader.readPropertiesOR("SendBtn"))).sendKeys(Keys.ENTER);
	}
	
}
	
	
	
	
	
	
	
	

