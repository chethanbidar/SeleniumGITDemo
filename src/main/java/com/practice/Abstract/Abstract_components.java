package com.practice.Abstract;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract_components {
	
	WebDriver driver;
	WebElement element;
	
	
	public Abstract_components(WebDriver driver) {
		
		this.driver = driver;
	}


	public void implicitWait() {
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void explisitly_wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void scroll_down() {
			
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("window.scrollTo(0,500)", "Scrolling to footer");
	}
	
	public WebElement enter_Text(WebElement element) {
		return element;
		
	}
}
