package keyboard;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

	public class Data_Provider_Demo {
		
		
		
		
		@Test(dataProvider = "dp")
		public void Sample_data_Provider(Integer n, String s) {
	  System.out.println(n + " " + s);
	  Assert.assertEquals(false, false);
	  Assert.assertTrue(false, s);
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(false, false);
	  
		}

		@DataProvider
		public Object[][] dp() {
			return new Object[][] {
				new Object[] { 1, "a" },
				new Object[] { 2, "b" },
				new Object[] { 3, "c" },
				new Object[] { 4, "d" },
				new Object[] { 5, "e" }
    };
  }
}
