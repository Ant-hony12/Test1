package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountRegistrationTask01 {
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
	
	4) Enter registered Email Address in Email-Address textbox
	5) Enter your own password in password textbox
	6) Click on Register button
	7) User will be registered successfully and will be navigated to the Home page
	 */
	public void register() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Register - email
		driver.findElement(By.id("reg_email")).sendKeys("marcanthorman@gmail.com");
		//Register - password
		driver.findElement(By.id("reg_password")).sendKeys("Lincoln15191..!");
		//Register 
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
		

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
