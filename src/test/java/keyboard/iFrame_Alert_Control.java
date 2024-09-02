package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class iFrame_Alert_Control {
	WebDriver driver;
	
		

		@Test
		public void iFrameTest() throws Exception {
			/*
			 * //driver.switchTo().frame("srttij");
			 * driver.findElement(By.xpath("//*[@id=\"gsp\"]/section/div[1]/div[1]/a")).
			 * click(); //Thread.sleep(2000); //driver.findElement(By.xpath(
			 * "/html/body/div[3]/div/div/div/div[2]/div/div[1]/div[2]")).click();
			 * driver.findElement(By.xpath("//div[@id='LearnMoreModal']//a")).click();
			 */
			 driver.switchTo().frame("iframeResult");
			  driver.findElement(By.xpath("//button[text()='Try it']")).click();
			String name= driver.switchTo().alert().getText();
			System.out.println(name);
			driver.switchTo().alert().accept();
			driver.switchTo().parentFrame();
			System.out.println(driver.getCurrentUrl());
			
		}
		@BeforeTest
			public void beforeTest() throws Exception {
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
				  driver = new ChromeDriver();
				  //driver.get("https://www.cleartrip.com/");
				  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
				 
				  
				  driver.manage().window().maximize();
				  Thread.sleep(2000);
			
		}

		@AfterTest
		public void afterTest() {
		}

}
