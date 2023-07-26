package com.edusol.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Play_POM {
	WebDriver driver;
	
    
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[5]")
	WebElement play;
	
	public Play_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

public void playMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		play.click();
		Thread.sleep(2000);
	//	driver.navigate().back();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
