package november10;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	public WebDriver driver;


	@Test
	public void FireFoxTest() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Firefox driver title ==>"+ driver.getTitle());
		driver.quit();
	}
	@Test
	public void ChromeTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Chrome driver title ==>"+ driver.getTitle());
		driver.quit();
	}
	@Test
	public void safariTest() {
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("https://www.google.com");
		System.out.println("Safari driver title ==>"+ driver.getTitle());
		driver.quit();
	
	}
}
	