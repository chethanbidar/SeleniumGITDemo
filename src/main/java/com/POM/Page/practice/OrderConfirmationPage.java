package com.POM.Page.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Abstract.Abstract_components;

public class OrderConfirmationPage extends Abstract_components{
	
	WebDriver driver;
	
	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".hero-primary")
	WebElement Order_confirm;
	
	public String order_Confirm_Text() {
		implicitWait();
		return Order_confirm.getText().trim();
	}
	@FindBy(css="ul li:nth-child(3)")
	WebElement ordertab;
	
	@FindBy(css="tr td:nth-child(3)")
	WebElement productname;
	
	
	public void headerclick() {
		ordertab.click();
	}

	public String verifyProducName() {
		String ordername= productname.getText();
		return ordername;
	}

}
