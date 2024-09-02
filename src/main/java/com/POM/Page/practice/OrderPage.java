package com.POM.Page.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	WebDriver driver;
	
	public OrderPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
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
