package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shopTask02 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser () {
		
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
		
		4) Click any of the product links available in the product category
		5) Now user can view only that particular product
	 */
	public void productCatagoriesFunctionality() {
		
		//Shop
		driver.findElement(By.id("menu-item-40")).click();
		//Product link - Selenium
		driver.findElement(By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[4]/a")).click();
		
		
	}
}
