package Assertion_Demo;

import org.testng.ITestListener;
import org.testng.ITestResult;

import keyboard.takescreenshot;

public class Listerners extends takescreenshot implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case sucess");
	}

	public void OnTestStart(ITestResult result) {
		System.out.println("Test case Staring");		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed and screenshot is taken");	
		try {
			ScreenshotTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void OnTestSkipped(ITestResult result) {

	}

	public void onFinish(ITestResult result) {
		System.out.println("Test case finished");	
	}
	
}
