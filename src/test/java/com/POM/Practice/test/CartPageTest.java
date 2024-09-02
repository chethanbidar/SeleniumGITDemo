package com.POM.Practice.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.POM.Page.practice.CartPage;
import com.POM.Page.practice.HomePage;
import com.POM.Page.practice.LoginPage;
import com.POM.Practice.Global_Components.BaseTest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CartPageTest extends BaseTest{

	public static WebDriver driver;
	//public CartPageTest cpt;

	@Test(dataProvider ="getdata")
	public void cart_Page_Test(HashMap<String, String> input) throws Exception 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		try {
			lp.login_function(input.get("email"), input.get("password"), "https://rahulshettyacademy.com/client/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.implicitWait();
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isElementDisplay());
		hp.implicitWait();
		hp.select_shoe();
		Thread.sleep(5000);
		System.out.println(hp.get_cart_count());
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
		Assert.assertEquals(cp.get_cart_count(), "2");

		Assert.assertEquals(cp.get_first_prodct(), "IPHONE 13PRO");
		Assert.assertEquals(cp.get_second_prodct(), "ADIDAS ORIGINAL");
		cp.scroll_down();

		cp.purchase_Page();
		System.out.println("cart_Page_Test is Passed");
		driver.close();
		

	}
	/*
	 * @BeforeTest(alwaysRun=true) public void beforeTest(String Email, String
	 * password) {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); LoginPage lp = new LoginPage(driver);
	 * try { lp.login_function(Email, password,
	 * "https://rahulshettyacademy.com/client/"); } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } lp.implicitWait();
	 * 
	 * }
	 */
	/*
	 * @AfterTest(alwaysRun = true) public void afterTest() { driver.close();
	 * 
	 * }
	 */	
	//using json file
	
	public List<HashMap<String, String>> dataReadFromJson() throws IOException  {
		String Jsoncontent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+ "//src//test//resources//properties//TestData.json"),
				StandardCharsets.UTF_8);
	
		//String to HashMap -jackson Datadind
		ObjectMapper mapper = new ObjectMapper();
		List <HashMap<String, String>> data= mapper.readValue(Jsoncontent, new TypeReference <List<HashMap<String, String>>>(){
		});
	return data;
	}
	
	@DataProvider
	public Object [][] getdata() throws IOException, InterruptedException{
		
		List <HashMap<String, String>> testdata= dataReadFromJson();
		Thread.sleep(2000);
		return new Object[][] {{testdata.get(0)}, {testdata.get(1)}};
	}
	
	
/*	//Using HasMap
	@DataProvider
	public Object[][] getdata() {

		
		HashMap<Object, Object > map = new HashMap<Object, Object>();
		map.put("email", "anshika@gmail.com");
		map.put("password", "Iamking@000");
		
		HashMap <String, String> map1 = new HashMap <String, String>();
		map1.put("email","shetty@gamil.com" );
		map1.put("password", "Iamking@000");
		
		return new Object[][] {{map}, { map1}};
	}*/
	
	
	/*@DataProvider with direct object
	public Object[][] getdata() {

		
		
		
		return new Object[][] {{"anishaka@gmail.com", "Iamking@000"}, {"shetty@gmail.com", "Iamking@000"}};
	}
	*/
	
	
	

	/*
	 * public static void main(String[] args) throws Exception {
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
	 * Assert.assertEquals(cp.get_cart_count(), "2");
	 * 
	 * 
	 * Assert.assertEquals(cp.get_first_prodct(), "IPHONE 13 PRO");
	 * Assert.assertEquals(cp.get_second_prodct(), "ADIDAS ORIGINAL");
	 * cp.scroll_down();
	 * 
	 * cp.purchase_Page();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
