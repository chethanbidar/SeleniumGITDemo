package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	public WebElement element1;
	public WebElement element2;
	public WebElement element3;
	
	
	
  @Test
  public void f() {
	  if (element2.isDisplayed())
	  {
		  System.out.println("Element is displayed");
	  }
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.associatesbenefits.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.cssSelector("ul.gsp-menu-items li:nth-of-type(8)")).click();
	  element1= driver.findElement(By.cssSelector("input#fxb_9d1ac5d3-6099-43fb-8691-2718941c5b84_Fields_c0632a6b-4e13-4840-bef5-4dc4f43aa7af__Value"));
	  element1.sendKeys("first name");
	  Thread.sleep(1000);
	  element1.sendKeys(Keys.CONTROL + "a");
	  element1.sendKeys(Keys.CONTROL + "c");
	  System.out.println(element1);
	  Thread.sleep(1000);
	  element2= driver.findElement(By.cssSelector("input#fxb_9d1ac5d3-6099-43fb-8691-2718941c5b84_Fields_b3b8e928-fd86-44b8-a9c6-bb07e1083b27__Value"));
	  //element2.sendKeys("second name");
	  Thread.sleep(1000);
	   element2.sendKeys(Keys.CONTROL+"v");
	   Thread.sleep(1000);
	   element1.sendKeys(Keys.CONTROL+"a");
	   element1.sendKeys(Keys.DELETE);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test pass");
  }

}
