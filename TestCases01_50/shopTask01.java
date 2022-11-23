package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shopTask01 {

	WebDriver driver;
	
	@Before
	public void opneBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	/*
		1) Open the browser
		2) Enter the URL “http://practice.automationtesting.in/”
		3) Click on Shop Menu
		
		4) Adjust the filter by price between 150 to 450 rps
		5) Now click on Filter button
		6) User can view books only between 150 to 450 rps price
	 */
	public void filterByPriceFunctionality() {
		//Shop
		driver.findElement(By.id("menu-item-40")).click();
		
		//Right slider
		WebElement element = driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]"));
		
		WebElement rText = driver.findElement(By.xpath("//*[@class='price_label']/span[2]"));
		
		int rightNum = Integer.parseInt(rText.getText().substring(1));
		System.out.println(rightNum);
		//Actions action = new Actions(driver);
		for(int i = 1; i <= 50; i++) {
			element.sendKeys(Keys.ARROW_LEFT);
		}
//		while(rightNum >= 450) {
//			element.sendKeys(Keys.ARROW_LEFT);
//			
//		}
		
		
		
		
	}
}
