package dataprovider;

import org.testng.annotations.Test;


public class ignoretest {
	
	
	@Test(enabled = false)
	
public void test1() {
		
		
		System.out.println("I am test 1");
	}
	
	
	@Test
	
public void test2() {
		
		
		System.out.println("I am test 2");
	}

	@Test
	
public void test3() {
		
		
		System.out.println("I am test 3");
	}

	@Test
	
public void test4() {
		
		
		System.out.println("I am test 4");
	}

	@Test (enabled = false)
public void test5() {
		
		
		System.out.println("I am test 5");
	}


}
