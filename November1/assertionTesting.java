package November1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionTesting {
	
	WebDriver driver;
	
	@Before 
	public void openBrowser () {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.techcircleschool.com");
	driver.manage().window().maximize();
	
	}
	

	@Test
	public void test1() {

	// TITLE
	String actualPageTitle = driver.getTitle();

	System.out.println("Title of the page is : > " + actualPageTitle);

	String expectedPageTitle = "LIFETIME Access to Learning | Information Technology | Virginia | TechCircle";

		
	Assert.assertEquals(expectedPageTitle, actualPageTitle);
		
	

	}

}