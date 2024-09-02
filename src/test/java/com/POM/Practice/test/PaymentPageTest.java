package com.POM.Practice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POM.Page.practice.CartPage;
import com.POM.Page.practice.HomePage;
import com.POM.Page.practice.LoginPage;
import com.POM.Page.practice.PaymentPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentPageTest {

	 static WebDriver driver;
	 
	 @Test
	 public void payment_Page_Teat() {
		 
			PaymentPage pp = new PaymentPage(driver);
			pp.enter_CVV("459");
			pp.enter_CC_Name("Mathpathi Channabasava");
			pp.enter_country_Name("india");
			try {
				pp.select_country_Name();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pp.order_click();
			System.out.println("Payment Page Test is Passed");
		 
	 }
	 
	 
	 @BeforeTest
	 public void beforeTest() throws InterruptedException {
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

		CartPage cp = new CartPage(driver);
		Thread.sleep(2000);
		cp.my_click();
		cp.implicitWait();
		Thread.sleep(2000);
		Assert.assertTrue(cp.is_Displayes());
		Assert.assertEquals(cp.get_first_prodct(), "IPHONE 13 PRO");
		Assert.assertEquals(cp.get_second_prodct(), "ADIDAS ORIGINAL");
		cp.scroll_down();
		cp.purchase_Page();
		
	 }
	 
	 @AfterTest
	 public void afterTest() {
		 driver.close();
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
		 * CartPage cp = new CartPage(driver); Thread.sleep(2000); cp.my_click();
		 * cp.implicitWait(); Thread.sleep(2000); Assert.assertTrue(cp.is_Displayes());
		 * Assert.assertEquals(cp.get_first_prodct(), "IPHONE 13 PRO");
		 * Assert.assertEquals(cp.get_second_prodct(), "ADIDAS ORIGINAL");
		 * cp.scroll_down(); cp.purchase_Page();
		 * 
		 * 
		 * PaymentPage pp = new PaymentPage(driver); pp.enter_CVV("459");
		 * pp.enter_CC_Name("Mathpathi Channabasava"); pp.enter_country_Name("india");
		 * pp.select_country_Name(); pp.order_click();
		 * 
		 * 
		 * }
		 */

}
