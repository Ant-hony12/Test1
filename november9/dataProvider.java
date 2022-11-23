package november9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	

	@DataProvider(name = "Bill")
	public Object[][] dpMethod(){
		return new Object[][] {{"BMW"}, {"MB"}, {"TOYOTA"}};
	}
	
	
	
	@Test(dataProvider = "Bill")
	public void billCar(String cars) {
		System.out.println("Bill`s cars: " + cars);
		
		
		//TODO:
		/*
		 * create DataProvider with multiple Integers {{1,2}, {3,4}}
		 * 
		 * return the a + b as result
		 * 
		 */
		
	}
	
	@DataProvider(name = "c1")
	public Object[][] calculator(){
		return new Object[][] {{1,2,3}, {3,4,7}};
	}
	
	@Test(dataProvider = "c1")
	public void calculator2(int a, int b, int sum) {
		
//int a, int b == {a == 1, b == 2}
		
//int a, int b == {a == 3, b == 4}
		int result = a+b;
		
		System.out.println(result);
		
		//assert result vs sum
		
		Assert.assertEquals(sum, result);

	}

}
		
		
	


