package Assertion_Demo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Allassertion_In_1_method {
	
	@Test
	public void Allassertion_In_1_Test_methodt() {
		
		Date date= new Date();
		System.out.println(date.getYear());
		//AssertTrue
		System.out.println("Assert True method started");
		Assert.assertTrue("lenovo".equals("Dell"), "This method will pass only when the condition become true");
		System.out.println("Assert true method ended");

		//AssertFalse
		System.out.println("Assert false method started");
		Assert.assertFalse('O'=='c', "This method will pass only when the specified condition become false");
		System.out.println("Assert False method Ended");
	
		//AssertEquals
		System.out.println("Assert equal method started");
		Assert.assertEquals("20", "30", "This method will pass only when both actual and expected matches");
		System.out.println("Assert equal method ended");

		//AssertnNotEqual
		System.out.println("Assert notEqual method started");
		Assert.assertNotEquals("50", "50", "This method will pass only when both actual and expected are not match");
		System.out.println("Assert not equal method ended");
		
		//AssertSame
		System.out.println("Assert same method started");
		Object o1 = new Object();
		Object o2=01;
		Assert.assertSame(o1, o2, "This method will compare the addresses of mentioned 2 objects and "
				+ "pass only when 2 addresses are macthing");
		System.out.println("Assert same method ended");
		
		//AssertNotsame	
		System.out.println("Assert not same method started");
		Object o3 =  new Object();
		Object o4 = new Object();
		Assert.assertNotSame(o3, o4, "This method will compare the address of mentioned 2 objects and pass "
				+ "only when address are not matching");
		System.out.println("Assert not same method ended");
		
		//AssertNull
		System.out.println("Assert null method is started");
		String str= null;
		Assert.assertNull(str, "This method will retunr pass only when specified object has null");
		System.out.println("Assert null method is ended");
		
		//AssertNotNull
		System.out.println("Assert not null method is started");
		int i= 20;	
		Assert.assertNotNull(i, "This method will return pass only when specified object has not null");
		System.out.println("Assert not null method is ended");
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
