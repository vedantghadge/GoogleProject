
package com.edusol.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.edusol.base.BrowserFactory;
import com.edusol.base.Constants;
import com.edusol.pom.Account_POM;
import com.edusol.pom.Drive_POM;
import com.edusol.pom.Maps_POM;
import com.edusol.pom.News_POM;
import com.edusol.pom.Photos_POM;
import com.edusol.pom.Play_POM;
import com.edusol.pom.Assign02Search_POM;
import com.edusol.pom.Assign10Totalrecived;
import com.edusol.pom.Assign11StarEmail_POM;
import com.edusol.pom.Assign12Reademail;
import com.edusol.pom.Assign12Unreadgmail;
import com.edusol.pom.Assign13Compose;
import com.edusol.pom.Assign15EmailRecived;
import com.edusol.pom.Assign16Attachments;
import com.edusol.pom.Assign17Settings;
import com.edusol.pom.Assign18NewLabel;
import com.edusol.pom.Assign19LabelMove;
import com.edusol.pom.Assign20SignOut;
import com.edusol.pom.Translate_POM;
import com.edusol.pom.Youtbe_POM;
import com.edusol.pom.gmail_POM;
import com.edusol.utilities.PropertyFileReader;

public class Runner {

	public static WebDriver driver;
	Account_POM accountPage;
	Assign02Search_POM searchPage;
	Maps_POM mapsPage;
	Youtbe_POM youtubePage;
	Play_POM playPage;
	News_POM newsPage;
	gmail_POM gmailPage;
	Drive_POM drivePage;
	Photos_POM photosPage;
	Translate_POM tanslatePage;
	Assign10Totalrecived Assign10page;
	Assign11StarEmail_POM Assign11Page;
	Assign12Reademail Assign12Page;
	Assign12Unreadgmail Assign12Unreadpage;
	Assign13Compose  Assign13compose;
	Assign15EmailRecived Assign15Erecived;
	Assign16Attachments Assign16AttachPage;
	Assign17Settings Assign17Setting;
	Assign18NewLabel Assign18Newlabel;
	Assign19LabelMove Assign19page;
	Assign20SignOut Assign20Page;

	public static ExtentTest test;
	public static ExtentReports extents;
	public static ExtentSparkReporter reporter;

	@BeforeSuite
	public void setup() {
		reporter = new ExtentSparkReporter("./src/test/resources/Reports/ReportsExtentReports001.html");
		extents = new ExtentReports();
		System.out.println("in extent");
		reporter.config().setReportName("Edusolution Extent Report");
		reporter.config().setTheme(Theme.DARK);
		extents.attachReporter(reporter);
	}

	@Test(priority = 0)
	public void run1() throws InterruptedException {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		ExtentTest test = extents.createTest("run1");
		test.log(Status.INFO, "account test has started");
		Account_POM accountPage = new Account_POM(driver);
		accountPage.accountMethod(driver);
		test.log(Status.PASS, "accountPage test has Passed Succesfully");

	}

	@Test(priority = 1)
	public void run2() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));

		ExtentTest test = extents.createTest("run2");
		test.log(Status.INFO, "account test has started");
		
		Maps_POM mapsPage = new Maps_POM(driver);
		mapsPage.mapsMethod(driver);
		test.log(Status.PASS, "mapsPage test has Passed Succesfully");

	}

	@Test(priority = 2)
	public void run3() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run3");
		test.log(Status.INFO, "account test has started");
		Translate_POM tanslatePage = new Translate_POM(driver);
		tanslatePage.translateMethod(driver);
		test.log(Status.PASS, "tanslatePage test has Passed Succesfully");

	}

	@Test(enabled = true,priority = 3)
	public void run4() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run4");
		test.log(Status.INFO, "account test has started");
		Youtbe_POM youtubePage = new Youtbe_POM(driver);
		youtubePage.youtubeMethod(driver);
		test.log(Status.PASS, "youtubePage test has Passed Succesfully");
	}

	@Test(enabled = true,priority = 4)
	public void run5() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run5");
		test.log(Status.INFO, "account test has started");
		Play_POM playPage = new Play_POM(driver);
		playPage.playMethod(driver);
		test.log(Status.PASS, "playPage test has Passed Succesfully");
	}

	@Test(enabled = true,priority = 5)
	public void run6() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run6");
		test.log(Status.INFO, "account test has started");
		News_POM newsPage = new News_POM(driver);
		newsPage.newsMethod(driver);
		test.log(Status.PASS, "newsPage test has Passed Succesfully");
	}

	@Test(enabled = true,priority = 6)
	public void run7() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run7");
		test.log(Status.INFO, "account test has started");
		Photos_POM photosPage = new Photos_POM(driver);
		photosPage.photosMethod(driver);
		test.log(Status.PASS, "photosPage test has Passed Succesfully");

	}

	@Test(enabled = true,priority = 7)
	public void run8() {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run8");
		test.log(Status.INFO, "account test has started");
		Drive_POM drivePage = new Drive_POM(driver);
		drivePage.driveMethod(driver);
		test.log(Status.PASS, "drivePage test has Passed Succesfully");
	}

	@Test(enabled = true,priority = 8)
	public void run9() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run9");
		test.log(Status.INFO, "account test has started");
		gmail_POM gmailPage = new gmail_POM(driver);
		gmailPage.gmailMethod(driver);
		test.log(Status.PASS, "gmailPage test has Passed Succesfully");

	}

	@Test(enabled = true,priority = 9)
	public void run10() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		Assign02Search_POM searchPage = new Assign02Search_POM(driver);
		searchPage.searchMethod(driver);
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
	}
	
	@Test(enabled = true,priority = 10)
	public void run11() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		Assign10Totalrecived Assign10page= new Assign10Totalrecived();
		Assign10page.Reciveed_emails();
		
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	
	@Test(enabled = true,priority =11)
	public void run12() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign11StarEmail_POM Assign11Page= new Assign11StarEmail_POM();
		Assign11Page.starmails();
		
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	
	@Test(enabled = true,priority = 12)
	public void run13() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign12Reademail Assign12Page= new Assign12Reademail();
		Assign12Page.Read_mail();
		
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	@Test(enabled = true,priority = 13)
	public void run14() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign12Unreadgmail Assign12Unreadpage= new Assign12Unreadgmail();
		Assign12Unreadpage.Unread_mails();		
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	
	@Test(enabled = true,priority = 14)
	public void run15() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign13Compose  Assign13compose= new Assign13Compose();
		Assign13compose.Compose();	
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	@Test(enabled = true,priority = 15)
	public void run16() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign15EmailRecived  Assign15Erecived= new Assign15EmailRecived();
		Assign15Erecived.Reacived_mail();	
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	@Test(enabled = true,priority = 16)
	public void run17() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign16Attachments Assign16AttachPage= new Assign16Attachments();
		Assign16AttachPage.Emial_Attachments();
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	@Test(enabled = true,priority = 17)
	public void run18() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		
		Assign17Settings Assign17Setting= new Assign17Settings();
		Assign17Setting.Setting();
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
	}
	@Test(enabled = true,priority = 18)
	public void run19() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		Assign18NewLabel Assign18Newlabel= new Assign18NewLabel();
		Assign18Newlabel.New_label();
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
		
	}
	@Test(enabled = true,priority = 19)
	public void run20() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		Assign19LabelMove Assign19page= new Assign19LabelMove();
		Assign19page.MoveToLabel();
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
		
	}
	
	@Test(enabled = true,priority = 20)
	public void run21() throws Exception {
		driver = BrowserFactory.browserLaunch(PropertyFileReader.readProperties(Constants.BROWSER),
				PropertyFileReader.readProperties(Constants.URL));
		ExtentTest test = extents.createTest("run10");
		test.log(Status.INFO, "account test has started");
		Assign20SignOut Assign20Page= new Assign20SignOut();
		Assign20Page.Sign_Out();
		test.log(Status.PASS, "searchPage test has Passed Succesfully");
		
		
	}
	
	@AfterMethod
	public void teardown() {

		driver.close();

	}

	@AfterSuite
	public void aftersuite() {

		extents.flush();
	}
}
