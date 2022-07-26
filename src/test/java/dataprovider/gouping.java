package dataprovider;

import org.testng.annotations.Test;

public class gouping {
	
	@Test(groups = "smoke")
	
public void test1() {
		
		
		System.out.println("I am test 1");
	}

	
	@Test (groups = "smoke")
	
public void test2() {
		
		
		System.out.println("I am test 2");
	}

	
	@Test (groups = "smoke")
	
public void test3() {
		
		
		System.out.println("I am test 3");
	}

	@Test (groups = "regression")
	
public void test4() {
		
		
		System.out.println("I am test 4");
	}

	@Test (groups = "regression")
	
public void test5() {
		
		
		System.out.println("I am test 5");
	}

	@Test (groups = {"sanity", "regression"})
	
public void test6() {
		
		
		System.out.println("I am test 6");
	}

	@Test
	
public void test7() {
		
		
		System.out.println("I am test 7");
	}


}
