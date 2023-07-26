package com.edusol.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.edusol.utilities.PropertyFileReader;

public class CommonMethods {

	public static SoftAssert softassert = new SoftAssert();

	public static void main(String[] args) {

		getCurrentDirectory();
	}

	static Long waittime = (long) Integer.parseInt(PropertyFileReader.readProperties(Constants.WAITTIME));

	public static void explicitwaitforVisiblity(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void explicitwaitforCLickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void jsClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void jsScroll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static String getCurrentDirectory() {
		String userDirectory = new File("").getAbsolutePath();
		System.out.println(userDirectory);
		return userDirectory;
	}

	public static String getScreenshot(WebDriver driver, String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot) driver; // downcasting
		File src = ts.getScreenshotAs(OutputType.FILE); // to get the screenshot
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH_mm");
		String formattedDate = dateFormat.format(date);
		System.out.println(formattedDate);
		File target = new File(getCurrentDirectory() + "\\src\\test\\resources\\Screenshots\\" + formattedDate + "\\"
				+ screenshotname + ".png");
		try {
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String path = target.toString();
		return path;

	}

	public static void selectDropdown_index(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void selectDropdown_value(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public static void Actions_Value(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public static void WindowHandle(WebDriver driver) {

		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window" + parentwindow);

		Set<String> windowsSet = driver.getWindowHandles();

		System.out.println("set of window includes" + windowsSet);

		for (String s : windowsSet) {

			if (s.equalsIgnoreCase(parentwindow)) {
				System.out.println("I m parent window");

			} else {

				System.out.println("This is window popup");

				driver.switchTo().window(s);
				driver.close();

			}
		}

	}

}
