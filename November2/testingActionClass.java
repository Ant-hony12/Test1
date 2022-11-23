package November2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingActionClass {
	
	WebDriver driver;
	
	@Before 
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ref=nav_logo");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void hoverOverTest() {
		
	Actions act = new Actions(driver);
		
	act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
	
	}

}
