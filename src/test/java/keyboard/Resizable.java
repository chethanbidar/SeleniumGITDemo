package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

	public class Resizable {
		WebDriver driver;
		
		
		@Test
		public void resizableTest() {
			WebElement e1= driver.findElement(By.xpath("//*[@id=\"FB301A2D-121F-4E42-9D78-63944549C294\"]/div/div[1]"));
			//*[@id="FB301A2D-121F-4E42-9D78-63944549C294"]/div/div[1]/div[1]
			
			 Point p =e1.getLocation();
			 System.out.println(p.getX());
			 System.out.println(p.getY());
			 //x=341
			 //y=373
			Actions a= new Actions(driver);
			a.dragAndDropBy(e1, 442, 373).perform();
			
		}
		@BeforeTest
		public void beforeTest() throws Exception {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathp\\eclipse-workspace\\Basic_practice\\driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://eo-insurance.com/survey?ref=abg#/");
			  driver.manage().window().maximize();
			  //WebDriverWait wait = new WebDriverWait(driver,12);
			  //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("form-control")));
			  Thread.sleep(12000);
		}

		@AfterTest
		public void afterTest() {
		}

}
