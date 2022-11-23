package October27;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitTesting {

	WebDriver driver;
	 
	
	
	
	@Before
	public void beforeTest() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.realmadrid.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test1() {
		System.out.println("HELLO WORLD");
		
		
		
		
		
	}
	
	@After
	public void afterTest() {
		System.out.println("afterTest");
		
		
		
		
		
		
	}
	
	
}
