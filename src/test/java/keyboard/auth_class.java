package keyboard;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

	public class auth_class {
		String username = "admin";
		String password = "admin";
		WebDriver driver;
		@Test
		public void auth_test() {
			
			
		}
		@BeforeTest
		public void beforeTest() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
			
		}

		@AfterTest
		public void afterTest() {
		}

}
