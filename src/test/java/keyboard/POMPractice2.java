package keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMPractice2 {

	@Test
	public static void testing() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//driver.findElement(By.linkText("Register")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));

		driver.findElement(By.cssSelector("#userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Iamking@000");
		driver.findElement(By.cssSelector(".btn.btn-block")).click();

		String FirstAssertion= driver.findElement(By.xpath("//ul//li[4]/button")).getText().trim();
		Assert.assertEquals(FirstAssertion, "Cart" );

		driver.findElement(By.xpath("//div[@class='row']//div[2]//div//button/i[contains(@class, 'shopping')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul//li[4]/button")).click();

		Thread.sleep(2000);
		String Cart_Count= driver.findElement(By.xpath("//ul//li[4]/button/label")).getText();
		Assert.assertEquals(Cart_Count, "1");

		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();

		String payment_type=driver.findElement(By.cssSelector("div.payment__types div:nth-child(1)")).getText();

		System.out.println(payment_type);
		Assert.assertEquals(payment_type, "Credit Card");

		driver.findElement(By.xpath("//div[@class='form__cc']//div[2]//div[2]/input")).sendKeys("789");
		driver.findElement(By.xpath("//div[@class='form__cc']//div[3]//input")).sendKeys("Mathpathi Channabasava");
		WebElement Country= driver.findElement(By.cssSelector(".user__address input"));
		Country.sendKeys("India");
		//div[2]/div/div[1]/div/input

		Country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		Country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		Country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		Country.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
		



	}

}
