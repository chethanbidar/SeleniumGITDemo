package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class Radio_Box_button {
		WebDriver driver;
		
		@Test
		public void radioBuuttonTest() throws InterruptedException {
			driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
			driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[text()='Multi City']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[text()='One Way']")).click();
			
			
		}
		@BeforeTest
		public void beforeTest() throws Exception {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://www.makemytrip.com/");
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			
		}

		@AfterTest
		public void afterTest() {
		}

}
