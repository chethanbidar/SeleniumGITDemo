package Assertion_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion_Class {

	@Test
	public void softAssertionTestMethod() {

		SoftAssert sa = new SoftAssert();
		
		//AssertTrue method
		System.out.println("Assert True method started");
		sa.assertTrue("Lenovo".equals("Dell"), "This method will pass only when the condition become true");
		System.out.println("Assert true method ended");

		//AssertFalse method
		System.out.println("Assert False method started");
		sa.assertFalse(10.5 == 11.5,"This method will return always false and pass only when the provided condtion is flase");
		System.out.println("Assert False method ended");

		System.out.println("Assert equal method started");
		sa.assertEquals(8, 9, "This method will return the pass when when expected reult matched with actual result");
		System.out.println("Assert equal method ended");

		// AssertnNotEqual
		System.out.println("Assert notEqual method started");
		sa.assertNotEquals("50", "50", "This method will pass only when both actual and expected are not match");
		System.out.println("Assert not equal method ended");

		// AssertSame
		System.out.println("Assert same method started");
		Object o1 = new Object();
		Object o2 = 01;
		sa.assertSame(o1, o2, "This method will compare the addresses of mentioned 2 objects and "
				+ "pass only when 2 addresses are macthing");
		System.out.println("Assert same method ended");

		// AssertNotsame
		System.out.println("Assert not same method started");
		Object o3 = new Object();
		Object o4 = new Object();
		sa.assertNotSame(o3, o4, "This method will compare the address of mentioned 2 objects and pass "
				+ "only when address are not matching");
		System.out.println("Assert not same method ended");

		// AssertNull
		System.out.println("Assert null method is started");
		String str = "str";
		sa.assertNull(str, "This method will retunr pass only when specified object has null");
		System.out.println("Assert null method is ended");

		// AssertNotNull
		System.out.println("Assert not null method is started");
		int i = 20;
		sa.assertNotNull(i, "This method will return pass only when specified object has not null");
		System.out.println("Assert not null method is ended");

		sa.assertAll();
	}
}
