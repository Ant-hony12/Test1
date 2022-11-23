package November8;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestingAnnotation {


	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		
	}
	@Test
	public void test1() {
		
		System.out.println("Test");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
		
		
		
	}
	
	
	
	
}
