package November2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingActionClass2 {
	
	
	WebDriver driver;
	Actions act;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() {
		if(driver != null) {
			driver.quit();
			driver = null; 
			}
		
		
		
	}
	@Test
	public void dragAndDrop() {
		
		act = new Actions(driver);
//	
		String columnA = "column-a";
		String columnB = "column-b";
//		
		WebElement firstBlock = driver.findElement(By.id(columnA));
		WebElement secondBlock = driver.findElement(By.id(columnB));
		
		Action dragDrop = act.dragAndDrop(firstBlock, secondBlock).build();
		dragDrop.perform();
		
		
		

		
		
		
		
		
	}

}
