package november10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class mulitiBrowser {
	
	public WebDriver driver;
	
	
	@Parameter
	@BeforeClass
	public void beforeTest(String browser) {
		
		if(browser.equalsIgnoreCase(("chrome"))){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase(("firefox"))){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
			}
		
			driver.get("https://www.google.com");		
	}
	public void search () {
		System.out.println("Searching");
	}
	@AfterClass
	public void afterTest() {
		driver.quit();
		
	}

}
