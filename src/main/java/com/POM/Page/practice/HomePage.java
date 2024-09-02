package com.POM.Page.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Abstract.Abstract_components;

public class HomePage extends Abstract_components{

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super (driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);

	}
	
	//driver.findElement(By.xpath("//div[@class='row']//div[2]//div//button/i[contains(@class, 'shopping')]")).click();
	//String Cart_Count= driver.findElement(By.xpath("//ul//li[4]/button/label")).getText();

	@FindBy(xpath="//button[text()=' Sign Out ']")
	WebElement Sign_Out;
	
	@FindBy(xpath="//div[@class='row']//div[2]//div//button/i[contains(@class, 'shopping')]")
	WebElement Addidas_Shoe;
	
	@FindBy(xpath="//div[@class='row']//div[3]/div//div//button[2]")
	WebElement Iphone_13;
	
	@FindBy(xpath="//ul//li[4]/button/label")
	WebElement Cart_Count;
	
	
	public String get_cart_count() {
		
		 return Cart_Count.getText();
	}
	
	
	public void select_shoe() {
		Addidas_Shoe.click();
		implicitWait();
		
	}
	
	public void selectiPhone() {
		Iphone_13.click();
	}
	
	public boolean isElementDisplay()
	{
		
		return Sign_Out.isDisplayed();
	}
	
	public void sign_Out_Click() 
	{
			
		Sign_Out.click();
	}
	
	
}
