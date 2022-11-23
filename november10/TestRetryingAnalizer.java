package november10;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestRetryingAnalizer {

	
	@Test(retryAnalyzer = november10.RetryAnalyzer.class)
	public void test1 () {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
		
	}
	
	
	
}
