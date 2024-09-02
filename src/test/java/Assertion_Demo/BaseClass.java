package Assertion_Demo;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

	public class BaseClass {

		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test is executed");
		}

		@AfterTest
		public void afterTest() {
			System.out.println("After test is exected");
		}	

		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before suite is executed");
		}

		@AfterSuite
		public void afterSuite() {
			System.out.println("After suite is executed");
			System.out.println("After suite is executed");
		}
		@AfterSuite
		public void afterSuite1() {
			System.out.println("After suite is executed");
			System.out.println("After suite is executed");
			System.out.println("After suite is executed");
			System.out.println("After suite is executed");
			System.out.println("After suite is executed");
		}

}
