package com.POM.Page.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice.Abstract.Abstract_components;

public class CartPage extends Abstract_components{
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//button[text()='Continue Shopping']
	
	//h1[text()='My Cart']
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement My_Cart;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement continue_shopping;
	
	@FindBy(xpath="//div/div[3]/ul/li[3]/button")
	WebElement check_Out;
	
	@FindBy(xpath="//ul//li[4]/button/label")
	WebElement total_Cart_Count;
	
	
	@FindBy(xpath="//h3[text()='IPHONE 13 PRO']")
	WebElement first_Product;
	
	@FindBy(xpath="//h3[text()='ADIDAS ORIGINAL']")
	WebElement second_Product;
	
	public String get_text() {
		
		String Cart_Text= My_Cart.getText();
		return Cart_Text;	
	}
	
	public boolean is_Displayes() {
		return continue_shopping.isDisplayed();
	}
	
	public void purchase_Page() {
		explisitly_wait(My_Cart);
		implicitWait();
		check_Out.click();
	}
	
	public String get_cart_count() {
		explisitly_wait(My_Cart);
		String count = total_Cart_Count.getText();
		return count;
	}
	
	
	public String get_first_prodct() {
		explisitly_wait(My_Cart);
		String Actual_First_Name1= first_Product.getText();
		return Actual_First_Name1;
	}
	
	public String get_second_prodct() {
		explisitly_wait(My_Cart);
		String Actual_Prod_Name2= second_Product.getText();
		return Actual_Prod_Name2;
	}
	
	public void my_click() {
		
		explisitly_wait(My_Cart);
		My_Cart.click();
	}
	
	
	
	
	
}
