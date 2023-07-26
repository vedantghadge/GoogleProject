package com.edusol.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.edusol.base.BrowserFactory;
import com.edusol.base.Constants;
import com.edusol.utilities.PropertyFileReader;




public class ReadPropertiesFile {
	// 1st step
	public static WebDriver driver;

	// 2nd step
	public static Properties config = new Properties();

	// 3rd step
	public static Properties object = new Properties();
	
public static void main(String[] args) throws Exception {

	Properties prop= new Properties();
	FileInputStream ip=new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\object.properties");
	object.load(ip);
	System.out.println(object.getProperty("SignIn"));}
	
	@BeforeSuite
	public void init() throws Exception {

		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		driver.get("https://www.google.com/");
		// 2nd step - Load config.properties
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/DD_PropertiesTestdata/config.properties");
		config.load(fis);
		//app_logs.fine("Loading config properties file");
		// 3rd step - Load Object.properties
		fis = new FileInputStream(System.getProperty("user.dir") + "/src/DD_PropertiesTestdata/object.properties");
		object.load(fis);

		// 4th Step - load excel file
	
	}

	@AfterSuite
	// use this method after finishing the test execution
	public void stopServer() {
		driver.quit();
	}

	
	
}

