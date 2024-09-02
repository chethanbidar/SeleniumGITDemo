package keyboard;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsHandle {
	
	@Test
	public void Handle_Window() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.associatesbenefits.com/");
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
		Set WindowsValues= driver.getWindowHandles();
		String firsttitle= driver.getTitle();
		Iterator <String>itr= WindowsValues.iterator();
		String parentID= itr.next();
		String childID= itr.next();
		
		driver.switchTo().window(childID);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='complete']")).click();
		String logo=driver.findElement(By.cssSelector(".ajg-logo.ajg-logo-svg")).getText();
		String here= driver.findElement(By.xpath("//a[text()='here']")).getText();
		System.out.println(here);
		driver.findElement(By.xpath("//a[text()='here']")).click();
		String secondtitle= driver.getTitle();
		
		System.out.println(logo);
		driver.close();
		
		
		
	}
}
