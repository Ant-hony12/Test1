package november10;

import org.testng.annotations.Test;

public class prioritizeTests {

	@Test(priority = 2)
	public void loggingInWithValidUserNameandValidPassword () {
		System.out.println("a");
		
	}
	@Test(priority = 4)
	public void  loggingInWithInvalidUserNameandValidPassword() {
		System.out.println("b");
		
	}
	@Test(priority = 3)
	public void loggingInWithInvalidUserNameandInvalidPassword () {
		System.out.println("c");
		
	}
	@Test(priority = 0)
	public void loggingInWithValidUserNameandInvalidPassword () {
		System.out.println("d");
		
	}
	@Test(priority = -1)
	public void  loggingInEmptyUserNameandEmptyPassword() {
		System.out.println("e");
		
	}
}
