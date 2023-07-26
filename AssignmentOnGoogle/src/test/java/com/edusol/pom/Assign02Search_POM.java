package com.edusol.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assign02Search_POM {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='gb_yf']")
	WebElement FirstClick;

	@FindBy(xpath = "//ul[@jsname='k77Iif']/li[2]")
	WebElement search;

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchBox;

	@FindBy(xpath = "//*[text()='Amitabh Bachchan']")
	WebElement Name;

	public Assign02Search_POM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void searchMethod(WebDriver driver) throws Exception {
		
		FirstClick.click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		//FirstClick.click();
		//Thread.sleep(2000);
		driver.switchTo().frame(1);
		search.click();

		searchBox.sendKeys("Amitabh bachchan");
		searchBox.sendKeys(Keys.ENTER);
		Name.isDisplayed();
		//driver.navigate().back();

	}

}