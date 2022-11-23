package October27;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myDestination {
	
	WebDriver driver;
	
	@Before
	public void beforeTest() {
		
		String URL = "https://www.makemytrip.com";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void fromToDestinationFlight() throws InterruptedException {
		
		
		
		
	driver.findElement(By.id("fromCity")).sendKeys("IAD");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
	
	
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("BKK");
	Thread.sleep(5000);
	driver.findElement(By.xpath("react-autowhatever-1-section-0-item-0")).click();
		
	
		
		 
		
	}

}
