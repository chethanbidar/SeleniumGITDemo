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
import com.POM.Page.practice.OrderConfirmationPage;
import com.POM.Page.practice.PaymentPage;
import com.POM.Practice.Global_Components.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderConfirmTest extends BaseTest{

	static WebDriver driver;
	OrderConfirmationPage op;

	@Test
	public void Order_Confirmation_Test() {
		op= new OrderConfirmationPage(driver);
		String confirm_text= op.order_Confirm_Text();
		
		
		if(confirm_text.equalsIgnoreCase("Thankyou for the order.")) {
			System.out.println("Order Confirmation Test is passed");
		}
		else
		{
			System.out.println("Order COnfirmation Test is Failed");
		}
		
	}
	
	@Test(dependsOnMethods= {"Order_Confirmation_Test"})
	public void productconfirm() {
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
		
		op= new OrderConfirmationPage(driver);
		
		
		op.headerclick();
		op.implicitWait();
		String actualProductName=op.verifyProducName();
		op.implicitWait();
		Assert.assertEquals(actualProductName, "IPHONE 13 PRO");
		
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
		
		
	}
	
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
	
	
	/*
	 * public static void main(String[] args) throws Exception {
	 * 
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
	 * PaymentPage pp = new PaymentPage(driver);
	 * 
	 * pp.enter_CVV("459"); pp.enter_CC_Name("Mathpathi Channabasava");
	 * pp.enter_country_Name("india"); pp.select_country_Name(); pp.order_click();
	 * 
	 * OrderConfirmationPage op= new OrderConfirmationPage(driver); String
	 * confirm_text= op.order_Confirm_Text();
	 * 
	 * if(confirm_text.equalsIgnoreCase("Thankyou for the order.")) {
	 * System.out.println("Test is passed"); } else {
	 * System.out.println("Test is Failed"); } }
	 */

}
