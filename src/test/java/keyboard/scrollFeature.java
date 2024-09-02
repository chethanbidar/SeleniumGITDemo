package keyboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollFeature {
	@Test
	public void sumtable() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,800)");
			Thread.sleep(2000);
			jse.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
			
			List <WebElement>WEs=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
			 int total= 0;
			for (int i=0; i<WEs.size(); i++)
			{
			total = total + Integer.parseInt(WEs.get(i).getText());
			
			}
			System.out.println(total);
			
			Assert.assertEquals(total, 236);
	}
}
