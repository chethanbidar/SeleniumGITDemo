package com.POM.Practice.test;

import org.testng.annotations.Test;

import com.POM.Page.practice.LoginPage;
import com.POM.Practice.Global_Components.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest {
	

	public static WebDriver driver;
	/*
	 * LoginTest lt; //BaseTest bt; LoginPage lp1;
	 */
	
	@Test
	public void login_Test() throws Exception {
		LoginPage lp = new LoginPage(driver);
		//lp1.login_To_App();
		lp.login_function("anshika@gmail.com", "Iamking@000","https://rahulshettyacademy.com/client/");
		String Actual_text= lp.verify_successlogin();
		Assert.assertEquals(Actual_text, "AUTOMATION");
		System.out.println("Login test is passed");
		
		
	}
	@BeforeTest
	public void beforeTest() throws Exception {
		
		  WebDriverManager.chromedriver().setup(); 
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 
		 
		//lp1=launch_application();		
			
	}

	
	  @AfterTest 
	  public void afterTest() { 
		  driver.close();
	  
	  
	  }
	 

}
