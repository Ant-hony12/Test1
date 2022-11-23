package november10;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class reportingLogsTesting {

	
	
	
	@Test(priority = 0)
	public void setUp() {
		

		Reporter.log("this method is testing the epening of the browser");
		Reporter.log("opening google chrome");
		BaseClass.getDriver();

		
	}
	@Test(priority=1)
	public void tearDown() {
		BaseClass.tearDown();
		Reporter.log("Driver closed after testing");
		
	}
	
	
	
	
	
	
	
	
}
