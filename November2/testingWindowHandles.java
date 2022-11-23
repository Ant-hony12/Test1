package November2;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingWindowHandles {

	
	
	
	
	WebDriver driver;
	Actions act;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
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
	public void switchToNewTab() {
		
		WebElement tabButton = driver.findElement(By.id("tabButton"));
		
		tabButton.click();
		Assert.assertEquals("ToolsQA", driver.getTitle());
		
		//setting up iterator to store browser IDs
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switching to child window
		driver.switchTo().window(childId);
		

		Assert.assertTrue(driver.findElement(By.id("sampleHeading")).isDisplayed());
		
		Assert.assertEquals("https://demoqa.com/sample", driver.getCurrentUrl());
		
		//
		driver.switchTo().window(parentId);
		
		Assert.assertEquals("https://demoqa.com/browser-windows", driver.getCurrentUrl());
	}
	
}
