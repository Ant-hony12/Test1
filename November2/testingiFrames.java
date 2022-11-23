package November2;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingiFrames {

	WebDriver driver;
	Actions act;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
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
	public void switchFrames() {
		
		List<WebElement> sideBarInteractions = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]/ui/li"));
				
		for (WebElement eachOption : sideBarInteractions) {
			if(eachOption.getText().equals("Droppable")) {
				break;
				
			}
			
		}
		
		
		act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement firstBlock = driver.findElement(By.id("draggable"));
		WebElement secondBlcok = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(firstBlock, secondBlcok).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*@id=\"sidebar\"]/aside[2]/ui/li[3]")).click();
		
		
		
		
		
		
		
	}
}
