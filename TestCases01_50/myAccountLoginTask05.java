package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLoginTask05 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
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
	3) Click on My Account Menu
	
	4) Enter empty username in username textbox 
	5) Now enter valid password in the password textbox <----- Does not match title bar* <-----
	6) Click on login button.
	7) Proper error must be displayed(ie required username) and prompt to enter login again
	*/
	public void emptyUsername() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Username
		driver.findElement(By.id("username")).sendKeys("          ");
		//PasswordEmpty
		driver.findElement(By.id("password")).sendKeys("           ");
		//login
		driver.findElement(By.name("login")).click();
		//Error: "Username is required"
		//NOT
		//(ie required username)
		
		
	}

}
