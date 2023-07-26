package com.edusol.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent=	new ExtentReports();
	public static ExtentTest test;
	
	public static ExtentReports createExtentReport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./src/test/resources/Reports/extent-report.html");
		reporter.config().setReportName("Edusolution Extent Report");		
		reporter.config().setTheme(Theme.DARK);
		 extent.attachReporter(reporter);
		 return extent;
	}
	
	

	public static ExtentTest startTest(String testName) {
		 ExtentTest test = createExtentReport().createTest(testName);
		return test;
	}
}
