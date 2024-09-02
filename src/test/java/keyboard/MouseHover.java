package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

	public class MouseHover {
		WebDriver driver;
		
		@Test
		public void mouseHoverTest() {
			
			WebElement wb=driver.findElement(By.xpath("//a[text()='Collectibles and Art']"));
			Actions a= new Actions(driver);
			a.moveToElement(wb).perform();
			driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
			
		}
		@BeforeTest
  	public void beforeTest() throws Exception {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://www.ebay.com/");
			  driver.manage().window().maximize();
			  Thread.sleep(5000);
		}

		@AfterTest
		public void afterTest() {
		}

}
