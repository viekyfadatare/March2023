package TestNG;

import org.testng.annotations.Test;
@Test
public class TestAnnotaion {

	
	
	
	public void test1() {
		
		System.out.println("I am Test 1");
	}
	
	
	void test2() {
		
		System.out.println("I am default ");
	}
	
	
	
	private void test3() {
		
		System.out.println("I am private 3");
	}
	
	
	
	protected void test4() {
		
		System.out.println("I am protected");
	}
	
}
