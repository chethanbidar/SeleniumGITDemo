package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;

	public class rightclick {
		WebDriver driver;
		
		@Test
		public void Rightclicktest() {
			
			 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(20))
				       .pollingEvery(Duration.ofSeconds(3))
				       .ignoring(NoSuchElementException.class)
				       .ignoring(TimeoutException.class);
			 WebElement element = driver.findElement(By.xpath("//*[@id=\"FB301A2D-121F-4E42-9D78-63944549C294\"]/div/div[1]/div[1]"));
				System.out.println(element.isDisplayed());
				
			
				/*
				 * //WebElement e1=
				 * driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div/div[6]"));
				 * Actions a = new Actions(driver); a.contextClick(e1).perform(); //Robot r =
				 * new Robot();
				 */			
			
		}
		@BeforeTest
		public void beforeTest() {
		
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://eo-insurance.com/survey?ref=abg#/#/");
			  driver.manage().window().maximize();
		}

		@AfterTest
		public void afterTest() {
		}

}
