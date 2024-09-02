package keyboard;

import org.testng.annotations.Test;

import Assertion_Demo.Sample;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class takescreenshot extends Sample{
		
		
		@Test
		public void ScreenshotTest() throws Exception {
			
			Date date = new Date();
			System.out.println(date);
			String systemdate= date.toString().replace(" ", "_").replace(":", "_");
			
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(".//evidence//"+ systemdate+".png"));
			
		}

}
