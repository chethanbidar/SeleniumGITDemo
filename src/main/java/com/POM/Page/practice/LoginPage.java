package com.POM.Page.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.Abstract.Abstract_components;

public class LoginPage extends Abstract_components{
	
	WebDriver driver;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}


	//WebElement e= driver.findElement(By.cssSelector("#userEmail"));
	
	
	//driver.findElement(By.xpath("//h3[text()='Automation']")).getText()
	
	@FindBy(css="#userEmail")
	WebElement username;
	
	@FindBy(css="input[type='password']")
	WebElement password;
	
	@FindBy(css=".btn.btn-block")
	WebElement login_btn;
	
	@FindBy(xpath="//h3[text()='Automation']")
	WebElement Text_display;
	
	/*public void login_function(String un, String pwd, String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_btn.click();
		
	}*/
	public void login_function(String un, String pwd, String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		login_btn.click();
		
	}
	
	public String verify_successlogin() throws Exception {
		Thread.sleep(2000);
		String actual_text= Text_display.getText();
		return actual_text;
	}
	
	

}
