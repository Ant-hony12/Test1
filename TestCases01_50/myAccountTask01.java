package TestCases01_50;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountTask01 {
	
	WebDriver driver;
	
	@Before
	public void opneBrowser() {
		
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
			
			4) Enter registered username in username textbox
			5) Enter password in password textbox
			6) Click on login button
			
			7) User must successfully login to the web page
			8) Click on Myaccount link which leads to Dashboard
			9) User must view Dashboard of the site
	 */
	
	public void longIntoAccount() {
	
	//My Account
	driver.findElement(By.id("menu-item-50")).click();
	//Username
	driver.findElement(By.id("username")).sendKeys("agj.15191@gmail.com");
	//Password
	driver.findElement(By.id("password")).sendKeys("Lincoln15191..!");
	//Login
	driver.findElement(By.name("login")).click();
	//Dashboard
	driver.findElement(By.id("m//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a")).click();
	//Logo
	driver.findElement(By.id("site-logo")).click();
	//
	
	Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		

		
//	}
//	@After
//	public void closePage() {
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
	}

}
