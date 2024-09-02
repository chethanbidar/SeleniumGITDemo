package keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	@Test
	public void Mouseover() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wienerborse.at/en/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		Thread.sleep(1000);
		WebElement WB= driver.findElement(By.xpath("//span[text()='Trading']"));
		Actions a = new Actions(driver);
		a.moveToElement(WB).perform();
		Thread.sleep(2000);
	}
}
