package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 3 , description = "test1")
public void test1() {
		Assert.fail();
		System.out.println("I am Test 1");
		
	}
	
	@Test(priority = -3, description = "test2")

	public void test2() {
		
		System.out.println("I am test2 ");
	}
	
	
	@Test(priority = 0, description = "test3" , dependsOnMethods  = "test1" , alwaysRun = true )

	public void test3() {
		
		System.out.println("I am test 3");
	}
	
	
	@Test(priority = 1, description = "test4" , dependsOnMethods = {"test1","test3"} , alwaysRun = true)

	public void test4() {
		
		System.out.println("I am test4");
	}
	
}
