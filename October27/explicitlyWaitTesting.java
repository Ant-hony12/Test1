package October27;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlyWaitTesting {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void beforeTest() {
		 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.petco.com/shop/en/petcostore");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void ClickOnAccountLogin() {
		
		   String popUpXpath= "(//button[contains(text(), 'Continue to Site')])[1]";
	        wait = new WebDriverWait(driver, 30);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(popUpXpath)));
	        
	        driver.findElement(By.xpath(popUpXpath)).click();
	        
	        
	        String accountButton = "//*[@id='petco-header-render-node']/header/div[3]/div/nav[2]/ul/li[1]/button";
 
	        driver.findElement(By.xpath(accountButton)).click();   
	        
	        // use explicit wait one more time like on line 37
	        
	        driver.findElement(By.xpath("//*[@id=\"petco-header-render-node\"]/header/div[3]/div/nav[2]/ul/li[1]/div/div/button[1]")).click();
		
	}	

}
