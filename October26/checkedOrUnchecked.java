package October26;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkedOrUnchecked {
	 
	
	WebDriver driver;
	
	@Before
	public void opeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/checkboxes");
		
	}
	@Test 
	public void checkboxTest() {
		
		//checkbox1
		Boolean checkboxSelected1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
		
		
		if(checkboxSelected1) {
			System.out.println("it is selected");
		}else {
			driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		}
		 
		
		//checkbox2
		
		Boolean checkboxSelected2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();

		
		if(checkboxSelected2) {
			System.out.println("it is selected");
		
		
		}
		
	}
}
