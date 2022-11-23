package November1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moreAssertionTesting {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void testAssertTrue() {
		
		String xpath = "//*[@id='search_query_top']";
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search_query_top']")).isDisplayed());
//		Assert.assertFalse(driver.findElement(By.xpath("//*@id='search_query_top']")))
	}

}
