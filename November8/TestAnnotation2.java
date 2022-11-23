package November8;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


import Utilities.BaseClass;

public class TestAnnotation2 {

	@BeforeMethod
	public void openBrowser() {
		BaseClass.getDriver();
		
	}
	@Test(enabled=false, groups= {""})
	public void getTitle() {
	System.out.println(BaseClass.getDriver().getTitle());
	
	}
	@AfterTest 
		public void closeBrowser(){
		BaseClass.getDriver().quit();
		
	}
}
