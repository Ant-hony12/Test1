package november10;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class TestingListeners {

	@Listeners(ListenersTestNG.class)
	public class TestingListerners {
	
		
		@Test //failed test
		public void openBrowser() {
		
			String expectedTitle = "Parallel Title";
			String actualTitle = "hello Title";
			
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("open browser test");

		}
		
		
		@Test //Success Test
		public void closeBrowser() {
			System.out.println("CloseBrowserTest");
			Assert.assertTrue(true);
		}
		
		@Test  //skipped test
		public void SkipTest() {
			System.out.println("skiiped test");
			throw new SkipException("Skipping the test Method");
		}
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
	

