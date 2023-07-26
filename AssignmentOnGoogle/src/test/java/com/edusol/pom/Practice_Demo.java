package com.edusol.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse demo\\AssignmentOnGoogle\\src\\test\\resources\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("softwaretestingdemo63@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing@121");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();



		
		driver.findElement(By.cssSelector(".aic .z0 div")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".oj div textarea")).sendKeys("softwaretestingdemo63@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#\\:69")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#\\:9h")).sendKeys("softwaretestingdemo63@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#\\:68")).click();
		
		driver.findElement(By.cssSelector("#\\:9i")).sendKeys("softwaretestingdemo63@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".aoD.az6 input")).sendKeys("This is Test Subject");
	
		driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys("Automated Compose email");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("tr.btC td:nth-of-type(1) div div:nth-of-type(2)")).click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
		("#gb > div.gb_Kd.gb_1d.gb_Qd > div.gb_Ud.gb_Wa.gb_Jd.gb_Xd > div.gb_Qe > div.gb_Ma.gb_fd.gb_kg.gb_f.gb_yf > div > a > img")))
		.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Sign out']")).getText());



		driver.findElement(By.cssSelector(
		"#yDmH0d > c-wiz > div > div > div > div > div:nth-child(2) > div.EeWTFe > span > a > div")).click();
		}



		}
	


