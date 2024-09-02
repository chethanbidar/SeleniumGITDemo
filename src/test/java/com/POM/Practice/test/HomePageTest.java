package com.POM.Practice.test;

import org.testng.annotations.Test;

import com.POM.Page.practice.HomePage;
import com.POM.Page.practice.LoginPage;
import com.POM.Practice.Global_Components.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HomePageTest extends BaseTest {
	public  static WebDriver  driver;
	public LoginPage lp1;
	
	
	@Test
	public void home_Page_Test() throws Exception {
		HomePage hp= new HomePage(driver);
		Assert.assertTrue(hp.isElementDisplay());
		hp.implicitWait();
		hp.select_shoe();
		Thread.sleep(5000);
		System.out.println( hp.get_cart_count());
		hp.selectiPhone();
		hp.implicitWait();
		Thread.sleep(5000);
		System.out.println(hp.get_cart_count());
		System.out.println("Home Page test is passed");
		
		
	}
	
	
	@BeforeTest
	public void beforeTest() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		try {
			lp.login_function("anshika@gmail.com", "Iamking@000", "https://rahulshettyacademy.com/client/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.implicitWait();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		
	}
	
	
	@DataProvider
	public Object gettestdata() {
		return new Object[][] {{"anshika@gmail.com", "Iamking@000" },{"shetty@gmail.com", "Iamking@000"}};
	}
	
	/*
	 * public static void main(String[] args) throws Exception {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); LoginPage lp = new LoginPage(driver);
	 * lp.login_function("anshika@gmail.com", "Iamking@000",
	 * "https://rahulshettyacademy.com/client/"); lp.implicitWait();
	 * 
	 * HomePage hp= new HomePage(driver); Assert.assertTrue(hp.isElementDisplay());
	 * hp.implicitWait(); hp.select_shoe(); Thread.sleep(5000); System.out.println(
	 * hp.get_cart_count()); hp.selectiPhone(); hp.implicitWait();
	 * Thread.sleep(5000); System.out.println(hp.get_cart_count());
	 * 
	 * 
	 * }
	 */
	 
}
