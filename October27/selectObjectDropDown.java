package October27;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectObjectDropDown {
	
	
	WebDriver driver;
	
	
	@Before
	public void beforeTest() {
		String URL = "http://automationpractice.com/index.php?id_category=3&controller=category";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test  
	public void Test() throws InterruptedException {
		
		Select select = new Select(driver.findElement(By.id("selectProductSort")));
		
		select.selectByIndex(5);
		Thread.sleep(3000);
		
		select.selectByValue("reference:asc");
		Thread.sleep(3000);
		select.selectByVisibleText("Product Name: A to Z");
		
		 
		 					
		
		
		
	}

}
