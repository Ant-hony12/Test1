package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {
	
	 

	WebDriver driver;
 
	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
//		 WebDriverManager.iedriver().setup();
//		 WebDriverManager.edgedriver().setup();
//		 WebDriverManager.firefoxdriver().setup();
//		 WebDriverManager.safaridriver().setup();
//		 WebDriverManager.operadriver().setup();

		// WebDriver driver;

		 driver = new ChromeDriver();
		driver.get("https://www.techcircleschool.com");
		driver.manage().window().maximize();
		
	}
 
	@Ignore
	@Test
	public void test1() {

		// TITLE
		String actualPageTitle = driver.getTitle();

		System.out.println("Title of the page is : > " + actualPageTitle);

		String expectedPageTitle = "LIFETIME Access to Learning | Information Technology | Virginia | TechCircle";

		if (actualPageTitle.equals(expectedPageTitle)) {
			System.out.println("They are equal");
		} else {
			System.out.println("Not Equal");
		}

		//

	}

	@Ignore
	@Test
	public void test2() {
		// current URL -- is the URL/address

		// System.out.println("Current URL of the page is : ---> " +
		// driver.getCurrentUrl());

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.techcircleschool.com/";

		if (actualURL.equals(expectedURL)) {
			System.out.println("URL is correct");
		} else {
			System.out.println("NOOOOOOOOOOOOOOO!");
		}

	}
	
	
	@Test
	public void test3() {
		
//		String pageSource =	driver.getPageSource();
//		
//		System.out.println(pageSource);
		
		driver.navigate().to("https://www.google.com/");
		
		System.out.println("Title of the page is --- > " + driver.getTitle()); //print google title
		
		
		driver.navigate().back();
		
		System.out.println("Title of the page is --- > " + driver.getTitle()); // print techcircle school title
		
	}
	
	
	
	
	@After
	public void afterMethod() {
		
		driver.quit();
	}
	 
	
	
	
}
