package Assertion_Demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static WebDriver driver;
	
	@Test 
	public void Testing() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.associatesbenefits.com/");
		String Actual =driver.findElement(By.xpath("//*[@id=\"gsp\"]/section/div[1]/div[1]/a")).getText();
		String Expected =driver.findElement(By.xpath("//*[@id=\"gsp\"]/section[2]/div/div[2]/a")).getText();
		Assert.assertEquals(Actual,Expected);
		
	}
}
