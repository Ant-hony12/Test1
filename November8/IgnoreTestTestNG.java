package November8;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IgnoreTestTestNG {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test 1 from ignore");
		
		
	}
	@Test(enabled=true)
	public void test1() {
		
	}
	@Test
	public void tes2() {
		
	}
	
}
