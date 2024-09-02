package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AutoSuggestions {
	WebDriver driver;
	
	@Test
	public void Autosuggestiondropdown() throws Exception {
		
		  driver.findElement(By.id("fromCity")).click();
		  Thread.sleep(2000);
		 WebElement from = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		 Thread.sleep(2000);
				from.sendKeys("india");
		Thread.sleep(2000);
		/*
		 * WebElement allsugestions= driver.findElement(By.xpath("//input[@autocomplete='off']"));
		 * allsugestions.sendKeys("mum"); 
		 * allsugestions.sendKeys(Keys.ARROW_DOWN);
		 * Thread.sleep(1000);
		 * allsugestions.sendKeys(Keys.ARROW_DOWN);
		 * Thread.sleep(1000); 
		 * allsugestions.sendKeys(Keys.ENTER);
		 */
		
		
		//To print all autosuggestions
		
		List <WebElement>allsugestions= driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
		System.out.println(allsugestions.size());
		
		
		for(int i=0; i<allsugestions.size();i++)
		{
			String text1= allsugestions.get(i).getText();
			if(text1.contains("Chandigarh"))
			{
				allsugestions.get(i).click();
			}
			
		}
		
		/*
		 * for(WebElement suggestion : allsugestions) { String text =
		 * suggestion.getText(); Thread.sleep(2000); System.out.println(text);
		 * if(text.equals("Chandigarh, India")) { suggestion.click(); } }
		 */
	
	}
	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		  Thread.sleep(1000);
	}

	@AfterTest
	public void afterTest() {
	}

}
