package com.edusol.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youtbe_POM {
	
	WebDriver driver;
	
    
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[4]")
	WebElement youtube;
	
	public Youtbe_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void youtubeMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		youtube.click();
		Thread.sleep(2000);
	//	driver.navigate().back();
		
	}
	

}
