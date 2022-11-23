package TestCases01_50;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountRegistrationTask03 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	
	4) Enter empty Email Address in Email-Address textbox
	5) Enter your own password in password textbox
	6) Click on Register button
	7) Registration must fail with a warning message(ie please provide valid email address)
	*/
	public void emptyEmail() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Register - email
		driver.findElement(By.id("reg_email")).sendKeys("          ");
		//Register - password
		driver.findElement(By.id("reg_password")).sendKeys("Lincoln15191..!");
		//Register 
		driver.findElement(By.name("register")).click();
		
	}

}
