package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SelectCheckBox {
	public WebDriver driver;
	

  @Test
  public void checkboxtest() throws Exception {
	  driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	  Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='doi0']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id='doi0']")).isSelected());
	
	  //driver.findElement(By.xpath("//label[@class='checkbox']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.sugarcrm.com/au/request-demo/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
  }

}
