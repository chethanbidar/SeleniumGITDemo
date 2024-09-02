package keyboard;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class TestNG_Annotation {
	
  @Test(priority=2) 
  public void TestNG_Annotaion_test1() {
	  System.out.println("Main Test 1");
  }
  
  @Test(priority=1)
  public void TestNG_Annotaion_test2() {
	  System.out.println("Main Test 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
  System.out.println("before Class");
  }

  @AfterClass
  public void afterClass() {
  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
  System.out.println("After Test");
  }

}
