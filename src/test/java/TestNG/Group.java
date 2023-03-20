package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group {


	@Test(description = "test1" , groups = "A")
public void test1() {
		
		System.out.println("I am Test 1");
		
	}
	
	@Test( description = "test2" , groups = "A")

	public void test2() {
		//Assert.fail();
		System.out.println("I am test2 ");
	}
	
	
	@Test( description = "test3"  , groups = "B" )

	public void test3() {
		
		System.out.println("I am test 3");
	}
	
	
	@Test( description = "test4" , groups = "B")

	public void test4() {
		//Assert.fail();
		System.out.println("I am test4");
	}
	
	
	@Test( description = "test5" , dependsOnGroups = "B", alwaysRun = true)

	public void test5() {
		
		System.out.println("I am test5");
	}
}
