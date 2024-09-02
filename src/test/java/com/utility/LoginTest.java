package com.utility;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {
	
	WebDriver driver;
	
	
	
	@Test (dataProvider="Xldata")
	public void FBLoginFromXL(String Username, String Password, String pass) 
	{
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}
	@BeforeTest
	public void beforeTest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() 
	{

	}
	@DataProvider(name="Xldata")
	public Object[][] getdataFromXL() 
	{
		
		return GeneralUtilfordatafromexcel.readdataFromExcel("Credentails");
	}

}
