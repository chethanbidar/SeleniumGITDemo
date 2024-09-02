package com.POM.Practice.Global_Components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.POM.Page.practice.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public String browserName;
	public Properties pop;
	public FileInputStream fis;
	public String URL;
	public LoginPage lp;
	
	
	public List<HashMap<String, String>> dataReadFromJson() throws IOException {
		String Jsoncontent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+ "//src//test//resources//properties//TestData.json"),
				StandardCharsets.UTF_8);
	
		//String to HashMap -jackson Datadind
		ObjectMapper mapper = new ObjectMapper();
		List <HashMap<String, String>> data= mapper.readValue(Jsoncontent, new TypeReference <List<HashMap<String, String>>>(){
		});
	return data;
	}
	
	public static ExtentReports extentReportNG() {
		
		String path = System.getProperty("User.dir")+ "//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("MyFirstReport");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Mathpathi Channabasava");
		return report;
	}
	
	public String Screenshot(String testCaseName, WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File file= new File(System.getProperty("User.dir")+ "//reports//" +testCaseName+ ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("User.dir")+ "//reports//" +testCaseName+ ".png";
	}
	
	
	public  WebDriver browser_launch() throws Exception {
		Properties pop = new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//properties//or.properties");
		
		pop.load(fis);
		browserName=System.getProperty("browser")!=null ? System.getProperty("browser") : pop.getProperty("browser");
		 //pop.getProperty("browser");
		//get_property();
		
		if(browserName.equals("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) 
		{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("wedriver.edge.driver", System.getProperty("user.dir")+ "driver//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();	
		return driver;
		
	}
	
	public LoginPage launch_application() throws Exception {
		
		driver =browser_launch();
		 lp = new LoginPage(driver);
		get_property();
		pop.load(fis);
		//URL = pop.getProperty("url");
		Thread.sleep(2000);
		driver.get(pop.getProperty("url"));
		return lp;
		
		
		
	}

	
	  public Properties get_property() throws Exception {
	  
	  pop = new Properties(); fis = new
	  FileInputStream(System.getProperty("user.dir")+
	  "//src//test//resources//properties//or.properties");
	  return pop; }
	  
	/*
	 * public void login_To_App() throws Exception {
	 * lp.login_function("anshika@gmail.com","Iamking@000"); }
	 */
	  
	  
	/*
	 * @AfterTest public void close() { driver.close(); }
	 */
	  
	  
	  
	 

}
