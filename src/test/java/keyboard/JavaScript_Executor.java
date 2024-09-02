package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class JavaScript_Executor {
		WebDriver driver;
		
		@Test
		public void javaScriptTest() throws Exception {
			
			JavascriptExecutor jse= (JavascriptExecutor) driver;
			
			//find the title
			String jsstatement = "return document.title;";
			String title = (String) jse.executeScript(jsstatement);
			System.out.println(title);
			
			//click on button
			driver.switchTo().frame("iframeResult");
			jse.executeScript("myFunction()");
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			//highlight the button
			
			WebElement button = driver.findElement(By.xpath("/html/body/button"));
			jse.executeScript("arguments[0].style.border='2px solid red'", button);
			
			//scroll down
			driver.navigate().to("https://www.associatesbenefits.com/Consumer-Discounts");
			WebElement lastbutton = driver.findElement(By.xpath("//*[@id=\"gsp\"]/footer/div/div[1]/div[2]/p/a/span"));
			jse.executeScript("arguments[0].scrollIntoView(true);", lastbutton);
			
		}
		@BeforeTest
		public void beforeTest() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			  driver.manage().window().maximize();	
		}

		@AfterTest
		public void afterTest() {
		
		}

}
