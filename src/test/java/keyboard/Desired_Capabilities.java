package keyboard;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Desired_Capabilities {
	@Test
	public void desiredCapabilities() {
	}
	@BeforeTest
	public void beforeTest() {
	DesiredCapabilities handleSSLerror = new DesiredCapabilities();{
		WebDriverManager.chromedriver().setup();
		handleSSLerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		handleSSLerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	}
	
	
	}

	@AfterTest
	public void afterTest() {
	}

}
