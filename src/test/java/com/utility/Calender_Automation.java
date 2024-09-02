package com.utility;

import java.sql.Date;
import java.time.Year;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_Automation {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {



		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.get("https://www.napa-benefits.org/insurance/errors-and-omissions-eando-insurance");
		//driver.findElement(By.className("hasDatepicker")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("ui-datepicker-div"))));
//		
//		WebElement element= driver.findElement(By.id("datepicker"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				
//		Thread.sleep(5000);
//		element.sendKeys("25/12/2025");
//		Thread.sleep(5000);
//		
//		element.sendKeys(Keys.TAB);
		
		
		
		//selectDate("26", "July", "2025");
		
	}

	public static String[] getMonthYear(String MonthYear) {
		System.out.println(MonthYear);
		return MonthYear.split(" ");
		
	}


	public static void selectDate(String SData,String SMonth, String SYear) {

		String MonthYear= driver.findElement(By.className("ui-datepicker-title")).getText();
	
		int y=Year.now().getValue();
	
		while(!(getMonthYear(MonthYear)[0].equals(SMonth) &&  
				getMonthYear(MonthYear)[1].equals(SYear)))
		{
			
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			MonthYear=	driver.findElement(By.className("ui-datepicker-title")).getText();
			
		}
			 //driver.findElement(By.xpath("//a[text()='"+SData+"']")).click();
		
		driver.findElement(By.xpath("//a[text()='"+SData+"']")).click();
	}
	
	
	
	
	
	
	
}
