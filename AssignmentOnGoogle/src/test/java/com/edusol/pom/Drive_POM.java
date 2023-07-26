package com.edusol.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drive_POM {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[11]")
	WebElement drive;
	
	public Drive_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void driveMethod(WebDriver driver) {

		FirstClick.click();
		driver.switchTo().frame(1);
		drive.click();
		//driver.navigate().back();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
