package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLoginTask02 {

	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@After
	public void closeBrowser() {
		if(driver != null){
			driver.quit();
			driver = null;
		}		
	}
	@Test
	/*
	 	1) Open the browser
		2) Enter the URL “http://practice.automationtesting.in/”
		3) Click on My Account Menu
		
		4) Enter incorrect username in username textbox
		5) Enter incorrect password in password textbox.
		6) Click on login button
		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	 */
	public void incorrectUsernameAndPassword() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Username
		driver.findElement(By.id("username")).sendKeys("hot_pocket_12@yahoo.com");
		//Password
		driver.findElement(By.id("password")).sendKeys("FlankSteak12345");
		//login
		driver.findElement(By.name("login")).click();
		// Error: " A user could not be found with this email address"
		
		

		
	}
}
