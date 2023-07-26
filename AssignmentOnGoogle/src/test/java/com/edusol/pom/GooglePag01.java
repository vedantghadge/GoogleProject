package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePag01 {
	
	
	@FindBy(xpath="//div[@class='gb_xf']")
	WebElement element ;
	@FindBy(xpath="//iframe[@role='presentation']")
	WebElement iframe ;
	
	@FindBy(xpath="//li[@class='j1ei8c']")
	WebElement maps ;
	
	public void login (WebDriver driver) {
	
		element.click();
		iframe.click();
		driver.switchTo().frame(iframe);
		maps.click();
	
	
	
	}
	
}
