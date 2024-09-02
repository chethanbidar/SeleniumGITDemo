package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class SelectClassPractice {
	public WebDriver driver;

	@Test
	public void testDropdownoptions() {
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mathp\\eclipse-workspace\\seleniumbasicc\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() throws Exception {
		driver.navigate().to("https://www.gallagherstudent.com/");
		driver.findElement(By.linkText("Continue »")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Select s = new Select(driver.findElement(By.id("schoolselect")));

		s.selectByVisibleText("Albertus Magnus College");
		Thread.sleep(2000);
		s.selectByValue("1318");// selects the cornell school
		Thread.sleep(2000);
		s.selectByIndex(10);// selects Augustana College - Illinois - college

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * 
		 * 
		 * // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(""
		 * ))); // s.deselectAll(); // List l = s.getOptions(); // for(Object ll: l) {
		 * // System.out.println(ll);
		 */// }
	}

}
