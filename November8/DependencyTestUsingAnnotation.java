package November8;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	
	String message = "TechCircle";
	
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintmessage()");
		AssertJUnit.assertEquals(message, "Tech Circle");
		
		
	}
	@Test(dependsOnMethods = {"TestPrintMessage","randomTest"})
	public void testSolutionMessage() {
		System.out.println("Inside testSolutionMessage()");
		message = "Hi!"+"TechCircle";
		AssertJUnit.assertEquals(message, "Hi TechCircle");
		
	}
	@Test
	public void randomTest() {
		AssertJUnit.assertEquals(message, "hello");
	}

}
