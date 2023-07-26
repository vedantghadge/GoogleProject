package com.edusol.pom;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edusol.base.CommonMethods;


public class gmail_POM  {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[7]")
	WebElement gmail;
	
	@FindBy(xpath="//a[@data-action='sign in']")
	WebElement sign_in_btn;
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Email_btn;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement Next_btn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password_btn;
	
	public gmail_POM(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void gmailMethod(WebDriver driver) throws InterruptedException {
	   
		FirstClick.click();
		driver.switchTo().frame(1);
		gmail.click();
		Thread.sleep(2000);
		sign_in_btn.click();
		Email_btn.sendKeys("softwaretestingdemo63@gmail.com");
		Next_btn.click();
		Thread.sleep(2000);
		
		Password_btn.sendKeys("Testing@121");
		Next_btn.click();
		//driver.navigate().back();
		
	}
	

}
