package com.edusol.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Page01 {
	WebDriver driver;

	@BeforeMethod
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse demo\\AssignmentOnGoogle\\src\\test\\resources\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	}

	
	@Test
	public void account() {
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
		element.get(0).click();
	    

		driver.switchTo().frame(1);
		
		WebElement account =driver.findElement(By.xpath("//li[@class='j1ei8c']"));
		account.click();
		
		
	}
	@Test
	public void search()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement search =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[2]"));
	search.click();
	
	}
	@Test
	public void maps()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement maps =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[3]"));
	maps.click();
	WebElement mapSearch =driver.findElement(By.xpath("//button[@id='widget-zoom-in']"));
	mapSearch.click();
	
	}
	@Test
	public void youtube()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement youtube =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[4]"));
	youtube.click();
	
	}
	@Test
	public void play()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement play =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[5]"));
	play.click();
	
	}
	@Test
	public void news()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement news =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[6]"));
	news.click();
	
	}
	@Test
	public void gmail()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement gmail =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[7]"));
	gmail.click();
	
	}
	@Test
	public void drive()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement drive =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[11]"));
	drive.click();
	
	}
	@Test
	public void photos()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement photos =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[14]"));
	photos.click();
	
	}
	@Test
	public void Translate()  {

	List<WebElement> element=driver.findElements(By.xpath("//div[@class='gb_xf']"));
	element.get(0).click();
    

	driver.switchTo().frame(1);
	
	
	WebElement translate =driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li[13]"));
	translate.click();
	
	}

	@BeforeMethod
	public void Tearedowan() {
    
	}

}
