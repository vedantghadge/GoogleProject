package com.edusol.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Photos_POM {
	WebDriver driver;
	
    
	@FindBy(xpath = "//div[@class='gb_yf'] ")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[14]")
	WebElement photos;
	
	public Photos_POM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

public void photosMethod(WebDriver driver) throws Exception {

		FirstClick.click();
		driver.switchTo().frame(1);
		photos.click();
		Thread.sleep(2000);
		//driver.navigate().back();
	
}

}
