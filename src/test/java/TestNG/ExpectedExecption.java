package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class ExpectedExecption {

	
		
		@Test(expectedExceptions = AssertionError.class , expectedExceptionsMessageRegExp = "Testng ahadling the exxeption")

		public void test2() {
			Assert.fail();
			
			System.out.println("I am test2 ");
		}
		
	
	
}
