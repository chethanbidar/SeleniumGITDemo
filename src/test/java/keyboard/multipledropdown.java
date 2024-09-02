package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class multipledropdown {
	public WebDriver driver;
	
	
  @Test
  public void alllinksofpage() {
	  	List <WebElement>links= driver.findElements(By.tagName("a"));
	  	System.out.println(links.size());
	  	
	  	for(int i=0; i<links.size(); i++)
	  	{
	  		System.out.println(links.get(i).getAttribute("href"));
	  		System.out.println(links.get(i).getText());
	  	}
	  	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
