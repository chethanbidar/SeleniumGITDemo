package com.POM.Practice.Global_Components;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseTest implements ITestListener{
	
	
	 ExtentReports extents= BaseTest.extentReportNG();
	 ExtentTest test;
	 
	public void onTestStart(ITestResult result) {
		test=extents.createTest(result.getMethod().getMethodName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		test.log(Status.PASS, "Test is passed");
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
		
		//test.log(Status.FAIL, "Test is failed");
		test.fail(result.getThrowable());
		try {	
			driver =(WebDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		String filepath= null;
		try {
			filepath = Screenshot(result.getMethod().getMethodName(),driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	  }
	public void onFinish(ITestResult result) {
		extents.flush();
	}
	
	

}
