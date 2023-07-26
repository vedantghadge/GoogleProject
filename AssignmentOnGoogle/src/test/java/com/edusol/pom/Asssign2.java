package com.edusol.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asssign2 {
	static WebDriver driver;
	
	@BeforeMethod
	public void bronch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
		
	}
	
	@Test
	public void login() {
		
		
  WebElement googleApp =driver.findElement(By.className("gb_Se"));
  googleApp.click();
  
  
	}
}
