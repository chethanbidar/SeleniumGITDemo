package Assertion_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass01 extends BaseClass {
	
	@Test
  	public void testMethod01() {
		System.out.println("Assert true method is started");
		Assert.assertTrue(20>18, "This test will pass only when provided condition become true");
		System.out.println("Assert true method is ended");
	}
	
	@Test
  	public void testMethod02() {
		System.out.println("Assert false method is started");
		Assert.assertFalse(20>18, "This test will pass only when provided condition become false");
		System.out.println("Assert false method is ended");
	}
	
	@Test
  	public void testMethod03() {
		System.out.println("Assert Equals method is started");
		Assert.assertEquals("Hello", "hello", "This test will pass only when both Actual & Expected matches");
		System.out.println("Assert Equals method is ended");
	}
	
	@Test
  	public void testMethod04() {
		System.out.println("Assert NotEquals method is started");
		Assert.assertNotEquals("Hello", "hello", "This test will pass only when both actual & Expecetd are not matches");
		System.out.println("Assert NotEquals method is ended");
	}
	
	@Test
  	public void testMethod05() {
		System.out.println("Assert null method is started");
		Assert.assertNull("hello", "This test will pass only when provided object is null");
		System.out.println("Assert null method is ended");
	}
	
	@Test
  	public void testMethod06() {
		System.out.println("Assert NotNull method is started");
		Assert.assertNotNull("hello", "This test will pass only when provided object is not null");
		System.out.println("Assert NotNull method is ended");
	}
	
	@Test
  	public void testMethod07() {
		System.out.println("Assert Same method is started");
		
		  Object o1 = new Object(); Object o2; o2=o1; 
		  Assert.assertSame(o1, o2, "This test will pass only when provided 2 object address/value are same");
		 
		//Assert.assertSame(1, 2);
		System.out.println("Assert Same method is ended");
	}
	
	@Test
  	public void testMethod08() {
		System.out.println("Assert NotSame method is started");
		Assert.assertNotSame("hello", "20", "This test will pass only when provided 2 objects are not same");
		System.out.println("Assert NotSame method is ended");
	}
	
	@Test
  	public void testMethod09() {
		System.out.println("Assert fail method is started");
		Assert.fail( "This method is used to fail the particular test case intentionally");
		System.out.println("Assert fail method is ended");
	}
	
	
	
	
	
	
	
	
	
}
