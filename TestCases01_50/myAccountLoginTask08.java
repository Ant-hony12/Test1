package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLoginTask08 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	
	4) Enter the case changed username in username textbox
	5) Enter the case chenged password in the password tetxbox
	6) Now click on login button
	
	7) Once your are logged in, sign out of the site
	8) Now press back button
	9) User shouldn’t be signed in to his account rather a general webpage must be visible
	*/
	public void task08() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Username
		driver.findElement(By.id("username")).sendKeys("agj.15191@gmail.com");
		//Password
		driver.findElement(By.id("password")).sendKeys("Lincoln15191..!");
		//Login
		driver.findElement(By.name("login")).click();
		//Sign out
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
		
		
		
	}
//	@After
//	public void closeBrowser() {
//		if(driver != null){
//			driver.quit();
//			driver=null;
//		}		
//	}

}
