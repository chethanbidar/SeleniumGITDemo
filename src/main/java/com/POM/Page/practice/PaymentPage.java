package com.POM.Page.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Abstract.Abstract_components;

public class PaymentPage extends Abstract_components {

	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "div.payment__types div:nth-child(1)")
	WebElement CC_Text;

	@FindBy(xpath = "//div[@class='form__cc']//div[2]//div[2]/input")
	WebElement CCV;

	@FindBy(xpath = "//div[@class='form__cc']//div[3]//input")
	WebElement CC_Name;

	@FindBy(css= ".user__address input")
	WebElement country;

	@FindBy(xpath = "//a[text()='Place Order ']")
	WebElement order_click;

	public boolean is_Displayed() {
		return CC_Text.isDisplayed();
	}

	public void enter_CVV(String CVV) {
		implicitWait();
		CCV.sendKeys(CVV);
	}

	public void enter_CC_Name(String CCName) {
		CC_Name.sendKeys(CCName);
	}

	public void enter_country_Name(String CountryName) {
		country.sendKeys(CountryName);

		/*
		 * if(CountryName.equalsIgnoreCase("India")) { implicitWait();
		 * country.sendKeys(Keys.ENTER); implicitWait(); } else { implicitWait();
		 * country.sendKeys(Keys.ARROW_DOWN); implicitWait(); }
		 */
	}

	
	  public void select_country_Name() throws Exception {
	  
	  implicitWait();  
	  country.sendKeys(Keys.ARROW_DOWN); 
	  implicitWait();
	  Thread.sleep(1000);
	  country.sendKeys(Keys.ARROW_DOWN); 
	  implicitWait();
	  country.sendKeys(Keys.ARROW_DOWN); 
	  implicitWait();
	  Thread.sleep(1000);
	  country.sendKeys(Keys.ENTER); }
	 

	public void order_click() {
		implicitWait();
		order_click.click();
	}

}
