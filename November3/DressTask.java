package November3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;
import Utilities.PropertiesFiles;

public class DressTask {



	@Before
	public void openBrowser() {
		
		BaseClass.getDriver();
		
	}
	@Test
	public void test() {
		
		BaseClass.getDriver().findElement(By.xpath(PropertiesFiles.getProperty("dressesButton")));
		
		System.out.println(PropertiesFiles.getProperty("url"));
		
	}
	
	
	
}
