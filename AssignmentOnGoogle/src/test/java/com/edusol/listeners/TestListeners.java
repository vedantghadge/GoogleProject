package com.edusol.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.edusol.base.CommonMethods;
import com.edusol.runner.Runner;

public class TestListeners  implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("******* OnTestStart from Listener is called*****");
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("******* OnTestskipped from Listener is called*****");
	}
	
	public void onTestFailure(ITestResult result) {
	
		System.out.println("******* OnTestfailure from Listener is called*****");
		Runner.test.log(Status.FAIL,"Test failed"+ CommonMethods.getScreenshot(Runner.driver, "Test_Login"));
		
}

	public void onTestSuccess(ITestResult result) {
		System.out.println("******* OnTestSuccess from Listener is called*****");
}


}
