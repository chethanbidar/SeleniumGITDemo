package keyboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_suggestions {
	@Test
	public void suggestion() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 WebElement text =driver.findElement(By.id("autocomplete"));
		 text.sendKeys("United");
		List<WebElement>autosuggessions =driver.findElements(By.id("ui-id-1"));
		Thread.sleep(2000);
				
		for(int i=0; i<autosuggessions.size();i++)
		{
		System.out.println(autosuggessions.get(i).getText());
		
			
		}
		
		text.sendKeys(Keys.ARROW_DOWN);
		text.sendKeys(Keys.ARROW_DOWN);
		text.sendKeys(Keys.ARROW_DOWN);
		text.sendKeys(Keys.ARROW_DOWN);
		String actualtext = text.getText();
		Assert.assertEquals(actualtext, "United States (USA)");
		
		
		
	}
}
