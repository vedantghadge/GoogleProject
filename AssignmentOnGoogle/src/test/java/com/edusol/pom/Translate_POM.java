package com.edusol.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edusol.base.CommonMethods;

public class Translate_POM {

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[13]")
	WebElement translate;
	
	
	public Translate_POM(WebDriver driver){
		
		this.driver=driver;
	    
		PageFactory.initElements(driver,this);
	
	}

public void translateMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame("app");
		//driver.switchTo().frame(1);
		//CommonMethods.jsScroll(driver, translate);
		Actions action=new Actions(driver);
		action.moveToElement(translate).perform();
		Thread.sleep(2000);
		translate.click();
		Thread.sleep(2000);
		//driver.navigate().back();
	
}}
