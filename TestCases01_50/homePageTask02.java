package TestCases01_50;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePageTask02 {
	
	WebDriver driver;
	
	@Before
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	}
//	@After
//	public void tearDown() {
//		if(driver != null) {
//			driver.quit();
//			driver = null;
//		}
	}	
		
	@Test
	/*
		1) Open the browser
		2) Enter the URL “http://practice.automationtesting.in/”
		3) Click on Shop Menu
		4) Now click on Home menu button
		5) Test whether the Home page has Three Arrivals only
		6) The Home page must contains only three Arrivals
	*/
	public void threeArrivalsOnly (){
		
		//Shop
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		//homepage
		driver.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		//Arrivals = 3
		driver.findElement(By.xpath("//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div/div/div/ul/li/a/img"));
		
		
		
		
		
		
		
	}
		
	}


