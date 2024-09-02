package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;

public class Read_Write {
	@Test
	public void Read_Write_test() throws IOException {
		Properties prop = new Properties();
		FileInputStream inputstream = new FileInputStream(".//src//test//resources//properties//or.properties");
		prop.load(inputstream);
		String browsername= prop.getProperty("browser");
		System.out.println(browsername);
		String dbname= prop.getProperty("dbname");
		System.out.println(dbname);
		
		FileOutputStream outputstream= new FileOutputStream(".//src//test//resources//properties//or.properties");
		prop.setProperty("TypeOfTesting", "RegressionTesting");
		prop.store(outputstream, "Type of testing mentioned");
		
		
		
	}
	@BeforeTest
	public void beforeTest() {
		
	
	}

	@AfterTest
	public void afterTest() {
	}

}
