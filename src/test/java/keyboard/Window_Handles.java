package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class Window_Handles {
		WebDriver driver;
		
		@Test
		public void WindowsHandle() throws Exception {
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000);
			driver.switchTo().frame("marketing");
			driver.findElement(By.xpath("//div[@class='container']/div/div/div[8]//span")).click();
			Thread.sleep(2000);
			Set <String> windows= driver.getWindowHandles();
			System.out.println(windows);
			Iterator <String> itr= windows.iterator();
			String parent= itr.next();
			System.out.println(parent);
			String child= itr.next();
			System.out.println(child);
			driver.switchTo().window(child);
			Thread.sleep(3000);
			driver.findElement(By.name("UserFirstName")).sendKeys("chethan");
			driver.findElement(By.name("UserLastName")).sendKeys("kumar");
			driver.findElement(By.name("UserTitle")).sendKeys("QA Tester");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='btn-container']//a")).click();
			driver.findElement(By.name("CompanyName")).sendKeys("Accenture");
			
			driver.switchTo().window(parent);
			JavascriptExecutor jsc =  (JavascriptExecutor)driver;
			String scrolldown= "window.scrollBy(0,1000)";
			jsc.executeScript(scrolldown);
		}
		@BeforeTest
		public void beforeTest() {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		@AfterTest
		public void afterTest() {
		}

}
