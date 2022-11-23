package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountRegistrationTask02 {
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
	
	4) Enter invalid Email Address in Email-Address textbox
	5) Enter your own password in password textbox
	6) Click on Register button
	7) Registration must fail with a warning message(ie You must enter a valid email address)
	 */
	public void invalidEmail() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Register - email
		driver.findElement(By.id("reg_email")).sendKeys("planet@glove");
		//Register - password
		driver.findElement(By.id("reg_password")).sendKeys("Lincoln15191..!");
		//Register 
		driver.findElement(By.name("register")).click();
		

//	}
//	@After
//	public void closePage() {
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
//		
	}
}
