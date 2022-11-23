package november10;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTesting {

	
	@Test
	@Parameters({"Val1","Val2"})
	public static void Sum(int v1, int v2) {
		int finalResult = v1 + v2;
		System.out.println(finalResult);
		
	}
}
