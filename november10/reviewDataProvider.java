package november10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class reviewDataProvider {
	
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "First-Value" }, { "Second-Value" } };
	}

	@DataProvider(name = "data-provider2")
	public Object[][] dpMethod2() {
		return new Object[][] { { "First-Number" }, { "Second-Number" } };
	}

	@Test(dataProvider = "data-provider")
	public void myTest(String val) {
		System.out.println("Passed Parameter Is : --> " + val);
	}
	
	

}
