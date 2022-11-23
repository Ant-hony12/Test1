package October26;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomate {
	
	WebDriver driver; 
	
	@Before
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		
		
		 
		
		
		
	}
	@Test
	public void userLogsIn() {
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("agj.15191@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lincoln15191..!");
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a")).click();
		
		
		
		
		 
		  
		 
		
	}
	
	
	
	

}
