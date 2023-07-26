package com.edusol.pom;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edusol.base.CommonMethods;


public class Account_POM {

	WebDriver driver;
	static Logger log=LogManager.getLogger(Account_POM.class);
	
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//li[@class='j1ei8c']")
	WebElement account;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement Header;
	
	public Account_POM(WebDriver driver){
    
		this.driver=driver;
   		PageFactory.initElements(driver,this);
		
	}

public void accountMethod(WebDriver driver) throws InterruptedException {
    
		FirstClick.click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		//driver.switchTo().frame("app");
		Thread.sleep(2000);
		account.click();
		Thread.sleep(2000);
		Header.isDisplayed();
		Thread.sleep(2000);
        driver.navigate().back();
		Thread.sleep(2000);
	}

}
